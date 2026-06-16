package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReferralAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ReferralApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ReferralApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ReferralApiFactory create(f fVar) {
        return new NetworkModule_ReferralApiFactory(fVar);
    }

    public static ReferralAPI referralApi(s0 s0Var) {
        ReferralAPI referralApi = NetworkModule.INSTANCE.referralApi(s0Var);
        m0.n(referralApi);
        return referralApi;
    }

    @Override // rn.a
    public ReferralAPI get() {
        return referralApi((s0) this.retrofitProvider.get());
    }
}
