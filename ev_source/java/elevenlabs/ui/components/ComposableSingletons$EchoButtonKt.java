package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$EchoButtonKt {
    public static final ComposableSingletons$EchoButtonKt INSTANCE = new ComposableSingletons$EchoButtonKt();

    /* renamed from: lambda$-951525433 */
    private static ho.p f647lambda$951525433 = new c3.j(new j(4), false, -951525433);
    private static ho.p lambda$1249760601 = new c3.j(new j(5), false, 1249760601);
    private static ho.p lambda$1785531621 = new c3.j(new j(6), false, 1785531621);

    /* renamed from: lambda$-2090401807 */
    private static ho.p f645lambda$2090401807 = new c3.j(new j(7), false, -2090401807);

    /* renamed from: lambda$-1002324060 */
    private static ho.p f643lambda$1002324060 = new c3.j(new j(8), false, -1002324060);

    /* renamed from: lambda$-885642200 */
    private static ho.p f646lambda$885642200 = new c3.j(new j(9), false, -885642200);

    /* renamed from: lambda$-1768537775 */
    private static ho.p f644lambda$1768537775 = new c3.j(new j(10), false, -1768537775);

    public static final sn.z lambda_1249760601$lambda$0(u2.m mVar, int i10) {
        boolean z6;
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
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
                L = new j0(5);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Small;
            EchoButtonKt.m1835EchoButton562pCRU("Primary Button", (ho.a) L, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h11 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h11 == eVar) {
                h11 = new j0(6);
                qVar.h0(h11);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Loading", (ho.a) h11, null, echoButtonVariant, echoButtonSize, null, false, false, null, true, false, qVar, 805334070, 0, 1508);
            Object h12 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h12 == eVar) {
                h12 = new j0(7);
                qVar.h0(h12);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Disabled", (ho.a) h12, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 1600566, 0, 1956);
            r1.d.g(r1.p2.f(qVar2, echoTheme.getSpacings(qVar, 6).getX4()), qVar);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new j0(8);
                qVar.h0(L2);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Secondary with Icon", (ho.a) L2, null, EchoButtonVariant.Secondary, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h13 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h13 == eVar) {
                h13 = new j0(9);
                qVar.h0(h13);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Button", (ho.a) h13, null, EchoButtonVariant.Ghost, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h14 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h14 == eVar) {
                h14 = new j0(10);
                qVar.h0(h14);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost White", (ho.a) h14, null, EchoButtonVariant.GhostWhite, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h15 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h15 == eVar) {
                h15 = new j0(11);
                qVar.h0(h15);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Tertiary", (ho.a) h15, null, EchoButtonVariant.GhostTertiary, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h16 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h16 == eVar) {
                h16 = new j0(12);
                qVar.h0(h16);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Border with Icon", (ho.a) h16, null, EchoButtonVariant.Border, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h17 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h17 == eVar) {
                h17 = new j0(14);
                qVar.h0(h17);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Danger", (ho.a) h17, null, EchoButtonVariant.Critical, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1785531621$lambda$0(u2.m mVar, int i10) {
        boolean z6;
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
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
                L = new k0(7);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
            EchoButtonKt.m1835EchoButton562pCRU("Primary Button", (ho.a) L, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h11 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h11 == eVar) {
                h11 = new k0(8);
                qVar.h0(h11);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Loading", (ho.a) h11, null, echoButtonVariant, echoButtonSize, null, false, false, null, true, false, qVar, 805334070, 0, 1508);
            Object h12 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h12 == eVar) {
                h12 = new k0(9);
                qVar.h0(h12);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Secondary with Icon", (ho.a) h12, null, EchoButtonVariant.Secondary, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h13 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h13 == eVar) {
                h13 = new k0(10);
                qVar.h0(h13);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Button", (ho.a) h13, null, EchoButtonVariant.Ghost, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h14 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h14 == eVar) {
                h14 = new k0(11);
                qVar.h0(h14);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost White", (ho.a) h14, null, EchoButtonVariant.GhostWhite, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h15 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h15 == eVar) {
                h15 = new a(22);
                qVar.h0(h15);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Tertiary", (ho.a) h15, null, EchoButtonVariant.GhostTertiary, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h16 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h16 == eVar) {
                h16 = new a(23);
                qVar.h0(h16);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Border with Icon", (ho.a) h16, null, EchoButtonVariant.Border, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h17 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h17 == eVar) {
                h17 = new a(24);
                qVar.h0(h17);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Danger", (ho.a) h17, null, EchoButtonVariant.Critical, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1002324060$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            long D = ib.i.D(6, 0, echoTheme, qVar, qVar);
            p3.w0 w0Var = p3.h0.f26395b;
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = ib.i.e(echoTheme, qVar, 6, l1.n.h(qVar2, D, w0Var));
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new j0(24);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
            EchoButtonKt.m1835EchoButton562pCRU("Primary Dark", (ho.a) L, null, echoButtonVariant, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h10 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h10 == eVar) {
                h10 = new j0(25);
                qVar.h0(h10);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Loading", (ho.a) h10, null, echoButtonVariant, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, true, false, qVar, 805334070, 0, 1476);
            Object h11 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h11 == eVar) {
                h11 = new j0(26);
                qVar.h0(h11);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Secondary Dark", (ho.a) h11, null, EchoButtonVariant.Secondary, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h12 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h12 == eVar) {
                h12 = new j0(27);
                qVar.h0(h12);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Dark", (ho.a) h12, null, EchoButtonVariant.Ghost, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h13 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h13 == eVar) {
                h13 = new j0(29);
                qVar.h0(h13);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost White Dark", (ho.a) h13, null, EchoButtonVariant.GhostWhite, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h14 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h14 == eVar) {
                h14 = new k0(0);
                qVar.h0(h14);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Tertiary Dark", (ho.a) h14, null, EchoButtonVariant.GhostTertiary, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h15 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h15 == eVar) {
                h15 = new k0(1);
                qVar.h0(h15);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Border Dark", (ho.a) h15, null, EchoButtonVariant.Border, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h16 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h16 == eVar) {
                h16 = new k0(2);
                qVar.h0(h16);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Danger Dark", (ho.a) h16, null, EchoButtonVariant.Critical, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1768537775$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            float x42 = echoTheme.getSpacings(qVar, 6).getX4();
            i3.q qVar2 = i3.q.f13017a;
            i3.t h10 = l1.n.h(r1.d.E(qVar2, x42), ib.i.D(6, 0, echoTheme, qVar, qVar), p3.h0.f26395b);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
                L = new j0(2);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Large;
            EchoButtonKt.m1835EchoButton562pCRU("Primary Enabled", (ho.a) L, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h11 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h11 == eVar) {
                h11 = new j0(13);
                qVar.h0(h11);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Disabled", (ho.a) h11, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 1600566, 0, 1956);
            ib.i.o(echoTheme, qVar, 6, qVar2, qVar);
            d5.e(r1.d.G(qVar2, t2.u.P, echoTheme.getSpacings(qVar, 6).getX4(), 1), t2.u.P, echoTheme.getColors(qVar, 6).getBorder().getPrimary(qVar, 0), qVar, 0, 2);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new j0(17);
                qVar.h0(L2);
            }
            EchoButtonVariant echoButtonVariant2 = EchoButtonVariant.Secondary;
            EchoButtonKt.m1835EchoButton562pCRU("Secondary Enabled", (ho.a) L2, null, echoButtonVariant2, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h12 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h12 == eVar) {
                h12 = new j0(28);
                qVar.h0(h12);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Secondary Disabled", (ho.a) h12, null, echoButtonVariant2, echoButtonSize, null, false, false, null, false, false, qVar, 1600566, 0, 1956);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__2090401807$lambda$0(u2.m mVar, int i10) {
        boolean z6;
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
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
                L = new j0(15);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Large;
            EchoButtonKt.m1835EchoButton562pCRU("Primary Button", (ho.a) L, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h11 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h11 == eVar) {
                h11 = new j0(16);
                qVar.h0(h11);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Loading", (ho.a) h11, null, echoButtonVariant, echoButtonSize, null, false, false, null, true, false, qVar, 805334070, 0, 1508);
            Object h12 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h12 == eVar) {
                h12 = new j0(18);
                qVar.h0(h12);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Secondary with Icon", (ho.a) h12, null, EchoButtonVariant.Secondary, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h13 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h13 == eVar) {
                h13 = new j0(19);
                qVar.h0(h13);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Button", (ho.a) h13, null, EchoButtonVariant.Ghost, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h14 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h14 == eVar) {
                h14 = new j0(20);
                qVar.h0(h14);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost White", (ho.a) h14, null, EchoButtonVariant.GhostWhite, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h15 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h15 == eVar) {
                h15 = new j0(21);
                qVar.h0(h15);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Tertiary", (ho.a) h15, null, EchoButtonVariant.GhostTertiary, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h16 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h16 == eVar) {
                h16 = new j0(22);
                qVar.h0(h16);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Border with Icon", (ho.a) h16, null, EchoButtonVariant.Border, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h17 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h17 == eVar) {
                h17 = new j0(23);
                qVar.h0(h17);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Danger", (ho.a) h17, null, EchoButtonVariant.Critical, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__885642200$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            float x42 = echoTheme.getSpacings(qVar, 6).getX4();
            i3.q qVar2 = i3.q.f13017a;
            i3.t h10 = l1.n.h(r1.d.E(qVar2, x42), ib.i.D(6, 0, echoTheme, qVar, qVar), p3.h0.f26395b);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
                L = new k0(3);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
            EchoButtonKt.m1835EchoButton562pCRU("Full Width Button", (ho.a) L, null, echoButtonVariant, echoButtonSize, Integer.valueOf(R.drawable.close), false, true, null, false, false, qVar, 12610614, 0, 1860);
            Object h11 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h11 == eVar) {
                h11 = new k0(4);
                qVar.h0(h11);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Full Width Button", (ho.a) h11, null, echoButtonVariant, echoButtonSize, null, false, true, null, false, false, qVar, 12610614, 0, 1892);
            Object h12 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h12 == eVar) {
                h12 = new k0(5);
                qVar.h0(h12);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Another long button text with an icon that demonstrates how text wraps when the button takes up the full available width", (ho.a) h12, null, EchoButtonVariant.Secondary, EchoButtonSize.Large, Integer.valueOf(R.drawable.close), false, true, null, false, false, qVar, 12610614, 0, 1860);
            Object h13 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h13 == eVar) {
                h13 = new k0(6);
                qVar.h0(h13);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Full width button with border style", (ho.a) h13, null, EchoButtonVariant.Border, EchoButtonSize.Small, null, false, true, null, false, false, qVar, 12610614, 0, 1892);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__951525433$lambda$0(u2.m mVar, int i10) {
        boolean z6;
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
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
                L = new a(25);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.ExtraSmall;
            EchoButtonKt.m1835EchoButton562pCRU("Primary Button", (ho.a) L, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h11 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h11 == eVar) {
                h11 = new a(26);
                qVar.h0(h11);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Loading", (ho.a) h11, null, echoButtonVariant, echoButtonSize, null, false, false, null, true, false, qVar, 805334070, 0, 1508);
            Object h12 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h12 == eVar) {
                h12 = new a(27);
                qVar.h0(h12);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Primary Disabled", (ho.a) h12, null, echoButtonVariant, echoButtonSize, null, false, false, null, false, false, qVar, 1600566, 0, 1956);
            r1.d.g(r1.p2.f(qVar2, echoTheme.getSpacings(qVar, 6).getX4()), qVar);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(28);
                qVar.h0(L2);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Secondary with Icon", (ho.a) L2, null, EchoButtonVariant.Secondary, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h13 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h13 == eVar) {
                h13 = new a(29);
                qVar.h0(h13);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Button", (ho.a) h13, null, EchoButtonVariant.Ghost, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h14 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h14 == eVar) {
                h14 = new j0(0);
                qVar.h0(h14);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost White", (ho.a) h14, null, EchoButtonVariant.GhostWhite, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h15 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h15 == eVar) {
                h15 = new j0(1);
                qVar.h0(h15);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Ghost Tertiary", (ho.a) h15, null, EchoButtonVariant.GhostTertiary, echoButtonSize, null, false, false, null, false, false, qVar, 27702, 0, 2020);
            Object h16 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h16 == eVar) {
                h16 = new j0(3);
                qVar.h0(h16);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Border with Icon", (ho.a) h16, null, EchoButtonVariant.Border, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            Object h17 = ib.i.h(echoTheme, qVar, 6, qVar2, qVar);
            if (h17 == eVar) {
                h17 = new j0(4);
                qVar.h0(h17);
            }
            EchoButtonKt.m1835EchoButton562pCRU("Danger", (ho.a) h17, null, EchoButtonVariant.Critical, echoButtonSize, Integer.valueOf(R.drawable.close), false, false, null, false, false, qVar, 27702, 0, 1988);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1002324060$ui_release */
    public final ho.p m1799getLambda$1002324060$ui_release() {
        return f643lambda$1002324060;
    }

    /* renamed from: getLambda$-1768537775$ui_release */
    public final ho.p m1800getLambda$1768537775$ui_release() {
        return f644lambda$1768537775;
    }

    /* renamed from: getLambda$-2090401807$ui_release */
    public final ho.p m1801getLambda$2090401807$ui_release() {
        return f645lambda$2090401807;
    }

    /* renamed from: getLambda$-885642200$ui_release */
    public final ho.p m1802getLambda$885642200$ui_release() {
        return f646lambda$885642200;
    }

    /* renamed from: getLambda$-951525433$ui_release */
    public final ho.p m1803getLambda$951525433$ui_release() {
        return f647lambda$951525433;
    }

    public final ho.p getLambda$1249760601$ui_release() {
        return lambda$1249760601;
    }

    public final ho.p getLambda$1785531621$ui_release() {
        return lambda$1785531621;
    }
}
