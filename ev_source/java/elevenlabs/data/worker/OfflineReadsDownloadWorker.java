package io.elevenlabs.data.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.c6;
import dc.h;
import dc.q;
import dc.t;
import defpackage.f;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.di.WorkerEntryPoint;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/data/worker/OfflineReadsDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ldc/t;", "doWork", "(Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/di/WorkerEntryPoint;", "entryPoint", "Lio/elevenlabs/di/WorkerEntryPoint;", "Lio/elevenlabs/data/worker/OfflineReadsDownloader;", "ttsDownloader", "Lio/elevenlabs/data/worker/OfflineReadsDownloader;", "Lio/elevenlabs/data/worker/OfflineMediaDownloader;", "mediaDownloader", "Lio/elevenlabs/data/worker/OfflineMediaDownloader;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "offlineReadsDao", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsDownloadWorker extends CoroutineWorker {
    public static final String KEY_OFFLINE_READ_ID = "offline_read_id";
    private static final String TAG = "OfflineReadsDownloadWorker";
    private final Context appContext;
    private final WorkerEntryPoint entryPoint;
    private final Logger logger;
    private final OfflineMediaDownloader mediaDownloader;
    private final OfflineReadsDao offlineReadsDao;
    private final OfflineReadsDownloader ttsDownloader;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineReadEntity.Type.values().length];
            try {
                iArr[OfflineReadEntity.Type.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineReadEntity.Type.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.appContext = context;
        WorkerEntryPoint entryPoint = WorkerEntryPoint.INSTANCE.getEntryPoint(context);
        this.entryPoint = entryPoint;
        OfflineReadsDownloader offlineReadsDownloader = entryPoint.getOfflineReadsDownloader();
        this.ttsDownloader = offlineReadsDownloader;
        OfflineMediaDownloader offlineMediaDownloader = entryPoint.getOfflineMediaDownloader();
        this.mediaDownloader = offlineMediaDownloader;
        this.offlineReadsDao = entryPoint.getOfflineReadsDao();
        this.logger = entryPoint.getLogger();
        final int i10 = 0;
        offlineReadsDownloader.setStoppedChecker(new ho.a(this) { // from class: io.elevenlabs.data.worker.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfflineReadsDownloadWorker f14138b;

            {
                this.f14138b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                boolean isStopped;
                switch (i10) {
                    case 0:
                        isStopped = this.f14138b.isStopped();
                        break;
                    default:
                        isStopped = this.f14138b.isStopped();
                        break;
                }
                return Boolean.valueOf(isStopped);
            }
        });
        final int i11 = 1;
        offlineMediaDownloader.setStoppedChecker(new ho.a(this) { // from class: io.elevenlabs.data.worker.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfflineReadsDownloadWorker f14138b;

            {
                this.f14138b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                boolean isStopped;
                switch (i11) {
                    case 0:
                        isStopped = this.f14138b.isStopped();
                        break;
                    default:
                        isStopped = this.f14138b.isStopped();
                        break;
                }
                return Boolean.valueOf(isStopped);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        if (r10 == r5) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(c<? super t> cVar) {
        OfflineReadsDownloadWorker$doWork$1 offlineReadsDownloadWorker$doWork$1;
        int i10;
        long longValue;
        OfflineReadEntity offlineReadEntity;
        if (cVar instanceof OfflineReadsDownloadWorker$doWork$1) {
            offlineReadsDownloadWorker$doWork$1 = (OfflineReadsDownloadWorker$doWork$1) cVar;
            int i11 = offlineReadsDownloadWorker$doWork$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsDownloadWorker$doWork$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineReadsDownloadWorker$doWork$1.result;
                i10 = offlineReadsDownloadWorker$doWork$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                return obj;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                        return obj;
                    }
                    longValue = offlineReadsDownloadWorker$doWork$1.J$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    h inputData = getInputData();
                    inputData.getClass();
                    Object obj2 = -1L;
                    Object obj3 = inputData.f7890a.get(KEY_OFFLINE_READ_ID);
                    if (obj3 instanceof Long) {
                        obj2 = obj3;
                    }
                    longValue = ((Number) obj2).longValue();
                    OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                    offlineReadsDownloadWorker$doWork$1.J$0 = longValue;
                    offlineReadsDownloadWorker$doWork$1.label = 1;
                    obj = offlineReadsDao.getOfflineReadById(longValue, offlineReadsDownloadWorker$doWork$1);
                }
                offlineReadEntity = (OfflineReadEntity) obj;
                if (offlineReadEntity != null) {
                    this.logger.logError(TAG, f.g(longValue, "Offline read entity not found for id="), null);
                    return new q();
                }
                int i12 = WhenMappings.$EnumSwitchMapping$0[offlineReadEntity.getType().ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        OfflineMediaDownloader offlineMediaDownloader = this.mediaDownloader;
                        offlineReadsDownloadWorker$doWork$1.L$0 = null;
                        offlineReadsDownloadWorker$doWork$1.J$0 = longValue;
                        offlineReadsDownloadWorker$doWork$1.label = 3;
                        Object doWork = offlineMediaDownloader.doWork(longValue, offlineReadsDownloadWorker$doWork$1);
                        if (doWork != aVar) {
                            return doWork;
                        }
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    OfflineReadsDownloader offlineReadsDownloader = this.ttsDownloader;
                    offlineReadsDownloadWorker$doWork$1.L$0 = null;
                    offlineReadsDownloadWorker$doWork$1.J$0 = longValue;
                    offlineReadsDownloadWorker$doWork$1.label = 2;
                    Object doWork2 = offlineReadsDownloader.doWork(longValue, offlineReadsDownloadWorker$doWork$1);
                    if (doWork2 != aVar) {
                        return doWork2;
                    }
                }
                return aVar;
            }
        }
        offlineReadsDownloadWorker$doWork$1 = new OfflineReadsDownloadWorker$doWork$1(this, cVar);
        Object obj4 = offlineReadsDownloadWorker$doWork$1.result;
        i10 = offlineReadsDownloadWorker$doWork$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        offlineReadEntity = (OfflineReadEntity) obj4;
        if (offlineReadEntity != null) {
        }
    }
}
