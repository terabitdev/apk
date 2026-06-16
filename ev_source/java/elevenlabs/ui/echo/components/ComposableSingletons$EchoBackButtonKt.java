package io.elevenlabs.ui.echo.components;

import c3.j;
import c3.o;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.a;
import i3.t;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d;
import s4.o0;
import sn.z;
import u2.b0;
import u2.l;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$EchoBackButtonKt {
    public static final ComposableSingletons$EchoBackButtonKt INSTANCE = new ComposableSingletons$EchoBackButtonKt();

    /* renamed from: lambda$-8728187 */
    private static p f678lambda$8728187 = new j(new o0(5), false, -8728187);

    public static final z lambda__8728187$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t E = d.E(i3.q.f13017a, 10);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(E, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new b0(5);
                qVar.h0(L);
            }
            EchoBackButtonKt.EchoBackButton((ho.a) L, null, null, null, qVar, 6, 14);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-8728187$ui_release */
    public final p m1963getLambda$8728187$ui_release() {
        return f678lambda$8728187;
    }
}
