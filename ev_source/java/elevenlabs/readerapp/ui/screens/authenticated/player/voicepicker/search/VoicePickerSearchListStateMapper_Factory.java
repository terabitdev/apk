package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import io.elevenlabs.domain.StringProvider;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerSearchListStateMapper_Factory implements ul.c {
    private final f stringProvider;

    private VoicePickerSearchListStateMapper_Factory(f fVar) {
        this.stringProvider = fVar;
    }

    public static VoicePickerSearchListStateMapper_Factory create(f fVar) {
        return new VoicePickerSearchListStateMapper_Factory(fVar);
    }

    public static VoicePickerSearchListStateMapper newInstance(StringProvider stringProvider) {
        return new VoicePickerSearchListStateMapper(stringProvider);
    }

    @Override // rn.a
    public VoicePickerSearchListStateMapper get() {
        return newInstance((StringProvider) this.stringProvider.get());
    }
}
