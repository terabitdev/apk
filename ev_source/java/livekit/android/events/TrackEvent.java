package io.livekit.android.events;

import io.livekit.android.room.track.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/TrackEvent;", "Lio/livekit/android/events/Event;", "track", "Lio/livekit/android/room/track/Track;", "(Lio/livekit/android/room/track/Track;)V", "getTrack", "()Lio/livekit/android/room/track/Track;", "StreamStateChanged", "VideoDimensionsChanged", "VisibilityChanged", "Lio/livekit/android/events/TrackEvent$StreamStateChanged;", "Lio/livekit/android/events/TrackEvent$VideoDimensionsChanged;", "Lio/livekit/android/events/TrackEvent$VisibilityChanged;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class TrackEvent extends Event {
    private final Track track;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/TrackEvent$StreamStateChanged;", "Lio/livekit/android/events/TrackEvent;", "track", "Lio/livekit/android/room/track/Track;", "streamState", "Lio/livekit/android/room/track/Track$StreamState;", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/Track$StreamState;)V", "getStreamState", "()Lio/livekit/android/room/track/Track$StreamState;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class StreamStateChanged extends TrackEvent {
        private final Track.StreamState streamState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreamStateChanged(Track track, Track.StreamState streamState) {
            super(track, null);
            track.getClass();
            streamState.getClass();
            this.streamState = streamState;
        }

        public final Track.StreamState getStreamState() {
            return this.streamState;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/TrackEvent$VideoDimensionsChanged;", "Lio/livekit/android/events/TrackEvent;", "track", "Lio/livekit/android/room/track/Track;", "newDimensions", "Lio/livekit/android/room/track/Track$Dimensions;", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/Track$Dimensions;)V", "getNewDimensions", "()Lio/livekit/android/room/track/Track$Dimensions;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class VideoDimensionsChanged extends TrackEvent {
        private final Track.Dimensions newDimensions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoDimensionsChanged(Track track, Track.Dimensions dimensions) {
            super(track, null);
            track.getClass();
            dimensions.getClass();
            this.newDimensions = dimensions;
        }

        public final Track.Dimensions getNewDimensions() {
            return this.newDimensions;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/events/TrackEvent$VisibilityChanged;", "Lio/livekit/android/events/TrackEvent;", "track", "Lio/livekit/android/room/track/Track;", "isVisible", "", "(Lio/livekit/android/room/track/Track;Z)V", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class VisibilityChanged extends TrackEvent {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(Track track, boolean z6) {
            super(track, null);
            track.getClass();
            this.isVisible = z6;
        }

        /* renamed from: isVisible, reason: from getter */
        public final boolean getIsVisible() {
            return this.isVisible;
        }
    }

    private TrackEvent(Track track) {
        super(null);
        this.track = track;
    }

    public final Track getTrack() {
        return this.track;
    }

    public /* synthetic */ TrackEvent(Track track, f fVar) {
        this(track);
    }
}
