package io.livekit.android.webrtc.peerconnection;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lio/livekit/android/webrtc/peerconnection/PeerConnectionResource;", TokenNames.T, "", "parentPeerConnection", "Llivekit/org/webrtc/PeerConnection;", "(Llivekit/org/webrtc/PeerConnection;)V", "getParentPeerConnection", "()Llivekit/org/webrtc/PeerConnection;", "get", "()Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class PeerConnectionResource<T> {
    private final PeerConnection parentPeerConnection;

    public PeerConnectionResource(PeerConnection peerConnection) {
        peerConnection.getClass();
        this.parentPeerConnection = peerConnection;
    }

    public abstract T get();

    public final PeerConnection getParentPeerConnection() {
        return this.parentPeerConnection;
    }
}
