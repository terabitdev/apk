package io.livekit.android.e2ee;

import io.livekit.android.e2ee.E2EEManager;
import rn.a;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class E2EEManager_Factory_Impl implements E2EEManager.Factory {
    private final C0060E2EEManager_Factory delegateFactory;

    public E2EEManager_Factory_Impl(C0060E2EEManager_Factory c0060E2EEManager_Factory) {
        this.delegateFactory = c0060E2EEManager_Factory;
    }

    public static a create(C0060E2EEManager_Factory c0060E2EEManager_Factory) {
        return d.a(new E2EEManager_Factory_Impl(c0060E2EEManager_Factory));
    }

    @Override // io.livekit.android.e2ee.E2EEManager.Factory
    public E2EEManager create(KeyProvider keyProvider) {
        return this.delegateFactory.get(keyProvider);
    }
}
