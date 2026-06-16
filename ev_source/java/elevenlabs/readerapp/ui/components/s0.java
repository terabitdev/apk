package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.ReadSource;
import q2.u7;
import r1.b3;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements ho.p {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14773a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f14775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14778f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14779x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f14780y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f14781z0;

    public /* synthetic */ s0(i3.t tVar, ho.p pVar, s4.y0 y0Var, s4.y0 y0Var2, c3.j jVar, ho.q qVar, float f10, b3 b3Var, u7 u7Var, int i10, int i11) {
        this.f14778f = tVar;
        this.f14774b = pVar;
        this.Y = y0Var;
        this.Z = y0Var2;
        this.f14779x0 = jVar;
        this.f14780y0 = qVar;
        this.f14775c = f10;
        this.f14781z0 = b3Var;
        this.A0 = u7Var;
        this.f14776d = i10;
        this.f14777e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ReadSmallRow_gMrHQkA$lambda$3;
        switch (this.f14773a) {
            case 0:
                ReadSmallRow_gMrHQkA$lambda$3 = ReadSmallRowKt.ReadSmallRow_gMrHQkA$lambda$3((String) this.f14778f, (String) this.Y, (String) this.Z, (ReadSource) this.f14781z0, (String) this.f14779x0, (ho.a) this.A0, (ho.p) this.f14774b, this.f14775c, (String) this.f14780y0, this.f14776d, this.f14777e, (u2.m) obj, ((Integer) obj2).intValue());
                return ReadSmallRow_gMrHQkA$lambda$3;
            case 1:
                ((Integer) obj2).getClass();
                q2.s.b((i3.t) this.f14778f, (ho.p) this.f14774b, (s4.y0) this.Y, (s4.y0) this.Z, (c3.j) this.f14779x0, (ho.q) this.f14780y0, this.f14775c, (b3) this.f14781z0, (u7) this.A0, (u2.m) obj, u2.r.M(this.f14776d | 1), u2.r.M(this.f14777e));
                return sn.z.f31622a;
            default:
                ((Integer) obj2).getClass();
                qc.m.a((qc.n) this.Y, (String) this.f14778f, (i3.t) this.Z, (ho.l) this.f14779x0, (ho.l) this.f14780y0, (i3.g) this.f14781z0, (f4.r) this.A0, this.f14775c, (p3.y) this.f14774b, (u2.m) obj, u2.r.M(this.f14776d | 1), u2.r.M(this.f14777e));
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ s0(String str, String str2, String str3, ReadSource readSource, String str4, ho.a aVar, ho.p pVar, float f10, String str5, int i10, int i11) {
        this.f14778f = str;
        this.Y = str2;
        this.Z = str3;
        this.f14781z0 = readSource;
        this.f14779x0 = str4;
        this.A0 = aVar;
        this.f14774b = pVar;
        this.f14775c = f10;
        this.f14780y0 = str5;
        this.f14776d = i10;
        this.f14777e = i11;
    }

    public /* synthetic */ s0(qc.n nVar, String str, i3.t tVar, ho.l lVar, ho.l lVar2, i3.g gVar, f4.r rVar, float f10, p3.y yVar, int i10, int i11) {
        this.Y = nVar;
        this.f14778f = str;
        this.Z = tVar;
        this.f14779x0 = lVar;
        this.f14780y0 = lVar2;
        this.f14781z0 = gVar;
        this.A0 = rVar;
        this.f14775c = f10;
        this.f14774b = yVar;
        this.f14776d = i10;
        this.f14777e = i11;
    }
}
