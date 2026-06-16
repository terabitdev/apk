package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ExploreVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0058VoicePickerCollectionViewModel_Factory {
    private final f connectivityServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f serviceProvider;
    private final f sharedRepositoryProvider;

    private C0058VoicePickerCollectionViewModel_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.loggerProvider = fVar2;
        this.sharedRepositoryProvider = fVar3;
        this.serviceProvider = fVar4;
        this.connectivityServiceProvider = fVar5;
    }

    public static C0058VoicePickerCollectionViewModel_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        return new C0058VoicePickerCollectionViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static VoicePickerCollectionViewModel newInstance(DispatcherFactory dispatcherFactory, VoicePickerCollectionRoute voicePickerCollectionRoute, Logger logger, VoicePickerSharedRepository voicePickerSharedRepository, ExploreVoicesService exploreVoicesService, ConnectivityService connectivityService) {
        return new VoicePickerCollectionViewModel(dispatcherFactory, voicePickerCollectionRoute, logger, voicePickerSharedRepository, exploreVoicesService, connectivityService);
    }

    public VoicePickerCollectionViewModel get(VoicePickerCollectionRoute voicePickerCollectionRoute) {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), voicePickerCollectionRoute, (Logger) this.loggerProvider.get(), (VoicePickerSharedRepository) this.sharedRepositoryProvider.get(), (ExploreVoicesService) this.serviceProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get());
    }
}
