package io.elevenlabs.player.di;

import androidx.room.m0;
import okhttp3.OkHttpClient;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DrmNetworkModule_ProvideDrmOkHttpClientFactory implements c {
    private final f okHttpClientProvider;

    private DrmNetworkModule_ProvideDrmOkHttpClientFactory(f fVar) {
        this.okHttpClientProvider = fVar;
    }

    public static DrmNetworkModule_ProvideDrmOkHttpClientFactory create(f fVar) {
        return new DrmNetworkModule_ProvideDrmOkHttpClientFactory(fVar);
    }

    public static OkHttpClient provideDrmOkHttpClient(OkHttpClient okHttpClient) {
        OkHttpClient provideDrmOkHttpClient = DrmNetworkModule.INSTANCE.provideDrmOkHttpClient(okHttpClient);
        m0.n(provideDrmOkHttpClient);
        return provideDrmOkHttpClient;
    }

    @Override // rn.a
    public OkHttpClient get() {
        return provideDrmOkHttpClient((OkHttpClient) this.okHttpClientProvider.get());
    }
}
