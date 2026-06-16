package io.elevenlabs.readerapp.ui.screens.authenticated;

import n1.m1;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17230a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f17232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17235f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f17236x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f17237y0;

    public /* synthetic */ z(ExploreCollectionState exploreCollectionState, ExploreCollectionViewModel exploreCollectionViewModel, boolean z6, ua.b bVar, ho.a aVar, ho.l lVar, ho.a aVar2, ho.l lVar2, c3.j jVar) {
        this.f17233d = exploreCollectionState;
        this.f17234e = exploreCollectionViewModel;
        this.f17231b = z6;
        this.f17235f = bVar;
        this.Y = aVar;
        this.f17232c = lVar;
        this.Z = aVar2;
        this.f17236x0 = lVar2;
        this.f17237y0 = jVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ExploreCollectionScreen$lambda$11;
        switch (this.f17230a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ExploreCollectionScreen$lambda$11 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$11((ExploreCollectionState) this.f17233d, (ExploreCollectionViewModel) this.f17234e, this.f17231b, (ua.b) this.f17235f, (ho.a) this.Y, this.f17232c, (ho.a) this.Z, (ho.l) this.f17236x0, (c3.j) this.f17237y0, (u2.m) obj, intValue);
                return ExploreCollectionScreen$lambda$11;
            default:
                ((Integer) obj2).getClass();
                int M = u2.r.M(1);
                tb.a.d((u1.b) this.f17233d, (i3.t) this.f17234e, (u1.b0) this.f17235f, (z1) this.Y, (r1.i) this.Z, (r1.g) this.f17236x0, (m1) this.f17237y0, this.f17231b, this.f17232c, (u2.m) obj, M);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ z(u1.b bVar, i3.t tVar, u1.b0 b0Var, z1 z1Var, r1.i iVar, r1.g gVar, m1 m1Var, boolean z6, ho.l lVar, int i10) {
        this.f17233d = bVar;
        this.f17234e = tVar;
        this.f17235f = b0Var;
        this.Y = z1Var;
        this.Z = iVar;
        this.f17236x0 = gVar;
        this.f17237y0 = m1Var;
        this.f17231b = z6;
        this.f17232c = lVar;
    }
}
