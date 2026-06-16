package io.livekit.android.room.util;

import okhttp3.OkHttpClient;
import rn.a;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OkHttpConnectionWarmer_Factory implements c {
    private final a okHttpClientProvider;

    public OkHttpConnectionWarmer_Factory(a aVar) {
        this.okHttpClientProvider = aVar;
    }

    public static OkHttpConnectionWarmer_Factory create(a aVar) {
        return new OkHttpConnectionWarmer_Factory(aVar);
    }

    public static OkHttpConnectionWarmer newInstance(OkHttpClient okHttpClient) {
        return new OkHttpConnectionWarmer(okHttpClient);
    }

    @Override // rn.a
    public OkHttpConnectionWarmer get() {
        return newInstance((OkHttpClient) this.okHttpClientProvider.get());
    }
}
