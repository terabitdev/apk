package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b1 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3712n;
    public final /* synthetic */ String o;
    public final /* synthetic */ l1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(l1 l1Var, String str, int i) {
        super(l1Var, true);
        this.f3712n = i;
        this.o = str;
        this.p = l1Var;
    }

    @Override // com.google.android.gms.internal.measurement.h1
    public final void a() {
        switch (this.f3712n) {
            case 0:
                l0 l0Var = this.p.f3882f;
                w0.x.g(l0Var);
                l0Var.beginAdUnitExposure(this.o, this.f3795b);
                return;
            default:
                l0 l0Var2 = this.p.f3882f;
                w0.x.g(l0Var2);
                l0Var2.endAdUnitExposure(this.o, this.f3795b);
                return;
        }
    }
}
