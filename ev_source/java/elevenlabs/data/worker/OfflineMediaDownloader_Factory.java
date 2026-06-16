package io.elevenlabs.data.worker;

import d8.v;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.MediaManifestService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OfflineMediaDownloader_Factory implements c {
    private final f analyticsProvider;
    private final f configurationProvider;
    private final f loggerProvider;
    private final f mediaManifestServiceProvider;
    private final f offlineDrmLicenseHelperProvider;
    private final f offlineReadsDaoProvider;
    private final f readsDaoProvider;
    private final f simpleCacheProvider;

    private OfflineMediaDownloader_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8) {
        this.offlineReadsDaoProvider = fVar;
        this.readsDaoProvider = fVar2;
        this.mediaManifestServiceProvider = fVar3;
        this.simpleCacheProvider = fVar4;
        this.configurationProvider = fVar5;
        this.loggerProvider = fVar6;
        this.analyticsProvider = fVar7;
        this.offlineDrmLicenseHelperProvider = fVar8;
    }

    public static OfflineMediaDownloader_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8) {
        return new OfflineMediaDownloader_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static OfflineMediaDownloader newInstance(OfflineReadsDao offlineReadsDao, ReadsDao readsDao, MediaManifestService mediaManifestService, v vVar, Configuration configuration, Logger logger, Analytics analytics, OfflineDrmLicenseHelper offlineDrmLicenseHelper) {
        return new OfflineMediaDownloader(offlineReadsDao, readsDao, mediaManifestService, vVar, configuration, logger, analytics, offlineDrmLicenseHelper);
    }

    @Override // rn.a
    public OfflineMediaDownloader get() {
        return newInstance((OfflineReadsDao) this.offlineReadsDaoProvider.get(), (ReadsDao) this.readsDaoProvider.get(), (MediaManifestService) this.mediaManifestServiceProvider.get(), (v) this.simpleCacheProvider.get(), (Configuration) this.configurationProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), (OfflineDrmLicenseHelper) this.offlineDrmLicenseHelperProvider.get());
    }
}
