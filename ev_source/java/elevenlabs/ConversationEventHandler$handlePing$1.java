package io.elevenlabs;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.models.ConversationEvent;
import io.elevenlabs.network.OutgoingEvent;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ConversationEventHandler$handlePing$1", f = "ConversationEventHandler.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ConversationEventHandler$handlePing$1 extends i implements p {
    final /* synthetic */ ConversationEvent.Ping $event;
    int label;
    final /* synthetic */ ConversationEventHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationEventHandler$handlePing$1(ConversationEvent.Ping ping, ConversationEventHandler conversationEventHandler, c<? super ConversationEventHandler$handlePing$1> cVar) {
        super(2, cVar);
        this.$event = ping;
        this.this$0 = conversationEventHandler;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ConversationEventHandler$handlePing$1(this.$event, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ConversationEventHandler$handlePing$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        if (this.label == 0) {
            sn.a.g(obj);
            try {
                OutgoingEvent.Pong pong = new OutgoingEvent.Pong(this.$event.getEventId());
                lVar = this.this$0.messageCallback;
                lVar.invoke(pong);
            } catch (Exception e10) {
                android.gov.nist.javax.sip.header.a.s("Failed to send pong: ", e10.getMessage(), "ConvEventHandler");
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
