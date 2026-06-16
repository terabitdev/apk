package io.elevenlabs.ocr.usecase;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ocr.usecase.RecognizeDocumentTextUseCase", f = "RecognizeDocumentTextUseCase.kt", l = {28}, m = "invoke", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RecognizeDocumentTextUseCase$invoke$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecognizeDocumentTextUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognizeDocumentTextUseCase$invoke$1(RecognizeDocumentTextUseCase recognizeDocumentTextUseCase, wn.c<? super RecognizeDocumentTextUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = recognizeDocumentTextUseCase;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
