package io.elevenlabs.player.drm;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.DrmService;
import okhttp3.OkHttpClient;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AxinomDrmProvider_Factory implements c {
    private final f drmOkHttpClientProvider;
    private final f drmServiceProvider;
    private final f loggerProvider;

    private AxinomDrmProvider_Factory(f fVar, f fVar2, f fVar3) {
        this.drmServiceProvider = fVar;
        this.drmOkHttpClientProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static AxinomDrmProvider_Factory create(f fVar, f fVar2, f fVar3) {
        return new AxinomDrmProvider_Factory(fVar, fVar2, fVar3);
    }

    public static AxinomDrmProvider newInstance(DrmService drmService, OkHttpClient okHttpClient, Logger logger) {
        return new AxinomDrmProvider(drmService, okHttpClient, logger);
    }

    @Override // rn.a
    public AxinomDrmProvider get() {
        return newInstance((DrmService) this.drmServiceProvider.get(), (OkHttpClient) this.drmOkHttpClientProvider.get(), (Logger) this.loggerProvider.get());
    }
}
