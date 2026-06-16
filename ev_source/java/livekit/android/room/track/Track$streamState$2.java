package io.livekit.android.room.track;

import ho.p;
import io.livekit.android.events.TrackEvent;
import io.livekit.android.room.track.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/livekit/android/room/track/Track$StreamState;", "newValue", "oldValue", "Lsn/z;", "invoke", "(Lio/livekit/android/room/track/Track$StreamState;Lio/livekit/android/room/track/Track$StreamState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Track$streamState$2 extends n implements p {
    final /* synthetic */ Track this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Track$streamState$2(Track track) {
        super(2);
        this.this$0 = track;
    }

    public final void invoke(Track.StreamState streamState, Track.StreamState streamState2) {
        streamState.getClass();
        streamState2.getClass();
        if (streamState != streamState2) {
            this.this$0.getEventBus().tryPostEvent(new TrackEvent.StreamStateChanged(this.this$0, streamState));
        }
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Track.StreamState) obj, (Track.StreamState) obj2);
        return z.f31622a;
    }
}
