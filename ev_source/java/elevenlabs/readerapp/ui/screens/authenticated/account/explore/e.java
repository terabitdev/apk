package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatComposerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentMessageRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.ScrollToBottomButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantMenuKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantTextModeScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatHistoryListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatInputKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatMessageBubbleKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.MicPermissionPromptKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.PromptSuggestionsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.TypingIndicatorKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.VoiceModeControlsKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14994b;

    public /* synthetic */ e(int i10, int i11) {
        this.f14993a = i11;
        this.f14994b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z Preview_AgentChatComposer_Responding$lambda$0;
        z Preview_AgentChatComposer_Idle$lambda$0;
        z Preview_VoiceModeControls_Muted$lambda$0;
        z Preview_VoiceModeControls_Unmuted$lambda$0;
        int i10 = this.f14993a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ExploreLanguageSettingScreenKt.e(this.f14994b, mVar, intValue);
            case 1:
                return AskAgentScreenKt.m(this.f14994b, mVar, intValue);
            case 2:
                return AskAgentScreenKt.f(this.f14994b, mVar, intValue);
            case 3:
                Preview_AgentChatComposer_Responding$lambda$0 = AgentChatComposerKt.Preview_AgentChatComposer_Responding$lambda$0(this.f14994b, mVar, intValue);
                return Preview_AgentChatComposer_Responding$lambda$0;
            case 4:
                Preview_AgentChatComposer_Idle$lambda$0 = AgentChatComposerKt.Preview_AgentChatComposer_Idle$lambda$0(this.f14994b, mVar, intValue);
                return Preview_AgentChatComposer_Idle$lambda$0;
            case 5:
                return AgentChatListKt.f(this.f14994b, mVar, intValue);
            case 6:
                return AgentChatListKt.b(this.f14994b, mVar, intValue);
            case 7:
                return AgentMessageRowKt.a(this.f14994b, mVar, intValue);
            case 8:
                return AgentMessageRowKt.d(this.f14994b, mVar, intValue);
            case 9:
                return AgentMessageRowKt.c(this.f14994b, mVar, intValue);
            case 10:
                return ScrollToBottomButtonKt.b(this.f14994b, mVar, intValue);
            case 11:
                return AssistantMenuKt.b(this.f14994b, mVar, intValue);
            case 12:
                return AssistantTextModeScreenKt.b(this.f14994b, mVar, intValue);
            case 13:
                return AssistantTextModeScreenKt.f(this.f14994b, mVar, intValue);
            case 14:
                return AssistantTextModeScreenKt.e(this.f14994b, mVar, intValue);
            case 15:
                return AssistantVoiceModeScreenKt.a(this.f14994b, mVar, intValue);
            case 16:
                return AssistantVoiceModeScreenKt.d(this.f14994b, mVar, intValue);
            case 17:
                return AssistantVoiceModeScreenKt.e(this.f14994b, mVar, intValue);
            case 18:
                return ChatHistoryListKt.c(this.f14994b, mVar, intValue);
            case 19:
                return ChatHistoryListKt.e(this.f14994b, mVar, intValue);
            case 20:
                return ChatInputKt.c(this.f14994b, mVar, intValue);
            case 21:
                return ChatInputKt.h(this.f14994b, mVar, intValue);
            case 22:
                return ChatMessageBubbleKt.d(this.f14994b, mVar, intValue);
            case 23:
                return ChatMessageBubbleKt.b(this.f14994b, mVar, intValue);
            case 24:
                return MicPermissionPromptKt.d(this.f14994b, mVar, intValue);
            case 25:
                return MicPermissionPromptKt.c(this.f14994b, mVar, intValue);
            case 26:
                return PromptSuggestionsSectionKt.a(this.f14994b, mVar, intValue);
            case 27:
                return TypingIndicatorKt.a(this.f14994b, mVar, intValue);
            case 28:
                Preview_VoiceModeControls_Muted$lambda$0 = VoiceModeControlsKt.Preview_VoiceModeControls_Muted$lambda$0(this.f14994b, mVar, intValue);
                return Preview_VoiceModeControls_Muted$lambda$0;
            default:
                Preview_VoiceModeControls_Unmuted$lambda$0 = VoiceModeControlsKt.Preview_VoiceModeControls_Unmuted$lambda$0(this.f14994b, mVar, intValue);
                return Preview_VoiceModeControls_Unmuted$lambda$0;
        }
    }
}
