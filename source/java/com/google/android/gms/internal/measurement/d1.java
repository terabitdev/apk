package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class d1 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3734n;
    public final /* synthetic */ i0 o;
    public final /* synthetic */ l1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(l1 l1Var, i0 i0Var, int i) {
        super(l1Var, true);
        this.f3734n = i;
        this.o = i0Var;
        this.p = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public final void a() {
        switch (this.f3734n) {
            case 0:
                l0 l0Var = this.p.f3882f;
                w0.x.g(l0Var);
                l0Var.getGmpAppId(this.o);
                return;
            case 1:
                l0 l0Var2 = this.p.f3882f;
                w0.x.g(l0Var2);
                l0Var2.getCachedAppInstanceId(this.o);
                return;
            case 2:
                l0 l0Var3 = this.p.f3882f;
                w0.x.g(l0Var3);
                l0Var3.generateEventId(this.o);
                return;
            case 3:
                l0 l0Var4 = this.p.f3882f;
                w0.x.g(l0Var4);
                l0Var4.getCurrentScreenName(this.o);
                return;
            default:
                l0 l0Var5 = this.p.f3882f;
                w0.x.g(l0Var5);
                l0Var5.getCurrentScreenClass(this.o);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public final void b() {
        switch (this.f3734n) {
            case 0:
                this.o.s(null);
                return;
            case 1:
                this.o.s(null);
                return;
            case 2:
                this.o.s(null);
                return;
            case 3:
                this.o.s(null);
                return;
            default:
                this.o.s(null);
                return;
        }
    }
}
