package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15282a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CollectionViewModel f15284c;

    public /* synthetic */ a0(CollectionViewModel collectionViewModel, String str) {
        this.f15284c = collectionViewModel;
        this.f15283b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        CollectionState removeFromCollection$lambda$0;
        CollectionState collectionId$lambda$0;
        switch (this.f15282a) {
            case 0:
                removeFromCollection$lambda$0 = CollectionViewModel.removeFromCollection$lambda$0(this.f15284c, this.f15283b, (CollectionState) obj);
                return removeFromCollection$lambda$0;
            default:
                collectionId$lambda$0 = CollectionViewModel.setCollectionId$lambda$0(this.f15283b, this.f15284c, (CollectionState) obj);
                return collectionId$lambda$0;
        }
    }

    public /* synthetic */ a0(String str, CollectionViewModel collectionViewModel) {
        this.f15283b = str;
        this.f15284c = collectionViewModel;
    }
}
