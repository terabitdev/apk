package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.room.util.ConnectionWarmer;
import io.livekit.android.room.util.OkHttpConnectionWarmer;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WebModule_ConnectionWarmerFactory implements c {
    private final rn.a okHttpConnectionWarmerProvider;

    public WebModule_ConnectionWarmerFactory(rn.a aVar) {
        this.okHttpConnectionWarmerProvider = aVar;
    }

    public static ConnectionWarmer connectionWarmer(OkHttpConnectionWarmer okHttpConnectionWarmer) {
        ConnectionWarmer connectionWarmer = WebModule.INSTANCE.connectionWarmer(okHttpConnectionWarmer);
        m0.n(connectionWarmer);
        return connectionWarmer;
    }

    public static WebModule_ConnectionWarmerFactory create(rn.a aVar) {
        return new WebModule_ConnectionWarmerFactory(aVar);
    }

    @Override // rn.a
    public ConnectionWarmer get() {
        return connectionWarmer((OkHttpConnectionWarmer) this.okHttpConnectionWarmerProvider.get());
    }
}
