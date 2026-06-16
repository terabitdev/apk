package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.e2ee.DataPacketCryptorManager;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_DataPacketCryptorManagerFactoryFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final RTCModule_DataPacketCryptorManagerFactoryFactory INSTANCE = new RTCModule_DataPacketCryptorManagerFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static RTCModule_DataPacketCryptorManagerFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DataPacketCryptorManager.Factory dataPacketCryptorManagerFactory() {
        DataPacketCryptorManager.Factory dataPacketCryptorManagerFactory = RTCModule.INSTANCE.dataPacketCryptorManagerFactory();
        m0.n(dataPacketCryptorManagerFactory);
        return dataPacketCryptorManagerFactory;
    }

    @Override // rn.a
    public DataPacketCryptorManager.Factory get() {
        return dataPacketCryptorManagerFactory();
    }
}
