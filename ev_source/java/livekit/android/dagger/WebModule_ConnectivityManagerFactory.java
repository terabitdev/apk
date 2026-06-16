package io.livekit.android.dagger;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.room.m0;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WebModule_ConnectivityManagerFactory implements c {
    private final rn.a contextProvider;

    public WebModule_ConnectivityManagerFactory(rn.a aVar) {
        this.contextProvider = aVar;
    }

    public static ConnectivityManager connectivityManager(Context context) {
        ConnectivityManager connectivityManager = WebModule.INSTANCE.connectivityManager(context);
        m0.n(connectivityManager);
        return connectivityManager;
    }

    public static WebModule_ConnectivityManagerFactory create(rn.a aVar) {
        return new WebModule_ConnectivityManagerFactory(aVar);
    }

    @Override // rn.a
    public ConnectivityManager get() {
        return connectivityManager((Context) this.contextProvider.get());
    }
}
