package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements ho.p {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ Object B0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17391a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.t f17392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17393c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.l f17395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17396f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f17397x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f17398y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f17399z0;

    public /* synthetic */ g1(i3.t tVar, t1.z zVar, r1.z1 z1Var, boolean z6, r1.i iVar, i3.e eVar, n1.m1 m1Var, boolean z10, l1.t1 t1Var, ho.l lVar, int i10, int i11) {
        this.f17392b = tVar;
        this.Z = zVar;
        this.f17397x0 = z1Var;
        this.f17393c = z6;
        this.f17398y0 = iVar;
        this.f17399z0 = eVar;
        this.A0 = m1Var;
        this.f17394d = z10;
        this.B0 = t1Var;
        this.f17395e = lVar;
        this.f17396f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z InputBorderless$lambda$5;
        switch (this.f17391a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                InputBorderless$lambda$5 = InputBorderlessKt.InputBorderless$lambda$5((String) this.Z, this.f17395e, this.f17392b, (String) this.f17397x0, (a2.a2) this.f17398y0, (a2.z1) this.f17399z0, (y4.d0) this.A0, (s4.y0) this.B0, this.f17393c, this.f17394d, this.f17396f, this.Y, (u2.m) obj, intValue);
                return InputBorderless$lambda$5;
            default:
                ((Integer) obj2).getClass();
                int M = u2.r.M(this.f17396f | 1);
                rd.c1.c(this.f17392b, (t1.z) this.Z, (r1.z1) this.f17397x0, this.f17393c, (r1.i) this.f17398y0, (i3.e) this.f17399z0, (n1.m1) this.A0, this.f17394d, (l1.t1) this.B0, this.f17395e, (u2.m) obj, M, this.Y);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ g1(String str, ho.l lVar, i3.t tVar, String str2, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, s4.y0 y0Var, boolean z6, boolean z10, int i10, int i11) {
        this.Z = str;
        this.f17395e = lVar;
        this.f17392b = tVar;
        this.f17397x0 = str2;
        this.f17398y0 = a2Var;
        this.f17399z0 = z1Var;
        this.A0 = d0Var;
        this.B0 = y0Var;
        this.f17393c = z6;
        this.f17394d = z10;
        this.f17396f = i10;
        this.Y = i11;
    }
}
