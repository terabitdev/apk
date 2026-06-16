package io.livekit.android.dagger;

import io.livekit.android.audio.AudioProcessorOptions;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_AudioProcessorOptionsFactory implements c {
    private final OverridesModule module;

    public OverridesModule_AudioProcessorOptionsFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static AudioProcessorOptions audioProcessorOptions(OverridesModule overridesModule) {
        return overridesModule.audioProcessorOptions();
    }

    public static OverridesModule_AudioProcessorOptionsFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioProcessorOptionsFactory(overridesModule);
    }

    @Override // rn.a
    public AudioProcessorOptions get() {
        return audioProcessorOptions(this.module);
    }
}
