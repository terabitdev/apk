package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddSharedReadViewModel f16912b;

    public /* synthetic */ g(AddSharedReadViewModel addSharedReadViewModel, int i10) {
        this.f16911a = i10;
        this.f16912b = addSharedReadViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z AddSharedReadScreen$lambda$2$0;
        AddSharedReadState load$lambda$0;
        switch (this.f16911a) {
            case 0:
                AddSharedReadScreen$lambda$2$0 = AddSharedReadScreenKt.AddSharedReadScreen$lambda$2$0(this.f16912b, (ho.l) obj);
                return AddSharedReadScreen$lambda$2$0;
            default:
                load$lambda$0 = AddSharedReadViewModel.load$lambda$0(this.f16912b, (AddSharedReadState) obj);
                return load$lambda$0;
        }
    }
}
