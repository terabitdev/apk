package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.k;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$resolveBookmarkCharOffset$2", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfr/d0;", "Lsn/k;", "", "", "<anonymous>", "(Lfr/d0;)Lsn/k;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$resolveBookmarkCharOffset$2 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$resolveBookmarkCharOffset$2(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$resolveBookmarkCharOffset$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$resolveBookmarkCharOffset$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super k> cVar) {
        return ((BackgroundPlayerService$resolveBookmarkCharOffset$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            Integer num = new Integer(this.this$0.getPlayer().getCurrentMediaItemIndex());
            long currentPosition = this.this$0.getPlayer().getCurrentPosition();
            if (currentPosition < 0) {
                currentPosition = 0;
            }
            return new k(num, new Long(currentPosition));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
