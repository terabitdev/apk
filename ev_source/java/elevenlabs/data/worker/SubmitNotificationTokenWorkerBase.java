package io.elevenlabs.data.worker;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.c6;
import dc.e;
import dc.l;
import dc.q;
import dc.s;
import dc.t;
import dc.w;
import dc.y;
import dc.z;
import ec.r;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.NotificationService;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import tn.o;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/data/worker/SubmitNotificationTokenWorkerBase;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lio/elevenlabs/domain/services/NotificationService;", "notificationService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lio/elevenlabs/domain/services/NotificationService;Lio/elevenlabs/domain/Logger;)V", "Ldc/t;", "doWork", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/NotificationService;", "getNotificationService", "()Lio/elevenlabs/domain/services/NotificationService;", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public class SubmitNotificationTokenWorkerBase extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_TOKEN = "token";
    public static final String WORK_NAME = "submit_notification_token";
    private final Logger logger;
    private final NotificationService notificationService;
    private final String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitNotificationTokenWorkerBase(Context context, WorkerParameters workerParameters, NotificationService notificationService, Logger logger) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        notificationService.getClass();
        logger.getClass();
        this.notificationService = notificationService;
        this.logger = logger;
        this.tag = "SubmitNotificationTokenWorker";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object doWork$suspendImpl(SubmitNotificationTokenWorkerBase submitNotificationTokenWorkerBase, c<? super t> cVar) {
        SubmitNotificationTokenWorkerBase$doWork$1 submitNotificationTokenWorkerBase$doWork$1;
        int i10;
        try {
            if (cVar instanceof SubmitNotificationTokenWorkerBase$doWork$1) {
                submitNotificationTokenWorkerBase$doWork$1 = (SubmitNotificationTokenWorkerBase$doWork$1) cVar;
                int i11 = submitNotificationTokenWorkerBase$doWork$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    submitNotificationTokenWorkerBase$doWork$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = submitNotificationTokenWorkerBase$doWork$1.result;
                    i10 = submitNotificationTokenWorkerBase$doWork$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            submitNotificationTokenWorkerBase = (SubmitNotificationTokenWorkerBase) submitNotificationTokenWorkerBase$doWork$1.L$0;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        String a10 = submitNotificationTokenWorkerBase.getInputData().a(KEY_TOKEN);
                        Logger logger = submitNotificationTokenWorkerBase.logger;
                        if (a10 == null) {
                            logger.logError(submitNotificationTokenWorkerBase.tag, "No token provided in work data", null);
                            return new q();
                        }
                        logger.log(submitNotificationTokenWorkerBase.tag, "Starting to submit notification token");
                        NotificationService notificationService = submitNotificationTokenWorkerBase.notificationService;
                        submitNotificationTokenWorkerBase$doWork$1.L$0 = submitNotificationTokenWorkerBase;
                        submitNotificationTokenWorkerBase$doWork$1.L$1 = null;
                        submitNotificationTokenWorkerBase$doWork$1.label = 1;
                        Object submitToken = notificationService.submitToken(a10, submitNotificationTokenWorkerBase$doWork$1);
                        xn.a aVar = xn.a.f37986a;
                        if (submitToken == aVar) {
                            return aVar;
                        }
                    }
                    submitNotificationTokenWorkerBase.logger.log(submitNotificationTokenWorkerBase.tag, "Successfully submitted notification token");
                    return new s();
                }
            }
            if (i10 == 0) {
            }
            submitNotificationTokenWorkerBase.logger.log(submitNotificationTokenWorkerBase.tag, "Successfully submitted notification token");
            return new s();
        } catch (Exception e10) {
            submitNotificationTokenWorkerBase.logger.logWarning(submitNotificationTokenWorkerBase.tag, "Error submitting notification token", e10);
            return new Object();
        }
        submitNotificationTokenWorkerBase$doWork$1 = new SubmitNotificationTokenWorkerBase$doWork$1(submitNotificationTokenWorkerBase, cVar);
        Object obj2 = submitNotificationTokenWorkerBase$doWork$1.result;
        i10 = submitNotificationTokenWorkerBase$doWork$1.label;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(c<? super t> cVar) {
        return doWork$suspendImpl(this, cVar);
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final NotificationService getNotificationService() {
        return this.notificationService;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/data/worker/SubmitNotificationTokenWorkerBase$Companion;", "", "<init>", "()V", "Lio/elevenlabs/data/worker/SubmitNotificationTokenWorkerBase;", TokenNames.T, "Landroid/content/Context;", "context", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Ljava/lang/Class;", "workerClass", "Lsn/z;", "enqueue", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)V", "WORK_NAME", "Ljava/lang/String;", "KEY_TOKEN", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final <T extends SubmitNotificationTokenWorkerBase> void enqueue(Context context, String token, Class<T> workerClass) {
            context.getClass();
            token.getClass();
            workerClass.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e eVar = new e(new mc.e(null), w.f7917b, false, false, false, false, -1L, -1L, o.l1(linkedHashSet));
            y yVar = new y(workerClass, 0);
            ((lc.o) yVar.f7881c).f21682j = eVar;
            k[] kVarArr = {new k(SubmitNotificationTokenWorkerBase.KEY_TOKEN, token)};
            ad.o oVar = new ad.o(1);
            k kVar = kVarArr[0];
            oVar.b((String) kVar.f31600a, kVar.f31601b);
            ((lc.o) yVar.f7881c).f21677e = oVar.a();
            r.c(context).b("submit_notification_token", l.f7896a, (z) yVar.a());
        }

        private Companion() {
        }
    }
}
