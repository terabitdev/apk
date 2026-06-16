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
public final class ComposableSingletons$PreviewHomeAccountButtonV4FreehomeHomeAccountButtonV4FreeKt {
    public static final ComposableSingletons$PreviewHomeAccountButtonV4FreehomeHomeAccountButtonV4FreeKt INSTANCE = new ComposableSingletons$PreviewHomeAccountButtonV4FreehomeHomeAccountButtonV4FreeKt();

    /* renamed from: lambda$-1563091641 */
    private static p f384lambda$1563091641 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.b(26), false, -1563091641);

    public static final z lambda__1563091641$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HomeAccountButtonKt.Preview_HomeAccountButtonV4_Free(qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1563091641$app_productionRelease */
    public final p m1435getLambda$1563091641$app_productionRelease() {
        return f384lambda$1563091641;
    }
}
