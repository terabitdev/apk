package io.livekit.android.dagger;

import io.livekit.android.audio.AudioHandler;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_AudioHandlerFactory implements c {
    private final OverridesModule module;

    public OverridesModule_AudioHandlerFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static AudioHandler audioHandler(OverridesModule overridesModule) {
        return overridesModule.audioHandler();
    }

    public static OverridesModule_AudioHandlerFactory create(OverridesModule overridesModule) {
        return new OverridesModule_AudioHandlerFactory(overridesModule);
    }

    @Override // rn.a
    public AudioHandler get() {
        return audioHandler(this.module);
    }
}
