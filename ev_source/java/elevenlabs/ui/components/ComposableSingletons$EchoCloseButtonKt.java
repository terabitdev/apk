package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$EchoCloseButtonKt {
    public static final ComposableSingletons$EchoCloseButtonKt INSTANCE = new ComposableSingletons$EchoCloseButtonKt();
    private static ho.p lambda$1431831837 = new c3.j(new j(11), false, 1431831837);

    public static final sn.z lambda_1431831837$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            q2.y2.a(kd.a.M(R.drawable.close_rounded, qVar, 0), kj.c.R(qVar, R.string.accessibility_bottom_sheet_dialog_close), r1.p2.o(i3.q.f13017a, 20), 0L, qVar, u3.c.$stable | 384, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1431831837$ui_release() {
        return lambda$1431831837;
    }
}
