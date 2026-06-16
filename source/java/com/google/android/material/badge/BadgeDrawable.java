package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import f2.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@OptIn(markerClass = {ExperimentalBadgeUtils.class})
/* loaded from: classes4.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;
    public static final int BADGE_FIXED_EDGE_END = 1;
    public static final int BADGE_FIXED_EDGE_START = 0;
    static final int BADGE_RADIUS_NOT_SPECIFIED = -1;

    @Deprecated
    public static final int BOTTOM_END = 8388693;

    @Deprecated
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    static final String DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX = "…";

    @StyleRes
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Badge;

    @AttrRes
    private static final int DEFAULT_THEME_ATTR = R.attr.badgeStyle;
    private static final float FONT_SCALE_THRESHOLD = 0.3f;
    static final int OFFSET_ALIGNMENT_MODE_EDGE = 0;
    static final int OFFSET_ALIGNMENT_MODE_LEGACY = 1;
    private static final String TAG = "Badge";
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;

    @Nullable
    private WeakReference<View> anchorViewRef;

    @NonNull
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;

    @NonNull
    private final WeakReference<Context> contextRef;
    private float cornerRadius;

    @Nullable
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;

    @NonNull
    private final MaterialShapeDrawable shapeDrawable;

    @NonNull
    private final BadgeState state;

    @NonNull
    private final TextDrawableHelper textDrawableHelper;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface BadgeGravity {
    }

    private BadgeDrawable(@NonNull Context context, @XmlRes int i, @AttrRes int i3, @StyleRes int i8, @Nullable BadgeState.State state) {
        int badgeShapeAppearanceResId;
        int badgeShapeAppearanceOverlayResId;
        this.contextRef = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.badgeBounds = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i, i3, i8, state);
        this.state = badgeState;
        if (hasBadgeContent()) {
            badgeShapeAppearanceResId = badgeState.getBadgeWithTextShapeAppearanceResId();
        } else {
            badgeShapeAppearanceResId = badgeState.getBadgeShapeAppearanceResId();
        }
        if (hasBadgeContent()) {
            badgeShapeAppearanceOverlayResId = badgeState.getBadgeWithTextShapeAppearanceOverlayResId();
        } else {
            badgeShapeAppearanceOverlayResId = badgeState.getBadgeShapeAppearanceOverlayResId();
        }
        this.shapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, badgeShapeAppearanceResId, badgeShapeAppearanceOverlayResId).build());
        restoreState();
    }

    private void autoAdjustWithinGrandparentBounds(@NonNull View view) {
        ViewParent customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            customBadgeParent = view.getParent();
        }
        if ((customBadgeParent instanceof View) && (customBadgeParent.getParent() instanceof View)) {
            autoAdjustWithinViewBounds(view, (View) customBadgeParent.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private void autoAdjustWithinViewBounds(@NonNull View view, @Nullable View view2) {
        float f7;
        float f10;
        View view3;
        boolean z10;
        FrameLayout customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            float y10 = view.getY();
            f10 = view.getX();
            view3 = view.getParent();
            f7 = y10;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
            view3 = customBadgeParent;
        }
        while (true) {
            z10 = view3 instanceof View;
            if (!z10 || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f7 += view4.getY();
            f10 += view4.getX();
            view3 = view3.getParent();
        }
        if (z10) {
            float topCutOff = getTopCutOff(f7);
            float leftCutOff = getLeftCutOff(f10);
            View view5 = view3;
            float bottomCutOff = getBottomCutOff(view5.getHeight(), f7);
            float rightCutoff = getRightCutoff(view5.getWidth(), f10);
            if (topCutOff < 0.0f) {
                this.badgeCenterY = Math.abs(topCutOff) + this.badgeCenterY;
            }
            if (leftCutOff < 0.0f) {
                this.badgeCenterX = Math.abs(leftCutOff) + this.badgeCenterX;
            }
            if (bottomCutOff > 0.0f) {
                this.badgeCenterY -= Math.abs(bottomCutOff);
            }
            if (rightCutoff > 0.0f) {
                this.badgeCenterX -= Math.abs(rightCutoff);
            }
        }
    }

    private void calculateCenterAndBounds(@NonNull Rect rect, @NonNull View view) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean hasBadgeContent = hasBadgeContent();
        BadgeState badgeState = this.state;
        if (hasBadgeContent) {
            f7 = badgeState.badgeWithTextRadius;
        } else {
            f7 = badgeState.badgeRadius;
        }
        this.cornerRadius = f7;
        if (f7 != -1.0f) {
            this.halfBadgeWidth = f7;
            this.halfBadgeHeight = f7;
        } else {
            boolean hasBadgeContent2 = hasBadgeContent();
            BadgeState badgeState2 = this.state;
            if (hasBadgeContent2) {
                f10 = badgeState2.badgeWithTextWidth;
            } else {
                f10 = badgeState2.badgeWidth;
            }
            this.halfBadgeWidth = Math.round(f10 / 2.0f);
            boolean hasBadgeContent3 = hasBadgeContent();
            BadgeState badgeState3 = this.state;
            if (hasBadgeContent3) {
                f11 = badgeState3.badgeWithTextHeight;
            } else {
                f11 = badgeState3.badgeHeight;
            }
            this.halfBadgeHeight = Math.round(f11 / 2.0f);
        }
        if (hasBadgeContent()) {
            String badgeContent = getBadgeContent();
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, (this.textDrawableHelper.getTextWidth(badgeContent) / 2.0f) + this.state.getBadgeHorizontalPadding());
            float max = Math.max(this.halfBadgeHeight, (this.textDrawableHelper.getTextHeight(badgeContent) / 2.0f) + this.state.getBadgeVerticalPadding());
            this.halfBadgeHeight = max;
            this.halfBadgeWidth = Math.max(this.halfBadgeWidth, max);
        }
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int badgeGravity = this.state.getBadgeGravity();
        if (badgeGravity != 8388691 && badgeGravity != 8388693) {
            this.badgeCenterY = rect.top + totalVerticalOffsetForState;
        } else {
            this.badgeCenterY = rect.bottom - totalVerticalOffsetForState;
        }
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int badgeGravity2 = this.state.getBadgeGravity();
        if (badgeGravity2 != 8388659 && badgeGravity2 != 8388691) {
            if (this.state.badgeFixedEdge == 0) {
                if (view.getLayoutDirection() == 0) {
                    f13 = (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
                } else {
                    f13 = (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
                }
            } else if (view.getLayoutDirection() == 0) {
                f13 = (rect.right - this.halfBadgeWidth) + ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState);
            } else {
                f13 = (rect.left + this.halfBadgeWidth) - ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState);
            }
            this.badgeCenterX = f13;
        } else {
            if (this.state.badgeFixedEdge == 0) {
                if (view.getLayoutDirection() == 0) {
                    f12 = (rect.left + this.halfBadgeWidth) - ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState);
                } else {
                    f12 = (rect.right - this.halfBadgeWidth) + ((this.halfBadgeHeight * 2.0f) - totalHorizontalOffsetForState);
                }
            } else if (view.getLayoutDirection() == 0) {
                f12 = (rect.left - this.halfBadgeWidth) + totalHorizontalOffsetForState;
            } else {
                f12 = (rect.right + this.halfBadgeWidth) - totalHorizontalOffsetForState;
            }
            this.badgeCenterX = f12;
        }
        if (this.state.isAutoAdjustedToGrandparentBounds()) {
            autoAdjustWithinGrandparentBounds(view);
        } else {
            autoAdjustWithinViewBounds(view, null);
        }
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i) {
        return new BadgeDrawable(context, i, DEFAULT_THEME_ATTR, DEFAULT_STYLE, null);
    }

    @NonNull
    public static BadgeDrawable createFromSavedState(@NonNull Context context, @NonNull BadgeState.State state) {
        return new BadgeDrawable(context, 0, DEFAULT_THEME_ATTR, DEFAULT_STYLE, state);
    }

    private void drawBadgeContent(Canvas canvas) {
        int round;
        String badgeContent = getBadgeContent();
        if (badgeContent != null) {
            Rect rect = new Rect();
            this.textDrawableHelper.getTextPaint().getTextBounds(badgeContent, 0, badgeContent.length(), rect);
            float exactCenterY = this.badgeCenterY - rect.exactCenterY();
            float f7 = this.badgeCenterX;
            if (rect.bottom <= 0) {
                round = (int) exactCenterY;
            } else {
                round = Math.round(exactCenterY);
            }
            canvas.drawText(badgeContent, f7, round, this.textDrawableHelper.getTextPaint());
        }
    }

    @Nullable
    private String getBadgeContent() {
        if (hasText()) {
            return getTextBadgeText();
        }
        if (hasNumber()) {
            return getNumberBadgeText();
        }
        return null;
    }

    private float getBottomCutOff(float f7, float f10) {
        return ((this.badgeCenterY + this.halfBadgeHeight) - f7) + f10;
    }

    private CharSequence getEmptyContentDescription() {
        return this.state.getContentDescriptionNumberless();
    }

    private float getLeftCutOff(float f7) {
        return (this.badgeCenterX - this.halfBadgeWidth) + f7;
    }

    @NonNull
    private String getNumberBadgeText() {
        if (this.maxBadgeNumber != -2 && getNumber() > this.maxBadgeNumber) {
            Context context = this.contextRef.get();
            if (context == null) {
                return "";
            }
            return String.format(this.state.getNumberLocale(), context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.maxBadgeNumber), DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        }
        return NumberFormat.getInstance(this.state.getNumberLocale()).format(getNumber());
    }

    @Nullable
    private String getNumberContentDescription() {
        Context context;
        if (this.state.getContentDescriptionQuantityStrings() == 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        if (this.maxBadgeNumber != -2 && getNumber() > this.maxBadgeNumber) {
            return context.getString(this.state.getContentDescriptionExceedsMaxBadgeNumberStringResource(), Integer.valueOf(this.maxBadgeNumber));
        }
        return context.getResources().getQuantityString(this.state.getContentDescriptionQuantityStrings(), getNumber(), Integer.valueOf(getNumber()));
    }

    private float getRightCutoff(float f7, float f10) {
        return ((this.badgeCenterX + this.halfBadgeWidth) - f7) + f10;
    }

    @Nullable
    private String getTextBadgeText() {
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount != -2 && text != null && text.length() > maxCharacterCount) {
            Context context = this.contextRef.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX);
        }
        return text;
    }

    @Nullable
    private CharSequence getTextContentDescription() {
        CharSequence contentDescriptionForText = this.state.getContentDescriptionForText();
        if (contentDescriptionForText != null) {
            return contentDescriptionForText;
        }
        return getText();
    }

    private float getTopCutOff(float f7) {
        return (this.badgeCenterY - this.halfBadgeHeight) + f7;
    }

    private int getTotalHorizontalOffsetForState() {
        int horizontalOffsetWithoutText;
        int i;
        boolean hasBadgeContent = hasBadgeContent();
        BadgeState badgeState = this.state;
        if (hasBadgeContent) {
            horizontalOffsetWithoutText = badgeState.getHorizontalOffsetWithText();
        } else {
            horizontalOffsetWithoutText = badgeState.getHorizontalOffsetWithoutText();
        }
        if (this.state.offsetAlignmentMode == 1) {
            boolean hasBadgeContent2 = hasBadgeContent();
            BadgeState badgeState2 = this.state;
            if (hasBadgeContent2) {
                i = badgeState2.horizontalInsetWithText;
            } else {
                i = badgeState2.horizontalInset;
            }
            horizontalOffsetWithoutText += i;
        }
        return this.state.getAdditionalHorizontalOffset() + horizontalOffsetWithoutText;
    }

    private int getTotalVerticalOffsetForState() {
        int verticalOffsetWithoutText = this.state.getVerticalOffsetWithoutText();
        if (hasBadgeContent()) {
            verticalOffsetWithoutText = this.state.getVerticalOffsetWithText();
            Context context = this.contextRef.get();
            if (context != null) {
                verticalOffsetWithoutText = AnimationUtils.lerp(verticalOffsetWithoutText, verticalOffsetWithoutText - this.state.getLargeFontVerticalOffsetAdjustment(), AnimationUtils.lerp(0.0f, 1.0f, FONT_SCALE_THRESHOLD, 1.0f, MaterialResources.getFontScale(context) - 1.0f));
            }
        }
        if (this.state.offsetAlignmentMode == 0) {
            verticalOffsetWithoutText -= Math.round(this.halfBadgeHeight);
        }
        return this.state.getAdditionalVerticalOffset() + verticalOffsetWithoutText;
    }

    private boolean hasBadgeContent() {
        if (!hasText() && !hasNumber()) {
            return false;
        }
        return true;
    }

    private void onAlphaUpdated() {
        this.textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void onBackgroundColorUpdated() {
        ColorStateList valueOf = ColorStateList.valueOf(this.state.getBackgroundColor());
        if (this.shapeDrawable.getFillColor() != valueOf) {
            this.shapeDrawable.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    private void onBadgeContentUpdated() {
        this.textDrawableHelper.setTextSizeDirty(true);
        onBadgeShapeAppearanceUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeGravityUpdated() {
        FrameLayout frameLayout;
        WeakReference<View> weakReference = this.anchorViewRef;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.anchorViewRef.get();
            WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            } else {
                frameLayout = null;
            }
            updateBadgeCoordinates(view, frameLayout);
        }
    }

    private void onBadgeShapeAppearanceUpdated() {
        int badgeShapeAppearanceResId;
        int badgeShapeAppearanceOverlayResId;
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        boolean hasBadgeContent = hasBadgeContent();
        BadgeState badgeState = this.state;
        if (hasBadgeContent) {
            badgeShapeAppearanceResId = badgeState.getBadgeWithTextShapeAppearanceResId();
        } else {
            badgeShapeAppearanceResId = badgeState.getBadgeShapeAppearanceResId();
        }
        boolean hasBadgeContent2 = hasBadgeContent();
        BadgeState badgeState2 = this.state;
        if (hasBadgeContent2) {
            badgeShapeAppearanceOverlayResId = badgeState2.getBadgeWithTextShapeAppearanceOverlayResId();
        } else {
            badgeShapeAppearanceOverlayResId = badgeState2.getBadgeShapeAppearanceOverlayResId();
        }
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, badgeShapeAppearanceResId, badgeShapeAppearanceOverlayResId).build());
        invalidateSelf();
    }

    private void onBadgeTextAppearanceUpdated() {
        TextAppearance textAppearance;
        Context context = this.contextRef.get();
        if (context == null || this.textDrawableHelper.getTextAppearance() == (textAppearance = new TextAppearance(context, this.state.getTextAppearanceResId()))) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        onBadgeTextColorUpdated();
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onBadgeTextColorUpdated() {
        this.textDrawableHelper.getTextPaint().setColor(this.state.getBadgeTextColor());
        invalidateSelf();
    }

    private void onMaxBadgeLengthUpdated() {
        updateMaxBadgeNumber();
        this.textDrawableHelper.setTextSizeDirty(true);
        updateCenterAndBounds();
        invalidateSelf();
    }

    private void onNumberUpdated() {
        if (!hasText()) {
            onBadgeContentUpdated();
        }
    }

    private void onTextUpdated() {
        onBadgeContentUpdated();
    }

    private void onVisibilityUpdated() {
        setVisible(this.state.isVisible(), false);
    }

    private void restoreState() {
        onBadgeShapeAppearanceUpdated();
        onBadgeTextAppearanceUpdated();
        onMaxBadgeLengthUpdated();
        onBadgeContentUpdated();
        onAlphaUpdated();
        onBackgroundColorUpdated();
        onBadgeTextColorUpdated();
        onBadgeGravityUpdated();
        updateCenterAndBounds();
        onVisibilityUpdated();
    }

    private static void updateAnchorParentToNotClip(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        View view;
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.badgeBounds);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            calculateCenterAndBounds(rect2, view);
            BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
            float f7 = this.cornerRadius;
            if (f7 != -1.0f) {
                this.shapeDrawable.setCornerSize(f7);
            }
            if (!rect.equals(this.badgeBounds)) {
                this.shapeDrawable.setBounds(this.badgeBounds);
            }
        }
    }

    private void updateMaxBadgeNumber() {
        if (getMaxCharacterCount() != -2) {
            this.maxBadgeNumber = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
        } else {
            this.maxBadgeNumber = getMaxNumber();
        }
    }

    public void clearNumber() {
        if (this.state.hasNumber()) {
            this.state.clearNumber();
            onNumberUpdated();
        }
    }

    public void clearText() {
        if (this.state.hasText()) {
            this.state.clearText();
            onTextUpdated();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.shapeDrawable.draw(canvas);
            if (hasBadgeContent()) {
                drawBadgeContent(canvas);
            }
        }
    }

    public int getAdditionalHorizontalOffset() {
        return this.state.getAdditionalHorizontalOffset();
    }

    @Px
    public int getAdditionalVerticalOffset() {
        return this.state.getAdditionalVerticalOffset();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.state.getAlpha();
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.state.getBadgeGravity();
    }

    @NonNull
    public Locale getBadgeNumberLocale() {
        return this.state.getNumberLocale();
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        if (!isVisible()) {
            return null;
        }
        if (hasText()) {
            return getTextContentDescription();
        }
        if (hasNumber()) {
            return getNumberContentDescription();
        }
        return getEmptyContentDescription();
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    @Px
    public int getHorizontalOffsetWithText() {
        return this.state.getHorizontalOffsetWithText();
    }

    @Px
    public int getHorizontalOffsetWithoutText() {
        return this.state.getHorizontalOffsetWithoutText();
    }

    @Px
    public int getHorizontalPadding() {
        return this.state.getBadgeHorizontalPadding();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    @Px
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.state.getLargeFontVerticalOffsetAdjustment();
    }

    public int getMaxCharacterCount() {
        return this.state.getMaxCharacterCount();
    }

    public int getMaxNumber() {
        return this.state.getMaxNumber();
    }

    public int getNumber() {
        if (this.state.hasNumber()) {
            return this.state.getNumber();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @NonNull
    public BadgeState.State getSavedState() {
        return this.state.getOverridingState();
    }

    @Nullable
    public String getText() {
        return this.state.getText();
    }

    public int getVerticalOffset() {
        return this.state.getVerticalOffsetWithoutText();
    }

    @Px
    public int getVerticalOffsetWithText() {
        return this.state.getVerticalOffsetWithText();
    }

    @Px
    public int getVerticalOffsetWithoutText() {
        return this.state.getVerticalOffsetWithoutText();
    }

    @Px
    public int getVerticalPadding() {
        return this.state.getBadgeVerticalPadding();
    }

    public boolean hasNumber() {
        if (!this.state.hasText() && this.state.hasNumber()) {
            return true;
        }
        return false;
    }

    public boolean hasText() {
        return this.state.hasText();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setAdditionalHorizontalOffset(int i) {
        this.state.setAdditionalHorizontalOffset(i);
        updateCenterAndBounds();
    }

    public void setAdditionalVerticalOffset(@Px int i) {
        this.state.setAdditionalVerticalOffset(i);
        updateCenterAndBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.state.setAlpha(i);
        onAlphaUpdated();
    }

    @Deprecated
    public void setAutoAdjustToWithinGrandparentBounds(boolean z10) {
        if (this.state.isAutoAdjustedToGrandparentBounds() != z10) {
            this.state.setAutoAdjustToGrandparentBounds(z10);
            WeakReference<View> weakReference = this.anchorViewRef;
            if (weakReference != null && weakReference.get() != null) {
                autoAdjustWithinGrandparentBounds(this.anchorViewRef.get());
            }
        }
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.state.setBackgroundColor(i);
        onBackgroundColorUpdated();
    }

    public void setBadgeFixedEdge(int i) {
        BadgeState badgeState = this.state;
        if (badgeState.badgeFixedEdge != i) {
            badgeState.badgeFixedEdge = i;
            updateCenterAndBounds();
        }
    }

    public void setBadgeGravity(int i) {
        if (i == 8388691 || i == 8388693) {
            Log.w(TAG, "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        if (this.state.getBadgeGravity() != i) {
            this.state.setBadgeGravity(i);
            onBadgeGravityUpdated();
        }
    }

    public void setBadgeNumberLocale(@NonNull Locale locale) {
        if (!locale.equals(this.state.getNumberLocale())) {
            this.state.setNumberLocale(locale);
            invalidateSelf();
        }
    }

    public void setBadgeTextColor(@ColorInt int i) {
        if (this.textDrawableHelper.getTextPaint().getColor() != i) {
            this.state.setBadgeTextColor(i);
            onBadgeTextColorUpdated();
        }
    }

    public void setBadgeWithTextShapeAppearance(@StyleRes int i) {
        this.state.setBadgeWithTextShapeAppearanceResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@StyleRes int i) {
        this.state.setBadgeWithTextShapeAppearanceOverlayResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearance(@StyleRes int i) {
        this.state.setBadgeShapeAppearanceResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@StyleRes int i) {
        this.state.setBadgeShapeAppearanceOverlayResId(i);
        onBadgeShapeAppearanceUpdated();
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i) {
        this.state.setContentDescriptionExceedsMaxBadgeNumberStringResource(i);
    }

    public void setContentDescriptionForText(@Nullable CharSequence charSequence) {
        this.state.setContentDescriptionForText(charSequence);
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.state.setContentDescriptionNumberless(charSequence);
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i) {
        this.state.setContentDescriptionQuantityStringsResource(i);
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public void setHorizontalOffsetWithText(@Px int i) {
        this.state.setHorizontalOffsetWithText(i);
        updateCenterAndBounds();
    }

    public void setHorizontalOffsetWithoutText(@Px int i) {
        this.state.setHorizontalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    public void setHorizontalPadding(@Px int i) {
        if (i != this.state.getBadgeHorizontalPadding()) {
            this.state.setBadgeHorizontalPadding(i);
            updateCenterAndBounds();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(@Px int i) {
        this.state.setLargeFontVerticalOffsetAdjustment(i);
        updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int i) {
        if (this.state.getMaxCharacterCount() != i) {
            this.state.setMaxCharacterCount(i);
            onMaxBadgeLengthUpdated();
        }
    }

    public void setMaxNumber(int i) {
        if (this.state.getMaxNumber() != i) {
            this.state.setMaxNumber(i);
            onMaxBadgeLengthUpdated();
        }
    }

    public void setNumber(int i) {
        int max = Math.max(0, i);
        if (this.state.getNumber() != max) {
            this.state.setNumber(max);
            onNumberUpdated();
        }
    }

    public void setText(@Nullable String str) {
        if (!TextUtils.equals(this.state.getText(), str)) {
            this.state.setText(str);
            onTextUpdated();
        }
    }

    public void setTextAppearance(@StyleRes int i) {
        this.state.setTextAppearanceResId(i);
        onBadgeTextAppearanceUpdated();
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public void setVerticalOffsetWithText(@Px int i) {
        this.state.setVerticalOffsetWithText(i);
        updateCenterAndBounds();
    }

    public void setVerticalOffsetWithoutText(@Px int i) {
        this.state.setVerticalOffsetWithoutText(i);
        updateCenterAndBounds();
    }

    public void setVerticalPadding(@Px int i) {
        if (i != this.state.getBadgeVerticalPadding()) {
            this.state.setBadgeVerticalPadding(i);
            updateCenterAndBounds();
        }
    }

    public void setVisible(boolean z10) {
        this.state.setVisible(z10);
        onVisibilityUpdated();
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view);
        this.customBadgeParentRef = new WeakReference<>(frameLayout);
        updateAnchorParentToNotClip(view);
        updateCenterAndBounds();
        invalidateSelf();
    }

    public void updateBadgeCoordinates(@NonNull View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            updateBadgeCoordinates(view, (FrameLayout) viewGroup);
        } else {
            i.k("customBadgeParent must be a FrameLayout");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
