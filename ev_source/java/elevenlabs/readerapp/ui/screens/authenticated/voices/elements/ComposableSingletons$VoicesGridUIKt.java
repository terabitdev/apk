package io.elevenlabs.readerapp.ui.screens.authenticated.voices.elements;

import c3.j;
import ho.p;
import ib.i;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import nm.a;
import q2.y2;
import r1.p2;
import sn.z;
import u2.m;
import u2.q;
import u3.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$VoicesGridUIKt {
    public static final ComposableSingletons$VoicesGridUIKt INSTANCE = new ComposableSingletons$VoicesGridUIKt();

    /* renamed from: lambda$-1205196802 */
    private static p f622lambda$1205196802 = new j(new a(14), false, -1205196802);

    public static final z lambda__1205196802$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            y2.a(kd.a.M(R.drawable.chevron_right, qVar, 0), null, p2.o(i3.q.f13017a, 10), i.w(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), qVar, c.$stable | 432, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1205196802$app_productionRelease */
    public final p m1752getLambda$1205196802$app_productionRelease() {
        return f622lambda$1205196802;
    }
}
