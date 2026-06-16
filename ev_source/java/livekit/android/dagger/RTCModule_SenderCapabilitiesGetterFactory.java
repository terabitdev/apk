package io.livekit.android.dagger;

import androidx.room.m0;
import ho.l;
import livekit.org.webrtc.PeerConnectionFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_SenderCapabilitiesGetterFactory implements c {
    private final rn.a peerConnectionFactoryProvider;

    public RTCModule_SenderCapabilitiesGetterFactory(rn.a aVar) {
        this.peerConnectionFactoryProvider = aVar;
    }

    public static RTCModule_SenderCapabilitiesGetterFactory create(rn.a aVar) {
        return new RTCModule_SenderCapabilitiesGetterFactory(aVar);
    }

    public static l senderCapabilitiesGetter(PeerConnectionFactory peerConnectionFactory) {
        l senderCapabilitiesGetter = RTCModule.INSTANCE.senderCapabilitiesGetter(peerConnectionFactory);
        m0.n(senderCapabilitiesGetter);
        return senderCapabilitiesGetter;
    }

    @Override // rn.a
    public l get() {
        return senderCapabilitiesGetter((PeerConnectionFactory) this.peerConnectionFactoryProvider.get());
    }
}
