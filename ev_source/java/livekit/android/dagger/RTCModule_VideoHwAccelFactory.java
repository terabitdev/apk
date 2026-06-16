package io.livekit.android.dagger;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_VideoHwAccelFactory implements c {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes4.dex */
    public static final class InstanceHolder {
        private static final RTCModule_VideoHwAccelFactory INSTANCE = new RTCModule_VideoHwAccelFactory();

        private InstanceHolder() {
        }
    }

    public static RTCModule_VideoHwAccelFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean videoHwAccel() {
        return RTCModule.INSTANCE.videoHwAccel();
    }

    @Override // rn.a
    public Boolean get() {
        return Boolean.valueOf(videoHwAccel());
    }
}
