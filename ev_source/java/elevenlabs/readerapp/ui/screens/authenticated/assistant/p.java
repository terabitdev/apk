package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15152b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f15151a = i10;
        this.f15152b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AssistantContract.State invokeSuspend$lambda$1;
        sn.z AskAssistantSheet$lambda$6$0;
        AssistantContract.State handleSendTextMessage$lambda$2;
        AssistantContract.State onModeChange$lambda$2;
        switch (this.f15151a) {
            case 0:
                invokeSuspend$lambda$1 = AskAssistantViewModel$handleToggleMode$1.invokeSuspend$lambda$1((AssistantInteractionMode) this.f15152b, (AssistantContract.State) obj);
                return invokeSuspend$lambda$1;
            case 1:
                AskAssistantSheet$lambda$6$0 = AskAssistantSheetKt.AskAssistantSheet$lambda$6$0((AskAssistantViewModel) this.f15152b, (androidx.lifecycle.t) obj);
                return AskAssistantSheet$lambda$6$0;
            case 2:
                handleSendTextMessage$lambda$2 = AskAssistantViewModel.handleSendTextMessage$lambda$2((String) this.f15152b, (AssistantContract.State) obj);
                return handleSendTextMessage$lambda$2;
            default:
                onModeChange$lambda$2 = AskAssistantViewModel$sessionListener$1.onModeChange$lambda$2((AssistantMode) this.f15152b, (AssistantContract.State) obj);
                return onModeChange$lambda$2;
        }
    }
}
