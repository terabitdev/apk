package io.elevenlabs.data.services;

import io.elevenlabs.data.api.SupportAgentAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class SupportAgentServiceImpl_Factory implements ul.c {
    private final ul.f supportAgentAPIProvider;

    private SupportAgentServiceImpl_Factory(ul.f fVar) {
        this.supportAgentAPIProvider = fVar;
    }

    public static SupportAgentServiceImpl_Factory create(ul.f fVar) {
        return new SupportAgentServiceImpl_Factory(fVar);
    }

    public static SupportAgentServiceImpl newInstance(SupportAgentAPI supportAgentAPI) {
        return new SupportAgentServiceImpl(supportAgentAPI);
    }

    @Override // rn.a
    public SupportAgentServiceImpl get() {
        return newInstance((SupportAgentAPI) this.supportAgentAPIProvider.get());
    }
}
