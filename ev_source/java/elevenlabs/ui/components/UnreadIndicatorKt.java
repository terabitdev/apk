package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsn/z;", "UnreadIndicator", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UnreadIndicatorKt {
    public static final void UnreadIndicator(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1489766959);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.p.a(l1.n.h(m3.h.c(r1.p2.o(i3.q.f13017a, 8), ElevenLabsTheme.INSTANCE.getShapes(qVar, 6).getFull()), p3.h0.e(4278221567L), p3.h0.f26395b), qVar, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 19);
        }
    }

    public static final sn.z UnreadIndicator$lambda$0(int i10, u2.m mVar, int i11) {
        UnreadIndicator(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
