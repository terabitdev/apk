package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import ho.p;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16678a;

    public /* synthetic */ a(int i10) {
        this.f16678a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda_1745360728$lambda$0;
        z lambda_778236748$lambda$0;
        z lambda_890986107$lambda$0;
        z lambda_1783112443$lambda$0;
        z lambda_830330500$lambda$0;
        z lambda_643206520$lambda$0;
        z lambda_1798194397$lambda$0;
        int i10 = this.f16678a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewPurchaseCreditsScreenContentDefaultGroupPreviewPurchaseCreditsScreenContentKt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewPurchaseCreditsScreenContentMinutesDefaultGroupPreviewPurchaseCreditsScreenContentMinutesKt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewPurchaseCreditsScreenErrorDefaultGroupPreviewPurchaseCreditsScreenErrorKt.a(mVar, intValue);
            case 3:
                return ComposableSingletons$PreviewPurchaseCreditsScreenLoadingDefaultGroupPreviewPurchaseCreditsScreenLoadingKt.a(mVar, intValue);
            case 4:
                return ComposableSingletons$PreviewPurchaseCreditsScreenPurchaseErrorDefaultGroupPreviewPurchaseCreditsScreenPurchaseErrorKt.a(mVar, intValue);
            case 5:
                return ComposableSingletons$PreviewPurchaseCreditsScreenPurchaseLoadingDefaultGroupPreviewPurchaseCreditsScreenPurchaseLoadingKt.a(mVar, intValue);
            case 6:
                return ComposableSingletons$PreviewPurchaseCreditsScreenPurchaseSuccessDefaultGroupPreviewPurchaseCreditsScreenPurchaseSuccessKt.a(mVar, intValue);
            case 7:
                lambda_1745360728$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_1745360728$lambda$0(mVar, intValue);
                return lambda_1745360728$lambda$0;
            case 8:
                lambda_778236748$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_778236748$lambda$0(mVar, intValue);
                return lambda_778236748$lambda$0;
            case 9:
                lambda_890986107$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_890986107$lambda$0(mVar, intValue);
                return lambda_890986107$lambda$0;
            case 10:
                lambda_1783112443$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_1783112443$lambda$0(mVar, intValue);
                return lambda_1783112443$lambda$0;
            case 11:
                lambda_830330500$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_830330500$lambda$0(mVar, intValue);
                return lambda_830330500$lambda$0;
            case 12:
                lambda_643206520$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_643206520$lambda$0(mVar, intValue);
                return lambda_643206520$lambda$0;
            default:
                lambda_1798194397$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_1798194397$lambda$0(mVar, intValue);
                return lambda_1798194397$lambda$0;
        }
    }
}
