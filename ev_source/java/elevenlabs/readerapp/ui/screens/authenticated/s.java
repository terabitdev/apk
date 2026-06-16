package io.elevenlabs.readerapp.ui.screens.authenticated;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.p f17022b;

    public /* synthetic */ s(ho.p pVar, int i10) {
        this.f17021a = i10;
        this.f17022b = pVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z DownloadsScreen$lambda$0;
        sn.z ExploreCollectionScreen$lambda$10;
        int i10 = this.f17021a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                DownloadsScreen$lambda$0 = DownloadsScreenKt.DownloadsScreen$lambda$0(this.f17022b, mVar, intValue);
                return DownloadsScreen$lambda$0;
            default:
                ExploreCollectionScreen$lambda$10 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$10(this.f17022b, mVar, intValue);
                return ExploreCollectionScreen$lambda$10;
        }
    }
}
