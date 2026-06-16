package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.MessagesAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_MessagesApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_MessagesApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_MessagesApiFactory create(f fVar) {
        return new NetworkModule_MessagesApiFactory(fVar);
    }

    public static MessagesAPI messagesApi(s0 s0Var) {
        MessagesAPI messagesApi = NetworkModule.INSTANCE.messagesApi(s0Var);
        m0.n(messagesApi);
        return messagesApi;
    }

    @Override // rn.a
    public MessagesAPI get() {
        return messagesApi((s0) this.retrofitProvider.get());
    }
}
