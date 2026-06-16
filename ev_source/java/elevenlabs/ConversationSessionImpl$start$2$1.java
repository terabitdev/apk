package io.elevenlabs;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.models.ConversationEvent;
import io.elevenlabs.network.ConversationEventParser;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ConversationSessionImpl$start$2$1", f = "ConversationSessionImpl.kt", l = {111}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ConversationSessionImpl$start$2$1 extends i implements p {
    final /* synthetic */ String $messageJson;
    int label;
    final /* synthetic */ ConversationSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSessionImpl$start$2$1(String str, ConversationSessionImpl conversationSessionImpl, c<? super ConversationSessionImpl$start$2$1> cVar) {
        super(2, cVar);
        this.$messageJson = str;
        this.this$0 = conversationSessionImpl;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ConversationSessionImpl$start$2$1(this.$messageJson, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ConversationSessionImpl$start$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConversationEventHandler conversationEventHandler;
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
            ConversationEvent parseIncomingEvent = ConversationEventParser.INSTANCE.parseIncomingEvent(this.$messageJson);
            if (parseIncomingEvent != null) {
                conversationEventHandler = this.this$0.eventHandler;
                this.label = 1;
                Object handleIncomingEvent = conversationEventHandler.handleIncomingEvent(parseIncomingEvent, this);
                xn.a aVar = xn.a.f37986a;
                if (handleIncomingEvent == aVar) {
                    return aVar;
                }
            }
        }
        return z.f31622a;
    }
}
