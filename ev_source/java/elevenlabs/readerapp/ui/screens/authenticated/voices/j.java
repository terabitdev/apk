package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.GeneratingStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SaveVoiceStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SelectPreviewStepKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoiceDesignTipsSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt;
import io.elevenlabs.ui.components.ActionPillKt;
import io.elevenlabs.ui.components.ActionRowItemKt;
import io.elevenlabs.ui.components.AdaptiveGridKt;
import io.elevenlabs.ui.components.AutoScalingTextKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.BottomSheetDragHandleKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.CalloutKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17130b;

    public /* synthetic */ j(int i10, int i11) {
        this.f17129a = i11;
        this.f17130b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z Preview_VoiceDetailsScreen_Idle$lambda$1;
        z Preview_VoiceDetailsScreen_Premade_With_Image$lambda$1;
        z Preview_VoiceDetailsScreen_VoiceRecommendations$lambda$1;
        z Preview_VoiceDetailsScreen_VoiceRecommendations_loading$lambda$1;
        z Preview_VoiceDetailsScreen_Error$lambda$1;
        z Preview_VoiceDetailsScreen_Loading$lambda$1;
        z Preview_VoiceFiltersDialog_idle$lambda$2;
        z Preview_VoiceFiltersDialog_loaded$lambda$2;
        z Preview_ActionRowGroup$lambda$1;
        z Preview_BackButton$lambda$1;
        z Preview_EchoThemeBackButton$lambda$0;
        z Preview_BackButtonWithBackground$lambda$1;
        z Preview_Button$lambda$1;
        z Preview_Callout_Long_Text$lambda$1;
        z Preview_Callout_Small$lambda$1;
        z Callout$lambda$2;
        int i10 = this.f17129a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Preview_VoiceDetailsScreen_Idle$lambda$1 = VoiceDetailsScreenKt.Preview_VoiceDetailsScreen_Idle$lambda$1(this.f17130b, mVar, intValue);
                return Preview_VoiceDetailsScreen_Idle$lambda$1;
            case 1:
                Preview_VoiceDetailsScreen_Premade_With_Image$lambda$1 = VoiceDetailsScreenKt.Preview_VoiceDetailsScreen_Premade_With_Image$lambda$1(this.f17130b, mVar, intValue);
                return Preview_VoiceDetailsScreen_Premade_With_Image$lambda$1;
            case 2:
                Preview_VoiceDetailsScreen_VoiceRecommendations$lambda$1 = VoiceDetailsScreenKt.Preview_VoiceDetailsScreen_VoiceRecommendations$lambda$1(this.f17130b, mVar, intValue);
                return Preview_VoiceDetailsScreen_VoiceRecommendations$lambda$1;
            case 3:
                Preview_VoiceDetailsScreen_VoiceRecommendations_loading$lambda$1 = VoiceDetailsScreenKt.Preview_VoiceDetailsScreen_VoiceRecommendations_loading$lambda$1(this.f17130b, mVar, intValue);
                return Preview_VoiceDetailsScreen_VoiceRecommendations_loading$lambda$1;
            case 4:
                Preview_VoiceDetailsScreen_Error$lambda$1 = VoiceDetailsScreenKt.Preview_VoiceDetailsScreen_Error$lambda$1(this.f17130b, mVar, intValue);
                return Preview_VoiceDetailsScreen_Error$lambda$1;
            case 5:
                Preview_VoiceDetailsScreen_Loading$lambda$1 = VoiceDetailsScreenKt.Preview_VoiceDetailsScreen_Loading$lambda$1(this.f17130b, mVar, intValue);
                return Preview_VoiceDetailsScreen_Loading$lambda$1;
            case 6:
                Preview_VoiceFiltersDialog_idle$lambda$2 = VoiceFiltersDialogKt.Preview_VoiceFiltersDialog_idle$lambda$2(this.f17130b, mVar, intValue);
                return Preview_VoiceFiltersDialog_idle$lambda$2;
            case 7:
                Preview_VoiceFiltersDialog_loaded$lambda$2 = VoiceFiltersDialogKt.Preview_VoiceFiltersDialog_loaded$lambda$2(this.f17130b, mVar, intValue);
                return Preview_VoiceFiltersDialog_loaded$lambda$2;
            case 8:
                return VoiceDesignScreenKt.g(this.f17130b, mVar, intValue);
            case 9:
                return VoiceDesignScreenKt.d(this.f17130b, mVar, intValue);
            case 10:
                return GeneratingStepKt.a(this.f17130b, mVar, intValue);
            case 11:
                return SaveVoiceStepKt.f(this.f17130b, mVar, intValue);
            case 12:
                return SaveVoiceStepKt.i(this.f17130b, mVar, intValue);
            case 13:
                return SelectPreviewStepKt.b(this.f17130b, mVar, intValue);
            case 14:
                return VoiceDesignTipsSheetKt.a(this.f17130b, mVar, intValue);
            case 15:
                return VoicePromptStepKt.a(this.f17130b, mVar, intValue);
            case 16:
                return VoicePromptStepKt.k(this.f17130b, mVar, intValue);
            case 17:
                return ActionPillKt.a(this.f17130b, mVar, intValue);
            case 18:
                Preview_ActionRowGroup$lambda$1 = ActionRowItemKt.Preview_ActionRowGroup$lambda$1(this.f17130b, mVar, intValue);
                return Preview_ActionRowGroup$lambda$1;
            case 19:
                return AdaptiveGridKt.a(this.f17130b, mVar, intValue);
            case 20:
                return AutoScalingTextKt.b(this.f17130b, mVar, intValue);
            case 21:
                Preview_BackButton$lambda$1 = BackButtonKt.Preview_BackButton$lambda$1(this.f17130b, mVar, intValue);
                return Preview_BackButton$lambda$1;
            case 22:
                Preview_EchoThemeBackButton$lambda$0 = BackButtonKt.Preview_EchoThemeBackButton$lambda$0(this.f17130b, mVar, intValue);
                return Preview_EchoThemeBackButton$lambda$0;
            case 23:
                Preview_BackButtonWithBackground$lambda$1 = BackButtonWithBackgroundKt.Preview_BackButtonWithBackground$lambda$1(this.f17130b, mVar, intValue);
                return Preview_BackButtonWithBackground$lambda$1;
            case 24:
                return BottomSheetDragHandleKt.a(this.f17130b, mVar, intValue);
            case 25:
                return ButtonIconKt.b(this.f17130b, mVar, intValue);
            case 26:
                Preview_Button$lambda$1 = ButtonKt.Preview_Button$lambda$1(this.f17130b, mVar, intValue);
                return Preview_Button$lambda$1;
            case 27:
                Preview_Callout_Long_Text$lambda$1 = CalloutKt.Preview_Callout_Long_Text$lambda$1(this.f17130b, mVar, intValue);
                return Preview_Callout_Long_Text$lambda$1;
            case 28:
                Preview_Callout_Small$lambda$1 = CalloutKt.Preview_Callout_Small$lambda$1(this.f17130b, mVar, intValue);
                return Preview_Callout_Small$lambda$1;
            default:
                Callout$lambda$2 = CalloutKt.Callout$lambda$2(this.f17130b, mVar, intValue);
                return Callout$lambda$2;
        }
    }
}
