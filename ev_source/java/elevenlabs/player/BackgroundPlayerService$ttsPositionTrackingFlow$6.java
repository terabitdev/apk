package io.elevenlabs.player;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;
import sn.z;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$ttsPositionTrackingFlow$6", f = "BackgroundPlayerService.kt", l = {611}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$ttsPositionTrackingFlow$6 extends i implements p {
    final /* synthetic */ r0 $item;
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$ttsPositionTrackingFlow$6(BackgroundPlayerService backgroundPlayerService, r0 r0Var, wn.c<? super BackgroundPlayerService$ttsPositionTrackingFlow$6> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$item = r0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        BackgroundPlayerService$ttsPositionTrackingFlow$6 backgroundPlayerService$ttsPositionTrackingFlow$6 = new BackgroundPlayerService$ttsPositionTrackingFlow$6(this.this$0, this.$item, cVar);
        backgroundPlayerService$ttsPositionTrackingFlow$6.J$0 = ((Number) obj).longValue();
        return backgroundPlayerService$ttsPositionTrackingFlow$6;
    }

    public final Object invoke(long j4, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$ttsPositionTrackingFlow$6) create(Long.valueOf(j4), cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        long j4 = this.J$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            ReadsService readsService = this.this$0.getReadsService();
            String str = this.$item.f36578a;
            str.getClass();
            this.J$0 = j4;
            this.label = 1;
            Object updateLastCharacterOffset = readsService.updateLastCharacterOffset(str, j4, this);
            xn.a aVar = xn.a.f37986a;
            if (updateLastCharacterOffset == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (wn.c<? super z>) obj2);
    }
}
