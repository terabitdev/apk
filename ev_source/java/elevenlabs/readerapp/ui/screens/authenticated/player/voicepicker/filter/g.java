package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Success f16414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16415d;

    public /* synthetic */ g(boolean z6, AsyncCallResult.Success success, int i10, int i11) {
        this.f16412a = i11;
        this.f16413b = z6;
        this.f16414c = success;
        this.f16415d = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        VoicePickerFilteredListContract.State loadVoices$lambda$3;
        VoicePickerSearchListContract.State loadVoices$lambda$32;
        switch (this.f16412a) {
            case 0:
                loadVoices$lambda$3 = VoicePickerFilteredListViewModel.loadVoices$lambda$3(this.f16413b, this.f16414c, this.f16415d, (VoicePickerFilteredListContract.State) obj);
                return loadVoices$lambda$3;
            default:
                loadVoices$lambda$32 = VoicePickerSearchListViewModel.loadVoices$lambda$3(this.f16413b, this.f16414c, this.f16415d, (VoicePickerSearchListContract.State) obj);
                return loadVoices$lambda$32;
        }
    }
}
