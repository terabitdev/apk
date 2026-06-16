package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17196b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f17195a = i10;
        this.f17196b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z GeneratingStep$lambda$1$0$7$0;
        z SaveVoiceStep$lambda$0$0$0$2$0;
        z SaveVoiceStep$lambda$0$0$0$4$0;
        z PageIndicator$lambda$0$0;
        z PreviewPage$lambda$1$0$0;
        z TraitChip$lambda$1$0;
        z PromptPill$lambda$1$0;
        z VoicePromptStep$lambda$0$4$1$0;
        z SaveVoiceStep$lambda$0$0$0$5$0;
        switch (this.f17195a) {
            case 0:
                GeneratingStep$lambda$1$0$7$0 = GeneratingStepKt.GeneratingStep$lambda$1$0$7$0((String) this.f17196b, (b0) obj);
                return GeneratingStep$lambda$1$0$7$0;
            case 1:
                SaveVoiceStep$lambda$0$0$0$2$0 = SaveVoiceStepKt.SaveVoiceStep$lambda$0$0$0$2$0((String) this.f17196b, (b0) obj);
                return SaveVoiceStep$lambda$0$0$0$2$0;
            case 2:
                SaveVoiceStep$lambda$0$0$0$4$0 = SaveVoiceStepKt.SaveVoiceStep$lambda$0$0$0$4$0((String) this.f17196b, (b0) obj);
                return SaveVoiceStep$lambda$0$0$0$4$0;
            case 3:
                PageIndicator$lambda$0$0 = SelectPreviewStepKt.PageIndicator$lambda$0$0((String) this.f17196b, (b0) obj);
                return PageIndicator$lambda$0$0;
            case 4:
                PreviewPage$lambda$1$0$0 = SelectPreviewStepKt.PreviewPage$lambda$1$0$0((String) this.f17196b, (b0) obj);
                return PreviewPage$lambda$1$0$0;
            case 5:
                TraitChip$lambda$1$0 = VoiceDesignTipsSheetKt.TraitChip$lambda$1$0((String) this.f17196b, (b0) obj);
                return TraitChip$lambda$1$0;
            case 6:
                PromptPill$lambda$1$0 = VoicePromptStepKt.PromptPill$lambda$1$0((String) this.f17196b, (b0) obj);
                return PromptPill$lambda$1$0;
            case 7:
                VoicePromptStep$lambda$0$4$1$0 = VoicePromptStepKt.VoicePromptStep$lambda$0$4$1$0((String) this.f17196b, (b0) obj);
                return VoicePromptStep$lambda$0$4$1$0;
            default:
                SaveVoiceStep$lambda$0$0$0$5$0 = SaveVoiceStepKt.SaveVoiceStep$lambda$0$0$0$5$0((ho.l) this.f17196b, (String) obj);
                return SaveVoiceStep$lambda$0$0$0$5$0;
        }
    }
}
