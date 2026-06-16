package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import com.google.firebase.messaging.Constants;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import ho.l;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"io/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2", "Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lsn/z;", "onPurchaseCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "Lcom/revenuecat/purchases/PurchasesError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;", "resume", "onPurchasePackageInitiated", "(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;)V", "onPurchaseStarted", "(Lcom/revenuecat/purchases/Package;)V", "onPurchaseCancelled", "()V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2 implements PaywallListener {
    final /* synthetic */ l $action;

    public RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2(l lVar) {
        this.$action = lVar;
    }

    public static final z onPurchaseCancelled$lambda$4(RevenueCatPaywallViewModel revenueCatPaywallViewModel) {
        revenueCatPaywallViewModel.getClass();
        revenueCatPaywallViewModel.purchaseCancelled();
        return z.f31622a;
    }

    public static final z onPurchaseCompleted$lambda$0(StoreTransaction storeTransaction, RevenueCatPaywallViewModel revenueCatPaywallViewModel) {
        revenueCatPaywallViewModel.getClass();
        revenueCatPaywallViewModel.purchaseCompleted(storeTransaction);
        return z.f31622a;
    }

    public static final z onPurchaseError$lambda$1(PurchasesError purchasesError, RevenueCatPaywallViewModel revenueCatPaywallViewModel) {
        revenueCatPaywallViewModel.getClass();
        revenueCatPaywallViewModel.purchaseError(purchasesError);
        return z.f31622a;
    }

    public static final z onPurchasePackageInitiated$lambda$2(Package r02, RevenueCatPaywallViewModel revenueCatPaywallViewModel) {
        revenueCatPaywallViewModel.getClass();
        revenueCatPaywallViewModel.purchaseInitiated(r02);
        return z.f31622a;
    }

    public static final z onPurchaseStarted$lambda$3(Package r02, RevenueCatPaywallViewModel revenueCatPaywallViewModel) {
        revenueCatPaywallViewModel.getClass();
        revenueCatPaywallViewModel.purchaseStarted(r02);
        return z.f31622a;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCancelled() {
        this.$action.invoke(new g(4));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction) {
        customerInfo.getClass();
        storeTransaction.getClass();
        this.$action.invoke(new e(storeTransaction, 4));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseError(PurchasesError r42) {
        r42.getClass();
        this.$action.invoke(new e(r42, 3));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchasePackageInitiated(Package rcPackage, Resumable resume) {
        rcPackage.getClass();
        resume.getClass();
        PaywallListener.DefaultImpls.onPurchasePackageInitiated(this, rcPackage, resume);
        this.$action.invoke(new d(rcPackage, 0));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public void onPurchaseStarted(Package rcPackage) {
        rcPackage.getClass();
        this.$action.invoke(new d(rcPackage, 1));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public /* bridge */ void onRestoreCompleted(CustomerInfo customerInfo) {
        PaywallListener.DefaultImpls.onRestoreCompleted(this, customerInfo);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public /* bridge */ void onRestoreError(PurchasesError purchasesError) {
        PaywallListener.DefaultImpls.onRestoreError(this, purchasesError);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public /* bridge */ void onRestoreInitiated(Resumable resumable) {
        PaywallListener.DefaultImpls.onRestoreInitiated(this, resumable);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallListener
    public /* bridge */ void onRestoreStarted() {
        PaywallListener.DefaultImpls.onRestoreStarted(this);
    }
}
