package io.livekit.android.room.participant;

import as.jb;
import com.google.protobuf.c6;
import fr.d2;
import fr.g0;
import fr.j0;
import ho.p;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.track.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import livekit.LivekitModels$TrackInfo;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$publishTrackImpl$4", f = "LocalParticipant.kt", l = {746, 747}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Llivekit/LivekitModels$TrackInfo;", "<anonymous>", "(Lfr/d0;)Llivekit/LivekitModels$TrackInfo;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishTrackImpl$4 extends i implements p {
    final /* synthetic */ jb $addTrackRequestBuilder;
    final /* synthetic */ String $cid;
    final /* synthetic */ d0 $encodings;
    final /* synthetic */ d0 $options;
    final /* synthetic */ LocalParticipant.PublishListener $publishListener;
    final /* synthetic */ Track $track;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishTrackImpl$4(LocalParticipant localParticipant, d0 d0Var, Track track, d0 d0Var2, String str, LocalParticipant.PublishListener publishListener, jb jbVar, c<? super LocalParticipant$publishTrackImpl$4> cVar) {
        super(2, cVar);
        this.this$0 = localParticipant;
        this.$encodings = d0Var;
        this.$track = track;
        this.$options = d0Var2;
        this.$cid = str;
        this.$publishListener = publishListener;
        this.$addTrackRequestBuilder = jbVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        LocalParticipant$publishTrackImpl$4 localParticipant$publishTrackImpl$4 = new LocalParticipant$publishTrackImpl$4(this.this$0, this.$encodings, this.$track, this.$options, this.$cid, this.$publishListener, this.$addTrackRequestBuilder, cVar);
        localParticipant$publishTrackImpl$4.L$0 = obj;
        return localParticipant$publishTrackImpl$4;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super LivekitModels$TrackInfo> cVar) {
        return ((LocalParticipant$publishTrackImpl$4) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (r5.join(r14) == r4) goto L16;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j0 g10;
        int i10 = this.label;
        a aVar = a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return obj;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g10 = (j0) this.L$0;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            fr.d0 d0Var = (fr.d0) this.L$0;
            d2 D = g0.D(d0Var, null, null, new LocalParticipant$publishTrackImpl$4$negotiateJob$1(this.this$0, this.$encodings, this.$track, this.$options, this.$cid, this.$publishListener, null), 3);
            g10 = g0.g(d0Var, null, new LocalParticipant$publishTrackImpl$4$publishJob$1(this.this$0, this.$cid, this.$options, this.$track, this.$addTrackRequestBuilder, this.$publishListener, null), 3);
            this.L$0 = g10;
            this.label = 1;
        }
        this.L$0 = null;
        this.label = 2;
        Object await = g10.await(this);
        if (await == aVar) {
            return aVar;
        }
        return await;
    }
}
