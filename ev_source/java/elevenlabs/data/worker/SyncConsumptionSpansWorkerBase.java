package io.elevenlabs.data.worker;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.c6;
import dc.e;
import dc.l;
import dc.s;
import dc.t;
import dc.w;
import dc.y;
import dc.z;
import ec.r;
import io.elevenlabs.data.services.ConsumptionRepository;
import io.elevenlabs.domain.Logger;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/data/worker/SyncConsumptionSpansWorkerBase;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lio/elevenlabs/data/services/ConsumptionRepository;", "consumptionRepository", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lio/elevenlabs/data/services/ConsumptionRepository;Lio/elevenlabs/domain/Logger;)V", "Ldc/t;", "doWork", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/services/ConsumptionRepository;", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public class SyncConsumptionSpansWorkerBase extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String WORK_NAME = "sync_consumption_spans";
    private final ConsumptionRepository consumptionRepository;
    private final Logger logger;
    private final String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncConsumptionSpansWorkerBase(Context context, WorkerParameters workerParameters, ConsumptionRepository consumptionRepository, Logger logger) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        consumptionRepository.getClass();
        logger.getClass();
        this.consumptionRepository = consumptionRepository;
        this.logger = logger;
        this.tag = "SyncConsumptionSpansWorker";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object doWork$suspendImpl(SyncConsumptionSpansWorkerBase syncConsumptionSpansWorkerBase, c<? super t> cVar) {
        SyncConsumptionSpansWorkerBase$doWork$1 syncConsumptionSpansWorkerBase$doWork$1;
        int i10;
        try {
            if (cVar instanceof SyncConsumptionSpansWorkerBase$doWork$1) {
                syncConsumptionSpansWorkerBase$doWork$1 = (SyncConsumptionSpansWorkerBase$doWork$1) cVar;
                int i11 = syncConsumptionSpansWorkerBase$doWork$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    syncConsumptionSpansWorkerBase$doWork$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = syncConsumptionSpansWorkerBase$doWork$1.result;
                    i10 = syncConsumptionSpansWorkerBase$doWork$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            syncConsumptionSpansWorkerBase = (SyncConsumptionSpansWorkerBase) syncConsumptionSpansWorkerBase$doWork$1.L$0;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        syncConsumptionSpansWorkerBase.logger.log(syncConsumptionSpansWorkerBase.tag, "Starting consumption span sync");
                        ConsumptionRepository consumptionRepository = syncConsumptionSpansWorkerBase.consumptionRepository;
                        syncConsumptionSpansWorkerBase$doWork$1.L$0 = syncConsumptionSpansWorkerBase;
                        syncConsumptionSpansWorkerBase$doWork$1.label = 1;
                        Object syncSpans = consumptionRepository.syncSpans(syncConsumptionSpansWorkerBase$doWork$1);
                        xn.a aVar = xn.a.f37986a;
                        if (syncSpans == aVar) {
                            return aVar;
                        }
                    }
                    syncConsumptionSpansWorkerBase.logger.log(syncConsumptionSpansWorkerBase.tag, "Consumption span sync complete");
                    return new s();
                }
            }
            if (i10 == 0) {
            }
            syncConsumptionSpansWorkerBase.logger.log(syncConsumptionSpansWorkerBase.tag, "Consumption span sync complete");
            return new s();
        } catch (Exception e10) {
            syncConsumptionSpansWorkerBase.logger.logWarning(syncConsumptionSpansWorkerBase.tag, "Error syncing consumption spans", e10);
            return new Object();
        }
        syncConsumptionSpansWorkerBase$doWork$1 = new SyncConsumptionSpansWorkerBase$doWork$1(syncConsumptionSpansWorkerBase, cVar);
        Object obj2 = syncConsumptionSpansWorkerBase$doWork$1.result;
        i10 = syncConsumptionSpansWorkerBase$doWork$1.label;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(c<? super t> cVar) {
        return doWork$suspendImpl(this, cVar);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/data/worker/SyncConsumptionSpansWorkerBase$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsn/z;", "enqueue", "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void enqueue(Context context) {
            context.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e eVar = new e(new mc.e(null), w.f7917b, false, false, false, false, -1L, -1L, o.l1(linkedHashSet));
            y yVar = new y(SyncConsumptionSpansWorker.class, 0);
            ((lc.o) yVar.f7881c).f21682j = eVar;
            r.c(context).b(SyncConsumptionSpansWorkerBase.WORK_NAME, l.f7896a, (z) yVar.a());
        }

        private Companion() {
        }
    }
}
