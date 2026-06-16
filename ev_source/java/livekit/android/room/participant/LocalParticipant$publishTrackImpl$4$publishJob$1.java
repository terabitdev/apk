package io.livekit.android.room.participant;

import as.jb;
import com.google.protobuf.c6;
import ho.p;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.track.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import livekit.LivekitModels$TrackInfo;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$publishTrackImpl$4$publishJob$1", f = "LocalParticipant.kt", l = {744}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Llivekit/LivekitModels$TrackInfo;", "<anonymous>", "(Lfr/d0;)Llivekit/LivekitModels$TrackInfo;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishTrackImpl$4$publishJob$1 extends i implements p {
    final /* synthetic */ jb $addTrackRequestBuilder;
    final /* synthetic */ String $cid;
    final /* synthetic */ d0 $options;
    final /* synthetic */ LocalParticipant.PublishListener $publishListener;
    final /* synthetic */ Track $track;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishTrackImpl$4$publishJob$1(LocalParticipant localParticipant, String str, d0 d0Var, Track track, jb jbVar, LocalParticipant.PublishListener publishListener, c<? super LocalParticipant$publishTrackImpl$4$publishJob$1> cVar) {
        super(2, cVar);
        this.this$0 = localParticipant;
        this.$cid = str;
        this.$options = d0Var;
        this.$track = track;
        this.$addTrackRequestBuilder = jbVar;
        this.$publishListener = publishListener;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LocalParticipant$publishTrackImpl$4$publishJob$1(this.this$0, this.$cid, this.$options, this.$track, this.$addTrackRequestBuilder, this.$publishListener, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super LivekitModels$TrackInfo> cVar) {
        return ((LocalParticipant$publishTrackImpl$4$publishJob$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object publishTrackImpl$requestAddTrack;
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
        LocalParticipant localParticipant = this.this$0;
        String str = this.$cid;
        d0 d0Var = this.$options;
        Track track = this.$track;
        jb jbVar = this.$addTrackRequestBuilder;
        LocalParticipant.PublishListener publishListener = this.$publishListener;
        this.label = 1;
        publishTrackImpl$requestAddTrack = LocalParticipant.publishTrackImpl$requestAddTrack(localParticipant, str, d0Var, track, jbVar, publishListener, this);
        xn.a aVar = xn.a.f37986a;
        if (publishTrackImpl$requestAddTrack == aVar) {
            return aVar;
        }
        return publishTrackImpl$requestAddTrack;
    }
}
