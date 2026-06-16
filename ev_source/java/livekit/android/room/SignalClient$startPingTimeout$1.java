package io.livekit.android.room;

import com.google.protobuf.c6;
import et.d;
import fr.d0;
import fr.g0;
import ho.p;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import okhttp3.WebSocket;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.SignalClient$startPingTimeout$1", f = "SignalClient.kt", l = {823}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SignalClient$startPingTimeout$1 extends i implements p {
    final /* synthetic */ long $timestamp;
    int label;
    final /* synthetic */ SignalClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalClient$startPingTimeout$1(SignalClient signalClient, long j4, c<? super SignalClient$startPingTimeout$1> cVar) {
        super(2, cVar);
        this.this$0 = signalClient;
        this.$timestamp = j4;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new SignalClient$startPingTimeout$1(this.this$0, this.$timestamp, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((SignalClient$startPingTimeout$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        long j4;
        WebSocket webSocket;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            j4 = this.this$0.pingTimeoutDurationMillis;
            this.label = 1;
            Object m10 = g0.m(j4, this);
            xn.a aVar = xn.a.f37986a;
            if (m10 == aVar) {
                return aVar;
            }
        }
        LKLog.Companion companion = LKLog.INSTANCE;
        long j10 = this.$timestamp;
        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.a(null, "Ping timeout reached for ping sent at " + j10 + '.', new Object[0]);
        }
        webSocket = this.this$0.currentWs;
        if (webSocket != null) {
            webSocket.f(SignalClient.CLOSE_REASON_PING_TIMEOUT, "Ping timeout");
        }
        return z.f31622a;
    }
}
