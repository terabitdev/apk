package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.webrtc.DataChannelManager;
import io.livekit.android.webrtc.DataPacketBuffer;
import ir.j;
import ir.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$configure$2$2$3$1$1", f = "RTCEngine.kt", l = {341}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$configure$2$2$3$1$1 extends i implements p {
    final /* synthetic */ DataChannelManager $dataChannelManager;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$configure$2$2$3$1$1(DataChannelManager dataChannelManager, RTCEngine rTCEngine, c<? super RTCEngine$configure$2$2$3$1$1> cVar) {
        super(2, cVar);
        this.$dataChannelManager = dataChannelManager;
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$configure$2$2$3$1$1(this.$dataChannelManager, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$configure$2$2$3$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
        } else {
            a.g(obj);
            z1 flow = FlowDelegateKt.getFlow(new v(this.$dataChannelManager) { // from class: io.livekit.android.room.RTCEngine$configure$2$2$3$1$1.1
                @Override // oo.r
                public Object get() {
                    return Long.valueOf(((DataChannelManager) this.receiver).getBufferedAmount());
                }
            });
            final RTCEngine rTCEngine = this.this$0;
            j jVar = new j() { // from class: io.livekit.android.room.RTCEngine$configure$2$2$3$1$1.2
                public final Object emit(long j4, c<? super z> cVar) {
                    Object obj2;
                    DataPacketBuffer dataPacketBuffer;
                    obj2 = RTCEngine.this.reliableStateLock;
                    RTCEngine rTCEngine2 = RTCEngine.this;
                    synchronized (obj2) {
                        dataPacketBuffer = rTCEngine2.reliableMessageBuffer;
                        dataPacketBuffer.trim(j4);
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit(((Number) obj2).longValue(), (c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = flow.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        c6.u();
        return null;
    }
}
