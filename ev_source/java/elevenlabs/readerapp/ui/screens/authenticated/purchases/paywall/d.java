package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import com.revenuecat.purchases.Package;
import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Package f16672b;

    public /* synthetic */ d(Package r12, int i10) {
        this.f16671a = i10;
        this.f16672b = r12;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z onPurchasePackageInitiated$lambda$2;
        z onPurchaseStarted$lambda$3;
        RevenueCatPaywallState purchaseStarted$lambda$0;
        switch (this.f16671a) {
            case 0:
                onPurchasePackageInitiated$lambda$2 = RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2.onPurchasePackageInitiated$lambda$2(this.f16672b, (RevenueCatPaywallViewModel) obj);
                return onPurchasePackageInitiated$lambda$2;
            case 1:
                onPurchaseStarted$lambda$3 = RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2.onPurchaseStarted$lambda$3(this.f16672b, (RevenueCatPaywallViewModel) obj);
                return onPurchaseStarted$lambda$3;
            default:
                purchaseStarted$lambda$0 = RevenueCatPaywallViewModel.purchaseStarted$lambda$0(this.f16672b, (RevenueCatPaywallState) obj);
                return purchaseStarted$lambda$0;
        }
    }
}
