package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16666b;

    public /* synthetic */ p(String str, int i10) {
        this.f16665a = i10;
        this.f16666b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        HoursLowState invokeSuspend$lambda$0;
        sn.z BookRefundScreenUI$lambda$3$0$7$0$0;
        BookRefundState inputReasonText$lambda$0;
        BookRefundState readId$lambda$0;
        switch (this.f16665a) {
            case 0:
                invokeSuspend$lambda$0 = HoursLowViewModel.AnonymousClass1.C00441.invokeSuspend$lambda$0(this.f16666b, (HoursLowState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                BookRefundScreenUI$lambda$3$0$7$0$0 = BookRefundScreenKt.BookRefundScreenUI$lambda$3$0$7$0$0(this.f16666b, (BookRefundViewModel) obj);
                return BookRefundScreenUI$lambda$3$0$7$0$0;
            case 2:
                inputReasonText$lambda$0 = BookRefundViewModel.setInputReasonText$lambda$0(this.f16666b, (BookRefundState) obj);
                return inputReasonText$lambda$0;
            default:
                readId$lambda$0 = BookRefundViewModel.setReadId$lambda$0(this.f16666b, (BookRefundState) obj);
                return readId$lambda$0;
        }
    }
}
