package io.elevenlabs.readerapp.ui.components.explore;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewExploreReadCardNoStatsexploreReadCardNostatsKt {
    public static final ComposableSingletons$PreviewExploreReadCardNoStatsexploreReadCardNostatsKt INSTANCE = new ComposableSingletons$PreviewExploreReadCardNoStatsexploreReadCardNostatsKt();

    /* renamed from: lambda$-1695220956 */
    private static ho.p f151lambda$1695220956 = new c3.j(new d(0), false, -1695220956);

    public static final z lambda__1695220956$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreReadCardKt.Preview_ExploreReadCard_NoStats(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1695220956$app_productionRelease */
    public final ho.p m1153getLambda$1695220956$app_productionRelease() {
        return f151lambda$1695220956;
    }
}
