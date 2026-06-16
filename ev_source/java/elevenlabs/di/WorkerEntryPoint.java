package io.elevenlabs.di;

import android.content.Context;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.services.ConsumptionRepository;
import io.elevenlabs.data.services.ReadsServiceImpl;
import io.elevenlabs.data.worker.OfflineDrmLicenseHelper;
import io.elevenlabs.data.worker.OfflineMediaDownloader;
import io.elevenlabs.data.worker.OfflineReadsDownloader;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.NotificationService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.UserConfigService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import x7.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lio/elevenlabs/di/WorkerEntryPoint;", "", "getOfflineReadsDownloader", "Lio/elevenlabs/data/worker/OfflineReadsDownloader;", "getOfflineMediaDownloader", "Lio/elevenlabs/data/worker/OfflineMediaDownloader;", "getOfflineDrmLicenseHelper", "Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper;", "getOfflineReadsDao", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "getReadsService", "Lio/elevenlabs/data/services/ReadsServiceImpl;", "getConsumptionRepository", "Lio/elevenlabs/data/services/ConsumptionRepository;", "getUserConfigService", "Lio/elevenlabs/domain/services/UserConfigService;", "getNotificationService", "Lio/elevenlabs/domain/services/NotificationService;", "getReadBookmarkService", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "getOfflineReadsService", "Lio/elevenlabs/domain/services/OfflineReadsService;", "getLogger", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface WorkerEntryPoint {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/di/WorkerEntryPoint$Companion;", "", "<init>", "()V", "getEntryPoint", "Lio/elevenlabs/di/WorkerEntryPoint;", "context", "Landroid/content/Context;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final WorkerEntryPoint getEntryPoint(Context context) {
            context.getClass();
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            return (WorkerEntryPoint) tb.a.t(WorkerEntryPoint.class, e.t(applicationContext.getApplicationContext()));
        }
    }

    ConsumptionRepository getConsumptionRepository();

    Logger getLogger();

    NotificationService getNotificationService();

    OfflineDrmLicenseHelper getOfflineDrmLicenseHelper();

    OfflineMediaDownloader getOfflineMediaDownloader();

    OfflineReadsDao getOfflineReadsDao();

    OfflineReadsDownloader getOfflineReadsDownloader();

    OfflineReadsService getOfflineReadsService();

    ReadBookmarkService getReadBookmarkService();

    ReadsServiceImpl getReadsService();

    UserConfigService getUserConfigService();
}
