package io.elevenlabs.data.usecase.firebase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ResolveTotpMfaUseCaseImpl_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final ResolveTotpMfaUseCaseImpl_Factory INSTANCE = new ResolveTotpMfaUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static ResolveTotpMfaUseCaseImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ResolveTotpMfaUseCaseImpl newInstance() {
        return new ResolveTotpMfaUseCaseImpl();
    }

    @Override // rn.a
    public ResolveTotpMfaUseCaseImpl get() {
        return newInstance();
    }
}
