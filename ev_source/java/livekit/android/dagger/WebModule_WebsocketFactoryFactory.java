package io.livekit.android.dagger;

import androidx.room.m0;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WebModule_WebsocketFactoryFactory implements c {
    private final rn.a okHttpClientProvider;

    public WebModule_WebsocketFactoryFactory(rn.a aVar) {
        this.okHttpClientProvider = aVar;
    }

    public static WebModule_WebsocketFactoryFactory create(rn.a aVar) {
        return new WebModule_WebsocketFactoryFactory(aVar);
    }

    public static WebSocket.Factory websocketFactory(OkHttpClient okHttpClient) {
        WebSocket.Factory websocketFactory = WebModule.INSTANCE.websocketFactory(okHttpClient);
        m0.n(websocketFactory);
        return websocketFactory;
    }

    @Override // rn.a
    public WebSocket.Factory get() {
        return websocketFactory((OkHttpClient) this.okHttpClientProvider.get());
    }
}
