package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewExploreErrorStateDefaultGroupPreviewExploreErrorStateKt {
    public static final ComposableSingletons$PreviewExploreErrorStateDefaultGroupPreviewExploreErrorStateKt INSTANCE = new ComposableSingletons$PreviewExploreErrorStateDefaultGroupPreviewExploreErrorStateKt();

    /* renamed from: lambda$-1686226674 */
    private static ho.p f320lambda$1686226674 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.author.o(23), false, -1686226674);

    public static final z lambda__1686226674$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreScreenKt.Preview_ExploreErrorState(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1686226674$app_productionRelease */
    public final ho.p m1365getLambda$1686226674$app_productionRelease() {
        return f320lambda$1686226674;
    }
}
