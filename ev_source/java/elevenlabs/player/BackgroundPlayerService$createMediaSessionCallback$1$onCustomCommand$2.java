package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$2", f = "BackgroundPlayerService.kt", l = {1833}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$2 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$2(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object handlePreviousChapter;
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
            BackgroundPlayerService backgroundPlayerService = this.this$0;
            this.label = 1;
            handlePreviousChapter = backgroundPlayerService.handlePreviousChapter(this);
            xn.a aVar = xn.a.f37986a;
            if (handlePreviousChapter == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
