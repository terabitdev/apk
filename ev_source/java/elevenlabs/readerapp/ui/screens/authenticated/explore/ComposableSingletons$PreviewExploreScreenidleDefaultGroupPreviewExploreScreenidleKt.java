package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewExploreScreenidleDefaultGroupPreviewExploreScreenidleKt {
    public static final ComposableSingletons$PreviewExploreScreenidleDefaultGroupPreviewExploreScreenidleKt INSTANCE = new ComposableSingletons$PreviewExploreScreenidleDefaultGroupPreviewExploreScreenidleKt();

    /* renamed from: lambda$-1405636914 */
    private static ho.p f323lambda$1405636914 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.author.o(26), false, -1405636914);

    public static final z lambda__1405636914$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreScreenKt.Preview_ExploreScreen_idle(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1405636914$app_productionRelease */
    public final ho.p m1368getLambda$1405636914$app_productionRelease() {
        return f323lambda$1405636914;
    }
}
