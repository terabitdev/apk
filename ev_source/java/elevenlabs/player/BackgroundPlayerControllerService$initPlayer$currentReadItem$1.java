package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ja.z;
import kotlin.Metadata;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$initPlayer$currentReadItem$1", f = "BackgroundPlayerControllerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lw7/r0;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lfr/d0;)Lw7/r0;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$initPlayer$currentReadItem$1 extends i implements p {
    final /* synthetic */ z $controller;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$initPlayer$currentReadItem$1(z zVar, wn.c<? super BackgroundPlayerControllerService$initPlayer$currentReadItem$1> cVar) {
        super(2, cVar);
        this.$controller = zVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$initPlayer$currentReadItem$1(this.$controller, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super r0> cVar) {
        return ((BackgroundPlayerControllerService$initPlayer$currentReadItem$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            return this.$controller.getCurrentMediaItem();
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
