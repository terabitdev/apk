package io.elevenlabs.data.services;

import io.elevenlabs.data.api.RecentVoicesApi;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import io.elevenlabs.data.usecase.CurrentTimeMillisUseCase;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RecentVoicesServiceImpl_Factory implements ul.c {
    private final ul.f apiProvider;
    private final ul.f currentTimeMillisUseCaseProvider;
    private final ul.f daoProvider;
    private final ul.f loggerProvider;

    private RecentVoicesServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.loggerProvider = fVar;
        this.apiProvider = fVar2;
        this.daoProvider = fVar3;
        this.currentTimeMillisUseCaseProvider = fVar4;
    }

    public static RecentVoicesServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new RecentVoicesServiceImpl_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static RecentVoicesServiceImpl newInstance(Logger logger, RecentVoicesApi recentVoicesApi, RecentVoicesDao recentVoicesDao, CurrentTimeMillisUseCase currentTimeMillisUseCase) {
        return new RecentVoicesServiceImpl(logger, recentVoicesApi, recentVoicesDao, currentTimeMillisUseCase);
    }

    @Override // rn.a
    public RecentVoicesServiceImpl get() {
        return newInstance((Logger) this.loggerProvider.get(), (RecentVoicesApi) this.apiProvider.get(), (RecentVoicesDao) this.daoProvider.get(), (CurrentTimeMillisUseCase) this.currentTimeMillisUseCaseProvider.get());
    }
}
