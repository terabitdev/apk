package io.livekit.android.dagger;

import androidx.room.m0;
import livekit.org.webrtc.EglBase;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_EglContextFactory implements c {
    private final rn.a eglBaseProvider;

    public RTCModule_EglContextFactory(rn.a aVar) {
        this.eglBaseProvider = aVar;
    }

    public static RTCModule_EglContextFactory create(rn.a aVar) {
        return new RTCModule_EglContextFactory(aVar);
    }

    public static EglBase.Context eglContext(EglBase eglBase) {
        EglBase.Context eglContext = RTCModule.INSTANCE.eglContext(eglBase);
        m0.n(eglContext);
        return eglContext;
    }

    @Override // rn.a
    public EglBase.Context get() {
        return eglContext((EglBase) this.eglBaseProvider.get());
    }
}
