package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.InterestsAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_InterestsApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_InterestsApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_InterestsApiFactory create(f fVar) {
        return new NetworkModule_InterestsApiFactory(fVar);
    }

    public static InterestsAPI interestsApi(s0 s0Var) {
        InterestsAPI interestsApi = NetworkModule.INSTANCE.interestsApi(s0Var);
        m0.n(interestsApi);
        return interestsApi;
    }

    @Override // rn.a
    public InterestsAPI get() {
        return interestsApi((s0) this.retrofitProvider.get());
    }
}
