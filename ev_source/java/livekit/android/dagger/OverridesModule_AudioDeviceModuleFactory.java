package io.livekit.android.dagger;

import livekit.org.webrtc.audio.AudioDeviceModule;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_AudioDeviceModuleFactory implements c {
    private final OverridesModule module;

    public OverridesModule_AudioDeviceModuleFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static AudioDeviceModule audioDeviceModule(OverridesModule overridesModule) {
        return overridesModule.audioDeviceModule();
    }

    public static OverridesModule_AudioDeviceModuleFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioDeviceModuleFactory(overridesModule);
    }

    @Override // rn.a
    public AudioDeviceModule get() {
        return audioDeviceModule(this.module);
    }
}
