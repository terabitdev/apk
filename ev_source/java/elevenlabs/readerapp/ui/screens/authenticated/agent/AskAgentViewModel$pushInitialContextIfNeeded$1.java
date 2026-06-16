package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.AgentContextService;
import kotlin.Metadata;
import sn.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$pushInitialContextIfNeeded$1", f = "AskAgentViewModel.kt", l = {196}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAgentViewModel$pushInitialContextIfNeeded$1 extends yn.i implements p {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AskAgentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAgentViewModel$pushInitialContextIfNeeded$1(AskAgentViewModel askAgentViewModel, wn.c<? super AskAgentViewModel$pushInitialContextIfNeeded$1> cVar) {
        super(2, cVar);
        this.this$0 = askAgentViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        AskAgentViewModel$pushInitialContextIfNeeded$1 askAgentViewModel$pushInitialContextIfNeeded$1 = new AskAgentViewModel$pushInitialContextIfNeeded$1(this.this$0, cVar);
        askAgentViewModel$pushInitialContextIfNeeded$1.L$0 = obj;
        return askAgentViewModel$pushInitialContextIfNeeded$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AskAgentViewModel$pushInitialContextIfNeeded$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object lVar;
        AgentContextService agentContextService;
        int i10 = this.label;
        Object obj2 = null;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                agentContextService = this.this$0.agentContextService;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = agentContextService.buildUltraReadsContext(this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            lVar = (String) obj;
        } catch (Throwable th) {
            lVar = new l(th);
        }
        if (!(lVar instanceof l)) {
            obj2 = lVar;
        }
        String str = (String) obj2;
        z zVar = z.f31622a;
        if (str == null) {
            return zVar;
        }
        this.this$0.assistantSessionService.mo951sendContextualUpdateIoAF18A(str);
        return zVar;
    }
}
