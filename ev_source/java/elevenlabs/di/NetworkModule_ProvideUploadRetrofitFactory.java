package io.elevenlabs.di;

import androidx.room.m0;
import okhttp3.OkHttpClient;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ProvideUploadRetrofitFactory implements ul.c {
    private final f okHttpClientProvider;
    private final f retrofitProvider;

    private NetworkModule_ProvideUploadRetrofitFactory(f fVar, f fVar2) {
        this.retrofitProvider = fVar;
        this.okHttpClientProvider = fVar2;
    }

    public static NetworkModule_ProvideUploadRetrofitFactory create(f fVar, f fVar2) {
        return new NetworkModule_ProvideUploadRetrofitFactory(fVar, fVar2);
    }

    public static s0 provideUploadRetrofit(s0 s0Var, OkHttpClient okHttpClient) {
        s0 provideUploadRetrofit = NetworkModule.INSTANCE.provideUploadRetrofit(s0Var, okHttpClient);
        m0.n(provideUploadRetrofit);
        return provideUploadRetrofit;
    }

    @Override // rn.a
    public s0 get() {
        return provideUploadRetrofit((s0) this.retrofitProvider.get(), (OkHttpClient) this.okHttpClientProvider.get());
    }
}
