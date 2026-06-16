package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import i1.m0;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15150a;

    public /* synthetic */ o(int i10) {
        this.f15150a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        m0 AssistantConnectedContent$lambda$0$0;
        m0 AskAssistantSheetUI$lambda$2$0$4$0;
        AssistantContract.State initializeAssistant$lambda$0;
        AssistantContract.State onEvent$lambda$0;
        AssistantContract.State onEvent$lambda$1;
        AssistantContract.State handleDismissExplainer$lambda$0;
        sn.z lambda_1402265427$lambda$0$0$0$0;
        sn.z lambda__354623835$lambda$0$0$0$0;
        sn.z lambda_1795875222$lambda$0$0$0$0;
        sn.z lambda_13172192$lambda$0$0$0;
        sn.z lambda_693375903$lambda$0$0$0;
        sn.z lambda_661343648$lambda$0$0$0;
        switch (this.f15150a) {
            case 0:
                return AskAssistantViewModel$handleClose$1.d((AssistantContract.State) obj);
            case 1:
                return AskAssistantViewModel$handlePermissionResult$1.d((AssistantContract.State) obj);
            case 2:
                return AskAssistantViewModel$handleToggleMode$1.i((AssistantContract.State) obj);
            case 3:
                return AskAssistantViewModel$handleToggleMode$1.d((AssistantContract.State) obj);
            case 4:
                AssistantConnectedContent$lambda$0$0 = AskAssistantSheetKt.AssistantConnectedContent$lambda$0$0((i1.q) obj);
                return AssistantConnectedContent$lambda$0$0;
            case 5:
                AskAssistantSheetUI$lambda$2$0$4$0 = AskAssistantSheetKt.AskAssistantSheetUI$lambda$2$0$4$0((i1.q) obj);
                return AskAssistantSheetUI$lambda$2$0$4$0;
            case 6:
                initializeAssistant$lambda$0 = AskAssistantViewModel.initializeAssistant$lambda$0((AssistantContract.State) obj);
                return initializeAssistant$lambda$0;
            case 7:
                onEvent$lambda$0 = AskAssistantViewModel.onEvent$lambda$0((AssistantContract.State) obj);
                return onEvent$lambda$0;
            case 8:
                onEvent$lambda$1 = AskAssistantViewModel.onEvent$lambda$1((AssistantContract.State) obj);
                return onEvent$lambda$1;
            case 9:
                handleDismissExplainer$lambda$0 = AskAssistantViewModel.handleDismissExplainer$lambda$0((AssistantContract.State) obj);
                return handleDismissExplainer$lambda$0;
            case 10:
                lambda_1402265427$lambda$0$0$0$0 = ComposableSingletons$AssistantTextModeScreenKt.lambda_1402265427$lambda$0$0$0$0((String) obj);
                return lambda_1402265427$lambda$0$0$0$0;
            case 11:
                lambda__354623835$lambda$0$0$0$0 = ComposableSingletons$AssistantTextModeScreenKt.lambda__354623835$lambda$0$0$0$0((String) obj);
                return lambda__354623835$lambda$0$0$0$0;
            case 12:
                lambda_1795875222$lambda$0$0$0$0 = ComposableSingletons$AssistantTextModeScreenKt.lambda_1795875222$lambda$0$0$0$0((String) obj);
                return lambda_1795875222$lambda$0$0$0$0;
            case 13:
                lambda_13172192$lambda$0$0$0 = ComposableSingletons$AssistantVoiceModeScreenKt.lambda_13172192$lambda$0$0$0((String) obj);
                return lambda_13172192$lambda$0$0$0;
            case 14:
                lambda_693375903$lambda$0$0$0 = ComposableSingletons$AssistantVoiceModeScreenKt.lambda_693375903$lambda$0$0$0((String) obj);
                return lambda_693375903$lambda$0$0$0;
            default:
                lambda_661343648$lambda$0$0$0 = ComposableSingletons$AssistantVoiceModeScreenKt.lambda_661343648$lambda$0$0$0((String) obj);
                return lambda_661343648$lambda$0$0$0;
        }
    }
}
