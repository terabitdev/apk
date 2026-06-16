package io.elevenlabs.readerapp.core.router;

import io.elevenlabs.domain.Analytics;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fr.d0 f14462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ na.c0 f14463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RouterViewModel f14464d;

    public /* synthetic */ q(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel) {
        this.f14461a = 2;
        this.f14463c = c0Var;
        this.f14462b = d0Var;
        this.f14464d = routerViewModel;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Router$lambda$20$0$4$0$0$14$0$0;
        sn.z Router$lambda$20$0$4$0$0$45$1$0;
        sn.z Router$lambda$20$0$4$0$0$7$2$0;
        String str = (String) obj;
        Analytics.Event.PlayerActivationSource playerActivationSource = (Analytics.Event.PlayerActivationSource) obj2;
        switch (this.f14461a) {
            case 0:
                Router$lambda$20$0$4$0$0$14$0$0 = RouterKt.Router$lambda$20$0$4$0$0$14$0$0(this.f14462b, this.f14463c, this.f14464d, str, playerActivationSource);
                return Router$lambda$20$0$4$0$0$14$0$0;
            case 1:
                Router$lambda$20$0$4$0$0$45$1$0 = RouterKt.Router$lambda$20$0$4$0$0$45$1$0(this.f14462b, this.f14463c, this.f14464d, str, playerActivationSource);
                return Router$lambda$20$0$4$0$0$45$1$0;
            default:
                Router$lambda$20$0$4$0$0$7$2$0 = RouterKt.Router$lambda$20$0$4$0$0$7$2$0(this.f14463c, this.f14462b, this.f14464d, str, playerActivationSource);
                return Router$lambda$20$0$4$0$0$7$2$0;
        }
    }

    public /* synthetic */ q(int i10, fr.d0 d0Var, RouterViewModel routerViewModel, na.c0 c0Var) {
        this.f14461a = i10;
        this.f14462b = d0Var;
        this.f14463c = c0Var;
        this.f14464d = routerViewModel;
    }
}
