package io.livekit.android.room.participant;

import as.e9;
import as.jb;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.track.SimulcastTrackInfo;
import io.livekit.android.room.track.TrackPublication;
import kotlin.Metadata;
import livekit.LivekitModels$TrackInfo;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$publishAdditionalCodecForTrack$1$publishJob$1", f = "LocalParticipant.kt", l = {1539}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Llivekit/LivekitModels$TrackInfo;", "<anonymous>", "(Lfr/d0;)Llivekit/LivekitModels$TrackInfo;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishAdditionalCodecForTrack$1$publishJob$1 extends i implements p {
    final /* synthetic */ TrackPublication $existingPublication;
    final /* synthetic */ VideoTrackPublishOptions $options;
    final /* synthetic */ SimulcastTrackInfo $simulcastTrack;
    final /* synthetic */ jb $trackRequest;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishAdditionalCodecForTrack$1$publishJob$1(LocalParticipant localParticipant, SimulcastTrackInfo simulcastTrackInfo, TrackPublication trackPublication, VideoTrackPublishOptions videoTrackPublishOptions, jb jbVar, c<? super LocalParticipant$publishAdditionalCodecForTrack$1$publishJob$1> cVar) {
        super(2, cVar);
        this.this$0 = localParticipant;
        this.$simulcastTrack = simulcastTrackInfo;
        this.$existingPublication = trackPublication;
        this.$options = videoTrackPublishOptions;
        this.$trackRequest = jbVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LocalParticipant$publishAdditionalCodecForTrack$1$publishJob$1(this.this$0, this.$simulcastTrack, this.$existingPublication, this.$options, this.$trackRequest, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super LivekitModels$TrackInfo> cVar) {
        return ((LocalParticipant$publishAdditionalCodecForTrack$1$publishJob$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a.g(obj);
        RTCEngine engine = this.this$0.getEngine();
        String id2 = this.$simulcastTrack.getRtcTrack().id();
        id2.getClass();
        String name = this.$existingPublication.getName();
        e9 proto = this.$existingPublication.getKind().toProto();
        String stream = this.$options.getStream();
        jb jbVar = this.$trackRequest;
        jbVar.getClass();
        this.label = 1;
        Object addTrack = engine.addTrack(id2, name, proto, stream, jbVar, this);
        xn.a aVar = xn.a.f37986a;
        if (addTrack == aVar) {
            return aVar;
        }
        return addTrack;
    }
}
