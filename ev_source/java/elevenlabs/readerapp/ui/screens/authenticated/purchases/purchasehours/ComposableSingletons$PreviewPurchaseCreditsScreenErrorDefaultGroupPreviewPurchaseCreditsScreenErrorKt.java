package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewPurchaseCreditsScreenErrorDefaultGroupPreviewPurchaseCreditsScreenErrorKt {
    public static final ComposableSingletons$PreviewPurchaseCreditsScreenErrorDefaultGroupPreviewPurchaseCreditsScreenErrorKt INSTANCE = new ComposableSingletons$PreviewPurchaseCreditsScreenErrorDefaultGroupPreviewPurchaseCreditsScreenErrorKt();

    /* renamed from: lambda$-1244731921 */
    private static p f556lambda$1244731921 = new c3.j(new a(2), false, -1244731921);

    public static final z lambda__1244731921$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursScreenKt.Preview_PurchaseCreditsScreen_Error(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1244731921$app_productionRelease */
    public final p m1663getLambda$1244731921$app_productionRelease() {
        return f556lambda$1244731921;
    }
}
