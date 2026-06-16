package io.elevenlabs.data.services;

import io.elevenlabs.data.api.AssistantAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AssistantServiceImpl_Factory implements ul.c {
    private final ul.f assistantAPIProvider;

    private AssistantServiceImpl_Factory(ul.f fVar) {
        this.assistantAPIProvider = fVar;
    }

    public static AssistantServiceImpl_Factory create(ul.f fVar) {
        return new AssistantServiceImpl_Factory(fVar);
    }

    public static AssistantServiceImpl newInstance(AssistantAPI assistantAPI) {
        return new AssistantServiceImpl(assistantAPI);
    }

    @Override // rn.a
    public AssistantServiceImpl get() {
        return newInstance((AssistantAPI) this.assistantAPIProvider.get());
    }
}
