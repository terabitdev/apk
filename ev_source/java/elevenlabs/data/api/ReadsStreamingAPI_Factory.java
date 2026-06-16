package io.elevenlabs.data.api;

import io.elevenlabs.domain.Logger;
import okhttp3.OkHttpClient;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReadsStreamingAPI_Factory implements c {
    private final f jsonProvider;
    private final f loggerProvider;
    private final f okHttpClientProvider;

    private ReadsStreamingAPI_Factory(f fVar, f fVar2, f fVar3) {
        this.okHttpClientProvider = fVar;
        this.loggerProvider = fVar2;
        this.jsonProvider = fVar3;
    }

    public static ReadsStreamingAPI_Factory create(f fVar, f fVar2, f fVar3) {
        return new ReadsStreamingAPI_Factory(fVar, fVar2, fVar3);
    }

    public static ReadsStreamingAPI newInstance(OkHttpClient okHttpClient, Logger logger, vr.c cVar) {
        return new ReadsStreamingAPI(okHttpClient, logger, cVar);
    }

    @Override // rn.a
    public ReadsStreamingAPI get() {
        return newInstance((OkHttpClient) this.okHttpClientProvider.get(), (Logger) this.loggerProvider.get(), (vr.c) this.jsonProvider.get());
    }
}
