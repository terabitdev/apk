package io.livekit.android.room.track;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ib.i;
import io.livekit.android.room.track.Track;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.VideoSink;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/livekit/android/room/track/VideoTrack;", "Lio/livekit/android/room/track/Track;", "", DiagnosticsEntry.NAME_KEY, "Llivekit/org/webrtc/VideoTrack;", "rtcTrack", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Ljava/lang/String;Llivekit/org/webrtc/VideoTrack;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Llivekit/org/webrtc/VideoSink;", "renderer", "Lsn/z;", "addRenderer", "(Llivekit/org/webrtc/VideoSink;)V", "removeRenderer", "stop", "()V", "Llivekit/org/webrtc/VideoTrack;", "getRtcTrack", "()Llivekit/org/webrtc/VideoTrack;", "", "sinks", "Ljava/util/List;", "getSinks", "()Ljava/util/List;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class VideoTrack extends Track {
    private final livekit.org.webrtc.VideoTrack rtcTrack;
    private final List<VideoSink> sinks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTrack(String str, livekit.org.webrtc.VideoTrack videoTrack, RTCThreadToken rTCThreadToken) {
        super(str, Track.Kind.VIDEO, videoTrack, rTCThreadToken);
        str.getClass();
        videoTrack.getClass();
        rTCThreadToken.getClass();
        this.rtcTrack = videoTrack;
        this.sinks = new ArrayList();
    }

    public void addRenderer(final VideoSink renderer) {
        renderer.getClass();
        if (!isDisposed$livekit_android_sdk_release()) {
            final RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (!rtcThreadToken.isDisposed()) {
                if (!i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    ExecutorService executorService = RTCThreadUtilsKt.executor;
                    final z zVar = z.f31622a;
                    executorService.submit(new Callable() { // from class: io.livekit.android.room.track.VideoTrack$addRenderer$$inlined$withRTCTrack$livekit_android_sdk_release$1
                        /* JADX WARN: Type inference failed for: r0v10, types: [sn.z, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        public final z call() {
                            if (RTCThreadToken.this.isDisposed()) {
                                return null;
                            }
                            if (this.isDisposed$livekit_android_sdk_release()) {
                                return zVar;
                            }
                            this.getRtcTrack();
                            this.getSinks().add(renderer);
                            this.getRtcTrack().addSink(renderer);
                            return z.f31622a;
                        }
                    }).get();
                } else {
                    if (isDisposed$livekit_android_sdk_release()) {
                        return;
                    }
                    getRtcTrack();
                    getSinks().add(renderer);
                    getRtcTrack().addSink(renderer);
                }
            }
        }
    }

    public final List<VideoSink> getSinks() {
        return this.sinks;
    }

    public void removeRenderer(final VideoSink renderer) {
        renderer.getClass();
        final RTCThreadToken rtcThreadToken = getRtcThreadToken();
        if (rtcThreadToken.isDisposed()) {
            return;
        }
        if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
            if (!isDisposed$livekit_android_sdk_release()) {
                getRtcTrack().removeSink(renderer);
            }
            getSinks().remove(renderer);
            return;
        }
        RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.track.VideoTrack$removeRenderer$$inlined$executeBlockingOnRTCThread$1
            @Override // java.util.concurrent.Callable
            public final Boolean call() {
                if (RTCThreadToken.this.isDisposed()) {
                    return null;
                }
                if (!this.isDisposed$livekit_android_sdk_release()) {
                    this.getRtcTrack().removeSink(renderer);
                }
                return Boolean.valueOf(this.getSinks().remove(renderer));
            }
        }).get();
    }

    @Override // io.livekit.android.room.track.Track
    public void stop() {
        final RTCThreadToken rtcThreadToken = getRtcThreadToken();
        if (!rtcThreadToken.isDisposed()) {
            if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                if (!isDisposed$livekit_android_sdk_release()) {
                    Iterator<VideoSink> it = getSinks().iterator();
                    while (it.hasNext()) {
                        getRtcTrack().removeSink(it.next());
                    }
                }
                getSinks().clear();
            } else {
                RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.track.VideoTrack$stop$$inlined$executeBlockingOnRTCThread$1
                    @Override // java.util.concurrent.Callable
                    public final z call() {
                        if (RTCThreadToken.this.isDisposed()) {
                            return null;
                        }
                        if (!this.isDisposed$livekit_android_sdk_release()) {
                            Iterator<VideoSink> it2 = this.getSinks().iterator();
                            while (it2.hasNext()) {
                                this.getRtcTrack().removeSink(it2.next());
                            }
                        }
                        this.getSinks().clear();
                        return z.f31622a;
                    }
                }).get();
            }
        }
        super.stop();
    }

    @Override // io.livekit.android.room.track.Track
    public livekit.org.webrtc.VideoTrack getRtcTrack() {
        return this.rtcTrack;
    }
}
