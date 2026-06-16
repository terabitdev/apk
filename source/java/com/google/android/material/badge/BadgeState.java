package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    int badgeFixedEdge;
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final State overridingState;

    public BadgeState(Context context, @XmlRes int i, @AttrRes int i3, @StyleRes int i8, @Nullable State state) {
        CharSequence charSequence;
        int i10;
        int i11;
        int i12;
        int i13;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        boolean booleanValue;
        Locale locale;
        State state2 = new State();
        this.currentState = state2;
        state = state == null ? new State() : state;
        if (i != 0) {
            state.badgeResId = i;
        }
        TypedArray generateTypedArray = generateTypedArray(context, state.badgeResId, i3, i8);
        Resources resources = context.getResources();
        this.badgeRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.horizontalInset = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.horizontalInsetWithText = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.badgeWithTextRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        this.badgeWidth = generateTypedArray.getDimension(R.styleable.Badge_badgeWidth, resources.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextWidth = generateTypedArray.getDimension(R.styleable.Badge_badgeWithTextWidth, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.badgeHeight = generateTypedArray.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextHeight = generateTypedArray.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(R.dimen.m3_badge_with_text_size));
        boolean z10 = true;
        this.offsetAlignmentMode = generateTypedArray.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        this.badgeFixedEdge = generateTypedArray.getInt(R.styleable.Badge_badgeFixedEdge, 0);
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        if (state.number != -2) {
            state2.number = state.number;
        } else if (generateTypedArray.hasValue(R.styleable.Badge_number)) {
            state2.number = generateTypedArray.getInt(R.styleable.Badge_number, 0);
        } else {
            state2.number = -1;
        }
        if (state.text != null) {
            state2.text = state.text;
        } else if (generateTypedArray.hasValue(R.styleable.Badge_badgeText)) {
            state2.text = generateTypedArray.getString(R.styleable.Badge_badgeText);
        }
        state2.contentDescriptionForText = state.contentDescriptionForText;
        if (state.contentDescriptionNumberless != null) {
            charSequence = state.contentDescriptionNumberless;
        } else {
            charSequence = context.getString(R.string.mtrl_badge_numberless_content_description);
        }
        state2.contentDescriptionNumberless = charSequence;
        if (state.contentDescriptionQuantityStrings != 0) {
            i10 = state.contentDescriptionQuantityStrings;
        } else {
            i10 = R.plurals.mtrl_badge_content_description;
        }
        state2.contentDescriptionQuantityStrings = i10;
        if (state.contentDescriptionExceedsMaxBadgeNumberRes != 0) {
            i11 = state.contentDescriptionExceedsMaxBadgeNumberRes;
        } else {
            i11 = R.string.mtrl_exceed_max_badge_number_content_description;
        }
        state2.contentDescriptionExceedsMaxBadgeNumberRes = i11;
        if (state.isVisible != null && !state.isVisible.booleanValue()) {
            z10 = false;
        }
        state2.isVisible = Boolean.valueOf(z10);
        if (state.maxCharacterCount != -2) {
            i12 = state.maxCharacterCount;
        } else {
            i12 = generateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, -2);
        }
        state2.maxCharacterCount = i12;
        if (state.maxNumber != -2) {
            i13 = state.maxNumber;
        } else {
            i13 = generateTypedArray.getInt(R.styleable.Badge_maxNumber, -2);
        }
        state2.maxNumber = i13;
        if (state.badgeShapeAppearanceResId != null) {
            intValue = state.badgeShapeAppearanceResId.intValue();
        } else {
            intValue = generateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        }
        state2.badgeShapeAppearanceResId = Integer.valueOf(intValue);
        if (state.badgeShapeAppearanceOverlayResId != null) {
            intValue2 = state.badgeShapeAppearanceOverlayResId.intValue();
        } else {
            intValue2 = generateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0);
        }
        state2.badgeShapeAppearanceOverlayResId = Integer.valueOf(intValue2);
        if (state.badgeWithTextShapeAppearanceResId != null) {
            intValue3 = state.badgeWithTextShapeAppearanceResId.intValue();
        } else {
            intValue3 = generateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        }
        state2.badgeWithTextShapeAppearanceResId = Integer.valueOf(intValue3);
        if (state.badgeWithTextShapeAppearanceOverlayResId != null) {
            intValue4 = state.badgeWithTextShapeAppearanceOverlayResId.intValue();
        } else {
            intValue4 = generateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        }
        state2.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(intValue4);
        if (state.backgroundColor != null) {
            intValue5 = state.backgroundColor.intValue();
        } else {
            intValue5 = readColorFromAttributes(context, generateTypedArray, R.styleable.Badge_backgroundColor);
        }
        state2.backgroundColor = Integer.valueOf(intValue5);
        if (state.badgeTextAppearanceResId != null) {
            intValue6 = state.badgeTextAppearanceResId.intValue();
        } else {
            intValue6 = generateTypedArray.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge);
        }
        state2.badgeTextAppearanceResId = Integer.valueOf(intValue6);
        if (state.badgeTextColor != null) {
            state2.badgeTextColor = state.badgeTextColor;
        } else if (generateTypedArray.hasValue(R.styleable.Badge_badgeTextColor)) {
            state2.badgeTextColor = Integer.valueOf(readColorFromAttributes(context, generateTypedArray, R.styleable.Badge_badgeTextColor));
        } else {
            state2.badgeTextColor = Integer.valueOf(new TextAppearance(context, state2.badgeTextAppearanceResId.intValue()).getTextColor().getDefaultColor());
        }
        if (state.badgeGravity != null) {
            intValue7 = state.badgeGravity.intValue();
        } else {
            intValue7 = generateTypedArray.getInt(R.styleable.Badge_badgeGravity, 8388661);
        }
        state2.badgeGravity = Integer.valueOf(intValue7);
        if (state.badgeHorizontalPadding != null) {
            intValue8 = state.badgeHorizontalPadding.intValue();
        } else {
            intValue8 = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        }
        state2.badgeHorizontalPadding = Integer.valueOf(intValue8);
        if (state.badgeVerticalPadding != null) {
            intValue9 = state.badgeVerticalPadding.intValue();
        } else {
            intValue9 = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        }
        state2.badgeVerticalPadding = Integer.valueOf(intValue9);
        if (state.horizontalOffsetWithoutText != null) {
            intValue10 = state.horizontalOffsetWithoutText.intValue();
        } else {
            intValue10 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0);
        }
        state2.horizontalOffsetWithoutText = Integer.valueOf(intValue10);
        if (state.verticalOffsetWithoutText != null) {
            intValue11 = state.verticalOffsetWithoutText.intValue();
        } else {
            intValue11 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0);
        }
        state2.verticalOffsetWithoutText = Integer.valueOf(intValue11);
        if (state.horizontalOffsetWithText != null) {
            intValue12 = state.horizontalOffsetWithText.intValue();
        } else {
            intValue12 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue());
        }
        state2.horizontalOffsetWithText = Integer.valueOf(intValue12);
        if (state.verticalOffsetWithText != null) {
            intValue13 = state.verticalOffsetWithText.intValue();
        } else {
            intValue13 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue());
        }
        state2.verticalOffsetWithText = Integer.valueOf(intValue13);
        if (state.largeFontVerticalOffsetAdjustment != null) {
            intValue14 = state.largeFontVerticalOffsetAdjustment.intValue();
        } else {
            intValue14 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0);
        }
        state2.largeFontVerticalOffsetAdjustment = Integer.valueOf(intValue14);
        state2.additionalHorizontalOffset = Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = Integer.valueOf(state.additionalVerticalOffset == null ? 0 : state.additionalVerticalOffset.intValue());
        if (state.autoAdjustToWithinGrandparentBounds != null) {
            booleanValue = state.autoAdjustToWithinGrandparentBounds.booleanValue();
        } else {
            booleanValue = generateTypedArray.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false);
        }
        state2.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(booleanValue);
        generateTypedArray.recycle();
        if (state.numberLocale != null) {
            state2.numberLocale = state.numberLocale;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            state2.numberLocale = locale;
        }
        this.overridingState = state;
    }

    private TypedArray generateTypedArray(Context context, @XmlRes int i, @AttrRes int i3, @StyleRes int i8) {
        AttributeSet attributeSet;
        int i10;
        int i11;
        if (i != 0) {
            attributeSet = DrawableUtils.parseDrawableXml(context, i, BADGE_RESOURCE_TAG);
            i10 = attributeSet.getStyleAttribute();
        } else {
            attributeSet = null;
            i10 = 0;
        }
        AttributeSet attributeSet2 = attributeSet;
        if (i10 == 0) {
            i11 = i8;
        } else {
            i11 = i10;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet2, R.styleable.Badge, i3, i11, new int[0]);
    }

    private static int readColorFromAttributes(Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        return MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
    }

    public void clearNumber() {
        setNumber(-1);
    }

    public void clearText() {
        setText(null);
    }

    @Dimension(unit = 1)
    public int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    @Dimension(unit = 1)
    public int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    public int getAlpha() {
        return this.currentState.alpha;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    public int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    @Px
    public int getBadgeHorizontalPadding() {
        return this.currentState.badgeHorizontalPadding.intValue();
    }

    public int getBadgeShapeAppearanceOverlayResId() {
        return this.currentState.badgeShapeAppearanceOverlayResId.intValue();
    }

    public int getBadgeShapeAppearanceResId() {
        return this.currentState.badgeShapeAppearanceResId.intValue();
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    @Px
    public int getBadgeVerticalPadding() {
        return this.currentState.badgeVerticalPadding.intValue();
    }

    public int getBadgeWithTextShapeAppearanceOverlayResId() {
        return this.currentState.badgeWithTextShapeAppearanceOverlayResId.intValue();
    }

    public int getBadgeWithTextShapeAppearanceResId() {
        return this.currentState.badgeWithTextShapeAppearanceResId.intValue();
    }

    @StringRes
    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    public CharSequence getContentDescriptionForText() {
        return this.currentState.contentDescriptionForText;
    }

    public CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    @PluralsRes
    public int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    @Dimension(unit = 1)
    public int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    @Dimension(unit = 1)
    public int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    @Dimension(unit = 1)
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.currentState.largeFontVerticalOffsetAdjustment.intValue();
    }

    public int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    public int getMaxNumber() {
        return this.currentState.maxNumber;
    }

    public int getNumber() {
        return this.currentState.number;
    }

    public Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    public State getOverridingState() {
        return this.overridingState;
    }

    public String getText() {
        return this.currentState.text;
    }

    @StyleRes
    public int getTextAppearanceResId() {
        return this.currentState.badgeTextAppearanceResId.intValue();
    }

    @Dimension(unit = 1)
    public int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    @Dimension(unit = 1)
    public int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    public boolean hasNumber() {
        if (this.currentState.number != -1) {
            return true;
        }
        return false;
    }

    public boolean hasText() {
        if (this.currentState.text != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isAutoAdjustedToGrandparentBounds() {
        return this.currentState.autoAdjustToWithinGrandparentBounds.booleanValue();
    }

    public boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    public void setAdditionalHorizontalOffset(@Dimension(unit = 1) int i) {
        this.overridingState.additionalHorizontalOffset = Integer.valueOf(i);
        this.currentState.additionalHorizontalOffset = Integer.valueOf(i);
    }

    public void setAdditionalVerticalOffset(@Dimension(unit = 1) int i) {
        this.overridingState.additionalVerticalOffset = Integer.valueOf(i);
        this.currentState.additionalVerticalOffset = Integer.valueOf(i);
    }

    public void setAlpha(int i) {
        this.overridingState.alpha = i;
        this.currentState.alpha = i;
    }

    @Deprecated
    public void setAutoAdjustToGrandparentBounds(boolean z10) {
        this.overridingState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z10);
        this.currentState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z10);
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.overridingState.backgroundColor = Integer.valueOf(i);
        this.currentState.backgroundColor = Integer.valueOf(i);
    }

    public void setBadgeGravity(int i) {
        this.overridingState.badgeGravity = Integer.valueOf(i);
        this.currentState.badgeGravity = Integer.valueOf(i);
    }

    public void setBadgeHorizontalPadding(@Px int i) {
        this.overridingState.badgeHorizontalPadding = Integer.valueOf(i);
        this.currentState.badgeHorizontalPadding = Integer.valueOf(i);
    }

    public void setBadgeShapeAppearanceOverlayResId(int i) {
        this.overridingState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i);
        this.currentState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i);
    }

    public void setBadgeShapeAppearanceResId(int i) {
        this.overridingState.badgeShapeAppearanceResId = Integer.valueOf(i);
        this.currentState.badgeShapeAppearanceResId = Integer.valueOf(i);
    }

    public void setBadgeTextColor(@ColorInt int i) {
        this.overridingState.badgeTextColor = Integer.valueOf(i);
        this.currentState.badgeTextColor = Integer.valueOf(i);
    }

    public void setBadgeVerticalPadding(@Px int i) {
        this.overridingState.badgeVerticalPadding = Integer.valueOf(i);
        this.currentState.badgeVerticalPadding = Integer.valueOf(i);
    }

    public void setBadgeWithTextShapeAppearanceOverlayResId(int i) {
        this.overridingState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i);
        this.currentState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i);
    }

    public void setBadgeWithTextShapeAppearanceResId(int i) {
        this.overridingState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i);
        this.currentState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i);
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i;
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        this.overridingState.contentDescriptionForText = charSequence;
        this.currentState.contentDescriptionForText = charSequence;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i) {
        this.overridingState.contentDescriptionQuantityStrings = i;
        this.currentState.contentDescriptionQuantityStrings = i;
    }

    public void setHorizontalOffsetWithText(@Dimension(unit = 1) int i) {
        this.overridingState.horizontalOffsetWithText = Integer.valueOf(i);
        this.currentState.horizontalOffsetWithText = Integer.valueOf(i);
    }

    public void setHorizontalOffsetWithoutText(@Dimension(unit = 1) int i) {
        this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(i);
        this.currentState.horizontalOffsetWithoutText = Integer.valueOf(i);
    }

    public void setLargeFontVerticalOffsetAdjustment(@Dimension(unit = 1) int i) {
        this.overridingState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i);
        this.currentState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i);
    }

    public void setMaxCharacterCount(int i) {
        this.overridingState.maxCharacterCount = i;
        this.currentState.maxCharacterCount = i;
    }

    public void setMaxNumber(int i) {
        this.overridingState.maxNumber = i;
        this.currentState.maxNumber = i;
    }

    public void setNumber(int i) {
        this.overridingState.number = i;
        this.currentState.number = i;
    }

    public void setNumberLocale(Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    public void setText(String str) {
        this.overridingState.text = str;
        this.currentState.text = str;
    }

    public void setTextAppearanceResId(@StyleRes int i) {
        this.overridingState.badgeTextAppearanceResId = Integer.valueOf(i);
        this.currentState.badgeTextAppearanceResId = Integer.valueOf(i);
    }

    public void setVerticalOffsetWithText(@Dimension(unit = 1) int i) {
        this.overridingState.verticalOffsetWithText = Integer.valueOf(i);
        this.currentState.verticalOffsetWithText = Integer.valueOf(i);
    }

    public void setVerticalOffsetWithoutText(@Dimension(unit = 1) int i) {
        this.overridingState.verticalOffsetWithoutText = Integer.valueOf(i);
        this.currentState.verticalOffsetWithoutText = Integer.valueOf(i);
    }

    public void setVisible(boolean z10) {
        this.overridingState.isVisible = Boolean.valueOf(z10);
        this.currentState.isVisible = Boolean.valueOf(z10);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State[] newArray(int i) {
                return new State[i];
            }
        };
        private static final int NOT_SET = -2;

        @Dimension(unit = 1)
        private Integer additionalHorizontalOffset;

        @Dimension(unit = 1)
        private Integer additionalVerticalOffset;
        private int alpha;
        private Boolean autoAdjustToWithinGrandparentBounds;

        @ColorInt
        private Integer backgroundColor;
        private Integer badgeFixedEdge;
        private Integer badgeGravity;

        @Px
        private Integer badgeHorizontalPadding;

        @XmlRes
        private int badgeResId;

        @StyleRes
        private Integer badgeShapeAppearanceOverlayResId;

        @StyleRes
        private Integer badgeShapeAppearanceResId;

        @StyleRes
        private Integer badgeTextAppearanceResId;

        @ColorInt
        private Integer badgeTextColor;

        @Px
        private Integer badgeVerticalPadding;

        @StyleRes
        private Integer badgeWithTextShapeAppearanceOverlayResId;

        @StyleRes
        private Integer badgeWithTextShapeAppearanceResId;

        @StringRes
        private int contentDescriptionExceedsMaxBadgeNumberRes;

        @Nullable
        private CharSequence contentDescriptionForText;

        @Nullable
        private CharSequence contentDescriptionNumberless;

        @PluralsRes
        private int contentDescriptionQuantityStrings;

        @Dimension(unit = 1)
        private Integer horizontalOffsetWithText;

        @Dimension(unit = 1)
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;

        @Dimension(unit = 1)
        private Integer largeFontVerticalOffsetAdjustment;
        private int maxCharacterCount;
        private int maxNumber;
        private int number;
        private Locale numberLocale;

        @Nullable
        private String text;

        @Dimension(unit = 1)
        private Integer verticalOffsetWithText;

        @Dimension(unit = 1)
        private Integer verticalOffsetWithoutText;

        public State(@NonNull Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.badgeTextAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.text = parcel.readString();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.maxNumber = parcel.readInt();
            this.contentDescriptionForText = parcel.readString();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.badgeHorizontalPadding = (Integer) parcel.readSerializable();
            this.badgeVerticalPadding = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.largeFontVerticalOffsetAdjustment = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
            this.autoAdjustToWithinGrandparentBounds = (Boolean) parcel.readSerializable();
            this.badgeFixedEdge = (Integer) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            String str;
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeSerializable(this.badgeTextAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            parcel.writeInt(this.alpha);
            parcel.writeString(this.text);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeInt(this.maxNumber);
            CharSequence charSequence = this.contentDescriptionForText;
            String str2 = null;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            CharSequence charSequence2 = this.contentDescriptionNumberless;
            if (charSequence2 != null) {
                str2 = charSequence2.toString();
            }
            parcel.writeString(str2);
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.badgeHorizontalPadding);
            parcel.writeSerializable(this.badgeVerticalPadding);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.largeFontVerticalOffsetAdjustment);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
            parcel.writeSerializable(this.autoAdjustToWithinGrandparentBounds);
            parcel.writeSerializable(this.badgeFixedEdge);
        }

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
        }
    }
}
