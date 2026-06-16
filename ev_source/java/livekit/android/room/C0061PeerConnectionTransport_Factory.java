package io.livekit.android.room;

import b.i;
import fr.z;
import io.livekit.android.room.PeerConnectionTransport;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.PeerConnectionFactory;
import rn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.PeerConnectionTransport_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0061PeerConnectionTransport_Factory {
    private final a connectionFactoryProvider;
    private final a ioDispatcherProvider;
    private final a rtcThreadTokenProvider;
    private final a sdpFactoryProvider;

    public C0061PeerConnectionTransport_Factory(a aVar, a aVar2, a aVar3, a aVar4) {
        this.ioDispatcherProvider = aVar;
        this.connectionFactoryProvider = aVar2;
        this.sdpFactoryProvider = aVar3;
        this.rtcThreadTokenProvider = aVar4;
    }

    public static C0061PeerConnectionTransport_Factory create(a aVar, a aVar2, a aVar3, a aVar4) {
        return new C0061PeerConnectionTransport_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static PeerConnectionTransport newInstance(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer, PeerConnectionTransport.Listener listener, z zVar, PeerConnectionFactory peerConnectionFactory, i iVar, RTCThreadToken rTCThreadToken) {
        return new PeerConnectionTransport(rTCConfiguration, observer, listener, zVar, peerConnectionFactory, iVar, rTCThreadToken);
    }

    public PeerConnectionTransport get(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer, PeerConnectionTransport.Listener listener) {
        return newInstance(rTCConfiguration, observer, listener, (z) this.ioDispatcherProvider.get(), (PeerConnectionFactory) this.connectionFactoryProvider.get(), (i) this.sdpFactoryProvider.get(), (RTCThreadToken) this.rtcThreadTokenProvider.get());
    }
}
