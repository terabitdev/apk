package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import j$.util.Objects;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250;
    private static final long HIDE_DURATION_MS = 250;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300;
    private static final long SHOW_DURATION_MS = 300;
    private static final long SHOW_SCRIM_ALPHA_DURATION_MS = 100;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150;
    private final MaterialMainContainerBackHelper backHelper;

    @Nullable
    private AnimatorSet backProgressAnimatorSet;
    private final ImageButton clearButton;
    private final TouchObserverFrameLayout contentContainer;
    private final View divider;
    private final Toolbar dummyToolbar;
    private final EditText editText;
    private final FrameLayout headerContainer;
    private final ClippableRoundedCornerLayout rootView;
    private final View scrim;
    private SearchBar searchBar;
    private final TextView searchPrefix;
    private final SearchView searchView;
    private final LinearLayout textContainer;
    private final Toolbar toolbar;
    private final FrameLayout toolbarContainer;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public AnonymousClass1() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
            }
            SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.this.rootView.setVisibility(0);
            SearchViewAnimationHelper.this.searchBar.stopOnLoadAnimation();
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchViewAnimationHelper.this.rootView.setVisibility(8);
            if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
            }
            SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 extends AnimatorListenerAdapter {
        public AnonymousClass3() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
            }
            SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.this.rootView.setVisibility(0);
            SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$4 */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 extends AnimatorListenerAdapter {
        public AnonymousClass4() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SearchViewAnimationHelper.this.rootView.setVisibility(8);
            if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
            }
            SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.search.SearchViewAnimationHelper$5 */
    /* loaded from: classes4.dex */
    public class AnonymousClass5 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean val$show;

        public AnonymousClass5(boolean z10) {
            r2 = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            float f7;
            SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
            if (r2) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            searchViewAnimationHelper.setContentViewsAlpha(f7);
            SearchViewAnimationHelper.this.editText.setAlpha(1.0f);
            if (SearchViewAnimationHelper.this.searchBar != null) {
                SearchViewAnimationHelper.this.searchBar.getTextView().setAlpha(1.0f);
            }
            SearchViewAnimationHelper.this.editText.setClipBounds(null);
            SearchViewAnimationHelper.this.rootView.resetClipBoundsAndCornerRadii();
            if (!r2) {
                SearchViewAnimationHelper.this.backHelper.clearExpandedCornerRadii();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            float f7;
            SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
            if (r2) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            searchViewAnimationHelper.setContentViewsAlpha(f7);
        }
    }

    public SearchViewAnimationHelper(SearchView searchView) {
        this.searchView = searchView;
        this.scrim = searchView.scrim;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.rootView;
        this.rootView = clippableRoundedCornerLayout;
        this.headerContainer = searchView.headerContainer;
        this.toolbarContainer = searchView.toolbarContainer;
        this.toolbar = searchView.toolbar;
        this.dummyToolbar = searchView.dummyToolbar;
        this.searchPrefix = searchView.searchPrefix;
        this.editText = searchView.editText;
        this.clearButton = searchView.clearButton;
        this.divider = searchView.divider;
        this.contentContainer = searchView.contentContainer;
        this.textContainer = searchView.textContainer;
        this.backHelper = new MaterialMainContainerBackHelper(clippableRoundedCornerLayout);
    }

    private void addActionMenuViewAnimatorIfNeeded(AnimatorSet animatorSet) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar);
        if (actionMenuView == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationXBetweenViews(ToolbarUtils.getActionMenuView(this.searchBar), actionMenuView), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(actionMenuView));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    private void addBackButtonAnimatorIfNeeded(AnimatorSet animatorSet, ImageButton imageButton) {
        SearchBar searchBar = this.searchBar;
        if (searchBar != null && searchBar.getNavigationIcon() == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(imageButton, 4));
            animatorSet.playTogether(ofFloat);
        }
    }

    private void addBackButtonProgressAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        Drawable unwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (this.searchView.isAnimatedNavigationIcon()) {
            addDrawerArrowDrawableAnimatorIfNeeded(animatorSet, unwrap);
            addFadeThroughDrawableAnimatorIfNeeded(animatorSet, unwrap);
            addBackButtonAnimatorIfNeeded(animatorSet, navigationIconButton);
            return;
        }
        setFullDrawableProgressIfNeeded(unwrap);
    }

    private void addBackButtonTranslationAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationXBetweenViews(ToolbarUtils.getNavigationIconButton(this.searchBar), navigationIconButton), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(navigationIconButton));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
        animatorSet.playTogether(ofFloat, ofFloat2);
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a((DrawerArrowDrawable) drawable, 1));
            animatorSet.playTogether(ofFloat);
        }
    }

    private void addEditTextClipAnimator(AnimatorSet animatorSet) {
        if (this.searchBar != null && TextUtils.equals(this.editText.getText(), this.searchBar.getText())) {
            Rect rect = new Rect(0, 0, this.editText.getWidth(), this.editText.getHeight());
            ValueAnimator ofInt = ValueAnimator.ofInt(this.searchBar.getTextView().getWidth(), this.editText.getWidth());
            ofInt.addUpdateListener(new e(1, this, rect));
            animatorSet.playTogether(ofInt);
        }
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof FadeThroughDrawable) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a((FadeThroughDrawable) drawable, 2));
            animatorSet.playTogether(ofFloat);
        }
    }

    private void addTextFadeAnimatorIfNeeded(AnimatorSet animatorSet) {
        if (this.searchBar != null && !TextUtils.equals(this.editText.getText(), this.searchBar.getText())) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a(this, 3));
            animatorSet.playTogether(ofFloat);
        }
    }

    private Animator getActionMenuViewsAlphaAnimator(boolean z10) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (this.searchView.isMenuItemsAnimated()) {
            ofFloat.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(this.dummyToolbar), ToolbarUtils.getActionMenuView(this.toolbar)));
        }
        return ofFloat;
    }

    private AnimatorSet getButtonsProgressAnimator(boolean z10) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet getButtonsTranslationAnimator(boolean z10) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        addBackButtonTranslationAnimatorIfNeeded(animatorSet);
        addActionMenuViewAnimatorIfNeeded(animatorSet);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getClearButtonAnimator(boolean z10) {
        long j;
        long j10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j = SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS;
        } else {
            j = HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS;
        }
        ofFloat.setDuration(j);
        if (z10) {
            j10 = 250;
        } else {
            j10 = 0;
        }
        ofFloat.setStartDelay(j10);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.clearButton));
        return ofFloat;
    }

    private Animator getContentAlphaAnimator(boolean z10) {
        long j;
        long j10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j = 150;
        } else {
            j = HIDE_CONTENT_ALPHA_DURATION_MS;
        }
        ofFloat.setDuration(j);
        if (z10) {
            j10 = 75;
        } else {
            j10 = 0;
        }
        ofFloat.setStartDelay(j10);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.divider, this.contentContainer));
        return ofFloat;
    }

    private Animator getContentAnimator(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getContentAlphaAnimator(z10), getDividerAnimator(z10), getContentScaleAnimator(z10));
        return animatorSet;
    }

    private Animator getContentScaleAnimator(boolean z10) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(CONTENT_FROM_SCALE, 1.0f);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.scaleListener(this.contentContainer));
        return ofFloat;
    }

    private Animator getDividerAnimator(boolean z10) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.contentContainer.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.divider));
        return ofFloat;
    }

    private Animator getDummyToolbarAnimator(boolean z10) {
        Toolbar toolbar = this.dummyToolbar;
        return getTranslationAnimator(z10, toolbar, getFromTranslationXEnd(toolbar), getFromTranslationY());
    }

    private Animator getEditTextAnimator(boolean z10) {
        return getTranslationAnimatorForText(z10, this.editText);
    }

    private AnimatorSet getExpandCollapseAnimatorSet(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.backProgressAnimatorSet == null) {
            animatorSet.playTogether(getButtonsProgressAnimator(z10), getButtonsTranslationAnimator(z10));
        }
        animatorSet.playTogether(getScrimAlphaAnimator(z10), getRootViewAnimator(z10), getClearButtonAnimator(z10), getContentAnimator(z10), getHeaderContainerAnimator(z10), getDummyToolbarAnimator(z10), getActionMenuViewsAlphaAnimator(z10), getEditTextAnimator(z10), getSearchPrefixAnimator(z10), getTextAnimator(z10));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.5
            final /* synthetic */ boolean val$show;

            public AnonymousClass5(boolean z102) {
                r2 = z102;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                float f7;
                SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                if (r2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                searchViewAnimationHelper.setContentViewsAlpha(f7);
                SearchViewAnimationHelper.this.editText.setAlpha(1.0f);
                if (SearchViewAnimationHelper.this.searchBar != null) {
                    SearchViewAnimationHelper.this.searchBar.getTextView().setAlpha(1.0f);
                }
                SearchViewAnimationHelper.this.editText.setClipBounds(null);
                SearchViewAnimationHelper.this.rootView.resetClipBoundsAndCornerRadii();
                if (!r2) {
                    SearchViewAnimationHelper.this.backHelper.clearExpandedCornerRadii();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                float f7;
                SearchViewAnimationHelper searchViewAnimationHelper = SearchViewAnimationHelper.this;
                if (r2) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                searchViewAnimationHelper.setContentViewsAlpha(f7);
            }
        });
        return animatorSet;
    }

    private int getFromTranslationXEnd(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        int viewLeftFromSearchViewParent = getViewLeftFromSearchViewParent(this.searchBar);
        if (ViewUtils.isLayoutRtl(this.searchBar)) {
            return viewLeftFromSearchViewParent - marginEnd;
        }
        return ((this.searchBar.getWidth() + viewLeftFromSearchViewParent) + marginEnd) - this.searchView.getWidth();
    }

    private int getFromTranslationY() {
        return ((this.searchBar.getHeight() / 2) + getViewTopFromSearchViewParent(this.searchBar)) - ((this.toolbarContainer.getHeight() / 2) + this.toolbarContainer.getTop());
    }

    private Animator getHeaderContainerAnimator(boolean z10) {
        FrameLayout frameLayout = this.headerContainer;
        return getTranslationAnimator(z10, frameLayout, getFromTranslationXEnd(frameLayout), getFromTranslationY());
    }

    private Animator getRootViewAnimator(boolean z10) {
        long j;
        Rect initialHideToClipBounds = this.backHelper.getInitialHideToClipBounds();
        Rect initialHideFromClipBounds = this.backHelper.getInitialHideFromClipBounds();
        if (initialHideToClipBounds == null) {
            initialHideToClipBounds = ViewUtils.calculateRectFromBounds(this.searchView);
        }
        if (initialHideFromClipBounds == null) {
            initialHideFromClipBounds = ViewUtils.calculateOffsetRectFromBounds(this.rootView, this.searchBar);
        }
        final Rect rect = new Rect(initialHideFromClipBounds);
        final float cornerSize = this.searchBar.getCornerSize();
        final float[] maxCornerRadii = maxCornerRadii(this.rootView.getCornerRadii(), this.backHelper.getExpandedCornerRadii());
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect), initialHideFromClipBounds, initialHideToClipBounds);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchViewAnimationHelper.this.lambda$getRootViewAnimator$2(cornerSize, maxCornerRadii, rect, valueAnimator);
            }
        });
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        ofObject.setDuration(j);
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return ofObject;
    }

    private Animator getScrimAlphaAnimator(boolean z10) {
        TimeInterpolator timeInterpolator;
        long j;
        long j10;
        if (z10) {
            timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        } else {
            timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        ofFloat.setDuration(j);
        if (z10) {
            j10 = SHOW_SCRIM_ALPHA_DURATION_MS;
        } else {
            j10 = 0;
        }
        ofFloat.setStartDelay(j10);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, timeInterpolator));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(this.scrim));
        return ofFloat;
    }

    private Animator getSearchPrefixAnimator(boolean z10) {
        return getTranslationAnimatorForText(z10, this.searchPrefix);
    }

    private AnimatorSet getTextAnimator(boolean z10) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        addTextFadeAnimatorIfNeeded(animatorSet);
        addEditTextClipAnimator(animatorSet);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.LINEAR_INTERPOLATOR));
        return animatorSet;
    }

    private AnimatorSet getTranslateAnimatorSet(boolean z10) {
        long j;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getTranslationYAnimator());
        addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if (z10) {
            j = SHOW_TRANSLATE_DURATION_MS;
        } else {
            j = 300;
        }
        animatorSet.setDuration(j);
        return animatorSet;
    }

    private Animator getTranslationAnimator(boolean z10, View view, int i, int i3) {
        long j;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i3, 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (z10) {
            j = 300;
        } else {
            j = 250;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z10, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    private Animator getTranslationAnimatorForText(boolean z10, View view) {
        TextView placeholderTextView = this.searchBar.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z10) {
            placeholderTextView = this.searchBar.getTextView();
        }
        return getTranslationAnimator(z10, view, getViewLeftFromSearchViewParent(placeholderTextView) - (this.textContainer.getLeft() + view.getLeft()), getFromTranslationY());
    }

    private int getTranslationXBetweenViews(@Nullable View view, @NonNull View view2) {
        if (view == null) {
            int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
            int paddingStart = this.searchBar.getPaddingStart();
            int viewLeftFromSearchViewParent = getViewLeftFromSearchViewParent(this.searchBar);
            if (ViewUtils.isLayoutRtl(this.searchBar)) {
                return (((this.searchBar.getWidth() + viewLeftFromSearchViewParent) + marginStart) - paddingStart) - this.searchView.getRight();
            }
            return (viewLeftFromSearchViewParent - marginStart) + paddingStart;
        }
        return getViewLeftFromSearchViewParent(view) - getViewLeftFromSearchViewParent(view2);
    }

    private Animator getTranslationYAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.rootView.getHeight(), 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationYListener(this.rootView));
        return ofFloat;
    }

    private int getViewLeftFromSearchViewParent(@NonNull View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.searchView.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    private int getViewTopFromSearchViewParent(@NonNull View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.searchView.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    public static /* synthetic */ void lambda$addBackButtonAnimatorIfNeeded$3(ImageButton imageButton, ValueAnimator valueAnimator) {
        imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void lambda$addDrawerArrowDrawableAnimatorIfNeeded$4(DrawerArrowDrawable drawerArrowDrawable, ValueAnimator valueAnimator) {
        drawerArrowDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public /* synthetic */ void lambda$addEditTextClipAnimator$6(Rect rect, ValueAnimator valueAnimator) {
        rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.editText.setClipBounds(rect);
    }

    public static /* synthetic */ void lambda$addFadeThroughDrawableAnimatorIfNeeded$5(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        fadeThroughDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public /* synthetic */ void lambda$addTextFadeAnimatorIfNeeded$7(ValueAnimator valueAnimator) {
        this.editText.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.searchBar.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public /* synthetic */ void lambda$getRootViewAnimator$2(float f7, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
        this.rootView.updateClipBoundsAndCornerRadii(rect, lerpCornerRadii(f7, fArr, valueAnimator.getAnimatedFraction()));
    }

    public /* synthetic */ void lambda$startShowAnimationExpand$0() {
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(true);
        expandCollapseAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.1
            public AnonymousClass1() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(0);
                SearchViewAnimationHelper.this.searchBar.stopOnLoadAnimation();
            }
        });
        expandCollapseAnimatorSet.start();
    }

    public /* synthetic */ void lambda$startShowAnimationTranslate$1() {
        this.rootView.setTranslationY(r0.getHeight());
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(true);
        translateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.3
            public AnonymousClass3() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.requestFocusAndShowKeyboardIfNeeded();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(0);
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
            }
        });
        translateAnimatorSet.start();
    }

    private static float[] lerpCornerRadii(float f7, float[] fArr, float f10) {
        return new float[]{AnimationUtils.lerp(f7, fArr[0], f10), AnimationUtils.lerp(f7, fArr[1], f10), AnimationUtils.lerp(f7, fArr[2], f10), AnimationUtils.lerp(f7, fArr[3], f10), AnimationUtils.lerp(f7, fArr[4], f10), AnimationUtils.lerp(f7, fArr[5], f10), AnimationUtils.lerp(f7, fArr[6], f10), AnimationUtils.lerp(f7, fArr[7], f10)};
    }

    private static float[] maxCornerRadii(float[] fArr, float[] fArr2) {
        return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
    }

    private void setActionMenuViewAlphaIfNeeded(float f7) {
        ActionMenuView actionMenuView;
        if (this.searchView.isMenuItemsAnimated() && (actionMenuView = ToolbarUtils.getActionMenuView(this.toolbar)) != null) {
            actionMenuView.setAlpha(f7);
        }
    }

    public void setContentViewsAlpha(float f7) {
        this.clearButton.setAlpha(f7);
        this.divider.setAlpha(f7);
        this.contentContainer.setAlpha(f7);
        setActionMenuViewAlphaIfNeeded(f7);
    }

    private void setFullDrawableProgressIfNeeded(Drawable drawable) {
        if (drawable instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) drawable).setProgress(1.0f);
        }
        if (drawable instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawable).setProgress(1.0f);
        }
    }

    private void setMenuItemsNotClickable(Toolbar toolbar) {
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(toolbar);
        if (actionMenuView != null) {
            for (int i = 0; i < actionMenuView.getChildCount(); i++) {
                View childAt = actionMenuView.getChildAt(i);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private void setUpDummyToolbarIfNeeded() {
        Menu menu = this.dummyToolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.searchBar.getMenuResId() != -1 && this.searchView.isMenuItemsAnimated()) {
            this.dummyToolbar.inflateMenu(this.searchBar.getMenuResId());
            setMenuItemsNotClickable(this.dummyToolbar);
            this.dummyToolbar.setVisibility(0);
            return;
        }
        this.dummyToolbar.setVisibility(8);
    }

    private AnimatorSet startHideAnimationCollapse() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet expandCollapseAnimatorSet = getExpandCollapseAnimatorSet(false);
        expandCollapseAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.2
            public AnonymousClass2() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        expandCollapseAnimatorSet.start();
        return expandCollapseAnimatorSet;
    }

    private AnimatorSet startHideAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.clearFocusAndHideKeyboard();
        }
        AnimatorSet translateAnimatorSet = getTranslateAnimatorSet(false);
        translateAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchViewAnimationHelper.4
            public AnonymousClass4() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchViewAnimationHelper.this.rootView.setVisibility(8);
                if (!SearchViewAnimationHelper.this.searchView.isAdjustNothingSoftInputMode()) {
                    SearchViewAnimationHelper.this.searchView.clearFocusAndHideKeyboard();
                }
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDDEN);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SearchViewAnimationHelper.this.searchView.setTransitionState(SearchView.TransitionState.HIDING);
            }
        });
        translateAnimatorSet.start();
        return translateAnimatorSet;
    }

    private void startShowAnimationExpand() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            this.searchView.requestFocusAndShowKeyboardIfNeeded();
        }
        this.searchView.setTransitionState(SearchView.TransitionState.SHOWING);
        setUpDummyToolbarIfNeeded();
        this.editText.setText(this.searchBar.getText());
        EditText editText = this.editText;
        editText.setSelection(editText.getText().length());
        this.rootView.setVisibility(4);
        this.rootView.post(new g(this, 1));
    }

    private void startShowAnimationTranslate() {
        if (this.searchView.isAdjustNothingSoftInputMode()) {
            SearchView searchView = this.searchView;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new i(searchView, 3), 150L);
        }
        this.rootView.setVisibility(4);
        this.rootView.post(new g(this, 2));
    }

    @RequiresApi(34)
    public void cancelBackProgress() {
        this.backHelper.cancelBackProgress(this.searchBar);
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.backProgressAnimatorSet = null;
    }

    @RequiresApi(34)
    public void finishBackProgress() {
        this.backHelper.finishBackProgress(hide().getTotalDuration(), this.searchBar);
        if (this.backProgressAnimatorSet != null) {
            getButtonsTranslationAnimator(false).start();
            this.backProgressAnimatorSet.resume();
        }
        this.backProgressAnimatorSet = null;
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.backHelper;
    }

    public AnimatorSet hide() {
        if (this.searchBar != null) {
            return startHideAnimationCollapse();
        }
        return startHideAnimationTranslate();
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        return this.backHelper.onHandleBackInvoked();
    }

    public void setSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
    }

    public void show() {
        if (this.searchBar != null) {
            startShowAnimationExpand();
        } else {
            startShowAnimationTranslate();
        }
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        this.backHelper.startBackProgress(backEventCompat, this.searchBar);
    }

    @RequiresApi(34)
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (backEventCompat.getProgress() > 0.0f) {
            MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
            SearchBar searchBar = this.searchBar;
            materialMainContainerBackHelper.updateBackProgress(backEventCompat, searchBar, searchBar.getCornerSize());
            AnimatorSet animatorSet = this.backProgressAnimatorSet;
            if (animatorSet == null) {
                if (this.searchView.isAdjustNothingSoftInputMode()) {
                    this.searchView.clearFocusAndHideKeyboard();
                }
                if (!this.searchView.isAnimatedNavigationIcon()) {
                    return;
                }
                AnimatorSet buttonsProgressAnimator = getButtonsProgressAnimator(false);
                this.backProgressAnimatorSet = buttonsProgressAnimator;
                buttonsProgressAnimator.start();
                this.backProgressAnimatorSet.pause();
                return;
            }
            animatorSet.setCurrentPlayTime(backEventCompat.getProgress() * ((float) this.backProgressAnimatorSet.getDuration()));
        }
    }
}
