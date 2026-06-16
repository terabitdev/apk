package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
abstract class HideViewOnScrollDelegate {
    public abstract <V extends View> int getSize(@NonNull V v, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int getTargetTranslation();

    public abstract int getViewEdge();

    public abstract <V extends View> ViewPropertyAnimator getViewTranslationAnimator(@NonNull V v, int i);

    public abstract <V extends View> void setAdditionalHiddenOffset(@NonNull V v, int i, int i3);

    public abstract <V extends View> void setViewTranslation(@NonNull V v, int i);
}
