package io.elevenlabs.data.usecase.firebase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ResolveMultiFactorAuthUseCaseImpl_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final ResolveMultiFactorAuthUseCaseImpl_Factory INSTANCE = new ResolveMultiFactorAuthUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static ResolveMultiFactorAuthUseCaseImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ResolveMultiFactorAuthUseCaseImpl newInstance() {
        return new ResolveMultiFactorAuthUseCaseImpl();
    }

    @Override // rn.a
    public ResolveMultiFactorAuthUseCaseImpl get() {
        return newInstance();
    }
}
