package io.livekit.android.room.track;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ib.i;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.AudioTrackSink;
import livekit.org.webrtc.RtpReceiver;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0019B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lio/livekit/android/room/track/RemoteAudioTrack;", "Lio/livekit/android/room/track/AudioTrack;", "", DiagnosticsEntry.NAME_KEY, "Llivekit/org/webrtc/AudioTrack;", "rtcTrack", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Ljava/lang/String;Llivekit/org/webrtc/AudioTrack;Llivekit/org/webrtc/RtpReceiver;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Llivekit/org/webrtc/AudioTrackSink;", "sink", "Lsn/z;", "addSink", "(Llivekit/org/webrtc/AudioTrackSink;)V", "removeSink", "", "volume", "setVolume", "(D)V", "Llivekit/org/webrtc/RtpReceiver;", "getReceiver$livekit_android_sdk_release", "()Llivekit/org/webrtc/RtpReceiver;", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RemoteAudioTrack extends AudioTrack {
    private final RtpReceiver receiver;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lio/livekit/android/room/track/RemoteAudioTrack$Factory;", "", "create", "Lio/livekit/android/room/track/RemoteAudioTrack;", DiagnosticsEntry.NAME_KEY, "", "rtcTrack", "Llivekit/org/webrtc/AudioTrack;", "receiver", "Llivekit/org/webrtc/RtpReceiver;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        RemoteAudioTrack create(String name, livekit.org.webrtc.AudioTrack rtcTrack, RtpReceiver receiver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteAudioTrack(String str, livekit.org.webrtc.AudioTrack audioTrack, RtpReceiver rtpReceiver, RTCThreadToken rTCThreadToken) {
        super(str, audioTrack, rTCThreadToken);
        str.getClass();
        audioTrack.getClass();
        rtpReceiver.getClass();
        rTCThreadToken.getClass();
        this.receiver = rtpReceiver;
    }

    @Override // io.livekit.android.room.track.AudioTrack
    public void addSink(final AudioTrackSink sink) {
        sink.getClass();
        if (!isDisposed$livekit_android_sdk_release()) {
            final RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (!rtcThreadToken.isDisposed()) {
                if (!i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    ExecutorService executorService = RTCThreadUtilsKt.executor;
                    final z zVar = z.f31622a;
                    executorService.submit(new Callable() { // from class: io.livekit.android.room.track.RemoteAudioTrack$addSink$$inlined$withRTCTrack$livekit_android_sdk_release$1
                        /* JADX WARN: Type inference failed for: r0v8, types: [sn.z, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        public final z call() {
                            if (RTCThreadToken.this.isDisposed()) {
                                return null;
                            }
                            if (this.isDisposed$livekit_android_sdk_release()) {
                                return zVar;
                            }
                            this.getRtcTrack();
                            this.getRtcTrack().addSink(sink);
                            return z.f31622a;
                        }
                    }).get();
                } else {
                    if (isDisposed$livekit_android_sdk_release()) {
                        return;
                    }
                    getRtcTrack();
                    getRtcTrack().addSink(sink);
                }
            }
        }
    }

    /* renamed from: getReceiver$livekit_android_sdk_release, reason: from getter */
    public final RtpReceiver getReceiver() {
        return this.receiver;
    }

    @Override // io.livekit.android.room.track.AudioTrack
    public void removeSink(final AudioTrackSink sink) {
        sink.getClass();
        if (!isDisposed$livekit_android_sdk_release()) {
            final RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (!rtcThreadToken.isDisposed()) {
                if (!i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    ExecutorService executorService = RTCThreadUtilsKt.executor;
                    final z zVar = z.f31622a;
                    executorService.submit(new Callable() { // from class: io.livekit.android.room.track.RemoteAudioTrack$removeSink$$inlined$withRTCTrack$livekit_android_sdk_release$1
                        /* JADX WARN: Type inference failed for: r0v8, types: [sn.z, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        public final z call() {
                            if (RTCThreadToken.this.isDisposed()) {
                                return null;
                            }
                            if (this.isDisposed$livekit_android_sdk_release()) {
                                return zVar;
                            }
                            this.getRtcTrack();
                            this.getRtcTrack().removeSink(sink);
                            return z.f31622a;
                        }
                    }).get();
                } else {
                    if (isDisposed$livekit_android_sdk_release()) {
                        return;
                    }
                    getRtcTrack();
                    getRtcTrack().removeSink(sink);
                }
            }
        }
    }

    public final void setVolume(final double volume) {
        if (!isDisposed$livekit_android_sdk_release()) {
            final RTCThreadToken rtcThreadToken = getRtcThreadToken();
            if (!rtcThreadToken.isDisposed()) {
                if (!i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    ExecutorService executorService = RTCThreadUtilsKt.executor;
                    final z zVar = z.f31622a;
                    executorService.submit(new Callable() { // from class: io.livekit.android.room.track.RemoteAudioTrack$setVolume$$inlined$withRTCTrack$livekit_android_sdk_release$1
                        /* JADX WARN: Type inference failed for: r0v8, types: [sn.z, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        public final z call() {
                            if (RTCThreadToken.this.isDisposed()) {
                                return null;
                            }
                            if (this.isDisposed$livekit_android_sdk_release()) {
                                return zVar;
                            }
                            this.getRtcTrack();
                            this.getRtcTrack().setVolume(volume);
                            return z.f31622a;
                        }
                    }).get();
                } else {
                    if (isDisposed$livekit_android_sdk_release()) {
                        return;
                    }
                    getRtcTrack();
                    getRtcTrack().setVolume(volume);
                }
            }
        }
    }
}
