package io.elevenlabs.readerapp.ui.screens.authenticated;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15926b;

    public /* synthetic */ o(int i10, ho.a aVar) {
        this.f15925a = i10;
        this.f15926b = aVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z DownloadsScreenUI$lambda$7$0;
        sn.z FollowedSeriesScreenUI$lambda$5;
        sn.z GenFmLimitReachedScreenUI$lambda$0;
        sn.z OfflineDownloadLimitReachedScreen$lambda$0;
        int i10 = this.f15925a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                DownloadsScreenUI$lambda$7$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$0(this.f15926b, mVar, intValue);
                return DownloadsScreenUI$lambda$7$0;
            case 1:
                FollowedSeriesScreenUI$lambda$5 = FollowedSeriesScreenKt.FollowedSeriesScreenUI$lambda$5(this.f15926b, mVar, intValue);
                return FollowedSeriesScreenUI$lambda$5;
            case 2:
                GenFmLimitReachedScreenUI$lambda$0 = GenFmLimitReachedScreenKt.GenFmLimitReachedScreenUI$lambda$0(this.f15926b, mVar, intValue);
                return GenFmLimitReachedScreenUI$lambda$0;
            default:
                OfflineDownloadLimitReachedScreen$lambda$0 = OfflineDownloadLimitReachedScreenKt.OfflineDownloadLimitReachedScreen$lambda$0(this.f15926b, mVar, intValue);
                return OfflineDownloadLimitReachedScreen$lambda$0;
        }
    }
}
