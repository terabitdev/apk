package io.livekit.android.room.participant;

import com.google.firebase.messaging.Constants;
import defpackage.f;
import et.d;
import fr.l;
import ho.p;
import io.livekit.android.rpc.RpcError;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "payload", "Lio/livekit/android/rpc/RpcError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lsn/z;", "invoke", "(Ljava/lang/String;Lio/livekit/android/rpc/RpcError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$performRpc$2$responsePayload$1$5 extends n implements p {
    final /* synthetic */ d0 $ackTimeoutJob;
    final /* synthetic */ l $continuation;
    final /* synthetic */ String $requestId;
    final /* synthetic */ d0 $responseTimeoutJob;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$performRpc$2$responsePayload$1$5(LocalParticipant localParticipant, String str, l lVar, d0 d0Var, d0 d0Var2) {
        super(2);
        this.this$0 = localParticipant;
        this.$requestId = str;
        this.$continuation = lVar;
        this.$ackTimeoutJob = d0Var;
        this.$responseTimeoutJob = d0Var2;
    }

    public final void invoke(String str, RpcError rpcError) {
        Map map;
        map = this.this$0.pendingAcks;
        if (map.containsKey(this.$requestId)) {
            LKLog.Companion companion = LKLog.INSTANCE;
            String str2 = this.$requestId;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(null, f.i("RPC response received before ack, id: ", str2), new Object[0]);
            }
        }
        LocalParticipant$performRpc$2.invokeSuspend$lambda$0$cleanup(this.$ackTimeoutJob, this.$responseTimeoutJob, this.this$0, this.$requestId);
        l lVar = this.$continuation;
        if (rpcError != null) {
            lVar.cancel(rpcError);
            return;
        }
        if (str == null) {
            str = "";
        }
        lVar.resumeWith(str);
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (RpcError) obj2);
        return z.f31622a;
    }
}
