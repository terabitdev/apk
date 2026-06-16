package io.livekit.android.room.participant;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import kotlin.Metadata;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.RemoteParticipant$addSubscribedMediaTrack$2", f = "RemoteParticipant.kt", l = {167}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteParticipant$addSubscribedMediaTrack$2 extends i implements p {
    final /* synthetic */ boolean $autoManageVideo;
    final /* synthetic */ MediaStreamTrack $mediaTrack;
    final /* synthetic */ RtpReceiver $receiver;
    final /* synthetic */ String $sid;
    final /* synthetic */ l $statsGetter;
    final /* synthetic */ int $triesLeft;
    int label;
    final /* synthetic */ RemoteParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteParticipant$addSubscribedMediaTrack$2(RemoteParticipant remoteParticipant, MediaStreamTrack mediaStreamTrack, String str, l lVar, RtpReceiver rtpReceiver, boolean z6, int i10, c<? super RemoteParticipant$addSubscribedMediaTrack$2> cVar) {
        super(2, cVar);
        this.this$0 = remoteParticipant;
        this.$mediaTrack = mediaStreamTrack;
        this.$sid = str;
        this.$statsGetter = lVar;
        this.$receiver = rtpReceiver;
        this.$autoManageVideo = z6;
        this.$triesLeft = i10;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RemoteParticipant$addSubscribedMediaTrack$2(this.this$0, this.$mediaTrack, this.$sid, this.$statsGetter, this.$receiver, this.$autoManageVideo, this.$triesLeft, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RemoteParticipant$addSubscribedMediaTrack$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            this.label = 1;
            Object m10 = g0.m(150L, this);
            xn.a aVar = xn.a.f37986a;
            if (m10 == aVar) {
                return aVar;
            }
        }
        this.this$0.addSubscribedMediaTrack(this.$mediaTrack, this.$sid, this.$statsGetter, this.$receiver, this.$autoManageVideo, this.$triesLeft - 1);
        return z.f31622a;
    }
}
