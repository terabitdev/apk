package io.elevenlabs.data.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import io.elevenlabs.di.WorkerEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/elevenlabs/data/worker/SubmitNotificationTokenWorker;", "Lio/elevenlabs/data/worker/SubmitNotificationTokenWorkerBase;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SubmitNotificationTokenWorker extends SubmitNotificationTokenWorkerBase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String WORK_NAME = "submit_notification_token";
    private final Context appContext;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SubmitNotificationTokenWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters, r0.getEntryPoint(context).getNotificationService(), r0.getEntryPoint(context).getLogger());
        context.getClass();
        workerParameters.getClass();
        WorkerEntryPoint.Companion companion = WorkerEntryPoint.INSTANCE;
        this.appContext = context;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/data/worker/SubmitNotificationTokenWorker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lsn/z;", "enqueue", "(Landroid/content/Context;Ljava/lang/String;)V", "WORK_NAME", "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void enqueue(Context context, String token) {
            context.getClass();
            token.getClass();
            SubmitNotificationTokenWorkerBase.INSTANCE.enqueue(context, token, SubmitNotificationTokenWorker.class);
        }

        private Companion() {
        }
    }
}
