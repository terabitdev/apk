package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", ParameterNames.TEXT, "Li3/t;", "modifier", "Lsn/z;", "ExpiryBadge", "(Ljava/lang/String;Li3/t;Lu2/m;II)V", "Preview_ExpiryBadge", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExpiryBadgeKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExpiryBadge(String str, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i15;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1091949723);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i10 | i15;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i14 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                i3.t F = r1.d.F(l1.n.h(tVar4, echoTheme.getColors(qVar, i17).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), echoTheme.getShapes(qVar, i17).getFull(qVar, EchoThemeShapes.$stable)), echoTheme.getSpacings(qVar, i17).getX2(), echoTheme.getSpacings(qVar, i17).getX1());
                i3.k kVar = i3.d.f13005z0;
                r1.u0 u0Var = r1.j.f29228a;
                k2 a10 = i2.a(r1.j.g(echoTheme.getSpacings(qVar, i17).getX1()), kVar, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(F, qVar);
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
                u3.c M = kd.a.M(R.drawable.clock, qVar, 0);
                i3.t o6 = p2.o(qVar2, 12);
                EchoThemeColors.Text text = echoTheme.getColors(qVar, i17).getText();
                int i18 = EchoThemeColors.Text.$stable;
                y2.a(M, null, o6, text.getWarningPrimary(qVar, i18), qVar, u3.c.$stable | 432, 0);
                j7.d(str, null, echoTheme.getColors(qVar, i17).getText().getWarningPrimary(qVar, i18), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, i17).getXsRegular400(qVar, EchoThemeTypography.$stable), qVar, i14 & 14, 24960, 110586);
                qVar = qVar;
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new r(str, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12;
        if ((i14 & 19) == 18) {
        }
        if (!qVar.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ExpiryBadge$lambda$1(String str, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ExpiryBadge(str, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ExpiryBadge(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1761254454);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ExpiryBadgeKt.INSTANCE.m1032getLambda$1691496400$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 2);
        }
    }

    public static final sn.z Preview_ExpiryBadge$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExpiryBadge(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
