package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.AuthorApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_AuthorApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_AuthorApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static AuthorApi authorApi(s0 s0Var) {
        AuthorApi authorApi = NetworkModule.INSTANCE.authorApi(s0Var);
        m0.n(authorApi);
        return authorApi;
    }

    public static NetworkModule_AuthorApiFactory create(f fVar) {
        return new NetworkModule_AuthorApiFactory(fVar);
    }

    @Override // rn.a
    public AuthorApi get() {
        return authorApi((s0) this.retrofitProvider.get());
    }
}
