package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import sn.z;
import w7.o1;
import w7.r1;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Z"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1 extends i implements p {
    final /* synthetic */ ReadMeta $readMeta;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1(ReadMeta readMeta, BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1> cVar) {
        super(2, cVar);
        this.$readMeta = readMeta;
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1(this.$readMeta, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super Boolean> cVar) {
        return ((BackgroundPlayerService$handlePlaybackEnded$isLastWindow$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            boolean z6 = true;
            if (this.$readMeta.getChapters().size() > 1) {
                r1 currentTimeline = this.this$0.getPlayer().getCurrentTimeline();
                currentTimeline.getClass();
                if (!currentTimeline.p() && currentTimeline.f(this.this$0.getPlayer().getCurrentPeriodIndex(), new o1(), false).f36506c < this.$readMeta.getChapters().size() - 1) {
                    z6 = false;
                }
            }
            return Boolean.valueOf(z6);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
