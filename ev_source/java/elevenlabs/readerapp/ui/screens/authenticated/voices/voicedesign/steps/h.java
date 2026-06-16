package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f17202b;

    public /* synthetic */ h(ho.l lVar, int i10) {
        this.f17201a = i10;
        this.f17202b = lVar;
    }

    @Override // ho.a
    public final Object invoke() {
        z SaveVoiceStep$lambda$0$1$0;
        z SelectPreviewStep$lambda$0$1$0;
        z VoicePromptStep$lambda$0$6$1$0;
        z VoicePromptStep$lambda$0$6$0$0;
        switch (this.f17201a) {
            case 0:
                SaveVoiceStep$lambda$0$1$0 = SaveVoiceStepKt.SaveVoiceStep$lambda$0$1$0(this.f17202b);
                return SaveVoiceStep$lambda$0$1$0;
            case 1:
                SelectPreviewStep$lambda$0$1$0 = SelectPreviewStepKt.SelectPreviewStep$lambda$0$1$0(this.f17202b);
                return SelectPreviewStep$lambda$0$1$0;
            case 2:
                VoicePromptStep$lambda$0$6$1$0 = VoicePromptStepKt.VoicePromptStep$lambda$0$6$1$0(this.f17202b);
                return VoicePromptStep$lambda$0$6$1$0;
            default:
                VoicePromptStep$lambda$0$6$0$0 = VoicePromptStepKt.VoicePromptStep$lambda$0$6$0$0(this.f17202b);
                return VoicePromptStep$lambda$0$6$0$0;
        }
    }
}
