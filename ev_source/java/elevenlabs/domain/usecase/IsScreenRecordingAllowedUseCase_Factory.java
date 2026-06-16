package io.elevenlabs.domain.usecase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class IsScreenRecordingAllowedUseCase_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final IsScreenRecordingAllowedUseCase_Factory INSTANCE = new IsScreenRecordingAllowedUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static IsScreenRecordingAllowedUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IsScreenRecordingAllowedUseCase newInstance() {
        return new IsScreenRecordingAllowedUseCase();
    }

    @Override // rn.a
    public IsScreenRecordingAllowedUseCase get() {
        return newInstance();
    }
}
