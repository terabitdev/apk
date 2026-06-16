package io.elevenlabs;

import com.google.protobuf.c6;
import ho.l;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ConversationSessionImpl$eventHandler$13", f = "ConversationSessionImpl.kt", l = {77}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ConversationSessionImpl$eventHandler$13 extends i implements l {
    int label;
    final /* synthetic */ ConversationSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSessionImpl$eventHandler$13(ConversationSessionImpl conversationSessionImpl, c<? super ConversationSessionImpl$eventHandler$13> cVar) {
        super(1, cVar);
        this.this$0 = conversationSessionImpl;
    }

    @Override // yn.a
    public final c<z> create(c<?> cVar) {
        return new ConversationSessionImpl$eventHandler$13(this.this$0, cVar);
    }

    @Override // ho.l
    public final Object invoke(c<? super z> cVar) {
        return ((ConversationSessionImpl$eventHandler$13) create(cVar)).invokeSuspend(z.f31622a);
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
            ConversationSessionImpl conversationSessionImpl = this.this$0;
            this.label = 1;
            Object endSession = conversationSessionImpl.endSession(this);
            xn.a aVar = xn.a.f37986a;
            if (endSession == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
