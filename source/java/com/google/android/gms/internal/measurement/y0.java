package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class y0 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4052n;
    public final /* synthetic */ l1 o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(l1 l1Var, Boolean bool) {
        super(l1Var, true);
        this.f4052n = 2;
        this.p = bool;
        Objects.requireNonNull(l1Var);
        this.o = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public final void a() {
        switch (this.f4052n) {
            case 0:
                l0 l0Var = this.o.f3882f;
                w0.x.g(l0Var);
                l0Var.setUserProperty("fcm", "_ln", new e1.b(this.p), true, this.f3794a);
                return;
            case 1:
                l0 l0Var2 = this.o.f3882f;
                w0.x.g(l0Var2);
                l0Var2.setConditionalUserProperty((Bundle) this.p, this.f3794a);
                return;
            case 2:
                l0 l0Var3 = this.o.f3882f;
                w0.x.g(l0Var3);
                l0Var3.setMeasurementEnabled(((Boolean) this.p).booleanValue(), this.f3794a);
                return;
            case 3:
                l0 l0Var4 = this.o.f3882f;
                w0.x.g(l0Var4);
                l0Var4.retrieveAndUploadBatches(new c1(this, (y1.a) this.p));
                return;
            case 4:
                l0 l0Var5 = this.o.f3882f;
                w0.x.g(l0Var5);
                l0Var5.logHealthData(5, "Error with data collection. Data lost.", new e1.b((Exception) this.p), new e1.b(null), new e1.b(null));
                return;
            default:
                l0 l0Var6 = this.o.f3882f;
                w0.x.g(l0Var6);
                l0Var6.registerOnMeasurementEventListener((i1) this.p);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(l1 l1Var, Object obj, int i) {
        super(l1Var, true);
        this.f4052n = i;
        this.p = obj;
        this.o = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(l1 l1Var, Exception exc) {
        super(l1Var, false);
        this.f4052n = 4;
        this.p = exc;
        this.o = l1Var;
    }
}
