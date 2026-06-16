package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreviewContentInterestGridItemcomponentsContentInterestGridItemKt {
    public static final ComposableSingletons$PreviewContentInterestGridItemcomponentsContentInterestGridItemKt INSTANCE = new ComposableSingletons$PreviewContentInterestGridItemcomponentsContentInterestGridItemKt();
    private static p lambda$931224326 = new c3.j(new h(8), false, 931224326);

    public static final z lambda_931224326$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ContentInterestGridItemKt.Preview_ContentInterestGridItem(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$931224326$app_productionRelease() {
        return lambda$931224326;
    }
}
