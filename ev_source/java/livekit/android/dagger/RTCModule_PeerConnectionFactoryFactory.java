package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.webrtc.PeerConnectionFactoryManager;
import livekit.org.webrtc.PeerConnectionFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_PeerConnectionFactoryFactory implements c {
    private final rn.a peerConnectionFactoryManagerProvider;

    public RTCModule_PeerConnectionFactoryFactory(rn.a aVar) {
        this.peerConnectionFactoryManagerProvider = aVar;
    }

    public static RTCModule_PeerConnectionFactoryFactory create(rn.a aVar) {
        return new RTCModule_PeerConnectionFactoryFactory(aVar);
    }

    public static PeerConnectionFactory peerConnectionFactory(PeerConnectionFactoryManager peerConnectionFactoryManager) {
        PeerConnectionFactory peerConnectionFactory = RTCModule.INSTANCE.peerConnectionFactory(peerConnectionFactoryManager);
        m0.n(peerConnectionFactory);
        return peerConnectionFactory;
    }

    @Override // rn.a
    public PeerConnectionFactory get() {
        return peerConnectionFactory((PeerConnectionFactoryManager) this.peerConnectionFactoryManagerProvider.get());
    }
}
