package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RequiresApi(21)
/* loaded from: classes4.dex */
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    public FitModeResult(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.startScale = f7;
        this.endScale = f10;
        this.currentStartWidth = f11;
        this.currentStartHeight = f12;
        this.currentEndWidth = f13;
        this.currentEndHeight = f14;
    }
}
