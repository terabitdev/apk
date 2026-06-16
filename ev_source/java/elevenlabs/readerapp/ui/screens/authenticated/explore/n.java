package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import i1.j2;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeStateV3;
import r1.z1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.q {
    public final /* synthetic */ sn.d A0;
    public final /* synthetic */ j2 Y;
    public final /* synthetic */ i1.o Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15544a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ua.b f15545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f15546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.l f15547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.l f15548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.a f15549f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ ho.p f15550x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f15551y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ sn.d f15552z0;

    public /* synthetic */ n(ExploreState exploreState, ho.l lVar, ho.p pVar, ua.b bVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.p pVar2, j2 j2Var, i1.o oVar, ho.a aVar) {
        this.f15551y0 = exploreState;
        this.f15546c = lVar;
        this.f15550x0 = pVar;
        this.f15545b = bVar;
        this.f15547d = lVar2;
        this.f15548e = lVar3;
        this.f15552z0 = lVar4;
        this.A0 = pVar2;
        this.Y = j2Var;
        this.Z = oVar;
        this.f15549f = aVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z ExploreScreenUI$lambda$5$0$0;
        z HomeScreenV3UI$lambda$5$0;
        switch (this.f15544a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ExploreScreenUI$lambda$5$0$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0((ExploreState) this.f15551y0, this.f15546c, this.f15550x0, this.f15545b, this.f15547d, this.f15548e, (ho.l) this.f15552z0, (ho.p) this.A0, this.Y, this.Z, this.f15549f, (z1) obj, (u2.m) obj2, intValue);
                return ExploreScreenUI$lambda$5$0$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                HomeScreenV3UI$lambda$5$0 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0((HomeStateV3) this.f15551y0, this.f15545b, this.f15546c, this.f15547d, this.f15548e, this.f15549f, this.Y, this.Z, (ho.a) this.f15552z0, (ho.a) this.A0, this.f15550x0, (z1) obj, (u2.m) obj2, intValue2);
                return HomeScreenV3UI$lambda$5$0;
        }
    }

    public /* synthetic */ n(HomeStateV3 homeStateV3, ua.b bVar, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.a aVar, j2 j2Var, i1.o oVar, ho.a aVar2, ho.a aVar3, ho.p pVar) {
        this.f15551y0 = homeStateV3;
        this.f15545b = bVar;
        this.f15546c = lVar;
        this.f15547d = lVar2;
        this.f15548e = lVar3;
        this.f15549f = aVar;
        this.Y = j2Var;
        this.Z = oVar;
        this.f15552z0 = aVar2;
        this.A0 = aVar3;
        this.f15550x0 = pVar;
    }
}
