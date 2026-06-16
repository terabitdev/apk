package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReadBookmarksVideoAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ReadBookmarksVideoApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ReadBookmarksVideoApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ReadBookmarksVideoApiFactory create(f fVar) {
        return new NetworkModule_ReadBookmarksVideoApiFactory(fVar);
    }

    public static ReadBookmarksVideoAPI readBookmarksVideoApi(s0 s0Var) {
        ReadBookmarksVideoAPI readBookmarksVideoApi = NetworkModule.INSTANCE.readBookmarksVideoApi(s0Var);
        m0.n(readBookmarksVideoApi);
        return readBookmarksVideoApi;
    }

    @Override // rn.a
    public ReadBookmarksVideoAPI get() {
        return readBookmarksVideoApi((s0) this.retrofitProvider.get());
    }
}
