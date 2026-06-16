package io.elevenlabs.data.services;

import android.content.Context;
import io.elevenlabs.data.api.ConsumptionAPI;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ConsumptionRepository_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f appContextProvider;
    private final ul.f consumptionAPIProvider;
    private final ul.f consumptionSpanDaoProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;

    private ConsumptionRepository_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.consumptionSpanDaoProvider = fVar;
        this.consumptionAPIProvider = fVar2;
        this.loggerProvider = fVar3;
        this.analyticsProvider = fVar4;
        this.readsServiceProvider = fVar5;
        this.appContextProvider = fVar6;
    }

    public static ConsumptionRepository_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new ConsumptionRepository_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static ConsumptionRepository newInstance(ConsumptionSpanDao consumptionSpanDao, ConsumptionAPI consumptionAPI, Logger logger, Analytics analytics, jl.a aVar, Context context) {
        return new ConsumptionRepository(consumptionSpanDao, consumptionAPI, logger, analytics, aVar, context);
    }

    @Override // rn.a
    public ConsumptionRepository get() {
        return newInstance((ConsumptionSpanDao) this.consumptionSpanDaoProvider.get(), (ConsumptionAPI) this.consumptionAPIProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), ul.b.a(this.readsServiceProvider), (Context) this.appContextProvider.get());
    }
}
