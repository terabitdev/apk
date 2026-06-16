package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import c3.o;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import r1.p;
import r1.p2;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClickUpgradeToUltra", "AccountUpgradeToUltraBox", "(Lho/a;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountUpgradeToUltraBoxKt {
    public static final void AccountUpgradeToUltraBox(ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        ho.a aVar2 = aVar;
        aVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(820439086);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            EchoThemeShapes shapes = echoTheme.getShapes(qVar, i13);
            int i14 = EchoThemeShapes.$stable;
            t j4 = n.j(1, echoTheme.getColors(qVar, i13).getBorder().getSenaryAlpha(qVar, EchoThemeColors.Border.$stable), n.h(m3.h.c(e10, shapes.getTwoXl(qVar, i14)), echoTheme.getColors(qVar, i13).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b), echoTheme.getShapes(qVar, i13).getTwoXl(qVar, i14));
            f1 d10 = p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(j4, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            t I = r1.d.I(p2.e(qVar2, 1.0f), echoTheme.getSpacings(qVar, i13).getX4(), echoTheme.getSpacings(qVar, i13).getX4(), u.P, echoTheme.getSpacings(qVar, i13).getX4(), 4);
            r1.e eVar5 = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            int i15 = i11;
            x a10 = w.a(eVar5, jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(I, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0("https://eleven-public-cdn.elevenlabs.io/reader/banners/account/banner-carousel-small.png", p2.f(p2.e(qVar2, 1.0f), 96), null, f4.q.f8839b, i3.d.f13000d, null, null, qVar, 27702, 100);
            t I2 = r1.d.I(qVar2, u.P, u.P, echoTheme.getSpacings(qVar, i13).getX4(), u.P, 11);
            x a11 = w.a(eVar5, jVar, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c11 = i3.a.c(I2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a11, qVar);
            r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            ib.i.o(echoTheme, qVar, i13, qVar2, qVar);
            String R = kj.c.R(qVar, R.string.account_upgrade_to_ultra_box_title);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i13);
            int i16 = EchoThemeTypography.$stable;
            y0 baseRegular500 = typography.getBaseRegular500(qVar, i16);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i13).getText();
            int i17 = EchoThemeColors.Text.$stable;
            j7.d(R, null, text.getPrimary(qVar, i17), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, 0, 0, 131066);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i13).getX1()), qVar);
            j7.d(kj.c.R(qVar, R.string.account_upgrade_to_ultra_box_description), null, ib.i.B(i13, i17, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i13).getSmCompact400(qVar, i16), qVar, 0, 0, 131066);
            ib.i.o(echoTheme, qVar, i13, qVar2, qVar);
            t e11 = p2.e(qVar2, 1.0f);
            aVar2 = aVar;
            FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar, R.string.account_upgrade_to_ultra), aVar2, e11, FullWidthButtonSize.Large, FullWidthButtonVariant.Primary, Integer.valueOf(io.elevenlabs.ui.R.drawable.bolt_filled), false, false, false, qVar, ((i15 << 3) & 112) | 28032, 448);
            p.n.t(qVar, true, true, true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 4);
        }
    }

    public static final z AccountUpgradeToUltraBox$lambda$1(ho.a aVar, int i10, m mVar, int i11) {
        AccountUpgradeToUltraBox(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
