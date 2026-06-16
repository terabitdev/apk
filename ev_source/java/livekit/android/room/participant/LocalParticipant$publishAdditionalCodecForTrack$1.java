package io.livekit.android.room.participant;

import as.jb;
import as.xc;
import com.google.protobuf.c6;
import et.d;
import fr.d0;
import fr.d2;
import fr.g0;
import fr.j0;
import ho.p;
import io.livekit.android.room.PeerConnectionTransportKt;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.SimulcastTrackInfo;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.room.track.VideoCodec;
import io.livekit.android.room.util.EncodingUtils;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$SimulcastCodec;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.VideoTrack;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$publishAdditionalCodecForTrack$1", f = "LocalParticipant.kt", l = {1507, 1547, 1549}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishAdditionalCodecForTrack$1 extends i implements p {
    final /* synthetic */ VideoCodec $codec;
    final /* synthetic */ TrackPublication $existingPublication;
    final /* synthetic */ List<RtpParameters.Encoding> $newEncodings;
    final /* synthetic */ VideoTrackPublishOptions $newOptions;
    final /* synthetic */ VideoTrackPublishOptions $options;
    final /* synthetic */ SimulcastTrackInfo $simulcastTrack;
    final /* synthetic */ LocalVideoTrack $track;
    final /* synthetic */ RtpTransceiver.RtpTransceiverInit $transceiverInit;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocalParticipant$publishAdditionalCodecForTrack$1(LocalParticipant localParticipant, LocalVideoTrack localVideoTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit, VideoCodec videoCodec, TrackPublication trackPublication, List<? extends RtpParameters.Encoding> list, VideoTrackPublishOptions videoTrackPublishOptions, SimulcastTrackInfo simulcastTrackInfo, VideoTrackPublishOptions videoTrackPublishOptions2, c<? super LocalParticipant$publishAdditionalCodecForTrack$1> cVar) {
        super(2, cVar);
        this.this$0 = localParticipant;
        this.$track = localVideoTrack;
        this.$transceiverInit = rtpTransceiverInit;
        this.$codec = videoCodec;
        this.$existingPublication = trackPublication;
        this.$newEncodings = list;
        this.$newOptions = videoTrackPublishOptions;
        this.$simulcastTrack = simulcastTrackInfo;
        this.$options = videoTrackPublishOptions2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        LocalParticipant$publishAdditionalCodecForTrack$1 localParticipant$publishAdditionalCodecForTrack$1 = new LocalParticipant$publishAdditionalCodecForTrack$1(this.this$0, this.$track, this.$transceiverInit, this.$codec, this.$existingPublication, this.$newEncodings, this.$newOptions, this.$simulcastTrack, this.$options, cVar);
        localParticipant$publishAdditionalCodecForTrack$1.L$0 = obj;
        return localParticipant$publishAdditionalCodecForTrack$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((LocalParticipant$publishAdditionalCodecForTrack$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0130, code lost:
    
        if (r2 == r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0132, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0125, code lost:
    
        if (r7.join(r18) == r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r11 == r10) goto L31;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        Object createSenderTransceiver$livekit_android_sdk_release;
        j0 g10;
        Object await;
        int i10 = this.label;
        z zVar = z.f31622a;
        a aVar = a.f37986a;
        try {
        } catch (Exception e10) {
            LKLog.Companion companion = LKLog.INSTANCE;
            VideoCodec videoCodec = this.$codec;
            LocalVideoTrack localVideoTrack = this.$track;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(e10, "exception when publishing " + videoCodec + " for track " + localVideoTrack.getSid(), new Object[0]);
            }
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        await = obj;
                        LivekitModels$TrackInfo livekitModels$TrackInfo = (LivekitModels$TrackInfo) await;
                        LKLog.Companion companion2 = LKLog.INSTANCE;
                        VideoCodec videoCodec2 = this.$codec;
                        LocalVideoTrack localVideoTrack2 = this.$track;
                        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.a(null, "published " + videoCodec2 + " for track " + localVideoTrack2.getSid() + ", " + livekitModels$TrackInfo, new Object[0]);
                            return zVar;
                        }
                        return zVar;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g10 = (j0) this.L$0;
                sn.a.g(obj);
                this.L$0 = null;
                this.label = 3;
                await = g10.await(this);
            } else {
                d0Var = (d0) this.L$0;
                sn.a.g(obj);
                createSenderTransceiver$livekit_android_sdk_release = obj;
            }
        } else {
            sn.a.g(obj);
            d0Var = (d0) this.L$0;
            RTCEngine engine = this.this$0.getEngine();
            VideoTrack rtcTrack = this.$track.getRtcTrack();
            RtpTransceiver.RtpTransceiverInit rtpTransceiverInit = this.$transceiverInit;
            this.L$0 = d0Var;
            this.label = 1;
            createSenderTransceiver$livekit_android_sdk_release = engine.createSenderTransceiver$livekit_android_sdk_release(rtcTrack, rtpTransceiverInit, this);
        }
        RtpTransceiver rtpTransceiver = (RtpTransceiver) createSenderTransceiver$livekit_android_sdk_release;
        if (rtpTransceiver == null) {
            LKLog.Companion companion3 = LKLog.INSTANCE;
            VideoCodec videoCodec3 = this.$codec;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "couldn't create new transceiver! " + videoCodec3, new Object[0]);
                return zVar;
            }
            return zVar;
        }
        jb newBuilder = LivekitRtc$AddTrackRequest.newBuilder();
        TrackPublication trackPublication = this.$existingPublication;
        LocalVideoTrack localVideoTrack3 = this.$track;
        List<RtpParameters.Encoding> list = this.$newEncodings;
        VideoCodec videoCodec4 = this.$codec;
        newBuilder.n(trackPublication.getSid());
        newBuilder.l(!localVideoTrack3.getEnabled());
        newBuilder.o(trackPublication.getSource().toProto());
        xc newBuilder2 = LivekitRtc$SimulcastCodec.newBuilder();
        newBuilder2.c(videoCodec4.getCodecName());
        newBuilder2.b(rtpTransceiver.getSender().id());
        newBuilder.d((LivekitRtc$SimulcastCodec) newBuilder2.build());
        newBuilder.c(EncodingUtils.INSTANCE.videoLayersFromEncodings(localVideoTrack3.getDimensions().getWidth(), localVideoTrack3.getDimensions().getHeight(), list, PeerConnectionTransportKt.isSVCCodec(videoCodec4.getCodecName())));
        d2 D = g0.D(d0Var, null, null, new LocalParticipant$publishAdditionalCodecForTrack$1$negotiateJob$1(rtpTransceiver, this.$newOptions, this.this$0, this.$simulcastTrack, null), 3);
        g10 = g0.g(d0Var, null, new LocalParticipant$publishAdditionalCodecForTrack$1$publishJob$1(this.this$0, this.$simulcastTrack, this.$existingPublication, this.$options, newBuilder, null), 3);
        this.L$0 = g10;
        this.label = 2;
    }
}
