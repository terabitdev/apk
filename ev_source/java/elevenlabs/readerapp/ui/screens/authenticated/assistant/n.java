package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import android.content.Context;
import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantContract;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15149c;

    public /* synthetic */ n(Context context, AskAssistantViewModel askAssistantViewModel) {
        this.f15147a = 1;
        this.f15149c = context;
        this.f15148b = askAssistantViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AssistantContract.State emit$lambda$0;
        sn.z AskAssistantSheet$lambda$1$0;
        AssistantContract.State initialize$lambda$0;
        sn.z AssistantTextModeUI$lambda$3$0$0;
        switch (this.f15147a) {
            case 0:
                emit$lambda$0 = AskAssistantViewModel.AnonymousClass1.C00331.emit$lambda$0((AskAssistantViewModel) this.f15148b, (AssistantSessionService.SessionState) this.f15149c, (AssistantContract.State) obj);
                return emit$lambda$0;
            case 1:
                AskAssistantSheet$lambda$1$0 = AskAssistantSheetKt.AskAssistantSheet$lambda$1$0((Context) this.f15149c, (AskAssistantViewModel) this.f15148b, ((Boolean) obj).booleanValue());
                return AskAssistantSheet$lambda$1$0;
            case 2:
                initialize$lambda$0 = AskAssistantViewModel.initialize$lambda$0((AskAssistantViewModel) this.f15148b, (AssistantInteractionMode) this.f15149c, (AssistantContract.State) obj);
                return initialize$lambda$0;
            default:
                AssistantTextModeUI$lambda$3$0$0 = AssistantTextModeScreenKt.AssistantTextModeUI$lambda$3$0$0((ho.a) this.f15148b, (z0) this.f15149c, (String) obj);
                return AssistantTextModeUI$lambda$3$0$0;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, int i10) {
        this.f15147a = i10;
        this.f15148b = obj;
        this.f15149c = obj2;
    }
}
