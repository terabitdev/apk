package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class z6 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f4063a;

    public z6(Unsafe unsafe) {
        this.f4063a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b10);

    public abstract boolean b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z10);

    public abstract float d(Object obj, long j);

    public abstract void e(Object obj, long j, float f7);

    public abstract double f(Object obj, long j);

    public abstract void g(Object obj, long j, double d10);
}
