package io.elevenlabs.data.services;

import io.elevenlabs.data.services.ReadsServiceImpl$prepareOptimizedRead$2;
import io.elevenlabs.domain.model.FileDownloadState;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$prepareOptimizedRead$2$1", f = "ReadsServiceImpl.kt", l = {341, 343, 344}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$prepareOptimizedRead$2$1$emit$1 extends yn.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReadsServiceImpl$prepareOptimizedRead$2.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReadsServiceImpl$prepareOptimizedRead$2$1$emit$1(ReadsServiceImpl$prepareOptimizedRead$2.AnonymousClass1<? super T> anonymousClass1, wn.c<? super ReadsServiceImpl$prepareOptimizedRead$2$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass1;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((FileDownloadState) null, (wn.c<? super z>) this);
    }
}
