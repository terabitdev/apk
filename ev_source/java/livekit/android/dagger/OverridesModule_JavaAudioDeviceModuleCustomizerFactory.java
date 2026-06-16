package io.livekit.android.dagger;

import ho.l;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_JavaAudioDeviceModuleCustomizerFactory implements c {
    private final OverridesModule module;

    public OverridesModule_JavaAudioDeviceModuleCustomizerFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static OverridesModule_JavaAudioDeviceModuleCustomizerFactory create(OverridesModule overridesModule) {
        return new OverridesModule_JavaAudioDeviceModuleCustomizerFactory(overridesModule);
    }

    public static l javaAudioDeviceModuleCustomizer(OverridesModule overridesModule) {
        return overridesModule.javaAudioDeviceModuleCustomizer();
    }

    @Override // rn.a
    public l get() {
        return javaAudioDeviceModuleCustomizer(this.module);
    }
}
