package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel_HiltModules;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PurchaseHoursViewModel_HiltModules_KeyModule_ProvideFactory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        static final PurchaseHoursViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PurchaseHoursViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }

    public static PurchaseHoursViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return PurchaseHoursViewModel_HiltModules.KeyModule.provide();
    }

    @Override // rn.a
    public Boolean get() {
        return Boolean.valueOf(provide());
    }
}
