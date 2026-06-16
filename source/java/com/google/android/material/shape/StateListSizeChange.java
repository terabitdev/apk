package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class StateListSizeChange {
    private static final int INITIAL_CAPACITY = 10;

    @NonNull
    private SizeChange defaultSizeChange;
    int stateCount;

    @NonNull
    int[][] stateSpecs = new int[10];

    @NonNull
    SizeChange[] sizeChanges = new SizeChange[10];

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class SizeChangeAmount {
        float amount;
        SizeChangeType type;

        public SizeChangeAmount(SizeChangeType sizeChangeType, float f7) {
            this.type = sizeChangeType;
            this.amount = f7;
        }

        public int getChange(@Px int i) {
            SizeChangeType sizeChangeType = this.type;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                return (int) (this.amount * i);
            }
            if (sizeChangeType == SizeChangeType.PIXELS) {
                return (int) this.amount;
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    private void addStateSizeChange(@NonNull int[] iArr, @NonNull SizeChange sizeChange) {
        int i = this.stateCount;
        if (i == 0 || iArr.length == 0) {
            this.defaultSizeChange = sizeChange;
        }
        if (i >= this.stateSpecs.length) {
            growArray(i, i + 10);
        }
        int[][] iArr2 = this.stateSpecs;
        int i3 = this.stateCount;
        iArr2[i3] = iArr;
        this.sizeChanges[i3] = sizeChange;
        this.stateCount = i3 + 1;
    }

    @Nullable
    public static StateListSizeChange create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (xml.getName().equals("selector")) {
                        stateListSizeChange.loadSizeChangeFromItems(context, xml, asAttributeSet, context.getTheme());
                    }
                    xml.close();
                    return stateListSizeChange;
                }
                throw new XmlPullParserException("No start tag found");
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @Nullable
    private SizeChangeAmount getSizeChangeAmount(@NonNull TypedArray typedArray, int i, @Nullable SizeChangeAmount sizeChangeAmount) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                return new SizeChangeAmount(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new SizeChangeAmount(SizeChangeType.PERCENT, peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return sizeChangeAmount;
    }

    private void growArray(int i, int i3) {
        int[][] iArr = new int[i3];
        System.arraycopy(this.stateSpecs, 0, iArr, 0, i);
        this.stateSpecs = iArr;
        SizeChange[] sizeChangeArr = new SizeChange[i3];
        System.arraycopy(this.sizeChanges, 0, sizeChangeArr, 0, i);
        this.sizeChanges = sizeChangeArr;
    }

    private int indexOfStateSet(int[] iArr) {
        int[][] iArr2 = this.stateSpecs;
        for (int i = 0; i < this.stateCount; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    private void loadSizeChangeFromItems(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainStyledAttributes;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, R.styleable.StateListSizeChange);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.StateListSizeChange, 0, 0);
                        }
                        SizeChangeAmount sizeChangeAmount = getSizeChangeAmount(obtainStyledAttributes, R.styleable.StateListSizeChange_widthChange, null);
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i = 0;
                        for (int i3 = 0; i3 < attributeCount; i3++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                            if (attributeNameResource != R.attr.widthChange) {
                                int i8 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i] = attributeNameResource;
                                i = i8;
                            }
                        }
                        addStateSizeChange(StateSet.trimStateSet(iArr, i), new SizeChange(sizeChangeAmount));
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @NonNull
    public SizeChange getDefaultSizeChange() {
        return this.defaultSizeChange;
    }

    public int getMaxWidthChange(@Px int i) {
        float max;
        int i3 = -i;
        for (int i8 = 0; i8 < this.stateCount; i8++) {
            SizeChangeAmount sizeChangeAmount = this.sizeChanges[i8].widthChange;
            SizeChangeType sizeChangeType = sizeChangeAmount.type;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                max = Math.max(i3, sizeChangeAmount.amount);
            } else if (sizeChangeType == SizeChangeType.PERCENT) {
                max = Math.max(i3, i * sizeChangeAmount.amount);
            }
            i3 = (int) max;
        }
        return i3;
    }

    @NonNull
    public SizeChange getSizeChangeForState(@NonNull int[] iArr) {
        int indexOfStateSet = indexOfStateSet(iArr);
        if (indexOfStateSet < 0) {
            indexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        if (indexOfStateSet < 0) {
            return this.defaultSizeChange;
        }
        return this.sizeChanges[indexOfStateSet];
    }

    public boolean isStateful() {
        if (this.stateCount > 1) {
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class SizeChange {

        @Nullable
        public SizeChangeAmount widthChange;

        public SizeChange(@NonNull SizeChange sizeChange) {
            SizeChangeAmount sizeChangeAmount = sizeChange.widthChange;
            this.widthChange = new SizeChangeAmount(sizeChangeAmount.type, sizeChangeAmount.amount);
        }

        public SizeChange(@Nullable SizeChangeAmount sizeChangeAmount) {
            this.widthChange = sizeChangeAmount;
        }
    }
}
