package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ExploreVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerExploreViewModel_Factory implements ul.c {
    private final ul.f communityVoicesServiceProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f exploreVoicesServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f mapperProvider;
    private final ul.f sharedRepositoryProvider;

    private VoicePickerExploreViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.dispatcherFactoryProvider = fVar;
        this.loggerProvider = fVar2;
        this.mapperProvider = fVar3;
        this.sharedRepositoryProvider = fVar4;
        this.connectivityServiceProvider = fVar5;
        this.exploreVoicesServiceProvider = fVar6;
        this.communityVoicesServiceProvider = fVar7;
    }

    public static VoicePickerExploreViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new VoicePickerExploreViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static VoicePickerExploreViewModel newInstance(DispatcherFactory dispatcherFactory, Logger logger, VoicePickerExploreStateMapper voicePickerExploreStateMapper, VoicePickerSharedRepository voicePickerSharedRepository, ConnectivityService connectivityService, ExploreVoicesService exploreVoicesService, CommunityVoicesService communityVoicesService) {
        return new VoicePickerExploreViewModel(dispatcherFactory, logger, voicePickerExploreStateMapper, voicePickerSharedRepository, connectivityService, exploreVoicesService, communityVoicesService);
    }

    @Override // rn.a
    public VoicePickerExploreViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (VoicePickerExploreStateMapper) this.mapperProvider.get(), (VoicePickerSharedRepository) this.sharedRepositoryProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (ExploreVoicesService) this.exploreVoicesServiceProvider.get(), (CommunityVoicesService) this.communityVoicesServiceProvider.get());
    }
}
