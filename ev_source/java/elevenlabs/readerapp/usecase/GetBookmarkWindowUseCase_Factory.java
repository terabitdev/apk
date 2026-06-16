package io.elevenlabs.readerapp.usecase;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class GetBookmarkWindowUseCase_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        static final GetBookmarkWindowUseCase_Factory INSTANCE = new GetBookmarkWindowUseCase_Factory();

        private InstanceHolder() {
        }
    }

    public static GetBookmarkWindowUseCase_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GetBookmarkWindowUseCase newInstance() {
        return new GetBookmarkWindowUseCase();
    }

    @Override // rn.a
    public GetBookmarkWindowUseCase get() {
        return newInstance();
    }
}
