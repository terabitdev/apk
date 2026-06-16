package com.uptodown.util;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class NativeApiKey {

    /* renamed from: a, reason: collision with root package name */
    public static final NativeApiKey f4508a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.uptodown.util.NativeApiKey, java.lang.Object] */
    static {
        System.loadLibrary("uptodown-native");
    }

    public final native String getAuthApikey();
}
