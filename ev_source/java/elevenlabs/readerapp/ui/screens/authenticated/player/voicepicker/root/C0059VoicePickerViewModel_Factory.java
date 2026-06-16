package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0059VoicePickerViewModel_Factory {
    private final ul.f analyticsProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f sharedRepositoryProvider;
    private final ul.f toastServiceProvider;
    private final ul.f voicesServiceProvider;

    private C0059VoicePickerViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        this.dispatcherFactoryProvider = fVar;
        this.sharedRepositoryProvider = fVar2;
        this.voicesServiceProvider = fVar3;
        this.readsServiceProvider = fVar4;
        this.toastServiceProvider = fVar5;
        this.resolveErrorMessageUseCaseProvider = fVar6;
        this.analyticsProvider = fVar7;
        this.connectivityServiceProvider = fVar8;
        this.loggerProvider = fVar9;
    }

    public static C0059VoicePickerViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        return new C0059VoicePickerViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
    }

    public static VoicePickerViewModel newInstance(DispatcherFactory dispatcherFactory, VoicePickerSharedRepository voicePickerSharedRepository, VoicesService voicesService, ReadsService readsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics, ConnectivityService connectivityService, Logger logger, VoicePickerMode voicePickerMode) {
        return new VoicePickerViewModel(dispatcherFactory, voicePickerSharedRepository, voicesService, readsService, toastService, resolveErrorMessageUseCase, analytics, connectivityService, logger, voicePickerMode);
    }

    public VoicePickerViewModel get(VoicePickerMode voicePickerMode) {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (VoicePickerSharedRepository) this.sharedRepositoryProvider.get(), (VoicesService) this.voicesServiceProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Analytics) this.analyticsProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (Logger) this.loggerProvider.get(), voicePickerMode);
    }
}
