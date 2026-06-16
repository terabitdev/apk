package io.livekit.android.webrtc.peerconnection;

import io.livekit.android.webrtc.PeerConnectionFactoryManager;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/livekit/android/webrtc/peerconnection/RTCThreadTokenImpl;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "peerConnectionFactoryManager", "Lio/livekit/android/webrtc/PeerConnectionFactoryManager;", "(Lio/livekit/android/webrtc/PeerConnectionFactoryManager;)V", "isDisposed", "", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCThreadTokenImpl implements RTCThreadToken {
    private final PeerConnectionFactoryManager peerConnectionFactoryManager;

    public RTCThreadTokenImpl(PeerConnectionFactoryManager peerConnectionFactoryManager) {
        peerConnectionFactoryManager.getClass();
        this.peerConnectionFactoryManager = peerConnectionFactoryManager;
    }

    @Override // io.livekit.android.webrtc.peerconnection.RTCThreadToken
    public boolean isDisposed() {
        return this.peerConnectionFactoryManager.getIsDisposed();
    }
}
