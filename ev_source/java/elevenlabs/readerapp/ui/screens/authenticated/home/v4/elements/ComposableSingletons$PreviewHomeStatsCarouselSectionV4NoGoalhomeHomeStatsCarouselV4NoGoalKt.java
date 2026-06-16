package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

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
public final class ComposableSingletons$PreviewHomeStatsCarouselSectionV4NoGoalhomeHomeStatsCarouselV4NoGoalKt {
    public static final ComposableSingletons$PreviewHomeStatsCarouselSectionV4NoGoalhomeHomeStatsCarouselV4NoGoalKt INSTANCE = new ComposableSingletons$PreviewHomeStatsCarouselSectionV4NoGoalhomeHomeStatsCarouselV4NoGoalKt();
    private static p lambda$602518313 = new j(new a(5), false, 602518313);

    public static final z lambda_602518313$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeStatsCarouselKt.Preview_HomeStatsCarouselSectionV4_NoGoal(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$602518313$app_productionRelease() {
        return lambda$602518313;
    }
}
