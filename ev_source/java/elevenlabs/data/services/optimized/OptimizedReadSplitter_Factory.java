package io.elevenlabs.data.services.optimized;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OptimizedReadSplitter_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final OptimizedReadSplitter_Factory INSTANCE = new OptimizedReadSplitter_Factory();

        private InstanceHolder() {
        }
    }

    public static OptimizedReadSplitter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OptimizedReadSplitter newInstance() {
        return new OptimizedReadSplitter();
    }

    @Override // rn.a
    public OptimizedReadSplitter get() {
        return newInstance();
    }
}
