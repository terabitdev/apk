package io.elevenlabs.ui.echo.components;

import c3.j;
import c3.o;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.a;
import i3.t;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d;
import r1.u0;
import r1.w;
import r1.x;
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
public final class ComposableSingletons$EchoToastKt {
    public static final ComposableSingletons$EchoToastKt INSTANCE = new ComposableSingletons$EchoToastKt();
    private static p lambda$1474105155 = new j(new o0(6), false, 1474105155);

    public static final z lambda_1474105155$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            t E = d.E(i3.q.f13017a, echoTheme.getSpacings(qVar, 6).getX4());
            u0 u0Var = r1.j.f29228a;
            x a10 = w.a(r1.j.g(echoTheme.getSpacings(qVar, 6).getX3()), i3.d.C0, qVar, 48);
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
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            EchoToastKt.EchoToast("Added to Read Later list", null, null, null, null, null, qVar, 6, 62);
            EchoToastKt.EchoToast("Upload different audio recordings for the highest-quality clone.", null, null, Integer.valueOf(R.drawable.warning_triangle_filled), null, null, qVar, 6, 54);
            EchoToastKt.EchoToast("Thanks for the feedback.", null, "Rated!", null, null, null, qVar, 390, 58);
            Integer valueOf = Integer.valueOf(R.drawable.pencil);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new b0(6);
                qVar.h0(L);
            }
            EchoToastKt.EchoToast("Saved at 12:34", null, "Bookmark saved", null, null, ig.f.H(new EchoToastAction("Add note", valueOf, (ho.a) L)), qVar, 390, 26);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final p getLambda$1474105155$ui_release() {
        return lambda$1474105155;
    }
}
