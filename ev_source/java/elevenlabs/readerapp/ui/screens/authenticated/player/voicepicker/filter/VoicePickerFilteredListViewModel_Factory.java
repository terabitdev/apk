package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerFilteredListViewModel_Factory implements ul.c {
    private final ul.f communityVoicesServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f sharedRepositoryProvider;

    private VoicePickerFilteredListViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.sharedRepositoryProvider = fVar2;
        this.communityVoicesServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static VoicePickerFilteredListViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new VoicePickerFilteredListViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static VoicePickerFilteredListViewModel newInstance(DispatcherFactory dispatcherFactory, VoicePickerSharedRepository voicePickerSharedRepository, CommunityVoicesService communityVoicesService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        return new VoicePickerFilteredListViewModel(dispatcherFactory, voicePickerSharedRepository, communityVoicesService, resolveErrorMessageUseCase, logger);
    }

    @Override // rn.a
    public VoicePickerFilteredListViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (VoicePickerSharedRepository) this.sharedRepositoryProvider.get(), (CommunityVoicesService) this.communityVoicesServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Logger) this.loggerProvider.get());
    }
}
