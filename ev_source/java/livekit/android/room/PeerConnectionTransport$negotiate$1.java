package io.livekit.android.room;

import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import livekit.org.webrtc.MediaConstraints;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.PeerConnectionTransport$negotiate$1", f = "PeerConnectionTransport.kt", l = {138, 140}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llivekit/org/webrtc/MediaConstraints;", "it", "Lsn/z;", "<anonymous>", "(Llivekit/org/webrtc/MediaConstraints;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$negotiate$1 extends i implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$negotiate$1(PeerConnectionTransport peerConnectionTransport, c<? super PeerConnectionTransport$negotiate$1> cVar) {
        super(2, cVar);
        this.this$0 = peerConnectionTransport;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        PeerConnectionTransport$negotiate$1 peerConnectionTransport$negotiate$1 = new PeerConnectionTransport$negotiate$1(this.this$0, cVar);
        peerConnectionTransport$negotiate$1.L$0 = obj;
        return peerConnectionTransport$negotiate$1;
    }

    @Override // ho.p
    public final Object invoke(MediaConstraints mediaConstraints, c<? super z> cVar) {
        return ((PeerConnectionTransport$negotiate$1) create(mediaConstraints, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r5 == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (io.livekit.android.room.PeerConnectionTransport.createAndSendOffer$default(r0, null, r4, 1, null) == r3) goto L17;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object createAndSendOffer;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
        } else {
            a.g(obj);
            MediaConstraints mediaConstraints = (MediaConstraints) this.L$0;
            PeerConnectionTransport peerConnectionTransport = this.this$0;
            xn.a aVar = xn.a.f37986a;
            if (mediaConstraints != null) {
                this.label = 1;
                createAndSendOffer = peerConnectionTransport.createAndSendOffer(mediaConstraints, this);
            } else {
                this.label = 2;
            }
        }
        return z.f31622a;
    }
}
