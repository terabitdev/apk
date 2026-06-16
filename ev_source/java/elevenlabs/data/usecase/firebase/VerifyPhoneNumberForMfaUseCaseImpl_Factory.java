package io.elevenlabs.data.usecase.firebase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class VerifyPhoneNumberForMfaUseCaseImpl_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final VerifyPhoneNumberForMfaUseCaseImpl_Factory INSTANCE = new VerifyPhoneNumberForMfaUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static VerifyPhoneNumberForMfaUseCaseImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VerifyPhoneNumberForMfaUseCaseImpl newInstance() {
        return new VerifyPhoneNumberForMfaUseCaseImpl();
    }

    @Override // rn.a
    public VerifyPhoneNumberForMfaUseCaseImpl get() {
        return newInstance();
    }
}
