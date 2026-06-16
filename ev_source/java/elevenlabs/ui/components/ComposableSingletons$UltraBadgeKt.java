package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$UltraBadgeKt {
    public static final ComposableSingletons$UltraBadgeKt INSTANCE = new ComposableSingletons$UltraBadgeKt();
    private static ho.p lambda$1761754146 = new c3.j(new n0(22), false, 1761754146);

    public static final sn.z lambda_1761754146$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            UltraBadgeKt.UltraBadge(null, qVar, 0, 1);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1761754146$ui_release() {
        return lambda$1761754146;
    }
}
