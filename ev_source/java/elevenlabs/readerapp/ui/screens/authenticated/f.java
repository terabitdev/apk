package io.elevenlabs.readerapp.ui.screens.authenticated;

import r1.l2;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15568c;

    public /* synthetic */ f(Object obj, Object obj2, int i10) {
        this.f15566a = i10;
        this.f15568c = obj;
        this.f15567b = obj2;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z CategoriesTabs$lambda$0$0$0;
        sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$1;
        sn.z ExploreCollectionScreenUI$lambda$6$2;
        sn.z OfflineDownloadLimitReachedScreen$lambda$1;
        switch (this.f15566a) {
            case 0:
                CategoriesTabs$lambda$0$0$0 = DownloadsScreenKt.CategoriesTabs$lambda$0$0$0((Filter) this.f15568c, (ho.l) this.f15567b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return CategoriesTabs$lambda$0$0$0;
            case 1:
                DownloadsScreenUI$lambda$7$1$0$1$0$0$1 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0$1$0$0$1((DownloadsState) this.f15568c, (ho.l) this.f15567b, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return DownloadsScreenUI$lambda$7$1$0$1$0$0$1;
            case 2:
                ExploreCollectionScreenUI$lambda$6$2 = ExploreCollectionScreenKt.ExploreCollectionScreenUI$lambda$6$2((ho.a) this.f15568c, (i3.t) this.f15567b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ExploreCollectionScreenUI$lambda$6$2;
            default:
                OfflineDownloadLimitReachedScreen$lambda$1 = OfflineDownloadLimitReachedScreenKt.OfflineDownloadLimitReachedScreen$lambda$1((String) this.f15568c, (ho.a) this.f15567b, (z1) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return OfflineDownloadLimitReachedScreen$lambda$1;
        }
    }
}
