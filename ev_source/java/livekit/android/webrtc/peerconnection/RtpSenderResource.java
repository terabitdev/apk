package io.livekit.android.webrtc.peerconnection;

import ib.i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpSender;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/livekit/android/webrtc/peerconnection/RtpSenderResource;", "Lio/livekit/android/webrtc/peerconnection/PeerConnectionResource;", "Llivekit/org/webrtc/RtpSender;", "parentPeerConnection", "Llivekit/org/webrtc/PeerConnection;", "senderId", "", "rtcThreadToken", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "(Llivekit/org/webrtc/PeerConnection;Ljava/lang/String;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "get", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RtpSenderResource extends PeerConnectionResource<RtpSender> {
    private final RTCThreadToken rtcThreadToken;
    private final String senderId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtpSenderResource(PeerConnection peerConnection, String str, RTCThreadToken rTCThreadToken) {
        super(peerConnection);
        peerConnection.getClass();
        str.getClass();
        rTCThreadToken.getClass();
        this.senderId = str;
        this.rtcThreadToken = rTCThreadToken;
    }

    @Override // io.livekit.android.webrtc.peerconnection.PeerConnectionResource
    public RtpSender get() {
        final RTCThreadToken rTCThreadToken = this.rtcThreadToken;
        Object obj = null;
        if (!rTCThreadToken.isDisposed()) {
            if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                List<RtpSender> senders = getParentPeerConnection().getSenders();
                senders.getClass();
                Iterator<T> it = senders.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (m.c(((RtpSender) next).id(), this.senderId)) {
                        obj = next;
                        break;
                    }
                }
                obj = (RtpSender) obj;
            } else {
                obj = RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.webrtc.peerconnection.RtpSenderResource$get$$inlined$executeBlockingOnRTCThread$1
                    @Override // java.util.concurrent.Callable
                    public final RtpSender call() {
                        Object obj2 = null;
                        if (RTCThreadToken.this.isDisposed()) {
                            return null;
                        }
                        List<RtpSender> senders2 = this.getParentPeerConnection().getSenders();
                        senders2.getClass();
                        Iterator<T> it2 = senders2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            if (m.c(((RtpSender) next2).id(), this.senderId)) {
                                obj2 = next2;
                                break;
                            }
                        }
                        return (RtpSender) obj2;
                    }
                }).get();
            }
        }
        return (RtpSender) obj;
    }
}
