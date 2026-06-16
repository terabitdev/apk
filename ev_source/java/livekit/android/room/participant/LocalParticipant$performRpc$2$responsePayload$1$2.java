package io.livekit.android.room.participant;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import fr.l;
import ho.p;
import io.livekit.android.rpc.RpcError;
import java.util.Map;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$performRpc$2$responsePayload$1$2", f = "LocalParticipant.kt", l = {1147}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$performRpc$2$responsePayload$1$2 extends i implements p {
    final /* synthetic */ l $continuation;
    final /* synthetic */ long $maxRoundTripLatency;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$performRpc$2$responsePayload$1$2(long j4, LocalParticipant localParticipant, String str, l lVar, c<? super LocalParticipant$performRpc$2$responsePayload$1$2> cVar) {
        super(2, cVar);
        this.$maxRoundTripLatency = j4;
        this.this$0 = localParticipant;
        this.$requestId = str;
        this.$continuation = lVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LocalParticipant$performRpc$2$responsePayload$1$2(this.$maxRoundTripLatency, this.this$0, this.$requestId, this.$continuation, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((LocalParticipant$performRpc$2$responsePayload$1$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map map2;
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
            long j4 = this.$maxRoundTripLatency;
            this.label = 1;
            Object n2 = g0.n(j4, this);
            xn.a aVar = xn.a.f37986a;
            if (n2 == aVar) {
                return aVar;
            }
        }
        map = this.this$0.pendingAcks;
        if (map.remove(this.$requestId) != null) {
            map2 = this.this$0.pendingResponses;
            map2.remove(this.$requestId);
            this.$continuation.cancel(RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.CONNECTION_TIMEOUT, null, null, 3, null));
        }
        return z.f31622a;
    }
}
