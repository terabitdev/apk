package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.components;

import c3.j;
import c3.o;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.d;
import i3.k;
import i3.t;
import ib.i;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import lm.e;
import m2.k1;
import nm.a;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$UsageCategoryCardKt {
    public static final ComposableSingletons$UsageCategoryCardKt INSTANCE = new ComposableSingletons$UsageCategoryCardKt();

    /* renamed from: lambda$-1111171103 */
    private static p f549lambda$1111171103 = new j(new e(27), false, -1111171103);

    /* renamed from: lambda$-533660303 */
    private static p f551lambda$533660303 = new j(new e(28), false, -533660303);

    /* renamed from: lambda$-884437304 */
    private static p f552lambda$884437304 = new j(new e(29), false, -884437304);
    private static p lambda$1513647008 = new j(new a(0), false, 1513647008);

    /* renamed from: lambda$-342022282 */
    private static p f550lambda$342022282 = new j(new a(1), false, -342022282);
    private static p lambda$1550037587 = new j(new e(25), false, 1550037587);
    private static p lambda$664343564 = new j(new e(26), false, 664343564);

    public static final z lambda_1513647008$lambda$0(m mVar, int i10) {
        boolean z6;
        float f10;
        float f11;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            x a10 = w.a(i.m(echoTheme, qVar, i11), d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = g.f11905d;
            r.J(eVar4, c5, qVar);
            t e10 = p2.e(qVar2, 1.0f);
            k kVar = d.f13005z0;
            u0 u0Var2 = r1.j.f29228a;
            k2 a11 = i2.a(u0Var2, kVar, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(e10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a11, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i11);
            int i12 = EchoThemeTypography.$stable;
            y0 xsRegular400 = typography.getXsRegular400(qVar, i12);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i11).getText();
            int i13 = EchoThemeColors.Text.$stable;
            j7.d("10h", null, text.getTertiary(qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, xsRegular400, qVar, 6, 0, 131066);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f10 = Float.MAX_VALUE;
            } else {
                f10 = 1.0f;
            }
            r1.d.g(new m1(f10, true), qVar);
            j7.d("Expires Dec 18", null, i.B(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getXsRegular400(qVar, i12), qVar, 6, 0, 131066);
            qVar.p(true);
            t e11 = p2.e(qVar2, 1.0f);
            k2 a12 = i2.a(u0Var2, kVar, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c11 = i3.a.c(e11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a12, qVar);
            r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            j7.d("5h", null, i.B(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getXsRegular400(qVar, i12), qVar, 6, 0, 131066);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar);
            j7.d("Expires Mar 2", null, i.B(i11, i13, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getXsRegular400(qVar, i12), qVar, 6, 0, 131066);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1550037587$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new k1(13);
                qVar.h0(L);
            }
            UsageCategoryCardKt.UsageCategoryCard("Extra Hours", "0h left", 0, 1, false, null, "Hours from one-time purchases.", null, "No active packs", false, null, false, (ho.a) L, null, qVar, 102264246, 384, 11936);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_664343564$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new k1(10);
                qVar.h0(L);
            }
            UsageCategoryCardKt.UsageCategoryCard("Extra Hours", "0h left", 0, 1, true, null, "Hours from one-time purchases.", null, "No active packs", false, null, false, (ho.a) L, null, qVar, 907570614, 384, 11424);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1111171103$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            UsageCategoryCardKt.UsageCategoryCard("Text to Audio", "16h left", 8, 24, true, null, null, null, null, false, "Resets Jun 1", false, null, null, qVar, 28086, 6, 15328);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__342022282$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new k1(9);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k1(12);
                qVar.h0(L2);
            }
            UsageCategoryCardKt.UsageCategoryCard("Extra Hours", "15h left", 5, 20, true, null, "Hours from one-time purchases.", aVar, "2 packs active", false, "Expires Dec 18", true, (ho.a) L2, lambda$1513647008, qVar, 114847158, 3510, 544);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__533660303$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new k1(11);
                qVar.h0(L);
            }
            UsageCategoryCardKt.UsageCategoryCard("Text to Audio", "10h left", 0, 10, true, null, "Listening hours from your subscription. Refreshes monthly.", (ho.a) L, null, false, "Resets Jun 1", false, null, null, qVar, 14183862, 6, 15136);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__884437304$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new k1(14);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k1(15);
                qVar.h0(L2);
            }
            UsageCategoryCardKt.UsageCategoryCard("Extra Hours", "15h left", 5, 20, true, null, "Hours from one-time purchases.", aVar, "2 packs active", false, "Expires Dec 18", false, (ho.a) L2, null, qVar, 114847158, 438, 8736);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1111171103$app_productionRelease */
    public final p m1656getLambda$1111171103$app_productionRelease() {
        return f549lambda$1111171103;
    }

    /* renamed from: getLambda$-342022282$app_productionRelease */
    public final p m1657getLambda$342022282$app_productionRelease() {
        return f550lambda$342022282;
    }

    /* renamed from: getLambda$-533660303$app_productionRelease */
    public final p m1658getLambda$533660303$app_productionRelease() {
        return f551lambda$533660303;
    }

    /* renamed from: getLambda$-884437304$app_productionRelease */
    public final p m1659getLambda$884437304$app_productionRelease() {
        return f552lambda$884437304;
    }

    public final p getLambda$1513647008$app_productionRelease() {
        return lambda$1513647008;
    }

    public final p getLambda$1550037587$app_productionRelease() {
        return lambda$1550037587;
    }

    public final p getLambda$664343564$app_productionRelease() {
        return lambda$664343564;
    }
}
