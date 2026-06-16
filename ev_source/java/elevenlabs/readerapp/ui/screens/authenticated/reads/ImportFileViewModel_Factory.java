package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ImportFileViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f fileServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f notificationPermissionServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f showImportingContentToastProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private ImportFileViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.loggerProvider = fVar3;
        this.fileServiceProvider = fVar4;
        this.analyticsProvider = fVar5;
        this.resolveErrorMessageUseCaseProvider = fVar6;
        this.showImportingContentToastProvider = fVar7;
        this.notificationPermissionServiceProvider = fVar8;
        this.toastServiceProvider = fVar9;
        this.stringProvider = fVar10;
    }

    public static ImportFileViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        return new ImportFileViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10);
    }

    public static ImportFileViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar, Logger logger, jl.a aVar2, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar3, NotificationPermissionService notificationPermissionService, jl.a aVar4, StringProvider stringProvider) {
        return new ImportFileViewModel(dispatcherFactory, aVar, logger, aVar2, analytics, resolveErrorMessageUseCase, aVar3, notificationPermissionService, aVar4, stringProvider);
    }

    @Override // rn.a
    public ImportFileViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.readsServiceProvider), (Logger) this.loggerProvider.get(), ul.b.a(this.fileServiceProvider), (Analytics) this.analyticsProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), ul.b.a(this.showImportingContentToastProvider), (NotificationPermissionService) this.notificationPermissionServiceProvider.get(), ul.b.a(this.toastServiceProvider), (StringProvider) this.stringProvider.get());
    }
}
