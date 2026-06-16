package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.ui.components.EchoCloseButtonKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "title", "Lkotlin/Function0;", "Lsn/z;", "onClose", "CenteredCloseHeader", "(Ljava/lang/String;Lho/a;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CenteredCloseHeaderKt {
    public static final void CenteredCloseHeader(String str, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        u2.q qVar;
        int i12;
        int i13;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1069077924);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        if ((i14 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i14 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar3, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            i3.t H = r1.d.H(l1.n.h(e10, echoTheme.getColors(qVar2, i15).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable), p3.h0.f26395b), echoTheme.getSpacings(qVar2, i15).getX5(), echoTheme.getSpacings(qVar2, i15).getX6(), echoTheme.getSpacings(qVar2, i15).getX5(), echoTheme.getSpacings(qVar2, i15).getX4());
            i3.l lVar = i3.d.f12997a;
            f4.f1 d10 = r1.p.d(lVar, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(H, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            s4.y0 baseRegular500 = echoTheme.getTypography(qVar2, i15).getBaseRegular500(qVar2, EchoThemeTypography.$stable);
            long primary = echoTheme.getColors(qVar2, i15).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable);
            i3.l lVar2 = i3.d.f13001e;
            r1.t tVar = r1.t.f29349a;
            j7.d(str, tVar.b(qVar3, lVar2), primary, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar2, i14 & 14, 0, 131064);
            qVar = qVar2;
            i3.t b10 = tVar.b(qVar3, i3.d.f13002f);
            f4.f1 d11 = r1.p.d(lVar, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(b10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            aVar2 = aVar;
            EchoCloseButtonKt.EchoCloseButton(aVar2, qVar, (i14 >> 3) & 14);
            qVar.p(true);
            qVar.p(true);
        } else {
            aVar2 = aVar;
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.extensions.a(str, aVar2, i10, 1);
        }
    }

    public static final sn.z CenteredCloseHeader$lambda$1(String str, ho.a aVar, int i10, u2.m mVar, int i11) {
        CenteredCloseHeader(str, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
