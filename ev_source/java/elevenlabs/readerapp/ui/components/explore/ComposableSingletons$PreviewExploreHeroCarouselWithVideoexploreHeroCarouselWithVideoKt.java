package io.elevenlabs.readerapp.ui.components.explore;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewExploreHeroCarouselWithVideoexploreHeroCarouselWithVideoKt {
    public static final ComposableSingletons$PreviewExploreHeroCarouselWithVideoexploreHeroCarouselWithVideoKt INSTANCE = new ComposableSingletons$PreviewExploreHeroCarouselWithVideoexploreHeroCarouselWithVideoKt();
    private static ho.p lambda$420173796 = new c3.j(new c(24), false, 420173796);

    public static final z lambda_420173796$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreHeroCarouselKt.Preview_ExploreHeroCarousel_WithVideo(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final ho.p getLambda$420173796$app_productionRelease() {
        return lambda$420173796;
    }
}
