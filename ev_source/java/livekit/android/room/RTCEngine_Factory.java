package io.livekit.android.room;

import fr.z;
import io.livekit.android.e2ee.DataPacketCryptorManager;
import io.livekit.android.room.PeerConnectionTransport;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import rn.a;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCEngine_Factory implements c {
    private final a clientProvider;
    private final a dataPacketCryptorFactoryProvider;
    private final a ioDispatcherProvider;
    private final a pctFactoryProvider;
    private final a rtcThreadTokenProvider;

    public RTCEngine_Factory(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.clientProvider = aVar;
        this.pctFactoryProvider = aVar2;
        this.ioDispatcherProvider = aVar3;
        this.rtcThreadTokenProvider = aVar4;
        this.dataPacketCryptorFactoryProvider = aVar5;
    }

    public static RTCEngine_Factory create(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new RTCEngine_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static RTCEngine newInstance(SignalClient signalClient, PeerConnectionTransport.Factory factory, z zVar, RTCThreadToken rTCThreadToken, DataPacketCryptorManager.Factory factory2) {
        return new RTCEngine(signalClient, factory, zVar, rTCThreadToken, factory2);
    }

    @Override // rn.a
    public RTCEngine get() {
        return newInstance((SignalClient) this.clientProvider.get(), (PeerConnectionTransport.Factory) this.pctFactoryProvider.get(), (z) this.ioDispatcherProvider.get(), (RTCThreadToken) this.rtcThreadTokenProvider.get(), (DataPacketCryptorManager.Factory) this.dataPacketCryptorFactoryProvider.get());
    }
}
