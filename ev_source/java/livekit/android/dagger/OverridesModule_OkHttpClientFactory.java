package io.livekit.android.dagger;

import okhttp3.OkHttpClient;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_OkHttpClientFactory implements c {
    private final OverridesModule module;

    public OverridesModule_OkHttpClientFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static OverridesModule_OkHttpClientFactory create(OverridesModule overridesModule) {
        return new OverridesModule_OkHttpClientFactory(overridesModule);
    }

    public static OkHttpClient okHttpClient(OverridesModule overridesModule) {
        return overridesModule.okHttpClient();
    }

    @Override // rn.a
    public OkHttpClient get() {
        return okHttpClient(this.module);
    }
}
