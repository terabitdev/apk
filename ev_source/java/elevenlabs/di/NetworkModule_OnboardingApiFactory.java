package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.OnboardingAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_OnboardingApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_OnboardingApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_OnboardingApiFactory create(f fVar) {
        return new NetworkModule_OnboardingApiFactory(fVar);
    }

    public static OnboardingAPI onboardingApi(s0 s0Var) {
        OnboardingAPI onboardingApi = NetworkModule.INSTANCE.onboardingApi(s0Var);
        m0.n(onboardingApi);
        return onboardingApi;
    }

    @Override // rn.a
    public OnboardingAPI get() {
        return onboardingApi((s0) this.retrofitProvider.get());
    }
}
