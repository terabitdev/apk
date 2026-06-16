package io.livekit.android.room.participant;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.room.participant.Participant;
import kotlin.Metadata;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$RpcRequest;
import sn.a;
import sn.z;
import wn.c;
import xq.b;
import xq.d;
import xq.g;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$handleDataPacket$1", f = "LocalParticipant.kt", l = {1057}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$handleDataPacket$1 extends i implements p {
    final /* synthetic */ LivekitModels$DataPacket $packet;
    final /* synthetic */ LivekitModels$RpcRequest $rpcRequest;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$handleDataPacket$1(LocalParticipant localParticipant, LivekitModels$DataPacket livekitModels$DataPacket, LivekitModels$RpcRequest livekitModels$RpcRequest, c<? super LocalParticipant$handleDataPacket$1> cVar) {
        super(2, cVar);
        this.this$0 = localParticipant;
        this.$packet = livekitModels$DataPacket;
        this.$rpcRequest = livekitModels$RpcRequest;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LocalParticipant$handleDataPacket$1(this.this$0, this.$packet, this.$rpcRequest, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((LocalParticipant$handleDataPacket$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object m2584handleIncomingRpcRequestOYFzt6o;
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
            LocalParticipant localParticipant = this.this$0;
            String participantIdentity = this.$packet.getParticipantIdentity();
            participantIdentity.getClass();
            String m2605constructorimpl = Participant.Identity.m2605constructorimpl(participantIdentity);
            String id2 = this.$rpcRequest.getId();
            id2.getClass();
            String method = this.$rpcRequest.getMethod();
            method.getClass();
            String payload = this.$rpcRequest.getPayload();
            payload.getClass();
            xq.a aVar = b.f38124b;
            long o6 = g.o(this.$rpcRequest.getResponseTimeoutMs() & 4294967295L, d.MILLISECONDS);
            int version = this.$rpcRequest.getVersion();
            this.label = 1;
            m2584handleIncomingRpcRequestOYFzt6o = localParticipant.m2584handleIncomingRpcRequestOYFzt6o(m2605constructorimpl, id2, method, payload, o6, version, this);
            xn.a aVar2 = xn.a.f37986a;
            if (m2584handleIncomingRpcRequestOYFzt6o == aVar2) {
                return aVar2;
            }
        }
        return z.f31622a;
    }
}
