package io.elevenlabs.readerapp.core.router;

import io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RouterViewModel f14466b;

    public /* synthetic */ r(RouterViewModel routerViewModel, int i10) {
        this.f14465a = i10;
        this.f14466b = routerViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z Router$lambda$20$0$4$0$0$49$3$0;
        sn.z Router$lambda$20$0$4$0$0$BottomNav$1$0;
        RouterState onShareConsumed$lambda$0;
        RouterState onDeepLinkConsumed$lambda$0;
        RouterState markMessageAsRead$lambda$0;
        switch (this.f14465a) {
            case 0:
                Router$lambda$20$0$4$0$0$49$3$0 = RouterKt.Router$lambda$20$0$4$0$0$49$3$0(this.f14466b, (String) obj);
                return Router$lambda$20$0$4$0$0$49$3$0;
            case 1:
                Router$lambda$20$0$4$0$0$BottomNav$1$0 = RouterKt.Router$lambda$20$0$4$0$0$BottomNav$1$0(this.f14466b, (BottomNavigationItem) obj);
                return Router$lambda$20$0$4$0$0$BottomNav$1$0;
            case 2:
                onShareConsumed$lambda$0 = RouterViewModel.onShareConsumed$lambda$0(this.f14466b, (RouterState) obj);
                return onShareConsumed$lambda$0;
            case 3:
                onDeepLinkConsumed$lambda$0 = RouterViewModel.onDeepLinkConsumed$lambda$0(this.f14466b, (RouterState) obj);
                return onDeepLinkConsumed$lambda$0;
            default:
                markMessageAsRead$lambda$0 = RouterViewModel.markMessageAsRead$lambda$0(this.f14466b, (RouterState) obj);
                return markMessageAsRead$lambda$0;
        }
    }
}
