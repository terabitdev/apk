package io.elevenlabs.data.services;

import io.elevenlabs.data.api.InterestsAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class InterestsServiceImpl_Factory implements ul.c {
    private final ul.f interestsAPIProvider;

    private InterestsServiceImpl_Factory(ul.f fVar) {
        this.interestsAPIProvider = fVar;
    }

    public static InterestsServiceImpl_Factory create(ul.f fVar) {
        return new InterestsServiceImpl_Factory(fVar);
    }

    public static InterestsServiceImpl newInstance(InterestsAPI interestsAPI) {
        return new InterestsServiceImpl(interestsAPI);
    }

    @Override // rn.a
    public InterestsServiceImpl get() {
        return newInstance((InterestsAPI) this.interestsAPIProvider.get());
    }
}
