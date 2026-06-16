package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15326b;

    public /* synthetic */ k(String str, int i10) {
        this.f15325a = i10;
        this.f15326b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z AddReadsToCollectionScreenUI$lambda$6$0$0$0$0;
        AddReadsToCollectionState collectionId$lambda$0;
        AddReadsToCollectionState addReadsToCollectionState;
        CollectionState onReadClicked$lambda$0;
        CreateCollectionState name$lambda$0;
        sn.z EditCollectionScreenUI$lambda$3$0$0$4$0$0;
        EditCollectionState name$lambda$02;
        switch (this.f15325a) {
            case 0:
                AddReadsToCollectionScreenUI$lambda$6$0$0$0$0 = AddReadsToCollectionScreenKt.AddReadsToCollectionScreenUI$lambda$6$0$0$0$0(this.f15326b, (AddReadsToCollectionViewModel) obj);
                return AddReadsToCollectionScreenUI$lambda$6$0$0$0$0;
            case 1:
                collectionId$lambda$0 = AddReadsToCollectionViewModel.setCollectionId$lambda$0(this.f15326b, (AddReadsToCollectionState) obj);
                return collectionId$lambda$0;
            case 2:
                addReadsToCollectionState = AddReadsToCollectionViewModel.toggleRead$lambda$0(this.f15326b, (AddReadsToCollectionState) obj);
                return addReadsToCollectionState;
            case 3:
                onReadClicked$lambda$0 = CollectionViewModel.onReadClicked$lambda$0(this.f15326b, (CollectionState) obj);
                return onReadClicked$lambda$0;
            case 4:
                name$lambda$0 = CreateCollectionViewModel.setName$lambda$0(this.f15326b, (CreateCollectionState) obj);
                return name$lambda$0;
            case 5:
                EditCollectionScreenUI$lambda$3$0$0$4$0$0 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3$0$0$4$0$0(this.f15326b, (EditCollectionViewModel) obj);
                return EditCollectionScreenUI$lambda$3$0$0$4$0$0;
            default:
                name$lambda$02 = EditCollectionViewModel.setName$lambda$0(this.f15326b, (EditCollectionState) obj);
                return name$lambda$02;
        }
    }
}
