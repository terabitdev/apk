package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.ui.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayerFloatingBottomControlsKt {
    public static final ComposableSingletons$PlayerFloatingBottomControlsKt INSTANCE = new ComposableSingletons$PlayerFloatingBottomControlsKt();
    private static ho.p lambda$1660688148 = new c3.j(new e(0), false, 1660688148);

    public static final sn.z lambda_1660688148$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            y2.a(kd.a.M(R.drawable.bubble_stars_outline, qVar, 0), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.assistant_chat_button_accessibility_label), p2.o(i3.q.f13017a, 20), 0L, qVar, u3.c.$stable | 384, 8);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1660688148$app_productionRelease() {
        return lambda$1660688148;
    }
}
