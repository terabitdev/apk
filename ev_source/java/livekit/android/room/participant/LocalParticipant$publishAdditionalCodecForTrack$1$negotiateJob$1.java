package io.livekit.android.room.participant;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.livekit.android.room.track.SimulcastTrackInfo;
import io.livekit.android.webrtc.RtpTransceiverExtKt;
import kotlin.Metadata;
import livekit.org.webrtc.RtpTransceiver;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$publishAdditionalCodecForTrack$1$negotiateJob$1", f = "LocalParticipant.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishAdditionalCodecForTrack$1$negotiateJob$1 extends i implements p {
    final /* synthetic */ VideoTrackPublishOptions $newOptions;
    final /* synthetic */ SimulcastTrackInfo $simulcastTrack;
    final /* synthetic */ RtpTransceiver $transceiver;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishAdditionalCodecForTrack$1$negotiateJob$1(RtpTransceiver rtpTransceiver, VideoTrackPublishOptions videoTrackPublishOptions, LocalParticipant localParticipant, SimulcastTrackInfo simulcastTrackInfo, c<? super LocalParticipant$publishAdditionalCodecForTrack$1$negotiateJob$1> cVar) {
        super(2, cVar);
        this.$transceiver = rtpTransceiver;
        this.$newOptions = videoTrackPublishOptions;
        this.this$0 = localParticipant;
        this.$simulcastTrack = simulcastTrackInfo;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LocalParticipant$publishAdditionalCodecForTrack$1$negotiateJob$1(this.$transceiver, this.$newOptions, this.this$0, this.$simulcastTrack, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((LocalParticipant$publishAdditionalCodecForTrack$1$negotiateJob$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        if (this.label == 0) {
            a.g(obj);
            RtpTransceiver rtpTransceiver = this.$transceiver;
            String videoCodec = this.$newOptions.getVideoCodec();
            lVar = this.this$0.capabilitiesGetter;
            RtpTransceiverExtKt.sortVideoCodecPreferences(rtpTransceiver, videoCodec, lVar);
            this.$simulcastTrack.setSender(this.$transceiver.getSender());
            this.this$0.getEngine().negotiatePublisher$livekit_android_sdk_release();
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
