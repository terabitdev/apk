package io.elevenlabs.payments;

import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.payments.InAppPurchasesService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService$3$1", f = "InAppPurchasesService.kt", l = {178, 192}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class InAppPurchasesService$3$1$emit$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppPurchasesService.AnonymousClass3.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InAppPurchasesService$3$1$emit$1(InAppPurchasesService.AnonymousClass3.AnonymousClass1<? super T> anonymousClass1, wn.c<? super InAppPurchasesService$3$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass1;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Customer) null, (wn.c<? super z>) this);
    }
}
