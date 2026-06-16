package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.domain.services.MessagesService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$markMessageAsRead$1$1", f = "RouterViewModel.kt", l = {488}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterViewModel$markMessageAsRead$1$1 extends yn.i implements ho.p {
    final /* synthetic */ RouterState $this_queueStateUpdate;
    int label;
    final /* synthetic */ RouterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterViewModel$markMessageAsRead$1$1(RouterViewModel routerViewModel, RouterState routerState, wn.c<? super RouterViewModel$markMessageAsRead$1$1> cVar) {
        super(2, cVar);
        this.this$0 = routerViewModel;
        this.$this_queueStateUpdate = routerState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterViewModel$markMessageAsRead$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterViewModel$markMessageAsRead$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
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
            aVar = this.this$0.messagesService;
            MessagesService messagesService = (MessagesService) aVar.get();
            String uid = this.$this_queueStateUpdate.getMessageToDisplay().getUid();
            this.label = 1;
            Object markMessageAsRead = messagesService.markMessageAsRead(uid, this);
            xn.a aVar2 = xn.a.f37986a;
            if (markMessageAsRead == aVar2) {
                return aVar2;
            }
        }
        return sn.z.f31622a;
    }
}
