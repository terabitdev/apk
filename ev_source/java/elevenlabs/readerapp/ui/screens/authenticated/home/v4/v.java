package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15772a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModelV4 f15773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15774c;

    public /* synthetic */ v(UserConfig userConfig, HomeViewModelV4 homeViewModelV4) {
        this.f15774c = userConfig;
        this.f15773b = homeViewModelV4;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HomeStateV4 emit$lambda$0;
        switch (this.f15772a) {
            case 0:
                emit$lambda$0 = HomeViewModelV4.AnonymousClass9.AnonymousClass1.emit$lambda$0((UserConfig) this.f15774c, this.f15773b, (HomeStateV4) obj);
                return emit$lambda$0;
            default:
                return HomeViewModelV4$loadPage$1$1.h(this.f15773b, (AsyncCallResult.Error) this.f15774c, (HomeStateV4) obj);
        }
    }

    public /* synthetic */ v(HomeViewModelV4 homeViewModelV4, AsyncCallResult.Error error) {
        this.f15773b = homeViewModelV4;
        this.f15774c = error;
    }
}
