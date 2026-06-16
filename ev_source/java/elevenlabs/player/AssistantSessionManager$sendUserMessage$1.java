package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.ConversationSession;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import sn.l;
import sn.m;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.AssistantSessionManager$sendUserMessage$1", f = "AssistantSessionManager.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AssistantSessionManager$sendUserMessage$1 extends i implements p {
    final /* synthetic */ ConversationSession $currentSession;
    final /* synthetic */ String $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssistantSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantSessionManager$sendUserMessage$1(ConversationSession conversationSession, String str, AssistantSessionManager assistantSessionManager, wn.c<? super AssistantSessionManager$sendUserMessage$1> cVar) {
        super(2, cVar);
        this.$currentSession = conversationSession;
        this.$text = str;
        this.this$0 = assistantSessionManager;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        AssistantSessionManager$sendUserMessage$1 assistantSessionManager$sendUserMessage$1 = new AssistantSessionManager$sendUserMessage$1(this.$currentSession, this.$text, this.this$0, cVar);
        assistantSessionManager$sendUserMessage$1.L$0 = obj;
        return assistantSessionManager$sendUserMessage$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AssistantSessionManager$sendUserMessage$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object lVar;
        Logger logger;
        Logger logger2;
        z zVar = z.f31622a;
        if (this.label == 0) {
            sn.a.g(obj);
            try {
                this.$currentSession.sendUserMessage(this.$text);
                lVar = zVar;
            } catch (Throwable th) {
                lVar = new l(th);
            }
            AssistantSessionManager assistantSessionManager = this.this$0;
            if (!(lVar instanceof l)) {
                logger2 = assistantSessionManager.logger;
                logger2.log("AssistantSessionManager", "SDK sendUserMessage returned ok");
            }
            AssistantSessionManager assistantSessionManager2 = this.this$0;
            Throwable a10 = m.a(lVar);
            if (a10 != null) {
                logger = assistantSessionManager2.logger;
                logger.logWarning("AssistantSessionManager", "SDK sendUserMessage failed: " + a10, a10);
            }
            return zVar;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
