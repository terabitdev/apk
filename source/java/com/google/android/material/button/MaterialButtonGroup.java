package com.google.android.material.button;

import a5.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class MaterialButtonGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_MaterialButtonGroup;
    private static final String LOG_TAG = "MButtonGroup";

    @Nullable
    private StateListSizeChange buttonSizeChange;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private boolean childShapesDirty;

    @Nullable
    private StateListShapeAppearanceModel groupStateListShapeAppearance;

    @Nullable
    StateListCornerSize innerCornerSize;
    private final List<ShapeAppearanceModel> originalChildShapeAppearanceModels;
    private final List<StateListShapeAppearanceModel> originalChildStateListShapeAppearanceModels;
    private final PressedStateTracker pressedStateTracker;

    @Px
    private int spacing;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        private PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(@NonNull MaterialButton materialButton, boolean z10) {
            MaterialButtonGroup.this.invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, r4), attributeSet, i);
        int i3 = DEF_STYLE_RES;
        this.originalChildShapeAppearanceModels = new ArrayList();
        this.originalChildStateListShapeAppearanceModels = new ArrayList();
        this.pressedStateTracker = new PressedStateTracker();
        this.childOrderComparator = new v(this, 3);
        this.childShapesDirty = true;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialButtonGroup, i, i3, new int[0]);
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialButtonGroup_buttonSizeChange)) {
            this.buttonSizeChange = StateListSizeChange.create(context2, obtainStyledAttributes, R.styleable.MaterialButtonGroup_buttonSizeChange);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialButtonGroup_shapeAppearance)) {
            StateListShapeAppearanceModel create = StateListShapeAppearanceModel.create(context2, obtainStyledAttributes, R.styleable.MaterialButtonGroup_shapeAppearance);
            this.groupStateListShapeAppearance = create;
            if (create == null) {
                this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(ShapeAppearanceModel.builder(context2, obtainStyledAttributes.getResourceId(R.styleable.MaterialButtonGroup_shapeAppearance, 0), obtainStyledAttributes.getResourceId(R.styleable.MaterialButtonGroup_shapeAppearanceOverlay, 0)).build()).build();
            }
        }
        if (obtainStyledAttributes.hasValue(R.styleable.MaterialButtonGroup_innerCornerSize)) {
            this.innerCornerSize = StateListCornerSize.create(context2, obtainStyledAttributes, R.styleable.MaterialButtonGroup_innerCornerSize, new AbsoluteCornerSize(0.0f));
        }
        this.spacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(obtainStyledAttributes.getBoolean(R.styleable.MaterialButtonGroup_android_enabled, true));
        obtainStyledAttributes.recycle();
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i3 = firstVisibleChildIndex + 1; i3 < getChildCount(); i3++) {
            MaterialButton childButton = getChildButton(i3);
            MaterialButton childButton2 = getChildButton(i3 - 1);
            if (this.spacing <= 0) {
                i = Math.min(childButton.getStrokeWidth(), childButton2.getStrokeWidth());
                childButton.setShouldDrawSurfaceColorStroke(true);
                childButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                childButton.setShouldDrawSurfaceColorStroke(false);
                childButton2.setShouldDrawSurfaceColorStroke(false);
                i = 0;
            }
            LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                buildLayoutParams.setMarginEnd(0);
                buildLayoutParams.setMarginStart(this.spacing - i);
                buildLayoutParams.topMargin = 0;
            } else {
                buildLayoutParams.bottomMargin = 0;
                buildLayoutParams.topMargin = this.spacing - i;
                buildLayoutParams.setMarginStart(0);
            }
            childButton.setLayoutParams(buildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private void adjustChildSizeChange() {
        int i;
        if (this.buttonSizeChange != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i3 = Integer.MAX_VALUE;
            for (int i8 = firstVisibleChildIndex; i8 <= lastVisibleChildIndex; i8++) {
                if (isChildVisible(i8)) {
                    int buttonAllowedWidthIncrease = getButtonAllowedWidthIncrease(i8);
                    if (i8 != firstVisibleChildIndex && i8 != lastVisibleChildIndex) {
                        buttonAllowedWidthIncrease /= 2;
                    }
                    i3 = Math.min(i3, buttonAllowedWidthIncrease);
                }
            }
            for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
                if (isChildVisible(i10)) {
                    getChildButton(i10).setSizeChange(this.buttonSizeChange);
                    MaterialButton childButton = getChildButton(i10);
                    if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                        i = i3 * 2;
                    } else {
                        i = i3;
                    }
                    childButton.setWidthChangeMax(i);
                }
            }
        }
    }

    private int getButtonAllowedWidthIncrease(int i) {
        int allowedWidthDecrease;
        int i3 = 0;
        if (!isChildVisible(i) || this.buttonSizeChange == null) {
            return 0;
        }
        int max = Math.max(0, this.buttonSizeChange.getMaxWidthChange(getChildButton(i).getWidth()));
        MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(i);
        if (prevVisibleChildButton == null) {
            allowedWidthDecrease = 0;
        } else {
            allowedWidthDecrease = prevVisibleChildButton.getAllowedWidthDecrease();
        }
        MaterialButton nextVisibleChildButton = getNextVisibleChildButton(i);
        if (nextVisibleChildButton != null) {
            i3 = nextVisibleChildButton.getAllowedWidthDecrease();
        }
        return Math.min(max, allowedWidthDecrease + i3);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    @Nullable
    private MaterialButton getNextVisibleChildButton(int i) {
        int childCount = getChildCount();
        do {
            i++;
            if (i >= childCount) {
                return null;
            }
        } while (!isChildVisible(i));
        return getChildButton(i);
    }

    @NonNull
    private StateListShapeAppearanceModel.Builder getOriginalStateListShapeBuilder(boolean z10, boolean z11, int i) {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.groupStateListShapeAppearance;
        if (stateListShapeAppearanceModel == null || (!z10 && !z11)) {
            stateListShapeAppearanceModel = this.originalChildStateListShapeAppearanceModels.get(i);
        }
        if (stateListShapeAppearanceModel == null) {
            return new StateListShapeAppearanceModel.Builder(this.originalChildShapeAppearanceModels.get(i));
        }
        return stateListShapeAppearanceModel.toBuilder();
    }

    @Nullable
    private MaterialButton getPrevVisibleChildButton(int i) {
        for (int i3 = i - 1; i3 >= 0; i3--) {
            if (isChildVisible(i3)) {
                return getChildButton(i3);
            }
        }
        return null;
    }

    private boolean isChildVisible(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$new$0(MaterialButton materialButton, MaterialButton materialButton2) {
        int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return Integer.compare(indexOfChild(materialButton), indexOfChild(materialButton2));
    }

    private void recoverAllChildrenLayoutParams() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).recoverOriginalLayoutParams();
        }
    }

    private void resetChildMargins(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            } else {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), Integer.valueOf(i));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        recoverAllChildrenLayoutParams();
        this.childShapesDirty = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        this.originalChildShapeAppearanceModels.add(materialButton.getShapeAppearanceModel());
        this.originalChildStateListShapeAppearanceModels.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    @NonNull
    public LinearLayout.LayoutParams buildLayoutParams(@NonNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListSizeChange getButtonSizeChange() {
        return this.buttonSizeChange;
    }

    @NonNull
    public MaterialButton getChildButton(int i) {
        return (MaterialButton) getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i3) {
        Integer[] numArr = this.childOrder;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w(LOG_TAG, "Child order wasn't updated");
        return i3;
    }

    @NonNull
    public CornerSize getInnerCornerSize() {
        return this.innerCornerSize.getDefaultCornerSize();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListCornerSize getInnerCornerSizeStateList() {
        return this.innerCornerSize;
    }

    @Nullable
    public ShapeAppearanceModel getShapeAppearance() {
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.groupStateListShapeAppearance;
        if (stateListShapeAppearanceModel == null) {
            return null;
        }
        return stateListShapeAppearanceModel.getDefaultShape(true);
    }

    @Px
    public int getSpacing() {
        return this.spacing;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearance() {
        return this.groupStateListShapeAppearance;
    }

    public void onButtonWidthChanged(@NonNull MaterialButton materialButton, int i) {
        int indexOfChild = indexOfChild(materialButton);
        if (indexOfChild >= 0) {
            MaterialButton prevVisibleChildButton = getPrevVisibleChildButton(indexOfChild);
            MaterialButton nextVisibleChildButton = getNextVisibleChildButton(indexOfChild);
            if (prevVisibleChildButton != null || nextVisibleChildButton != null) {
                if (prevVisibleChildButton == null) {
                    nextVisibleChildButton.setDisplayedWidthDecrease(i);
                }
                if (nextVisibleChildButton == null) {
                    prevVisibleChildButton.setDisplayedWidthDecrease(i);
                }
                if (prevVisibleChildButton != null && nextVisibleChildButton != null) {
                    prevVisibleChildButton.setDisplayedWidthDecrease(i / 2);
                    nextVisibleChildButton.setDisplayedWidthDecrease((i + 1) / 2);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        super.onLayout(z10, i, i3, i8, i10);
        if (z10) {
            recoverAllChildrenLayoutParams();
            adjustChildSizeChange();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i3) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.originalChildShapeAppearanceModels.remove(indexOfChild);
            this.originalChildStateListShapeAppearanceModels.remove(indexOfChild);
        }
        this.childShapesDirty = true;
        updateChildShapes();
        recoverAllChildrenLayoutParams();
        adjustChildMarginsAndUpdateLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setButtonSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.buttonSizeChange != stateListSizeChange) {
            this.buttonSizeChange = stateListSizeChange;
            adjustChildSizeChange();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(@NonNull CornerSize cornerSize) {
        this.innerCornerSize = StateListCornerSize.create(cornerSize);
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInnerCornerSizeStateList(@NonNull StateListCornerSize stateListCornerSize) {
        this.innerCornerSize = stateListCornerSize;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.childShapesDirty = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.groupStateListShapeAppearance = new StateListShapeAppearanceModel.Builder(shapeAppearanceModel).build();
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    public void setSpacing(@Px int i) {
        this.spacing = i;
        invalidate();
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearance(@Nullable StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.groupStateListShapeAppearance = stateListShapeAppearanceModel;
        this.childShapesDirty = true;
        updateChildShapes();
        invalidate();
    }

    @VisibleForTesting
    public void updateChildShapes() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i;
        if ((this.innerCornerSize != null || this.groupStateListShapeAppearance != null) && this.childShapesDirty) {
            this.childShapesDirty = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i3 = 0; i3 < childCount; i3++) {
                MaterialButton childButton = getChildButton(i3);
                if (childButton.getVisibility() != 8) {
                    if (i3 == firstVisibleChildIndex) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i3 == lastVisibleChildIndex) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    StateListShapeAppearanceModel.Builder originalStateListShapeBuilder = getOriginalStateListShapeBuilder(z10, z11, i3);
                    if (getOrientation() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                    if (z12) {
                        if (z10) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                        if (z11) {
                            i |= 10;
                        }
                        if (isLayoutRtl) {
                            i = StateListShapeAppearanceModel.swapCornerPositionRtl(i);
                        }
                    } else {
                        if (z10) {
                            i = 3;
                        } else {
                            i = 0;
                        }
                        if (z11) {
                            i |= 12;
                        }
                    }
                    StateListShapeAppearanceModel build = originalStateListShapeBuilder.setCornerSizeOverride(this.innerCornerSize, ~i).build();
                    if (build.isStateful()) {
                        childButton.setStateListShapeAppearanceModel(build);
                    } else {
                        childButton.setShapeAppearanceModel(build.getDefaultShape(true));
                    }
                }
            }
        }
    }

    public MaterialButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonGroupStyle);
    }

    public MaterialButtonGroup(@NonNull Context context) {
        this(context, null);
    }
}
