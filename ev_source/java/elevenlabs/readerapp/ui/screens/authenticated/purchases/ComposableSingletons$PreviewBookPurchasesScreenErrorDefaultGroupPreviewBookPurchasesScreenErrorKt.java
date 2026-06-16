package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewBookPurchasesScreenErrorDefaultGroupPreviewBookPurchasesScreenErrorKt {
    public static final ComposableSingletons$PreviewBookPurchasesScreenErrorDefaultGroupPreviewBookPurchasesScreenErrorKt INSTANCE = new ComposableSingletons$PreviewBookPurchasesScreenErrorDefaultGroupPreviewBookPurchasesScreenErrorKt();

    /* renamed from: lambda$-861446481 */
    private static ho.p f530lambda$861446481 = new c3.j(new m(0), false, -861446481);

    public static final sn.z lambda__861446481$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BookPurchasesScreenKt.Preview_BookPurchasesScreen_Error(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-861446481$app_productionRelease */
    public final ho.p m1635getLambda$861446481$app_productionRelease() {
        return f530lambda$861446481;
    }
}
