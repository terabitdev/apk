package io.livekit.android.room.participant;

import as.s6;
import com.google.protobuf.c6;
import ho.p;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.room.track.LocalTrackPublication;
import io.livekit.android.util.FlowDelegateKt;
import ir.j;
import ir.z1;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.v;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant$publishAudioTrack$job$1", f = "LocalParticipant.kt", l = {477}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LocalParticipant$publishAudioTrack$job$1 extends i implements p {
    final /* synthetic */ AudioTrackPublishOptions $options;
    final /* synthetic */ d0 $publication;
    final /* synthetic */ LocalAudioTrack $track;
    int label;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishAudioTrack$job$1(LocalAudioTrack localAudioTrack, LocalParticipant localParticipant, d0 d0Var, AudioTrackPublishOptions audioTrackPublishOptions, c<? super LocalParticipant$publishAudioTrack$job$1> cVar) {
        super(2, cVar);
        this.$track = localAudioTrack;
        this.this$0 = localParticipant;
        this.$publication = d0Var;
        this.$options = audioTrackPublishOptions;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new LocalParticipant$publishAudioTrack$job$1(this.$track, this.this$0, this.$publication, this.$options, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
        return ((LocalParticipant$publishAudioTrack$job$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
        } else {
            a.g(obj);
            z1 flow = FlowDelegateKt.getFlow(new v(this.$track) { // from class: io.livekit.android.room.participant.LocalParticipant$publishAudioTrack$job$1.1
                @Override // oo.r
                public Object get() {
                    return ((LocalAudioTrack) this.receiver).getFeatures();
                }
            });
            final LocalParticipant localParticipant = this.this$0;
            final d0 d0Var = this.$publication;
            final AudioTrackPublishOptions audioTrackPublishOptions = this.$options;
            j jVar = new j() { // from class: io.livekit.android.room.participant.LocalParticipant$publishAudioTrack$job$1.2
                public final Object emit(Set<? extends s6> set, c<? super z> cVar) {
                    LocalParticipant.this.getEngine().updateLocalAudioTrack(((LocalTrackPublication) d0Var.f20559a).getSid(), kd.a.N(set, audioTrackPublishOptions.getFeaturesList$livekit_android_sdk_release()));
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                    return emit((Set<? extends s6>) obj2, (c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = flow.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        c6.u();
        return null;
    }
}
