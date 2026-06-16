package io.livekit.android.room.datastream.incoming;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class IncomingDataStreamManagerImpl_Factory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final IncomingDataStreamManagerImpl_Factory INSTANCE = new IncomingDataStreamManagerImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static IncomingDataStreamManagerImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IncomingDataStreamManagerImpl newInstance() {
        return new IncomingDataStreamManagerImpl();
    }

    @Override // rn.a
    public IncomingDataStreamManagerImpl get() {
        return newInstance();
    }
}
