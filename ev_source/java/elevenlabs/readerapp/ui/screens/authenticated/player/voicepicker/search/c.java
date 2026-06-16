package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import ho.l;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$actualiseVoices$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel$handleSearchQueryChanges$1;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f16493b;

    public /* synthetic */ c(Serializable serializable, int i10) {
        this.f16492a = i10;
        this.f16493b = serializable;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16492a) {
            case 0:
                return VoicePickerSearchListViewModel$actualiseVoices$1.AnonymousClass4.a((LinkedHashMap) this.f16493b, (VoicePickerSearchListContract.State) obj);
            default:
                return Boolean.valueOf(VoicePickerSearchListViewModel$handleSearchQueryChanges$1.AnonymousClass5.a((String) this.f16493b, (Voice) obj));
        }
    }
}
