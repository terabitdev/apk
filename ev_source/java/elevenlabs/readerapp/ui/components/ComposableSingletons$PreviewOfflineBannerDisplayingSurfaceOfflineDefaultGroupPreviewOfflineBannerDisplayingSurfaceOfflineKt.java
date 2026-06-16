package io.elevenlabs.readerapp.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewOfflineBannerDisplayingSurfaceOfflineDefaultGroupPreviewOfflineBannerDisplayingSurfaceOfflineKt {
    public static final ComposableSingletons$PreviewOfflineBannerDisplayingSurfaceOfflineDefaultGroupPreviewOfflineBannerDisplayingSurfaceOfflineKt INSTANCE = new ComposableSingletons$PreviewOfflineBannerDisplayingSurfaceOfflineDefaultGroupPreviewOfflineBannerDisplayingSurfaceOfflineKt();

    /* renamed from: lambda$-785316663 */
    private static ho.p f78lambda$785316663 = new c3.j(new m(12), false, -785316663);

    public static final sn.z lambda__785316663$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            OfflineBannerDisplayingSurfaceKt.Preview_OfflineBannerDisplayingSurface_Offline(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-785316663$app_productionRelease */
    public final ho.p m1053getLambda$785316663$app_productionRelease() {
        return f78lambda$785316663;
    }
}
