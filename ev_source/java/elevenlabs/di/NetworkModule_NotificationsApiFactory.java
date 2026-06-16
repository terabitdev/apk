package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.NotificationsApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_NotificationsApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_NotificationsApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_NotificationsApiFactory create(f fVar) {
        return new NetworkModule_NotificationsApiFactory(fVar);
    }

    public static NotificationsApi notificationsApi(s0 s0Var) {
        NotificationsApi notificationsApi = NetworkModule.INSTANCE.notificationsApi(s0Var);
        m0.n(notificationsApi);
        return notificationsApi;
    }

    @Override // rn.a
    public NotificationsApi get() {
        return notificationsApi((s0) this.retrofitProvider.get());
    }
}
