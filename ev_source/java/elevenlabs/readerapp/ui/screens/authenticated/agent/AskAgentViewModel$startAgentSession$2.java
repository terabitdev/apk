package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.SupportAgentConfig;
import io.elevenlabs.domain.services.AgentContextService;
import io.elevenlabs.domain.services.SupportAgentService;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.domain.services.player.AssistantSessionSource;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantStatus;
import java.util.Map;
import kotlin.Metadata;
import sn.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel$startAgentSession$2", f = "AskAgentViewModel.kt", l = {147, 168, 169}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AskAgentViewModel$startAgentSession$2 extends yn.i implements p {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AskAgentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskAgentViewModel$startAgentSession$2(AskAgentViewModel askAgentViewModel, wn.c<? super AskAgentViewModel$startAgentSession$2> cVar) {
        super(2, cVar);
        this.this$0 = askAgentViewModel;
    }

    public static final AskAgentContract.State invokeSuspend$lambda$0(String str, AskAgentContract.State state) {
        return AskAgentContract.State.copy$default(state, AssistantStatus.DISCONNECTED, null, false, str, false, false, 54, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AskAgentViewModel$startAgentSession$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AskAgentViewModel$startAgentSession$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r14 == r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r14 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r14 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0045, code lost:
    
        if (r14 == r6) goto L71;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SupportAgentService supportAgentService;
        String message;
        SupportAgentConfig supportAgentConfig;
        AgentContextService agentContextService;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        ((m) obj).getClass();
                        return zVar;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                supportAgentConfig = (SupportAgentConfig) this.L$0;
                sn.a.g(obj);
                Map map = (Map) obj;
                AssistantSessionService assistantSessionService = this.this$0.assistantSessionService;
                AssistantSessionSource.SupportAgent supportAgent = new AssistantSessionSource.SupportAgent(supportAgentConfig.getSignedUrl(), supportAgentConfig.getConversationToken(), supportAgentConfig.getWebsocketUrl(), map, true);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (assistantSessionService.mo953startSessiongIAlus(supportAgent, this) == aVar) {
                    return aVar;
                }
                return zVar;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            supportAgentService = this.this$0.supportAgentService;
            this.label = 1;
            obj = supportAgentService.initializeSupportAgent(this);
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            supportAgentConfig = (SupportAgentConfig) ((AsyncCallResult.Success) asyncCallResult).getData();
            agentContextService = this.this$0.agentContextService;
            this.L$0 = supportAgentConfig;
            this.label = 2;
            obj = AgentContextService.buildDynamicVariables$default(agentContextService, null, this, 1, null);
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            AsyncCallResult.AsyncCallError error = ((AsyncCallResult.Error) asyncCallResult).getError();
            String str = "Failed to load support agent configuration";
            if (error instanceof AsyncCallResult.AsyncCallError.ApiError) {
                message = ((AsyncCallResult.AsyncCallError.ApiError) error).getMessage();
            } else {
                if (error instanceof AsyncCallResult.AsyncCallError.NetworkError) {
                    str = "Network error. Please check your connection.";
                } else if (error instanceof AsyncCallResult.AsyncCallError.UnknownError) {
                    message = ((AsyncCallResult.AsyncCallError.UnknownError) error).getMessage();
                } else {
                    c6.p();
                    return null;
                }
                this.this$0.queueStateUpdate(new h(str, 0));
                return zVar;
            }
        } else {
            c6.p();
            return null;
        }
    }
}
