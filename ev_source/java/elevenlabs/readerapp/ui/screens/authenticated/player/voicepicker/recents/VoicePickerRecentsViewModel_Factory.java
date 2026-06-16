package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerRecentsViewModel_Factory implements c {
    private final f connectivityServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f recentVoicesServiceProvider;
    private final f sharedRepositoryProvider;

    private VoicePickerRecentsViewModel_Factory(f fVar, f fVar2, f fVar3, f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.connectivityServiceProvider = fVar2;
        this.sharedRepositoryProvider = fVar3;
        this.recentVoicesServiceProvider = fVar4;
    }

    public static VoicePickerRecentsViewModel_Factory create(f fVar, f fVar2, f fVar3, f fVar4) {
        return new VoicePickerRecentsViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static VoicePickerRecentsViewModel newInstance(DispatcherFactory dispatcherFactory, ConnectivityService connectivityService, VoicePickerSharedRepository voicePickerSharedRepository, RecentVoicesService recentVoicesService) {
        return new VoicePickerRecentsViewModel(dispatcherFactory, connectivityService, voicePickerSharedRepository, recentVoicesService);
    }

    @Override // rn.a
    public VoicePickerRecentsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (VoicePickerSharedRepository) this.sharedRepositoryProvider.get(), (RecentVoicesService) this.recentVoicesServiceProvider.get());
    }
}
