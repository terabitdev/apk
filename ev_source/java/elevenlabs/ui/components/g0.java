package io.elevenlabs.ui.components;

import q2.d5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements ho.p {
    public final /* synthetic */ sn.d A0;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17382a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f17384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17387f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f17388x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f17389y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f17390z0;

    public /* synthetic */ g0(ho.a aVar, i3.t tVar, boolean z6, p3.b1 b1Var, q2.w wVar, q2.z zVar, l1.v vVar, r1.z1 z1Var, ho.q qVar, int i10, int i11) {
        this.f17383b = aVar;
        this.f17384c = tVar;
        this.f17385d = z6;
        this.Y = b1Var;
        this.Z = wVar;
        this.f17388x0 = zVar;
        this.f17389y0 = vVar;
        this.f17390z0 = z1Var;
        this.A0 = qVar;
        this.f17386e = i10;
        this.f17387f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Chip$lambda$13;
        switch (this.f17382a) {
            case 0:
                Chip$lambda$13 = ChipKt.Chip$lambda$13((String) this.Y, this.f17384c, this.f17385d, (Integer) this.f17389y0, (String) this.Z, (ChipIconPosition) this.f17390z0, (ho.a) this.f17383b, (ho.a) this.A0, (String) this.f17388x0, this.f17386e, this.f17387f, (u2.m) obj, ((Integer) obj2).intValue());
                return Chip$lambda$13;
            case 1:
                ((Integer) obj2).getClass();
                d5.b((ho.a) this.f17383b, this.f17384c, this.f17385d, (p3.b1) this.Y, (q2.w) this.Z, (q2.z) this.f17388x0, (l1.v) this.f17389y0, (r1.z1) this.f17390z0, (ho.q) this.A0, (u2.m) obj, u2.r.M(this.f17386e | 1), this.f17387f);
                return sn.z.f31622a;
            default:
                ((Integer) obj2).getClass();
                rd.c1.d(this.f17384c, (t1.z) this.Y, (r1.z1) this.Z, (r1.g) this.f17388x0, (i3.f) this.f17389y0, (n1.m1) this.f17390z0, this.f17385d, (l1.t1) this.f17383b, (ho.l) this.A0, (u2.m) obj, u2.r.M(this.f17386e | 1), this.f17387f);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ g0(i3.t tVar, t1.z zVar, r1.z1 z1Var, r1.g gVar, i3.f fVar, n1.m1 m1Var, boolean z6, l1.t1 t1Var, ho.l lVar, int i10, int i11) {
        this.f17384c = tVar;
        this.Y = zVar;
        this.Z = z1Var;
        this.f17388x0 = gVar;
        this.f17389y0 = fVar;
        this.f17390z0 = m1Var;
        this.f17385d = z6;
        this.f17383b = t1Var;
        this.A0 = lVar;
        this.f17386e = i10;
        this.f17387f = i11;
    }

    public /* synthetic */ g0(String str, i3.t tVar, boolean z6, Integer num, String str2, ChipIconPosition chipIconPosition, ho.a aVar, ho.a aVar2, String str3, int i10, int i11) {
        this.Y = str;
        this.f17384c = tVar;
        this.f17385d = z6;
        this.f17389y0 = num;
        this.Z = str2;
        this.f17390z0 = chipIconPosition;
        this.f17383b = aVar;
        this.A0 = aVar2;
        this.f17388x0 = str3;
        this.f17386e = i10;
        this.f17387f = i11;
    }
}
