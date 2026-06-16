package io.elevenlabs.readerapp.core.router;

import io.elevenlabs.readerapp.core.router.RouterViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14409b;

    public /* synthetic */ e0(boolean z6, int i10) {
        this.f14408a = i10;
        this.f14409b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        RouterState invokeSuspend$lambda$0;
        RouterState emit$lambda$0;
        RouterState emit$lambda$02;
        switch (this.f14408a) {
            case 0:
                invokeSuspend$lambda$0 = RouterViewModel.AnonymousClass2.AnonymousClass1.C00231.invokeSuspend$lambda$0(this.f14409b, (RouterState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                emit$lambda$0 = RouterViewModel.AnonymousClass2.AnonymousClass3.AnonymousClass1.emit$lambda$0(this.f14409b, (RouterState) obj);
                return emit$lambda$0;
            default:
                emit$lambda$02 = RouterViewModel.AnonymousClass2.AnonymousClass4.AnonymousClass1.emit$lambda$0(this.f14409b, (RouterState) obj);
                return emit$lambda$02;
        }
    }
}
