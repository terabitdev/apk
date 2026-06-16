package io.livekit.android.room;

import fr.z;
import io.livekit.android.stats.NetworkInfo;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import rn.a;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class SignalClient_Factory implements c {
    private final a ioDispatcherProvider;
    private final a jsonProvider;
    private final a networkInfoProvider;
    private final a okHttpClientProvider;
    private final a websocketFactoryProvider;

    public SignalClient_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.websocketFactoryProvider = aVar;
        this.jsonProvider = aVar2;
        this.okHttpClientProvider = aVar3;
        this.ioDispatcherProvider = aVar4;
        this.networkInfoProvider = aVar5;
    }

    public static SignalClient_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new SignalClient_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SignalClient newInstance(WebSocket.Factory factory, vr.c cVar, OkHttpClient okHttpClient, z zVar, NetworkInfo networkInfo) {
        return new SignalClient(factory, cVar, okHttpClient, zVar, networkInfo);
    }

    @Override // rn.a
    public SignalClient get() {
        return newInstance((WebSocket.Factory) this.websocketFactoryProvider.get(), (vr.c) this.jsonProvider.get(), (OkHttpClient) this.okHttpClientProvider.get(), (z) this.ioDispatcherProvider.get(), (NetworkInfo) this.networkInfoProvider.get());
    }
}
