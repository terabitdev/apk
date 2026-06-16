package io.elevenlabs.readerapp.ui.screens.authenticated;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.p f15792b;

    public /* synthetic */ k(ho.p pVar, int i10) {
        this.f15791a = i10;
        this.f15792b = pVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z DownloadsScreen$lambda$0$0$0;
        sn.z ExploreCollectionScreen$lambda$10$0$0;
        switch (this.f15791a) {
            case 0:
                DownloadsScreen$lambda$0$0$0 = DownloadsScreenKt.DownloadsScreen$lambda$0$0$0(this.f15792b, (String) obj);
                return DownloadsScreen$lambda$0$0$0;
            default:
                ExploreCollectionScreen$lambda$10$0$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$10$0$0(this.f15792b, (String) obj);
                return ExploreCollectionScreen$lambda$10$0$0;
        }
    }
}
