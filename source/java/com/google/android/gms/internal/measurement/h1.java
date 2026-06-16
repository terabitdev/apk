package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f3794a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3795b;
    public final boolean l;
    public final /* synthetic */ l1 m;

    public h1(l1 l1Var, boolean z10) {
        Objects.requireNonNull(l1Var);
        this.m = l1Var;
        this.f3794a = System.currentTimeMillis();
        this.f3795b = SystemClock.elapsedRealtime();
        this.l = z10;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = this.m;
        if (l1Var.f3881e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            l1Var.b(e10, false, this.l);
            b();
        }
    }

    public void b() {
    }
}
