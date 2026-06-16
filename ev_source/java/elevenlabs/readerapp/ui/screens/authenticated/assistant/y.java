package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15186a;

    public /* synthetic */ y(int i10) {
        this.f15186a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z lambda_1168504118$lambda$0;
        sn.z lambda_1402265427$lambda$0;
        sn.z lambda__354623835$lambda$0;
        sn.z lambda_1795875222$lambda$0;
        int i10 = this.f15186a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$AskAssistantSheetKt.a(mVar, intValue);
            case 1:
                lambda_1168504118$lambda$0 = ComposableSingletons$AssistantMenuKt.lambda_1168504118$lambda$0(mVar, intValue);
                return lambda_1168504118$lambda$0;
            case 2:
                lambda_1402265427$lambda$0 = ComposableSingletons$AssistantTextModeScreenKt.lambda_1402265427$lambda$0(mVar, intValue);
                return lambda_1402265427$lambda$0;
            case 3:
                lambda__354623835$lambda$0 = ComposableSingletons$AssistantTextModeScreenKt.lambda__354623835$lambda$0(mVar, intValue);
                return lambda__354623835$lambda$0;
            case 4:
                lambda_1795875222$lambda$0 = ComposableSingletons$AssistantTextModeScreenKt.lambda_1795875222$lambda$0(mVar, intValue);
                return lambda_1795875222$lambda$0;
            case 5:
                return ComposableSingletons$AssistantVoiceModeScreenKt.e(mVar, intValue);
            case 6:
                return ComposableSingletons$AssistantVoiceModeScreenKt.b(mVar, intValue);
            case 7:
                return ComposableSingletons$AssistantVoiceModeScreenKt.a(mVar, intValue);
            case 8:
                return ComposableSingletons$PreviewAssistantMenuDefaultGroupPreviewAssistantMenuKt.a(mVar, intValue);
            case 9:
                return ComposableSingletons$PreviewAssistantTextModeUIAskAssistantTextModeFullUIKt.a(mVar, intValue);
            case 10:
                return ComposableSingletons$PreviewAssistantTextModeUILoadingAskAssistantTextModeLoadingKt.a(mVar, intValue);
            case 11:
                return ComposableSingletons$PreviewAssistantTextModeUITypingAskAssistantTextModeWithTypingIndicatorKt.a(mVar, intValue);
            case 12:
                return ComposableSingletons$PreviewAssistantVoiceModeUIListeningAskAssistantVoiceModeListeningKt.a(mVar, intValue);
            case 13:
                return ComposableSingletons$PreviewAssistantVoiceModeUILoadingAskAssistantVoiceModeLoadingKt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewAssistantVoiceModeUISpeakingAskAssistantVoiceModeSpeakingKt.a(mVar, intValue);
        }
    }
}
