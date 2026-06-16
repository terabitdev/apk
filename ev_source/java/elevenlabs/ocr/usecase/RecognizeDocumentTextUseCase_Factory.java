package io.elevenlabs.ocr.usecase;

import io.elevenlabs.domain.Configuration;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RecognizeDocumentTextUseCase_Factory implements c {
    private final f configurationProvider;

    private RecognizeDocumentTextUseCase_Factory(f fVar) {
        this.configurationProvider = fVar;
    }

    public static RecognizeDocumentTextUseCase_Factory create(f fVar) {
        return new RecognizeDocumentTextUseCase_Factory(fVar);
    }

    public static RecognizeDocumentTextUseCase newInstance(Configuration configuration) {
        return new RecognizeDocumentTextUseCase(configuration);
    }

    @Override // rn.a
    public RecognizeDocumentTextUseCase get() {
        return newInstance((Configuration) this.configurationProvider.get());
    }
}
