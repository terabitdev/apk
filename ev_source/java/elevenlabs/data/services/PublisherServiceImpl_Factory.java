package io.elevenlabs.data.services;

import io.elevenlabs.data.api.PublisherApi;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PublisherServiceImpl_Factory implements ul.c {
    private final ul.f publisherApiProvider;

    private PublisherServiceImpl_Factory(ul.f fVar) {
        this.publisherApiProvider = fVar;
    }

    public static PublisherServiceImpl_Factory create(ul.f fVar) {
        return new PublisherServiceImpl_Factory(fVar);
    }

    public static PublisherServiceImpl newInstance(PublisherApi publisherApi) {
        return new PublisherServiceImpl(publisherApi);
    }

    @Override // rn.a
    public PublisherServiceImpl get() {
        return newInstance((PublisherApi) this.publisherApiProvider.get());
    }
}
