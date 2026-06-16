package io.livekit.android.dagger;

import livekit.org.webrtc.VideoEncoderFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_VideoEncoderFactoryFactory implements c {
    private final OverridesModule module;

    public OverridesModule_VideoEncoderFactoryFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static OverridesModule_VideoEncoderFactoryFactory create(OverridesModule overridesModule) {
        return new OverridesModule_VideoEncoderFactoryFactory(overridesModule);
    }

    public static VideoEncoderFactory videoEncoderFactory(OverridesModule overridesModule) {
        return overridesModule.videoEncoderFactory();
    }

    @Override // rn.a
    public VideoEncoderFactory get() {
        return videoEncoderFactory(this.module);
    }
}
