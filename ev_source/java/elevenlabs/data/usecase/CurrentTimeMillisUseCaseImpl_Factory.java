package io.elevenlabs.data.usecase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CurrentTimeMillisUseCaseImpl_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final CurrentTimeMillisUseCaseImpl_Factory INSTANCE = new CurrentTimeMillisUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static CurrentTimeMillisUseCaseImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CurrentTimeMillisUseCaseImpl newInstance() {
        return new CurrentTimeMillisUseCaseImpl();
    }

    @Override // rn.a
    public CurrentTimeMillisUseCaseImpl get() {
        return newInstance();
    }
}
