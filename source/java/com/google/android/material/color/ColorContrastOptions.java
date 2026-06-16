package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class ColorContrastOptions {

    @StyleRes
    private final int highContrastThemeOverlayResourceId;

    @StyleRes
    private final int mediumContrastThemeOverlayResourceId;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class Builder {

        @StyleRes
        private int highContrastThemeOverlayResourceId;

        @StyleRes
        private int mediumContrastThemeOverlayResourceId;

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @NonNull
        public Builder setHighContrastThemeOverlay(@StyleRes int i) {
            this.highContrastThemeOverlayResourceId = i;
            return this;
        }

        @NonNull
        public Builder setMediumContrastThemeOverlay(@StyleRes int i) {
            this.mediumContrastThemeOverlayResourceId = i;
            return this;
        }
    }

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    @StyleRes
    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    @StyleRes
    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }
}
