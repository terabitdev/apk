package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerCollectionViewModel_Factory_Impl implements VoicePickerCollectionViewModel.Factory {
    private final C0058VoicePickerCollectionViewModel_Factory delegateFactory;

    public VoicePickerCollectionViewModel_Factory_Impl(C0058VoicePickerCollectionViewModel_Factory c0058VoicePickerCollectionViewModel_Factory) {
        this.delegateFactory = c0058VoicePickerCollectionViewModel_Factory;
    }

    public static rn.a create(C0058VoicePickerCollectionViewModel_Factory c0058VoicePickerCollectionViewModel_Factory) {
        return ul.d.a(new VoicePickerCollectionViewModel_Factory_Impl(c0058VoicePickerCollectionViewModel_Factory));
    }

    public static f createFactoryProvider(C0058VoicePickerCollectionViewModel_Factory c0058VoicePickerCollectionViewModel_Factory) {
        return ul.d.a(new VoicePickerCollectionViewModel_Factory_Impl(c0058VoicePickerCollectionViewModel_Factory));
    }

    @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel.Factory
    public VoicePickerCollectionViewModel create(VoicePickerCollectionRoute voicePickerCollectionRoute) {
        return this.delegateFactory.get(voicePickerCollectionRoute);
    }
}
