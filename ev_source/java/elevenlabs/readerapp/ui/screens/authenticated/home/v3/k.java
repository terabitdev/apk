package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import sn.z;
import ta.n1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15673c;

    public /* synthetic */ k(ho.l lVar, ho.a aVar) {
        this.f15671a = 2;
        this.f15673c = lVar;
        this.f15672b = aVar;
    }

    @Override // ho.a
    public final Object invoke() {
        z HomeScreenV3UI$lambda$5$0$12$2$0$0;
        z HomeScreenV3UI$lambda$5$0$12$2$1$0;
        z HomeScreenV3UI$lambda$5$0$16$0;
        n1 initSubpagePagingData$lambda$0;
        switch (this.f15671a) {
            case 0:
                HomeScreenV3UI$lambda$5$0$12$2$0$0 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$12$2$0$0((ho.a) this.f15672b, (ho.l) this.f15673c);
                return HomeScreenV3UI$lambda$5$0$12$2$0$0;
            case 1:
                HomeScreenV3UI$lambda$5$0$12$2$1$0 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$12$2$1$0((ho.a) this.f15672b, (ho.l) this.f15673c);
                return HomeScreenV3UI$lambda$5$0$12$2$1$0;
            case 2:
                HomeScreenV3UI$lambda$5$0$16$0 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$16$0((ho.l) this.f15673c, (ho.a) this.f15672b);
                return HomeScreenV3UI$lambda$5$0$16$0;
            default:
                initSubpagePagingData$lambda$0 = HomeViewModelV3.initSubpagePagingData$lambda$0((HomeViewModelV3) this.f15672b, (String) this.f15673c);
                return initSubpagePagingData$lambda$0;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, int i10) {
        this.f15671a = i10;
        this.f15672b = obj;
        this.f15673c = obj2;
    }
}
