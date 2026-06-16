package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15596b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f15595a = i10;
        this.f15596b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        Object DownloadsScreenUI$lambda$7$1$0$1$0$0$2;
        sn.z MockDownloadItems$lambda$3$0$0$1;
        switch (this.f15595a) {
            case 0:
                DownloadsScreenUI$lambda$7$1$0$1$0$0$2 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0$1$0$0$2((DownloadsState) this.f15596b, ((Integer) obj).intValue(), (ReadMeta) obj2);
                return DownloadsScreenUI$lambda$7$1$0$1$0$0$2;
            default:
                MockDownloadItems$lambda$3$0$0$1 = DownloadsScreenKt.MockDownloadItems$lambda$3$0$0$1((ReadMeta) this.f15596b, (u2.m) obj, ((Integer) obj2).intValue());
                return MockDownloadItems$lambda$3$0$0$1;
        }
    }
}
