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
import io.elevenlabs.domain.services.UserConfigService;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/data/worker/SaveUserConfigWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ldc/t;", "doWork", "(Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/di/WorkerEntryPoint;", "entryPoint", "Lio/elevenlabs/di/WorkerEntryPoint;", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SaveUserConfigWorker extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String WORK_NAME = "save_user_config";
    private final Context appContext;
    private final WorkerEntryPoint entryPoint;
    private final Logger logger;
    private final String tag;
    private final UserConfigService userConfigService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveUserConfigWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.appContext = context;
        WorkerEntryPoint entryPoint = WorkerEntryPoint.INSTANCE.getEntryPoint(context);
        this.entryPoint = entryPoint;
        this.userConfigService = entryPoint.getUserConfigService();
        this.logger = entryPoint.getLogger();
        this.tag = "SaveUserConfigWorker";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(c<? super t> cVar) {
        SaveUserConfigWorker$doWork$1 saveUserConfigWorker$doWork$1;
        int i10;
        try {
            if (cVar instanceof SaveUserConfigWorker$doWork$1) {
                saveUserConfigWorker$doWork$1 = (SaveUserConfigWorker$doWork$1) cVar;
                int i11 = saveUserConfigWorker$doWork$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    saveUserConfigWorker$doWork$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = saveUserConfigWorker$doWork$1.result;
                    i10 = saveUserConfigWorker$doWork$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        this.logger.log(this.tag, "Starting to save user config");
                        UserConfigService userConfigService = this.userConfigService;
                        saveUserConfigWorker$doWork$1.label = 1;
                        Object syncPendingChanges = userConfigService.syncPendingChanges(saveUserConfigWorker$doWork$1);
                        xn.a aVar = xn.a.f37986a;
                        if (syncPendingChanges == aVar) {
                            return aVar;
                        }
                    }
                    this.logger.log(this.tag, "Successfully saved user config");
                    return new s();
                }
            }
            if (i10 == 0) {
            }
            this.logger.log(this.tag, "Successfully saved user config");
            return new s();
        } catch (Exception e10) {
            this.logger.logWarning(this.tag, "Error saving user config - " + e10.getMessage(), e10);
            return new Object();
        }
        saveUserConfigWorker$doWork$1 = new SaveUserConfigWorker$doWork$1(this, cVar);
        Object obj2 = saveUserConfigWorker$doWork$1.result;
        i10 = saveUserConfigWorker$doWork$1.label;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/data/worker/SaveUserConfigWorker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lsn/z;", "enqueue", "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void enqueue(Context context) {
            context.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e eVar = new e(new mc.e(null), w.f7917b, false, false, false, false, -1L, -1L, o.l1(linkedHashSet));
            y yVar = new y(SaveUserConfigWorker.class, 0);
            ((lc.o) yVar.f7881c).f21682j = eVar;
            r.c(context).b(SaveUserConfigWorker.WORK_NAME, l.f7896a, (z) yVar.a());
        }

        private Companion() {
        }
    }
}
