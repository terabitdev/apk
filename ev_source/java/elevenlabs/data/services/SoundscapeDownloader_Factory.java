package io.elevenlabs.data.services;

import android.content.Context;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class SoundscapeDownloader_Factory implements ul.c {
    private final ul.f contextProvider;
    private final ul.f okHttpClientProvider;

    private SoundscapeDownloader_Factory(ul.f fVar, ul.f fVar2) {
        this.contextProvider = fVar;
        this.okHttpClientProvider = fVar2;
    }

    public static SoundscapeDownloader_Factory create(ul.f fVar, ul.f fVar2) {
        return new SoundscapeDownloader_Factory(fVar, fVar2);
    }

    public static SoundscapeDownloader newInstance(Context context, OkHttpClient okHttpClient) {
        return new SoundscapeDownloader(context, okHttpClient);
    }

    @Override // rn.a
    public SoundscapeDownloader get() {
        return newInstance((Context) this.contextProvider.get(), (OkHttpClient) this.okHttpClientProvider.get());
    }
}
