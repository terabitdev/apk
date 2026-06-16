package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import i1.j2;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.p {
    public final /* synthetic */ i1.o Y;
    public final /* synthetic */ ho.a Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15731a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.p f15732b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeStateV4 f15733c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.l f15734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.a f15735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j2 f15736f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ ho.p f15737x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f15738y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ sn.d f15739z0;

    public /* synthetic */ i(ho.p pVar, HomeStateV4 homeStateV4, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.a aVar, j2 j2Var, i1.o oVar, ho.a aVar2, ho.p pVar2) {
        this.f15732b = pVar;
        this.f15733c = homeStateV4;
        this.f15734d = lVar;
        this.f15738y0 = lVar2;
        this.f15739z0 = lVar3;
        this.f15735e = aVar;
        this.f15736f = j2Var;
        this.Y = oVar;
        this.Z = aVar2;
        this.f15737x0 = pVar2;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z HomeScreenV4$lambda$12;
        z HomeScreenV4UI$lambda$4$0;
        switch (this.f15731a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HomeScreenV4$lambda$12 = HomeScreenV4Kt.HomeScreenV4$lambda$12(this.f15733c, (HomeViewModelV4) this.f15738y0, this.f15735e, this.f15732b, this.f15737x0, this.f15734d, this.Z, this.f15736f, this.Y, (ho.p) this.f15739z0, (u2.m) obj, intValue);
                return HomeScreenV4$lambda$12;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                HomeScreenV4UI$lambda$4$0 = HomeScreenV4Kt.HomeScreenV4UI$lambda$4$0(this.f15732b, this.f15733c, this.f15734d, (ho.l) this.f15738y0, (ho.l) this.f15739z0, this.f15735e, this.f15736f, this.Y, this.Z, this.f15737x0, (u2.m) obj, intValue2);
                return HomeScreenV4UI$lambda$4$0;
        }
    }

    public /* synthetic */ i(HomeStateV4 homeStateV4, HomeViewModelV4 homeViewModelV4, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar, ho.a aVar2, j2 j2Var, i1.o oVar, ho.p pVar3) {
        this.f15733c = homeStateV4;
        this.f15738y0 = homeViewModelV4;
        this.f15735e = aVar;
        this.f15732b = pVar;
        this.f15737x0 = pVar2;
        this.f15734d = lVar;
        this.Z = aVar2;
        this.f15736f = j2Var;
        this.Y = oVar;
        this.f15739z0 = pVar3;
    }
}
