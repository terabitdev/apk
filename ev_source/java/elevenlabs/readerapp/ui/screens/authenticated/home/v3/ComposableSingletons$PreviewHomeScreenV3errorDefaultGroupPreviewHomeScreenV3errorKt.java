package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewHomeScreenV3errorDefaultGroupPreviewHomeScreenV3errorKt {
    public static final ComposableSingletons$PreviewHomeScreenV3errorDefaultGroupPreviewHomeScreenV3errorKt INSTANCE = new ComposableSingletons$PreviewHomeScreenV3errorDefaultGroupPreviewHomeScreenV3errorKt();
    private static ho.p lambda$1119465045 = new c3.j(new b(3), false, 1119465045);

    public static final z lambda_1119465045$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeScreenV3Kt.Preview_HomeScreenV3_error(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final ho.p getLambda$1119465045$app_productionRelease() {
        return lambda$1119465045;
    }
}
