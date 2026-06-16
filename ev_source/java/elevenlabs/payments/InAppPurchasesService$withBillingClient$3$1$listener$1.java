package io.elevenlabs.payments;

import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class InAppPurchasesService$withBillingClient$3$1$listener$1 extends j implements l {
    final /* synthetic */ fr.l $continuation;
    final /* synthetic */ InAppPurchasesService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchasesService$withBillingClient$3$1$listener$1(InAppPurchasesService inAppPurchasesService, fr.l lVar) {
        super(1, kotlin.jvm.internal.l.class, "send", "invokeSuspend$send(Lio/elevenlabs/payments/InAppPurchasesService;Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;)V", 0);
        this.this$0 = inAppPurchasesService;
        this.$continuation = lVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m989invoke(T t10) {
        InAppPurchasesService$withBillingClient$3$1.invokeSuspend$send(this.this$0, this.$continuation, t10);
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m989invoke((InAppPurchasesService$withBillingClient$3$1$listener$1) obj);
        return z.f31622a;
    }
}
