package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "message", "Lkotlin/Function0;", "Lsn/z;", "onClose", "OfflineDownloadLimitReachedScreen", "(Ljava/lang/String;Lho/a;Lu2/m;I)V", "Preview_OfflineDownloadLimitReachedScreen", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OfflineDownloadLimitReachedScreenKt {
    public static final void OfflineDownloadLimitReachedScreen(String str, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1719883120);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            k5.a(null, c3.k.d(-683902388, true, new o(3, aVar), qVar), null, null, null, 0, 0L, 0L, null, c3.k.d(257705441, true, new f(str, aVar, 3), qVar), qVar, 805306416, 509);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.extensions.a(str, aVar, i10, 2);
        }
    }

    public static final sn.z OfflineDownloadLimitReachedScreen$lambda$0(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderKt.Header("", null, c3.k.d(-1444957432, true, new u(4, aVar), qVar), null, null, 0, qVar, 390, 58);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z OfflineDownloadLimitReachedScreen$lambda$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CloseButtonKt.CloseButton(aVar, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z OfflineDownloadLimitReachedScreen$lambda$1(String str, ho.a aVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        float f10;
        float f11;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t D = r1.d.D(p2.d(qVar2, 1.0f), z1Var);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            i3.t G = r1.d.G(D, echoTheme.getSpacings(qVar, i13).getX5(), t2.u.P, 2);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
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
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            r1.d.g(new m1(f10, true), qVar);
            l1.n.c(kd.a.M(R.drawable.download_limit_reached, qVar, 0), null, p2.h(p2.e(qVar2, 1.0f), 154, t2.u.P, 2), null, f4.q.f8840c, t2.u.P, null, qVar, u3.c.$stable | 25008, 104);
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i13).getX10()), qVar);
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.offline_downloads_unavailable_title);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i13);
            int i14 = EchoThemeTypography.$stable;
            s4.y0 lgCompact600 = typography.getLgCompact600(qVar, i14);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i13).getText();
            int i15 = EchoThemeColors.Text.$stable;
            j7.d(R, p2.e(qVar2, 1.0f), text.getPrimary(qVar, i15), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, lgCompact600, qVar, 48, 0, 130040);
            ib.i.o(echoTheme, qVar, i13, qVar2, qVar);
            j7.d(str, p2.e(qVar2, 1.0f), ib.i.B(i13, i15, echoTheme, qVar, qVar), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i13).getBaseRegular400(qVar, i14), qVar, 48, 0, 130040);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar);
            FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.offline_downloads_unavailable_cta), aVar, p2.e(qVar2, 1.0f), null, FullWidthButtonVariant.Primary, null, false, false, false, qVar, 24960, 488);
            ib.i.o(echoTheme, qVar, i13, qVar2, qVar);
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(r1.u0.e(qVar).f29154l), qVar);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z OfflineDownloadLimitReachedScreen$lambda$2(String str, ho.a aVar, int i10, u2.m mVar, int i11) {
        OfflineDownloadLimitReachedScreen(str, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OfflineDownloadLimitReachedScreen(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1108346870);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$OfflineDownloadLimitReachedScreenKt.INSTANCE.m1193getLambda$1822224156$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 23);
        }
    }

    public static final sn.z Preview_OfflineDownloadLimitReachedScreen$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_OfflineDownloadLimitReachedScreen(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
