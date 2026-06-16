package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditCollectionViewModel f15348b;

    public /* synthetic */ o0(EditCollectionViewModel editCollectionViewModel, int i10) {
        this.f15347a = i10;
        this.f15348b = editCollectionViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z EditCollectionScreen$lambda$2$0;
        EditCollectionState submit$lambda$0;
        switch (this.f15347a) {
            case 0:
                EditCollectionScreen$lambda$2$0 = EditCollectionScreenKt.EditCollectionScreen$lambda$2$0(this.f15348b, (ho.l) obj);
                return EditCollectionScreen$lambda$2$0;
            default:
                submit$lambda$0 = EditCollectionViewModel.submit$lambda$0(this.f15348b, (EditCollectionState) obj);
                return submit$lambda$0;
        }
    }
}
