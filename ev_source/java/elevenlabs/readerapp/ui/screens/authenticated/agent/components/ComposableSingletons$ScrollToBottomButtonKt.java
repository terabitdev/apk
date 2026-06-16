package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import c3.j;
import c3.o;
import f4.f1;
import h4.g;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.h;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ScrollToBottomButtonKt {
    public static final ComposableSingletons$ScrollToBottomButtonKt INSTANCE = new ComposableSingletons$ScrollToBottomButtonKt();
    private static p lambda$355638567 = new j(new h(27), false, 355638567);

    public static final z lambda_355638567$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t E = r1.d.E(i3.q.f13017a, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX4());
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
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
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.f(10);
                qVar.h0(L);
            }
            ScrollToBottomButtonKt.ScrollToBottomButton((ho.a) L, null, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$355638567$app_productionRelease() {
        return lambda$355638567;
    }
}
