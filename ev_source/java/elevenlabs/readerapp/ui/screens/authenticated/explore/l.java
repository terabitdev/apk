package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import i1.j2;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeStateV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.p {
    public final /* synthetic */ sn.d A0;
    public final /* synthetic */ sn.d B0;
    public final /* synthetic */ j2 Y;
    public final /* synthetic */ i1.o Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15526a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ua.b f15527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f15528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.p f15529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.p f15530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.l f15531f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ ho.p f15532x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f15533y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f15534z0;

    public /* synthetic */ l(j2 j2Var, ho.p pVar, ExploreState exploreState, ho.l lVar, ho.p pVar2, ua.b bVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.p pVar3, i1.o oVar, ho.a aVar) {
        this.Y = j2Var;
        this.f15529d = pVar;
        this.f15533y0 = exploreState;
        this.f15531f = lVar;
        this.f15530e = pVar2;
        this.f15527b = bVar;
        this.f15534z0 = lVar2;
        this.A0 = lVar3;
        this.B0 = lVar4;
        this.f15532x0 = pVar3;
        this.Z = oVar;
        this.f15528c = aVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreScreenUI$lambda$5;
        z HomeScreenV3$lambda$11;
        switch (this.f15526a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ExploreScreenUI$lambda$5 = ExploreScreenKt.ExploreScreenUI$lambda$5(this.Y, this.f15529d, (ExploreState) this.f15533y0, this.f15531f, this.f15530e, this.f15527b, (ho.l) this.f15534z0, (ho.l) this.A0, (ho.l) this.B0, this.f15532x0, this.Z, this.f15528c, (u2.m) obj, intValue);
                return ExploreScreenUI$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                HomeScreenV3$lambda$11 = HomeScreenV3Kt.HomeScreenV3$lambda$11((HomeStateV3) this.f15533y0, this.f15527b, (HomeViewModelV3) this.f15534z0, this.f15528c, this.f15529d, this.f15530e, this.f15531f, (ho.a) this.A0, (ho.a) this.B0, this.Y, this.Z, this.f15532x0, (u2.m) obj, intValue2);
                return HomeScreenV3$lambda$11;
        }
    }

    public /* synthetic */ l(HomeStateV3 homeStateV3, ua.b bVar, HomeViewModelV3 homeViewModelV3, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, ho.p pVar3) {
        this.f15533y0 = homeStateV3;
        this.f15527b = bVar;
        this.f15534z0 = homeViewModelV3;
        this.f15528c = aVar;
        this.f15529d = pVar;
        this.f15530e = pVar2;
        this.f15531f = lVar;
        this.A0 = aVar2;
        this.B0 = aVar3;
        this.Y = j2Var;
        this.Z = oVar;
        this.f15532x0 = pVar3;
    }
}
