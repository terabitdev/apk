package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import ho.l;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel$resolvePaywallOnGenerate$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17175b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f17174a = i10;
        this.f17175b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoiceDesignContract.State updateDescription$lambda$0;
        VoiceDesignContract.State updateVoiceName$lambda$0;
        switch (this.f17174a) {
            case 0:
                return VoiceDesignViewModel$playPreview$1$1.d((String) this.f17175b, (VoiceDesignContract.State) obj);
            case 1:
                updateDescription$lambda$0 = VoiceDesignViewModel.updateDescription$lambda$0((String) this.f17175b, (VoiceDesignContract.State) obj);
                return updateDescription$lambda$0;
            case 2:
                updateVoiceName$lambda$0 = VoiceDesignViewModel.updateVoiceName$lambda$0((String) this.f17175b, (VoiceDesignContract.State) obj);
                return updateVoiceName$lambda$0;
            default:
                return VoiceDesignViewModel$resolvePaywallOnGenerate$1.AnonymousClass1.a((Customer) this.f17175b, (VoiceDesignContract.State) obj);
        }
    }
}
