package io.elevenlabs.readerapp.ui.components.explore;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewExploreReadCardPaidAEDexploreReadCardPaidAEDKt {
    public static final ComposableSingletons$PreviewExploreReadCardPaidAEDexploreReadCardPaidAEDKt INSTANCE = new ComposableSingletons$PreviewExploreReadCardPaidAEDexploreReadCardPaidAEDKt();
    private static ho.p lambda$134685348 = new c3.j(new d(1), false, 134685348);

    public static final z lambda_134685348$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreReadCardKt.Preview_ExploreReadCard_Paid_AED(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final ho.p getLambda$134685348$app_productionRelease() {
        return lambda$134685348;
    }
}
