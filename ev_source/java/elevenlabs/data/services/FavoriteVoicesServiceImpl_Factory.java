package io.elevenlabs.data.services;

import io.elevenlabs.data.api.FavoriteVoicesApi;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class FavoriteVoicesServiceImpl_Factory implements ul.c {
    private final ul.f apiProvider;
    private final ul.f daoProvider;
    private final ul.f loggerProvider;

    private FavoriteVoicesServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.apiProvider = fVar;
        this.daoProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static FavoriteVoicesServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new FavoriteVoicesServiceImpl_Factory(fVar, fVar2, fVar3);
    }

    public static FavoriteVoicesServiceImpl newInstance(FavoriteVoicesApi favoriteVoicesApi, VoicesDao voicesDao, Logger logger) {
        return new FavoriteVoicesServiceImpl(favoriteVoicesApi, voicesDao, logger);
    }

    @Override // rn.a
    public FavoriteVoicesServiceImpl get() {
        return newInstance((FavoriteVoicesApi) this.apiProvider.get(), (VoicesDao) this.daoProvider.get(), (Logger) this.loggerProvider.get());
    }
}
