package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.CollectionsAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_CollectionsApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_CollectionsApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static CollectionsAPI collectionsApi(s0 s0Var) {
        CollectionsAPI collectionsApi = NetworkModule.INSTANCE.collectionsApi(s0Var);
        m0.n(collectionsApi);
        return collectionsApi;
    }

    public static NetworkModule_CollectionsApiFactory create(f fVar) {
        return new NetworkModule_CollectionsApiFactory(fVar);
    }

    @Override // rn.a
    public CollectionsAPI get() {
        return collectionsApi((s0) this.retrofitProvider.get());
    }
}
