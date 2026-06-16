package io.livekit.android.dagger;

import androidx.room.m0;
import b.i;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_SdpFactoryFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final RTCModule_SdpFactoryFactory INSTANCE = new RTCModule_SdpFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static RTCModule_SdpFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static i sdpFactory() {
        i sdpFactory = RTCModule.INSTANCE.sdpFactory();
        m0.n(sdpFactory);
        return sdpFactory;
    }

    @Override // rn.a
    public i get() {
        return sdpFactory();
    }
}
