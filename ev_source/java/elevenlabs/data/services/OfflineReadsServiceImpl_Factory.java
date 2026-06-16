package io.elevenlabs.data.services;

import android.content.Context;
import d8.v;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CustomerService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OfflineReadsServiceImpl_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f contextProvider;
    private final ul.f customerServiceProvider;
    private final ul.f jsonProvider;
    private final ul.f loggerProvider;
    private final ul.f offlineReadsDaoProvider;
    private final ul.f readsAPIProvider;
    private final ul.f readsDaoProvider;
    private final ul.f simpleCacheProvider;

    private OfflineReadsServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        this.contextProvider = fVar;
        this.readsAPIProvider = fVar2;
        this.readsDaoProvider = fVar3;
        this.offlineReadsDaoProvider = fVar4;
        this.simpleCacheProvider = fVar5;
        this.loggerProvider = fVar6;
        this.jsonProvider = fVar7;
        this.analyticsProvider = fVar8;
        this.customerServiceProvider = fVar9;
    }

    public static OfflineReadsServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        return new OfflineReadsServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
    }

    public static OfflineReadsServiceImpl newInstance(Context context, ReadsAPI readsAPI, ReadsDao readsDao, OfflineReadsDao offlineReadsDao, v vVar, Logger logger, vr.c cVar, Analytics analytics, CustomerService customerService) {
        return new OfflineReadsServiceImpl(context, readsAPI, readsDao, offlineReadsDao, vVar, logger, cVar, analytics, customerService);
    }

    @Override // rn.a
    public OfflineReadsServiceImpl get() {
        return newInstance((Context) this.contextProvider.get(), (ReadsAPI) this.readsAPIProvider.get(), (ReadsDao) this.readsDaoProvider.get(), (OfflineReadsDao) this.offlineReadsDaoProvider.get(), (v) this.simpleCacheProvider.get(), (Logger) this.loggerProvider.get(), (vr.c) this.jsonProvider.get(), (Analytics) this.analyticsProvider.get(), (CustomerService) this.customerServiceProvider.get());
    }
}
