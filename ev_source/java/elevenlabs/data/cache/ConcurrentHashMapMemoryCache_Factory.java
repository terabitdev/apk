package io.elevenlabs.data.cache;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ConcurrentHashMapMemoryCache_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final ConcurrentHashMapMemoryCache_Factory INSTANCE = new ConcurrentHashMapMemoryCache_Factory();

        private InstanceHolder() {
        }
    }

    public static ConcurrentHashMapMemoryCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ConcurrentHashMapMemoryCache newInstance() {
        return new ConcurrentHashMapMemoryCache();
    }

    @Override // rn.a
    public ConcurrentHashMapMemoryCache get() {
        return newInstance();
    }
}
