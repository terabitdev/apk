package io.elevenlabs.readerapp.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PreviewExpiryBadgeDefaultGroupPreviewExpiryBadgeKt {
    public static final ComposableSingletons$PreviewExpiryBadgeDefaultGroupPreviewExpiryBadgeKt INSTANCE = new ComposableSingletons$PreviewExpiryBadgeDefaultGroupPreviewExpiryBadgeKt();

    /* renamed from: lambda$-2088793315 */
    private static ho.p f71lambda$2088793315 = new c3.j(new m(0), false, -2088793315);

    public static final sn.z lambda__2088793315$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExpiryBadgeKt.Preview_ExpiryBadge(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-2088793315$app_productionRelease */
    public final ho.p m1046getLambda$2088793315$app_productionRelease() {
        return f71lambda$2088793315;
    }
}
