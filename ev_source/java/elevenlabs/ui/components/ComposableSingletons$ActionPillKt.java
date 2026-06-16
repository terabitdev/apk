package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ActionPillKt {
    public static final ComposableSingletons$ActionPillKt INSTANCE = new ComposableSingletons$ActionPillKt();

    /* renamed from: lambda$-979800654 */
    private static ho.p f638lambda$979800654 = new c3.j(new j(2), false, -979800654);

    public static final sn.z lambda__979800654$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.k2 a10 = r1.i2.a(r1.j.g(8), i3.d.f13004y0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new a(17);
                qVar.h0(L);
            }
            ActionPillKt.ActionPill("Write text", "https://example.com/icon.png", (ho.a) L, null, qVar, 438, 8);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(18);
                qVar.h0(L2);
            }
            ActionPillKt.ActionPill("Upload file", "https://example.com/icon.png", (ho.a) L2, null, qVar, 438, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-979800654$ui_release */
    public final ho.p m1794getLambda$979800654$ui_release() {
        return f638lambda$979800654;
    }
}
