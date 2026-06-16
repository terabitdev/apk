package io.elevenlabs.data.usecase.firebase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DetermineMfaTypeUseCaseImpl_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final DetermineMfaTypeUseCaseImpl_Factory INSTANCE = new DetermineMfaTypeUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static DetermineMfaTypeUseCaseImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DetermineMfaTypeUseCaseImpl newInstance() {
        return new DetermineMfaTypeUseCaseImpl();
    }

    @Override // rn.a
    public DetermineMfaTypeUseCaseImpl get() {
        return newInstance();
    }
}
