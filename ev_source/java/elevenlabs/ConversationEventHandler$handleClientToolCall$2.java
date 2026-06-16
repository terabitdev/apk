package io.elevenlabs;

import android.util.Log;
import com.google.protobuf.c6;
import defpackage.f;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.models.ConversationEvent;
import io.elevenlabs.network.OutgoingEvent;
import java.util.Map;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ConversationEventHandler$handleClientToolCall$2", f = "ConversationEventHandler.kt", l = {257}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ConversationEventHandler$handleClientToolCall$2 extends i implements p {
    final /* synthetic */ ConversationEvent.ClientToolCall $event;
    int label;
    final /* synthetic */ ConversationEventHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationEventHandler$handleClientToolCall$2(ConversationEventHandler conversationEventHandler, ConversationEvent.ClientToolCall clientToolCall, c<? super ConversationEventHandler$handleClientToolCall$2> cVar) {
        super(2, cVar);
        this.this$0 = conversationEventHandler;
        this.$event = clientToolCall;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new ConversationEventHandler$handleClientToolCall$2(this.this$0, this.$event, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((ConversationEventHandler$handleClientToolCall$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0129  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ClientToolRegistry clientToolRegistry;
        l lVar;
        l lVar2;
        l lVar3;
        ConversationEventHandler$handleClientToolCall$2 conversationEventHandler$handleClientToolCall$2;
        ClientToolRegistry clientToolRegistry2;
        String toolName;
        Map<String, Object> parameters;
        Exception exc;
        ClientToolResult failure;
        String str;
        String error;
        l lVar4;
        int i10 = this.label;
        z zVar = z.f31622a;
        if (i10 != 0) {
            if (i10 == 1) {
                try {
                    sn.a.g(obj);
                    conversationEventHandler$handleClientToolCall$2 = this;
                } catch (Exception e10) {
                    exc = e10;
                    conversationEventHandler$handleClientToolCall$2 = this;
                    failure = ClientToolResult.INSTANCE.failure("Tool execution failed: " + exc.getMessage());
                    if (conversationEventHandler$handleClientToolCall$2.$event.getExpectsResponse()) {
                    }
                    String toolName2 = conversationEventHandler$handleClientToolCall$2.$event.getToolName();
                    if (failure != null) {
                    }
                    Log.d("ConvEventHandler", "Tool executed: " + toolName2 + " -> " + str);
                    return zVar;
                }
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            clientToolRegistry = this.this$0.toolRegistry;
            boolean isToolRegistered = clientToolRegistry.isToolRegistered(this.$event.getToolName());
            ConversationEventHandler conversationEventHandler = this.this$0;
            if (!isToolRegistered) {
                try {
                    lVar3 = conversationEventHandler.onUnhandledClientToolCall;
                    if (lVar3 != null) {
                        lVar3.invoke(this.$event);
                    }
                } catch (Throwable unused) {
                }
                lVar = this.this$0.onUnhandledClientToolCall;
                if (lVar == null && this.$event.getExpectsResponse()) {
                    OutgoingEvent.ClientToolResult clientToolResult = new OutgoingEvent.ClientToolResult(this.$event.getToolCallId(), f.C("Tool '", this.$event.getToolName(), "' not registered and no handler provided"), true);
                    lVar2 = this.this$0.messageCallback;
                    lVar2.invoke(clientToolResult);
                    Log.d("ConvEventHandler", "Tool '" + this.$event.getToolName() + "' not registered - sent automatic failure response");
                } else {
                    Log.d("ConvEventHandler", "Tool '" + this.$event.getToolName() + "' not registered - waiting for manual response via sendToolResult()");
                }
                return zVar;
            }
            try {
                clientToolRegistry2 = conversationEventHandler.toolRegistry;
                toolName = this.$event.getToolName();
                parameters = this.$event.getParameters();
                this.label = 1;
                conversationEventHandler$handleClientToolCall$2 = this;
            } catch (Exception e11) {
                e = e11;
                conversationEventHandler$handleClientToolCall$2 = this;
                exc = e;
                failure = ClientToolResult.INSTANCE.failure("Tool execution failed: " + exc.getMessage());
                if (conversationEventHandler$handleClientToolCall$2.$event.getExpectsResponse()) {
                    if (!failure.getSuccess()) {
                    }
                    OutgoingEvent.ClientToolResult clientToolResult2 = new OutgoingEvent.ClientToolResult(conversationEventHandler$handleClientToolCall$2.$event.getToolCallId(), error, true ^ failure.getSuccess());
                    lVar4 = conversationEventHandler$handleClientToolCall$2.this$0.messageCallback;
                    lVar4.invoke(clientToolResult2);
                }
                String toolName22 = conversationEventHandler$handleClientToolCall$2.$event.getToolName();
                if (failure != null) {
                }
                Log.d("ConvEventHandler", "Tool executed: " + toolName22 + " -> " + str);
                return zVar;
            }
            try {
                obj = ClientToolRegistry.executeTool$default(clientToolRegistry2, toolName, parameters, 0L, conversationEventHandler$handleClientToolCall$2, 4, null);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Exception e12) {
                e = e12;
                exc = e;
                failure = ClientToolResult.INSTANCE.failure("Tool execution failed: " + exc.getMessage());
                if (conversationEventHandler$handleClientToolCall$2.$event.getExpectsResponse()) {
                }
                String toolName222 = conversationEventHandler$handleClientToolCall$2.$event.getToolName();
                if (failure != null) {
                }
                Log.d("ConvEventHandler", "Tool executed: " + toolName222 + " -> " + str);
                return zVar;
            }
        }
        failure = (ClientToolResult) obj;
        if (conversationEventHandler$handleClientToolCall$2.$event.getExpectsResponse() && failure != null) {
            if (!failure.getSuccess()) {
                error = failure.getResult();
            } else {
                error = failure.getError();
                if (error == null) {
                    error = "Tool execution failed";
                }
            }
            OutgoingEvent.ClientToolResult clientToolResult22 = new OutgoingEvent.ClientToolResult(conversationEventHandler$handleClientToolCall$2.$event.getToolCallId(), error, true ^ failure.getSuccess());
            lVar4 = conversationEventHandler$handleClientToolCall$2.this$0.messageCallback;
            lVar4.invoke(clientToolResult22);
        }
        String toolName2222 = conversationEventHandler$handleClientToolCall$2.$event.getToolName();
        if (failure != null) {
            str = "NO_RESPONSE";
        } else if (failure.getSuccess()) {
            str = "SUCCESS";
        } else {
            str = "FAILED";
        }
        Log.d("ConvEventHandler", "Tool executed: " + toolName2222 + " -> " + str);
        return zVar;
    }
}
