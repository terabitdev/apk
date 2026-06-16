package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerExploreStateMapper_Factory implements ul.c {
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;

    private VoicePickerExploreStateMapper_Factory(ul.f fVar, ul.f fVar2) {
        this.stringProvider = fVar;
        this.resolveErrorMessageUseCaseProvider = fVar2;
    }

    public static VoicePickerExploreStateMapper_Factory create(ul.f fVar, ul.f fVar2) {
        return new VoicePickerExploreStateMapper_Factory(fVar, fVar2);
    }

    public static VoicePickerExploreStateMapper newInstance(StringProvider stringProvider, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        return new VoicePickerExploreStateMapper(stringProvider, resolveErrorMessageUseCase);
    }

    @Override // rn.a
    public VoicePickerExploreStateMapper get() {
        return newInstance((StringProvider) this.stringProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get());
    }
}
