package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.ConversationSession;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.AssistantSessionManager$sendUserActivity$1", f = "AssistantSessionManager.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AssistantSessionManager$sendUserActivity$1 extends i implements p {
    final /* synthetic */ ConversationSession $currentSession;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantSessionManager$sendUserActivity$1(ConversationSession conversationSession, wn.c<? super AssistantSessionManager$sendUserActivity$1> cVar) {
        super(2, cVar);
        this.$currentSession = conversationSession;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        AssistantSessionManager$sendUserActivity$1 assistantSessionManager$sendUserActivity$1 = new AssistantSessionManager$sendUserActivity$1(this.$currentSession, cVar);
        assistantSessionManager$sendUserActivity$1.L$0 = obj;
        return assistantSessionManager$sendUserActivity$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AssistantSessionManager$sendUserActivity$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            try {
                this.$currentSession.sendUserActivity();
            } catch (Throwable unused) {
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
