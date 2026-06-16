package io.elevenlabs.data.worker;

import android.content.Context;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.api.ReadsDownloadAPI;
import io.elevenlabs.data.api.ReadsUploadAPI;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppCheckTokenService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OfflineReadsDownloader_Factory implements c {
    private final f analyticsProvider;
    private final f appCheckTokenServiceProvider;
    private final f appContextProvider;
    private final f dispatcherFactoryProvider;
    private final f jsonProvider;
    private final f loggerProvider;
    private final f offlineReadsDaoProvider;
    private final f readsAPIProvider;
    private final f readsDaoProvider;
    private final f readsDownloadAPIProvider;
    private final f readsUploadAPIProvider;

    private OfflineReadsDownloader_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8, f fVar9, f fVar10, f fVar11) {
        this.appContextProvider = fVar;
        this.offlineReadsDaoProvider = fVar2;
        this.readsDaoProvider = fVar3;
        this.readsAPIProvider = fVar4;
        this.readsUploadAPIProvider = fVar5;
        this.readsDownloadAPIProvider = fVar6;
        this.appCheckTokenServiceProvider = fVar7;
        this.dispatcherFactoryProvider = fVar8;
        this.loggerProvider = fVar9;
        this.jsonProvider = fVar10;
        this.analyticsProvider = fVar11;
    }

    public static OfflineReadsDownloader_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8, f fVar9, f fVar10, f fVar11) {
        return new OfflineReadsDownloader_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11);
    }

    public static OfflineReadsDownloader newInstance(Context context, OfflineReadsDao offlineReadsDao, ReadsDao readsDao, ReadsAPI readsAPI, ReadsUploadAPI readsUploadAPI, ReadsDownloadAPI readsDownloadAPI, AppCheckTokenService appCheckTokenService, DispatcherFactory dispatcherFactory, Logger logger, vr.c cVar, Analytics analytics) {
        return new OfflineReadsDownloader(context, offlineReadsDao, readsDao, readsAPI, readsUploadAPI, readsDownloadAPI, appCheckTokenService, dispatcherFactory, logger, cVar, analytics);
    }

    @Override // rn.a
    public OfflineReadsDownloader get() {
        return newInstance((Context) this.appContextProvider.get(), (OfflineReadsDao) this.offlineReadsDaoProvider.get(), (ReadsDao) this.readsDaoProvider.get(), (ReadsAPI) this.readsAPIProvider.get(), (ReadsUploadAPI) this.readsUploadAPIProvider.get(), (ReadsDownloadAPI) this.readsDownloadAPIProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (vr.c) this.jsonProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
