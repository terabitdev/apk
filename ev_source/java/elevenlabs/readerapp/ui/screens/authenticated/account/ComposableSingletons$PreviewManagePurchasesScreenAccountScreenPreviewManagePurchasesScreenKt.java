package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewManagePurchasesScreenAccountScreenPreviewManagePurchasesScreenKt {
    public static final ComposableSingletons$PreviewManagePurchasesScreenAccountScreenPreviewManagePurchasesScreenKt INSTANCE = new ComposableSingletons$PreviewManagePurchasesScreenAccountScreenPreviewManagePurchasesScreenKt();

    /* renamed from: lambda$-556438818 */
    private static ho.p f208lambda$556438818 = new c3.j(new l(14), false, -556438818);

    public static final z lambda__556438818$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ManagePurchasesScreenKt.Preview_ManagePurchasesScreen(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-556438818$app_productionRelease */
    public final ho.p m1230getLambda$556438818$app_productionRelease() {
        return f208lambda$556438818;
    }
}
