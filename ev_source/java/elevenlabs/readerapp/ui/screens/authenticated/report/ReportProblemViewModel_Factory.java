package io.elevenlabs.readerapp.ui.screens.authenticated.report;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ReportProblemViewModel_Factory implements ul.c {
    private final f appConfigServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f resolveErrorMessageUseCaseProvider;

    private ReportProblemViewModel_Factory(f fVar, f fVar2, f fVar3, f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.appConfigServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.loggerProvider = fVar4;
    }

    public static ReportProblemViewModel_Factory create(f fVar, f fVar2, f fVar3, f fVar4) {
        return new ReportProblemViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static ReportProblemViewModel newInstance(DispatcherFactory dispatcherFactory, AppConfigService appConfigService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        return new ReportProblemViewModel(dispatcherFactory, appConfigService, resolveErrorMessageUseCase, logger);
    }

    @Override // rn.a
    public ReportProblemViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (AppConfigService) this.appConfigServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Logger) this.loggerProvider.get());
    }
}
