package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15771b;

    public /* synthetic */ u(boolean z6, int i10) {
        this.f15770a = i10;
        this.f15771b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HomeStateV4 emit$lambda$0;
        HomeStateV4 onScreenVisibleChange$lambda$0;
        switch (this.f15770a) {
            case 0:
                emit$lambda$0 = HomeViewModelV4.AnonymousClass7.AnonymousClass2.emit$lambda$0(this.f15771b, (HomeStateV4) obj);
                return emit$lambda$0;
            default:
                onScreenVisibleChange$lambda$0 = HomeViewModelV4.onScreenVisibleChange$lambda$0(this.f15771b, (HomeStateV4) obj);
                return onScreenVisibleChange$lambda$0;
        }
    }
}
