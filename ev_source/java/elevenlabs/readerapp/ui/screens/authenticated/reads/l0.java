package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PasteLinkViewModel f16946b;

    public /* synthetic */ l0(PasteLinkViewModel pasteLinkViewModel, int i10) {
        this.f16945a = i10;
        this.f16946b = pasteLinkViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z PasteLinkScreen$lambda$0$0;
        PasteLinkState onListenClick$lambda$0;
        switch (this.f16945a) {
            case 0:
                PasteLinkScreen$lambda$0$0 = PasteLinkScreenKt.PasteLinkScreen$lambda$0$0(this.f16946b, (ho.l) obj);
                return PasteLinkScreen$lambda$0$0;
            default:
                onListenClick$lambda$0 = PasteLinkViewModel.onListenClick$lambda$0(this.f16946b, (PasteLinkState) obj);
                return onListenClick$lambda$0;
        }
    }
}
