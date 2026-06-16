package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddReadToCollectionViewModel f15307c;

    public /* synthetic */ f(String str, AddReadToCollectionViewModel addReadToCollectionViewModel, int i10) {
        this.f15305a = i10;
        this.f15306b = str;
        this.f15307c = addReadToCollectionViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AddReadToCollectionState readId$lambda$0;
        AddReadToCollectionState addReadToCollectionState;
        switch (this.f15305a) {
            case 0:
                readId$lambda$0 = AddReadToCollectionViewModel.setReadId$lambda$0(this.f15306b, this.f15307c, (AddReadToCollectionState) obj);
                return readId$lambda$0;
            default:
                addReadToCollectionState = AddReadToCollectionViewModel.toggle$lambda$0(this.f15306b, this.f15307c, (AddReadToCollectionState) obj);
                return addReadToCollectionState;
        }
    }
}
