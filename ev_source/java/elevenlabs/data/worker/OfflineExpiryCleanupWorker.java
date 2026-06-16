package io.elevenlabs.data.worker;

import ae.l;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.c6;
import dc.d0;
import dc.s;
import dc.t;
import dc.y;
import ec.m;
import ec.r;
import io.elevenlabs.di.WorkerEntryPoint;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.OfflineReadsService;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import lc.o;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/data/worker/OfflineExpiryCleanupWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ldc/t;", "doWork", "(Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/di/WorkerEntryPoint;", "entryPoint", "Lio/elevenlabs/di/WorkerEntryPoint;", "Lio/elevenlabs/domain/services/OfflineReadsService;", "offlineReadsService", "Lio/elevenlabs/domain/services/OfflineReadsService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineExpiryCleanupWorker extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long REPEAT_INTERVAL_HOURS = 24;
    private static final String TAG = "OfflineExpiryCleanup";
    private static final String UNIQUE_WORK_NAME = "offlineExpiryCleanup";
    private final Context appContext;
    private final WorkerEntryPoint entryPoint;
    private final Logger logger;
    private final OfflineReadsService offlineReadsService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineExpiryCleanupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.appContext = context;
        WorkerEntryPoint entryPoint = WorkerEntryPoint.INSTANCE.getEntryPoint(context);
        this.entryPoint = entryPoint;
        this.offlineReadsService = entryPoint.getOfflineReadsService();
        this.logger = entryPoint.getLogger();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(c<? super t> cVar) {
        OfflineExpiryCleanupWorker$doWork$1 offlineExpiryCleanupWorker$doWork$1;
        int i10;
        try {
            if (cVar instanceof OfflineExpiryCleanupWorker$doWork$1) {
                offlineExpiryCleanupWorker$doWork$1 = (OfflineExpiryCleanupWorker$doWork$1) cVar;
                int i11 = offlineExpiryCleanupWorker$doWork$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    offlineExpiryCleanupWorker$doWork$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = offlineExpiryCleanupWorker$doWork$1.result;
                    i10 = offlineExpiryCleanupWorker$doWork$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        OfflineReadsService offlineReadsService = this.offlineReadsService;
                        offlineExpiryCleanupWorker$doWork$1.label = 1;
                        Object cleanupExpiredDownloads = offlineReadsService.cleanupExpiredDownloads(offlineExpiryCleanupWorker$doWork$1);
                        xn.a aVar = xn.a.f37986a;
                        if (cleanupExpiredDownloads == aVar) {
                            return aVar;
                        }
                    }
                    return new s();
                }
            }
            if (i10 == 0) {
            }
            return new s();
        } catch (Exception e10) {
            this.logger.logError(TAG, "Expiry cleanup failed", e10);
            return new Object();
        }
        offlineExpiryCleanupWorker$doWork$1 = new OfflineExpiryCleanupWorker$doWork$1(this, cVar);
        Object obj2 = offlineExpiryCleanupWorker$doWork$1.result;
        i10 = offlineExpiryCleanupWorker$doWork$1.label;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/data/worker/OfflineExpiryCleanupWorker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsn/z;", "schedule", "(Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "UNIQUE_WORK_NAME", "", "REPEAT_INTERVAL_HOURS", "J", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void schedule(Context context) {
            context.getClass();
            TimeUnit.HOURS.getClass();
            y yVar = new y(OfflineExpiryCleanupWorker.class, 1);
            o oVar = (o) yVar.f7881c;
            oVar.getClass();
            int i10 = o.f21672z;
            oVar.f21680h = 86400000L;
            oVar.f21681i = l.o(86400000L, 300000L, 86400000L);
            d0 d0Var = (d0) yVar.a();
            new m(r.c(context), OfflineExpiryCleanupWorker.UNIQUE_WORK_NAME, dc.l.f7897b, Collections.singletonList(d0Var), 0).a();
        }

        private Companion() {
        }
    }
}
