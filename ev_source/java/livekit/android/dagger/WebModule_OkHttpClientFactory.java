package io.livekit.android.dagger;

import androidx.room.m0;
import okhttp3.OkHttpClient;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WebModule_OkHttpClientFactory implements c {
    private final rn.a okHttpClientOverrideProvider;

    public WebModule_OkHttpClientFactory(rn.a aVar) {
        this.okHttpClientOverrideProvider = aVar;
    }

    public static WebModule_OkHttpClientFactory create(rn.a aVar) {
        return new WebModule_OkHttpClientFactory(aVar);
    }

    public static OkHttpClient okHttpClient(OkHttpClient okHttpClient) {
        OkHttpClient okHttpClient2 = WebModule.INSTANCE.okHttpClient(okHttpClient);
        m0.n(okHttpClient2);
        return okHttpClient2;
    }

    @Override // rn.a
    public OkHttpClient get() {
        return okHttpClient((OkHttpClient) this.okHttpClientOverrideProvider.get());
    }
}
