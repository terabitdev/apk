package io.elevenlabs.di;

import androidx.lifecycle.b0;
import androidx.room.m0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class LifecycleModule_ProvideProcessLifecycleFactory implements ul.c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final LifecycleModule_ProvideProcessLifecycleFactory INSTANCE = new LifecycleModule_ProvideProcessLifecycleFactory();

        private InstanceHolder() {
        }
    }

    public static LifecycleModule_ProvideProcessLifecycleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static b0 provideProcessLifecycle() {
        b0 provideProcessLifecycle = LifecycleModule.INSTANCE.provideProcessLifecycle();
        m0.n(provideProcessLifecycle);
        return provideProcessLifecycle;
    }

    @Override // rn.a
    public b0 get() {
        return provideProcessLifecycle();
    }
}
