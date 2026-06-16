package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$BackButtonKt {
    public static final ComposableSingletons$BackButtonKt INSTANCE = new ComposableSingletons$BackButtonKt();

    /* renamed from: lambda$-812961288 */
    private static ho.p f639lambda$812961288 = new c3.j(new j(3), false, -812961288);

    public static final sn.z lambda__812961288$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(i3.q.f13017a, 10);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(19);
                qVar.h0(L);
            }
            BackButtonKt.EchoThemeBackButton((ho.a) L, null, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-812961288$ui_release */
    public final ho.p m1795getLambda$812961288$ui_release() {
        return f639lambda$812961288;
    }
}
