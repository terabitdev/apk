package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import a2.h3;
import android.gov.nist.javax.sip.header.ParameterNames;
import c3.k;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.StatsCarouselSection;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.readerapp.ui.previews.HomeFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ProgressBarKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.b1;
import p3.h0;
import q2.j7;
import q2.y2;
import r1.i1;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.s;
import r1.u0;
import r1.w;
import r1.x;
import r1.y;
import s4.y0;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a9\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u000f\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u000f\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u0014\u001a\u000f\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u000f\u0010\u001b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u0014\u001a\u000f\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/StatsCarouselSection;", "item", "", "minutesTargetGoal", "Li3/t;", "modifier", "Lkotlin/Function0;", "Lsn/z;", "onDailyGoalClicked", "HomeStatsCarouselV3", "(Lio/elevenlabs/domain/model/StatsCarouselSection;JLi3/t;Lho/a;Lu2/m;II)V", "", ParameterNames.ICON, "background", "Lkotlin/Function1;", "Lr1/y;", FirebaseAnalytics.Param.CONTENT, "StreakRow", "(IILho/q;Lu2/m;I)V", "Preview_HomeStatsCarouselV3", "(Lu2/m;I)V", "Preview_HomeStatsCarouselV3_zero_days", "Preview_HomeStatsCarouselV3_zero_minutes", "Preview_HomeStatsCarouselV3_middle_streak", "Preview_HomeStatsCarouselV3_minutes", "Preview_HomeStatsCarouselV3_minutes_to_hour", "Preview_HomeStatsCarouselV3_hour_to_hour", "Preview_HomeStatsCarouselV3_above_streak", "Preview_HomeStatsCarouselV3_above_streak_home_v2_version", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeStatsCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeStatsCarouselV3(StatsCarouselSection statsCarouselSection, long j4, t tVar, ho.a aVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        int i16;
        boolean z6;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        String str;
        int i17;
        int i18;
        statsCarouselSection.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-151226150);
        if ((i10 & 6) == 0) {
            if (qVar2.h(statsCarouselSection)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.e(j4)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                aVar2 = aVar;
                if (qVar2.h(aVar2)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i12;
                if ((i16 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i16 & 1, z6)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i19 != 0) {
                        tVar4 = qVar3;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        Object L = qVar2.L();
                        if (L == l.f33918a) {
                            L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.c(11);
                            qVar2.h0(L);
                        }
                        aVar2 = (ho.a) L;
                    }
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i20 = ElevenLabsTheme.$stable;
                    t u6 = p2.u(r1.d.F(tVar4, elevenLabsTheme.getSpacings(qVar2, i20).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, i20).m2355getX3D9Ej5fM()), u.P, 500, 1);
                    r1.e eVar = j.f29230c;
                    i3.j jVar = i3.d.B0;
                    x a10 = w.a(eVar, jVar, qVar2, 0);
                    int hashCode = Long.hashCode(qVar2.T);
                    o l4 = qVar2.l();
                    t c5 = i3.a.c(u6, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    ho.a aVar3 = aVar2;
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar2 = h4.g.f11907f;
                    r.J(eVar2, a10, qVar2);
                    h4.e eVar3 = h4.g.f11906e;
                    r.J(eVar3, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar4 = h4.g.f11908g;
                    r.y(qVar2, valueOf, eVar4);
                    h4.d dVar = h4.g.f11909h;
                    r.F(dVar, qVar2);
                    h4.e eVar5 = h4.g.f11905d;
                    r.J(eVar5, c5, qVar2);
                    t e10 = p2.e(qVar3, 1.0f);
                    t tVar5 = tVar4;
                    x a11 = w.a(j.g(elevenLabsTheme.getSpacings(qVar2, i20).m2356getX4D9Ej5fM()), jVar, qVar2, 0);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    o l7 = qVar2.l();
                    t c10 = i3.a.c(e10, qVar2);
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    r.J(eVar2, a11, qVar2);
                    r.J(eVar3, l7, qVar2);
                    defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                    r.J(eVar5, c10, qVar2);
                    if (statsCarouselSection.getDaysInStreak() > 1) {
                        qVar2.X(-2043116207);
                        StreakRow(R.drawable.calendar_days, R.drawable.wave, k.d(-1741905504, true, new h3(statsCarouselSection, 7), qVar2), qVar2, 384);
                        qVar2.p(false);
                    } else {
                        qVar2.X(-2042029316);
                        qVar2.p(false);
                    }
                    String R = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.home_stats_daily_listening_goal);
                    if (statsCarouselSection.getMinutesListenedToday() < 60 && j4 < 60) {
                        qVar2.X(-620053180);
                        qVar2.p(false);
                        str = String.valueOf(statsCarouselSection.getMinutesListenedToday());
                    } else {
                        qVar2.X(-620051206);
                        String formatMinutesShort = MinutesFormatterKt.formatMinutesShort(statsCarouselSection.getMinutesListenedToday(), (m) qVar2, 0);
                        qVar2.p(false);
                        str = formatMinutesShort;
                    }
                    String Q = kj.c.Q(io.elevenlabs.readerapp.R.string.home_stats_out_of_mins_listened, new Object[]{str, MinutesFormatterKt.formatMinutesShort(j4, qVar2, (i16 >> 3) & 14)}, qVar2);
                    aVar2 = aVar3;
                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(defpackage.f.j(R, " - ", Q), aVar2, m3.h.c(qVar3, elevenLabsTheme.getShapes(qVar2, i20).getMd()), 0L, false, 0, null, false, null, k.d(1530191018, true, new g(R, Q, j4, statsCarouselSection, 1), qVar2), qVar2, ((i16 >> 6) & 112) | 805306368, 504);
                    qVar = qVar2;
                    qVar.p(true);
                    qVar.p(true);
                    tVar3 = tVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    tVar3 = tVar2;
                }
                ho.a aVar4 = aVar2;
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.components.d(statsCarouselSection, j4, tVar3, aVar4, i10, i11);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            i16 = i12;
            if ((i16 & 1171) != 1170) {
            }
            if (qVar2.O(i16 & 1, z6)) {
            }
            ho.a aVar42 = aVar2;
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        i16 = i12;
        if ((i16 & 1171) != 1170) {
        }
        if (qVar2.O(i16 & 1, z6)) {
        }
        ho.a aVar422 = aVar2;
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z HomeStatsCarouselV3$lambda$1$0$0(StatsCarouselSection statsCarouselSection, y yVar, m mVar, int i10) {
        boolean z6;
        int i11;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.home_stats_daily_streak);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i12 = ElevenLabsTheme.$stable;
            y0 subtitleSmall700 = elevenLabsTheme.getTypo(qVar, i12).getSubtitleSmall700();
            if (elevenLabsTheme.getColor(qVar, i12).isDark()) {
                i11 = 1728053247;
            } else {
                i11 = 1711276032;
            }
            j7.d(R, null, h0.c(i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, subtitleSmall700, qVar, 0, 0, 131066);
            r1.d.g(p2.f(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, i12).m2350getX1D9Ej5fM()), qVar);
            j7.d(kj.c.Q(io.elevenlabs.readerapp.R.string.home_stats_day_streak_you_re_on_a_roll, new Object[]{Integer.valueOf(statsCarouselSection.getDaysInStreak())}, qVar), null, defpackage.f.b(elevenLabsTheme, qVar, i12), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i12).getBodySmall500(), qVar, 0, 0, 131066);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeStatsCarouselV3$lambda$1$0$1(String str, String str2, long j4, StatsCarouselSection statsCarouselSection, s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            StreakRow(R.drawable.headphones_active, R.drawable.wave2, k.d(1967887785, true, new g(str, str2, j4, statsCarouselSection, 0), qVar), qVar, 384);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeStatsCarouselV3$lambda$1$0$1$0(String str, String str2, long j4, StatsCarouselSection statsCarouselSection, y yVar, m mVar, int i10) {
        boolean z6;
        int i11;
        int i12;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            x a11 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(m1Var, qVar);
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
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            y0 subtitleSmall700 = elevenLabsTheme.getTypo(qVar, i13).getSubtitleSmall700();
            if (elevenLabsTheme.getColor(qVar, i13).isDark()) {
                i11 = 1728053247;
            } else {
                i11 = 1711276032;
            }
            j7.d(str, null, h0.c(i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, subtitleSmall700, qVar, 0, 0, 131066);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2350getX1D9Ej5fM()), qVar);
            j7.d(str2, null, defpackage.f.b(elevenLabsTheme, qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodySmall500(), qVar, 0, 0, 131066);
            i.A(elevenLabsTheme, qVar, i13, qVar2, qVar);
            if (j4 > 0) {
                qVar.X(-111313808);
                ProgressBarKt.m1869ProgressBareaDK9VM(statsCarouselSection.getMinutesListenedToday() / ((float) j4), p2.f(p2.e(qVar2, 1.0f), 4), 0L, 0L, qVar, 48, 12);
                i12 = 0;
                qVar.p(false);
            } else {
                i12 = 0;
                qVar.X(-110911149);
                qVar.p(false);
            }
            qVar.p(true);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM()), qVar);
            y2.a(kd.a.M(R.drawable.chevron_right, qVar, i12), null, p2.o(r1.d.G(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM(), u.P, 2), 14), p3.x.b(0.4f, p3.x.f26427b), qVar, u3.c.$stable | 3120, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z HomeStatsCarouselV3$lambda$2(StatsCarouselSection statsCarouselSection, long j4, t tVar, ho.a aVar, int i10, int i11, m mVar, int i12) {
        HomeStatsCarouselV3(statsCarouselSection, j4, tVar, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1262151280);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 30L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 8);
        }
    }

    public static final z Preview_HomeStatsCarouselV3$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_above_streak(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1184895295);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 999, 1, null), 30L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 7);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_above_streak$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_above_streak(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_above_streak_home_v2_version(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1829729781);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 999, 1, null), 30L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 3);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_above_streak_home_v2_version$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_above_streak_home_v2_version(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_hour_to_hour(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(701615852);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 70, 1, null), 120L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 5);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_hour_to_hour$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_hour_to_hour(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_middle_streak(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(927539481);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 15, 1, null), 30L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 10);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_middle_streak$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_middle_streak(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_minutes(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(764860944);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 10, 1, null), 30L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 9);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_minutes$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_minutes(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_minutes_to_hour(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-604487879);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 10, 1, null), 120L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 11);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_minutes_to_hour$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_minutes_to_hour(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_zero_days(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(641932095);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 0, 2, null), 30L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 6);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_zero_days$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_zero_days(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeStatsCarouselV3_zero_minutes(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(188608295);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            HomeStatsCarouselV3(StatsCarouselSection.copy$default(HomeFactoryKt.stubStatsCarouselSectionDataV3(), 0, 0, 1, null), 30L, null, null, qVar, 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 4);
        }
    }

    public static final z Preview_HomeStatsCarouselV3_zero_minutes$lambda$1(int i10, m mVar, int i11) {
        Preview_HomeStatsCarouselV3_zero_minutes(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void StreakRow(int i10, final int i11, ho.q qVar, m mVar, final int i12) {
        int i13;
        boolean z6;
        final ho.q qVar2;
        long j4;
        int i14;
        int i15;
        int i16;
        final int i17 = i10;
        q qVar3 = (q) mVar;
        qVar3.Z(692790568);
        if ((i12 & 6) == 0) {
            if (qVar3.d(i17)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i13 = i16 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            if (qVar3.d(i11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 384) == 0) {
            if (qVar3.h(qVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        int i18 = i13;
        if ((i18 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i18 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i19 = ElevenLabsTheme.$stable;
            b1 mx = elevenLabsTheme.getShapes(qVar3, i19).getMx();
            i3.q qVar4 = i3.q.f13017a;
            t h10 = n.h(m3.h.c(r1.d.t(p2.e(qVar4, 1.0f), i1.f29224a), mx), h0.e(4294177779L), h0.f26395b);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar3.T);
            o l4 = qVar3.l();
            t c5 = i3.a.c(h10, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d10, qVar3);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar3, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar3);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar3);
            int i20 = i18 >> 3;
            u3.c M = kd.a.M(i11, qVar3, i20 & 14);
            t c10 = m3.h.c(r1.t.f29349a.a(), mx);
            f4.p pVar = f4.q.f8839b;
            int i21 = u3.c.$stable;
            n.c(M, null, c10, null, pVar, u.P, null, qVar3, i21 | 24624, 104);
            t F = r1.d.F(n.j(1, h0.c(167772160), p2.e(qVar4, 1.0f), mx), elevenLabsTheme.getSpacings(qVar3, i19).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar3, i19).m2358getX6D9Ej5fM());
            u0 u0Var = j.f29228a;
            k2 a10 = i2.a(j.g(elevenLabsTheme.getSpacings(qVar3, i19).m2355getX3D9Ej5fM()), i3.d.f13005z0, qVar3, 48);
            int hashCode2 = Long.hashCode(qVar3.T);
            o l7 = qVar3.l();
            t c11 = i3.a.c(F, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar, a10, qVar3);
            r.J(eVar2, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
            r.J(eVar4, c11, qVar3);
            t o6 = p2.o(qVar4, 50);
            if (elevenLabsTheme.getColor(qVar3, i19).isDark()) {
                j4 = 2986344448L;
            } else {
                j4 = 3003121663L;
            }
            t h11 = n.h(o6, h0.e(j4), elevenLabsTheme.getShapes(qVar3, i19).getFull());
            f1 d11 = p.d(i3.d.f13001e, false);
            int hashCode3 = Long.hashCode(qVar3.T);
            o l10 = qVar3.l();
            t c12 = i3.a.c(h11, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar, d11, qVar3);
            r.J(eVar2, l10, qVar3);
            defpackage.f.u(hashCode3, qVar3, eVar3, qVar3, dVar);
            r.J(eVar4, c12, qVar3);
            i17 = i10;
            y2.a(kd.a.M(i10, qVar3, i18 & 14), null, p2.o(qVar4, 24), defpackage.f.b(elevenLabsTheme, qVar3, i19), qVar3, i21 | 432, 0);
            qVar3 = qVar3;
            qVar3.p(true);
            x a11 = w.a(j.f29230c, i3.d.B0, qVar3, 0);
            int hashCode4 = Long.hashCode(qVar3.T);
            o l11 = qVar3.l();
            t c13 = i3.a.c(qVar4, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar);
            } else {
                qVar3.k0();
            }
            r.J(eVar, a11, qVar3);
            r.J(eVar2, l11, qVar3);
            defpackage.f.u(hashCode4, qVar3, eVar3, qVar3, dVar);
            r.J(eVar4, c13, qVar3);
            qVar2 = qVar;
            qVar2.invoke(r1.z.f29398a, qVar3, Integer.valueOf((i20 & 112) | 6));
            qVar3.p(true);
            qVar3.p(true);
            qVar3.p(true);
        } else {
            qVar2 = qVar;
            qVar3.R();
        }
        r1 r10 = qVar3.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.h
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z StreakRow$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    StreakRow$lambda$1 = HomeStatsCarouselKt.StreakRow$lambda$1(i17, i11, qVar2, i12, (m) obj, intValue);
                    return StreakRow$lambda$1;
                }
            };
        }
    }

    public static final z StreakRow$lambda$1(int i10, int i11, ho.q qVar, int i12, m mVar, int i13) {
        StreakRow(i10, i11, qVar, mVar, r.M(i12 | 1));
        return z.f31622a;
    }
}
