package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RequiresApi(21)
/* loaded from: classes4.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i, int i3, boolean z10) {
        this.startAlpha = i;
        this.endAlpha = i3;
        this.endOnTop = z10;
    }

    public static FadeModeResult endOnTop(int i, int i3) {
        return new FadeModeResult(i, i3, true);
    }

    public static FadeModeResult startOnTop(int i, int i3) {
        return new FadeModeResult(i, i3, false);
    }
}
