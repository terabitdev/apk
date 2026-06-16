package io.livekit.android.room.participant;

import com.google.protobuf.c6;
import fr.g0;
import fr.k1;
import fr.n;
import ho.p;
import io.livekit.android.rpc.RpcError;
import io.livekit.android.util.StringByteUtilsKt;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import sn.l;
import sn.m;
import sn.z;
import wn.c;
import xn.a;
import xq.b;
import xq.d;
import xq.g;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$performRpc$2", f = "LocalParticipant.kt", l = {1119, 1969}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$performRpc$2 extends i implements p {
    final /* synthetic */ String $destinationIdentity;
    final /* synthetic */ String $method;
    final /* synthetic */ String $payload;
    final /* synthetic */ long $responseTimeout;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$performRpc$2(String str, LocalParticipant localParticipant, long j4, String str2, String str3, c<? super LocalParticipant$performRpc$2> cVar) {
        super(2, cVar);
        this.$payload = str;
        this.this$0 = localParticipant;
        this.$responseTimeout = j4;
        this.$destinationIdentity = str2;
        this.$method = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0$cleanup(d0 d0Var, d0 d0Var2, LocalParticipant localParticipant, String str) {
        Map map;
        Map map2;
        k1 k1Var = (k1) d0Var.f20559a;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        k1 k1Var2 = (k1) d0Var2.f20559a;
        if (k1Var2 != null) {
            k1Var2.cancel((CancellationException) null);
        }
        map = localParticipant.pendingAcks;
        map.remove(str);
        map2 = localParticipant.pendingResponses;
        map2.remove(str);
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        LocalParticipant$performRpc$2 localParticipant$performRpc$2 = new LocalParticipant$performRpc$2(this.$payload, this.this$0, this.$responseTimeout, this.$destinationIdentity, this.$method, cVar);
        localParticipant$performRpc$2.L$0 = obj;
        return localParticipant$performRpc$2;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super String> cVar) {
        return ((LocalParticipant$performRpc$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0171, code lost:
    
        if (r0 == r12) goto L34;
     */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String uuid;
        Object m2587publishRpcRequestk7jHMGI;
        fr.d0 d0Var;
        long j4;
        Map map;
        Map map2;
        Object s10;
        int i10 = this.label;
        RpcError rpcError = null;
        a aVar = a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    s10 = obj;
                    return (String) s10;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = this.J$0;
            uuid = (String) this.L$1;
            d0Var = (fr.d0) this.L$0;
            sn.a.g(obj);
            m2587publishRpcRequestk7jHMGI = ((m) obj).f31603a;
        } else {
            sn.a.g(obj);
            fr.d0 d0Var2 = (fr.d0) this.L$0;
            xq.a aVar2 = b.f38124b;
            d dVar = d.SECONDS;
            long n2 = g.n(7, dVar);
            long n10 = g.n(1, dVar);
            if (StringByteUtilsKt.byteLength(this.$payload) <= 15360) {
                gl.a serverVersion$livekit_android_sdk_release = this.this$0.getEngine().getServerVersion$livekit_android_sdk_release();
                if (serverVersion$livekit_android_sdk_release != null) {
                    if (serverVersion$livekit_android_sdk_release.compareTo(new gl.a("1.8.0")) >= 0) {
                        uuid = UUID.randomUUID().toString();
                        uuid.getClass();
                        b bVar = new b(b.g(this.$responseTimeout, b.k(n2)));
                        b bVar2 = new b(n10);
                        if (bVar.compareTo(bVar2) < 0) {
                            bVar = bVar2;
                        }
                        LocalParticipant localParticipant = this.this$0;
                        String str = this.$destinationIdentity;
                        String str2 = this.$method;
                        String str3 = this.$payload;
                        this.L$0 = d0Var2;
                        this.L$1 = uuid;
                        this.J$0 = n2;
                        this.label = 1;
                        m2587publishRpcRequestk7jHMGI = localParticipant.m2587publishRpcRequestk7jHMGI(str, uuid, str2, str3, bVar.f38128a, this);
                        if (m2587publishRpcRequestk7jHMGI != aVar) {
                            d0Var = d0Var2;
                            j4 = n2;
                        }
                        return aVar;
                    }
                    throw RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.UNSUPPORTED_SERVER, null, null, 3, null);
                }
                throw RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.SEND_FAILED, "Not connected.", null, 2, null);
            }
            throw RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.REQUEST_PAYLOAD_TOO_LARGE, null, null, 3, null);
        }
        String str4 = uuid;
        if (m2587publishRpcRequestk7jHMGI instanceof l) {
            Throwable a10 = m.a(m2587publishRpcRequestk7jHMGI);
            if (a10 instanceof RpcError) {
                rpcError = (RpcError) a10;
            }
            if (rpcError == null) {
                throw RpcError.BuiltinRpcError.SEND_FAILED.create("Error while sending rpc request.", m.a(m2587publishRpcRequestk7jHMGI));
            }
            throw rpcError;
        }
        LocalParticipant localParticipant2 = this.this$0;
        String str5 = this.$destinationIdentity;
        long j10 = this.$responseTimeout;
        this.L$0 = d0Var;
        this.L$1 = str4;
        this.L$2 = localParticipant2;
        this.L$3 = str5;
        this.J$0 = j4;
        this.J$1 = j10;
        this.label = 2;
        n nVar = new n(1, gg.b.V(this));
        nVar.t();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        nVar.e(new LocalParticipant$performRpc$2$responsePayload$1$1(obj2, obj3, localParticipant2, str4));
        obj2.f20559a = g0.D(d0Var, null, null, new LocalParticipant$performRpc$2$responsePayload$1$2(j4, localParticipant2, str4, nVar, null), 3);
        map = localParticipant2.pendingAcks;
        map.getClass();
        map.put(str4, new PendingRpcAck(new LocalParticipant$performRpc$2$responsePayload$1$3(obj2), str5, null));
        obj3.f20559a = g0.D(d0Var, null, null, new LocalParticipant$performRpc$2$responsePayload$1$4(j10, localParticipant2, str4, nVar, null), 3);
        map2 = localParticipant2.pendingResponses;
        map2.getClass();
        map2.put(str4, new PendingRpcResponse(new LocalParticipant$performRpc$2$responsePayload$1$5(localParticipant2, str4, nVar, obj2, obj3), str5, null));
        s10 = nVar.s();
    }
}
