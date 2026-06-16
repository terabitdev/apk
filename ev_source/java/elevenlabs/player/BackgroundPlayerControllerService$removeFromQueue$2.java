package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ja.z;
import kotlin.Metadata;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$removeFromQueue$2", f = "BackgroundPlayerControllerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$removeFromQueue$2 extends i implements p {
    final /* synthetic */ z $controller;
    final /* synthetic */ String $readId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$removeFromQueue$2(z zVar, String str, wn.c<? super BackgroundPlayerControllerService$removeFromQueue$2> cVar) {
        super(2, cVar);
        this.$controller = zVar;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$removeFromQueue$2(this.$controller, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BackgroundPlayerControllerService$removeFromQueue$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            Integer access$indexOfMediaId = BackgroundPlayerControllerServiceKt.access$indexOfMediaId(this.$controller, this.$readId);
            if (access$indexOfMediaId != null) {
                this.$controller.removeMediaItem(access$indexOfMediaId.intValue());
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
