package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"io/elevenlabs/readerapp/ui/screens/authenticated/assistant/AskAssistantViewModel$sessionListener$1", "Lio/elevenlabs/domain/services/player/AssistantSessionService$SessionListener;", "", ParameterNames.TEXT, "Lsn/z;", "onUserTranscript", "(Ljava/lang/String;)V", "onAgentResponse", "mode", "onModeChange", "", "canSend", "onCanSendFeedbackChange", "(Z)V", "", FirebaseAnalytics.Param.SCORE, "onVadScore", "(F)V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AskAssistantViewModel$sessionListener$1 implements AssistantSessionService.SessionListener {
    final /* synthetic */ AskAssistantViewModel this$0;

    public AskAssistantViewModel$sessionListener$1(AskAssistantViewModel askAssistantViewModel) {
        this.this$0 = askAssistantViewModel;
    }

    public static final AssistantContract.State onAgentResponse$lambda$1(ChatMessage chatMessage, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, false, null, tn.o.P0(chatMessage, state.getChatMessages()), false, false, null, false, false, false, false, false, 2084863, null);
    }

    public static final AssistantContract.State onCanSendFeedbackChange$lambda$3(boolean z6, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, z6, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097135, null);
    }

    public static final AssistantContract.State onModeChange$lambda$2(AssistantMode assistantMode, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, assistantMode, null, false, false, false, false, null, t2.u.P, null, false, null, null, false, false, null, false, false, false, false, false, 2097149, null);
    }

    public static final AssistantContract.State onUserTranscript$lambda$0(ChatMessage chatMessage, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, t2.u.P, null, true, null, tn.o.P0(chatMessage, state.getChatMessages()), true, false, null, false, false, false, false, false, 2083839, null);
    }

    public static final AssistantContract.State onVadScore$lambda$4(float f10, AssistantContract.State state) {
        state.getClass();
        return AssistantContract.State.copy$default(state, null, null, null, false, false, false, false, null, f10, null, false, null, null, false, false, null, false, false, false, false, false, 2096895, null);
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onAgentResponse(String r82) {
        r82.getClass();
        this.this$0.queueStateUpdate(new s(0, new ChatMessage(r82, false, 0L, 4, null)));
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public /* bridge */ void onAgentResponseStreaming(String str, boolean z6) {
        super.onAgentResponseStreaming(str, z6);
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onCanSendFeedbackChange(boolean canSend) {
        this.this$0.queueStateUpdate(new q(canSend, 7));
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onModeChange(String mode) {
        AssistantMode assistantMode;
        mode.getClass();
        if (mode.equals("LISTENING")) {
            assistantMode = AssistantMode.LISTENING;
        } else if (mode.equals("SPEAKING")) {
            assistantMode = AssistantMode.SPEAKING;
        } else {
            assistantMode = AssistantMode.LISTENING;
        }
        if (((AssistantContract.State) this.this$0.getStateFlow().getValue()).getMode() != assistantMode) {
            this.this$0.queueStateUpdate(new p(assistantMode, 3));
        }
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onUserTranscript(String r82) {
        r82.getClass();
        this.this$0.queueStateUpdate(new s(1, new ChatMessage(r82, true, 0L, 4, null)));
    }

    @Override // io.elevenlabs.domain.services.player.AssistantSessionService.SessionListener
    public void onVadScore(float r42) {
        this.this$0.queueStateUpdate(new r(r42, 0));
    }
}
