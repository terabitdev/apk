package io.elevenlabs.data.services;

import io.elevenlabs.data.api.ExploreVoiceCollectionsApi;
import io.elevenlabs.data.api.ExploreVoicesApi;
import io.elevenlabs.data.cache.MemoryCache;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.domain.DispatcherFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ExploreVoicesServiceImpl_Factory implements ul.c {
    private final ul.f apiProvider;
    private final ul.f collectionsApiProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f memoryCacheProvider;
    private final ul.f voicesDaoProvider;

    private ExploreVoicesServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.apiProvider = fVar;
        this.collectionsApiProvider = fVar2;
        this.voicesDaoProvider = fVar3;
        this.dispatcherFactoryProvider = fVar4;
        this.memoryCacheProvider = fVar5;
    }

    public static ExploreVoicesServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new ExploreVoicesServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static ExploreVoicesServiceImpl newInstance(ExploreVoicesApi exploreVoicesApi, ExploreVoiceCollectionsApi exploreVoiceCollectionsApi, VoicesDao voicesDao, DispatcherFactory dispatcherFactory, MemoryCache memoryCache) {
        return new ExploreVoicesServiceImpl(exploreVoicesApi, exploreVoiceCollectionsApi, voicesDao, dispatcherFactory, memoryCache);
    }

    @Override // rn.a
    public ExploreVoicesServiceImpl get() {
        return newInstance((ExploreVoicesApi) this.apiProvider.get(), (ExploreVoiceCollectionsApi) this.collectionsApiProvider.get(), (VoicesDao) this.voicesDaoProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (MemoryCache) this.memoryCacheProvider.get());
    }
}
