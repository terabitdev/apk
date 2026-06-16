package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.g0;
import fr.k1;
import ho.p;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.util.CloseableCoroutineScope;
import io.livekit.android.webrtc.DataChannelManager;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.PeerConnection;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$configure$2$2$3", f = "RTCEngine.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Llivekit/org/webrtc/DataChannel;", "kotlin.jvm.PlatformType", "Llivekit/org/webrtc/PeerConnection;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCEngine$configure$2$2$3 extends i implements p {
    final /* synthetic */ DataChannel.Init $reliableInit;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$configure$2$2$3(DataChannel.Init init, RTCEngine rTCEngine, c<? super RTCEngine$configure$2$2$3> cVar) {
        super(2, cVar);
        this.$reliableInit = init;
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$configure$2$2$3 rTCEngine$configure$2$2$3 = new RTCEngine$configure$2$2$3(this.$reliableInit, this.this$0, cVar);
        rTCEngine$configure$2$2$3.L$0 = obj;
        return rTCEngine$configure$2$2$3;
    }

    @Override // ho.p
    public final Object invoke(PeerConnection peerConnection, c<? super DataChannel> cVar) {
        return ((RTCEngine$configure$2$2$3) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        RTCThreadToken rTCThreadToken;
        k1 k1Var;
        CloseableCoroutineScope closeableCoroutineScope;
        if (this.label == 0) {
            a.g(obj);
            DataChannel createDataChannel = ((PeerConnection) this.L$0).createDataChannel(RTCEngine.RELIABLE_DATA_CHANNEL_LABEL, this.$reliableInit);
            RTCEngine rTCEngine = this.this$0;
            createDataChannel.getClass();
            RTCEngine.DataChannelObserver dataChannelObserver = new RTCEngine.DataChannelObserver(rTCEngine, createDataChannel);
            rTCThreadToken = rTCEngine.rtcThreadToken;
            DataChannelManager dataChannelManager = new DataChannelManager(createDataChannel, dataChannelObserver, rTCThreadToken);
            rTCEngine.reliableDataChannelManager = dataChannelManager;
            createDataChannel.registerObserver(dataChannelManager);
            k1Var = rTCEngine.reliableBufferedAmountJob;
            if (k1Var != null) {
                k1Var.cancel((CancellationException) null);
            }
            closeableCoroutineScope = rTCEngine.coroutineScope;
            rTCEngine.reliableBufferedAmountJob = g0.D(closeableCoroutineScope, null, null, new RTCEngine$configure$2$2$3$1$1(dataChannelManager, rTCEngine, null), 3);
            return createDataChannel;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
