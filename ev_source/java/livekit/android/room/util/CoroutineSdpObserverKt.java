package io.livekit.android.room.util;

import io.livekit.android.util.Either;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\b\u0010\u0007\u001a*\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Llivekit/org/webrtc/PeerConnection;", "Llivekit/org/webrtc/MediaConstraints;", "constraints", "Lio/livekit/android/util/Either;", "Llivekit/org/webrtc/SessionDescription;", "", "createOffer", "(Llivekit/org/webrtc/PeerConnection;Llivekit/org/webrtc/MediaConstraints;Lwn/c;)Ljava/lang/Object;", "createAnswer", "description", "Lsn/z;", "setRemoteDescription", "(Llivekit/org/webrtc/PeerConnection;Llivekit/org/webrtc/SessionDescription;Lwn/c;)Ljava/lang/Object;", "setLocalDescription", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CoroutineSdpObserverKt {
    public static final Object createAnswer(PeerConnection peerConnection, MediaConstraints mediaConstraints, c<? super Either<? extends SessionDescription, String>> cVar) {
        CoroutineSdpObserver coroutineSdpObserver = new CoroutineSdpObserver();
        peerConnection.createAnswer(coroutineSdpObserver, mediaConstraints);
        return coroutineSdpObserver.awaitCreate(cVar);
    }

    public static final Object createOffer(PeerConnection peerConnection, MediaConstraints mediaConstraints, c<? super Either<? extends SessionDescription, String>> cVar) {
        CoroutineSdpObserver coroutineSdpObserver = new CoroutineSdpObserver();
        peerConnection.createOffer(coroutineSdpObserver, mediaConstraints);
        return coroutineSdpObserver.awaitCreate(cVar);
    }

    public static final Object setLocalDescription(PeerConnection peerConnection, SessionDescription sessionDescription, c<? super Either<z, String>> cVar) {
        CoroutineSdpObserver coroutineSdpObserver = new CoroutineSdpObserver();
        peerConnection.setLocalDescription(coroutineSdpObserver, sessionDescription);
        return coroutineSdpObserver.awaitSet(cVar);
    }

    public static final Object setRemoteDescription(PeerConnection peerConnection, SessionDescription sessionDescription, c<? super Either<z, String>> cVar) {
        CoroutineSdpObserver coroutineSdpObserver = new CoroutineSdpObserver();
        peerConnection.setRemoteDescription(coroutineSdpObserver, sessionDescription);
        return coroutineSdpObserver.awaitSet(cVar);
    }
}
