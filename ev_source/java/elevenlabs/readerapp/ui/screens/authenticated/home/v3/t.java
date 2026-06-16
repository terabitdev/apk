package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15696c;

    public /* synthetic */ t(HomeViewModelV3 homeViewModelV3, Object obj, int i10) {
        this.f15694a = i10;
        this.f15695b = homeViewModelV3;
        this.f15696c = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HomeStateV3 emit$lambda$0;
        HomeStateV3 selectTab$lambda$0;
        switch (this.f15694a) {
            case 0:
                emit$lambda$0 = HomeViewModelV3.AnonymousClass8.AnonymousClass1.emit$lambda$0((UserConfig) this.f15696c, (HomeViewModelV3) this.f15695b, (HomeStateV3) obj);
                return emit$lambda$0;
            case 1:
                return HomeViewModelV3$loadPage$1$1.d((HomeViewModelV3) this.f15695b, (AsyncCallResult.Error) this.f15696c, (HomeStateV3) obj);
            case 2:
                return HomeViewModelV3$loadPage$1$1.h((HomePageV3) this.f15696c, (String) this.f15695b, (HomeStateV3) obj);
            default:
                selectTab$lambda$0 = HomeViewModelV3.selectTab$lambda$0((HomeViewModelV3) this.f15695b, (String) this.f15696c, (HomeStateV3) obj);
                return selectTab$lambda$0;
        }
    }

    public /* synthetic */ t(Object obj, Object obj2, int i10) {
        this.f15694a = i10;
        this.f15696c = obj;
        this.f15695b = obj2;
    }
}
