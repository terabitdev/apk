package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddReadsToCollectionViewModel f15334b;

    public /* synthetic */ l(AddReadsToCollectionViewModel addReadsToCollectionViewModel, int i10) {
        this.f15333a = i10;
        this.f15334b = addReadsToCollectionViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z AddReadsToCollectionScreen$lambda$2$0;
        AddReadsToCollectionState submit$lambda$0;
        switch (this.f15333a) {
            case 0:
                AddReadsToCollectionScreen$lambda$2$0 = AddReadsToCollectionScreenKt.AddReadsToCollectionScreen$lambda$2$0(this.f15334b, (ho.l) obj);
                return AddReadsToCollectionScreen$lambda$2$0;
            default:
                submit$lambda$0 = AddReadsToCollectionViewModel.submit$lambda$0(this.f15334b, (AddReadsToCollectionState) obj);
                return submit$lambda$0;
        }
    }
}
