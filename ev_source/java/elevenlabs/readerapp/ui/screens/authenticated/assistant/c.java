package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15092c;

    public /* synthetic */ c(ho.l lVar, Object obj, int i10) {
        this.f15090a = i10;
        this.f15091b = lVar;
        this.f15092c = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z AskAssistantSheetUI$lambda$0$0;
        sn.z AskAssistantSheetUI$lambda$2$0$2$0;
        sn.z AssistantTextModeUI$lambda$3$1$0;
        switch (this.f15090a) {
            case 0:
                AskAssistantSheetUI$lambda$0$0 = AskAssistantSheetKt.AskAssistantSheetUI$lambda$0$0(this.f15091b, (ho.a) this.f15092c);
                return AskAssistantSheetUI$lambda$0$0;
            case 1:
                AskAssistantSheetUI$lambda$2$0$2$0 = AskAssistantSheetKt.AskAssistantSheetUI$lambda$2$0$2$0(this.f15091b, (BottomSheetControl) this.f15092c);
                return AskAssistantSheetUI$lambda$2$0$2$0;
            default:
                AssistantTextModeUI$lambda$3$1$0 = AssistantTextModeScreenKt.AssistantTextModeUI$lambda$3$1$0(this.f15091b, (z0) this.f15092c);
                return AssistantTextModeUI$lambda$3$1$0;
        }
    }
}
