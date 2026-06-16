package io.elevenlabs.readerapp.core.router;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RouterViewModel f14397c;

    public /* synthetic */ c0(RouterViewModel routerViewModel, String str) {
        this.f14395a = 1;
        this.f14396b = str;
        this.f14397c = routerViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        RouterState onFileShare$lambda$0;
        RouterState onRouteChanged$lambda$0;
        RouterState onDeepLink$lambda$0;
        switch (this.f14395a) {
            case 0:
                onFileShare$lambda$0 = RouterViewModel.onFileShare$lambda$0(this.f14397c, this.f14396b, (RouterState) obj);
                return onFileShare$lambda$0;
            case 1:
                onRouteChanged$lambda$0 = RouterViewModel.onRouteChanged$lambda$0(this.f14396b, this.f14397c, (RouterState) obj);
                return onRouteChanged$lambda$0;
            default:
                onDeepLink$lambda$0 = RouterViewModel.onDeepLink$lambda$0(this.f14397c, this.f14396b, (RouterState) obj);
                return onDeepLink$lambda$0;
        }
    }

    public /* synthetic */ c0(RouterViewModel routerViewModel, String str, int i10) {
        this.f14395a = i10;
        this.f14397c = routerViewModel;
        this.f14396b = str;
    }
}
