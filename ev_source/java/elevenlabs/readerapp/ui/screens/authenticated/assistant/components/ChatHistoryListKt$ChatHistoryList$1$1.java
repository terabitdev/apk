package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import java.util.List;
import ka.j0;
import kotlin.Metadata;
import t1.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt$ChatHistoryList$1$1", f = "ChatHistoryList.kt", l = {31}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ChatHistoryListKt$ChatHistoryList$1$1 extends i implements p {
    final /* synthetic */ z $listState;
    final /* synthetic */ List<ChatMessage> $messages;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHistoryListKt$ChatHistoryList$1$1(List<ChatMessage> list, z zVar, wn.c<? super ChatHistoryListKt$ChatHistoryList$1$1> cVar) {
        super(2, cVar);
        this.$messages = list;
        this.$listState = zVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ChatHistoryListKt$ChatHistoryList$1$1(this.$messages, this.$listState, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ChatHistoryListKt$ChatHistoryList$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            if (!this.$messages.isEmpty()) {
                z zVar = this.$listState;
                this.label = 1;
                j0 j0Var = z.f31871x;
                Object f10 = zVar.f(0, 0, this);
                xn.a aVar = xn.a.f37986a;
                if (f10 == aVar) {
                    return aVar;
                }
            }
        }
        return sn.z.f31622a;
    }
}
