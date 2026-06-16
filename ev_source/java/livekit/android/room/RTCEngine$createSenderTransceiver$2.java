package io.livekit.android.room;

import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpTransceiver;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$createSenderTransceiver$2", f = "RTCEngine.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Llivekit/org/webrtc/RtpTransceiver;", "kotlin.jvm.PlatformType", "Llivekit/org/webrtc/PeerConnection;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCEngine$createSenderTransceiver$2 extends i implements p {
    final /* synthetic */ MediaStreamTrack $rtcTrack;
    final /* synthetic */ RtpTransceiver.RtpTransceiverInit $transInit;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$createSenderTransceiver$2(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit, c<? super RTCEngine$createSenderTransceiver$2> cVar) {
        super(2, cVar);
        this.$rtcTrack = mediaStreamTrack;
        this.$transInit = rtpTransceiverInit;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$createSenderTransceiver$2 rTCEngine$createSenderTransceiver$2 = new RTCEngine$createSenderTransceiver$2(this.$rtcTrack, this.$transInit, cVar);
        rTCEngine$createSenderTransceiver$2.L$0 = obj;
        return rTCEngine$createSenderTransceiver$2;
    }

    @Override // ho.p
    public final Object invoke(PeerConnection peerConnection, c<? super RtpTransceiver> cVar) {
        return ((RTCEngine$createSenderTransceiver$2) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.g(obj);
            return ((PeerConnection) this.L$0).addTransceiver(this.$rtcTrack, this.$transInit);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
