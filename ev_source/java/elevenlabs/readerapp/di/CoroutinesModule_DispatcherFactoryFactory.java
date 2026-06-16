package io.elevenlabs.readerapp.di;

import androidx.room.m0;
import io.elevenlabs.domain.DispatcherFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CoroutinesModule_DispatcherFactoryFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final CoroutinesModule_DispatcherFactoryFactory INSTANCE = new CoroutinesModule_DispatcherFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static CoroutinesModule_DispatcherFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DispatcherFactory dispatcherFactory() {
        DispatcherFactory dispatcherFactory = CoroutinesModule.INSTANCE.dispatcherFactory();
        m0.n(dispatcherFactory);
        return dispatcherFactory;
    }

    @Override // rn.a
    public DispatcherFactory get() {
        return dispatcherFactory();
    }
}
