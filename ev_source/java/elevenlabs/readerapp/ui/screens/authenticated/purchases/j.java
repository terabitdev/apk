package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BookRefundViewModel f16658b;

    public /* synthetic */ j(BookRefundViewModel bookRefundViewModel, int i10) {
        this.f16657a = i10;
        this.f16658b = bookRefundViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z BookRefundScreen$lambda$2$0;
        BookRefundState proceed$lambda$0;
        switch (this.f16657a) {
            case 0:
                BookRefundScreen$lambda$2$0 = BookRefundScreenKt.BookRefundScreen$lambda$2$0(this.f16658b, (ho.l) obj);
                return BookRefundScreen$lambda$2$0;
            default:
                proceed$lambda$0 = BookRefundViewModel.proceed$lambda$0(this.f16658b, (BookRefundState) obj);
                return proceed$lambda$0;
        }
    }
}
