package io.livekit.android.e2ee;

import io.livekit.android.e2ee.DataPacketCryptorManager;
import livekit.org.webrtc.PeerConnectionFactory;
import rn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.e2ee.E2EEManager_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0060E2EEManager_Factory {
    private final a dataPacketCryptorManagerFactoryProvider;
    private final a peerConnectionFactoryProvider;

    public C0060E2EEManager_Factory(a aVar, a aVar2) {
        this.peerConnectionFactoryProvider = aVar;
        this.dataPacketCryptorManagerFactoryProvider = aVar2;
    }

    public static C0060E2EEManager_Factory create(a aVar, a aVar2) {
        return new C0060E2EEManager_Factory(aVar, aVar2);
    }

    public static E2EEManager newInstance(KeyProvider keyProvider, PeerConnectionFactory peerConnectionFactory, DataPacketCryptorManager.Factory factory) {
        return new E2EEManager(keyProvider, peerConnectionFactory, factory);
    }

    public E2EEManager get(KeyProvider keyProvider) {
        return newInstance(keyProvider, (PeerConnectionFactory) this.peerConnectionFactoryProvider.get(), (DataPacketCryptorManager.Factory) this.dataPacketCryptorManagerFactoryProvider.get());
    }
}
