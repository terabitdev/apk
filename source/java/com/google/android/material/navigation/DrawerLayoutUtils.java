package com.google.android.material.navigation;

import a6.p;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    private static final int DEFAULT_SCRIM_ALPHA = Color.alpha(DEFAULT_SCRIM_COLOR);

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.navigation.DrawerLayoutUtils$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        final /* synthetic */ View val$drawerView;

        public AnonymousClass1(View view) {
            r2 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            DrawerLayout.this.closeDrawer(r2, false);
            DrawerLayout.this.setScrimColor(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
        }
    }

    private DrawerLayoutUtils() {
    }

    @NonNull
    public static Animator.AnimatorListener getScrimCloseAnimatorListener(@NonNull DrawerLayout drawerLayout, @NonNull View view) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            final /* synthetic */ View val$drawerView;

            public AnonymousClass1(View view2) {
                r2 = view2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DrawerLayout.this.closeDrawer(r2, false);
                DrawerLayout.this.setScrimColor(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
            }
        };
    }

    @NonNull
    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@NonNull DrawerLayout drawerLayout) {
        return new p(drawerLayout, 2);
    }

    public static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        drawerLayout.setScrimColor(ColorUtils.setAlphaComponent(DEFAULT_SCRIM_COLOR, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }
}
