package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.memory.CloseableManager;
import livekit.org.webrtc.EglBase;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_EglBaseFactory implements c {
    private final rn.a eglBaseOverrideProvider;
    private final rn.a memoryManagerProvider;

    public RTCModule_EglBaseFactory(rn.a aVar, rn.a aVar2) {
        this.eglBaseOverrideProvider = aVar;
        this.memoryManagerProvider = aVar2;
    }

    public static RTCModule_EglBaseFactory create(rn.a aVar, rn.a aVar2) {
        return new RTCModule_EglBaseFactory(aVar, aVar2);
    }

    public static EglBase eglBase(EglBase eglBase, CloseableManager closeableManager) {
        EglBase eglBase2 = RTCModule.INSTANCE.eglBase(eglBase, closeableManager);
        m0.n(eglBase2);
        return eglBase2;
    }

    @Override // rn.a
    public EglBase get() {
        return eglBase((EglBase) this.eglBaseOverrideProvider.get(), (CloseableManager) this.memoryManagerProvider.get());
    }
}
