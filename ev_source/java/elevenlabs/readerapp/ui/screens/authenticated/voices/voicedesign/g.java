package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoiceDesignViewModel f17173b;

    public /* synthetic */ g(VoiceDesignViewModel voiceDesignViewModel, int i10) {
        this.f17172a = i10;
        this.f17173b = voiceDesignViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoiceDesignContract.State retry$lambda$0;
        VoiceDesignContract.State selectPreview$lambda$0;
        VoiceDesignContract.State stopPreviewPlayback$lambda$0;
        VoiceDesignContract.State generateVoice$lambda$0;
        VoiceDesignContract.State close$lambda$0;
        VoiceDesignContract.State goBack$lambda$0;
        VoiceDesignContract.State startGeneration$lambda$0;
        VoiceDesignContract.State saveVoice$lambda$0;
        switch (this.f17172a) {
            case 0:
                retry$lambda$0 = VoiceDesignViewModel.retry$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return retry$lambda$0;
            case 1:
                selectPreview$lambda$0 = VoiceDesignViewModel.selectPreview$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return selectPreview$lambda$0;
            case 2:
                stopPreviewPlayback$lambda$0 = VoiceDesignViewModel.stopPreviewPlayback$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return stopPreviewPlayback$lambda$0;
            case 3:
                generateVoice$lambda$0 = VoiceDesignViewModel.generateVoice$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return generateVoice$lambda$0;
            case 4:
                close$lambda$0 = VoiceDesignViewModel.close$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return close$lambda$0;
            case 5:
                goBack$lambda$0 = VoiceDesignViewModel.goBack$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return goBack$lambda$0;
            case 6:
                startGeneration$lambda$0 = VoiceDesignViewModel.startGeneration$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return startGeneration$lambda$0;
            default:
                saveVoice$lambda$0 = VoiceDesignViewModel.saveVoice$lambda$0(this.f17173b, (VoiceDesignContract.State) obj);
                return saveVoice$lambda$0;
        }
    }
}
