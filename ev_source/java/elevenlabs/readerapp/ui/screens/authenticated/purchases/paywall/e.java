package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.models.StoreTransaction;
import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16674b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f16673a = i10;
        this.f16674b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        RevenueCatPaywallState emit$lambda$0;
        RevenueCatPaywallState invokeSuspend$lambda$1;
        RevenueCatPaywallState invokeSuspend$lambda$2;
        z onPurchaseError$lambda$1;
        z onPurchaseCompleted$lambda$0;
        switch (this.f16673a) {
            case 0:
                emit$lambda$0 = RevenueCatPaywallViewModel.AnonymousClass1.AnonymousClass2.emit$lambda$0((String) this.f16674b, (RevenueCatPaywallState) obj);
                return emit$lambda$0;
            case 1:
                invokeSuspend$lambda$1 = RevenueCatPaywallViewModel$loadOfferings$1$1.invokeSuspend$lambda$1((Offering) this.f16674b, (RevenueCatPaywallState) obj);
                return invokeSuspend$lambda$1;
            case 2:
                invokeSuspend$lambda$2 = RevenueCatPaywallViewModel$loadOfferings$1$1.invokeSuspend$lambda$2((PurchasesException) this.f16674b, (RevenueCatPaywallState) obj);
                return invokeSuspend$lambda$2;
            case 3:
                onPurchaseError$lambda$1 = RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2.onPurchaseError$lambda$1((PurchasesError) this.f16674b, (RevenueCatPaywallViewModel) obj);
                return onPurchaseError$lambda$1;
            default:
                onPurchaseCompleted$lambda$0 = RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2.onPurchaseCompleted$lambda$0((StoreTransaction) this.f16674b, (RevenueCatPaywallViewModel) obj);
                return onPurchaseCompleted$lambda$0;
        }
    }
}
