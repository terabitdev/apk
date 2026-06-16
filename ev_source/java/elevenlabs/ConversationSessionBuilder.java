package io.elevenlabs;

import android.content.Context;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ho.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJE\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2.\u0010\u0012\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/ConversationSessionBuilder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/elevenlabs/ConversationConfig;", "config", "(Lio/elevenlabs/ConversationConfig;)Lio/elevenlabs/ConversationSessionBuilder;", "", DiagnosticsEntry.NAME_KEY, "Lio/elevenlabs/ClientTool;", "tool", "addTool", "(Ljava/lang/String;Lio/elevenlabs/ClientTool;)Lio/elevenlabs/ConversationSessionBuilder;", "Lkotlin/Function2;", "", "Lwn/c;", "function", "(Ljava/lang/String;Lho/p;)Lio/elevenlabs/ConversationSessionBuilder;", "Lio/elevenlabs/ConversationSession;", "build", "(Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/ConversationConfig;", "", "customTools", "Ljava/util/Map;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationSessionBuilder {
    private ConversationConfig config;
    private final Context context;
    private final Map<String, ClientTool> customTools;

    public ConversationSessionBuilder(Context context) {
        context.getClass();
        this.context = context;
        this.customTools = new LinkedHashMap();
    }

    public final ConversationSessionBuilder addTool(String name, p function) {
        name.getClass();
        function.getClass();
        this.customTools.put(name, new ConversationSessionBuilder$addTool$1(function));
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:11:0x0055->B:13:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object build(c<? super ConversationSession> cVar) {
        ConversationSessionBuilder$build$1 conversationSessionBuilder$build$1;
        int i10;
        ConversationSessionBuilder conversationSessionBuilder;
        if (cVar instanceof ConversationSessionBuilder$build$1) {
            conversationSessionBuilder$build$1 = (ConversationSessionBuilder$build$1) cVar;
            int i11 = conversationSessionBuilder$build$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                conversationSessionBuilder$build$1.label = i11 - Integer.MIN_VALUE;
                Object obj = conversationSessionBuilder$build$1.result;
                i10 = conversationSessionBuilder$build$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        conversationSessionBuilder = (ConversationSessionBuilder) conversationSessionBuilder$build$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ConversationConfig conversationConfig = this.config;
                    if (conversationConfig != null) {
                        ConversationClientImpl conversationClientImpl = ConversationClientImpl.INSTANCE;
                        Context context = this.context;
                        conversationSessionBuilder$build$1.L$0 = this;
                        conversationSessionBuilder$build$1.label = 1;
                        obj = conversationClientImpl.startSession(conversationConfig, context, conversationSessionBuilder$build$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                        conversationSessionBuilder = this;
                    } else {
                        c6.x("Configuration is required");
                        return null;
                    }
                }
                ConversationSession conversationSession = (ConversationSession) obj;
                for (Map.Entry<String, ClientTool> entry : conversationSessionBuilder.customTools.entrySet()) {
                    conversationSession.registerTool(entry.getKey(), entry.getValue());
                }
                return conversationSession;
            }
        }
        conversationSessionBuilder$build$1 = new ConversationSessionBuilder$build$1(this, cVar);
        Object obj2 = conversationSessionBuilder$build$1.result;
        i10 = conversationSessionBuilder$build$1.label;
        if (i10 == 0) {
        }
        ConversationSession conversationSession2 = (ConversationSession) obj2;
        while (r0.hasNext()) {
        }
        return conversationSession2;
    }

    public final ConversationSessionBuilder config(ConversationConfig config) {
        config.getClass();
        this.config = config;
        return this;
    }

    public final ConversationSessionBuilder addTool(String name, ClientTool tool) {
        name.getClass();
        tool.getClass();
        this.customTools.put(name, tool);
        return this;
    }
}
