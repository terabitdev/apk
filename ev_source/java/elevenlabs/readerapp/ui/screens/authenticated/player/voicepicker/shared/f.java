package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16520b;

    public /* synthetic */ f(String str, int i10) {
        this.f16519a = i10;
        this.f16520b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoicePickerSharedContract.State deleteVoice$lambda$0;
        VoicePickerSharedContract.State favoritesAction$lambda$0;
        switch (this.f16519a) {
            case 0:
                return VoicePickerSharedRepository$deleteVoice$1.d(this.f16520b, (VoicePickerSharedContract.State) obj);
            case 1:
                return VoicePickerSharedRepository$favoritesAction$1.d(this.f16520b, (VoicePickerSharedContract.State) obj);
            case 2:
                deleteVoice$lambda$0 = VoicePickerSharedRepository.deleteVoice$lambda$0(this.f16520b, (VoicePickerSharedContract.State) obj);
                return deleteVoice$lambda$0;
            default:
                favoritesAction$lambda$0 = VoicePickerSharedRepository.favoritesAction$lambda$0(this.f16520b, (VoicePickerSharedContract.State) obj);
                return favoritesAction$lambda$0;
        }
    }
}
