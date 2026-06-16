package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$EchoIconButtonKt {
    public static final ComposableSingletons$EchoIconButtonKt INSTANCE = new ComposableSingletons$EchoIconButtonKt();

    /* renamed from: lambda$-1067095705 */
    private static ho.p f648lambda$1067095705 = new c3.j(new j(12), false, -1067095705);
    private static ho.p lambda$955341863 = new c3.j(new j(13), false, 955341863);

    /* renamed from: lambda$-1088467963 */
    private static ho.p f649lambda$1088467963 = new c3.j(new j(14), false, -1088467963);

    /* renamed from: lambda$-1824625061 */
    private static ho.p f650lambda$1824625061 = new c3.j(new j(15), false, -1824625061);

    /* renamed from: lambda$-19846926 */
    private static ho.p f651lambda$19846926 = new c3.j(new j(16), false, -19846926);
    private static ho.p lambda$154935025 = new c3.j(new j(17), false, 154935025);
    private static ho.p lambda$1508187517 = new c3.j(new j(18), false, 1508187517);

    public static final sn.z lambda_1508187517$lambda$0(u2.m mVar, int i10) {
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
            r1.h g10 = r1.j.g(echoTheme.getSpacings(qVar, 6).getX3());
            i3.k kVar = i3.d.f13005z0;
            r1.k2 a11 = r1.i2.a(g10, kVar, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
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
            int i11 = R.drawable.close;
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (L == eVar5) {
                L = new l0(10);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
            EchoIconButtonKt.EchoIconButton(i11, (ho.a) L, null, "Primary", echoButtonVariant, echoButtonSize, false, false, false, qVar, 224304, 452);
            int i12 = R.drawable.close;
            Object L2 = qVar.L();
            if (L2 == eVar5) {
                L2 = new l0(11);
                qVar.h0(L2);
            }
            EchoIconButtonKt.EchoIconButton(i12, (ho.a) L2, null, "Secondary", EchoButtonVariant.Secondary, echoButtonSize, false, false, false, qVar, 224304, 452);
            int i13 = R.drawable.close;
            Object L3 = qVar.L();
            if (L3 == eVar5) {
                L3 = new l0(12);
                qVar.h0(L3);
            }
            EchoIconButtonKt.EchoIconButton(i13, (ho.a) L3, null, "Ghost", EchoButtonVariant.Ghost, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
            r1.d.g(r1.p2.f(qVar2, echoTheme.getSpacings(qVar, 6).getX3()), qVar);
            r1.k2 a12 = r1.i2.a(r1.j.g(echoTheme.getSpacings(qVar, 6).getX3()), kVar, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            int i14 = R.drawable.close;
            Object L4 = qVar.L();
            if (L4 == eVar5) {
                L4 = new l0(13);
                qVar.h0(L4);
            }
            EchoIconButtonKt.EchoIconButton(i14, (ho.a) L4, null, "Border", EchoButtonVariant.Border, echoButtonSize, false, false, false, qVar, 224304, 452);
            int i15 = R.drawable.close;
            Object L5 = qVar.L();
            if (L5 == eVar5) {
                L5 = new l0(14);
                qVar.h0(L5);
            }
            EchoIconButtonKt.EchoIconButton(i15, (ho.a) L5, null, "Critical", EchoButtonVariant.Critical, echoButtonSize, false, false, false, qVar, 224304, 452);
            int i16 = R.drawable.close;
            Object L6 = qVar.L();
            if (L6 == eVar5) {
                L6 = new l0(15);
                qVar.h0(L6);
            }
            EchoIconButtonKt.EchoIconButton(i16, (ho.a) L6, null, "Secondary White", EchoButtonVariant.SecondaryWhite, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
            r1.d.g(r1.p2.f(qVar2, echoTheme.getSpacings(qVar, 6).getX3()), qVar);
            r1.k2 a13 = r1.i2.a(r1.j.g(echoTheme.getSpacings(qVar, 6).getX3()), kVar, qVar, 48);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a13, qVar);
            u2.r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c12, qVar);
            int i17 = R.drawable.close;
            Object L7 = qVar.L();
            if (L7 == eVar5) {
                L7 = new l0(16);
                qVar.h0(L7);
            }
            EchoIconButtonKt.EchoIconButton(i17, (ho.a) L7, null, "Ghost Tertiary", EchoButtonVariant.GhostTertiary, echoButtonSize, false, false, false, qVar, 224304, 452);
            int i18 = R.drawable.close;
            Object L8 = qVar.L();
            if (L8 == eVar5) {
                L8 = new l0(17);
                qVar.h0(L8);
            }
            EchoIconButtonKt.EchoIconButton(i18, (ho.a) L8, null, "Ghost White", EchoButtonVariant.GhostWhite, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_154935025$lambda$0(u2.m mVar, int i10) {
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
            int i11 = R.drawable.close;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new l0(18);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Large;
            EchoIconButtonKt.EchoIconButton(i11, (ho.a) L, null, "Primary Enabled", echoButtonVariant, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i12 = R.drawable.close;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new l0(20);
                qVar.h0(L2);
            }
            EchoIconButtonKt.EchoIconButton(i12, (ho.a) L2, null, "Primary Disabled", echoButtonVariant, echoButtonSize, false, false, false, qVar, 1797168, 388);
            ib.i.o(echoTheme, qVar, 6, qVar2, qVar);
            d5.e(r1.d.G(qVar2, t2.u.P, echoTheme.getSpacings(qVar, 6).getX4(), 1), t2.u.P, echoTheme.getColors(qVar, 6).getBorder().getPrimary(qVar, 0), qVar, 0, 2);
            int i13 = R.drawable.close;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new l0(21);
                qVar.h0(L3);
            }
            EchoButtonVariant echoButtonVariant2 = EchoButtonVariant.Secondary;
            EchoIconButtonKt.EchoIconButton(i13, (ho.a) L3, null, "Secondary Enabled", echoButtonVariant2, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i14 = R.drawable.close;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new l0(22);
                qVar.h0(L4);
            }
            EchoIconButtonKt.EchoIconButton(i14, (ho.a) L4, null, "Secondary Disabled", echoButtonVariant2, echoButtonSize, false, false, false, qVar, 1797168, 388);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_955341863$lambda$0(u2.m mVar, int i10) {
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
            int i11 = R.drawable.close;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new l0(0);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Small;
            EchoIconButtonKt.EchoIconButton(i11, (ho.a) L, null, "Primary Button", echoButtonVariant, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i12 = R.drawable.close;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new l0(1);
                qVar.h0(L2);
            }
            EchoIconButtonKt.EchoIconButton(i12, (ho.a) L2, null, "Primary Loading", echoButtonVariant, echoButtonSize, false, true, false, qVar, 12807216, 324);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i13 = R.drawable.close;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new l0(2);
                qVar.h0(L3);
            }
            EchoIconButtonKt.EchoIconButton(i13, (ho.a) L3, null, "Primary Disabled", echoButtonVariant, echoButtonSize, false, false, false, qVar, 1797168, 388);
            ib.i.o(echoTheme, qVar, 6, qVar2, qVar);
            int i14 = R.drawable.close;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new l0(3);
                qVar.h0(L4);
            }
            EchoIconButtonKt.EchoIconButton(i14, (ho.a) L4, null, "Secondary Button", EchoButtonVariant.Secondary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i15 = R.drawable.close;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new l0(4);
                qVar.h0(L5);
            }
            EchoIconButtonKt.EchoIconButton(i15, (ho.a) L5, null, "Ghost Button", EchoButtonVariant.Ghost, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i16 = R.drawable.close;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new l0(5);
                qVar.h0(L6);
            }
            EchoIconButtonKt.EchoIconButton(i16, (ho.a) L6, null, "Border Button", EchoButtonVariant.Border, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i17 = R.drawable.close;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new l0(6);
                qVar.h0(L7);
            }
            EchoIconButtonKt.EchoIconButton(i17, (ho.a) L7, null, "Danger Button", EchoButtonVariant.Critical, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i18 = R.drawable.close;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new l0(7);
                qVar.h0(L8);
            }
            EchoIconButtonKt.EchoIconButton(i18, (ho.a) L8, null, "Ghost Tertiary Button", EchoButtonVariant.GhostTertiary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i19 = R.drawable.close;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new l0(9);
                qVar.h0(L9);
            }
            EchoIconButtonKt.EchoIconButton(i19, (ho.a) L9, null, "Ghost White Button", EchoButtonVariant.GhostWhite, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1067095705$lambda$0(u2.m mVar, int i10) {
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
            int i11 = R.drawable.close;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new k0(12);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.ExtraSmall;
            EchoIconButtonKt.EchoIconButton(i11, (ho.a) L, null, "Primary Button", echoButtonVariant, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i12 = R.drawable.close;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(23);
                qVar.h0(L2);
            }
            EchoIconButtonKt.EchoIconButton(i12, (ho.a) L2, null, "Primary Loading", echoButtonVariant, echoButtonSize, false, true, false, qVar, 12807216, 324);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i13 = R.drawable.close;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new k0(29);
                qVar.h0(L3);
            }
            EchoIconButtonKt.EchoIconButton(i13, (ho.a) L3, null, "Primary Disabled", echoButtonVariant, echoButtonSize, false, false, false, qVar, 1797168, 388);
            ib.i.o(echoTheme, qVar, 6, qVar2, qVar);
            int i14 = R.drawable.close;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new l0(8);
                qVar.h0(L4);
            }
            EchoIconButtonKt.EchoIconButton(i14, (ho.a) L4, null, "Secondary Button", EchoButtonVariant.Secondary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i15 = R.drawable.close;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new l0(19);
                qVar.h0(L5);
            }
            EchoIconButtonKt.EchoIconButton(i15, (ho.a) L5, null, "Ghost Button", EchoButtonVariant.Ghost, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i16 = R.drawable.close;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new m0(0);
                qVar.h0(L6);
            }
            EchoIconButtonKt.EchoIconButton(i16, (ho.a) L6, null, "Border Button", EchoButtonVariant.Border, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i17 = R.drawable.close;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new m0(2);
                qVar.h0(L7);
            }
            EchoIconButtonKt.EchoIconButton(i17, (ho.a) L7, null, "Danger Button", EchoButtonVariant.Critical, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i18 = R.drawable.close;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new m0(3);
                qVar.h0(L8);
            }
            EchoIconButtonKt.EchoIconButton(i18, (ho.a) L8, null, "Ghost Tertiary Button", EchoButtonVariant.GhostTertiary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i19 = R.drawable.close;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new m0(4);
                qVar.h0(L9);
            }
            EchoIconButtonKt.EchoIconButton(i19, (ho.a) L9, null, "Ghost White Button", EchoButtonVariant.GhostWhite, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1088467963$lambda$0(u2.m mVar, int i10) {
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
            int i11 = R.drawable.close;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new m0(5);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
            EchoIconButtonKt.EchoIconButton(i11, (ho.a) L, null, "Primary Button", echoButtonVariant, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i12 = R.drawable.close;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(13);
                qVar.h0(L2);
            }
            EchoIconButtonKt.EchoIconButton(i12, (ho.a) L2, null, "Primary Loading", echoButtonVariant, echoButtonSize, false, true, false, qVar, 12807216, 324);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i13 = R.drawable.close;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new k0(14);
                qVar.h0(L3);
            }
            EchoIconButtonKt.EchoIconButton(i13, (ho.a) L3, null, "Secondary Button", EchoButtonVariant.Secondary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i14 = R.drawable.close;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new k0(15);
                qVar.h0(L4);
            }
            EchoIconButtonKt.EchoIconButton(i14, (ho.a) L4, null, "Ghost Button", EchoButtonVariant.Ghost, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i15 = R.drawable.close;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new k0(16);
                qVar.h0(L5);
            }
            EchoIconButtonKt.EchoIconButton(i15, (ho.a) L5, null, "Border Button", EchoButtonVariant.Border, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i16 = R.drawable.close;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new k0(17);
                qVar.h0(L6);
            }
            EchoIconButtonKt.EchoIconButton(i16, (ho.a) L6, null, "Danger Button", EchoButtonVariant.Critical, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i17 = R.drawable.close;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new k0(18);
                qVar.h0(L7);
            }
            EchoIconButtonKt.EchoIconButton(i17, (ho.a) L7, null, "Ghost Tertiary Button", EchoButtonVariant.GhostTertiary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i18 = R.drawable.close;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new k0(19);
                qVar.h0(L8);
            }
            EchoIconButtonKt.EchoIconButton(i18, (ho.a) L8, null, "Ghost White Button", EchoButtonVariant.GhostWhite, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1824625061$lambda$0(u2.m mVar, int i10) {
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
            int i11 = R.drawable.close;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new l0(23);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Large;
            EchoIconButtonKt.EchoIconButton(i11, (ho.a) L, null, "Primary Button", echoButtonVariant, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i12 = R.drawable.close;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new l0(24);
                qVar.h0(L2);
            }
            EchoIconButtonKt.EchoIconButton(i12, (ho.a) L2, null, "Primary Loading", echoButtonVariant, echoButtonSize, false, true, false, qVar, 12807216, 324);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i13 = R.drawable.close;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new l0(25);
                qVar.h0(L3);
            }
            EchoIconButtonKt.EchoIconButton(i13, (ho.a) L3, null, "Secondary Button", EchoButtonVariant.Secondary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i14 = R.drawable.close;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new l0(26);
                qVar.h0(L4);
            }
            EchoIconButtonKt.EchoIconButton(i14, (ho.a) L4, null, "Ghost Button", EchoButtonVariant.Ghost, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i15 = R.drawable.close;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new l0(27);
                qVar.h0(L5);
            }
            EchoIconButtonKt.EchoIconButton(i15, (ho.a) L5, null, "Border Button", EchoButtonVariant.Border, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i16 = R.drawable.close;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new l0(28);
                qVar.h0(L6);
            }
            EchoIconButtonKt.EchoIconButton(i16, (ho.a) L6, null, "Danger Button", EchoButtonVariant.Critical, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i17 = R.drawable.close;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new l0(29);
                qVar.h0(L7);
            }
            EchoIconButtonKt.EchoIconButton(i17, (ho.a) L7, null, "Ghost Tertiary Button", EchoButtonVariant.GhostTertiary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i18 = R.drawable.close;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new m0(1);
                qVar.h0(L8);
            }
            EchoIconButtonKt.EchoIconButton(i18, (ho.a) L8, null, "Ghost White Button", EchoButtonVariant.GhostWhite, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__19846926$lambda$0(u2.m mVar, int i10) {
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
            int i11 = R.drawable.close;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new k0(20);
                qVar.h0(L);
            }
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
            EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
            EchoIconButtonKt.EchoIconButton(i11, (ho.a) L, null, "Primary Dark", echoButtonVariant, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i12 = R.drawable.close;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(21);
                qVar.h0(L2);
            }
            EchoIconButtonKt.EchoIconButton(i12, (ho.a) L2, null, "Primary Loading", echoButtonVariant, echoButtonSize, false, true, false, qVar, 12807216, 324);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i13 = R.drawable.close;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new k0(22);
                qVar.h0(L3);
            }
            EchoIconButtonKt.EchoIconButton(i13, (ho.a) L3, null, "Secondary Dark", EchoButtonVariant.Secondary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i14 = R.drawable.close;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new k0(24);
                qVar.h0(L4);
            }
            EchoIconButtonKt.EchoIconButton(i14, (ho.a) L4, null, "Ghost Dark", EchoButtonVariant.Ghost, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i15 = R.drawable.close;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new k0(25);
                qVar.h0(L5);
            }
            EchoIconButtonKt.EchoIconButton(i15, (ho.a) L5, null, "Border Dark", EchoButtonVariant.Border, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i16 = R.drawable.close;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new k0(26);
                qVar.h0(L6);
            }
            EchoIconButtonKt.EchoIconButton(i16, (ho.a) L6, null, "Danger Dark", EchoButtonVariant.Critical, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i17 = R.drawable.close;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new k0(27);
                qVar.h0(L7);
            }
            EchoIconButtonKt.EchoIconButton(i17, (ho.a) L7, null, "Ghost Tertiary Dark", EchoButtonVariant.GhostTertiary, echoButtonSize, false, false, false, qVar, 224304, 452);
            ib.i.z(echoTheme, qVar, 6, qVar2, qVar);
            int i18 = R.drawable.close;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new k0(28);
                qVar.h0(L8);
            }
            EchoIconButtonKt.EchoIconButton(i18, (ho.a) L8, null, "Ghost White Dark", EchoButtonVariant.GhostWhite, echoButtonSize, false, false, false, qVar, 224304, 452);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1067095705$ui_release */
    public final ho.p m1804getLambda$1067095705$ui_release() {
        return f648lambda$1067095705;
    }

    /* renamed from: getLambda$-1088467963$ui_release */
    public final ho.p m1805getLambda$1088467963$ui_release() {
        return f649lambda$1088467963;
    }

    /* renamed from: getLambda$-1824625061$ui_release */
    public final ho.p m1806getLambda$1824625061$ui_release() {
        return f650lambda$1824625061;
    }

    /* renamed from: getLambda$-19846926$ui_release */
    public final ho.p m1807getLambda$19846926$ui_release() {
        return f651lambda$19846926;
    }

    public final ho.p getLambda$1508187517$ui_release() {
        return lambda$1508187517;
    }

    public final ho.p getLambda$154935025$ui_release() {
        return lambda$154935025;
    }

    public final ho.p getLambda$955341863$ui_release() {
        return lambda$955341863;
    }
}
