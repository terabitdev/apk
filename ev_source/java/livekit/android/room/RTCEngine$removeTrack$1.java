package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpSender;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$removeTrack$1", f = "RTCEngine.kt", l = {1398}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$removeTrack$1 extends i implements p {
    final /* synthetic */ MediaStreamTrack $rtcTrack;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.RTCEngine$removeTrack$1$1", f = "RTCEngine.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llivekit/org/webrtc/PeerConnection;", "Lsn/z;", "<anonymous>", "(Llivekit/org/webrtc/PeerConnection;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.RTCEngine$removeTrack$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ MediaStreamTrack $rtcTrack;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaStreamTrack mediaStreamTrack, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$rtcTrack = mediaStreamTrack;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rtcTrack, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(PeerConnection peerConnection, c<? super z> cVar) {
            return ((AnonymousClass1) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                a.g(obj);
                PeerConnection peerConnection = (PeerConnection) this.L$0;
                for (RtpSender rtpSender : peerConnection.getSenders()) {
                    MediaStreamTrack track = rtpSender.track();
                    if (track != null && m.c(track.id(), this.$rtcTrack.id())) {
                        peerConnection.removeTrack(rtpSender);
                    }
                }
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$removeTrack$1(RTCEngine rTCEngine, MediaStreamTrack mediaStreamTrack, c<? super RTCEngine$removeTrack$1> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$rtcTrack = mediaStreamTrack;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$removeTrack$1(this.this$0, this.$rtcTrack, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$removeTrack$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            PeerConnectionTransport publisher = this.this$0.getPublisher();
            if (publisher == null) {
                return null;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$rtcTrack, null);
            this.label = 1;
            obj = publisher.withPeerConnection(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        return (z) obj;
    }
}
