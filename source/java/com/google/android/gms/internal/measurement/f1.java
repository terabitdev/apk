package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class f1 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3767n = 1;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ l1 r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(l1 l1Var, String str, String str2, Bundle bundle, boolean z10) {
        super(l1Var, true);
        this.o = str;
        this.p = str2;
        this.s = bundle;
        this.q = z10;
        this.r = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public final void a() {
        switch (this.f3767n) {
            case 0:
                l0 l0Var = this.r.f3882f;
                w0.x.g(l0Var);
                l0Var.getUserProperties(this.o, this.p, this.q, (i0) this.s);
                return;
            default:
                long j = this.f3794a;
                l0 l0Var2 = this.r.f3882f;
                w0.x.g(l0Var2);
                l0Var2.logEvent(this.o, this.p, (Bundle) this.s, this.q, true, j);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public void b() {
        switch (this.f3767n) {
            case 0:
                ((i0) this.s).s(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(l1 l1Var, String str, String str2, boolean z10, i0 i0Var) {
        super(l1Var, true);
        this.o = str;
        this.p = str2;
        this.q = z10;
        this.s = i0Var;
        this.r = l1Var;
    }
}
