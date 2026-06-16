package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

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
public final class ComposableSingletons$PreviewPlayerAdditionalActionsPagerPageOneDefaultGroupPreviewPlayerAdditionalActionsPagerPageOneKt {
    public static final ComposableSingletons$PreviewPlayerAdditionalActionsPagerPageOneDefaultGroupPreviewPlayerAdditionalActionsPagerPageOneKt INSTANCE = new ComposableSingletons$PreviewPlayerAdditionalActionsPagerPageOneDefaultGroupPreviewPlayerAdditionalActionsPagerPageOneKt();

    /* renamed from: lambda$-554136166 */
    private static p f439lambda$554136166 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.a(16), false, -554136166);

    public static final z lambda__554136166$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerAdditionalActionsPagerKt.Preview_PlayerAdditionalActionsPager_PageOne(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-554136166$app_productionRelease */
    public final p m1506getLambda$554136166$app_productionRelease() {
        return f439lambda$554136166;
    }
}
