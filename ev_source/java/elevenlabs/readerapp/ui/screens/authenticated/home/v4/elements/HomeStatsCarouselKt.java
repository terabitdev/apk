package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import android.gov.nist.core.Separators;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import h4.g;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ProgressBarKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.format.DurationFormatterKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p2;
import r1.s;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\f\u001a\u000f\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$StatsCarousel;", "section", "", "targetGoalMinutes", "Lkotlin/Function0;", "Lsn/z;", "onDailyGoalClicked", "Li3/t;", "modifier", "HomeStatsCarouselSectionV4", "(Lio/elevenlabs/domain/model/home/HomePageV4$Section$StatsCarousel;JLho/a;Li3/t;Lu2/m;II)V", "Preview_HomeStatsCarouselSectionV4", "(Lu2/m;I)V", "Preview_HomeStatsCarouselSectionV4_NoGoal", "Preview_HomeStatsCarouselSectionV4_GoalExceeded", "Preview_HomeStatsCarouselSectionV4_ZeroMinutes", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeStatsCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeStatsCarouselSectionV4(HomePageV4.Section.StatsCarousel statsCarousel, long j4, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        boolean z6;
        q qVar;
        r1 r10;
        t tVar3;
        boolean z10;
        String l4;
        int i15;
        int i16;
        int i17;
        statsCarousel.getClass();
        aVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-980450168);
        if ((i10 & 6) == 0) {
            if (qVar2.h(statsCarousel)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.e(j4)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i14 & 1, z6)) {
                if (i18 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                int minutesListenedToday = statsCarousel.getMinutesListenedToday();
                String formatMinutesDuration = DurationFormatterKt.formatMinutesDuration(minutesListenedToday, false);
                String formatMinutesDuration2 = DurationFormatterKt.formatMinutesDuration(j4, false);
                qVar2.X(-1614757682);
                String R = kj.c.R(qVar2, R.string.home_stats_minutes_listened_today);
                if (j4 > 0) {
                    qVar2.X(1952420440);
                    String R2 = kj.c.R(qVar2, R.string.home_stats_listening_goal);
                    StringBuilder sb = new StringBuilder();
                    sb.append(formatMinutesDuration);
                    sb.append(Separators.SP);
                    sb.append(R);
                    sb.append(". ");
                    sb.append(R2);
                    l4 = h.d(sb, Separators.SP, formatMinutesDuration2, Separators.DOT);
                    z10 = false;
                    qVar2.p(false);
                } else {
                    z10 = false;
                    qVar2.X(1952538457);
                    qVar2.p(false);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(formatMinutesDuration);
                    sb2.append(Separators.SP);
                    l4 = f.l(R, Separators.DOT, sb2);
                }
                String str = l4;
                qVar2.p(z10);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                qVar = qVar2;
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar, m3.h.c(r1.d.G(tVar3, echoTheme.getSpacings(qVar2, i19).getX5(), u.P, 2), echoTheme.getShapes(qVar2, i19).getTwoXl(qVar2, EchoThemeShapes.$stable)), 0L, false, 0, null, false, null, k.d(-369749908, true, new io.elevenlabs.readerapp.ui.components.b(formatMinutesDuration, minutesListenedToday, formatMinutesDuration2, j4), qVar2), qVar, ((i14 >> 3) & 112) | 805306368, 504);
                tVar2 = tVar3;
            } else {
                qVar = qVar2;
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.d(statsCarousel, j4, aVar, tVar2, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i12;
        if ((i14 & 1171) == 1170) {
        }
        if (!qVar2.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeStatsCarouselSectionV4$lambda$1(long j4, int i10, String str, String str2, s sVar, m mVar, int i11) {
        boolean z6;
        float f10;
        sVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i12 = EchoTheme.$stable;
            t E = r1.d.E(e10, echoTheme.getSpacings(qVar, i12).getX3());
            u0 u0Var = j.f29228a;
            r1.h y10 = i.y(echoTheme, qVar, i12);
            i3.j jVar = i3.d.C0;
            x a10 = w.a(y10, jVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
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
            x a11 = w.a(j.f29230c, jVar, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a11, qVar);
            r.J(eVar2, l7, qVar);
            f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i12);
            int i13 = EchoThemeTypography.$stable;
            y0 fiveXlCompact500 = typography.getFiveXlCompact500(qVar, i13);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i12).getText();
            int i14 = EchoThemeColors.Text.$stable;
            j7.d(str, null, text.getPrimary(qVar, i14), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, fiveXlCompact500, qVar, 0, 0, 130042);
            j7.d(kj.c.R(qVar, R.string.home_stats_minutes_listened_today), null, i.v(i12, i14, echoTheme, qVar, qVar), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i12).getSmCompact400(qVar, i13), qVar, 0, 0, 130042);
            qVar.p(true);
            if (j4 > 0) {
                f10 = i10 / ((float) j4);
            } else {
                f10 = u.P;
            }
            float f11 = f10;
            t f12 = p2.f(p2.e(qVar2, 1.0f), 4);
            EchoThemeColors.Fill fill = echoTheme.getColors(qVar, i12).getFill();
            int i15 = EchoThemeColors.Fill.$stable;
            ProgressBarKt.m1869ProgressBareaDK9VM(f11, f12, fill.getJadeDenary(qVar, i15), echoTheme.getColors(qVar, i12).getFill().getJadePrimary(qVar, i15), qVar, 48, 0);
            k2 a12 = i2.a(j.g(echoTheme.getSpacings(qVar, i12).getX1()), i3.d.f13005z0, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a12, qVar);
            r.J(eVar2, l10, qVar);
            f.u(hashCode3, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            j7.d(kj.c.R(qVar, R.string.home_stats_listening_goal), null, i.B(i12, i14, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i12).getSmCompact400(qVar, i13), qVar, 0, 0, 131066);
            j7.d("·", null, i.B(i12, i14, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i12).getSmCompact400(qVar, i13), qVar, 6, 0, 131066);
            j7.d(str2, null, i.B(i12, i14, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i12).getSmCompact400(qVar, i13), qVar, 0, 0, 131066);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeStatsCarouselSectionV4$lambda$2(HomePageV4.Section.StatsCarousel statsCarousel, long j4, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        HomeStatsCarouselSectionV4(statsCarousel, j4, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselSectionV4(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(173400063);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeStatsCarouselKt.INSTANCE.getLambda$1457202265$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 22);
        }
    }

    public static final z Preview_HomeStatsCarouselSectionV4$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselSectionV4(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselSectionV4_GoalExceeded(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-5522636);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeStatsCarouselKt.INSTANCE.getLambda$1154341146$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 23);
        }
    }

    public static final z Preview_HomeStatsCarouselSectionV4_GoalExceeded$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselSectionV4_GoalExceeded(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselSectionV4_NoGoal(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(480203490);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeStatsCarouselKt.INSTANCE.m1431getLambda$175155896$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 20);
        }
    }

    public static final z Preview_HomeStatsCarouselSectionV4_NoGoal$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselSectionV4_NoGoal(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselSectionV4_ZeroMinutes(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-344065737);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeStatsCarouselKt.INSTANCE.getLambda$1078822545$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 21);
        }
    }

    public static final z Preview_HomeStatsCarouselSectionV4_ZeroMinutes$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselSectionV4_ZeroMinutes(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
