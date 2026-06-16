package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import d8.v;
import dc.w;
import dc.y;
import ec.r;
import fr.g0;
import fr.r0;
import gh.w1;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadWithChapters;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.reads.ReadChapterEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.mapping.OfflineReadMappingKt;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.BulkConversionResponse;
import io.elevenlabs.data.model.response.InsufficientOfflineDownloadCreditsData;
import io.elevenlabs.data.model.response.LimitedBasedReadApiErrorData;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.data.worker.DrmLicenseReleaseWorker;
import io.elevenlabs.data.worker.OfflineDrmLicenseHelper;
import io.elevenlabs.data.worker.OfflineExpiryCleanupWorker;
import io.elevenlabs.data.worker.OfflineReadsDownloadWorker;
import io.elevenlabs.data.worker.OfflineReadsDownloaderKt;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.DownloadReadResult;
import io.elevenlabs.domain.services.OfflineReadsService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m;
import lc.o;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;
import tn.t;
import w7.h0;
import w7.j0;
import w7.k0;
import w7.l0;
import w7.m0;
import w7.n0;
import w7.u0;
import wq.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 b2\u00020\u0001:\u0001bBS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010 \u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J \u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b(\u0010'J\u001b\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)H\u0016¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0*0)H\u0016¢\u0006\u0004\b/\u0010-J\u0010\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\"H\u0096@¢\u0006\u0004\b3\u00102J\u0018\u00104\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\"H\u0096@¢\u0006\u0004\b6\u00102J \u00107\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b7\u00108J(\u00109\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b9\u0010\u001dJ3\u0010=\u001a\u00020\u001b\"\u0004\b\u0000\u0010:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b=\u0010>J/\u0010A\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019H\u0002¢\u0006\u0004\bA\u0010BJ\u0018\u0010E\u001a\u00020\"2\u0006\u0010D\u001a\u00020CH\u0082@¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bG\u0010'J\u0018\u0010H\u001a\u00020\"2\u0006\u0010D\u001a\u00020CH\u0082@¢\u0006\u0004\bH\u0010FJ%\u0010H\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0*H\u0002¢\u0006\u0004\bH\u0010KJD\u0010O\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u001a\u0010M\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00160L0*2\u0006\u0010N\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\"2\u0006\u0010Q\u001a\u00020\u0016H\u0002¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\"H\u0082@¢\u0006\u0004\bT\u00102J\u0017\u0010U\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010[R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\\R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010]R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010^R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010_R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010`R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010a¨\u0006c"}, d2 = {"Lio/elevenlabs/data/services/OfflineReadsServiceImpl;", "Lio/elevenlabs/domain/services/OfflineReadsService;", "Landroid/content/Context;", "context", "Lio/elevenlabs/data/api/ReadsAPI;", "readsAPI", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "readsDao", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "offlineReadsDao", "Ld8/v;", "simpleCache", "Lio/elevenlabs/domain/Logger;", "logger", "Lvr/c;", "json", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "<init>", "(Landroid/content/Context;Lio/elevenlabs/data/api/ReadsAPI;Lio/elevenlabs/data/database/entities/reads/ReadsDao;Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;Ld8/v;Lio/elevenlabs/domain/Logger;Lvr/c;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/CustomerService;)V", "", "readId", "voiceId", "", "totalCharCount", "Lio/elevenlabs/domain/services/DownloadReadResult;", "downloadAllChapters", "(Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "", "chapterIndex", "downloadChapter", "(Ljava/lang/String;Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "Lsn/z;", "removeChapterDownload", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "offlineReadId", "removeDownload", "(JLwn/c;)Ljava/lang/Object;", "retryDownload", "Lir/i;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "getDownloadedReads", "()Lir/i;", "Lio/elevenlabs/domain/model/OfflineReadData;", "getAllOfflineReads", "", "hasDownloadedReads", "(Lwn/c;)Ljava/lang/Object;", "removeAllDownloadedReads", "removeDownloadsForRead", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "cleanupExpiredDownloads", "downloadMediaRead", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "downloadTtsRead", TokenNames.T, "Lio/elevenlabs/data/model/ApiResult$Error;", "result", "handleConvertError", "(Lio/elevenlabs/data/model/ApiResult$Error;Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/domain/services/DownloadReadResult;", "startOffset", "endExclusive", "deleteTtsChunkFiles", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "offlineRead", "backfillChapterEntitiesIfNeeded", "(Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;Lwn/c;)Ljava/lang/Object;", "reEnqueueExpiredChapters", "scheduleDrmRelease", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "chapters", "(Ljava/lang/String;Ljava/util/List;)V", "Lsn/k;", "chapterPairs", "now", "insertChapterEntities", "(JLjava/lang/String;Ljava/util/List;JLwn/c;)Ljava/lang/Object;", "manifestUrl", "removeHlsCache", "(Ljava/lang/String;)V", "clearMediaCache", "doSubmitWorkStep", "(J)V", "buildUniqueWorkName", "(J)Ljava/lang/String;", "Landroid/content/Context;", "Lio/elevenlabs/data/api/ReadsAPI;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "Ld8/v;", "Lio/elevenlabs/domain/Logger;", "Lvr/c;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/CustomerService;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsServiceImpl implements OfflineReadsService {
    private static final String TAG = "OfflineReadsService";
    private final Analytics analytics;
    private final Context context;
    private final CustomerService customerService;
    private final vr.c json;
    private final Logger logger;
    private final OfflineReadsDao offlineReadsDao;
    private final ReadsAPI readsAPI;
    private final ReadsDao readsDao;
    private final v simpleCache;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OfflineReadEntity.Status.values().length];
            try {
                iArr[OfflineReadEntity.Status.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineReadEntity.Status.DOWNLOADING_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineReadEntity.Status.DOWNLOADING_HTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineReadEntity.Status.DOWNLOADING_CHUNKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OfflineReadEntity.Status.CONVERTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OfflineReadEntity.Status.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OfflineReadEntity.Type.values().length];
            try {
                iArr2[OfflineReadEntity.Type.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OfflineReadEntity.Type.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OfflineReadsServiceImpl(Context context, ReadsAPI readsAPI, ReadsDao readsDao, OfflineReadsDao offlineReadsDao, v vVar, Logger logger, vr.c cVar, Analytics analytics, CustomerService customerService) {
        context.getClass();
        readsAPI.getClass();
        readsDao.getClass();
        offlineReadsDao.getClass();
        vVar.getClass();
        logger.getClass();
        cVar.getClass();
        analytics.getClass();
        customerService.getClass();
        this.context = context;
        this.readsAPI = readsAPI;
        this.readsDao = readsDao;
        this.offlineReadsDao = offlineReadsDao;
        this.simpleCache = vVar;
        this.logger = logger;
        this.json = cVar;
        this.analytics = analytics;
        this.customerService = customerService;
        OfflineExpiryCleanupWorker.INSTANCE.schedule(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
    
        if (r1 == r9) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0076, code lost:
    
        if (r1 == r9) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object backfillChapterEntitiesIfNeeded(OfflineReadEntity offlineReadEntity, wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1 offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1;
        Object obj;
        int i10;
        OfflineReadEntity offlineReadEntity2;
        List<ReadChapterEntity> list;
        OfflineReadEntity offlineReadEntity3;
        List<ReadChapterEntity> list2;
        String audio_file_number;
        if (cVar instanceof OfflineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1) {
            offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1 = (OfflineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1) cVar;
            int i11 = offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1.label = i11 - Integer.MIN_VALUE;
                OfflineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1 offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12 = offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1;
                obj = offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.result;
                i10 = offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.label;
                z zVar = z.f31622a;
                int i12 = 1;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                list2 = (List) offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$2;
                                offlineReadEntity3 = (OfflineReadEntity) offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$0;
                                sn.a.g(obj);
                                this.logger.log(TAG, "Backfilled " + list2.size() + " chapter entities for offlineReadId=" + offlineReadEntity3.getId());
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$0;
                        sn.a.g(obj);
                        OfflineReadEntity offlineReadEntity4 = offlineReadEntity2;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
                        if (readMetaEntityWithChapters != null) {
                            list = readMetaEntityWithChapters.getChapters();
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = t.f33547a;
                        }
                        List<ReadChapterEntity> list3 = list;
                        if (list3.isEmpty()) {
                            Logger.logWarning$default(this.logger, TAG, defpackage.f.C("No chapters found for readId=", offlineReadEntity4.getReadId(), "; cannot backfill"), null, 4, null);
                            return zVar;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (offlineReadEntity4.getType() != OfflineReadEntity.Type.TTS) {
                            i12 = 0;
                        }
                        List<sn.k> arrayList = new ArrayList<>(p.a0(list3, 10));
                        for (ReadChapterEntity readChapterEntity : list3) {
                            Integer num = new Integer(readChapterEntity.getChapter_index());
                            if (i12 != 0) {
                                audio_file_number = null;
                            } else {
                                audio_file_number = readChapterEntity.getAudio_file_number();
                            }
                            arrayList.add(new sn.k(num, audio_file_number));
                        }
                        long id2 = offlineReadEntity4.getId();
                        String readId = offlineReadEntity4.getReadId();
                        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$0 = offlineReadEntity4;
                        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$1 = null;
                        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$2 = list3;
                        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$3 = null;
                        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.J$0 = currentTimeMillis;
                        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.I$0 = i12;
                        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.label = 3;
                        if (insertChapterEntities(id2, readId, arrayList, currentTimeMillis, offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12) != obj2) {
                            offlineReadEntity3 = offlineReadEntity4;
                            list2 = list3;
                            this.logger.log(TAG, "Backfilled " + list2.size() + " chapter entities for offlineReadId=" + offlineReadEntity3.getId());
                            return zVar;
                        }
                        return obj2;
                    }
                    offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                    long id3 = offlineReadEntity.getId();
                    offlineReadEntity2 = offlineReadEntity;
                    offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$0 = offlineReadEntity2;
                    offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.label = 1;
                    obj = offlineReadsDao.getChaptersForRead(id3, offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12);
                }
                if (((List) obj).isEmpty()) {
                    return zVar;
                }
                ReadsDao readsDao = this.readsDao;
                String readId2 = offlineReadEntity2.getReadId();
                offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$0 = offlineReadEntity2;
                offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.L$1 = null;
                offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12.label = 2;
                obj = readsDao.getById(readId2, offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$12);
            }
        }
        offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1 = new OfflineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1(this, cVar);
        OfflineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1 offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$122 = offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$1;
        obj = offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$122.result;
        i10 = offlineReadsServiceImpl$backfillChapterEntitiesIfNeeded$122.label;
        z zVar2 = z.f31622a;
        int i122 = 1;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        if (((List) obj).isEmpty()) {
        }
    }

    private final String buildUniqueWorkName(long offlineReadId) {
        return defpackage.f.g(offlineReadId, "offlineReadDownload-");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearMediaCache(wn.c<? super z> cVar) {
        mr.e eVar = r0.f9888a;
        Object Q = g0.Q(mr.d.f23445b, new OfflineReadsServiceImpl$clearMediaCache$2(this, null), cVar);
        if (Q == xn.a.f37986a) {
            return Q;
        }
        return z.f31622a;
    }

    private final void deleteTtsChunkFiles(String readId, String voiceId, long startOffset, long endExclusive) {
        File[] listFiles;
        File readDownloadDir = OfflineReadsDownloaderKt.getReadDownloadDir(this.context, readId, voiceId);
        if (readDownloadDir.exists() && (listFiles = readDownloadDir.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                String name = file.getName();
                name.getClass();
                if (u.N(name, "_chunk.json", false)) {
                    arrayList.add(file);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String name2 = ((File) next).getName();
                name2.getClass();
                Long Z = u.Z(n.v0(name2, "_chunk.json"));
                if (Z != null && Z.longValue() >= startOffset && Z.longValue() < endExclusive) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((File) it2.next()).delete();
            }
        }
    }

    private final void doSubmitWorkStep(long offlineReadId) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OfflineReadsDownloadWorker.KEY_OFFLINE_READ_ID, Long.valueOf(offlineReadId));
        dc.h hVar = new dc.h(linkedHashMap);
        ec.t.J(hVar);
        String buildUniqueWorkName = buildUniqueWorkName(offlineReadId);
        y yVar = new y(OfflineReadsDownloadWorker.class, 0);
        ((o) yVar.f7881c).f21677e = hVar;
        ((o) yVar.f7881c).f21682j = new dc.e(new mc.e(null), w.f7917b, false, false, false, false, -1L, -1L, tn.o.l1(new LinkedHashSet()));
        buildUniqueWorkName.getClass();
        ((Set) yVar.f7882d).add(buildUniqueWorkName);
        dc.z zVar = (dc.z) yVar.a();
        Context context = this.context;
        context.getClass();
        r.c(context).b(buildUniqueWorkName, dc.l.f7897b, zVar);
        this.logger.log(TAG, "Scheduled download worker for offline read ID: " + offlineReadId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x017b, code lost:
    
        if (r2 != r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        if (reEnqueueExpiredChapters(r1, r7) == r9) goto L61;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00f1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadMediaRead(String str, String str2, wn.c<? super DownloadReadResult> cVar) {
        OfflineReadsServiceImpl$downloadMediaRead$1 offlineReadsServiceImpl$downloadMediaRead$1;
        int i10;
        String str3;
        String str4;
        OfflineReadEntity offlineReadEntity;
        long j4;
        String str5;
        String str6;
        long longValue;
        List<ReadChapterEntity> list;
        String str7;
        String str8;
        long j10;
        List<ReadChapterEntity> list2;
        if (cVar instanceof OfflineReadsServiceImpl$downloadMediaRead$1) {
            offlineReadsServiceImpl$downloadMediaRead$1 = (OfflineReadsServiceImpl$downloadMediaRead$1) cVar;
            int i11 = offlineReadsServiceImpl$downloadMediaRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$downloadMediaRead$1.label = i11 - Integer.MIN_VALUE;
                OfflineReadsServiceImpl$downloadMediaRead$1 offlineReadsServiceImpl$downloadMediaRead$12 = offlineReadsServiceImpl$downloadMediaRead$1;
                Object obj = offlineReadsServiceImpl$downloadMediaRead$12.result;
                i10 = offlineReadsServiceImpl$downloadMediaRead$12.label;
                Object obj2 = xn.a.f37986a;
                switch (i10) {
                    case 0:
                        sn.a.g(obj);
                        OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$0 = str;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$1 = str2;
                        offlineReadsServiceImpl$downloadMediaRead$12.label = 1;
                        obj = offlineReadsDao.getOfflineReadByReadId(str, offlineReadsServiceImpl$downloadMediaRead$12);
                        if (obj != obj2) {
                            str3 = str;
                            str4 = str2;
                            offlineReadEntity = (OfflineReadEntity) obj;
                            if (offlineReadEntity == null) {
                                this.logger.log(TAG, "downloadMediaRead - existing entry id=" + offlineReadEntity.getId() + ", status=" + offlineReadEntity.getStatus());
                                switch (WhenMappings.$EnumSwitchMapping$0[offlineReadEntity.getStatus().ordinal()]) {
                                    case 1:
                                        long id2 = offlineReadEntity.getId();
                                        offlineReadsServiceImpl$downloadMediaRead$12.L$0 = null;
                                        offlineReadsServiceImpl$downloadMediaRead$12.L$1 = null;
                                        offlineReadsServiceImpl$downloadMediaRead$12.L$2 = null;
                                        offlineReadsServiceImpl$downloadMediaRead$12.label = 2;
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                                    case 6:
                                        long id3 = offlineReadEntity.getId();
                                        offlineReadsServiceImpl$downloadMediaRead$12.L$0 = null;
                                        offlineReadsServiceImpl$downloadMediaRead$12.L$1 = null;
                                        offlineReadsServiceImpl$downloadMediaRead$12.L$2 = null;
                                        offlineReadsServiceImpl$downloadMediaRead$12.label = 3;
                                        Object retryDownload = retryDownload(id3, offlineReadsServiceImpl$downloadMediaRead$12);
                                        if (retryDownload != obj2) {
                                            return retryDownload;
                                        }
                                        break;
                                    default:
                                        c6.p();
                                        return null;
                                }
                            } else {
                                long currentTimeMillis = System.currentTimeMillis();
                                OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                                OfflineReadEntity offlineReadEntity2 = new OfflineReadEntity(0L, str3, str4, OfflineReadEntity.Type.MEDIA, 0L, currentTimeMillis, currentTimeMillis, OfflineReadEntity.Status.DOWNLOADING_MEDIA, 0, null, null, 1537, null);
                                offlineReadsServiceImpl$downloadMediaRead$12.L$0 = str3;
                                offlineReadsServiceImpl$downloadMediaRead$12.L$1 = str4;
                                offlineReadsServiceImpl$downloadMediaRead$12.L$2 = null;
                                offlineReadsServiceImpl$downloadMediaRead$12.J$0 = currentTimeMillis;
                                offlineReadsServiceImpl$downloadMediaRead$12.label = 4;
                                Object insert = offlineReadsDao2.insert(offlineReadEntity2, offlineReadsServiceImpl$downloadMediaRead$12);
                                if (insert != obj2) {
                                    j4 = currentTimeMillis;
                                    str5 = str3;
                                    obj = insert;
                                    str6 = str4;
                                    longValue = ((Number) obj).longValue();
                                    ReadsDao readsDao = this.readsDao;
                                    offlineReadsServiceImpl$downloadMediaRead$12.L$0 = str5;
                                    offlineReadsServiceImpl$downloadMediaRead$12.L$1 = str6;
                                    offlineReadsServiceImpl$downloadMediaRead$12.L$2 = null;
                                    offlineReadsServiceImpl$downloadMediaRead$12.J$0 = j4;
                                    offlineReadsServiceImpl$downloadMediaRead$12.J$1 = longValue;
                                    offlineReadsServiceImpl$downloadMediaRead$12.label = 5;
                                    obj = readsDao.getById(str5, offlineReadsServiceImpl$downloadMediaRead$12);
                                    break;
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        String str9 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$1;
                        String str10 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$0;
                        sn.a.g(obj);
                        str4 = str9;
                        str3 = str10;
                        offlineReadEntity = (OfflineReadEntity) obj;
                        if (offlineReadEntity == null) {
                        }
                        return obj2;
                    case 2:
                        sn.a.g(obj);
                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                    case 3:
                        sn.a.g(obj);
                        return obj;
                    case 4:
                        long j11 = offlineReadsServiceImpl$downloadMediaRead$12.J$0;
                        str6 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$1;
                        str5 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$0;
                        sn.a.g(obj);
                        j4 = j11;
                        longValue = ((Number) obj).longValue();
                        ReadsDao readsDao2 = this.readsDao;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$0 = str5;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$1 = str6;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$2 = null;
                        offlineReadsServiceImpl$downloadMediaRead$12.J$0 = j4;
                        offlineReadsServiceImpl$downloadMediaRead$12.J$1 = longValue;
                        offlineReadsServiceImpl$downloadMediaRead$12.label = 5;
                        obj = readsDao2.getById(str5, offlineReadsServiceImpl$downloadMediaRead$12);
                        break;
                    case 5:
                        longValue = offlineReadsServiceImpl$downloadMediaRead$12.J$1;
                        j4 = offlineReadsServiceImpl$downloadMediaRead$12.J$0;
                        str6 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$1;
                        str5 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$0;
                        sn.a.g(obj);
                        long j12 = j4;
                        String str11 = str6;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
                        if (readMetaEntityWithChapters != null) {
                            list = readMetaEntityWithChapters.getChapters();
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = t.f33547a;
                        }
                        List<ReadChapterEntity> list3 = list;
                        List<sn.k> arrayList = new ArrayList<>(p.a0(list3, 10));
                        for (ReadChapterEntity readChapterEntity : list3) {
                            arrayList.add(new sn.k(new Integer(readChapterEntity.getChapter_index()), readChapterEntity.getAudio_file_number()));
                        }
                        offlineReadsServiceImpl$downloadMediaRead$12.L$0 = str5;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$1 = str11;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$2 = null;
                        offlineReadsServiceImpl$downloadMediaRead$12.L$3 = list3;
                        offlineReadsServiceImpl$downloadMediaRead$12.J$0 = j12;
                        offlineReadsServiceImpl$downloadMediaRead$12.J$1 = longValue;
                        offlineReadsServiceImpl$downloadMediaRead$12.label = 6;
                        long j13 = longValue;
                        if (insertChapterEntities(j13, str5, arrayList, j12, offlineReadsServiceImpl$downloadMediaRead$12) != obj2) {
                            str7 = str11;
                            str8 = str5;
                            j10 = j13;
                            list2 = list3;
                            this.logger.log(TAG, "Created MEDIA offline read with id=" + j10 + " (" + list2.size() + " chapters)");
                            this.analytics.log(new Analytics.Event.OfflineDownloadStarted(str8, str7, OfflineReadEntity.Type.MEDIA.getValue(), Boolean.TRUE, new Integer(list2.size()), null, 32, null));
                            doSubmitWorkStep(j10);
                            return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                        }
                        return obj2;
                    case 6:
                        j10 = offlineReadsServiceImpl$downloadMediaRead$12.J$1;
                        list2 = (List) offlineReadsServiceImpl$downloadMediaRead$12.L$3;
                        String str12 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$1;
                        String str13 = (String) offlineReadsServiceImpl$downloadMediaRead$12.L$0;
                        sn.a.g(obj);
                        str7 = str12;
                        str8 = str13;
                        this.logger.log(TAG, "Created MEDIA offline read with id=" + j10 + " (" + list2.size() + " chapters)");
                        this.analytics.log(new Analytics.Event.OfflineDownloadStarted(str8, str7, OfflineReadEntity.Type.MEDIA.getValue(), Boolean.TRUE, new Integer(list2.size()), null, 32, null));
                        doSubmitWorkStep(j10);
                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        offlineReadsServiceImpl$downloadMediaRead$1 = new OfflineReadsServiceImpl$downloadMediaRead$1(this, cVar);
        OfflineReadsServiceImpl$downloadMediaRead$1 offlineReadsServiceImpl$downloadMediaRead$122 = offlineReadsServiceImpl$downloadMediaRead$1;
        Object obj3 = offlineReadsServiceImpl$downloadMediaRead$122.result;
        i10 = offlineReadsServiceImpl$downloadMediaRead$122.label;
        Object obj22 = xn.a.f37986a;
        switch (i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ef, code lost:
    
        if (r2 != r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r0.reEnqueueExpiredChapters(r1, r7) == r9) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00de, code lost:
    
        if (r2 == r9) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0115. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadTtsRead(String str, String str2, long j4, wn.c<? super DownloadReadResult> cVar) {
        OfflineReadsServiceImpl$downloadTtsRead$1 offlineReadsServiceImpl$downloadTtsRead$1;
        int i10;
        String str3;
        long j10;
        String str4;
        String str5;
        ApiResult apiResult;
        long j11;
        String str6;
        long j12;
        String str7;
        long longValue;
        List<ReadChapterEntity> list;
        String str8;
        String str9;
        long j13;
        List<ReadChapterEntity> list2;
        OfflineReadsServiceImpl offlineReadsServiceImpl = this;
        String str10 = str;
        if (cVar instanceof OfflineReadsServiceImpl$downloadTtsRead$1) {
            offlineReadsServiceImpl$downloadTtsRead$1 = (OfflineReadsServiceImpl$downloadTtsRead$1) cVar;
            int i11 = offlineReadsServiceImpl$downloadTtsRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$downloadTtsRead$1.label = i11 - Integer.MIN_VALUE;
                OfflineReadsServiceImpl$downloadTtsRead$1 offlineReadsServiceImpl$downloadTtsRead$12 = offlineReadsServiceImpl$downloadTtsRead$1;
                Object obj = offlineReadsServiceImpl$downloadTtsRead$12.result;
                i10 = offlineReadsServiceImpl$downloadTtsRead$12.label;
                Object obj2 = null;
                xn.a aVar = xn.a.f37986a;
                switch (i10) {
                    case 0:
                        sn.a.g(obj);
                        OfflineReadsDao offlineReadsDao = offlineReadsServiceImpl.offlineReadsDao;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$0 = str10;
                        str3 = str2;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$1 = str3;
                        j10 = j4;
                        offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j10;
                        offlineReadsServiceImpl$downloadTtsRead$12.label = 1;
                        obj = offlineReadsDao.getOfflineReadByReadId(str10, offlineReadsServiceImpl$downloadTtsRead$12);
                        break;
                    case 1:
                        j10 = offlineReadsServiceImpl$downloadTtsRead$12.J$0;
                        String str11 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$1;
                        String str12 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$0;
                        sn.a.g(obj);
                        str3 = str11;
                        str10 = str12;
                        OfflineReadEntity offlineReadEntity = (OfflineReadEntity) obj;
                        if (offlineReadEntity != null) {
                            offlineReadsServiceImpl.logger.log(TAG, "downloadTtsRead - existing entry id=" + offlineReadEntity.getId() + ", status=" + offlineReadEntity.getStatus());
                            switch (WhenMappings.$EnumSwitchMapping$0[offlineReadEntity.getStatus().ordinal()]) {
                                case 1:
                                    long id2 = offlineReadEntity.getId();
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$0 = null;
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$1 = null;
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$2 = null;
                                    offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j10;
                                    offlineReadsServiceImpl$downloadTtsRead$12.label = 2;
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                                case 6:
                                    long id3 = offlineReadEntity.getId();
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$0 = null;
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$1 = null;
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$2 = null;
                                    offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j10;
                                    offlineReadsServiceImpl$downloadTtsRead$12.label = 3;
                                    Object retryDownload = offlineReadsServiceImpl.retryDownload(id3, offlineReadsServiceImpl$downloadTtsRead$12);
                                    if (retryDownload != aVar) {
                                        return retryDownload;
                                    }
                                    break;
                                default:
                                    c6.p();
                                    return null;
                            }
                        } else {
                            ReadsAPI readsAPI = offlineReadsServiceImpl.readsAPI;
                            offlineReadsServiceImpl$downloadTtsRead$12.L$0 = str10;
                            offlineReadsServiceImpl$downloadTtsRead$12.L$1 = str3;
                            offlineReadsServiceImpl$downloadTtsRead$12.L$2 = null;
                            offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j10;
                            offlineReadsServiceImpl$downloadTtsRead$12.label = 4;
                            obj = readsAPI.convertAllChaptersForDownload(str10, str3, offlineReadsServiceImpl$downloadTtsRead$12);
                            if (obj != aVar) {
                                str4 = str10;
                                str5 = str3;
                                long j14 = j10;
                                apiResult = (ApiResult) obj;
                                if (!(apiResult instanceof ApiResult.Success)) {
                                    offlineReadsServiceImpl.logger.log(TAG, "convertAllChaptersForDownload() issued -> " + ((BulkConversionResponse) ((ApiResult.Success) apiResult).getData()).getChapters().size() + " chapters");
                                    long currentTimeMillis = System.currentTimeMillis();
                                    OfflineReadsDao offlineReadsDao2 = offlineReadsServiceImpl.offlineReadsDao;
                                    OfflineReadEntity offlineReadEntity2 = new OfflineReadEntity(0L, str4, str5, OfflineReadEntity.Type.TTS, j14, currentTimeMillis, currentTimeMillis, OfflineReadEntity.Status.DOWNLOADING_HTML, 0, null, null, 1537, null);
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$0 = str4;
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$1 = str5;
                                    offlineReadsServiceImpl$downloadTtsRead$12.L$2 = null;
                                    offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j14;
                                    offlineReadsServiceImpl$downloadTtsRead$12.J$1 = currentTimeMillis;
                                    offlineReadsServiceImpl$downloadTtsRead$12.label = 5;
                                    Object insert = offlineReadsDao2.insert(offlineReadEntity2, offlineReadsServiceImpl$downloadTtsRead$12);
                                    if (insert != aVar) {
                                        j11 = currentTimeMillis;
                                        str6 = str4;
                                        obj = insert;
                                        j12 = j14;
                                        str7 = str5;
                                        longValue = ((Number) obj).longValue();
                                        ReadsDao readsDao = offlineReadsServiceImpl.readsDao;
                                        offlineReadsServiceImpl$downloadTtsRead$12.L$0 = str6;
                                        offlineReadsServiceImpl$downloadTtsRead$12.L$1 = str7;
                                        offlineReadsServiceImpl$downloadTtsRead$12.L$2 = null;
                                        offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j12;
                                        offlineReadsServiceImpl$downloadTtsRead$12.J$1 = j11;
                                        offlineReadsServiceImpl$downloadTtsRead$12.J$2 = longValue;
                                        offlineReadsServiceImpl$downloadTtsRead$12.label = 6;
                                        obj = readsDao.getById(str6, offlineReadsServiceImpl$downloadTtsRead$12);
                                        break;
                                    }
                                } else {
                                    if (apiResult instanceof ApiResult.Error) {
                                        return offlineReadsServiceImpl.handleConvertError((ApiResult.Error) apiResult, str4, str5);
                                    }
                                    c6.p();
                                    return null;
                                }
                            }
                        }
                        return aVar;
                    case 2:
                        sn.a.g(obj);
                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                    case 3:
                        sn.a.g(obj);
                        return obj;
                    case 4:
                        j10 = offlineReadsServiceImpl$downloadTtsRead$12.J$0;
                        String str13 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$1;
                        String str14 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$0;
                        sn.a.g(obj);
                        str5 = str13;
                        str4 = str14;
                        long j142 = j10;
                        apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                        }
                        break;
                    case 5:
                        long j15 = offlineReadsServiceImpl$downloadTtsRead$12.J$1;
                        long j16 = offlineReadsServiceImpl$downloadTtsRead$12.J$0;
                        str7 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$1;
                        str6 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$0;
                        sn.a.g(obj);
                        j12 = j16;
                        j11 = j15;
                        longValue = ((Number) obj).longValue();
                        ReadsDao readsDao2 = offlineReadsServiceImpl.readsDao;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$0 = str6;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$1 = str7;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$2 = null;
                        offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j12;
                        offlineReadsServiceImpl$downloadTtsRead$12.J$1 = j11;
                        offlineReadsServiceImpl$downloadTtsRead$12.J$2 = longValue;
                        offlineReadsServiceImpl$downloadTtsRead$12.label = 6;
                        obj = readsDao2.getById(str6, offlineReadsServiceImpl$downloadTtsRead$12);
                        break;
                    case 6:
                        longValue = offlineReadsServiceImpl$downloadTtsRead$12.J$2;
                        j11 = offlineReadsServiceImpl$downloadTtsRead$12.J$1;
                        j12 = offlineReadsServiceImpl$downloadTtsRead$12.J$0;
                        str7 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$1;
                        str6 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$0;
                        sn.a.g(obj);
                        long j17 = j12;
                        long j18 = j11;
                        String str15 = str7;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
                        if (readMetaEntityWithChapters != null) {
                            list = readMetaEntityWithChapters.getChapters();
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = t.f33547a;
                        }
                        List<ReadChapterEntity> list3 = list;
                        ArrayList arrayList = new ArrayList(p.a0(list3, 10));
                        for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                            arrayList.add(new sn.k(new Integer(((ReadChapterEntity) it.next()).getChapter_index()), null));
                            obj2 = null;
                        }
                        offlineReadsServiceImpl$downloadTtsRead$12.L$0 = str6;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$1 = str15;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$2 = obj2;
                        offlineReadsServiceImpl$downloadTtsRead$12.L$3 = list3;
                        offlineReadsServiceImpl$downloadTtsRead$12.J$0 = j17;
                        offlineReadsServiceImpl$downloadTtsRead$12.J$1 = j18;
                        offlineReadsServiceImpl$downloadTtsRead$12.J$2 = longValue;
                        offlineReadsServiceImpl$downloadTtsRead$12.label = 7;
                        offlineReadsServiceImpl = this;
                        long j19 = longValue;
                        if (offlineReadsServiceImpl.insertChapterEntities(j19, str6, arrayList, j18, offlineReadsServiceImpl$downloadTtsRead$12) != aVar) {
                            str8 = str15;
                            str9 = str6;
                            j13 = j19;
                            list2 = list3;
                            offlineReadsServiceImpl.logger.log(TAG, "Created TTS offline read with id=" + j13 + " (" + list2.size() + " chapters)");
                            offlineReadsServiceImpl.analytics.log(new Analytics.Event.OfflineDownloadStarted(str9, str8, OfflineReadEntity.Type.TTS.getValue(), Boolean.TRUE, new Integer(list2.size()), null, 32, null));
                            offlineReadsServiceImpl.doSubmitWorkStep(j13);
                            return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                        }
                        return aVar;
                    case 7:
                        j13 = offlineReadsServiceImpl$downloadTtsRead$12.J$2;
                        list2 = (List) offlineReadsServiceImpl$downloadTtsRead$12.L$3;
                        String str16 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$1;
                        String str17 = (String) offlineReadsServiceImpl$downloadTtsRead$12.L$0;
                        sn.a.g(obj);
                        str8 = str16;
                        str9 = str17;
                        offlineReadsServiceImpl.logger.log(TAG, "Created TTS offline read with id=" + j13 + " (" + list2.size() + " chapters)");
                        offlineReadsServiceImpl.analytics.log(new Analytics.Event.OfflineDownloadStarted(str9, str8, OfflineReadEntity.Type.TTS.getValue(), Boolean.TRUE, new Integer(list2.size()), null, 32, null));
                        offlineReadsServiceImpl.doSubmitWorkStep(j13);
                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        offlineReadsServiceImpl$downloadTtsRead$1 = new OfflineReadsServiceImpl$downloadTtsRead$1(offlineReadsServiceImpl, cVar);
        OfflineReadsServiceImpl$downloadTtsRead$1 offlineReadsServiceImpl$downloadTtsRead$122 = offlineReadsServiceImpl$downloadTtsRead$1;
        Object obj3 = offlineReadsServiceImpl$downloadTtsRead$122.result;
        i10 = offlineReadsServiceImpl$downloadTtsRead$122.label;
        Object obj22 = null;
        xn.a aVar2 = xn.a.f37986a;
        switch (i10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> DownloadReadResult handleConvertError(ApiResult.Error<T> result, String readId, String voiceId) {
        Object obj;
        InsufficientOfflineDownloadCreditsData insufficientOfflineDownloadCreditsData;
        Double d10;
        double d11;
        kotlinx.serialization.json.b data;
        int i10;
        Object obj2 = null;
        if (result instanceof ApiResult.Error.ApiError) {
            ApiResult.Error.ApiError apiError = (ApiResult.Error.ApiError) result;
            if (m.c(apiError.getCode(), "offline_conversion_limit_reached")) {
                vr.c cVar = this.json;
                Logger logger = this.logger;
                try {
                    kotlinx.serialization.json.b data2 = apiError.getData();
                    if (data2 != null) {
                        cVar.getClass();
                        obj2 = cVar.a(LimitedBasedReadApiErrorData.INSTANCE.serializer(), data2);
                    }
                } catch (qr.h e10) {
                    if (logger != null) {
                        logger.logWarning("ApiError", defpackage.f.C("Failed to decode ", e0.f20562a.b(LimitedBasedReadApiErrorData.class).n(), " from API error data"), e10);
                    }
                }
                LimitedBasedReadApiErrorData limitedBasedReadApiErrorData = (LimitedBasedReadApiErrorData) obj2;
                this.logger.log(TAG, "Convert failed: OfflineConversionLimitReached");
                this.analytics.log(new Analytics.Event.OfflineDownloadFinished(readId, voiceId, Constants.IPC_BUNDLE_KEY_SEND_ERROR, OfflineReadEntity.Type.TTS.getValue(), "offline_conversion_limit_reached", apiError.getMessage(), null, 64, null));
                String message = apiError.getMessage();
                boolean z6 = false;
                if (limitedBasedReadApiErrorData != null) {
                    i10 = limitedBasedReadApiErrorData.getLimit();
                } else {
                    i10 = 0;
                }
                if (limitedBasedReadApiErrorData != null) {
                    z6 = limitedBasedReadApiErrorData.getCanUpgrade();
                }
                return new DownloadReadResult.Error.OfflineConversionLimitReached(message, i10, z6);
            }
            if (m.c(apiError.getCode(), "insufficient_offline_download_credits")) {
                vr.c cVar2 = this.json;
                Logger logger2 = this.logger;
                try {
                    data = apiError.getData();
                } catch (qr.h e11) {
                    if (logger2 != null) {
                        logger2.logWarning("ApiError", defpackage.f.C("Failed to decode ", e0.f20562a.b(InsufficientOfflineDownloadCreditsData.class).n(), " from API error data"), e11);
                    }
                }
                if (data != null) {
                    cVar2.getClass();
                    obj = cVar2.a(InsufficientOfflineDownloadCreditsData.INSTANCE.serializer(), data);
                    insufficientOfflineDownloadCreditsData = (InsufficientOfflineDownloadCreditsData) obj;
                    Logger logger3 = this.logger;
                    if (insufficientOfflineDownloadCreditsData == null) {
                        d10 = Double.valueOf(insufficientOfflineDownloadCreditsData.getRequired());
                    } else {
                        d10 = null;
                    }
                    if (insufficientOfflineDownloadCreditsData != null) {
                        obj2 = Double.valueOf(insufficientOfflineDownloadCreditsData.getAvailable());
                    }
                    logger3.log(TAG, "Convert failed: InsufficientOfflineDownloadCredits required=" + d10 + " available=" + obj2);
                    this.analytics.log(new Analytics.Event.OfflineDownloadFinished(readId, voiceId, Constants.IPC_BUNDLE_KEY_SEND_ERROR, OfflineReadEntity.Type.TTS.getValue(), "insufficient_offline_download_credits", apiError.getMessage(), null, 64, null));
                    String message2 = apiError.getMessage();
                    double d12 = 0.0d;
                    if (insufficientOfflineDownloadCreditsData == null) {
                        d11 = insufficientOfflineDownloadCreditsData.getRequired();
                    } else {
                        d11 = 0.0d;
                    }
                    if (insufficientOfflineDownloadCreditsData != null) {
                        d12 = insufficientOfflineDownloadCreditsData.getAvailable();
                    }
                    return new DownloadReadResult.Error.InsufficientOfflineDownloadCredits(message2, d11, d12);
                }
                obj = null;
                insufficientOfflineDownloadCreditsData = (InsufficientOfflineDownloadCreditsData) obj;
                Logger logger32 = this.logger;
                if (insufficientOfflineDownloadCreditsData == null) {
                }
                if (insufficientOfflineDownloadCreditsData != null) {
                }
                logger32.log(TAG, "Convert failed: InsufficientOfflineDownloadCredits required=" + d10 + " available=" + obj2);
                this.analytics.log(new Analytics.Event.OfflineDownloadFinished(readId, voiceId, Constants.IPC_BUNDLE_KEY_SEND_ERROR, OfflineReadEntity.Type.TTS.getValue(), "insufficient_offline_download_credits", apiError.getMessage(), null, 64, null));
                String message22 = apiError.getMessage();
                double d122 = 0.0d;
                if (insufficientOfflineDownloadCreditsData == null) {
                }
                if (insufficientOfflineDownloadCreditsData != null) {
                }
                return new DownloadReadResult.Error.InsufficientOfflineDownloadCredits(message22, d11, d122);
            }
            boolean c5 = m.c(apiError.getCode(), "free_plan_not_allowed");
            Analytics analytics = this.analytics;
            if (c5) {
                analytics.log(new Analytics.Event.OfflineDownloadFinished(readId, voiceId, Constants.IPC_BUNDLE_KEY_SEND_ERROR, OfflineReadEntity.Type.TTS.getValue(), "free_plan_not_allowed", null, null, 96, null));
                return DownloadReadResult.Error.UserIsOnFreePlan.INSTANCE;
            }
            analytics.log(new Analytics.Event.OfflineDownloadFinished(readId, voiceId, Constants.IPC_BUNDLE_KEY_SEND_ERROR, OfflineReadEntity.Type.TTS.getValue(), apiError.getCode(), apiError.getMessage(), null, 64, null));
            return new DownloadReadResult.Error.ApiDisplayableMessageError(apiError.getCode(), apiError.getMessage());
        }
        boolean z10 = result instanceof ApiResult.Error.NetworkError;
        Logger logger4 = this.logger;
        if (z10) {
            logger4.log(TAG, "Convert network failure");
            return DownloadReadResult.Error.Network.INSTANCE;
        }
        logger4.logError(TAG, "Convert unexpected failure - result=" + result, null);
        return new DownloadReadResult.Error.Unhandled(result.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object insertChapterEntities(long j4, String str, List<sn.k> list, long j10, wn.c<? super z> cVar) {
        long j11 = j10 + OfflineChapterEntity.EXPIRY_MILLIS;
        OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        for (sn.k kVar : list) {
            int intValue = ((Number) kVar.f31600a).intValue();
            String str2 = (String) kVar.f31601b;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new OfflineChapterEntity(j4, str, intValue, str2, OfflineChapterEntity.Status.PENDING, 0, null, null, j10, j11, 224, null));
            arrayList = arrayList2;
        }
        Object insertChapters = offlineReadsDao.insertChapters(arrayList, cVar);
        if (insertChapters == xn.a.f37986a) {
            return insertChapters;
        }
        return z.f31622a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        if (r3 == r10) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reEnqueueExpiredChapters(long j4, wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$reEnqueueExpiredChapters$1 offlineReadsServiceImpl$reEnqueueExpiredChapters$1;
        int i10;
        boolean isEmpty;
        long currentTimeMillis;
        long j10;
        Iterator it;
        long j11;
        long j12;
        long j13 = j4;
        if (cVar instanceof OfflineReadsServiceImpl$reEnqueueExpiredChapters$1) {
            offlineReadsServiceImpl$reEnqueueExpiredChapters$1 = (OfflineReadsServiceImpl$reEnqueueExpiredChapters$1) cVar;
            int i11 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.result;
                i10 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.label;
                z zVar = z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                j11 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$0;
                                sn.a.g(obj);
                                doSubmitWorkStep(j11);
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j14 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$2;
                        currentTimeMillis = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$1;
                        long j15 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$0;
                        it = (Iterator) offlineReadsServiceImpl$reEnqueueExpiredChapters$1.L$1;
                        sn.a.g(obj);
                        j10 = j14;
                        j13 = j15;
                        while (true) {
                            if (!it.hasNext()) {
                                OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) it.next();
                                OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                                int chapterIndex = offlineChapterEntity.getChapterIndex();
                                OfflineChapterEntity.Status status = OfflineChapterEntity.Status.PENDING;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.L$0 = null;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.L$1 = it;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.L$2 = null;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$0 = j13;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$1 = currentTimeMillis;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$2 = j10;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.label = 2;
                                j12 = j13;
                                if (offlineReadsDao.updateChapterStatusAndExpiry(j12, chapterIndex, status, 0, j10, offlineReadsServiceImpl$reEnqueueExpiredChapters$1) == aVar) {
                                    break;
                                }
                                j13 = j12;
                            } else {
                                long j16 = j13;
                                OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.L$0 = null;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.L$1 = null;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.L$2 = null;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$0 = j16;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$1 = currentTimeMillis;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$2 = j10;
                                offlineReadsServiceImpl$reEnqueueExpiredChapters$1.label = 3;
                                if (offlineReadsDao2.recomputeReadAggregate(j16, offlineReadsServiceImpl$reEnqueueExpiredChapters$1) != aVar) {
                                    j11 = j16;
                                }
                            }
                        }
                        return aVar;
                    }
                    j13 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                    offlineReadsServiceImpl$reEnqueueExpiredChapters$1.J$0 = j13;
                    offlineReadsServiceImpl$reEnqueueExpiredChapters$1.label = 1;
                    obj = offlineReadsDao3.getChaptersForRead(j13, offlineReadsServiceImpl$reEnqueueExpiredChapters$1);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((OfflineChapterEntity) obj2).getStatus() == OfflineChapterEntity.Status.EXPIRED) {
                        arrayList.add(obj2);
                    }
                }
                isEmpty = arrayList.isEmpty();
                Logger logger = this.logger;
                if (!isEmpty) {
                    logger.log(TAG, "reEnqueueExpiredChapters - no expired chapters");
                    return zVar;
                }
                logger.log(TAG, "reEnqueueExpiredChapters - resetting " + arrayList.size() + " expired chapter(s)");
                currentTimeMillis = System.currentTimeMillis();
                j10 = OfflineChapterEntity.EXPIRY_MILLIS + currentTimeMillis;
                it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                    j13 = j12;
                }
                return aVar;
            }
        }
        offlineReadsServiceImpl$reEnqueueExpiredChapters$1 = new OfflineReadsServiceImpl$reEnqueueExpiredChapters$1(this, cVar);
        Object obj3 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.result;
        i10 = offlineReadsServiceImpl$reEnqueueExpiredChapters$1.label;
        z zVar2 = z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r3.hasNext()) {
        }
        isEmpty = arrayList2.isEmpty();
        Logger logger2 = this.logger;
        if (!isEmpty) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0002, B:5:0x0021, B:9:0x002b, B:11:0x0031, B:13:0x003a, B:14:0x003f, B:15:0x0051), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Type inference failed for: r2v2, types: [w7.h0, w7.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeHlsCache(String manifestUrl) {
        boolean z6;
        m0 m0Var;
        try {
            w7.g0 g0Var = new w7.g0();
            lb.a aVar = new lb.a();
            List list = Collections.EMPTY_LIST;
            w1 w1Var = w1.f11531e;
            k0 k0Var = new k0();
            n0 n0Var = n0.f36483d;
            Uri parse = Uri.parse(manifestUrl);
            if (((Uri) aVar.f21640e) != null && ((UUID) aVar.f21639d) == null) {
                z6 = false;
                gg.b.y(z6);
                if (parse == null) {
                    j0 j0Var = null;
                    if (((UUID) aVar.f21639d) != null) {
                        j0Var = new j0(aVar);
                    }
                    m0Var = new m0(parse, null, j0Var, null, list, null, w1Var, -9223372036854775807L);
                } else {
                    m0Var = null;
                }
                w7.r0 r0Var = new w7.r0("", new h0(g0Var), m0Var, new l0(k0Var), u0.L, n0Var);
                d8.d dVar = new d8.d();
                dVar.f7504a = this.simpleCache;
                l8.a aVar2 = new l8.a(dVar);
                new l8.b(r0Var, aVar2.f21422b, aVar2.f21421a, aVar2.f21423c, aVar2.f21424d, aVar2.f21425e).f();
            }
            z6 = true;
            gg.b.y(z6);
            if (parse == null) {
            }
            w7.r0 r0Var2 = new w7.r0("", new h0(g0Var), m0Var, new l0(k0Var), u0.L, n0Var);
            d8.d dVar2 = new d8.d();
            dVar2.f7504a = this.simpleCache;
            l8.a aVar22 = new l8.a(dVar2);
            new l8.b(r0Var2, aVar22.f21422b, aVar22.f21421a, aVar22.f21423c, aVar22.f21424d, aVar22.f21425e).f();
        } catch (Exception e10) {
            this.logger.logError(TAG, "Failed to remove HLS cache for " + manifestUrl, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scheduleDrmRelease(OfflineReadEntity offlineReadEntity, wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$scheduleDrmRelease$1 offlineReadsServiceImpl$scheduleDrmRelease$1;
        int i10;
        List<OfflineChapterEntity> list;
        Iterator<T> it;
        String drmKeySetIds;
        Map<String, byte[]> decodeDrmKeySetIds;
        if (cVar instanceof OfflineReadsServiceImpl$scheduleDrmRelease$1) {
            offlineReadsServiceImpl$scheduleDrmRelease$1 = (OfflineReadsServiceImpl$scheduleDrmRelease$1) cVar;
            int i11 = offlineReadsServiceImpl$scheduleDrmRelease$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$scheduleDrmRelease$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineReadsServiceImpl$scheduleDrmRelease$1.result;
                i10 = offlineReadsServiceImpl$scheduleDrmRelease$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        offlineReadEntity = (OfflineReadEntity) offlineReadsServiceImpl$scheduleDrmRelease$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                    long id2 = offlineReadEntity.getId();
                    offlineReadsServiceImpl$scheduleDrmRelease$1.L$0 = offlineReadEntity;
                    offlineReadsServiceImpl$scheduleDrmRelease$1.label = 1;
                    obj = offlineReadsDao.getChaptersForRead(id2, offlineReadsServiceImpl$scheduleDrmRelease$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                list = (List) obj;
                z zVar = z.f31622a;
                if (list != null || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((OfflineChapterEntity) it.next()).getDrmKeySetId() != null) {
                            scheduleDrmRelease(offlineReadEntity.getReadId(), list);
                            break;
                        }
                    }
                }
                drmKeySetIds = offlineReadEntity.getDrmKeySetIds();
                if (drmKeySetIds != null && (decodeDrmKeySetIds = OfflineDrmLicenseHelper.INSTANCE.decodeDrmKeySetIds(drmKeySetIds)) != null) {
                    if (decodeDrmKeySetIds.isEmpty()) {
                        decodeDrmKeySetIds = null;
                    }
                    if (decodeDrmKeySetIds != null) {
                        DrmLicenseReleaseWorker.Companion companion = DrmLicenseReleaseWorker.INSTANCE;
                        Context context = this.context;
                        String readId = offlineReadEntity.getReadId();
                        List<String> g12 = tn.o.g1(decodeDrmKeySetIds.keySet());
                        Collection<byte[]> values = decodeDrmKeySetIds.values();
                        ArrayList arrayList = new ArrayList(p.a0(values, 10));
                        Iterator<T> it2 = values.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Base64.encodeToString((byte[]) it2.next(), 2));
                        }
                        companion.schedule(context, readId, g12, arrayList);
                    }
                }
                return zVar;
            }
        }
        offlineReadsServiceImpl$scheduleDrmRelease$1 = new OfflineReadsServiceImpl$scheduleDrmRelease$1(this, cVar);
        Object obj2 = offlineReadsServiceImpl$scheduleDrmRelease$1.result;
        i10 = offlineReadsServiceImpl$scheduleDrmRelease$1.label;
        if (i10 == 0) {
        }
        list = (List) obj2;
        z zVar2 = z.f31622a;
        if (list != null) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        drmKeySetIds = offlineReadEntity.getDrmKeySetIds();
        if (drmKeySetIds != null) {
            if (decodeDrmKeySetIds.isEmpty()) {
            }
            if (decodeDrmKeySetIds != null) {
            }
        }
        return zVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d5, code lost:
    
        if (r15.getType() != io.elevenlabs.data.database.entities.offline.OfflineReadEntity.Type.TTS) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d7, code lost:
    
        r1 = r22.offlineReadsDao;
        r2.L$0 = null;
        r2.L$1 = r13;
        r2.L$2 = r15;
        r2.L$3 = null;
        r2.L$4 = r9;
        r2.L$5 = null;
        r2.L$6 = null;
        r2.J$0 = r5;
        r2.J$1 = r7;
        r2.label = 5;
        r1 = r1.getChaptersForRead(r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f3, code lost:
    
        if (r1 != r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d0, code lost:
    
        if (r1 == r12) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce A[EDGE_INSN: B:60:0x01ce->B:61:0x01ce BREAK  A[LOOP:1: B:49:0x018e->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x012b -> B:23:0x00ee). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d5 -> B:22:0x023f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01f3 -> B:14:0x01f6). Please report as a decompilation issue!!! */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object cleanupExpiredDownloads(wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$cleanupExpiredDownloads$1 offlineReadsServiceImpl$cleanupExpiredDownloads$1;
        int i10;
        long currentTimeMillis;
        List list;
        Iterator it;
        OfflineReadEntity offlineReadEntity;
        Iterator it2;
        List list2;
        long j4;
        Iterator it3;
        String cachedManifestUrl;
        long j10;
        long j11;
        OfflineReadEntity offlineReadEntity2;
        Iterator it4;
        OfflineReadEntity offlineReadEntity3;
        if (cVar instanceof OfflineReadsServiceImpl$cleanupExpiredDownloads$1) {
            offlineReadsServiceImpl$cleanupExpiredDownloads$1 = (OfflineReadsServiceImpl$cleanupExpiredDownloads$1) cVar;
            int i11 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$cleanupExpiredDownloads$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineReadsServiceImpl$cleanupExpiredDownloads$1.result;
                i10 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.label;
                z zVar = z.f31622a;
                Object obj2 = null;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        long j12 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$1;
                                        currentTimeMillis = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0;
                                        list2 = (List) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$4;
                                        offlineReadEntity = (OfflineReadEntity) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$2;
                                        Iterator it5 = (Iterator) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$1;
                                        sn.a.g(obj);
                                        j4 = j12;
                                        it2 = it5;
                                        List list3 = (List) obj;
                                        if (list3 == null || !list3.isEmpty()) {
                                            Iterator it6 = list3.iterator();
                                            while (it6.hasNext()) {
                                                if (((OfflineChapterEntity) it6.next()).getStatus() == OfflineChapterEntity.Status.READY) {
                                                    break;
                                                }
                                            }
                                        }
                                        File readDownloadDir = OfflineReadsDownloaderKt.getReadDownloadDir(this.context, offlineReadEntity.getReadId(), offlineReadEntity.getVoiceId());
                                        if (readDownloadDir.exists()) {
                                            eo.k.h0(readDownloadDir);
                                        }
                                        ib.i.r("Deleted TTS audio folder for readId=", offlineReadEntity.getReadId(), this.logger, TAG);
                                        it = it2;
                                        this.analytics.log(new Analytics.Event.OfflineDownloadExpired(offlineReadEntity.getReadId(), offlineReadEntity.getVoiceId(), offlineReadEntity.getType().getValue()));
                                        this.logger.log(TAG, "Marked " + list2.size() + " chapter(s) as EXPIRED for offlineReadId=" + j4);
                                        obj2 = null;
                                        if (it.hasNext()) {
                                            long longValue = ((Number) it.next()).longValue();
                                            OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$0 = obj2;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$1 = it;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$2 = obj2;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$3 = obj2;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$4 = obj2;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$5 = obj2;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$6 = obj2;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0 = currentTimeMillis;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$1 = longValue;
                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.label = 2;
                                            Object offlineReadById = offlineReadsDao.getOfflineReadById(longValue, offlineReadsServiceImpl$cleanupExpiredDownloads$1);
                                            if (offlineReadById != aVar) {
                                                it4 = it;
                                                obj = offlineReadById;
                                                j10 = currentTimeMillis;
                                                j11 = longValue;
                                                offlineReadEntity3 = (OfflineReadEntity) obj;
                                                if (offlineReadEntity3 != null) {
                                                    it = it4;
                                                    currentTimeMillis = j10;
                                                    if (it.hasNext()) {
                                                        return zVar;
                                                    }
                                                } else {
                                                    OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                                                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$0 = obj2;
                                                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$1 = it4;
                                                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$2 = offlineReadEntity3;
                                                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0 = j10;
                                                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$1 = j11;
                                                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.label = 3;
                                                    Object chaptersForRead = offlineReadsDao2.getChaptersForRead(j11, offlineReadsServiceImpl$cleanupExpiredDownloads$1);
                                                    if (chaptersForRead != aVar) {
                                                        Iterator it7 = it4;
                                                        offlineReadEntity2 = offlineReadEntity3;
                                                        obj = chaptersForRead;
                                                        it2 = it7;
                                                        ArrayList arrayList = new ArrayList();
                                                        for (Object obj3 : (List) obj) {
                                                            OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) obj3;
                                                            if (offlineChapterEntity.getStatus() == OfflineChapterEntity.Status.READY && offlineChapterEntity.getExpiresAtUnix() <= j10) {
                                                                arrayList.add(obj3);
                                                            }
                                                        }
                                                        scheduleDrmRelease(offlineReadEntity2.getReadId(), arrayList);
                                                        Iterator it8 = arrayList.iterator();
                                                        long j13 = j10;
                                                        j4 = j11;
                                                        currentTimeMillis = j13;
                                                        list2 = arrayList;
                                                        offlineReadEntity = offlineReadEntity2;
                                                        it3 = it8;
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            OfflineChapterEntity offlineChapterEntity2 = (OfflineChapterEntity) it3.next();
                                                            if (offlineReadEntity.getType() == OfflineReadEntity.Type.MEDIA && (cachedManifestUrl = offlineChapterEntity2.getCachedManifestUrl()) != null) {
                                                                removeHlsCache(cachedManifestUrl);
                                                            }
                                                            OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                                                            int chapterIndex = offlineChapterEntity2.getChapterIndex();
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$0 = null;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$1 = it2;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$2 = offlineReadEntity;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$3 = null;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$4 = list2;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$5 = it3;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$6 = null;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0 = currentTimeMillis;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$1 = j4;
                                                            offlineReadsServiceImpl$cleanupExpiredDownloads$1.label = 4;
                                                            if (offlineReadsDao3.markChapterExpired(j4, chapterIndex, offlineReadsServiceImpl$cleanupExpiredDownloads$1) == aVar) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            return aVar;
                                        }
                                    } else {
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    long j14 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$1;
                                    long j15 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0;
                                    it3 = (Iterator) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$5;
                                    List list4 = (List) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$4;
                                    OfflineReadEntity offlineReadEntity4 = (OfflineReadEntity) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$2;
                                    Iterator it9 = (Iterator) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$1;
                                    sn.a.g(obj);
                                    list2 = list4;
                                    j4 = j14;
                                    currentTimeMillis = j15;
                                    it2 = it9;
                                    offlineReadEntity = offlineReadEntity4;
                                    while (true) {
                                        if (!it3.hasNext()) {
                                        }
                                    }
                                    return aVar;
                                }
                            } else {
                                j11 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$1;
                                j10 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0;
                                offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$2;
                                Iterator it10 = (Iterator) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$1;
                                sn.a.g(obj);
                                it2 = it10;
                                ArrayList arrayList2 = new ArrayList();
                                while (r1.hasNext()) {
                                }
                                scheduleDrmRelease(offlineReadEntity2.getReadId(), arrayList2);
                                Iterator it82 = arrayList2.iterator();
                                long j132 = j10;
                                j4 = j11;
                                currentTimeMillis = j132;
                                list2 = arrayList2;
                                offlineReadEntity = offlineReadEntity2;
                                it3 = it82;
                                while (true) {
                                    if (!it3.hasNext()) {
                                    }
                                }
                                return aVar;
                            }
                        } else {
                            j11 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$1;
                            j10 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0;
                            it4 = (Iterator) offlineReadsServiceImpl$cleanupExpiredDownloads$1.L$1;
                            sn.a.g(obj);
                            offlineReadEntity3 = (OfflineReadEntity) obj;
                            if (offlineReadEntity3 != null) {
                            }
                        }
                    } else {
                        currentTimeMillis = offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    OfflineReadsDao offlineReadsDao4 = this.offlineReadsDao;
                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.J$0 = currentTimeMillis;
                    offlineReadsServiceImpl$cleanupExpiredDownloads$1.label = 1;
                    obj = offlineReadsDao4.getOfflineReadIdsWithExpiredChapters(currentTimeMillis, offlineReadsServiceImpl$cleanupExpiredDownloads$1);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return zVar;
                }
                ib.i.q("cleanupExpiredDownloads - found ", list.size(), " read(s) with expired chapters", this.logger, TAG);
                it = list.iterator();
                if (it.hasNext()) {
                }
            }
        }
        offlineReadsServiceImpl$cleanupExpiredDownloads$1 = new OfflineReadsServiceImpl$cleanupExpiredDownloads$1(this, cVar);
        Object obj4 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.result;
        i10 = offlineReadsServiceImpl$cleanupExpiredDownloads$1.label;
        z zVar2 = z.f31622a;
        Object obj22 = null;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        list = (List) obj4;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r2 == r11) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object downloadAllChapters(String str, String str2, long j4, wn.c<? super DownloadReadResult> cVar) {
        OfflineReadsServiceImpl$downloadAllChapters$1 offlineReadsServiceImpl$downloadAllChapters$1;
        int i10;
        ?? r92;
        Object obj;
        String str3;
        long j10;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        ReadMetaEntity readMetaEntity;
        String str4;
        boolean c5;
        OfflineReadEntity.Type type;
        Object u6;
        String str5;
        String str6;
        int i11;
        long j11;
        boolean z6;
        OfflineReadEntity.Type type2;
        String str7 = str;
        if (cVar instanceof OfflineReadsServiceImpl$downloadAllChapters$1) {
            offlineReadsServiceImpl$downloadAllChapters$1 = (OfflineReadsServiceImpl$downloadAllChapters$1) cVar;
            int i12 = offlineReadsServiceImpl$downloadAllChapters$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$downloadAllChapters$1.label = i12 - Integer.MIN_VALUE;
                OfflineReadsServiceImpl$downloadAllChapters$1 offlineReadsServiceImpl$downloadAllChapters$12 = offlineReadsServiceImpl$downloadAllChapters$1;
                Object obj2 = offlineReadsServiceImpl$downloadAllChapters$12.result;
                i10 = offlineReadsServiceImpl$downloadAllChapters$12.label;
                r92 = 1;
                obj = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 4) {
                                sn.a.g(obj2);
                                return obj2;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i11 = offlineReadsServiceImpl$downloadAllChapters$12.I$0;
                        z6 = offlineReadsServiceImpl$downloadAllChapters$12.Z$0;
                        j11 = offlineReadsServiceImpl$downloadAllChapters$12.J$0;
                        type2 = (OfflineReadEntity.Type) offlineReadsServiceImpl$downloadAllChapters$12.L$3;
                        String str8 = (String) offlineReadsServiceImpl$downloadAllChapters$12.L$1;
                        String str9 = (String) offlineReadsServiceImpl$downloadAllChapters$12.L$0;
                        sn.a.g(obj2);
                        str6 = str8;
                        str5 = str9;
                        if (!((Customer) obj2).isFreeUser()) {
                            this.logger.log(TAG, "Download blocked: user is on free plan");
                            this.analytics.log(new Analytics.Event.OfflineDownloadFinished(str5, str6, Constants.IPC_BUNDLE_KEY_SEND_ERROR, type2.getValue(), "free_plan_not_allowed", null, null, 96, null));
                            return DownloadReadResult.Error.UserIsOnFreePlan.INSTANCE;
                        }
                        String str10 = str5;
                        String str11 = str6;
                        if (z6) {
                            offlineReadsServiceImpl$downloadAllChapters$12.L$0 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$1 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$2 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$3 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$4 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.J$0 = j11;
                            offlineReadsServiceImpl$downloadAllChapters$12.Z$0 = z6;
                            offlineReadsServiceImpl$downloadAllChapters$12.I$0 = i11;
                            offlineReadsServiceImpl$downloadAllChapters$12.label = 3;
                            Object downloadMediaRead = downloadMediaRead(str10, str11, offlineReadsServiceImpl$downloadAllChapters$12);
                            if (downloadMediaRead != obj) {
                                return downloadMediaRead;
                            }
                        } else {
                            offlineReadsServiceImpl$downloadAllChapters$12.L$0 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$1 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$2 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$3 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.L$4 = null;
                            offlineReadsServiceImpl$downloadAllChapters$12.J$0 = j11;
                            offlineReadsServiceImpl$downloadAllChapters$12.Z$0 = z6;
                            offlineReadsServiceImpl$downloadAllChapters$12.I$0 = i11;
                            offlineReadsServiceImpl$downloadAllChapters$12.label = 4;
                            Object downloadTtsRead = downloadTtsRead(str10, str11, j11, offlineReadsServiceImpl$downloadAllChapters$12);
                            if (downloadTtsRead != obj) {
                                return downloadTtsRead;
                            }
                        }
                        return obj;
                    }
                    j10 = offlineReadsServiceImpl$downloadAllChapters$12.J$0;
                    String str12 = (String) offlineReadsServiceImpl$downloadAllChapters$12.L$1;
                    String str13 = (String) offlineReadsServiceImpl$downloadAllChapters$12.L$0;
                    sn.a.g(obj2);
                    str3 = str12;
                    str7 = str13;
                } else {
                    sn.a.g(obj2);
                    ReadsDao readsDao = this.readsDao;
                    offlineReadsServiceImpl$downloadAllChapters$12.L$0 = str7;
                    str3 = str2;
                    offlineReadsServiceImpl$downloadAllChapters$12.L$1 = str3;
                    j10 = j4;
                    offlineReadsServiceImpl$downloadAllChapters$12.J$0 = j10;
                    offlineReadsServiceImpl$downloadAllChapters$12.label = 1;
                    obj2 = readsDao.getById(str7, offlineReadsServiceImpl$downloadAllChapters$12);
                }
                readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj2;
                if (readMetaEntityWithChapters == null) {
                    readMetaEntity = readMetaEntityWithChapters.getMeta();
                } else {
                    readMetaEntity = null;
                }
                if (readMetaEntity == null) {
                    str4 = readMetaEntity.getAudio_type();
                } else {
                    str4 = null;
                }
                c5 = m.c(str4, ReadMetadataResponseModel.AudioType.MEDIA.getValue());
                if (readMetaEntity != null || !readMetaEntity.getUse_drm()) {
                    r92 = 0;
                }
                if (!c5) {
                    type = OfflineReadEntity.Type.MEDIA;
                } else {
                    type = OfflineReadEntity.Type.TTS;
                }
                Logger logger = this.logger;
                StringBuilder s10 = defpackage.f.s("downloadAllChapters - readId=", str7, ", type=", type.getValue(), ", drm=");
                s10.append((boolean) r92);
                logger.log(TAG, s10.toString());
                ir.i customer = this.customerService.getCustomer();
                offlineReadsServiceImpl$downloadAllChapters$12.L$0 = str7;
                offlineReadsServiceImpl$downloadAllChapters$12.L$1 = str3;
                offlineReadsServiceImpl$downloadAllChapters$12.L$2 = null;
                offlineReadsServiceImpl$downloadAllChapters$12.L$3 = type;
                offlineReadsServiceImpl$downloadAllChapters$12.J$0 = j10;
                offlineReadsServiceImpl$downloadAllChapters$12.Z$0 = c5;
                offlineReadsServiceImpl$downloadAllChapters$12.I$0 = r92;
                offlineReadsServiceImpl$downloadAllChapters$12.label = 2;
                u6 = ir.r.u(customer, offlineReadsServiceImpl$downloadAllChapters$12);
                if (u6 != obj) {
                    str5 = str7;
                    str6 = str3;
                    i11 = r92;
                    j11 = j10;
                    z6 = c5;
                    type2 = type;
                    obj2 = u6;
                    if (!((Customer) obj2).isFreeUser()) {
                    }
                }
                return obj;
            }
        }
        offlineReadsServiceImpl$downloadAllChapters$1 = new OfflineReadsServiceImpl$downloadAllChapters$1(this, cVar);
        OfflineReadsServiceImpl$downloadAllChapters$1 offlineReadsServiceImpl$downloadAllChapters$122 = offlineReadsServiceImpl$downloadAllChapters$1;
        Object obj22 = offlineReadsServiceImpl$downloadAllChapters$122.result;
        i10 = offlineReadsServiceImpl$downloadAllChapters$122.label;
        r92 = 1;
        obj = xn.a.f37986a;
        if (i10 == 0) {
        }
        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj22;
        if (readMetaEntityWithChapters == null) {
        }
        if (readMetaEntity == null) {
        }
        c5 = m.c(str4, ReadMetadataResponseModel.AudioType.MEDIA.getValue());
        if (readMetaEntity != null) {
        }
        r92 = 0;
        if (!c5) {
        }
        Logger logger2 = this.logger;
        StringBuilder s102 = defpackage.f.s("downloadAllChapters - readId=", str7, ", type=", type.getValue(), ", drm=");
        s102.append((boolean) r92);
        logger2.log(TAG, s102.toString());
        ir.i customer2 = this.customerService.getCustomer();
        offlineReadsServiceImpl$downloadAllChapters$122.L$0 = str7;
        offlineReadsServiceImpl$downloadAllChapters$122.L$1 = str3;
        offlineReadsServiceImpl$downloadAllChapters$122.L$2 = null;
        offlineReadsServiceImpl$downloadAllChapters$122.L$3 = type;
        offlineReadsServiceImpl$downloadAllChapters$122.J$0 = j10;
        offlineReadsServiceImpl$downloadAllChapters$122.Z$0 = c5;
        offlineReadsServiceImpl$downloadAllChapters$122.I$0 = r92;
        offlineReadsServiceImpl$downloadAllChapters$122.label = 2;
        u6 = ir.r.u(customer2, offlineReadsServiceImpl$downloadAllChapters$122);
        if (u6 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0338, code lost:
    
        if (r2.recomputeReadAggregate(r3, r7) == r10) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013b, code lost:
    
        if (r2 == r10) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r31v0, types: [io.elevenlabs.data.services.OfflineReadsServiceImpl] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object] */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object downloadChapter(String str, String str2, int i10, wn.c<? super DownloadReadResult> cVar) {
        OfflineReadsServiceImpl$downloadChapter$1 offlineReadsServiceImpl$downloadChapter$1;
        int i11;
        String str3;
        int i12;
        String str4;
        OfflineReadEntity.Type type;
        String str5;
        String str6;
        int i13;
        boolean z6;
        OfflineReadEntity.Type type2;
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        ReadMetaEntity meta;
        String str7;
        String str8;
        int i14;
        ReadMetaEntityWithChapters readMetaEntityWithChapters2;
        String str9;
        String str10;
        ApiResult apiResult;
        OfflineReadEntity offlineReadEntity;
        OfflineReadEntity.Status status;
        String str11;
        ReadMetaEntityWithChapters readMetaEntityWithChapters3;
        OfflineReadEntity.Type type3;
        long j4;
        boolean z10;
        long id2;
        int i15;
        OfflineReadEntity offlineReadEntity2;
        OfflineReadEntity.Type type4;
        long j10;
        ReadChapterEntity readChapterEntity;
        sn.k kVar;
        List J;
        String str12;
        long j11;
        String str13;
        long j12;
        int i16;
        OfflineReadEntity offlineReadEntity3;
        OfflineReadEntity.Type type5;
        String str14;
        List<ReadChapterEntity> chapters;
        ReadChapterEntity readChapterEntity2;
        String str15 = str;
        if (cVar instanceof OfflineReadsServiceImpl$downloadChapter$1) {
            offlineReadsServiceImpl$downloadChapter$1 = (OfflineReadsServiceImpl$downloadChapter$1) cVar;
            int i17 = offlineReadsServiceImpl$downloadChapter$1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$downloadChapter$1.label = i17 - Integer.MIN_VALUE;
                OfflineReadsServiceImpl$downloadChapter$1 offlineReadsServiceImpl$downloadChapter$12 = offlineReadsServiceImpl$downloadChapter$1;
                Object obj = offlineReadsServiceImpl$downloadChapter$12.result;
                i11 = offlineReadsServiceImpl$downloadChapter$12.label;
                xn.a aVar = xn.a.f37986a;
                switch (i11) {
                    case 0:
                        sn.a.g(obj);
                        ReadsDao readsDao = this.readsDao;
                        offlineReadsServiceImpl$downloadChapter$12.L$0 = str15;
                        str3 = str2;
                        offlineReadsServiceImpl$downloadChapter$12.L$1 = str3;
                        i12 = i10;
                        offlineReadsServiceImpl$downloadChapter$12.I$0 = i12;
                        offlineReadsServiceImpl$downloadChapter$12.label = 1;
                        obj = readsDao.getById(str15, offlineReadsServiceImpl$downloadChapter$12);
                        break;
                    case 1:
                        int i18 = offlineReadsServiceImpl$downloadChapter$12.I$0;
                        str3 = (String) offlineReadsServiceImpl$downloadChapter$12.L$1;
                        String str16 = (String) offlineReadsServiceImpl$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        i12 = i18;
                        str15 = str16;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters4 = (ReadMetaEntityWithChapters) obj;
                        if (readMetaEntityWithChapters4 != null && (meta = readMetaEntityWithChapters4.getMeta()) != null) {
                            str4 = meta.getAudio_type();
                        } else {
                            str4 = null;
                        }
                        boolean c5 = m.c(str4, ReadMetadataResponseModel.AudioType.MEDIA.getValue());
                        if (c5) {
                            type = OfflineReadEntity.Type.MEDIA;
                        } else {
                            type = OfflineReadEntity.Type.TTS;
                        }
                        ir.i customer = this.customerService.getCustomer();
                        offlineReadsServiceImpl$downloadChapter$12.L$0 = str15;
                        offlineReadsServiceImpl$downloadChapter$12.L$1 = str3;
                        offlineReadsServiceImpl$downloadChapter$12.L$2 = readMetaEntityWithChapters4;
                        offlineReadsServiceImpl$downloadChapter$12.L$3 = type;
                        offlineReadsServiceImpl$downloadChapter$12.I$0 = i12;
                        offlineReadsServiceImpl$downloadChapter$12.Z$0 = c5;
                        offlineReadsServiceImpl$downloadChapter$12.label = 2;
                        Object u6 = ir.r.u(customer, offlineReadsServiceImpl$downloadChapter$12);
                        if (u6 != aVar) {
                            str5 = str15;
                            str6 = str3;
                            i13 = i12;
                            z6 = c5;
                            type2 = type;
                            readMetaEntityWithChapters = readMetaEntityWithChapters4;
                            obj = u6;
                            if (!((Customer) obj).isFreeUser()) {
                                this.analytics.log(new Analytics.Event.OfflineDownloadFinished(str5, str6, Constants.IPC_BUNDLE_KEY_SEND_ERROR, type2.getValue(), "free_plan_not_allowed", null, null, 96, null));
                                return DownloadReadResult.Error.UserIsOnFreePlan.INSTANCE;
                            }
                            if (!z6) {
                                ReadsAPI readsAPI = this.readsAPI;
                                offlineReadsServiceImpl$downloadChapter$12.L$0 = str5;
                                offlineReadsServiceImpl$downloadChapter$12.L$1 = str6;
                                offlineReadsServiceImpl$downloadChapter$12.L$2 = readMetaEntityWithChapters;
                                offlineReadsServiceImpl$downloadChapter$12.L$3 = type2;
                                offlineReadsServiceImpl$downloadChapter$12.L$4 = null;
                                offlineReadsServiceImpl$downloadChapter$12.I$0 = i13;
                                offlineReadsServiceImpl$downloadChapter$12.Z$0 = z6;
                                offlineReadsServiceImpl$downloadChapter$12.label = 3;
                                obj = readsAPI.convertChapterForDownload(str5, str6, i13, offlineReadsServiceImpl$downloadChapter$12);
                                if (obj != aVar) {
                                    str7 = str5;
                                    str8 = str6;
                                    apiResult = (ApiResult) obj;
                                    if (!(apiResult instanceof ApiResult.Success)) {
                                        ib.i.q("convertChapterForDownload(chapter=", i13, ") issued", this.logger, TAG);
                                        str6 = str8;
                                        str5 = str7;
                                    } else {
                                        if (apiResult instanceof ApiResult.Error) {
                                            return handleConvertError((ApiResult.Error) apiResult, str7, str8);
                                        }
                                        c6.p();
                                        return null;
                                    }
                                }
                            }
                            this.analytics.log(new Analytics.Event.OfflineDownloadStarted(str5, str6, type2.getValue(), null, null, new Integer(i13), 24, null));
                            OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                            offlineReadsServiceImpl$downloadChapter$12.L$0 = str5;
                            offlineReadsServiceImpl$downloadChapter$12.L$1 = str6;
                            offlineReadsServiceImpl$downloadChapter$12.L$2 = readMetaEntityWithChapters;
                            offlineReadsServiceImpl$downloadChapter$12.L$3 = type2;
                            offlineReadsServiceImpl$downloadChapter$12.L$4 = null;
                            offlineReadsServiceImpl$downloadChapter$12.I$0 = i13;
                            offlineReadsServiceImpl$downloadChapter$12.Z$0 = z6;
                            offlineReadsServiceImpl$downloadChapter$12.label = 4;
                            obj = offlineReadsDao.getOfflineReadByReadId(str5, offlineReadsServiceImpl$downloadChapter$12);
                            if (obj != aVar) {
                                ReadMetaEntityWithChapters readMetaEntityWithChapters5 = readMetaEntityWithChapters;
                                i14 = i13;
                                readMetaEntityWithChapters2 = readMetaEntityWithChapters5;
                                str9 = str5;
                                str10 = str6;
                                OfflineReadEntity.Type type6 = type2;
                                offlineReadEntity = (OfflineReadEntity) obj;
                                long currentTimeMillis = System.currentTimeMillis();
                                if (offlineReadEntity == null) {
                                    z10 = z6;
                                    id2 = offlineReadEntity.getId();
                                    i15 = i14;
                                    offlineReadEntity2 = offlineReadEntity;
                                    type4 = type6;
                                    j10 = currentTimeMillis;
                                    if (readMetaEntityWithChapters2 == null && (chapters = readMetaEntityWithChapters2.getChapters()) != null) {
                                        Iterator it = chapters.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                readChapterEntity2 = it.next();
                                                if (((ReadChapterEntity) readChapterEntity2).getChapter_index() == i15) {
                                                }
                                            } else {
                                                readChapterEntity2 = 0;
                                            }
                                        }
                                        readChapterEntity = readChapterEntity2;
                                    } else {
                                        readChapterEntity = null;
                                    }
                                    if (readChapterEntity != null) {
                                        Integer num = new Integer(readChapterEntity.getChapter_index());
                                        if (z10) {
                                            str14 = readChapterEntity.getAudio_file_number();
                                        } else {
                                            str14 = null;
                                        }
                                        kVar = new sn.k(num, str14);
                                    } else {
                                        kVar = null;
                                    }
                                    J = ig.f.J(kVar);
                                    offlineReadsServiceImpl$downloadChapter$12.L$0 = str9;
                                    offlineReadsServiceImpl$downloadChapter$12.L$1 = null;
                                    offlineReadsServiceImpl$downloadChapter$12.L$2 = null;
                                    offlineReadsServiceImpl$downloadChapter$12.L$3 = type4;
                                    offlineReadsServiceImpl$downloadChapter$12.L$4 = null;
                                    offlineReadsServiceImpl$downloadChapter$12.L$5 = offlineReadEntity2;
                                    offlineReadsServiceImpl$downloadChapter$12.L$6 = null;
                                    offlineReadsServiceImpl$downloadChapter$12.L$7 = null;
                                    offlineReadsServiceImpl$downloadChapter$12.I$0 = i15;
                                    offlineReadsServiceImpl$downloadChapter$12.Z$0 = z10;
                                    offlineReadsServiceImpl$downloadChapter$12.J$0 = j10;
                                    offlineReadsServiceImpl$downloadChapter$12.J$1 = id2;
                                    offlineReadsServiceImpl$downloadChapter$12.label = 6;
                                    str12 = str9;
                                    if (insertChapterEntities(id2, str12, J, j10, offlineReadsServiceImpl$downloadChapter$12) != aVar) {
                                        j11 = j10;
                                        str13 = str12;
                                        j12 = id2;
                                        i16 = i15;
                                        offlineReadEntity3 = offlineReadEntity2;
                                        type5 = type4;
                                        long j13 = j11;
                                        if (offlineReadEntity3 != null) {
                                            OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                                            offlineReadsServiceImpl$downloadChapter$12.L$0 = str13;
                                            offlineReadsServiceImpl$downloadChapter$12.L$1 = null;
                                            offlineReadsServiceImpl$downloadChapter$12.L$2 = null;
                                            offlineReadsServiceImpl$downloadChapter$12.L$3 = type5;
                                            offlineReadsServiceImpl$downloadChapter$12.L$4 = null;
                                            offlineReadsServiceImpl$downloadChapter$12.L$5 = null;
                                            offlineReadsServiceImpl$downloadChapter$12.L$6 = null;
                                            offlineReadsServiceImpl$downloadChapter$12.L$7 = null;
                                            offlineReadsServiceImpl$downloadChapter$12.I$0 = i16;
                                            offlineReadsServiceImpl$downloadChapter$12.Z$0 = z10;
                                            offlineReadsServiceImpl$downloadChapter$12.J$0 = j13;
                                            offlineReadsServiceImpl$downloadChapter$12.J$1 = j12;
                                            offlineReadsServiceImpl$downloadChapter$12.label = 7;
                                            break;
                                        }
                                        Logger logger = this.logger;
                                        StringBuilder s10 = defpackage.f.s("downloadChapter - readId=", str13, ", type=", type5.getValue(), ", chapter=");
                                        s10.append(i16);
                                        logger.log(TAG, s10.toString());
                                        doSubmitWorkStep(j12);
                                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                                    }
                                } else {
                                    OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                                    if (z6) {
                                        status = OfflineReadEntity.Status.DOWNLOADING_MEDIA;
                                    } else {
                                        status = OfflineReadEntity.Status.DOWNLOADING_HTML;
                                    }
                                    OfflineReadEntity offlineReadEntity4 = new OfflineReadEntity(0L, str9, str10, type6, 0L, currentTimeMillis, currentTimeMillis, status, 0, null, null, 1537, null);
                                    offlineReadsServiceImpl$downloadChapter$12.L$0 = str9;
                                    offlineReadsServiceImpl$downloadChapter$12.L$1 = null;
                                    offlineReadsServiceImpl$downloadChapter$12.L$2 = readMetaEntityWithChapters2;
                                    offlineReadsServiceImpl$downloadChapter$12.L$3 = type6;
                                    offlineReadsServiceImpl$downloadChapter$12.L$4 = null;
                                    offlineReadsServiceImpl$downloadChapter$12.L$5 = offlineReadEntity;
                                    offlineReadsServiceImpl$downloadChapter$12.I$0 = i14;
                                    offlineReadsServiceImpl$downloadChapter$12.Z$0 = z6;
                                    offlineReadsServiceImpl$downloadChapter$12.J$0 = currentTimeMillis;
                                    offlineReadsServiceImpl$downloadChapter$12.label = 5;
                                    obj = offlineReadsDao3.insert(offlineReadEntity4, offlineReadsServiceImpl$downloadChapter$12);
                                    if (obj != aVar) {
                                        str11 = str9;
                                        readMetaEntityWithChapters3 = readMetaEntityWithChapters2;
                                        type3 = type6;
                                        j4 = currentTimeMillis;
                                        OfflineReadEntity.Type type7 = type3;
                                        z10 = z6;
                                        id2 = ((Number) obj).longValue();
                                        type4 = type7;
                                        str9 = str11;
                                        offlineReadEntity2 = offlineReadEntity;
                                        ReadMetaEntityWithChapters readMetaEntityWithChapters6 = readMetaEntityWithChapters3;
                                        i15 = i14;
                                        j10 = j4;
                                        readMetaEntityWithChapters2 = readMetaEntityWithChapters6;
                                        if (readMetaEntityWithChapters2 == null) {
                                        }
                                        readChapterEntity = null;
                                        if (readChapterEntity != null) {
                                        }
                                        J = ig.f.J(kVar);
                                        offlineReadsServiceImpl$downloadChapter$12.L$0 = str9;
                                        offlineReadsServiceImpl$downloadChapter$12.L$1 = null;
                                        offlineReadsServiceImpl$downloadChapter$12.L$2 = null;
                                        offlineReadsServiceImpl$downloadChapter$12.L$3 = type4;
                                        offlineReadsServiceImpl$downloadChapter$12.L$4 = null;
                                        offlineReadsServiceImpl$downloadChapter$12.L$5 = offlineReadEntity2;
                                        offlineReadsServiceImpl$downloadChapter$12.L$6 = null;
                                        offlineReadsServiceImpl$downloadChapter$12.L$7 = null;
                                        offlineReadsServiceImpl$downloadChapter$12.I$0 = i15;
                                        offlineReadsServiceImpl$downloadChapter$12.Z$0 = z10;
                                        offlineReadsServiceImpl$downloadChapter$12.J$0 = j10;
                                        offlineReadsServiceImpl$downloadChapter$12.J$1 = id2;
                                        offlineReadsServiceImpl$downloadChapter$12.label = 6;
                                        str12 = str9;
                                        if (insertChapterEntities(id2, str12, J, j10, offlineReadsServiceImpl$downloadChapter$12) != aVar) {
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 2:
                        z6 = offlineReadsServiceImpl$downloadChapter$12.Z$0;
                        i13 = offlineReadsServiceImpl$downloadChapter$12.I$0;
                        type2 = (OfflineReadEntity.Type) offlineReadsServiceImpl$downloadChapter$12.L$3;
                        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) offlineReadsServiceImpl$downloadChapter$12.L$2;
                        String str17 = (String) offlineReadsServiceImpl$downloadChapter$12.L$1;
                        String str18 = (String) offlineReadsServiceImpl$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        str6 = str17;
                        str5 = str18;
                        if (!((Customer) obj).isFreeUser()) {
                        }
                        break;
                    case 3:
                        z6 = offlineReadsServiceImpl$downloadChapter$12.Z$0;
                        i13 = offlineReadsServiceImpl$downloadChapter$12.I$0;
                        type2 = (OfflineReadEntity.Type) offlineReadsServiceImpl$downloadChapter$12.L$3;
                        readMetaEntityWithChapters = (ReadMetaEntityWithChapters) offlineReadsServiceImpl$downloadChapter$12.L$2;
                        str8 = (String) offlineReadsServiceImpl$downloadChapter$12.L$1;
                        str7 = (String) offlineReadsServiceImpl$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                        }
                        break;
                    case 4:
                        z6 = offlineReadsServiceImpl$downloadChapter$12.Z$0;
                        int i19 = offlineReadsServiceImpl$downloadChapter$12.I$0;
                        type2 = (OfflineReadEntity.Type) offlineReadsServiceImpl$downloadChapter$12.L$3;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters7 = (ReadMetaEntityWithChapters) offlineReadsServiceImpl$downloadChapter$12.L$2;
                        String str19 = (String) offlineReadsServiceImpl$downloadChapter$12.L$1;
                        String str20 = (String) offlineReadsServiceImpl$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        i14 = i19;
                        readMetaEntityWithChapters2 = readMetaEntityWithChapters7;
                        str10 = str19;
                        str9 = str20;
                        OfflineReadEntity.Type type62 = type2;
                        offlineReadEntity = (OfflineReadEntity) obj;
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (offlineReadEntity == null) {
                        }
                        break;
                    case 5:
                        j4 = offlineReadsServiceImpl$downloadChapter$12.J$0;
                        z6 = offlineReadsServiceImpl$downloadChapter$12.Z$0;
                        i14 = offlineReadsServiceImpl$downloadChapter$12.I$0;
                        offlineReadEntity = (OfflineReadEntity) offlineReadsServiceImpl$downloadChapter$12.L$5;
                        type3 = (OfflineReadEntity.Type) offlineReadsServiceImpl$downloadChapter$12.L$3;
                        readMetaEntityWithChapters3 = (ReadMetaEntityWithChapters) offlineReadsServiceImpl$downloadChapter$12.L$2;
                        str11 = (String) offlineReadsServiceImpl$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        OfflineReadEntity.Type type72 = type3;
                        z10 = z6;
                        id2 = ((Number) obj).longValue();
                        type4 = type72;
                        str9 = str11;
                        offlineReadEntity2 = offlineReadEntity;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters62 = readMetaEntityWithChapters3;
                        i15 = i14;
                        j10 = j4;
                        readMetaEntityWithChapters2 = readMetaEntityWithChapters62;
                        if (readMetaEntityWithChapters2 == null) {
                        }
                        readChapterEntity = null;
                        if (readChapterEntity != null) {
                        }
                        J = ig.f.J(kVar);
                        offlineReadsServiceImpl$downloadChapter$12.L$0 = str9;
                        offlineReadsServiceImpl$downloadChapter$12.L$1 = null;
                        offlineReadsServiceImpl$downloadChapter$12.L$2 = null;
                        offlineReadsServiceImpl$downloadChapter$12.L$3 = type4;
                        offlineReadsServiceImpl$downloadChapter$12.L$4 = null;
                        offlineReadsServiceImpl$downloadChapter$12.L$5 = offlineReadEntity2;
                        offlineReadsServiceImpl$downloadChapter$12.L$6 = null;
                        offlineReadsServiceImpl$downloadChapter$12.L$7 = null;
                        offlineReadsServiceImpl$downloadChapter$12.I$0 = i15;
                        offlineReadsServiceImpl$downloadChapter$12.Z$0 = z10;
                        offlineReadsServiceImpl$downloadChapter$12.J$0 = j10;
                        offlineReadsServiceImpl$downloadChapter$12.J$1 = id2;
                        offlineReadsServiceImpl$downloadChapter$12.label = 6;
                        str12 = str9;
                        if (insertChapterEntities(id2, str12, J, j10, offlineReadsServiceImpl$downloadChapter$12) != aVar) {
                        }
                        return aVar;
                    case 6:
                        j12 = offlineReadsServiceImpl$downloadChapter$12.J$1;
                        long j14 = offlineReadsServiceImpl$downloadChapter$12.J$0;
                        boolean z11 = offlineReadsServiceImpl$downloadChapter$12.Z$0;
                        int i20 = offlineReadsServiceImpl$downloadChapter$12.I$0;
                        OfflineReadEntity offlineReadEntity5 = (OfflineReadEntity) offlineReadsServiceImpl$downloadChapter$12.L$5;
                        OfflineReadEntity.Type type8 = (OfflineReadEntity.Type) offlineReadsServiceImpl$downloadChapter$12.L$3;
                        String str21 = (String) offlineReadsServiceImpl$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        z10 = z11;
                        i16 = i20;
                        offlineReadEntity3 = offlineReadEntity5;
                        j11 = j14;
                        type5 = type8;
                        str13 = str21;
                        long j132 = j11;
                        if (offlineReadEntity3 != null) {
                        }
                        Logger logger2 = this.logger;
                        StringBuilder s102 = defpackage.f.s("downloadChapter - readId=", str13, ", type=", type5.getValue(), ", chapter=");
                        s102.append(i16);
                        logger2.log(TAG, s102.toString());
                        doSubmitWorkStep(j12);
                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                    case 7:
                        j12 = offlineReadsServiceImpl$downloadChapter$12.J$1;
                        i16 = offlineReadsServiceImpl$downloadChapter$12.I$0;
                        type5 = (OfflineReadEntity.Type) offlineReadsServiceImpl$downloadChapter$12.L$3;
                        str13 = (String) offlineReadsServiceImpl$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        Logger logger22 = this.logger;
                        StringBuilder s1022 = defpackage.f.s("downloadChapter - readId=", str13, ", type=", type5.getValue(), ", chapter=");
                        s1022.append(i16);
                        logger22.log(TAG, s1022.toString());
                        doSubmitWorkStep(j12);
                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        offlineReadsServiceImpl$downloadChapter$1 = new OfflineReadsServiceImpl$downloadChapter$1(this, cVar);
        OfflineReadsServiceImpl$downloadChapter$1 offlineReadsServiceImpl$downloadChapter$122 = offlineReadsServiceImpl$downloadChapter$1;
        Object obj2 = offlineReadsServiceImpl$downloadChapter$122.result;
        i11 = offlineReadsServiceImpl$downloadChapter$122.label;
        xn.a aVar2 = xn.a.f37986a;
        switch (i11) {
        }
    }

    @Override // io.elevenlabs.domain.services.OfflineReadsService
    public ir.i getAllOfflineReads() {
        final ir.i observeAllOfflineReadsWithChapters = this.offlineReadsDao.observeAllOfflineReadsWithChapters();
        return new ir.i() { // from class: io.elevenlabs.data.services.OfflineReadsServiceImpl$getAllOfflineReads$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.OfflineReadsServiceImpl$getAllOfflineReads$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.OfflineReadsServiceImpl$getAllOfflineReads$$inlined$map$1$2", f = "OfflineReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.OfflineReadsServiceImpl$getAllOfflineReads$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                List<OfflineReadWithChapters> list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                for (OfflineReadWithChapters offlineReadWithChapters : list) {
                                    arrayList.add(OfflineReadMappingKt.toDomain$default(offlineReadWithChapters.getOfflineRead(), offlineReadWithChapters.getChapters(), 0L, 2, null));
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        };
    }

    @Override // io.elevenlabs.domain.services.OfflineReadsService
    public ir.i getDownloadedReads() {
        final ir.i readsWithOfflineEntries = this.offlineReadsDao.getReadsWithOfflineEntries();
        return new ir.w(new ir.i() { // from class: io.elevenlabs.data.services.OfflineReadsServiceImpl$getDownloadedReads$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.OfflineReadsServiceImpl$getDownloadedReads$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.OfflineReadsServiceImpl$getDownloadedReads$$inlined$map$1$2", f = "OfflineReadsServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.OfflineReadsServiceImpl$getDownloadedReads$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(ReadMappingKt.toDomain((ReadMetaEntityWithChapters) it.next()));
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(arrayList, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }, new OfflineReadsServiceImpl$getDownloadedReads$2(this, null), 5);
    }

    @Override // io.elevenlabs.domain.services.OfflineReadsService
    public Object hasDownloadedReads(wn.c<? super Boolean> cVar) {
        return this.offlineReadsDao.hasOfflineReads(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
    
        if (r13.deleteAll(r0) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        if (clearMediaCache(r0) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeAllDownloadedReads(wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$removeAllDownloadedReads$1 offlineReadsServiceImpl$removeAllDownloadedReads$1;
        int i10;
        Iterator it;
        int i11;
        if (cVar instanceof OfflineReadsServiceImpl$removeAllDownloadedReads$1) {
            offlineReadsServiceImpl$removeAllDownloadedReads$1 = (OfflineReadsServiceImpl$removeAllDownloadedReads$1) cVar;
            int i12 = offlineReadsServiceImpl$removeAllDownloadedReads$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$removeAllDownloadedReads$1.label = i12 - Integer.MIN_VALUE;
                Object obj = offlineReadsServiceImpl$removeAllDownloadedReads$1.result;
                i10 = offlineReadsServiceImpl$removeAllDownloadedReads$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                this.analytics.log(Analytics.Event.OfflineDownloadsRemovedAll.INSTANCE);
                                return z.f31622a;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                        OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$0 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$1 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.label = 3;
                    } else {
                        i11 = offlineReadsServiceImpl$removeAllDownloadedReads$1.I$0;
                        it = (Iterator) offlineReadsServiceImpl$removeAllDownloadedReads$1.L$2;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(TAG, "removeAllDownloadedReads - Deleting all downloaded reads");
                    it = this.offlineReadsDao.getAllOfflineReads().iterator();
                    i11 = 0;
                }
                while (true) {
                    if (!it.hasNext()) {
                        OfflineReadEntity offlineReadEntity = (OfflineReadEntity) it.next();
                        Context context = this.context;
                        context.getClass();
                        r.c(context).a(buildUniqueWorkName(offlineReadEntity.getId()));
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$0 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$1 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$2 = it;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$3 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$4 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.I$0 = i11;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.I$1 = 0;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.label = 1;
                        if (scheduleDrmRelease(offlineReadEntity, offlineReadsServiceImpl$removeAllDownloadedReads$1) == obj2) {
                            break;
                        }
                    } else {
                        File baseDownloadsDir = OfflineReadsDownloaderKt.getBaseDownloadsDir(this.context);
                        if (baseDownloadsDir.exists()) {
                            eo.k.h0(baseDownloadsDir);
                        }
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$0 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$1 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$2 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$3 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.L$4 = null;
                        offlineReadsServiceImpl$removeAllDownloadedReads$1.label = 2;
                    }
                }
                return obj2;
            }
        }
        offlineReadsServiceImpl$removeAllDownloadedReads$1 = new OfflineReadsServiceImpl$removeAllDownloadedReads$1(this, cVar);
        Object obj3 = offlineReadsServiceImpl$removeAllDownloadedReads$1.result;
        i10 = offlineReadsServiceImpl$removeAllDownloadedReads$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        while (true) {
            if (!it.hasNext()) {
            }
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b6, code lost:
    
        if (r2 == r10) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (r2.deleteChapter(r12, r1, r7) == r10) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c9, code lost:
    
        if (r2 == r10) goto L76;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeChapterDownload(String str, int i10, wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$removeChapterDownload$1 offlineReadsServiceImpl$removeChapterDownload$1;
        int i11;
        int i12;
        OfflineReadEntity offlineReadEntity;
        String str2;
        int i13;
        Iterator it;
        Object obj;
        OfflineChapterEntity offlineChapterEntity;
        OfflineReadEntity offlineReadEntity2;
        int i14;
        int i15;
        String str3;
        String cachedManifestUrl;
        ReadsDao.ChapterCharRange chapterCharRange;
        String str4 = str;
        if (cVar instanceof OfflineReadsServiceImpl$removeChapterDownload$1) {
            offlineReadsServiceImpl$removeChapterDownload$1 = (OfflineReadsServiceImpl$removeChapterDownload$1) cVar;
            int i16 = offlineReadsServiceImpl$removeChapterDownload$1.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$removeChapterDownload$1.label = i16 - Integer.MIN_VALUE;
                OfflineReadsServiceImpl$removeChapterDownload$1 offlineReadsServiceImpl$removeChapterDownload$12 = offlineReadsServiceImpl$removeChapterDownload$1;
                Object obj2 = offlineReadsServiceImpl$removeChapterDownload$12.result;
                i11 = offlineReadsServiceImpl$removeChapterDownload$12.label;
                z zVar = z.f31622a;
                Object obj3 = xn.a.f37986a;
                switch (i11) {
                    case 0:
                        sn.a.g(obj2);
                        OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                        offlineReadsServiceImpl$removeChapterDownload$12.L$0 = str4;
                        i12 = i10;
                        offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i12;
                        offlineReadsServiceImpl$removeChapterDownload$12.label = 1;
                        obj2 = offlineReadsDao.getOfflineReadByReadId(str4, offlineReadsServiceImpl$removeChapterDownload$12);
                        break;
                    case 1:
                        int i17 = offlineReadsServiceImpl$removeChapterDownload$12.I$0;
                        String str5 = (String) offlineReadsServiceImpl$removeChapterDownload$12.L$0;
                        sn.a.g(obj2);
                        i12 = i17;
                        str4 = str5;
                        OfflineReadEntity offlineReadEntity3 = (OfflineReadEntity) obj2;
                        if (offlineReadEntity3 == null) {
                            return zVar;
                        }
                        OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                        long id2 = offlineReadEntity3.getId();
                        offlineReadsServiceImpl$removeChapterDownload$12.L$0 = str4;
                        offlineReadsServiceImpl$removeChapterDownload$12.L$1 = offlineReadEntity3;
                        offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i12;
                        offlineReadsServiceImpl$removeChapterDownload$12.label = 2;
                        Object chaptersForRead = offlineReadsDao2.getChaptersForRead(id2, offlineReadsServiceImpl$removeChapterDownload$12);
                        if (chaptersForRead != obj3) {
                            offlineReadEntity = offlineReadEntity3;
                            obj2 = chaptersForRead;
                            str2 = str4;
                            i13 = i12;
                            it = ((Iterable) obj2).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = it.next();
                                    if (((OfflineChapterEntity) obj).getChapterIndex() == i13) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            offlineChapterEntity = (OfflineChapterEntity) obj;
                            if (offlineChapterEntity != null) {
                                if (offlineChapterEntity.getDrmKeySetId() != null && offlineChapterEntity.getFileNumber() != null) {
                                    DrmLicenseReleaseWorker.INSTANCE.schedule(this.context, str2, ig.f.H(offlineChapterEntity.getFileNumber()), ig.f.H(offlineChapterEntity.getDrmKeySetId()));
                                }
                                OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                                long id3 = offlineReadEntity.getId();
                                offlineReadsServiceImpl$removeChapterDownload$12.L$0 = str2;
                                offlineReadsServiceImpl$removeChapterDownload$12.L$1 = offlineReadEntity;
                                offlineReadsServiceImpl$removeChapterDownload$12.L$2 = offlineChapterEntity;
                                offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i13;
                                offlineReadsServiceImpl$removeChapterDownload$12.label = 3;
                                break;
                            }
                            OfflineChapterEntity offlineChapterEntity2 = offlineChapterEntity;
                            offlineReadEntity2 = offlineReadEntity;
                            i14 = WhenMappings.$EnumSwitchMapping$1[offlineReadEntity2.getType().ordinal()];
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    if (offlineChapterEntity2 != null && (cachedManifestUrl = offlineChapterEntity2.getCachedManifestUrl()) != null) {
                                        removeHlsCache(cachedManifestUrl);
                                    }
                                    OfflineReadsDao offlineReadsDao4 = this.offlineReadsDao;
                                    long id4 = offlineReadEntity2.getId();
                                    offlineReadsServiceImpl$removeChapterDownload$12.L$0 = null;
                                    offlineReadsServiceImpl$removeChapterDownload$12.L$1 = offlineReadEntity2;
                                    offlineReadsServiceImpl$removeChapterDownload$12.L$2 = null;
                                    offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i13;
                                    offlineReadsServiceImpl$removeChapterDownload$12.label = 5;
                                    obj2 = offlineReadsDao4.getChaptersForRead(id4, offlineReadsServiceImpl$removeChapterDownload$12);
                                    break;
                                } else {
                                    c6.p();
                                    return null;
                                }
                            } else {
                                ReadsDao readsDao = this.readsDao;
                                offlineReadsServiceImpl$removeChapterDownload$12.L$0 = str2;
                                offlineReadsServiceImpl$removeChapterDownload$12.L$1 = offlineReadEntity2;
                                offlineReadsServiceImpl$removeChapterDownload$12.L$2 = null;
                                offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i13;
                                offlineReadsServiceImpl$removeChapterDownload$12.label = 4;
                                obj2 = readsDao.getChapterCharRange(str2, i13, offlineReadsServiceImpl$removeChapterDownload$12);
                                if (obj2 != obj3) {
                                    String str6 = str2;
                                    i15 = i13;
                                    str3 = str6;
                                    OfflineReadEntity offlineReadEntity4 = offlineReadEntity2;
                                    chapterCharRange = (ReadsDao.ChapterCharRange) obj2;
                                    if (chapterCharRange != null) {
                                        deleteTtsChunkFiles(str3, offlineReadEntity4.getVoiceId(), chapterCharRange.getStartingCharOffset(), chapterCharRange.getCharCount() + chapterCharRange.getStartingCharOffset());
                                    }
                                    i13 = i15;
                                    offlineReadEntity2 = offlineReadEntity4;
                                    OfflineReadsDao offlineReadsDao42 = this.offlineReadsDao;
                                    long id42 = offlineReadEntity2.getId();
                                    offlineReadsServiceImpl$removeChapterDownload$12.L$0 = null;
                                    offlineReadsServiceImpl$removeChapterDownload$12.L$1 = offlineReadEntity2;
                                    offlineReadsServiceImpl$removeChapterDownload$12.L$2 = null;
                                    offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i13;
                                    offlineReadsServiceImpl$removeChapterDownload$12.label = 5;
                                    obj2 = offlineReadsDao42.getChaptersForRead(id42, offlineReadsServiceImpl$removeChapterDownload$12);
                                }
                            }
                        }
                        return obj3;
                    case 2:
                        i13 = offlineReadsServiceImpl$removeChapterDownload$12.I$0;
                        OfflineReadEntity offlineReadEntity5 = (OfflineReadEntity) offlineReadsServiceImpl$removeChapterDownload$12.L$1;
                        String str7 = (String) offlineReadsServiceImpl$removeChapterDownload$12.L$0;
                        sn.a.g(obj2);
                        str2 = str7;
                        offlineReadEntity = offlineReadEntity5;
                        it = ((Iterable) obj2).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        offlineChapterEntity = (OfflineChapterEntity) obj;
                        if (offlineChapterEntity != null) {
                        }
                        OfflineChapterEntity offlineChapterEntity22 = offlineChapterEntity;
                        offlineReadEntity2 = offlineReadEntity;
                        i14 = WhenMappings.$EnumSwitchMapping$1[offlineReadEntity2.getType().ordinal()];
                        if (i14 != 1) {
                        }
                        break;
                    case 3:
                        i13 = offlineReadsServiceImpl$removeChapterDownload$12.I$0;
                        offlineChapterEntity = (OfflineChapterEntity) offlineReadsServiceImpl$removeChapterDownload$12.L$2;
                        offlineReadEntity = (OfflineReadEntity) offlineReadsServiceImpl$removeChapterDownload$12.L$1;
                        str2 = (String) offlineReadsServiceImpl$removeChapterDownload$12.L$0;
                        sn.a.g(obj2);
                        OfflineChapterEntity offlineChapterEntity222 = offlineChapterEntity;
                        offlineReadEntity2 = offlineReadEntity;
                        i14 = WhenMappings.$EnumSwitchMapping$1[offlineReadEntity2.getType().ordinal()];
                        if (i14 != 1) {
                        }
                        break;
                    case 4:
                        int i18 = offlineReadsServiceImpl$removeChapterDownload$12.I$0;
                        offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$removeChapterDownload$12.L$1;
                        String str8 = (String) offlineReadsServiceImpl$removeChapterDownload$12.L$0;
                        sn.a.g(obj2);
                        i15 = i18;
                        str3 = str8;
                        OfflineReadEntity offlineReadEntity42 = offlineReadEntity2;
                        chapterCharRange = (ReadsDao.ChapterCharRange) obj2;
                        if (chapterCharRange != null) {
                        }
                        i13 = i15;
                        offlineReadEntity2 = offlineReadEntity42;
                        OfflineReadsDao offlineReadsDao422 = this.offlineReadsDao;
                        long id422 = offlineReadEntity2.getId();
                        offlineReadsServiceImpl$removeChapterDownload$12.L$0 = null;
                        offlineReadsServiceImpl$removeChapterDownload$12.L$1 = offlineReadEntity2;
                        offlineReadsServiceImpl$removeChapterDownload$12.L$2 = null;
                        offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i13;
                        offlineReadsServiceImpl$removeChapterDownload$12.label = 5;
                        obj2 = offlineReadsDao422.getChaptersForRead(id422, offlineReadsServiceImpl$removeChapterDownload$12);
                        break;
                    case 5:
                        i13 = offlineReadsServiceImpl$removeChapterDownload$12.I$0;
                        offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$removeChapterDownload$12.L$1;
                        sn.a.g(obj2);
                        if (((List) obj2).isEmpty()) {
                            long id5 = offlineReadEntity2.getId();
                            offlineReadsServiceImpl$removeChapterDownload$12.L$0 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.L$1 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.L$2 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.L$3 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i13;
                            offlineReadsServiceImpl$removeChapterDownload$12.label = 6;
                            if (removeDownload(id5, offlineReadsServiceImpl$removeChapterDownload$12) != obj3) {
                                return zVar;
                            }
                        } else {
                            OfflineReadsDao offlineReadsDao5 = this.offlineReadsDao;
                            long id6 = offlineReadEntity2.getId();
                            offlineReadsServiceImpl$removeChapterDownload$12.L$0 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.L$1 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.L$2 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.L$3 = null;
                            offlineReadsServiceImpl$removeChapterDownload$12.I$0 = i13;
                            offlineReadsServiceImpl$removeChapterDownload$12.label = 7;
                            if (offlineReadsDao5.recomputeReadAggregate(id6, offlineReadsServiceImpl$removeChapterDownload$12) != obj3) {
                                return zVar;
                            }
                        }
                        return obj3;
                    case 6:
                        sn.a.g(obj2);
                        return zVar;
                    case 7:
                        sn.a.g(obj2);
                        return zVar;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        offlineReadsServiceImpl$removeChapterDownload$1 = new OfflineReadsServiceImpl$removeChapterDownload$1(this, cVar);
        OfflineReadsServiceImpl$removeChapterDownload$1 offlineReadsServiceImpl$removeChapterDownload$122 = offlineReadsServiceImpl$removeChapterDownload$1;
        Object obj22 = offlineReadsServiceImpl$removeChapterDownload$122.result;
        i11 = offlineReadsServiceImpl$removeChapterDownload$122.label;
        z zVar2 = z.f31622a;
        Object obj32 = xn.a.f37986a;
        switch (i11) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (r12 == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007a, code lost:
    
        if (r12 == r7) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeDownload(long j4, wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$removeDownload$1 offlineReadsServiceImpl$removeDownload$1;
        int i10;
        OfflineReadEntity offlineReadEntity;
        OfflineReadEntity offlineReadEntity2;
        int i11;
        OfflineReadsDao offlineReadsDao;
        OfflineReadEntity offlineReadEntity3;
        if (cVar instanceof OfflineReadsServiceImpl$removeDownload$1) {
            offlineReadsServiceImpl$removeDownload$1 = (OfflineReadsServiceImpl$removeDownload$1) cVar;
            int i12 = offlineReadsServiceImpl$removeDownload$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$removeDownload$1.label = i12 - Integer.MIN_VALUE;
                Object obj = offlineReadsServiceImpl$removeDownload$1.result;
                i10 = offlineReadsServiceImpl$removeDownload$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    j4 = offlineReadsServiceImpl$removeDownload$1.J$0;
                                    offlineReadEntity3 = (OfflineReadEntity) offlineReadsServiceImpl$removeDownload$1.L$0;
                                    sn.a.g(obj);
                                    this.analytics.log(new Analytics.Event.OfflineDownloadRemoved(offlineReadEntity3.getReadId(), offlineReadEntity3.getVoiceId()));
                                    this.logger.log(TAG, "Deleted offline data for offlineReadId=" + j4);
                                    Context context = this.context;
                                    context.getClass();
                                    r.c(context).a(buildUniqueWorkName(j4));
                                    return z.f31622a;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j4 = offlineReadsServiceImpl$removeDownload$1.J$0;
                            offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$removeDownload$1.L$0;
                            sn.a.g(obj);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((Iterable) obj).iterator();
                            while (it.hasNext()) {
                                String cachedManifestUrl = ((OfflineChapterEntity) it.next()).getCachedManifestUrl();
                                if (cachedManifestUrl != null) {
                                    arrayList.add(cachedManifestUrl);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                removeHlsCache((String) it2.next());
                            }
                            offlineReadsDao = this.offlineReadsDao;
                            offlineReadsServiceImpl$removeDownload$1.L$0 = offlineReadEntity2;
                            offlineReadsServiceImpl$removeDownload$1.J$0 = j4;
                            offlineReadsServiceImpl$removeDownload$1.label = 4;
                            if (offlineReadsDao.delete(offlineReadEntity2, offlineReadsServiceImpl$removeDownload$1) != obj2) {
                                offlineReadEntity3 = offlineReadEntity2;
                                this.analytics.log(new Analytics.Event.OfflineDownloadRemoved(offlineReadEntity3.getReadId(), offlineReadEntity3.getVoiceId()));
                                this.logger.log(TAG, "Deleted offline data for offlineReadId=" + j4);
                                Context context2 = this.context;
                                context2.getClass();
                                r.c(context2).a(buildUniqueWorkName(j4));
                                return z.f31622a;
                            }
                            return obj2;
                        }
                        j4 = offlineReadsServiceImpl$removeDownload$1.J$0;
                        offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$removeDownload$1.L$0;
                        sn.a.g(obj);
                        i11 = WhenMappings.$EnumSwitchMapping$1[offlineReadEntity2.getType().ordinal()];
                        if (i11 == 1) {
                            if (i11 == 2) {
                                OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                                long id2 = offlineReadEntity2.getId();
                                offlineReadsServiceImpl$removeDownload$1.L$0 = offlineReadEntity2;
                                offlineReadsServiceImpl$removeDownload$1.J$0 = j4;
                                offlineReadsServiceImpl$removeDownload$1.label = 3;
                                obj = offlineReadsDao2.getChaptersForRead(id2, offlineReadsServiceImpl$removeDownload$1);
                            } else {
                                c6.p();
                                return null;
                            }
                        } else {
                            File readDownloadDir = OfflineReadsDownloaderKt.getReadDownloadDir(this.context, offlineReadEntity2.getReadId(), offlineReadEntity2.getVoiceId());
                            if (readDownloadDir.exists()) {
                                eo.k.h0(readDownloadDir);
                            }
                            offlineReadsDao = this.offlineReadsDao;
                            offlineReadsServiceImpl$removeDownload$1.L$0 = offlineReadEntity2;
                            offlineReadsServiceImpl$removeDownload$1.J$0 = j4;
                            offlineReadsServiceImpl$removeDownload$1.label = 4;
                            if (offlineReadsDao.delete(offlineReadEntity2, offlineReadsServiceImpl$removeDownload$1) != obj2) {
                            }
                            return obj2;
                        }
                    } else {
                        j4 = offlineReadsServiceImpl$removeDownload$1.J$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(TAG, "removeDownload - offlineReadId: " + j4);
                    OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                    offlineReadsServiceImpl$removeDownload$1.J$0 = j4;
                    offlineReadsServiceImpl$removeDownload$1.label = 1;
                    obj = offlineReadsDao3.getOfflineReadById(j4, offlineReadsServiceImpl$removeDownload$1);
                }
                offlineReadEntity = (OfflineReadEntity) obj;
                if (offlineReadEntity == null) {
                    offlineReadsServiceImpl$removeDownload$1.L$0 = offlineReadEntity;
                    offlineReadsServiceImpl$removeDownload$1.J$0 = j4;
                    offlineReadsServiceImpl$removeDownload$1.label = 2;
                    if (scheduleDrmRelease(offlineReadEntity, offlineReadsServiceImpl$removeDownload$1) != obj2) {
                        offlineReadEntity2 = offlineReadEntity;
                        i11 = WhenMappings.$EnumSwitchMapping$1[offlineReadEntity2.getType().ordinal()];
                        if (i11 == 1) {
                        }
                    }
                    return obj2;
                }
                this.logger.logError(TAG, android.gov.nist.javax.sip.header.a.k("No offline read with id=", j4, " found"), null);
                Context context22 = this.context;
                context22.getClass();
                r.c(context22).a(buildUniqueWorkName(j4));
                return z.f31622a;
            }
        }
        offlineReadsServiceImpl$removeDownload$1 = new OfflineReadsServiceImpl$removeDownload$1(this, cVar);
        Object obj3 = offlineReadsServiceImpl$removeDownload$1.result;
        i10 = offlineReadsServiceImpl$removeDownload$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        offlineReadEntity = (OfflineReadEntity) obj3;
        if (offlineReadEntity == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (r11.deleteOfflineReads(r10, r0) == r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0077, code lost:
    
        if (r11 == r7) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[LOOP:1: B:34:0x00cf->B:36:0x00d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeDownloadsForRead(String str, wn.c<? super z> cVar) {
        OfflineReadsServiceImpl$removeDownloadsForRead$1 offlineReadsServiceImpl$removeDownloadsForRead$1;
        int i10;
        OfflineReadEntity offlineReadEntity;
        String str2;
        OfflineReadEntity offlineReadEntity2;
        Iterator it;
        Iterator it2;
        if (cVar instanceof OfflineReadsServiceImpl$removeDownloadsForRead$1) {
            offlineReadsServiceImpl$removeDownloadsForRead$1 = (OfflineReadsServiceImpl$removeDownloadsForRead$1) cVar;
            int i11 = offlineReadsServiceImpl$removeDownloadsForRead$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$removeDownloadsForRead$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineReadsServiceImpl$removeDownloadsForRead$1.result;
                i10 = offlineReadsServiceImpl$removeDownloadsForRead$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    str = (String) offlineReadsServiceImpl$removeDownloadsForRead$1.L$0;
                                    sn.a.g(obj);
                                    File downloadsDirForRead = OfflineReadsDownloaderKt.getDownloadsDirForRead(this.context, str);
                                    if (downloadsDirForRead.exists()) {
                                        eo.k.h0(downloadsDirForRead);
                                    }
                                    this.analytics.log(new Analytics.Event.OfflineDownloadRemoved(str, null));
                                    return z.f31622a;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str = (String) offlineReadsServiceImpl$removeDownloadsForRead$1.L$0;
                            sn.a.g(obj);
                            ArrayList arrayList = new ArrayList();
                            it = ((Iterable) obj).iterator();
                            while (it.hasNext()) {
                                String cachedManifestUrl = ((OfflineChapterEntity) it.next()).getCachedManifestUrl();
                                if (cachedManifestUrl != null) {
                                    arrayList.add(cachedManifestUrl);
                                }
                            }
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                removeHlsCache((String) it2.next());
                            }
                            OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                            offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str;
                            offlineReadsServiceImpl$removeDownloadsForRead$1.L$1 = null;
                            offlineReadsServiceImpl$removeDownloadsForRead$1.label = 4;
                        } else {
                            offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$removeDownloadsForRead$1.L$1;
                            str2 = (String) offlineReadsServiceImpl$removeDownloadsForRead$1.L$0;
                            sn.a.g(obj);
                            if (offlineReadEntity2.getType() != OfflineReadEntity.Type.MEDIA) {
                                OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                                long id2 = offlineReadEntity2.getId();
                                offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str2;
                                offlineReadsServiceImpl$removeDownloadsForRead$1.L$1 = null;
                                offlineReadsServiceImpl$removeDownloadsForRead$1.label = 3;
                                obj = offlineReadsDao2.getChaptersForRead(id2, offlineReadsServiceImpl$removeDownloadsForRead$1);
                                if (obj != obj2) {
                                    str = str2;
                                    ArrayList arrayList2 = new ArrayList();
                                    it = ((Iterable) obj).iterator();
                                    while (it.hasNext()) {
                                    }
                                    it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                    }
                                    OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                                    offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str;
                                    offlineReadsServiceImpl$removeDownloadsForRead$1.L$1 = null;
                                    offlineReadsServiceImpl$removeDownloadsForRead$1.label = 4;
                                }
                                return obj2;
                            }
                            str = str2;
                            OfflineReadsDao offlineReadsDao32 = this.offlineReadsDao;
                            offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str;
                            offlineReadsServiceImpl$removeDownloadsForRead$1.L$1 = null;
                            offlineReadsServiceImpl$removeDownloadsForRead$1.label = 4;
                        }
                    } else {
                        str = (String) offlineReadsServiceImpl$removeDownloadsForRead$1.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    ib.i.r("removeDownloadsForRead - Deleting all downloads for readId=", str, this.logger, TAG);
                    OfflineReadsDao offlineReadsDao4 = this.offlineReadsDao;
                    offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str;
                    offlineReadsServiceImpl$removeDownloadsForRead$1.label = 1;
                    obj = offlineReadsDao4.getOfflineReadByReadId(str, offlineReadsServiceImpl$removeDownloadsForRead$1);
                }
                offlineReadEntity = (OfflineReadEntity) obj;
                if (offlineReadEntity != null) {
                    offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str;
                    offlineReadsServiceImpl$removeDownloadsForRead$1.L$1 = offlineReadEntity;
                    offlineReadsServiceImpl$removeDownloadsForRead$1.label = 2;
                    if (scheduleDrmRelease(offlineReadEntity, offlineReadsServiceImpl$removeDownloadsForRead$1) != obj2) {
                        str2 = str;
                        offlineReadEntity2 = offlineReadEntity;
                        if (offlineReadEntity2.getType() != OfflineReadEntity.Type.MEDIA) {
                        }
                    }
                    return obj2;
                }
                OfflineReadsDao offlineReadsDao322 = this.offlineReadsDao;
                offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str;
                offlineReadsServiceImpl$removeDownloadsForRead$1.L$1 = null;
                offlineReadsServiceImpl$removeDownloadsForRead$1.label = 4;
            }
        }
        offlineReadsServiceImpl$removeDownloadsForRead$1 = new OfflineReadsServiceImpl$removeDownloadsForRead$1(this, cVar);
        Object obj3 = offlineReadsServiceImpl$removeDownloadsForRead$1.result;
        i10 = offlineReadsServiceImpl$removeDownloadsForRead$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        offlineReadEntity = (OfflineReadEntity) obj3;
        if (offlineReadEntity != null) {
        }
        OfflineReadsDao offlineReadsDao3222 = this.offlineReadsDao;
        offlineReadsServiceImpl$removeDownloadsForRead$1.L$0 = str;
        offlineReadsServiceImpl$removeDownloadsForRead$1.L$1 = null;
        offlineReadsServiceImpl$removeDownloadsForRead$1.label = 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        if (r3 != r14) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ab, code lost:
    
        if (r3 == r14) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // io.elevenlabs.domain.services.OfflineReadsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retryDownload(long j4, wn.c<? super DownloadReadResult> cVar) {
        OfflineReadsServiceImpl$retryDownload$1 offlineReadsServiceImpl$retryDownload$1;
        int i10;
        OfflineReadEntity offlineReadEntity;
        OfflineReadEntity offlineReadEntity2;
        OfflineReadEntity offlineReadEntity3;
        OfflineReadsServiceImpl$retryDownload$1 offlineReadsServiceImpl$retryDownload$12;
        Iterator it;
        int i11;
        OfflineReadEntity.Status status;
        OfflineReadEntity offlineReadEntity4;
        long j10;
        OfflineReadsServiceImpl$retryDownload$1 offlineReadsServiceImpl$retryDownload$13;
        long j11 = j4;
        if (cVar instanceof OfflineReadsServiceImpl$retryDownload$1) {
            offlineReadsServiceImpl$retryDownload$1 = (OfflineReadsServiceImpl$retryDownload$1) cVar;
            int i12 = offlineReadsServiceImpl$retryDownload$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                offlineReadsServiceImpl$retryDownload$1.label = i12 - Integer.MIN_VALUE;
                Object obj = offlineReadsServiceImpl$retryDownload$1.result;
                i10 = offlineReadsServiceImpl$retryDownload$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5) {
                                        offlineReadEntity4 = (OfflineReadEntity) offlineReadsServiceImpl$retryDownload$1.L$0;
                                        sn.a.g(obj);
                                        offlineReadEntity = offlineReadEntity4;
                                        doSubmitWorkStep(offlineReadEntity.getId());
                                        return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                                    }
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                int i13 = offlineReadsServiceImpl$retryDownload$1.I$0;
                                long j12 = offlineReadsServiceImpl$retryDownload$1.J$0;
                                Iterator it2 = (Iterator) offlineReadsServiceImpl$retryDownload$1.L$2;
                                OfflineReadEntity offlineReadEntity5 = (OfflineReadEntity) offlineReadsServiceImpl$retryDownload$1.L$0;
                                sn.a.g(obj);
                                i11 = i13;
                                OfflineReadsServiceImpl$retryDownload$1 offlineReadsServiceImpl$retryDownload$14 = offlineReadsServiceImpl$retryDownload$1;
                                it = it2;
                                j11 = j12;
                                offlineReadEntity3 = offlineReadEntity5;
                                offlineReadsServiceImpl$retryDownload$12 = offlineReadsServiceImpl$retryDownload$14;
                                while (true) {
                                    if (!it.hasNext()) {
                                        OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) it.next();
                                        OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                                        int chapterIndex = offlineChapterEntity.getChapterIndex();
                                        OfflineChapterEntity.Status status2 = OfflineChapterEntity.Status.PENDING;
                                        offlineReadsServiceImpl$retryDownload$12.L$0 = offlineReadEntity3;
                                        offlineReadsServiceImpl$retryDownload$12.L$1 = null;
                                        offlineReadsServiceImpl$retryDownload$12.L$2 = it;
                                        offlineReadsServiceImpl$retryDownload$12.L$3 = null;
                                        offlineReadsServiceImpl$retryDownload$12.L$4 = null;
                                        offlineReadsServiceImpl$retryDownload$12.J$0 = j11;
                                        offlineReadsServiceImpl$retryDownload$12.I$0 = i11;
                                        offlineReadsServiceImpl$retryDownload$12.I$1 = 0;
                                        offlineReadsServiceImpl$retryDownload$12.label = 4;
                                        j10 = j11;
                                        offlineReadsServiceImpl$retryDownload$13 = offlineReadsServiceImpl$retryDownload$12;
                                        if (offlineReadsDao.updateChapterStatus(j10, chapterIndex, status2, 0, offlineReadsServiceImpl$retryDownload$13) == obj2) {
                                            break;
                                        }
                                        offlineReadsServiceImpl$retryDownload$12 = offlineReadsServiceImpl$retryDownload$13;
                                        j11 = j10;
                                    } else {
                                        long j13 = j11;
                                        OfflineReadsServiceImpl$retryDownload$1 offlineReadsServiceImpl$retryDownload$15 = offlineReadsServiceImpl$retryDownload$12;
                                        int i14 = WhenMappings.$EnumSwitchMapping$1[offlineReadEntity3.getType().ordinal()];
                                        if (i14 != 1) {
                                            if (i14 == 2) {
                                                status = OfflineReadEntity.Status.DOWNLOADING_MEDIA;
                                            } else {
                                                c6.p();
                                                return null;
                                            }
                                        } else {
                                            status = OfflineReadEntity.Status.DOWNLOADING_HTML;
                                        }
                                        OfflineReadEntity.Status status3 = status;
                                        OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                                        OfflineReadEntity offlineReadEntity6 = offlineReadEntity3;
                                        OfflineReadEntity copy$default = OfflineReadEntity.copy$default(offlineReadEntity6, 0L, null, null, null, 0L, 0L, System.currentTimeMillis(), status3, 0, null, null, 1855, null);
                                        offlineReadsServiceImpl$retryDownload$15.L$0 = offlineReadEntity6;
                                        offlineReadsServiceImpl$retryDownload$15.L$1 = null;
                                        offlineReadsServiceImpl$retryDownload$15.L$2 = null;
                                        offlineReadsServiceImpl$retryDownload$15.L$3 = null;
                                        offlineReadsServiceImpl$retryDownload$15.L$4 = null;
                                        offlineReadsServiceImpl$retryDownload$15.J$0 = j13;
                                        offlineReadsServiceImpl$retryDownload$15.label = 5;
                                        if (offlineReadsDao2.update(copy$default, offlineReadsServiceImpl$retryDownload$15) != obj2) {
                                            offlineReadEntity4 = offlineReadEntity6;
                                        }
                                    }
                                }
                                return obj2;
                            }
                            j11 = offlineReadsServiceImpl$retryDownload$1.J$0;
                            offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$retryDownload$1.L$0;
                            sn.a.g(obj);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : (Iterable) obj) {
                                if (((OfflineChapterEntity) obj3).getStatus() == OfflineChapterEntity.Status.ERROR) {
                                    arrayList.add(obj3);
                                }
                            }
                            Iterator it3 = arrayList.iterator();
                            offlineReadEntity3 = offlineReadEntity2;
                            offlineReadsServiceImpl$retryDownload$12 = offlineReadsServiceImpl$retryDownload$1;
                            it = it3;
                            i11 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                }
                                offlineReadsServiceImpl$retryDownload$12 = offlineReadsServiceImpl$retryDownload$13;
                                j11 = j10;
                            }
                            return obj2;
                        }
                        j11 = offlineReadsServiceImpl$retryDownload$1.J$0;
                        offlineReadEntity2 = (OfflineReadEntity) offlineReadsServiceImpl$retryDownload$1.L$0;
                        sn.a.g(obj);
                        OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                        offlineReadsServiceImpl$retryDownload$1.L$0 = offlineReadEntity2;
                        offlineReadsServiceImpl$retryDownload$1.J$0 = j11;
                        offlineReadsServiceImpl$retryDownload$1.label = 3;
                        obj = offlineReadsDao3.getChaptersForRead(j11, offlineReadsServiceImpl$retryDownload$1);
                    } else {
                        j11 = offlineReadsServiceImpl$retryDownload$1.J$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(TAG, "retryDownload - offlineReadId: " + j11);
                    OfflineReadsDao offlineReadsDao4 = this.offlineReadsDao;
                    offlineReadsServiceImpl$retryDownload$1.J$0 = j11;
                    offlineReadsServiceImpl$retryDownload$1.label = 1;
                    obj = offlineReadsDao4.getOfflineReadById(j11, offlineReadsServiceImpl$retryDownload$1);
                }
                offlineReadEntity = (OfflineReadEntity) obj;
                if (offlineReadEntity != null) {
                    this.logger.logError(TAG, android.gov.nist.javax.sip.header.a.k("No offline read with id=", j11, " found"), null);
                    return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                }
                if (offlineReadEntity.getStatus() == OfflineReadEntity.Status.READY) {
                    Logger.logWarning$default(this.logger, TAG, android.gov.nist.javax.sip.header.a.k("Download with id=", j11, " already in READY state; no-op"), null, 4, null);
                    return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
                }
                if (offlineReadEntity.getStatus() == OfflineReadEntity.Status.ERROR) {
                    offlineReadsServiceImpl$retryDownload$1.L$0 = offlineReadEntity;
                    offlineReadsServiceImpl$retryDownload$1.J$0 = j11;
                    offlineReadsServiceImpl$retryDownload$1.label = 2;
                    if (backfillChapterEntitiesIfNeeded(offlineReadEntity, offlineReadsServiceImpl$retryDownload$1) != obj2) {
                        offlineReadEntity2 = offlineReadEntity;
                        OfflineReadsDao offlineReadsDao32 = this.offlineReadsDao;
                        offlineReadsServiceImpl$retryDownload$1.L$0 = offlineReadEntity2;
                        offlineReadsServiceImpl$retryDownload$1.J$0 = j11;
                        offlineReadsServiceImpl$retryDownload$1.label = 3;
                        obj = offlineReadsDao32.getChaptersForRead(j11, offlineReadsServiceImpl$retryDownload$1);
                    }
                    return obj2;
                }
                doSubmitWorkStep(offlineReadEntity.getId());
                return DownloadReadResult.InitiatedSuccessfully.INSTANCE;
            }
        }
        offlineReadsServiceImpl$retryDownload$1 = new OfflineReadsServiceImpl$retryDownload$1(this, cVar);
        Object obj4 = offlineReadsServiceImpl$retryDownload$1.result;
        i10 = offlineReadsServiceImpl$retryDownload$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        offlineReadEntity = (OfflineReadEntity) obj4;
        if (offlineReadEntity != null) {
        }
    }

    private final void scheduleDrmRelease(String readId, List<OfflineChapterEntity> chapters) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OfflineChapterEntity offlineChapterEntity : chapters) {
            if (offlineChapterEntity.getDrmKeySetId() != null && offlineChapterEntity.getFileNumber() != null) {
                arrayList.add(offlineChapterEntity.getFileNumber());
                arrayList2.add(offlineChapterEntity.getDrmKeySetId());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        DrmLicenseReleaseWorker.INSTANCE.schedule(this.context, readId, arrayList, arrayList2);
    }
}
