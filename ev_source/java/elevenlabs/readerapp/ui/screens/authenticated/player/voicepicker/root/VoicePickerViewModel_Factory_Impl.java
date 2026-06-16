package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerViewModel_Factory_Impl implements VoicePickerViewModel.Factory {
    private final C0059VoicePickerViewModel_Factory delegateFactory;

    public VoicePickerViewModel_Factory_Impl(C0059VoicePickerViewModel_Factory c0059VoicePickerViewModel_Factory) {
        this.delegateFactory = c0059VoicePickerViewModel_Factory;
    }

    public static rn.a create(C0059VoicePickerViewModel_Factory c0059VoicePickerViewModel_Factory) {
        return ul.d.a(new VoicePickerViewModel_Factory_Impl(c0059VoicePickerViewModel_Factory));
    }

    public static ul.f createFactoryProvider(C0059VoicePickerViewModel_Factory c0059VoicePickerViewModel_Factory) {
        return ul.d.a(new VoicePickerViewModel_Factory_Impl(c0059VoicePickerViewModel_Factory));
    }

    @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel.Factory
    public VoicePickerViewModel create(VoicePickerMode voicePickerMode) {
        return this.delegateFactory.get(voicePickerMode);
    }
}
