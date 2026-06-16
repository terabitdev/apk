package io.livekit.android.room.datastream.outgoing;

import io.livekit.android.room.RTCEngine;
import rn.a;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OutgoingDataStreamManagerImpl_Factory implements c {
    private final a engineProvider;

    public OutgoingDataStreamManagerImpl_Factory(a aVar) {
        this.engineProvider = aVar;
    }

    public static OutgoingDataStreamManagerImpl_Factory create(a aVar) {
        return new OutgoingDataStreamManagerImpl_Factory(aVar);
    }

    public static OutgoingDataStreamManagerImpl newInstance(RTCEngine rTCEngine) {
        return new OutgoingDataStreamManagerImpl(rTCEngine);
    }

    @Override // rn.a
    public OutgoingDataStreamManagerImpl get() {
        return newInstance((RTCEngine) this.engineProvider.get());
    }
}
