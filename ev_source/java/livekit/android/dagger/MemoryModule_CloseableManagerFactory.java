package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.memory.CloseableManager;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class MemoryModule_CloseableManagerFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final MemoryModule_CloseableManagerFactory INSTANCE = new MemoryModule_CloseableManagerFactory();

        private InstanceHolder() {
        }
    }

    public static CloseableManager closeableManager() {
        CloseableManager closeableManager = MemoryModule.INSTANCE.closeableManager();
        m0.n(closeableManager);
        return closeableManager;
    }

    public static MemoryModule_CloseableManagerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    @Override // rn.a
    public CloseableManager get() {
        return closeableManager();
    }
}
