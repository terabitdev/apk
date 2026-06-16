package io.livekit.android.dagger;

import livekit.org.webrtc.EglBase;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_EglBaseFactory implements c {
    private final OverridesModule module;

    public OverridesModule_EglBaseFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static OverridesModule_EglBaseFactory create(OverridesModule overridesModule) {
        return new OverridesModule_EglBaseFactory(overridesModule);
    }

    public static EglBase eglBase(OverridesModule overridesModule) {
        return overridesModule.eglBase();
    }

    @Override // rn.a
    public EglBase get() {
        return eglBase(this.module);
    }
}
