package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReadBookmarksAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ReadBookmarksApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ReadBookmarksApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ReadBookmarksApiFactory create(f fVar) {
        return new NetworkModule_ReadBookmarksApiFactory(fVar);
    }

    public static ReadBookmarksAPI readBookmarksApi(s0 s0Var) {
        ReadBookmarksAPI readBookmarksApi = NetworkModule.INSTANCE.readBookmarksApi(s0Var);
        m0.n(readBookmarksApi);
        return readBookmarksApi;
    }

    @Override // rn.a
    public ReadBookmarksAPI get() {
        return readBookmarksApi((s0) this.retrofitProvider.get());
    }
}
