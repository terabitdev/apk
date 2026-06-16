package io.elevenlabs.ui.components;

import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$EchoToggleKt {
    public static final ComposableSingletons$EchoToggleKt INSTANCE = new ComposableSingletons$EchoToggleKt();
    private static ho.p lambda$615486460 = new c3.j(new j(21), false, 615486460);

    /* renamed from: lambda$-483147630 */
    private static ho.p f653lambda$483147630 = new c3.j(new j(22), false, -483147630);

    public static final sn.z lambda_615486460$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        h4.f fVar;
        h4.f fVar2;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            l1.f2 x10 = l1.n.x(qVar);
            i3.q qVar2 = i3.q.f13017a;
            i3.t y10 = l1.n.y(qVar2, x10, true, true);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            i3.t h10 = l1.n.h(ib.i.e(echoTheme, qVar, 6, y10), ib.i.D(6, 0, echoTheme, qVar, qVar), p3.h0.f26395b);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.y(echoTheme, qVar, 6), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar3 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar3);
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
            j7.d("On - Enabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.h m10 = ib.i.m(echoTheme, qVar, 6);
            i3.k kVar = i3.d.f13004y0;
            r1.k2 a11 = r1.i2.a(m10, kVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar3);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (L == eVar5) {
                L = new z(7);
                qVar.h0(L);
            }
            EchoToggleSize echoToggleSize = EchoToggleSize.ExtraSmall;
            EchoToggleKt.EchoToggle(true, (ho.l) L, null, echoToggleSize, true, qVar, 27702, 4);
            Object L2 = qVar.L();
            if (L2 == eVar5) {
                L2 = new z(10);
                qVar.h0(L2);
            }
            EchoToggleSize echoToggleSize2 = EchoToggleSize.Small;
            EchoToggleKt.EchoToggle(true, (ho.l) L2, null, echoToggleSize2, true, qVar, 27702, 4);
            Object L3 = qVar.L();
            if (L3 == eVar5) {
                L3 = new z(11);
                qVar.h0(L3);
            }
            EchoToggleSize echoToggleSize3 = EchoToggleSize.Medium;
            EchoToggleKt.EchoToggle(true, (ho.l) L3, null, echoToggleSize3, true, qVar, 27702, 4);
            qVar.p(true);
            j7.d("Off - Enabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.k2 a12 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), kVar, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar = fVar3;
                qVar.k(fVar);
            } else {
                fVar = fVar3;
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            Object L4 = qVar.L();
            if (L4 == eVar5) {
                L4 = new z(12);
                qVar.h0(L4);
            }
            h4.f fVar4 = fVar;
            EchoToggleKt.EchoToggle(false, (ho.l) L4, null, echoToggleSize, true, qVar, 27702, 4);
            Object L5 = qVar.L();
            if (L5 == eVar5) {
                L5 = new z(13);
                qVar.h0(L5);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L5, null, echoToggleSize2, true, qVar, 27702, 4);
            Object L6 = qVar.L();
            if (L6 == eVar5) {
                L6 = new z(14);
                qVar.h0(L6);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L6, null, echoToggleSize3, true, qVar, 27702, 4);
            qVar.p(true);
            j7.d("On - Disabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.k2 a13 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), kVar, qVar, 0);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar2 = fVar4;
                qVar.k(fVar2);
            } else {
                fVar2 = fVar4;
                qVar.k0();
            }
            u2.r.J(eVar, a13, qVar);
            u2.r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c12, qVar);
            Object L7 = qVar.L();
            if (L7 == eVar5) {
                L7 = new z(16);
                qVar.h0(L7);
            }
            h4.f fVar5 = fVar2;
            EchoToggleKt.EchoToggle(true, (ho.l) L7, null, echoToggleSize, false, qVar, 27702, 4);
            Object L8 = qVar.L();
            if (L8 == eVar5) {
                L8 = new z(17);
                qVar.h0(L8);
            }
            EchoToggleKt.EchoToggle(true, (ho.l) L8, null, echoToggleSize2, false, qVar, 27702, 4);
            Object L9 = qVar.L();
            if (L9 == eVar5) {
                L9 = new z(18);
                qVar.h0(L9);
            }
            EchoToggleKt.EchoToggle(true, (ho.l) L9, null, echoToggleSize3, false, qVar, 27702, 4);
            qVar.p(true);
            j7.d("Off - Disabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.k2 a14 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), kVar, qVar, 0);
            int hashCode5 = Long.hashCode(qVar.T);
            c3.o l12 = qVar.l();
            i3.t c13 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar5);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a14, qVar);
            u2.r.J(eVar2, l12, qVar);
            defpackage.f.u(hashCode5, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c13, qVar);
            Object L10 = qVar.L();
            if (L10 == eVar5) {
                L10 = new z(19);
                qVar.h0(L10);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L10, null, echoToggleSize, false, qVar, 27702, 4);
            Object L11 = qVar.L();
            if (L11 == eVar5) {
                L11 = new z(8);
                qVar.h0(L11);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L11, null, echoToggleSize2, false, qVar, 27702, 4);
            Object L12 = qVar.L();
            if (L12 == eVar5) {
                L12 = new z(9);
                qVar.h0(L12);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L12, null, echoToggleSize3, false, qVar, 27702, 4);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$0$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$0$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$0$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$1$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$1$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$1$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$2$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$2$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$2$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$3$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$3$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda_615486460$lambda$0$0$3$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        h4.f fVar;
        h4.f fVar2;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            l1.f2 x10 = l1.n.x(qVar);
            i3.q qVar2 = i3.q.f13017a;
            i3.t y10 = l1.n.y(qVar2, x10, true, true);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            i3.t h10 = l1.n.h(ib.i.e(echoTheme, qVar, 6, y10), ib.i.D(6, 0, echoTheme, qVar, qVar), p3.h0.f26395b);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.y(echoTheme, qVar, 6), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar3 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar3);
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
            j7.d("On - Enabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.h m10 = ib.i.m(echoTheme, qVar, 6);
            i3.k kVar = i3.d.f13004y0;
            r1.k2 a11 = r1.i2.a(m10, kVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar3);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (L == eVar5) {
                L = new z(4);
                qVar.h0(L);
            }
            EchoToggleSize echoToggleSize = EchoToggleSize.ExtraSmall;
            EchoToggleKt.EchoToggle(true, (ho.l) L, null, echoToggleSize, true, qVar, 27702, 4);
            Object L2 = qVar.L();
            if (L2 == eVar5) {
                L2 = new z(21);
                qVar.h0(L2);
            }
            EchoToggleSize echoToggleSize2 = EchoToggleSize.Small;
            EchoToggleKt.EchoToggle(true, (ho.l) L2, null, echoToggleSize2, true, qVar, 27702, 4);
            Object L3 = qVar.L();
            if (L3 == eVar5) {
                L3 = new z(22);
                qVar.h0(L3);
            }
            EchoToggleSize echoToggleSize3 = EchoToggleSize.Medium;
            EchoToggleKt.EchoToggle(true, (ho.l) L3, null, echoToggleSize3, true, qVar, 27702, 4);
            qVar.p(true);
            j7.d("Off - Enabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.k2 a12 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), kVar, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar = fVar3;
                qVar.k(fVar);
            } else {
                fVar = fVar3;
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            Object L4 = qVar.L();
            if (L4 == eVar5) {
                L4 = new z(23);
                qVar.h0(L4);
            }
            h4.f fVar4 = fVar;
            EchoToggleKt.EchoToggle(false, (ho.l) L4, null, echoToggleSize, true, qVar, 27702, 4);
            Object L5 = qVar.L();
            if (L5 == eVar5) {
                L5 = new z(24);
                qVar.h0(L5);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L5, null, echoToggleSize2, true, qVar, 27702, 4);
            Object L6 = qVar.L();
            if (L6 == eVar5) {
                L6 = new z(25);
                qVar.h0(L6);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L6, null, echoToggleSize3, true, qVar, 27702, 4);
            qVar.p(true);
            j7.d("On - Disabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.k2 a13 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), kVar, qVar, 0);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar2 = fVar4;
                qVar.k(fVar2);
            } else {
                fVar2 = fVar4;
                qVar.k0();
            }
            u2.r.J(eVar, a13, qVar);
            u2.r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c12, qVar);
            Object L7 = qVar.L();
            if (L7 == eVar5) {
                L7 = new z(26);
                qVar.h0(L7);
            }
            h4.f fVar5 = fVar2;
            EchoToggleKt.EchoToggle(true, (ho.l) L7, null, echoToggleSize, false, qVar, 27702, 4);
            Object L8 = qVar.L();
            if (L8 == eVar5) {
                L8 = new z(27);
                qVar.h0(L8);
            }
            EchoToggleKt.EchoToggle(true, (ho.l) L8, null, echoToggleSize2, false, qVar, 27702, 4);
            Object L9 = qVar.L();
            if (L9 == eVar5) {
                L9 = new z(5);
                qVar.h0(L9);
            }
            EchoToggleKt.EchoToggle(true, (ho.l) L9, null, echoToggleSize3, false, qVar, 27702, 4);
            qVar.p(true);
            j7.d("Off - Disabled", null, ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular500(qVar, 0), qVar, 6, 0, 131066);
            r1.k2 a14 = r1.i2.a(ib.i.m(echoTheme, qVar, 6), kVar, qVar, 0);
            int hashCode5 = Long.hashCode(qVar.T);
            c3.o l12 = qVar.l();
            i3.t c13 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar5);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a14, qVar);
            u2.r.J(eVar2, l12, qVar);
            defpackage.f.u(hashCode5, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c13, qVar);
            Object L10 = qVar.L();
            if (L10 == eVar5) {
                L10 = new z(6);
                qVar.h0(L10);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L10, null, echoToggleSize, false, qVar, 27702, 4);
            Object L11 = qVar.L();
            if (L11 == eVar5) {
                L11 = new z(15);
                qVar.h0(L11);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L11, null, echoToggleSize2, false, qVar, 27702, 4);
            Object L12 = qVar.L();
            if (L12 == eVar5) {
                L12 = new z(20);
                qVar.h0(L12);
            }
            EchoToggleKt.EchoToggle(false, (ho.l) L12, null, echoToggleSize3, false, qVar, 27702, 4);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$0$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$0$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$0$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$1$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$1$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$1$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$2$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$2$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$2$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$3$0$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$3$1$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z lambda__483147630$lambda$0$0$3$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-483147630$ui_release */
    public final ho.p m1809getLambda$483147630$ui_release() {
        return f653lambda$483147630;
    }

    public final ho.p getLambda$615486460$ui_release() {
        return lambda$615486460;
    }
}
