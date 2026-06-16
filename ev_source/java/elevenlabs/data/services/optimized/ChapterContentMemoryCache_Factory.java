package io.elevenlabs.data.services.optimized;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ChapterContentMemoryCache_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final ChapterContentMemoryCache_Factory INSTANCE = new ChapterContentMemoryCache_Factory();

        private InstanceHolder() {
        }
    }

    public static ChapterContentMemoryCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChapterContentMemoryCache newInstance() {
        return new ChapterContentMemoryCache();
    }

    @Override // rn.a
    public ChapterContentMemoryCache get() {
        return newInstance();
    }
}
