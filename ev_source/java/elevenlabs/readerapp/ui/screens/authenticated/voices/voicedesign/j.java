package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoiceDesignViewModel f17178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f17179c;

    public /* synthetic */ j(VoiceDesignViewModel voiceDesignViewModel, AsyncCallResult.Error error, int i10) {
        this.f17177a = i10;
        this.f17178b = voiceDesignViewModel;
        this.f17179c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoiceDesignContract.State invokeSuspend$lambda$1;
        VoiceDesignContract.State invokeSuspend$lambda$2;
        switch (this.f17177a) {
            case 0:
                invokeSuspend$lambda$1 = VoiceDesignViewModel$saveVoice$1$1.invokeSuspend$lambda$1(this.f17178b, this.f17179c, (VoiceDesignContract.State) obj);
                return invokeSuspend$lambda$1;
            default:
                invokeSuspend$lambda$2 = VoiceDesignViewModel$startGeneration$1$1.invokeSuspend$lambda$2(this.f17178b, this.f17179c, (VoiceDesignContract.State) obj);
                return invokeSuspend$lambda$2;
        }
    }
}
