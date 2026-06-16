package io.livekit.android.dagger;

import io.livekit.android.AudioType;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_AudioOutputTypeFactory implements c {
    private final OverridesModule module;

    public OverridesModule_AudioOutputTypeFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static AudioType audioOutputType(OverridesModule overridesModule) {
        return overridesModule.audioOutputType();
    }

    public static OverridesModule_AudioOutputTypeFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioOutputTypeFactory(overridesModule);
    }

    @Override // rn.a
    public AudioType get() {
        return audioOutputType(this.module);
    }
}
