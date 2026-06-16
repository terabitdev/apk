package io.livekit.android.dagger;

import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_DisableCommunicationWorkAroundFactory implements c {
    private final OverridesModule module;

    public OverridesModule_DisableCommunicationWorkAroundFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static OverridesModule_DisableCommunicationWorkAroundFactory create(OverridesModule overridesModule) {
        return new OverridesModule_DisableCommunicationWorkAroundFactory(overridesModule);
    }

    public static boolean disableCommunicationWorkAround(OverridesModule overridesModule) {
        return overridesModule.disableCommunicationWorkAround();
    }

    @Override // rn.a
    public Boolean get() {
        return Boolean.valueOf(disableCommunicationWorkAround(this.module));
    }
}
