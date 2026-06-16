package io.elevenlabs.readerapp.usecase;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PlayPronunciationPreviewUseCaseImpl_Factory implements c {
    private final f audioPreviewServiceProvider;
    private final f loggerProvider;
    private final f pronunciationsServiceProvider;
    private final f resolveErrorMessageUseCaseProvider;
    private final f toastServiceProvider;

    private PlayPronunciationPreviewUseCaseImpl_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        this.pronunciationsServiceProvider = fVar;
        this.audioPreviewServiceProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static PlayPronunciationPreviewUseCaseImpl_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        return new PlayPronunciationPreviewUseCaseImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static PlayPronunciationPreviewUseCaseImpl newInstance(PronunciationsService pronunciationsService, AudioPreviewService audioPreviewService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        return new PlayPronunciationPreviewUseCaseImpl(pronunciationsService, audioPreviewService, toastService, resolveErrorMessageUseCase, logger);
    }

    @Override // rn.a
    public PlayPronunciationPreviewUseCaseImpl get() {
        return newInstance((PronunciationsService) this.pronunciationsServiceProvider.get(), (AudioPreviewService) this.audioPreviewServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Logger) this.loggerProvider.get());
    }
}
