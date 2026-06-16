package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import com.google.android.material.R;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class StateListCornerSize {
    private static final int INITIAL_CAPACITY = 10;

    @NonNull
    private CornerSize defaultCornerSize;
    int stateCount;

    @NonNull
    int[][] stateSpecs = new int[10];

    @NonNull
    CornerSize[] cornerSizes = new CornerSize[10];

    private void addStateCornerSize(@NonNull int[] iArr, @NonNull CornerSize cornerSize) {
        int i = this.stateCount;
        if (i == 0 || iArr.length == 0) {
            this.defaultCornerSize = cornerSize;
        }
        if (i >= this.stateSpecs.length) {
            growArray(i, i + 10);
        }
        int[][] iArr2 = this.stateSpecs;
        int i3 = this.stateCount;
        iArr2[i3] = iArr;
        this.cornerSizes[i3] = cornerSize;
        this.stateCount = i3 + 1;
    }

    @NonNull
    public static StateListCornerSize create(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i, @NonNull CornerSize cornerSize) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return create(ShapeAppearanceModel.getCornerSize(typedArray, i, cornerSize));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return create(ShapeAppearanceModel.getCornerSize(typedArray, i, cornerSize));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListCornerSize stateListCornerSize = new StateListCornerSize();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (xml.getName().equals("selector")) {
                        stateListCornerSize.loadCornerSizesFromItems(context, xml, asAttributeSet, context.getTheme());
                    }
                    xml.close();
                    return stateListCornerSize;
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
            return create(cornerSize);
        }
    }

    private void growArray(int i, int i3) {
        int[][] iArr = new int[i3];
        System.arraycopy(this.stateSpecs, 0, iArr, 0, i);
        this.stateSpecs = iArr;
        CornerSize[] cornerSizeArr = new CornerSize[i3];
        System.arraycopy(this.cornerSizes, 0, cornerSizeArr, 0, i);
        this.cornerSizes = cornerSizeArr;
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

    private void loadCornerSizesFromItems(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
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
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, R.styleable.ShapeAppearance);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.ShapeAppearance, 0, 0);
                        }
                        CornerSize cornerSize = ShapeAppearanceModel.getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, new AbsoluteCornerSize(0.0f));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i = 0;
                        for (int i3 = 0; i3 < attributeCount; i3++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i8 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i] = attributeNameResource;
                                i = i8;
                            }
                        }
                        addStateCornerSize(StateSet.trimStateSet(iArr, i), cornerSize);
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
    public CornerSize getCornerSizeForState(@NonNull int[] iArr) {
        int indexOfStateSet = indexOfStateSet(iArr);
        if (indexOfStateSet < 0) {
            indexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        if (indexOfStateSet < 0) {
            return this.defaultCornerSize;
        }
        return this.cornerSizes[indexOfStateSet];
    }

    @NonNull
    public CornerSize getDefaultCornerSize() {
        return this.defaultCornerSize;
    }

    public boolean isStateful() {
        if (this.stateCount > 1) {
            return true;
        }
        return false;
    }

    @NonNull
    public StateListCornerSize withTransformedCornerSizes(@NonNull ShapeAppearanceModel.CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.stateCount = this.stateCount;
        int[][] iArr = new int[this.stateSpecs.length];
        stateListCornerSize.stateSpecs = iArr;
        int[][] iArr2 = this.stateSpecs;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        stateListCornerSize.cornerSizes = new CornerSize[this.cornerSizes.length];
        for (int i = 0; i < this.stateCount; i++) {
            stateListCornerSize.cornerSizes[i] = cornerSizeUnaryOperator.apply(this.cornerSizes[i]);
        }
        return stateListCornerSize;
    }

    @NonNull
    public static StateListCornerSize create(@NonNull CornerSize cornerSize) {
        StateListCornerSize stateListCornerSize = new StateListCornerSize();
        stateListCornerSize.addStateCornerSize(StateSet.WILD_CARD, cornerSize);
        return stateListCornerSize;
    }
}
