package com.google.gson.internal.sql;

import com.google.gson.j;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4349a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f4350b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f4351c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f4352d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f4349a = z10;
        if (z10) {
            f4350b = SqlDateTypeAdapter.f4343b;
            f4351c = SqlTimeTypeAdapter.f4345b;
            f4352d = SqlTimestampTypeAdapter.f4347b;
        } else {
            f4350b = null;
            f4351c = null;
            f4352d = null;
        }
    }
}
