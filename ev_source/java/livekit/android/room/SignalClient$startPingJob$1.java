package io.livekit.android.room;

import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.SignalClient$startPingJob$1", f = "SignalClient.kt", l = {810}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SignalClient$startPingJob$1 extends i implements p {
    int label;
    final /* synthetic */ SignalClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalClient$startPingJob$1(SignalClient signalClient, c<? super SignalClient$startPingJob$1> cVar) {
        super(2, cVar);
        this.this$0 = signalClient;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new SignalClient$startPingJob$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((SignalClient$startPingJob$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0023 -> B:5:0x0026). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            sn.a.g(r5)
            goto L26
        Lb:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.google.protobuf.c6.x(r5)
            r5 = 0
            return r5
        L12:
            sn.a.g(r5)
        L15:
            io.livekit.android.room.SignalClient r5 = r4.this$0
            long r2 = io.livekit.android.room.SignalClient.access$getPingIntervalDurationMillis$p(r5)
            r4.label = r1
            java.lang.Object r5 = fr.g0.m(r2, r4)
            xn.a r0 = xn.a.f37986a
            if (r5 != r0) goto L26
            return r0
        L26:
            io.livekit.android.room.SignalClient r5 = r4.this$0
            long r2 = r5.sendPing()
            io.livekit.android.room.SignalClient r5 = r4.this$0
            io.livekit.android.room.SignalClient.access$startPingTimeout(r5, r2)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.room.SignalClient$startPingJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
