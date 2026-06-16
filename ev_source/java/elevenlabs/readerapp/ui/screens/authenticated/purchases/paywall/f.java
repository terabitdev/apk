package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RevenueCatPaywallViewModel f16676b;

    public /* synthetic */ f(RevenueCatPaywallViewModel revenueCatPaywallViewModel, int i10) {
        this.f16675a = i10;
        this.f16676b = revenueCatPaywallViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z RevenueCatPaywallScreen$lambda$3$0;
        z RevenueCatPaywallScreen$lambda$4$0;
        RevenueCatPaywallState loadOfferings$lambda$0;
        switch (this.f16675a) {
            case 0:
                return RevenueCatPaywallViewModel$loadOfferings$1$1.m(this.f16676b, (RevenueCatPaywallState) obj);
            case 1:
                return RevenueCatPaywallViewModel$loadOfferings$1$1.h(this.f16676b, (RevenueCatPaywallState) obj);
            case 2:
                RevenueCatPaywallScreen$lambda$3$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreen$lambda$3$0(this.f16676b, (l) obj);
                return RevenueCatPaywallScreen$lambda$3$0;
            case 3:
                RevenueCatPaywallScreen$lambda$4$0 = RevenueCatPaywallScreenKt.RevenueCatPaywallScreen$lambda$4$0(this.f16676b, ((Boolean) obj).booleanValue());
                return RevenueCatPaywallScreen$lambda$4$0;
            default:
                loadOfferings$lambda$0 = RevenueCatPaywallViewModel.loadOfferings$lambda$0(this.f16676b, (RevenueCatPaywallState) obj);
                return loadOfferings$lambda$0;
        }
    }
}
