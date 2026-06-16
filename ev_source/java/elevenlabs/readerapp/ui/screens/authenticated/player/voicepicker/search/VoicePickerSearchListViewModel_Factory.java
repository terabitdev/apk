package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerSearchListViewModel_Factory implements ul.c {
    private final f communityVoicesServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f mapperProvider;
    private final f sharedRepositoryProvider;

    private VoicePickerSearchListViewModel_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.mapperProvider = fVar2;
        this.sharedRepositoryProvider = fVar3;
        this.communityVoicesServiceProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static VoicePickerSearchListViewModel_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        return new VoicePickerSearchListViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static VoicePickerSearchListViewModel newInstance(DispatcherFactory dispatcherFactory, VoicePickerSearchListStateMapper voicePickerSearchListStateMapper, VoicePickerSharedRepository voicePickerSharedRepository, CommunityVoicesService communityVoicesService, Logger logger) {
        return new VoicePickerSearchListViewModel(dispatcherFactory, voicePickerSearchListStateMapper, voicePickerSharedRepository, communityVoicesService, logger);
    }

    @Override // rn.a
    public VoicePickerSearchListViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (VoicePickerSearchListStateMapper) this.mapperProvider.get(), (VoicePickerSharedRepository) this.sharedRepositoryProvider.get(), (CommunityVoicesService) this.communityVoicesServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
