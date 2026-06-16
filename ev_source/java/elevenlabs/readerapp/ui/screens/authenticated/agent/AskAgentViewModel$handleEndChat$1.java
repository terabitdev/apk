package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import ir.i1;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$handleEndChat$1", f = "AskAgentViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAgentViewModel$handleEndChat$1 extends yn.i implements p {
    int label;
    final /* synthetic */ AskAgentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAgentViewModel$handleEndChat$1(AskAgentViewModel askAgentViewModel, wn.c<? super AskAgentViewModel$handleEndChat$1> cVar) {
        super(2, cVar);
        this.this$0 = askAgentViewModel;
    }

    public static final AskAgentContract.State invokeSuspend$lambda$0(AskAgentContract.State state) {
        return new AskAgentContract.State(null, null, false, null, false, false, 63, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AskAgentViewModel$handleEndChat$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AskAgentViewModel$handleEndChat$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            this.this$0.endSession();
            this.this$0.queueStateUpdate(new f(1));
            i1 i1Var = this.this$0._controlEvents;
            AskAgentContract.ControlEvent.Close close = AskAgentContract.ControlEvent.Close.INSTANCE;
            this.label = 1;
            Object emit = i1Var.emit(close, this);
            xn.a aVar = xn.a.f37986a;
            if (emit == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
