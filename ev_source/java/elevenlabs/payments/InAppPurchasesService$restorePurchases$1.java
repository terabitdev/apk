package io.elevenlabs.payments;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.payments.InAppPurchasesService", f = "InAppPurchasesService.kt", l = {200}, m = "restorePurchases", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class InAppPurchasesService$restorePurchases$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$restorePurchases$1(InAppPurchasesService inAppPurchasesService, wn.c<? super InAppPurchasesService$restorePurchases$1> cVar) {
        super(cVar);
        this.this$0 = inAppPurchasesService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.restorePurchases(this);
    }
}
