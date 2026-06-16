package io.elevenlabs.data.services;

import io.elevenlabs.data.api.ExploreCollectionsAPI;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ExploreCollectionsServiceImpl_Factory implements ul.c {
    private final ul.f exploreCollectionsAPIProvider;
    private final ul.f loggerProvider;

    private ExploreCollectionsServiceImpl_Factory(ul.f fVar, ul.f fVar2) {
        this.exploreCollectionsAPIProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static ExploreCollectionsServiceImpl_Factory create(ul.f fVar, ul.f fVar2) {
        return new ExploreCollectionsServiceImpl_Factory(fVar, fVar2);
    }

    public static ExploreCollectionsServiceImpl newInstance(ExploreCollectionsAPI exploreCollectionsAPI, Logger logger) {
        return new ExploreCollectionsServiceImpl(exploreCollectionsAPI, logger);
    }

    @Override // rn.a
    public ExploreCollectionsServiceImpl get() {
        return newInstance((ExploreCollectionsAPI) this.exploreCollectionsAPIProvider.get(), (Logger) this.loggerProvider.get());
    }
}
