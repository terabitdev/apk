package io.elevenlabs;

import android.content.Context;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/ConversationClient;", "", "Lio/elevenlabs/ConversationConfig;", "config", "Lio/elevenlabs/ConversationSession;", "startSession", "(Lio/elevenlabs/ConversationConfig;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "endSession", "()V", "", "message", "sendMessage", "(Ljava/lang/String;)V", "", "isPositive", "sendFeedback", "(Z)V", "Companion", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ConversationClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/ConversationClient$Companion;", "", "<init>", "()V", "Lio/elevenlabs/ConversationConfig;", "config", "Landroid/content/Context;", "context", "Lio/elevenlabs/ConversationSession;", "startSession", "(Lio/elevenlabs/ConversationConfig;Landroid/content/Context;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/ConversationSessionBuilder;", "builder", "(Landroid/content/Context;)Lio/elevenlabs/ConversationSessionBuilder;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ConversationSessionBuilder builder(Context context) {
            context.getClass();
            return ConversationClientImpl.INSTANCE.builder(context);
        }

        public final Object startSession(ConversationConfig conversationConfig, Context context, c<? super ConversationSession> cVar) {
            return ConversationClientImpl.INSTANCE.startSession(conversationConfig, context, cVar);
        }
    }

    void endSession();

    void sendFeedback(boolean isPositive);

    void sendMessage(String message);

    Object startSession(ConversationConfig conversationConfig, c<? super ConversationSession> cVar);
}
