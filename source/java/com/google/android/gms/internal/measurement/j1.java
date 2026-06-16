package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class j1 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3814n;
    public final /* synthetic */ Activity o;
    public final /* synthetic */ k1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, Activity activity, int i) {
        super(k1Var.f3834a, true);
        this.f3814n = i;
        switch (i) {
            case 1:
                this.o = activity;
                this.p = k1Var;
                super(k1Var.f3834a, true);
                return;
            case 2:
                this.o = activity;
                this.p = k1Var;
                super(k1Var.f3834a, true);
                return;
            case 3:
                this.o = activity;
                this.p = k1Var;
                super(k1Var.f3834a, true);
                return;
            case 4:
                this.o = activity;
                this.p = k1Var;
                super(k1Var.f3834a, true);
                return;
            default:
                this.o = activity;
                this.p = k1Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public final void a() {
        switch (this.f3814n) {
            case 0:
                l0 l0Var = this.p.f3834a.f3882f;
                w0.x.g(l0Var);
                l0Var.onActivityStartedByScionActivityInfo(x0.b(this.o), this.f3795b);
                return;
            case 1:
                l0 l0Var2 = this.p.f3834a.f3882f;
                w0.x.g(l0Var2);
                l0Var2.onActivityResumedByScionActivityInfo(x0.b(this.o), this.f3795b);
                return;
            case 2:
                l0 l0Var3 = this.p.f3834a.f3882f;
                w0.x.g(l0Var3);
                l0Var3.onActivityPausedByScionActivityInfo(x0.b(this.o), this.f3795b);
                return;
            case 3:
                l0 l0Var4 = this.p.f3834a.f3882f;
                w0.x.g(l0Var4);
                l0Var4.onActivityStoppedByScionActivityInfo(x0.b(this.o), this.f3795b);
                return;
            default:
                l0 l0Var5 = this.p.f3834a.f3882f;
                w0.x.g(l0Var5);
                l0Var5.onActivityDestroyedByScionActivityInfo(x0.b(this.o), this.f3795b);
                return;
        }
    }
}
