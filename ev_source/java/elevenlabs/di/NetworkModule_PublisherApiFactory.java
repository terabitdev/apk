package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.PublisherApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_PublisherApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_PublisherApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_PublisherApiFactory create(f fVar) {
        return new NetworkModule_PublisherApiFactory(fVar);
    }

    public static PublisherApi publisherApi(s0 s0Var) {
        PublisherApi publisherApi = NetworkModule.INSTANCE.publisherApi(s0Var);
        m0.n(publisherApi);
        return publisherApi;
    }

    @Override // rn.a
    public PublisherApi get() {
        return publisherApi((s0) this.retrofitProvider.get());
    }
}
