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
import io.elevenlabs.di.WorkerEntryPoint;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadBookmarkService;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/data/worker/BookmarkSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ldc/t;", "doWork", "(Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/di/WorkerEntryPoint;", "entryPoint", "Lio/elevenlabs/di/WorkerEntryPoint;", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "bookmarkService", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BookmarkSyncWorker extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String WORK_NAME = "sync_all_bookmarks";
    private final Context appContext;
    private final ReadBookmarkService bookmarkService;
    private final WorkerEntryPoint entryPoint;
    private final Logger logger;
    private final String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.appContext = context;
        WorkerEntryPoint entryPoint = WorkerEntryPoint.INSTANCE.getEntryPoint(context);
        this.entryPoint = entryPoint;
        this.bookmarkService = entryPoint.getReadBookmarkService();
        this.logger = entryPoint.getLogger();
        this.tag = "BookmarkSyncWorker";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: Exception -> 0x0025, TRY_ENTER, TryCatch #0 {Exception -> 0x0025, blocks: (B:10:0x0021, B:11:0x0040, B:14:0x004a, B:17:0x0066, B:22:0x0031), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066 A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:10:0x0021, B:11:0x0040, B:14:0x004a, B:17:0x0066, B:22:0x0031), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(c<? super t> cVar) {
        BookmarkSyncWorker$doWork$1 bookmarkSyncWorker$doWork$1;
        int i10;
        int intValue;
        try {
            if (cVar instanceof BookmarkSyncWorker$doWork$1) {
                bookmarkSyncWorker$doWork$1 = (BookmarkSyncWorker$doWork$1) cVar;
                int i11 = bookmarkSyncWorker$doWork$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bookmarkSyncWorker$doWork$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = bookmarkSyncWorker$doWork$1.result;
                    i10 = bookmarkSyncWorker$doWork$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        ReadBookmarkService readBookmarkService = this.bookmarkService;
                        bookmarkSyncWorker$doWork$1.label = 1;
                        obj = readBookmarkService.syncAllPending(10, bookmarkSyncWorker$doWork$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    intValue = ((Number) obj).intValue();
                    Logger logger = this.logger;
                    if (intValue <= 0) {
                        logger.log(this.tag, intValue + " bookmarks still pending, will retry");
                        return new Object();
                    }
                    logger.log(this.tag, "All bookmarks synced successfully");
                    return new s();
                }
            }
            if (i10 == 0) {
            }
            intValue = ((Number) obj).intValue();
            Logger logger2 = this.logger;
            if (intValue <= 0) {
            }
        } catch (Exception e10) {
            this.logger.logWarning(this.tag, "Error syncing bookmarks", e10);
            return new Object();
        }
        bookmarkSyncWorker$doWork$1 = new BookmarkSyncWorker$doWork$1(this, cVar);
        Object obj2 = bookmarkSyncWorker$doWork$1.result;
        i10 = bookmarkSyncWorker$doWork$1.label;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/data/worker/BookmarkSyncWorker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsn/z;", "enqueue", "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void enqueue(Context context) {
            context.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e eVar = new e(new mc.e(null), w.f7917b, false, false, false, false, -1L, -1L, o.l1(linkedHashSet));
            y yVar = new y(BookmarkSyncWorker.class, 0);
            ((lc.o) yVar.f7881c).f21682j = eVar;
            r.c(context).b(BookmarkSyncWorker.WORK_NAME, l.f7896a, (z) yVar.a());
        }

        private Companion() {
        }
    }
}
