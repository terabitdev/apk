package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16525b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f16524a = i10;
        this.f16525b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoicePickerSharedContract.State invokeSuspend$lambda$0;
        VoicePickerSharedContract.State initialise$lambda$0;
        switch (this.f16524a) {
            case 0:
                return VoicePickerSharedRepository$loadAvailableFilters$1.d((AsyncCallResult.Success) this.f16525b, (VoicePickerSharedContract.State) obj);
            case 1:
                invokeSuspend$lambda$0 = VoicePickerSharedRepository$toggleVoicePreview$1.invokeSuspend$lambda$0((Voice) this.f16525b, (VoicePickerSharedContract.State) obj);
                return invokeSuspend$lambda$0;
            default:
                initialise$lambda$0 = VoicePickerSharedRepository.initialise$lambda$0((VoicePickerMode) this.f16525b, (VoicePickerSharedContract.State) obj);
                return initialise$lambda$0;
        }
    }
}
