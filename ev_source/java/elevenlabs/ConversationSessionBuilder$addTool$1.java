package io.elevenlabs;

import com.google.protobuf.c6;
import ho.p;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"io/elevenlabs/ConversationSessionBuilder$addTool$1", "Lio/elevenlabs/ClientTool;", "", "", "", "parameters", "Lio/elevenlabs/ClientToolResult;", "execute", "(Ljava/util/Map;Lwn/c;)Ljava/lang/Object;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationSessionBuilder$addTool$1 implements ClientTool {
    final /* synthetic */ p $function;

    public ConversationSessionBuilder$addTool$1(p pVar) {
        this.$function = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.ClientTool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(Map<String, ? extends Object> map, c<? super ClientToolResult> cVar) {
        ConversationSessionBuilder$addTool$1$execute$1 conversationSessionBuilder$addTool$1$execute$1;
        int i10;
        try {
            if (cVar instanceof ConversationSessionBuilder$addTool$1$execute$1) {
                conversationSessionBuilder$addTool$1$execute$1 = (ConversationSessionBuilder$addTool$1$execute$1) cVar;
                int i11 = conversationSessionBuilder$addTool$1$execute$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    conversationSessionBuilder$addTool$1$execute$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = conversationSessionBuilder$addTool$1$execute$1.result;
                    i10 = conversationSessionBuilder$addTool$1$execute$1.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        p pVar = this.$function;
                        conversationSessionBuilder$addTool$1$execute$1.label = 1;
                        obj = pVar.invoke(map, conversationSessionBuilder$addTool$1$execute$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return ClientToolResult.INSTANCE.success((String) obj);
                }
            }
            if (i10 == 0) {
            }
            return ClientToolResult.INSTANCE.success((String) obj);
        } catch (Exception e10) {
            return ClientToolResult.INSTANCE.failure("Function execution failed: " + e10.getMessage());
        }
        conversationSessionBuilder$addTool$1$execute$1 = new ConversationSessionBuilder$addTool$1$execute$1(this, cVar);
        Object obj2 = conversationSessionBuilder$addTool$1$execute$1.result;
        i10 = conversationSessionBuilder$addTool$1$execute$1.label;
    }
}
