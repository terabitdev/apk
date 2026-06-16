package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CheckboxKt {
    public static final ComposableSingletons$CheckboxKt INSTANCE = new ComposableSingletons$CheckboxKt();

    /* renamed from: lambda$-1340629975 */
    private static ho.r f641lambda$1340629975 = new c3.j(new i0(0), false, -1340629975);

    public static final sn.z lambda__1340629975$lambda$0(i1.o oVar, boolean z6, u2.m mVar, int i10) {
        int i11;
        u2.q qVar;
        long m2187getTertiary0d7_KjU;
        oVar.getClass();
        if (z6) {
            i11 = R.drawable.check_1;
        } else {
            i11 = R.drawable.ellipse_130;
        }
        u3.c M = kd.a.M(i11, mVar, 0);
        i3.t o6 = r1.p2.o(i3.q.f13017a, 24);
        if (z6) {
            qVar = (u2.q) mVar;
            qVar.X(144792176);
            m2187getTertiary0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getText().m2185getPrimary0d7_KjU();
        } else {
            qVar = (u2.q) mVar;
            qVar.X(144793457);
            m2187getTertiary0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getText().m2187getTertiary0d7_KjU();
        }
        qVar.p(false);
        q2.y2.a(M, null, o6, m2187getTertiary0d7_KjU, mVar, u3.c.$stable | 432, 0);
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1340629975$ui_release */
    public final ho.r m1797getLambda$1340629975$ui_release() {
        return f641lambda$1340629975;
    }
}
