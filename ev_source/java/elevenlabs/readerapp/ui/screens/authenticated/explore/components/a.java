package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import ho.p;
import i3.t;
import n1.m1;
import q2.e3;
import q2.l;
import r1.z1;
import rd.c1;
import sn.z;
import u2.m;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15404a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f15406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15409f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f15410x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f15411y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f15412z0;

    public /* synthetic */ a(c3.j jVar, ho.a aVar, t tVar, p pVar, p pVar2, boolean z6, e3 e3Var, z1 z1Var, int i10, int i11) {
        this.Y = jVar;
        this.f15405b = aVar;
        this.f15406c = tVar;
        this.Z = pVar;
        this.f15410x0 = pVar2;
        this.f15407d = z6;
        this.f15411y0 = e3Var;
        this.f15412z0 = z1Var;
        this.f15408e = i10;
        this.f15409f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreFilterChip$lambda$5;
        switch (this.f15404a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ExploreFilterChip$lambda$5 = ExploreFilterChipKt.ExploreFilterChip$lambda$5((String) this.Y, this.f15407d, this.f15406c, (ExploreFilterChipSize) this.f15410x0, (Integer) this.f15411y0, (ho.a) this.f15405b, (ho.a) this.f15412z0, (String) this.Z, this.f15408e, this.f15409f, (m) obj, intValue);
                return ExploreFilterChip$lambda$5;
            case 1:
                ((Integer) obj2).getClass();
                l.b((c3.j) this.Y, (ho.a) this.f15405b, this.f15406c, (p) this.Z, (p) this.f15410x0, this.f15407d, (e3) this.f15411y0, (z1) this.f15412z0, (m) obj, r.M(this.f15408e | 1), this.f15409f);
                return z.f31622a;
            default:
                ((Integer) obj2).getClass();
                c1.b(this.f15406c, (t1.z) this.Y, (z1) this.Z, (r1.i) this.f15410x0, (i3.e) this.f15411y0, (m1) this.f15405b, this.f15407d, (ho.l) this.f15412z0, (m) obj, r.M(this.f15408e | 1), this.f15409f);
                return z.f31622a;
        }
    }

    public /* synthetic */ a(t tVar, t1.z zVar, z1 z1Var, r1.i iVar, i3.e eVar, m1 m1Var, boolean z6, ho.l lVar, int i10, int i11) {
        this.f15406c = tVar;
        this.Y = zVar;
        this.Z = z1Var;
        this.f15410x0 = iVar;
        this.f15411y0 = eVar;
        this.f15405b = m1Var;
        this.f15407d = z6;
        this.f15412z0 = lVar;
        this.f15408e = i10;
        this.f15409f = i11;
    }

    public /* synthetic */ a(String str, boolean z6, t tVar, ExploreFilterChipSize exploreFilterChipSize, Integer num, ho.a aVar, ho.a aVar2, String str2, int i10, int i11) {
        this.Y = str;
        this.f15407d = z6;
        this.f15406c = tVar;
        this.f15410x0 = exploreFilterChipSize;
        this.f15411y0 = num;
        this.f15405b = aVar;
        this.f15412z0 = aVar2;
        this.Z = str2;
        this.f15408e = i10;
        this.f15409f = i11;
    }
}
