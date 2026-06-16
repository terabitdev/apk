package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

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
public final class ComposableSingletons$PreviewExploreLanguageSettingScreenAccountScreenExploreLanguageSettingDefaultKt {
    public static final ComposableSingletons$PreviewExploreLanguageSettingScreenAccountScreenExploreLanguageSettingDefaultKt INSTANCE = new ComposableSingletons$PreviewExploreLanguageSettingScreenAccountScreenExploreLanguageSettingDefaultKt();

    /* renamed from: lambda$-1567546371 */
    private static p f224lambda$1567546371 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h(12), false, -1567546371);

    public static final z lambda__1567546371$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreLanguageSettingScreenKt.Preview_ExploreLanguageSettingScreen(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1567546371$app_productionRelease */
    public final p m1258getLambda$1567546371$app_productionRelease() {
        return f224lambda$1567546371;
    }
}
