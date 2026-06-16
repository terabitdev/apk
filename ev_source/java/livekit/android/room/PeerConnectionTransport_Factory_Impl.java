package io.livekit.android.room;

import io.livekit.android.room.PeerConnectionTransport;
import livekit.org.webrtc.PeerConnection;
import rn.a;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PeerConnectionTransport_Factory_Impl implements PeerConnectionTransport.Factory {
    private final C0061PeerConnectionTransport_Factory delegateFactory;

    public PeerConnectionTransport_Factory_Impl(C0061PeerConnectionTransport_Factory c0061PeerConnectionTransport_Factory) {
        this.delegateFactory = c0061PeerConnectionTransport_Factory;
    }

    public static a create(C0061PeerConnectionTransport_Factory c0061PeerConnectionTransport_Factory) {
        return d.a(new PeerConnectionTransport_Factory_Impl(c0061PeerConnectionTransport_Factory));
    }

    @Override // io.livekit.android.room.PeerConnectionTransport.Factory
    public PeerConnectionTransport create(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer, PeerConnectionTransport.Listener listener) {
        return this.delegateFactory.get(rTCConfiguration, observer, listener);
    }
}
