package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.BackEventCompat;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;

    @NonNull
    private final MaterialBackOrchestrator backOrchestrator;

    @ColorInt
    private final int backgroundColor;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;

    @NonNull
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;

    @Nullable
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final LinearLayout textContainer;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface TransitionListener {
        void onStateChanged(@NonNull SearchView searchView, @NonNull TransitionState transitionState, @NonNull TransitionState transitionState2);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, r4), attributeSet, i);
        int i3 = DEF_STYLE_RES;
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchView, i, i3, new int[0]);
        this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.SearchView_backgroundTint, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.SearchView_android_textAppearance, -1);
        String string = obtainStyledAttributes.getString(R.styleable.SearchView_android_text);
        String string2 = obtainStyledAttributes.getString(R.styleable.SearchView_android_hint);
        String string3 = obtainStyledAttributes.getString(R.styleable.SearchView_searchPrefixText);
        boolean z10 = obtainStyledAttributes.getBoolean(R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.animatedNavigationIcon = obtainStyledAttributes.getBoolean(R.styleable.SearchView_animateNavigationIcon, true);
        this.animatedMenuItems = obtainStyledAttributes.getBoolean(R.styleable.SearchView_animateMenuItems, true);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.SearchView_hideNavigationIcon, false);
        this.autoShowKeyboard = obtainStyledAttributes.getBoolean(R.styleable.SearchView_autoShowKeyboard, true);
        this.backHandlingEnabled = obtainStyledAttributes.getBoolean(R.styleable.SearchView_backHandlingEnabled, true);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(R.id.open_search_view_scrim);
        this.rootView = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.backgroundView = findViewById(R.id.open_search_view_background);
        this.statusBarSpacer = findViewById(R.id.open_search_view_status_bar_spacer);
        this.headerContainer = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.toolbarContainer = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        this.toolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.dummyToolbar = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.searchPrefix = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.textContainer = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        this.editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.clearButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.divider = findViewById(R.id.open_search_view_divider);
        this.contentContainer = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.searchViewAnimationHelper = new SearchViewAnimationHelper(this);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z10, z11);
        setUpClearButton();
        setUpContentOnTouchListener();
        setUpInsetListeners();
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private boolean isHiddenOrHiding() {
        if (!this.currentTransitionState.equals(TransitionState.HIDDEN) && !this.currentTransitionState.equals(TransitionState.HIDING)) {
            return false;
        }
        return true;
    }

    private boolean isNavigationIconDrawerArrowDrawable(@NonNull Toolbar toolbar) {
        return DrawableCompat.unwrap(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    public /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    public /* synthetic */ void lambda$setUpBackButton$1(View view) {
        hide();
    }

    public /* synthetic */ void lambda$setUpClearButton$2(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        if (isAdjustNothingSoftInputMode()) {
            clearFocusAndHideKeyboard();
            return false;
        }
        return false;
    }

    public static /* synthetic */ WindowInsetsCompat lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i3, View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        marginLayoutParams.leftMargin = i + insets.left;
        marginLayoutParams.rightMargin = i3 + insets.right;
        return windowInsetsCompat;
    }

    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public /* synthetic */ WindowInsetsCompat lambda$setUpStatusBarSpacerInsetListener$5(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z10;
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()).top;
        setUpStatusBarSpacer(i);
        if (!this.statusBarSpacerEnabledOverride) {
            if (i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            setStatusBarSpacerEnabledInternal(z10);
        }
        return windowInsetsCompat;
    }

    public /* synthetic */ WindowInsetsCompat lambda$setUpToolbarInsetListener$4(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        int i;
        int i3;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this.toolbar);
        if (isLayoutRtl) {
            i = relativePadding.end;
        } else {
            i = relativePadding.start;
        }
        if (isLayoutRtl) {
            i3 = relativePadding.start;
        } else {
            i3 = relativePadding.end;
        }
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        this.toolbar.setPadding(i + insets.left, relativePadding.top, i3 + insets.right, relativePadding.bottom);
        return windowInsetsCompat;
    }

    public /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        int i;
        View view = this.statusBarSpacer;
        if (z10) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setTransitionState(@NonNull TransitionState transitionState, boolean z10) {
        if (!this.currentTransitionState.equals(transitionState)) {
            if (z10) {
                updateModalForAccessibility(transitionState);
            }
            TransitionState transitionState2 = this.currentTransitionState;
            this.currentTransitionState = transitionState;
            Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
            while (it.hasNext()) {
                ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
            }
            updateListeningForBackCallbacks(transitionState);
            SearchBar searchBar = this.searchBar;
            if (searchBar != null && transitionState == TransitionState.HIDDEN) {
                searchBar.sendAccessibilityEvent(8);
            }
        }
    }

    private void setUpBackButton(boolean z10, boolean z11) {
        MaterialToolbar materialToolbar = this.toolbar;
        if (z11) {
            materialToolbar.setNavigationIcon((Drawable) null);
            return;
        }
        materialToolbar.setNavigationOnClickListener(new h(this, 2));
        if (z10) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(MaterialColors.getColor(this, R.attr.colorOnSurface));
            this.toolbar.setNavigationIcon(drawerArrowDrawable);
        }
    }

    private void setUpBackgroundViewElevationOverlay(float f7) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider != null && this.backgroundView != null) {
            this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f7));
        }
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new h(this, 0));
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            public AnonymousClass1() {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i3, int i8) {
                int i10;
                ImageButton imageButton = SearchView.this.clearButton;
                if (charSequence.length() > 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageButton.setVisibility(i10);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i3, int i8) {
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setUpContentOnTouchListener$3;
                lambda$setUpContentOnTouchListener$3 = SearchView.this.lambda$setUpContentOnTouchListener$3(view, motionEvent);
                return lambda$setUpContentOnTouchListener$3;
            }
        });
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i3 = marginLayoutParams.rightMargin;
        ViewCompat.setOnApplyWindowInsetsListener(this.divider, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.f
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat lambda$setUpDividerInsetListener$6;
                lambda$setUpDividerInsetListener$6 = SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i, i3, view, windowInsetsCompat);
                return lambda$setUpDividerInsetListener$6;
            }
        });
    }

    private void setUpEditText(@StyleRes int i, String str, String str2) {
        if (i != -1) {
            TextViewCompat.setTextAppearance(this.editText, i);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, android.view.View$OnTouchListener] */
    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
        this.rootView.setOnTouchListener(new Object());
    }

    private void setUpStatusBarSpacer(@Px int i) {
        if (this.statusBarSpacer.getLayoutParams().height != i) {
            this.statusBarSpacer.getLayoutParams().height = i;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(this.statusBarSpacer, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.j
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat lambda$setUpStatusBarSpacerInsetListener$5;
                lambda$setUpStatusBarSpacerInsetListener$5 = SearchView.this.lambda$setUpStatusBarSpacerInsetListener$5(view, windowInsetsCompat);
                return lambda$setUpStatusBarSpacerInsetListener$5;
            }
        });
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new c(this));
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z10) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z10);
                } else {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (!z10) {
                        if (map != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(this.childImportantForAccessibilityMap.get(childAt).intValue());
                        }
                    } else {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
        }
    }

    private void updateListeningForBackCallbacks(@NonNull TransitionState transitionState) {
        if (this.searchBar != null && this.backHandlingEnabled) {
            if (transitionState.equals(TransitionState.SHOWN)) {
                this.backOrchestrator.startListeningForBackCallbacks();
            } else if (transitionState.equals(TransitionState.HIDDEN)) {
                this.backOrchestrator.stopListeningForBackCallbacks();
            }
        }
    }

    private void updateModalForAccessibility(@NonNull TransitionState transitionState) {
        if (transitionState == TransitionState.SHOWN) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(AppCompatResources.getDrawable(getContext(), defaultNavigationIconResource).mutate());
        if (this.toolbar.getNavigationIconTint() != null) {
            wrap.setTint(this.toolbar.getNavigationIconTint().intValue());
        }
        DrawableCompat.setLayoutDirection(wrap, getLayoutDirection());
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), wrap));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        int i;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton != null) {
            if (this.rootView.getVisibility() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            Drawable unwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
            if (unwrap instanceof DrawerArrowDrawable) {
                ((DrawerArrowDrawable) unwrap).setProgress(i);
            }
            if (unwrap instanceof FadeThroughDrawable) {
                ((FadeThroughDrawable) unwrap).setProgress(i);
            }
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (!isHiddenOrHiding() && this.searchBar != null && Build.VERSION.SDK_INT >= 34) {
            this.searchViewAnimationHelper.cancelBackProgress();
        }
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new i(this, 2));
    }

    public void clearText() {
        this.editText.setText("");
    }

    @VisibleForTesting
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.editText;
    }

    @Nullable
    public CharSequence getHint() {
        return this.editText.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.softInputMode;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.editText.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.toolbar;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        BackEventCompat onHandleBackInvoked = this.searchViewAnimationHelper.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT >= 34 && this.searchBar != null && onHandleBackInvoked != null) {
            this.searchViewAnimationHelper.finishBackProgress();
        } else {
            hide();
        }
    }

    public void hide() {
        if (!this.currentTransitionState.equals(TransitionState.HIDDEN) && !this.currentTransitionState.equals(TransitionState.HIDING)) {
            SearchBar searchBar = this.searchBar;
            if (searchBar != null && searchBar.isAttachedToWindow()) {
                this.searchBar.setPlaceholderText(this.editText.getText().toString());
                SearchBar searchBar2 = this.searchBar;
                SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
                Objects.requireNonNull(searchViewAnimationHelper);
                searchBar2.post(new g(searchViewAnimationHelper, 0));
                return;
            }
            this.searchViewAnimationHelper.hide();
        }
    }

    public void inflateMenu(@MenuRes int i) {
        this.toolbar.inflateMenu(i);
    }

    public boolean isAdjustNothingSoftInputMode() {
        if (this.softInputMode == 48) {
            return true;
        }
        return false;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        if (this.searchBar != null) {
            return true;
        }
        return false;
    }

    public boolean isShowing() {
        if (!this.currentTransitionState.equals(TransitionState.SHOWN) && !this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        updateModalForAccessibility(currentTransitionState);
        updateListeningForBackCallbacks(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.backOrchestrator.stopListeningForBackCallbacks();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        if (savedState.visibility == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setVisible(z10);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        savedState.text = charSequence;
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new i(this, 0), TALKBACK_FOCUS_CHANGE_DELAY_MS);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.animatedNavigationIcon = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.autoShowKeyboard = z10;
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        setUpBackgroundViewElevationOverlay(f7);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.animatedMenuItems = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z10);
        if (!z10) {
            this.childImportantForAccessibilityMap = null;
        }
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        int i;
        this.searchPrefix.setText(charSequence);
        TextView textView = this.searchPrefix;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z10) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.toolbar.setTouchscreenBlocksFocus(z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z10) {
        this.useWindowInsetsController = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11;
        int i;
        TransitionState transitionState;
        boolean z12 = true;
        if (this.rootView.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        if (z10) {
            i = 0;
        } else {
            i = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i);
        updateNavigationIconProgressIfNeeded();
        if (z10) {
            transitionState = TransitionState.SHOWN;
        } else {
            transitionState = TransitionState.HIDDEN;
        }
        if (z11 == z10) {
            z12 = false;
        }
        setTransitionState(transitionState, z12);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new h(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new i(this, 1));
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
        updateListeningForBackCallbacks(getCurrentTransitionState());
    }

    public void show() {
        if (!this.currentTransitionState.equals(TransitionState.SHOWN) && !this.currentTransitionState.equals(TransitionState.SHOWING)) {
            this.searchViewAnimationHelper.show();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        SearchBar searchBar;
        if (!isHiddenOrHiding() && (searchBar = this.searchBar) != null) {
            if (searchBar != null) {
                searchBar.setPlaceholderText(this.editText.getText().toString());
            }
            this.searchViewAnimationHelper.startBackProgress(backEventCompat);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (!isHiddenOrHiding() && this.searchBar != null && Build.VERSION.SDK_INT >= 34) {
            this.searchViewAnimationHelper.updateBackProgress(backEventCompat);
        }
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (!searchView.isSetupWithSearchBar() && (view instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view);
                return false;
            }
            return false;
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String text;
        int visibility;

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }

        /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
        /* renamed from: com.google.android.material.search.SearchView$SavedState$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setHint(@StringRes int i) {
        this.editText.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.editText.setText(i);
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.search.SearchView$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements TextWatcher {
        public AnonymousClass1() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i3, int i8) {
            int i10;
            ImageButton imageButton = SearchView.this.clearButton;
            if (charSequence.length() > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageButton.setVisibility(i10);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i3, int i8) {
        }
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }
}
