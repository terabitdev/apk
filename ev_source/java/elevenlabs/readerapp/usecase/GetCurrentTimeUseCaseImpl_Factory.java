package io.elevenlabs.readerapp.usecase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class GetCurrentTimeUseCaseImpl_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        static final GetCurrentTimeUseCaseImpl_Factory INSTANCE = new GetCurrentTimeUseCaseImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static GetCurrentTimeUseCaseImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GetCurrentTimeUseCaseImpl newInstance() {
        return new GetCurrentTimeUseCaseImpl();
    }

    @Override // rn.a
    public GetCurrentTimeUseCaseImpl get() {
        return newInstance();
    }
}
