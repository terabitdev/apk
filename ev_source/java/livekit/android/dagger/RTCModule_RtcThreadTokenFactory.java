package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.webrtc.PeerConnectionFactoryManager;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_RtcThreadTokenFactory implements c {
    private final rn.a peerConnectionFactoryManagerProvider;

    public RTCModule_RtcThreadTokenFactory(rn.a aVar) {
        this.peerConnectionFactoryManagerProvider = aVar;
    }

    public static RTCModule_RtcThreadTokenFactory create(rn.a aVar) {
        return new RTCModule_RtcThreadTokenFactory(aVar);
    }

    public static RTCThreadToken rtcThreadToken(PeerConnectionFactoryManager peerConnectionFactoryManager) {
        RTCThreadToken rtcThreadToken = RTCModule.INSTANCE.rtcThreadToken(peerConnectionFactoryManager);
        m0.n(rtcThreadToken);
        return rtcThreadToken;
    }

    @Override // rn.a
    public RTCThreadToken get() {
        return rtcThreadToken((PeerConnectionFactoryManager) this.peerConnectionFactoryManagerProvider.get());
    }
}
