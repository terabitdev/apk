package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class z0 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4057n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ l1 q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(l1 l1Var, x0 x0Var, String str, String str2) {
        super(l1Var, true);
        this.f4057n = 2;
        this.r = x0Var;
        this.o = str;
        this.p = str2;
        Objects.requireNonNull(l1Var);
        this.q = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public final void a() {
        switch (this.f4057n) {
            case 0:
                l0 l0Var = this.q.f3882f;
                w0.x.g(l0Var);
                l0Var.clearConditionalUserProperty(this.o, this.p, (Bundle) this.r);
                return;
            case 1:
                l0 l0Var2 = this.q.f3882f;
                w0.x.g(l0Var2);
                l0Var2.getConditionalUserProperties(this.o, this.p, (i0) this.r);
                return;
            default:
                l0 l0Var3 = this.q.f3882f;
                w0.x.g(l0Var3);
                l0Var3.setCurrentScreenByScionActivityInfo((x0) this.r, this.o, this.p, this.f3794a);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public void b() {
        switch (this.f4057n) {
            case 1:
                ((i0) this.r).s(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(l1 l1Var, String str, String str2, Object obj, int i) {
        super(l1Var, true);
        this.f4057n = i;
        this.o = str;
        this.p = str2;
        this.r = obj;
        this.q = l1Var;
    }
}
