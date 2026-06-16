package io.elevenlabs.ui.components;

import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SelectableCardV2Kt {
    public static final ComposableSingletons$SelectableCardV2Kt INSTANCE = new ComposableSingletons$SelectableCardV2Kt();
    private static ho.p lambda$1052542326 = new c3.j(new n0(13), false, 1052542326);
    private static ho.p lambda$1046345453 = new c3.j(new n0(14), false, 1046345453);

    /* renamed from: lambda$-1105137682 */
    private static ho.p f666lambda$1105137682 = new c3.j(new n0(15), false, -1105137682);
    private static ho.p lambda$1038346479 = new c3.j(new n0(16), false, 1038346479);
    private static ho.p lambda$1595341836 = new c3.j(new n0(17), false, 1595341836);

    public static final sn.z lambda_1038346479$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            r1.k2 a10 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
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
            s4.y0 lgRegular500 = echoTheme.getTypography(qVar, 6).getLgRegular500(qVar, 0);
            long b10 = ib.i.b(6, 0, echoTheme, qVar, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d("Monthly Plan", new r1.m1(1.0f, true), b10, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, lgRegular500, qVar, 6, 0, 131064);
            j7.d("$11.11 / mo", null, ib.i.B(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), qVar, 6, 0, 131066);
            SelectableCardV2Kt.RadioButton(false, null, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1046345453$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            r1.k2 a10 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.m1 m1Var = new r1.m1(1.0f, true);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            j7.d("Yearly Plan", null, ib.i.b(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getLgRegular500(qVar, 0), qVar, 6, 0, 131066);
            j7.d("12 months · $111.11", null, ib.i.B(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), qVar, 6, 0, 131066);
            qVar.p(true);
            j7.d("$9.99 / mo", null, ib.i.B(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), qVar, 6, 0, 131066);
            SelectableCardV2Kt.RadioButton(false, null, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1052542326$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            r1.k2 a10 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.m1 m1Var = new r1.m1(1.0f, true);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            j7.d("Yearly Plan", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getLgRegular500(qVar, 0), qVar, 6, 0, 131066);
            j7.d("12 months · $111.11", null, ib.i.B(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), qVar, 6, 0, 131066);
            qVar.p(true);
            j7.d("$9.99 / mo", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), qVar, 6, 0, 131066);
            SelectableCardV2Kt.RadioButton(true, null, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1595341836$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            r1.h y10 = ib.i.y(echoTheme, qVar, 6);
            i3.t E = r1.d.E(i3.q.f13017a, echoTheme.getSpacings(qVar, 6).getX4());
            r1.x a10 = r1.w.a(y10, i3.d.B0, qVar, 0);
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
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(16);
                qVar.h0(L);
            }
            SelectableCardV2Kt.SelectableCardV2("Yearly Plan, 12 months, $111.11, $9.99 per month", true, (ho.a) L, null, "Most Popular", lambda$1052542326, qVar, 221622, 8);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m0(17);
                qVar.h0(L2);
            }
            SelectableCardV2Kt.SelectableCardV2("Yearly Plan, 12 months, $111.11, $9.99 per month", false, (ho.a) L2, null, "Most Popular", lambda$1046345453, qVar, 221622, 8);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new m0(18);
                qVar.h0(L3);
            }
            SelectableCardV2Kt.SelectableCardV2("Monthly Plan, $11.11 per month", true, (ho.a) L3, null, null, f666lambda$1105137682, qVar, 197046, 24);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new m0(19);
                qVar.h0(L4);
            }
            SelectableCardV2Kt.SelectableCardV2("Monthly Plan, $11.11 per month", false, (ho.a) L4, null, null, lambda$1038346479, qVar, 197046, 24);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1105137682$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            r1.u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            r1.k2 a10 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
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
            s4.y0 lgRegular500 = echoTheme.getTypography(qVar, 6).getLgRegular500(qVar, 0);
            long v9 = ib.i.v(6, 0, echoTheme, qVar, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d("Monthly Plan", new r1.m1(1.0f, true), v9, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, lgRegular500, qVar, 6, 0, 131064);
            j7.d("$11.11 / mo", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), qVar, 6, 0, 131066);
            SelectableCardV2Kt.RadioButton(true, null, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1105137682$ui_release */
    public final ho.p m1822getLambda$1105137682$ui_release() {
        return f666lambda$1105137682;
    }

    public final ho.p getLambda$1038346479$ui_release() {
        return lambda$1038346479;
    }

    public final ho.p getLambda$1046345453$ui_release() {
        return lambda$1046345453;
    }

    public final ho.p getLambda$1052542326$ui_release() {
        return lambda$1052542326;
    }

    public final ho.p getLambda$1595341836$ui_release() {
        return lambda$1595341836;
    }
}
