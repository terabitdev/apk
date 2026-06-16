package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/elevenlabs/readerapp/ui/screens/authenticated/agent/AskAgentViewModel$sessionListener$1", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;", "", ParameterNames.TEXT, "", "isFinal", "Lsn/z;", "onAgentResponseStreaming", "(Ljava/lang/String;Z)V", "onAgentResponse", "(Ljava/lang/String;)V", "onUserTranscript", "mode", "onModeChange", "canSend", "onCanSendFeedbackChange", "(Z)V", "", FirebaseAnalytics.Param.SCORE, "onVadScore", "(F)V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AskAgentViewModel$sessionListener$1 implements AssistantSessionService.SessionListener {
    final /* synthetic */ AskAgentViewModel this$0;

    public AskAgentViewModel$sessionListener$1(AskAgentViewModel askAgentViewModel) {
        this.this$0 = askAgentViewModel;
    }

    public static final AskAgentContract.State onAgentResponse$lambda$1(String str, AskAgentContract.State state) {
        String str2;
        ChatMessage chatMessage;
        state.getClass();
        List<ChatMessage> messages = state.getMessages();
        ListIterator<ChatMessage> listIterator = messages.listIterator(messages.size());
        while (true) {
            str2 = null;
            if (listIterator.hasPrevious()) {
                chatMessage = listIterator.previous();
                if (!chatMessage.isFromUser()) {
                    break;
                }
            } else {
                chatMessage = null;
                break;
            }
        }
        ChatMessage chatMessage2 = chatMessage;
        if (chatMessage2 != null) {
            str2 = chatMessage2.getContent();
        }
        if (m.c(str2, str)) {
            return AskAgentContract.State.copy$default(state, null, null, false, null, false, false, 59, null);
        }
        return AskAgentContract.State.copy$default(state, null, o.P0(new ChatMessage(str, false, 0L, 4, null), state.getMessages()), false, null, false, false, 57, null);
    }

    public static final AskAgentContract.State onAgentResponseStreaming$lambda$0(String str, boolean z6, AskAgentContract.State state) {
        state.getClass();
        ChatMessage chatMessage = (ChatMessage) o.H0(state.getMessages());
        boolean z10 = false;
        if (chatMessage != null && !chatMessage.isFromUser()) {
            z10 = true;
        }
        if (state.isStreamingAgentMessage() && z10) {
            ArrayList i12 = o.i1(state.getMessages());
            i12.set(i12.size() - 1, ChatMessage.copy$default((ChatMessage) o.G0(i12), str, false, 0L, 6, null));
            return AskAgentContract.State.copy$default(state, null, i12, false, null, !z6, false, 41, null);
        }
        return AskAgentContract.State.copy$default(state, null, o.P0(new ChatMessage(str, false, 0L, 4, null), state.getMessages()), false, null, !z6, false, 41, null);
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onAgentResponse(String r42) {
        r42.getClass();
        this.this$0.queueStateUpdate(new h(r42, 2));
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onAgentResponseStreaming(String r32, boolean isFinal) {
        r32.getClass();
        this.this$0.queueStateUpdate(new g(r32, isFinal));
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onModeChange(String mode) {
        mode.getClass();
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onUserTranscript(String r12) {
        r12.getClass();
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onCanSendFeedbackChange(boolean canSend) {
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onVadScore(float r12) {
    }
}
