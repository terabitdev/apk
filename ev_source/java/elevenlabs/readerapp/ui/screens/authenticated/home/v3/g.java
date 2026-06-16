package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import java.util.Map;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModelV3 f15663b;

    public /* synthetic */ g(HomeViewModelV3 homeViewModelV3, int i10) {
        this.f15662a = i10;
        this.f15663b = homeViewModelV3;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z HomeScreenV3$lambda$11$0$0;
        z HomeScreenV3$lambda$7$0;
        HomeStateV3 fireFilteredItemClickOnCurrentTab$lambda$0;
        HomeStateV3 loadPage$lambda$0;
        switch (this.f15662a) {
            case 0:
                HomeScreenV3$lambda$11$0$0 = HomeScreenV3Kt.HomeScreenV3$lambda$11$0$0(this.f15663b, (ho.l) obj);
                return HomeScreenV3$lambda$11$0$0;
            case 1:
                HomeScreenV3$lambda$7$0 = HomeScreenV3Kt.HomeScreenV3$lambda$7$0(this.f15663b, (Map) obj);
                return HomeScreenV3$lambda$7$0;
            case 2:
                fireFilteredItemClickOnCurrentTab$lambda$0 = HomeViewModelV3.fireFilteredItemClickOnCurrentTab$lambda$0(this.f15663b, (HomeStateV3) obj);
                return fireFilteredItemClickOnCurrentTab$lambda$0;
            default:
                loadPage$lambda$0 = HomeViewModelV3.loadPage$lambda$0(this.f15663b, (HomeStateV3) obj);
                return loadPage$lambda$0;
        }
    }
}
