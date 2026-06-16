package io.livekit.android.room.track.video;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoSink;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0017j\b\u0012\u0004\u0012\u00020\u0001`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0017j\b\u0012\u0004\u0012\u00020\t`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/livekit/android/room/track/video/CaptureDispatchObserver;", "Llivekit/org/webrtc/CapturerObserver;", "<init>", "()V", "observer", "Lsn/z;", "registerObserver", "(Llivekit/org/webrtc/CapturerObserver;)V", "unregisterObserver", "Llivekit/org/webrtc/VideoSink;", "sink", "registerSink", "(Llivekit/org/webrtc/VideoSink;)V", "unregisterSink", "", FirebaseAnalytics.Param.SUCCESS, "onCapturerStarted", "(Z)V", "onCapturerStopped", "Llivekit/org/webrtc/VideoFrame;", "frame", "onFrameCaptured", "(Llivekit/org/webrtc/VideoFrame;)V", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "observers", "Ljava/util/LinkedHashSet;", "sinks", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CaptureDispatchObserver implements CapturerObserver {
    private final LinkedHashSet<CapturerObserver> observers = new LinkedHashSet<>();
    private final LinkedHashSet<VideoSink> sinks = new LinkedHashSet<>();

    @Override // livekit.org.webrtc.CapturerObserver
    public synchronized void onCapturerStarted(boolean success) {
        Iterator<CapturerObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onCapturerStarted(success);
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public synchronized void onCapturerStopped() {
        Iterator<CapturerObserver> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().onCapturerStopped();
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public synchronized void onFrameCaptured(VideoFrame frame) {
        try {
            frame.getClass();
            Iterator<CapturerObserver> it = this.observers.iterator();
            while (it.hasNext()) {
                it.next().onFrameCaptured(frame);
            }
            Iterator<VideoSink> it2 = this.sinks.iterator();
            while (it2.hasNext()) {
                it2.next().onFrame(frame);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void registerObserver(CapturerObserver observer) {
        observer.getClass();
        this.observers.add(observer);
    }

    public final synchronized void registerSink(VideoSink sink) {
        sink.getClass();
        this.sinks.add(sink);
    }

    public final synchronized void unregisterObserver(CapturerObserver observer) {
        observer.getClass();
        this.observers.remove(observer);
    }

    public final synchronized void unregisterSink(VideoSink sink) {
        sink.getClass();
        this.sinks.remove(sink);
    }
}
