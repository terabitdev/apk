package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewPurchaseCreditsScreenPurchaseSuccessDefaultGroupPreviewPurchaseCreditsScreenPurchaseSuccessKt {
    public static final ComposableSingletons$PreviewPurchaseCreditsScreenPurchaseSuccessDefaultGroupPreviewPurchaseCreditsScreenPurchaseSuccessKt INSTANCE = new ComposableSingletons$PreviewPurchaseCreditsScreenPurchaseSuccessDefaultGroupPreviewPurchaseCreditsScreenPurchaseSuccessKt();
    private static p lambda$310587759 = new c3.j(new a(6), false, 310587759);

    public static final z lambda_310587759$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursScreenKt.Preview_PurchaseCreditsScreen_Purchase_Success(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$310587759$app_productionRelease() {
        return lambda$310587759;
    }
}
