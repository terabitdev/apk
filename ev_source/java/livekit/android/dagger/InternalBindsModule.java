package io.livekit.android.dagger;

import io.livekit.android.room.datastream.incoming.IncomingDataStreamManager;
import io.livekit.android.room.datastream.incoming.IncomingDataStreamManagerImpl;
import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager;
import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManagerImpl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lio/livekit/android/dagger/InternalBindsModule;", "", "()V", "incomingDataStreamManager", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;", "manager", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManagerImpl;", "outgoingDataStreamManager", "Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManager;", "Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManagerImpl;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class InternalBindsModule {
    public abstract IncomingDataStreamManager incomingDataStreamManager(IncomingDataStreamManagerImpl manager);

    public abstract OutgoingDataStreamManager outgoingDataStreamManager(OutgoingDataStreamManagerImpl manager);
}
