package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16677a;

    public /* synthetic */ g(int i10) {
        this.f16677a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z RevenueCatPaywallScreenUI$lambda$2$1$0$0$0;
        z RevenueCatPaywallScreenUI$lambda$0$0;
        z RevenueCatPaywallScreenUI$lambda$1$0;
        RevenueCatPaywallState purchaseCancelled$lambda$0;
        RevenueCatPaywallState onDismissed$lambda$0;
        switch (this.f16677a) {
            case 0:
                return RevenueCatPaywallViewModel$purchaseCompleted$1$1.d((RevenueCatPaywallState) obj);
            case 1:
                RevenueCatPaywallScreenUI$lambda$2$1$0$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$2$1$0$0$0((RevenueCatPaywallViewModel) obj);
                return RevenueCatPaywallScreenUI$lambda$2$1$0$0$0;
            case 2:
                RevenueCatPaywallScreenUI$lambda$0$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$0$0((l) obj);
                return RevenueCatPaywallScreenUI$lambda$0$0;
            case 3:
                RevenueCatPaywallScreenUI$lambda$1$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreenUI$lambda$1$0(((Boolean) obj).booleanValue());
                return RevenueCatPaywallScreenUI$lambda$1$0;
            case 4:
                return RevenueCatPaywallScreenKt$RevenueCatPaywallScreenUI$3$2.a((RevenueCatPaywallViewModel) obj);
            case 5:
                purchaseCancelled$lambda$0 = RevenueCatPaywallViewModel.purchaseCancelled$lambda$0((RevenueCatPaywallState) obj);
                return purchaseCancelled$lambda$0;
            default:
                onDismissed$lambda$0 = RevenueCatPaywallViewModel.onDismissed$lambda$0((RevenueCatPaywallState) obj);
                return onDismissed$lambda$0;
        }
    }
}
