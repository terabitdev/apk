package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class WriteViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f fileServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f showImportingContentToastProvider;
    private final ul.f toastServiceProvider;

    private WriteViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.fileServiceProvider = fVar4;
        this.loggerProvider = fVar5;
        this.analyticsProvider = fVar6;
        this.resolveErrorMessageUseCaseProvider = fVar7;
        this.showImportingContentToastProvider = fVar8;
    }

    public static WriteViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        return new WriteViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static WriteViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar, jl.a aVar2, FileService fileService, Logger logger, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar3) {
        return new WriteViewModel(dispatcherFactory, aVar, aVar2, fileService, logger, analytics, resolveErrorMessageUseCase, aVar3);
    }

    @Override // rn.a
    public WriteViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.readsServiceProvider), ul.b.a(this.toastServiceProvider), (FileService) this.fileServiceProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), ul.b.a(this.showImportingContentToastProvider));
    }
}
