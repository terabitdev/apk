package io.elevenlabs.data.services;

import android.content.Context;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorker;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.NotificationServiceImpl$sync$5", f = "NotificationServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lsn/z;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class NotificationServiceImpl$sync$5 extends yn.i implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationServiceImpl$sync$5(NotificationServiceImpl notificationServiceImpl, wn.c<? super NotificationServiceImpl$sync$5> cVar) {
        super(2, cVar);
        this.this$0 = notificationServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        NotificationServiceImpl$sync$5 notificationServiceImpl$sync$5 = new NotificationServiceImpl$sync$5(this.this$0, cVar);
        notificationServiceImpl$sync$5.L$0 = obj;
        return notificationServiceImpl$sync$5;
    }

    @Override // ho.p
    public final Object invoke(String str, wn.c<? super z> cVar) {
        return ((NotificationServiceImpl$sync$5) create(str, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        Context context;
        String str2 = (String) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            logger = this.this$0.logger;
            str = this.this$0.tag;
            logger.log(str, "Enqueueing notification token submission worker");
            SubmitNotificationTokenWorker.Companion companion = SubmitNotificationTokenWorker.INSTANCE;
            context = this.this$0.appContext;
            companion.enqueue(context, str2);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
