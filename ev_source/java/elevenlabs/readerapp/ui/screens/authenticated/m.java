package io.elevenlabs.readerapp.ui.screens.authenticated;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2.x0 f15915b;

    public /* synthetic */ m(u2.x0 x0Var, int i10) {
        this.f15914a = i10;
        this.f15915b = x0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z DownloadsScreenUI$lambda$7$1$0$1$1$0;
        sn.z ExploreCollectionScreenUI$lambda$6$1$0;
        sn.z CollectionDetailsScaffold_lQd7feU$lambda$3$0$0$0;
        switch (this.f15914a) {
            case 0:
                DownloadsScreenUI$lambda$7$1$0$1$1$0 = DownloadsScreenKt.DownloadsScreenUI$lambda$7$1$0$1$1$0(this.f15915b, (h5.l) obj);
                return DownloadsScreenUI$lambda$7$1$0$1$1$0;
            case 1:
                ExploreCollectionScreenUI$lambda$6$1$0 = ExploreCollectionScreenKt.ExploreCollectionScreenUI$lambda$6$1$0(this.f15915b, (h5.l) obj);
                return ExploreCollectionScreenUI$lambda$6$1$0;
            default:
                CollectionDetailsScaffold_lQd7feU$lambda$3$0$0$0 = ExploreCollectionScreenKt.CollectionDetailsScaffold_lQd7feU$lambda$3$0$0$0(this.f15915b, (h5.l) obj);
                return CollectionDetailsScaffold_lQd7feU$lambda$3$0$0$0;
        }
    }
}
