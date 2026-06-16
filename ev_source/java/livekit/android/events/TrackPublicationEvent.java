package io.livekit.android.events;

import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.room.types.TranscriptionSegment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/TrackPublicationEvent;", "Lio/livekit/android/events/Event;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "(Lio/livekit/android/room/track/TrackPublication;)V", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "TranscriptionReceived", "Lio/livekit/android/events/TrackPublicationEvent$TranscriptionReceived;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class TrackPublicationEvent extends Event {
    private final TrackPublication publication;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/livekit/android/events/TrackPublicationEvent$TranscriptionReceived;", "Lio/livekit/android/events/TrackPublicationEvent;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "transcriptions", "", "Lio/livekit/android/room/types/TranscriptionSegment;", "(Lio/livekit/android/room/track/TrackPublication;Ljava/util/List;)V", "getTranscriptions", "()Ljava/util/List;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TranscriptionReceived extends TrackPublicationEvent {
        private final List<TranscriptionSegment> transcriptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranscriptionReceived(TrackPublication trackPublication, List<TranscriptionSegment> list) {
            super(trackPublication, null);
            trackPublication.getClass();
            list.getClass();
            this.transcriptions = list;
        }

        public final List<TranscriptionSegment> getTranscriptions() {
            return this.transcriptions;
        }
    }

    private TrackPublicationEvent(TrackPublication trackPublication) {
        super(null);
        this.publication = trackPublication;
    }

    public final TrackPublication getPublication() {
        return this.publication;
    }

    public /* synthetic */ TrackPublicationEvent(TrackPublication trackPublication, f fVar) {
        this(trackPublication);
    }
}
