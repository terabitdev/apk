package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.o;
import f4.f1;
import h4.f;
import h4.g;
import i3.t;
import ib.i;
import io.elevenlabs.ui.components.MarkdownTextKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import p3.h0;
import r1.p;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "markdown", "Li3/t;", "modifier", "Lsn/z;", "HomeWarningSectionV4", "(Ljava/lang/String;Li3/t;Lu2/m;II)V", "Preview_HomeWarningSectionV4", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeWarningSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeWarningSectionV4(String str, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        r1 r10;
        t tVar3;
        int i14;
        str.getClass();
        q qVar = (q) mVar;
        qVar.Z(174010117);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i15 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                t e10 = p2.e(tVar3, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                t e11 = i.e(echoTheme, qVar, i16, n.h(h.c(r1.d.G(e10, echoTheme.getSpacings(qVar, i16).getX5(), u.P, 2), z1.h.b(echoTheme.getSpacings(qVar, i16).getX3())), echoTheme.getColors(qVar, i16).getFill().getAmberDenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b));
                f1 d10 = p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(e11, qVar);
                h4.h.f11920i.getClass();
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
                MarkdownTextKt.m1841MarkdownText6lElgYI(str, null, echoTheme.getColors(qVar, i16).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0, echoTheme.getTypography(qVar, i16).getSmRegular400(qVar, EchoThemeTypography.$stable), null, null, null, 0, qVar, i12 & 14, 490);
                qVar.p(true);
                tVar2 = tVar3;
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.r(str, tVar2, i10, i11, 5);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeWarningSectionV4$lambda$1(String str, t tVar, int i10, int i11, m mVar, int i12) {
        HomeWarningSectionV4(str, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HomeWarningSectionV4(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1351650108);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeWarningSectionKt.INSTANCE.m1434getLambda$2051842006$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 24);
        }
    }

    public static final z Preview_HomeWarningSectionV4$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeWarningSectionV4(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
