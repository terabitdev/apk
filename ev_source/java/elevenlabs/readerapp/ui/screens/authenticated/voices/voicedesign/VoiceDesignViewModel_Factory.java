package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoiceDesignService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoiceDesignViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f resolveErrorMessageProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;
    private final ul.f voiceDesignAudioStorageProvider;
    private final ul.f voiceDesignServiceProvider;
    private final ul.f voicesServiceProvider;

    private VoiceDesignViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11) {
        this.dispatcherFactoryProvider = fVar;
        this.voiceDesignServiceProvider = fVar2;
        this.voicesServiceProvider = fVar3;
        this.audioPreviewServiceProvider = fVar4;
        this.analyticsProvider = fVar5;
        this.loggerProvider = fVar6;
        this.stringProvider = fVar7;
        this.resolveErrorMessageProvider = fVar8;
        this.voiceDesignAudioStorageProvider = fVar9;
        this.toastServiceProvider = fVar10;
        this.customerServiceProvider = fVar11;
    }

    public static VoiceDesignViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11) {
        return new VoiceDesignViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11);
    }

    public static VoiceDesignViewModel newInstance(DispatcherFactory dispatcherFactory, VoiceDesignService voiceDesignService, VoicesService voicesService, AudioPreviewService audioPreviewService, Analytics analytics, Logger logger, StringProvider stringProvider, ResolveErrorMessageUseCase resolveErrorMessageUseCase, VoiceDesignAudioStorage voiceDesignAudioStorage, ToastService toastService, CustomerService customerService) {
        return new VoiceDesignViewModel(dispatcherFactory, voiceDesignService, voicesService, audioPreviewService, analytics, logger, stringProvider, resolveErrorMessageUseCase, voiceDesignAudioStorage, toastService, customerService);
    }

    @Override // rn.a
    public VoiceDesignViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (VoiceDesignService) this.voiceDesignServiceProvider.get(), (VoicesService) this.voicesServiceProvider.get(), (AudioPreviewService) this.audioPreviewServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get(), (StringProvider) this.stringProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageProvider.get(), (VoiceDesignAudioStorage) this.voiceDesignAudioStorageProvider.get(), (ToastService) this.toastServiceProvider.get(), (CustomerService) this.customerServiceProvider.get());
    }
}
