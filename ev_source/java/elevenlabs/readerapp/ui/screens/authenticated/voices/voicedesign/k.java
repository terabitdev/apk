package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import ho.l;
import io.elevenlabs.domain.services.VoiceDesignPreviewsResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17182c;

    public /* synthetic */ k(Object obj, Object obj2, int i10) {
        this.f17180a = i10;
        this.f17181b = obj;
        this.f17182c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoiceDesignContract.State playPreview$lambda$0;
        VoiceDesignContract.State selectPromptPill$lambda$0;
        switch (this.f17180a) {
            case 0:
                return VoiceDesignViewModel$startGeneration$1$1.h((VoiceDesignPreviewsResult) this.f17181b, (List) this.f17182c, (VoiceDesignContract.State) obj);
            case 1:
                playPreview$lambda$0 = VoiceDesignViewModel.playPreview$lambda$0((VoiceDesignViewModel) this.f17181b, (String) this.f17182c, (VoiceDesignContract.State) obj);
                return playPreview$lambda$0;
            default:
                selectPromptPill$lambda$0 = VoiceDesignViewModel.selectPromptPill$lambda$0((String) this.f17181b, (VoiceDesignPrompt) this.f17182c, (VoiceDesignContract.State) obj);
                return selectPromptPill$lambda$0;
        }
    }
}
