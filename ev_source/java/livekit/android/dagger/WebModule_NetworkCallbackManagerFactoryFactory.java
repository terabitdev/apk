package io.livekit.android.dagger;

import androidx.room.m0;
import ho.l;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.room.network.NetworkCallbackRegistry;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WebModule_NetworkCallbackManagerFactoryFactory implements c {
    private final rn.a closeableManagerProvider;
    private final rn.a registrarProvider;

    public WebModule_NetworkCallbackManagerFactoryFactory(rn.a aVar, rn.a aVar2) {
        this.closeableManagerProvider = aVar;
        this.registrarProvider = aVar2;
    }

    public static WebModule_NetworkCallbackManagerFactoryFactory create(rn.a aVar, rn.a aVar2) {
        return new WebModule_NetworkCallbackManagerFactoryFactory(aVar, aVar2);
    }

    public static l networkCallbackManagerFactory(CloseableManager closeableManager, NetworkCallbackRegistry networkCallbackRegistry) {
        l networkCallbackManagerFactory = WebModule.INSTANCE.networkCallbackManagerFactory(closeableManager, networkCallbackRegistry);
        m0.n(networkCallbackManagerFactory);
        return networkCallbackManagerFactory;
    }

    @Override // rn.a
    public l get() {
        return networkCallbackManagerFactory((CloseableManager) this.closeableManagerProvider.get(), (NetworkCallbackRegistry) this.registrarProvider.get());
    }
}
