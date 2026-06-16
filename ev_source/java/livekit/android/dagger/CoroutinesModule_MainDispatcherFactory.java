package io.livekit.android.dagger;

import androidx.room.m0;
import fr.y1;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class CoroutinesModule_MainDispatcherFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final CoroutinesModule_MainDispatcherFactory INSTANCE = new CoroutinesModule_MainDispatcherFactory();

        private InstanceHolder() {
        }
    }

    public static CoroutinesModule_MainDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static y1 mainDispatcher() {
        y1 mainDispatcher = CoroutinesModule.INSTANCE.mainDispatcher();
        m0.n(mainDispatcher);
        return mainDispatcher;
    }

    @Override // rn.a
    public y1 get() {
        return mainDispatcher();
    }
}
