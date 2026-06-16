package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import java.util.Map;
import sn.z;
import u2.h0;
import u2.i0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModelV4 f15730b;

    public /* synthetic */ h(HomeViewModelV4 homeViewModelV4, int i10) {
        this.f15729a = i10;
        this.f15730b = homeViewModelV4;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        h0 HomeScreenV4$lambda$1$0;
        z HomeScreenV4$lambda$8$0;
        z HomeScreenV4$lambda$12$0$0;
        HomeStateV4 loadPage$lambda$0;
        switch (this.f15729a) {
            case 0:
                HomeScreenV4$lambda$1$0 = HomeScreenV4Kt.HomeScreenV4$lambda$1$0(this.f15730b, (i0) obj);
                return HomeScreenV4$lambda$1$0;
            case 1:
                HomeScreenV4$lambda$8$0 = HomeScreenV4Kt.HomeScreenV4$lambda$8$0(this.f15730b, (Map) obj);
                return HomeScreenV4$lambda$8$0;
            case 2:
                HomeScreenV4$lambda$12$0$0 = HomeScreenV4Kt.HomeScreenV4$lambda$12$0$0(this.f15730b, (ho.l) obj);
                return HomeScreenV4$lambda$12$0$0;
            default:
                loadPage$lambda$0 = HomeViewModelV4.loadPage$lambda$0(this.f15730b, (HomeStateV4) obj);
                return loadPage$lambda$0;
        }
    }
}
