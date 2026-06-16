package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewReadDetailsScreenaddedtoastDefaultGroupPreviewReadDetailsScreenaddedtoastKt {
    public static final ComposableSingletons$PreviewReadDetailsScreenaddedtoastDefaultGroupPreviewReadDetailsScreenaddedtoastKt INSTANCE = new ComposableSingletons$PreviewReadDetailsScreenaddedtoastDefaultGroupPreviewReadDetailsScreenaddedtoastKt();

    /* renamed from: lambda$-385046992 */
    private static ho.p f584lambda$385046992 = new c3.j(new a(0), false, -385046992);

    public static final sn.z lambda__385046992$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadDetailsScreenKt.Preview_ReadDetailsScreen_added_toast(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-385046992$app_productionRelease */
    public final ho.p m1695getLambda$385046992$app_productionRelease() {
        return f584lambda$385046992;
    }
}
