package com.inmobi.cmp.data.model;

import androidx.annotation.Keep;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public enum ThemeMode {
    LIGHT("light"),
    DARK("dark"),
    AUTO("lightAndDark");

    private final String value;

    ThemeMode(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
