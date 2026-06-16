package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import c3.o;
import e5.k;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.ui.components.q0;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.p;
import r1.p2;
import r1.u0;
import s4.y0;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", ParameterNames.TEXT, "Lsn/z;", "AccountDurationCounter", "(Ljava/lang/String;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountDurationCounterKt {
    public static final void AccountDurationCounter(String str, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        str.getClass();
        q qVar = (q) mVar;
        qVar.Z(1942678469);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        boolean z10 = false;
        boolean z11 = true;
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(r1.j.g(EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX1()), i3.d.f13004y0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            qVar.X(-1405850524);
            int i13 = 0;
            for (String s02 = n.s0(2, str); i13 < s02.length(); s02 = s02) {
                char charAt = s02.charAt(i13);
                t a11 = p2.a(qVar2, 32, 40);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i14 = EchoTheme.$stable;
                t h10 = l1.n.h(m3.h.c(a11, echoTheme.getShapes(qVar, i14).getLg(qVar, EchoThemeShapes.$stable)), echoTheme.getColors(qVar, i14).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b);
                f1 d10 = p.d(i3.d.f13001e, z10);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c10 = i3.a.c(h10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, d10, qVar);
                r.J(h4.g.f11906e, l7, qVar);
                r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c10, qVar);
                float f10 = 24;
                t F = r1.d.F(p2.a(qVar2, f10, f10), echoTheme.getSpacings(qVar, i14).getX1(), echoTheme.getSpacings(qVar, i14).getX2());
                String valueOf = String.valueOf(charAt);
                y0 a12 = y0.a(echoTheme.getTypography(qVar, i14).getBaseRegular400(qVar, EchoThemeTypography.$stable), 0L, 0L, null, null, "tnum, zero", 0L, 0, 0L, null, null, 16777151);
                q qVar3 = qVar;
                boolean z12 = z11;
                j7.d(valueOf, F, 0L, 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, a12, qVar3, 0, 0, 130044);
                qVar = qVar3;
                qVar.p(z12);
                i13++;
                z10 = false;
                z11 = z12;
                qVar2 = qVar2;
            }
            qVar.p(z10);
            qVar.p(z11);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q0(str, i10, 2);
        }
    }

    public static final z AccountDurationCounter$lambda$1(String str, int i10, m mVar, int i11) {
        AccountDurationCounter(str, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
