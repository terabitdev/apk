package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

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
public final class ComposableSingletons$PreviewMiniPlayerVisiblePlayingDefaultGroupPreviewMiniPlayerVisiblePlayingKt {
    public static final ComposableSingletons$PreviewMiniPlayerVisiblePlayingDefaultGroupPreviewMiniPlayerVisiblePlayingKt INSTANCE = new ComposableSingletons$PreviewMiniPlayerVisiblePlayingDefaultGroupPreviewMiniPlayerVisiblePlayingKt();
    private static p lambda$872598077 = new j(new a(1), false, 872598077);

    public static final z lambda_872598077$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MiniPlayerKt.Preview_MiniPlayer_Visible_Playing(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$872598077$app_productionRelease() {
        return lambda$872598077;
    }
}
