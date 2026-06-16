package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class u5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3981a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3982b;

    static {
        Charset.forName("US-ASCII");
        f3981a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3982b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
