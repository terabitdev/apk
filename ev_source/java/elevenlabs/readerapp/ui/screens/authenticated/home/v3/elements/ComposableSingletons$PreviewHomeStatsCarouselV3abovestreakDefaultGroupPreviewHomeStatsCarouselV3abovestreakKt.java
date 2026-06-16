package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import c3.j;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewHomeStatsCarouselV3abovestreakDefaultGroupPreviewHomeStatsCarouselV3abovestreakKt {
    public static final ComposableSingletons$PreviewHomeStatsCarouselV3abovestreakDefaultGroupPreviewHomeStatsCarouselV3abovestreakKt INSTANCE = new ComposableSingletons$PreviewHomeStatsCarouselV3abovestreakDefaultGroupPreviewHomeStatsCarouselV3abovestreakKt();

    /* renamed from: lambda$-409483380 */
    private static p f366lambda$409483380 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.d(25), false, -409483380);

    public static final z lambda__409483380$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeStatsCarouselKt.Preview_HomeStatsCarouselV3_above_streak(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-409483380$app_productionRelease */
    public final p m1417getLambda$409483380$app_productionRelease() {
        return f366lambda$409483380;
    }
}
