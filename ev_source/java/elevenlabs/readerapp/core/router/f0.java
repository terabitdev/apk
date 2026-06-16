package io.elevenlabs.readerapp.core.router;

import io.elevenlabs.readerapp.core.router.RouterViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14413a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14416d;

    public /* synthetic */ f0(PaywallTrigger paywallTrigger, RouterViewModel routerViewModel, boolean z6) {
        this.f14415c = paywallTrigger;
        this.f14416d = routerViewModel;
        this.f14414b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        RouterState emit$lambda$0;
        switch (this.f14413a) {
            case 0:
                emit$lambda$0 = RouterViewModel.AnonymousClass2.AnonymousClass6.C00252.emit$lambda$0((PaywallTrigger) this.f14415c, (RouterViewModel) this.f14416d, this.f14414b, (RouterState) obj);
                return emit$lambda$0;
            default:
                return NavigationExtensions.a(this.f14414b, (na.c0) this.f14415c, (String) this.f14416d, (na.g0) obj);
        }
    }

    public /* synthetic */ f0(na.c0 c0Var, String str, boolean z6) {
        this.f14414b = z6;
        this.f14415c = c0Var;
        this.f14416d = str;
    }
}
