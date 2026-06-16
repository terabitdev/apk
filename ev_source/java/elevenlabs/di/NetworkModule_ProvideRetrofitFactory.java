package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.adapter.ResultCallAdapterFactory;
import io.elevenlabs.domain.Configuration;
import okhttp3.OkHttpClient;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ProvideRetrofitFactory implements ul.c {
    private final f configurationProvider;
    private final f okHttpClientProvider;
    private final f resultCallAdapterFactoryProvider;

    private NetworkModule_ProvideRetrofitFactory(f fVar, f fVar2, f fVar3) {
        this.configurationProvider = fVar;
        this.okHttpClientProvider = fVar2;
        this.resultCallAdapterFactoryProvider = fVar3;
    }

    public static NetworkModule_ProvideRetrofitFactory create(f fVar, f fVar2, f fVar3) {
        return new NetworkModule_ProvideRetrofitFactory(fVar, fVar2, fVar3);
    }

    public static s0 provideRetrofit(Configuration configuration, OkHttpClient okHttpClient, ResultCallAdapterFactory resultCallAdapterFactory) {
        s0 provideRetrofit = NetworkModule.INSTANCE.provideRetrofit(configuration, okHttpClient, resultCallAdapterFactory);
        m0.n(provideRetrofit);
        return provideRetrofit;
    }

    @Override // rn.a
    public s0 get() {
        return provideRetrofit((Configuration) this.configurationProvider.get(), (OkHttpClient) this.okHttpClientProvider.get(), (ResultCallAdapterFactory) this.resultCallAdapterFactoryProvider.get());
    }
}
