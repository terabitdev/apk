package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import ho.l;
import i1.m0;
import i1.q;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17176a;

    public /* synthetic */ i(int i10) {
        this.f17176a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z lambda_8603334$lambda$0$0$0;
        z lambda_587728184$lambda$0$0$0;
        m0 VoiceDesignScreenContent$lambda$0$0;
        VoiceDesignContract.State hideDiscardDialog$lambda$0;
        VoiceDesignContract.State showDiscardDialog$lambda$0;
        VoiceDesignContract.State showTips$lambda$0;
        VoiceDesignContract.State hideTips$lambda$0;
        switch (this.f17176a) {
            case 0:
                return VoiceDesignViewModel$saveVoice$1$1.h((VoiceDesignContract.State) obj);
            case 1:
                lambda_8603334$lambda$0$0$0 = ComposableSingletons$VoiceDesignScreenKt.lambda_8603334$lambda$0$0$0((VoiceDesignContract.Event) obj);
                return lambda_8603334$lambda$0$0$0;
            case 2:
                lambda_587728184$lambda$0$0$0 = ComposableSingletons$VoiceDesignScreenKt.lambda_587728184$lambda$0$0$0((VoiceDesignContract.Event) obj);
                return lambda_587728184$lambda$0$0$0;
            case 3:
                VoiceDesignScreenContent$lambda$0$0 = VoiceDesignScreenKt.VoiceDesignScreenContent$lambda$0$0((q) obj);
                return VoiceDesignScreenContent$lambda$0$0;
            case 4:
                hideDiscardDialog$lambda$0 = VoiceDesignViewModel.hideDiscardDialog$lambda$0((VoiceDesignContract.State) obj);
                return hideDiscardDialog$lambda$0;
            case 5:
                showDiscardDialog$lambda$0 = VoiceDesignViewModel.showDiscardDialog$lambda$0((VoiceDesignContract.State) obj);
                return showDiscardDialog$lambda$0;
            case 6:
                showTips$lambda$0 = VoiceDesignViewModel.showTips$lambda$0((VoiceDesignContract.State) obj);
                return showTips$lambda$0;
            default:
                hideTips$lambda$0 = VoiceDesignViewModel.hideTips$lambda$0((VoiceDesignContract.State) obj);
                return hideTips$lambda$0;
        }
    }
}
