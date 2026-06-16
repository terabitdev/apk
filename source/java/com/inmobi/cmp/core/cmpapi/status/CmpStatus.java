package com.inmobi.cmp.core.cmpapi.status;

import androidx.annotation.Keep;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public enum CmpStatus {
    STUB("stub"),
    LOADING("loading"),
    LOADED("loaded"),
    ERROR("error");

    private final String value;

    CmpStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
