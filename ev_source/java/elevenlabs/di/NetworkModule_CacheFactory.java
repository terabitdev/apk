package io.elevenlabs.di;

import android.content.Context;
import androidx.room.m0;
import okhttp3.Cache;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_CacheFactory implements ul.c {
    private final f contextProvider;

    private NetworkModule_CacheFactory(f fVar) {
        this.contextProvider = fVar;
    }

    public static Cache cache(Context context) {
        Cache cache = NetworkModule.INSTANCE.cache(context);
        m0.n(cache);
        return cache;
    }

    public static NetworkModule_CacheFactory create(f fVar) {
        return new NetworkModule_CacheFactory(fVar);
    }

    @Override // rn.a
    public Cache get() {
        return cache((Context) this.contextProvider.get());
    }
}
