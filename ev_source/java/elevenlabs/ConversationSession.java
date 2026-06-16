package io.elevenlabs;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ir.z1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\tJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0004J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001dH&¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0006H&¢\u0006\u0004\b(\u0010\tR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\n0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010,R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Lio/elevenlabs/ConversationSession;", "", "Lsn/z;", "start", "(Lwn/c;)Ljava/lang/Object;", "endSession", "", "message", "sendUserMessage", "(Ljava/lang/String;)V", "", "isPositive", "sendFeedback", "(Z)V", "update", "sendContextualUpdate", "getId", "()Ljava/lang/String;", "sendUserActivity", "()V", "toolCallId", "result", "isError", "sendToolResult", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toggleMute", "muted", "setMicMuted", "(ZLwn/c;)Ljava/lang/Object;", "", "volume", "setVolume", "(F)V", "getVolume", "()F", DiagnosticsEntry.NAME_KEY, "Lio/elevenlabs/ClientTool;", "tool", "registerTool", "(Ljava/lang/String;Lio/elevenlabs/ClientTool;)V", "unregisterTool", "Lir/z1;", "Lio/elevenlabs/models/ConversationStatus;", "getStatus", "()Lir/z1;", "status", "Lio/elevenlabs/models/ConversationMode;", "getMode", "mode", "isMuted", "getAudioLevel", "audioLevel", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ConversationSession {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void sendToolResult$default(ConversationSession conversationSession, String str, String str2, boolean z6, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    z6 = false;
                }
                conversationSession.sendToolResult(str, str2, z6);
                return;
            }
            a9.a.y("Super calls with default arguments not supported in this target, function: sendToolResult");
        }
    }

    Object endSession(c<? super z> cVar);

    z1 getAudioLevel();

    /* renamed from: getId */
    String getConversationId();

    z1 getMode();

    z1 getStatus();

    float getVolume();

    /* renamed from: isMuted */
    z1 getIsMuted();

    void registerTool(String name, ClientTool tool);

    void sendContextualUpdate(String update);

    void sendFeedback(boolean isPositive);

    void sendToolResult(String toolCallId, String result, boolean isError);

    void sendUserActivity();

    void sendUserMessage(String message);

    Object setMicMuted(boolean z6, c<? super z> cVar);

    void setVolume(float volume);

    Object start(c<? super z> cVar);

    Object toggleMute(c<? super z> cVar);

    void unregisterTool(String name);
}
