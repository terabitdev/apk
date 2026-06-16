package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Message;
import io.elevenlabs.domain.services.MessagesService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$onRouteChanged$1$1", f = "RouterViewModel.kt", l = {473}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterViewModel$onRouteChanged$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ RouterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterViewModel$onRouteChanged$1$1(RouterViewModel routerViewModel, wn.c<? super RouterViewModel$onRouteChanged$1$1> cVar) {
        super(2, cVar);
        this.this$0 = routerViewModel;
    }

    public static final RouterState invokeSuspend$lambda$0(AsyncCallResult asyncCallResult, RouterState routerState) {
        return RouterState.copy$default(routerState, null, null, null, null, null, false, false, null, false, false, false, false, false, null, null, null, null, (Message) ((AsyncCallResult.Success) asyncCallResult).getData(), 131071, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterViewModel$onRouteChanged$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterViewModel$onRouteChanged$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            this.label = 1;
            obj = messagesService.getMessage(this);
            xn.a aVar2 = xn.a.f37986a;
            if (obj == aVar2) {
                return aVar2;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
            if (asyncCallResult instanceof AsyncCallResult.Success) {
                this.this$0.queueStateUpdate(new g0((AsyncCallResult.Success) asyncCallResult, 0));
            } else {
                c6.p();
                return null;
            }
        }
        return sn.z.f31622a;
    }
}
