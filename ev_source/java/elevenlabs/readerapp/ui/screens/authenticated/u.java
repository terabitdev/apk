package io.elevenlabs.readerapp.ui.screens.authenticated;

import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f17091b;

    public /* synthetic */ u(int i10, ho.a aVar) {
        this.f17090a = i10;
        this.f17091b = aVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z DownloadsScreenUI$lambda$7$0$0;
        sn.z FollowedSeriesScreenUI$lambda$5$0;
        sn.z GenFmLimitReachedScreenUI$lambda$0$0;
        sn.z NotificationPrimerBottomSheetUI$lambda$1$0;
        sn.z OfflineDownloadLimitReachedScreen$lambda$0$0;
        int i10 = this.f17090a;
        l2 l2Var = (l2) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                DownloadsScreenUI$lambda$7$0$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$0$0(this.f17091b, l2Var, mVar, intValue);
                return DownloadsScreenUI$lambda$7$0$0;
            case 1:
                FollowedSeriesScreenUI$lambda$5$0 = FollowedSeriesScreenKt.FollowedSeriesScreenUI$lambda$5$0(this.f17091b, l2Var, mVar, intValue);
                return FollowedSeriesScreenUI$lambda$5$0;
            case 2:
                GenFmLimitReachedScreenUI$lambda$0$0 = GenFmLimitReachedScreenKt.GenFmLimitReachedScreenUI$lambda$0$0(this.f17091b, l2Var, mVar, intValue);
                return GenFmLimitReachedScreenUI$lambda$0$0;
            case 3:
                NotificationPrimerBottomSheetUI$lambda$1$0 = NotificationPrimerBottomSheetKt.NotificationPrimerBottomSheetUI$lambda$1$0(this.f17091b, l2Var, mVar, intValue);
                return NotificationPrimerBottomSheetUI$lambda$1$0;
            default:
                OfflineDownloadLimitReachedScreen$lambda$0$0 = OfflineDownloadLimitReachedScreenKt.OfflineDownloadLimitReachedScreen$lambda$0$0(this.f17091b, l2Var, mVar, intValue);
                return OfflineDownloadLimitReachedScreen$lambda$0$0;
        }
    }
}
