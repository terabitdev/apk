package io.elevenlabs.ui.components;

import q2.d5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17533a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f17534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn.d f17535c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17538f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f17539x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f17540y0;

    public /* synthetic */ o0(ho.a aVar, ho.a aVar2, String str, String str2, String str3, String str4, boolean z6, int i10, int i11) {
        this.f17534b = aVar;
        this.f17535c = aVar2;
        this.f17536d = str;
        this.f17537e = str2;
        this.f17538f = str3;
        this.Y = str4;
        this.Z = z6;
        this.f17539x0 = i10;
        this.f17540y0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ConfirmationDialogContent$lambda$1;
        sn.z ConfirmationDialog$lambda$1;
        switch (this.f17533a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ConfirmationDialogContent$lambda$1 = ConfirmationDialogKt.ConfirmationDialogContent$lambda$1((String) this.f17536d, (String) this.f17537e, (String) this.f17538f, this.f17534b, (String) this.Y, (ho.a) this.f17535c, this.Z, this.f17539x0, this.f17540y0, (u2.m) obj, intValue);
                return ConfirmationDialogContent$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ConfirmationDialog$lambda$1 = ConfirmationDialogKt.ConfirmationDialog$lambda$1(this.f17534b, (ho.a) this.f17535c, (String) this.f17536d, (String) this.f17537e, (String) this.f17538f, (String) this.Y, this.Z, this.f17539x0, this.f17540y0, (u2.m) obj, intValue2);
                return ConfirmationDialog$lambda$1;
            default:
                ((Integer) obj2).getClass();
                d5.l(this.f17534b, (i3.t) this.f17536d, this.Z, (p3.b1) this.f17537e, (q2.w) this.f17538f, (r1.z1) this.Y, (ho.q) this.f17535c, (u2.m) obj, u2.r.M(this.f17539x0 | 1), this.f17540y0);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ o0(ho.a aVar, i3.t tVar, boolean z6, p3.b1 b1Var, q2.w wVar, r1.z1 z1Var, ho.q qVar, int i10, int i11) {
        this.f17534b = aVar;
        this.f17536d = tVar;
        this.Z = z6;
        this.f17537e = b1Var;
        this.f17538f = wVar;
        this.Y = z1Var;
        this.f17535c = qVar;
        this.f17539x0 = i10;
        this.f17540y0 = i11;
    }

    public /* synthetic */ o0(String str, String str2, String str3, ho.a aVar, String str4, ho.a aVar2, boolean z6, int i10, int i11) {
        this.f17536d = str;
        this.f17537e = str2;
        this.f17538f = str3;
        this.f17534b = aVar;
        this.Y = str4;
        this.f17535c = aVar2;
        this.Z = z6;
        this.f17539x0 = i10;
        this.f17540y0 = i11;
    }
}
