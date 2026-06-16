package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f15158b;

    public /* synthetic */ s(int i10, ChatMessage chatMessage) {
        this.f15157a = i10;
        this.f15158b = chatMessage;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AssistantContract.State onAgentResponse$lambda$1;
        AssistantContract.State onUserTranscript$lambda$0;
        switch (this.f15157a) {
            case 0:
                onAgentResponse$lambda$1 = AskAssistantViewModel$sessionListener$1.onAgentResponse$lambda$1(this.f15158b, (AssistantContract.State) obj);
                return onAgentResponse$lambda$1;
            default:
                onUserTranscript$lambda$0 = AskAssistantViewModel$sessionListener$1.onUserTranscript$lambda$0(this.f15158b, (AssistantContract.State) obj);
                return onUserTranscript$lambda$0;
        }
    }
}
