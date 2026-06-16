package io.livekit.android.dagger;

import androidx.room.m0;
import fr.z;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class CoroutinesModule_IoDispatcherFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final CoroutinesModule_IoDispatcherFactory INSTANCE = new CoroutinesModule_IoDispatcherFactory();

        private InstanceHolder() {
        }
    }

    public static CoroutinesModule_IoDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static z ioDispatcher() {
        z ioDispatcher = CoroutinesModule.INSTANCE.ioDispatcher();
        m0.n(ioDispatcher);
        return ioDispatcher;
    }

    @Override // rn.a
    public z get() {
        return ioDispatcher();
    }
}
