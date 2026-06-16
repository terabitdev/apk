package io.livekit.android.room.track.video;

import io.livekit.android.room.track.Track;
import java.util.Observable;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\u0003¨\u0006\r"}, d2 = {"Lio/livekit/android/room/track/video/VideoSinkVisibility;", "Ljava/util/Observable;", "<init>", "()V", "", "isVisible", "()Z", "Lio/livekit/android/room/track/Track$Dimensions;", "size", "()Lio/livekit/android/room/track/Track$Dimensions;", "Lsn/z;", "notifyChanged", "close", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class VideoSinkVisibility extends Observable {
    public void close() {
        deleteObservers();
    }

    public abstract boolean isVisible();

    public final void notifyChanged() {
        setChanged();
        notifyObservers();
    }

    public abstract Track.Dimensions size();
}
