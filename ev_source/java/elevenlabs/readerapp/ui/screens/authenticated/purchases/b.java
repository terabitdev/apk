package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookPurchasesViewModel f16622b;

    public /* synthetic */ b(BookPurchasesViewModel bookPurchasesViewModel, int i10) {
        this.f16621a = i10;
        this.f16622b = bookPurchasesViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z BookPurchasesScreen$lambda$1$0;
        BookPurchasesState load$lambda$0;
        switch (this.f16621a) {
            case 0:
                BookPurchasesScreen$lambda$1$0 = BookPurchasesScreenKt.BookPurchasesScreen$lambda$1$0(this.f16622b, (ho.l) obj);
                return BookPurchasesScreen$lambda$1$0;
            default:
                load$lambda$0 = BookPurchasesViewModel.load$lambda$0(this.f16622b, (BookPurchasesState) obj);
                return load$lambda$0;
        }
    }
}
