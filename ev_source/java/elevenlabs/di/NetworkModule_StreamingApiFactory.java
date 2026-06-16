package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReadsStreamingAPI;
import io.elevenlabs.data.api.StreamingAPI;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_StreamingApiFactory implements ul.c {
    private final f readsStreamingAPIProvider;

    private NetworkModule_StreamingApiFactory(f fVar) {
        this.readsStreamingAPIProvider = fVar;
    }

    public static NetworkModule_StreamingApiFactory create(f fVar) {
        return new NetworkModule_StreamingApiFactory(fVar);
    }

    public static StreamingAPI streamingApi(ReadsStreamingAPI readsStreamingAPI) {
        StreamingAPI streamingApi = NetworkModule.INSTANCE.streamingApi(readsStreamingAPI);
        m0.n(streamingApi);
        return streamingApi;
    }

    @Override // rn.a
    public StreamingAPI get() {
        return streamingApi((ReadsStreamingAPI) this.readsStreamingAPIProvider.get());
    }
}
