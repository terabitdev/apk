package io.elevenlabs.player.di;

import android.content.Context;
import androidx.room.m0;
import d8.v;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MediaCacheModule_ProvideSimpleCacheFactory implements c {
    private final f contextProvider;

    private MediaCacheModule_ProvideSimpleCacheFactory(f fVar) {
        this.contextProvider = fVar;
    }

    public static MediaCacheModule_ProvideSimpleCacheFactory create(f fVar) {
        return new MediaCacheModule_ProvideSimpleCacheFactory(fVar);
    }

    public static v provideSimpleCache(Context context) {
        v provideSimpleCache = MediaCacheModule.INSTANCE.provideSimpleCache(context);
        m0.n(provideSimpleCache);
        return provideSimpleCache;
    }

    @Override // rn.a
    public v get() {
        return provideSimpleCache((Context) this.contextProvider.get());
    }
}
