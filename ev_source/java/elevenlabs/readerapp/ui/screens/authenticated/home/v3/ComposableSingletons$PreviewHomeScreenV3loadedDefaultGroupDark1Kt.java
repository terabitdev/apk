package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewHomeScreenV3loadedDefaultGroupDark1Kt {
    public static final ComposableSingletons$PreviewHomeScreenV3loadedDefaultGroupDark1Kt INSTANCE = new ComposableSingletons$PreviewHomeScreenV3loadedDefaultGroupDark1Kt();
    private static ho.p lambda$2014519253 = new c3.j(new b(5), false, 2014519253);

    public static final z lambda_2014519253$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeScreenV3Kt.Preview_HomeScreenV3_loaded(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final ho.p getLambda$2014519253$app_productionRelease() {
        return lambda$2014519253;
    }
}
