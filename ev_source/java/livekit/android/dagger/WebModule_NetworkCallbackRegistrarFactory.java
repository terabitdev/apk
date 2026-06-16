package io.livekit.android.dagger;

import android.net.ConnectivityManager;
import androidx.room.m0;
import io.livekit.android.room.network.NetworkCallbackRegistry;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WebModule_NetworkCallbackRegistrarFactory implements c {
    private final rn.a connectivityManagerProvider;

    public WebModule_NetworkCallbackRegistrarFactory(rn.a aVar) {
        this.connectivityManagerProvider = aVar;
    }

    public static WebModule_NetworkCallbackRegistrarFactory create(rn.a aVar) {
        return new WebModule_NetworkCallbackRegistrarFactory(aVar);
    }

    public static NetworkCallbackRegistry networkCallbackRegistrar(ConnectivityManager connectivityManager) {
        NetworkCallbackRegistry networkCallbackRegistrar = WebModule.INSTANCE.networkCallbackRegistrar(connectivityManager);
        m0.n(networkCallbackRegistrar);
        return networkCallbackRegistrar;
    }

    @Override // rn.a
    public NetworkCallbackRegistry get() {
        return networkCallbackRegistrar((ConnectivityManager) this.connectivityManagerProvider.get());
    }
}
