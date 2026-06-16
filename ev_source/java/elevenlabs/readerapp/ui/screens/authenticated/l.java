package io.elevenlabs.readerapp.ui.screens.authenticated;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Filter f15796b;

    public /* synthetic */ l(Filter filter, int i10) {
        this.f15795a = i10;
        this.f15796b = filter;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0$0;
        DownloadsState selectCategory$lambda$0;
        switch (this.f15795a) {
            case 0:
                DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0$0(this.f15796b, (DownloadsViewModel) obj);
                return DownloadsScreenUI$lambda$7$1$0$1$0$0$1$0$0$0;
            default:
                selectCategory$lambda$0 = DownloadsViewModel.selectCategory$lambda$0(this.f15796b, (DownloadsState) obj);
                return selectCategory$lambda$0;
        }
    }
}
