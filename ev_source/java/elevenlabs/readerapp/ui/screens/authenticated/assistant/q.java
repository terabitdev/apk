package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel$initialize$2;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15154b;

    public /* synthetic */ q(boolean z6, int i10) {
        this.f15153a = i10;
        this.f15154b = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        int AssistantConnectedContent$lambda$0$0$0;
        int AssistantConnectedContent$lambda$0$0$1;
        AssistantContract.State updateMicPermissionPermanentlyDenied$lambda$0;
        AssistantContract.State handleToggleAudio$lambda$0;
        AssistantContract.State handleToggleMic$lambda$0;
        switch (this.f15153a) {
            case 0:
                return AskAssistantViewModel$initialize$2.AnonymousClass1.a(this.f15154b, (AssistantContract.State) obj);
            case 1:
                return AskAssistantViewModel$initializeAssistant$3.d(this.f15154b, (AssistantContract.State) obj);
            case 2:
                AssistantConnectedContent$lambda$0$0$0 = AskAssistantSheetKt.AssistantConnectedContent$lambda$0$0$0(this.f15154b, ((Integer) obj).intValue());
                return Integer.valueOf(AssistantConnectedContent$lambda$0$0$0);
            case 3:
                AssistantConnectedContent$lambda$0$0$1 = AskAssistantSheetKt.AssistantConnectedContent$lambda$0$0$1(this.f15154b, ((Integer) obj).intValue());
                return Integer.valueOf(AssistantConnectedContent$lambda$0$0$1);
            case 4:
                updateMicPermissionPermanentlyDenied$lambda$0 = AskAssistantViewModel.updateMicPermissionPermanentlyDenied$lambda$0(this.f15154b, (AssistantContract.State) obj);
                return updateMicPermissionPermanentlyDenied$lambda$0;
            case 5:
                handleToggleAudio$lambda$0 = AskAssistantViewModel.handleToggleAudio$lambda$0(this.f15154b, (AssistantContract.State) obj);
                return handleToggleAudio$lambda$0;
            case 6:
                handleToggleMic$lambda$0 = AskAssistantViewModel.handleToggleMic$lambda$0(this.f15154b, (AssistantContract.State) obj);
                return handleToggleMic$lambda$0;
            default:
                return AskAssistantViewModel$sessionListener$1.e(this.f15154b, (AssistantContract.State) obj);
        }
    }
}
