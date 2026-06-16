package io.elevenlabs.player;

import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$ttsPositionTrackingFlow$5", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "offset", "Lsn/z;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$ttsPositionTrackingFlow$5 extends i implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$ttsPositionTrackingFlow$5(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$ttsPositionTrackingFlow$5> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$ttsPositionTrackingFlow$5 backgroundPlayerService$ttsPositionTrackingFlow$5 = new BackgroundPlayerService$ttsPositionTrackingFlow$5(this.this$0, cVar);
        backgroundPlayerService$ttsPositionTrackingFlow$5.L$0 = obj;
        return backgroundPlayerService$ttsPositionTrackingFlow$5;
    }

    @Override // ho.p
    public final Object invoke(Long l4, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$ttsPositionTrackingFlow$5) create(l4, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        TtsAwareForwardingPlayer ttsAwareForwardingPlayer;
        Long l4 = (Long) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            if (l4 != null) {
                ttsAwareForwardingPlayer = this.this$0.ttsAwarePlayer;
                if (ttsAwareForwardingPlayer != null) {
                    ttsAwareForwardingPlayer.setCurrentCharOffset(l4.longValue());
                    this.this$0.getCharacterReportingService().updateCurrentPosition(l4.longValue());
                } else {
                    m.i("ttsAwarePlayer");
                    throw null;
                }
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
