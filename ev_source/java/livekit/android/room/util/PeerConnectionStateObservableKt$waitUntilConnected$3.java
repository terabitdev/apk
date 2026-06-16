package io.livekit.android.room.util;

import com.google.protobuf.c6;
import ho.p;
import io.livekit.android.webrtc.PeerConnectionExtKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.util.PeerConnectionStateObservableKt$waitUntilConnected$3", f = "PeerConnectionStateObservable.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionStateObservableKt$waitUntilConnected$3 extends i implements p {
    /* synthetic */ Object L$0;
    int label;

    public PeerConnectionStateObservableKt$waitUntilConnected$3(c<? super PeerConnectionStateObservableKt$waitUntilConnected$3> cVar) {
        super(2, cVar);
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        PeerConnectionStateObservableKt$waitUntilConnected$3 peerConnectionStateObservableKt$waitUntilConnected$3 = new PeerConnectionStateObservableKt$waitUntilConnected$3(cVar);
        peerConnectionStateObservableKt$waitUntilConnected$3.L$0 = obj;
        return peerConnectionStateObservableKt$waitUntilConnected$3;
    }

    @Override // ho.p
    public final Object invoke(PeerConnection.PeerConnectionState peerConnectionState, c<? super Boolean> cVar) {
        return ((PeerConnectionStateObservableKt$waitUntilConnected$3) create(peerConnectionState, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.g(obj);
            return Boolean.valueOf(!PeerConnectionExtKt.isConnected((PeerConnection.PeerConnectionState) this.L$0));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
