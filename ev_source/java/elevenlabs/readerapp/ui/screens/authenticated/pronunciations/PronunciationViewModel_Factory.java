package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PronunciationViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f playPronunciationPreviewUseCaseProvider;
    private final ul.f pronunciationsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private PronunciationViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        this.pronunciationsServiceProvider = fVar;
        this.resolveErrorMessageUseCaseProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.stringProvider = fVar4;
        this.loggerProvider = fVar5;
        this.playPronunciationPreviewUseCaseProvider = fVar6;
        this.analyticsProvider = fVar7;
        this.dispatcherFactoryProvider = fVar8;
    }

    public static PronunciationViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        return new PronunciationViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static PronunciationViewModel newInstance(PronunciationsService pronunciationsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, StringProvider stringProvider, Logger logger, PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase, Analytics analytics, DispatcherFactory dispatcherFactory) {
        return new PronunciationViewModel(pronunciationsService, resolveErrorMessageUseCase, toastService, stringProvider, logger, playPronunciationPreviewUseCase, analytics, dispatcherFactory);
    }

    @Override // rn.a
    public PronunciationViewModel get() {
        return newInstance((PronunciationsService) this.pronunciationsServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get(), (Logger) this.loggerProvider.get(), (PlayPronunciationPreviewUseCase) this.playPronunciationPreviewUseCaseProvider.get(), (Analytics) this.analyticsProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
