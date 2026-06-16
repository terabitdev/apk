package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectionViewModel f15364b;

    public /* synthetic */ u(CollectionViewModel collectionViewModel, int i10) {
        this.f15363a = i10;
        this.f15364b = collectionViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z CollectionScreen$lambda$1$0;
        CollectionState onClickAddFullCollectionToQueue$lambda$0;
        CollectionState onDelete$lambda$0;
        CollectionState loadMore$lambda$0;
        CollectionState load$lambda$0;
        switch (this.f15363a) {
            case 0:
                CollectionScreen$lambda$1$0 = CollectionScreenKt.CollectionScreen$lambda$1$0(this.f15364b, (ho.l) obj);
                return CollectionScreen$lambda$1$0;
            case 1:
                onClickAddFullCollectionToQueue$lambda$0 = CollectionViewModel.onClickAddFullCollectionToQueue$lambda$0(this.f15364b, (CollectionState) obj);
                return onClickAddFullCollectionToQueue$lambda$0;
            case 2:
                onDelete$lambda$0 = CollectionViewModel.onDelete$lambda$0(this.f15364b, (CollectionState) obj);
                return onDelete$lambda$0;
            case 3:
                loadMore$lambda$0 = CollectionViewModel.loadMore$lambda$0(this.f15364b, (CollectionState) obj);
                return loadMore$lambda$0;
            default:
                load$lambda$0 = CollectionViewModel.load$lambda$0(this.f15364b, (CollectionState) obj);
                return load$lambda$0;
        }
    }
}
