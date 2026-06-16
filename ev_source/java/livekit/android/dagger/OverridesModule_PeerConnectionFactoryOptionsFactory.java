package io.livekit.android.dagger;

import livekit.org.webrtc.PeerConnectionFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OverridesModule_PeerConnectionFactoryOptionsFactory implements c {
    private final OverridesModule module;

    public OverridesModule_PeerConnectionFactoryOptionsFactory(OverridesModule overridesModule) {
        this.module = overridesModule;
    }

    public static OverridesModule_PeerConnectionFactoryOptionsFactory create(OverridesModule overridesModule) {
        return new OverridesModule_PeerConnectionFactoryOptionsFactory(overridesModule);
    }

    public static PeerConnectionFactory.Options peerConnectionFactoryOptions(OverridesModule overridesModule) {
        return overridesModule.peerConnectionFactoryOptions();
    }

    @Override // rn.a
    public PeerConnectionFactory.Options get() {
        return peerConnectionFactoryOptions(this.module);
    }
}
