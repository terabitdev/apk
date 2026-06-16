package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int ACTIVE_INDICATOR_WIDTH_MATCH_PARENT = -1;
    public static final int ACTIVE_INDICATOR_WIDTH_WRAP_CONTENT = -2;
    public static final int ITEM_GRAVITY_CENTER = 17;
    public static final int ITEM_GRAVITY_START_CENTER = 8388627;
    public static final int ITEM_GRAVITY_TOP_CENTER = 49;
    public static final int ITEM_ICON_GRAVITY_START = 1;
    public static final int ITEM_ICON_GRAVITY_TOP = 0;
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;

    @NonNull
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;

    @NonNull
    private final NavigationBarMenuView menuView;

    @NonNull
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface ItemGravity {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface ItemIconGravity {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface LabelVisibility {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i3), attributeSet, i);
        int i8;
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        TintTypedArray obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationBarView, i, i3, R.styleable.NavigationBarView_itemTextAppearanceInactive, R.styleable.NavigationBarView_itemTextAppearanceActive);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount(), isSubMenuSupported());
        this.menu = navigationBarMenu;
        NavigationBarMenuView createNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = createNavigationBarMenuView;
        createNavigationBarMenuView.setMinimumHeight(getSuggestedMinimumHeight());
        createNavigationBarMenuView.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.setMenuView(createNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        createNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemIconTint)) {
            createNavigationBarMenuView.setIconTintList(obtainTintedStyledAttributes.getColorStateList(R.styleable.NavigationBarView_itemIconTint));
        } else {
            createNavigationBarMenuView.setIconTintList(createNavigationBarMenuView.createDefaultColorStateList(android.R.attr.textColorSecondary));
        }
        setItemIconSize(obtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(obtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(obtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_horizontalItemTextAppearanceInactive)) {
            setHorizontalItemTextAppearanceInactive(obtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_horizontalItemTextAppearanceInactive, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_horizontalItemTextAppearanceActive)) {
            setHorizontalItemTextAppearanceActive(obtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_horizontalItemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(obtainTintedStyledAttributes.getBoolean(R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(obtainTintedStyledAttributes.getColorStateList(R.styleable.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i3).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(obtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(obtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(obtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_iconLabelHorizontalSpacing)) {
            setIconLabelHorizontalSpacing(obtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_iconLabelHorizontalSpacing, 0));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_elevation)) {
            setElevation(obtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarView_elevation, 0));
        }
        getBackground().mutate().setTintList(MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.NavigationBarView_backgroundTint));
        int i10 = -1;
        setLabelVisibilityMode(obtainTintedStyledAttributes.getInteger(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        setItemIconGravity(obtainTintedStyledAttributes.getInteger(R.styleable.NavigationBarView_itemIconGravity, 0));
        setItemGravity(obtainTintedStyledAttributes.getInteger(R.styleable.NavigationBarView_itemGravity, 49));
        int resourceId = obtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            createNavigationBarMenuView.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.NavigationBarView_itemRippleColor));
        }
        setMeasureBottomPaddingFromLabelBaseline(obtainTintedStyledAttributes.getBoolean(R.styleable.NavigationBarView_measureBottomPaddingFromLabelBaseline, true));
        setLabelFontScalingEnabled(obtainTintedStyledAttributes.getBoolean(R.styleable.NavigationBarView_labelFontScalingEnabled, false));
        setLabelMaxLines(obtainTintedStyledAttributes.getInteger(R.styleable.NavigationBarView_labelMaxLines, 1));
        int resourceId2 = obtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R.styleable.NavigationBarActiveIndicator);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = obtainStyledAttributes.getString(R.styleable.NavigationBarActiveIndicator_expandedWidth);
            if (string != null) {
                if (!String.valueOf(-1).equals(string)) {
                    if (!String.valueOf(-2).equals(string)) {
                        i10 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_expandedWidth, -2);
                    }
                }
                setItemActiveIndicatorExpandedWidth(i10);
                setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize));
                setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
                int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize2);
                int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize2);
                if (getLayoutDirection() != 1) {
                    i8 = dimensionPixelOffset3;
                } else {
                    i8 = dimensionPixelOffset2;
                }
                setItemActiveIndicatorExpandedPadding(i8, obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingBottom, 0));
                setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
                setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, obtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
                obtainStyledAttributes.recycle();
            }
            i10 = -2;
            setItemActiveIndicatorExpandedWidth(i10);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
            int dimensionPixelSize22 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset22 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize22);
            int dimensionPixelOffset32 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize22);
            if (getLayoutDirection() != 1) {
            }
            setItemActiveIndicatorExpandedPadding(i8, obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingBottom, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, obtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            obtainStyledAttributes.recycle();
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.NavigationBarView_menu)) {
            inflateMenu(obtainTintedStyledAttributes.getResourceId(R.styleable.NavigationBarView_menu, 0));
        }
        obtainTintedStyledAttributes.recycle();
        if (!shouldAddMenuView()) {
            addView(createNavigationBarMenuView);
        }
        navigationBarMenu.setCallback(new MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
                if (NavigationBarView.this.reselectedListener != null && menuItem.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                    NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
                    return true;
                }
                if (NavigationBarView.this.selectedListener != null && !NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) {
                    return true;
                }
                return false;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.menuView.setMeasurePaddingFromLabelBaseline(z10);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context);

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceActive() {
        return this.menuView.getHorizontalItemTextAppearanceActive();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceInactive() {
        return this.menuView.getHorizontalItemTextAppearanceInactive();
    }

    @Px
    public int getIconLabelHorizontalSpacing() {
        return this.menuView.getIconLabelHorizontalSpacing();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorExpandedHeight() {
        return this.menuView.getItemActiveIndicatorExpandedHeight();
    }

    @Px
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    @Px
    public int getItemActiveIndicatorExpandedWidth() {
        return this.menuView.getItemActiveIndicatorExpandedWidth();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.menuView.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.menuView.getItemIconGravity();
    }

    @Dimension
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelMaxLines(int i) {
        return this.menuView.getLabelMaxLines();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.menuView;
    }

    @NonNull
    public ViewGroup getMenuViewGroup() {
        return this.menuView;
    }

    @NonNull
    public BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.menuView.getScaleLabelTextWithFont();
    }

    @IdRes
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    public boolean isSubMenuSupported() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    public void setActiveIndicatorLabelPadding(@Px int i) {
        this.menuView.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        MaterialShapeUtils.setElevation(this, f7);
    }

    public void setHorizontalItemTextAppearanceActive(@StyleRes int i) {
        this.menuView.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(@StyleRes int i) {
        this.menuView.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(@Px int i) {
        this.menuView.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.menuView.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(@Px int i) {
        this.menuView.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@Px int i) {
        this.menuView.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedPadding(@Px int i, @Px int i3, @Px int i8, @Px int i10) {
        this.menuView.setItemActiveIndicatorExpandedPadding(i, i3, i8, i10);
    }

    public void setItemActiveIndicatorExpandedWidth(@Px int i) {
        this.menuView.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.menuView.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.menuView.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.menuView.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        if (this.menuView.getItemGravity() != i) {
            this.menuView.setItemGravity(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconGravity(int i) {
        if (this.menuView.getItemIconGravity() != i) {
            this.menuView.setItemIconGravity(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@DimenRes int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, @Nullable View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(@Px int i) {
        this.menuView.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@Px int i) {
        this.menuView.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.menuView.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i) {
        this.menuView.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            boolean performItemAction = this.menu.performItemAction(findItem, this.presenter, 0);
            if (findItem.isCheckable()) {
                if (!performItemAction || findItem.isChecked()) {
                    this.menuView.setCheckedItem(findItem);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldAddMenuView() {
        return false;
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        @Nullable
        Bundle menuPresenterState;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        private void readFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
