package io.elevenlabs.ocr;

import android.content.Context;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OcrImportViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f contextProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f fileServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;
    private final ul.f recognizeDocumentTextUseCaseProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f toastServiceProvider;

    private OcrImportViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.fileServiceProvider = fVar4;
        this.toastServiceProvider = fVar5;
        this.loggerProvider = fVar6;
        this.resolveErrorMessageUseCaseProvider = fVar7;
        this.recognizeDocumentTextUseCaseProvider = fVar8;
        this.contextProvider = fVar9;
    }

    public static OcrImportViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        return new OcrImportViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
    }

    public static OcrImportViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar, Analytics analytics, FileService fileService, jl.a aVar2, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar3, Context context) {
        return new OcrImportViewModel(dispatcherFactory, aVar, analytics, fileService, aVar2, logger, resolveErrorMessageUseCase, aVar3, context);
    }

    @Override // rn.a
    public OcrImportViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.readsServiceProvider), (Analytics) this.analyticsProvider.get(), (FileService) this.fileServiceProvider.get(), ul.b.a(this.toastServiceProvider), (Logger) this.loggerProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), ul.b.a(this.recognizeDocumentTextUseCaseProvider), (Context) this.contextProvider.get());
    }
}
