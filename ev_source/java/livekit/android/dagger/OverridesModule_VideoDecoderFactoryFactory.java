package io.livekit.android.dagger;

import livekit.org.webrtc.VideoDecoderFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_VideoDecoderFactoryFactory implements c {
    private final OverridesModule module;

    public OverridesModule_VideoDecoderFactoryFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static OverridesModule_VideoDecoderFactoryFactory create(OverridesModule overridesModule) {
        return new OverridesModule_VideoDecoderFactoryFactory(overridesModule);
    }

    public static VideoDecoderFactory videoDecoderFactory(OverridesModule overridesModule) {
        return overridesModule.videoDecoderFactory();
    }

    @Override // rn.a
    public VideoDecoderFactory get() {
        return videoDecoderFactory(this.module);
    }
}
