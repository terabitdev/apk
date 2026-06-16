package io.elevenlabs.readerapp.ui.screens.authenticated.home.elements;

import androidx.lifecycle.o;
import androidx.lifecycle.r1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import h4.g;
import h4.h;
import ho.p;
import i3.j;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import pl.f;
import q2.j7;
import q2.y2;
import r1.i1;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.e;
import u2.g1;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.y0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/elements/DailyStreakSettingsViewModel;", "vm", "DailyStreakSettingsScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/home/elements/DailyStreakSettingsViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/home/elements/DailyStreakSettingsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "DailyStreakSettingsScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/home/elements/DailyStreakSettingsState;Lho/l;Lu2/m;II)V", "Preview_DailyStreakSettingsScreenUI_idle", "(Lu2/m;I)V", "Preview_DailyStreakSettingsScreenUI_loaded", "", "goalMinutes", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DailyStreakSettingsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DailyStreakSettingsScreen(ho.a aVar, DailyStreakSettingsViewModel dailyStreakSettingsViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        DailyStreakSettingsViewModel dailyStreakSettingsViewModel2;
        q7.c cVar;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        int i13;
        int i14;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1425149863);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar.h(dailyStreakSettingsViewModel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z10 = true;
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof o) {
                        cVar = ((o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    dailyStreakSettingsViewModel2 = (DailyStreakSettingsViewModel) gg.b.j0(e0.f20562a.b(DailyStreakSettingsViewModel.class), a10, null, o6, cVar, qVar);
                    i12 &= -113;
                    qVar.q();
                    DailyStreakSettingsState dailyStreakSettingsState = (DailyStreakSettingsState) r.o(dailyStreakSettingsViewModel2.getStateFlow(), qVar, 0).getValue();
                    Boolean valueOf = Boolean.valueOf(dailyStreakSettingsState.getClose());
                    boolean f10 = qVar.f(dailyStreakSettingsState);
                    if ((i12 & 14) != 4) {
                        z10 = false;
                    }
                    h10 = f10 | z10 | qVar.h(dailyStreakSettingsViewModel2);
                    L = qVar.L();
                    e eVar = l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new DailyStreakSettingsScreenKt$DailyStreakSettingsScreen$1$1(dailyStreakSettingsState, aVar, dailyStreakSettingsViewModel2, null);
                        qVar.h0(L);
                    }
                    r.f((p) L, valueOf, qVar);
                    h11 = qVar.h(dailyStreakSettingsViewModel2);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new c(dailyStreakSettingsViewModel2, 2);
                        qVar.h0(L2);
                    }
                    DailyStreakSettingsScreenUI(dailyStreakSettingsState, (ho.l) L2, qVar, 0, 0);
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            dailyStreakSettingsViewModel2 = dailyStreakSettingsViewModel;
            qVar.q();
            DailyStreakSettingsState dailyStreakSettingsState2 = (DailyStreakSettingsState) r.o(dailyStreakSettingsViewModel2.getStateFlow(), qVar, 0).getValue();
            Boolean valueOf2 = Boolean.valueOf(dailyStreakSettingsState2.getClose());
            boolean f102 = qVar.f(dailyStreakSettingsState2);
            if ((i12 & 14) != 4) {
            }
            h10 = f102 | z10 | qVar.h(dailyStreakSettingsViewModel2);
            L = qVar.L();
            e eVar2 = l.f33918a;
            if (!h10) {
            }
            L = new DailyStreakSettingsScreenKt$DailyStreakSettingsScreen$1$1(dailyStreakSettingsState2, aVar, dailyStreakSettingsViewModel2, null);
            qVar.h0(L);
            r.f((p) L, valueOf2, qVar);
            h11 = qVar.h(dailyStreakSettingsViewModel2);
            L2 = qVar.L();
            if (!h11) {
            }
            L2 = new c(dailyStreakSettingsViewModel2, 2);
            qVar.h0(L2);
            DailyStreakSettingsScreenUI(dailyStreakSettingsState2, (ho.l) L2, qVar, 0, 0);
        } else {
            qVar.R();
            dailyStreakSettingsViewModel2 = dailyStreakSettingsViewModel;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(aVar, dailyStreakSettingsViewModel2, i10, i11, 13);
        }
    }

    public static final z DailyStreakSettingsScreen$lambda$1$0(DailyStreakSettingsViewModel dailyStreakSettingsViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(dailyStreakSettingsViewModel);
        return z.f31622a;
    }

    public static final z DailyStreakSettingsScreen$lambda$2(ho.a aVar, DailyStreakSettingsViewModel dailyStreakSettingsViewModel, int i10, int i11, m mVar, int i12) {
        DailyStreakSettingsScreen(aVar, dailyStreakSettingsViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0326, code lost:
    
        if (r3 == r11) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DailyStreakSettingsScreenUI(DailyStreakSettingsState dailyStreakSettingsState, ho.l lVar, m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        boolean z6;
        q qVar;
        ho.l lVar3;
        u2.r1 r10;
        ho.l lVar4;
        h4.f fVar;
        e eVar;
        ElevenLabsTheme elevenLabsTheme;
        int i15;
        boolean z10;
        List list;
        y0 y0Var;
        i3.q qVar2;
        ho.l lVar5;
        int i16;
        dailyStreakSettingsState.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(-1662129493);
        if ((i10 & 6) == 0) {
            if (qVar3.f(dailyStreakSettingsState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i10 | i16;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar3.h(lVar2)) {
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
            if (!qVar3.O(i14 & 1, z6)) {
                e eVar2 = l.f33918a;
                if (i17 != 0) {
                    Object L = qVar3.L();
                    if (L == eVar2) {
                        L = new d(2);
                        qVar3.h0(L);
                    }
                    lVar4 = (ho.l) L;
                } else {
                    lVar4 = lVar2;
                }
                Object L2 = qVar3.L();
                if (L2 == eVar2) {
                    L2 = ig.f.I(5L, 10L, 15L, 30L, 45L, 60L, 90L, 120L, 180L, 240L, 300L, 360L, 420L, 480L, 540L, 600L, 660L, 720L);
                    qVar3.h0(L2);
                }
                final List list2 = (List) L2;
                boolean e10 = qVar3.e(dailyStreakSettingsState.getGoalMinutes());
                Object L3 = qVar3.L();
                if (e10 || L3 == eVar2) {
                    g1 g1Var = new g1(dailyStreakSettingsState.getGoalMinutes());
                    qVar3.h0(g1Var);
                    L3 = g1Var;
                }
                final y0 y0Var2 = (y0) L3;
                j jVar = i3.d.C0;
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                float m2358getX6D9Ej5fM = elevenLabsTheme2.getSpacings(qVar3, i18).m2358getX6D9Ej5fM();
                i3.q qVar4 = i3.q.f13017a;
                t e11 = p2.e(r1.d.E(qVar4, m2358getX6D9Ej5fM), 1.0f);
                x a10 = w.a(r1.j.f29230c, jVar, qVar3, 48);
                int hashCode = Long.hashCode(qVar3.T);
                c3.o l4 = qVar3.l();
                t c5 = i3.a.c(e11, qVar3);
                h.f11920i.getClass();
                h4.f fVar2 = g.f11903b;
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar2);
                } else {
                    qVar3.k0();
                }
                h4.e eVar3 = g.f11907f;
                r.J(eVar3, a10, qVar3);
                h4.e eVar4 = g.f11906e;
                r.J(eVar4, l4, qVar3);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar5 = g.f11908g;
                r.y(qVar3, valueOf, eVar5);
                h4.d dVar = g.f11909h;
                r.F(dVar, qVar3);
                h4.e eVar6 = g.f11905d;
                r.J(eVar6, c5, qVar3);
                t h10 = n.h(p2.o(qVar4, 50), defpackage.f.b(elevenLabsTheme2, qVar3, i18), elevenLabsTheme2.getShapes(qVar3, i18).getFull());
                i3.l lVar6 = i3.d.f13001e;
                f1 d10 = r1.p.d(lVar6, false);
                int hashCode2 = Long.hashCode(qVar3.T);
                c3.o l7 = qVar3.l();
                t c10 = i3.a.c(h10, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar2);
                } else {
                    qVar3.k0();
                }
                r.J(eVar3, d10, qVar3);
                r.J(eVar4, l7, qVar3);
                defpackage.f.u(hashCode2, qVar3, eVar5, qVar3, dVar);
                r.J(eVar6, c10, qVar3);
                y2.a(kd.a.M(R.drawable.headphones_active, qVar3, 0), null, p2.o(qVar4, 24), i.d(elevenLabsTheme2, qVar3, i18), qVar3, u3.c.$stable | 432, 0);
                qVar3.p(true);
                r1.d.g(p2.f(qVar4, elevenLabsTheme2.getSpacings(qVar3, i18).m2356getX4D9Ej5fM()), qVar3);
                ho.l lVar7 = lVar4;
                j7.d(kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.daily_streak_settings_set_a_listening_goal), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar3, i18).getBodyMedium700(), qVar3, 0, 0, 131070);
                r1.d.g(p2.f(qVar4, elevenLabsTheme2.getSpacings(qVar3, i18).m2350getX1D9Ej5fM()), qVar3);
                j7.d(kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.daily_streak_settings_how_much_content), null, i.w(elevenLabsTheme2, qVar3, i18), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar3, i18).getBodyXSmall500(), qVar3, 0, 0, 131066);
                r1.d.g(p2.f(qVar4, elevenLabsTheme2.getSpacings(qVar3, i18).m2351getX10D9Ej5fM()), qVar3);
                t t10 = r1.d.t(p2.e(qVar4, 1.0f), i1.f29224a);
                k2 a11 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar3, 0);
                int hashCode3 = Long.hashCode(qVar3.T);
                c3.o l10 = qVar3.l();
                t c11 = i3.a.c(t10, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    fVar = fVar2;
                    qVar3.k(fVar);
                } else {
                    fVar = fVar2;
                    qVar3.k0();
                }
                r.J(eVar3, a11, qVar3);
                r.J(eVar4, l10, qVar3);
                defpackage.f.u(hashCode3, qVar3, eVar5, qVar3, dVar);
                r.J(eVar6, c11, qVar3);
                int i19 = R.drawable.minus_large;
                String R = kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.daily_streak_settings_accessibility_decrement);
                boolean f10 = qVar3.f(y0Var2) | qVar3.h(list2);
                Object L4 = qVar3.L();
                if (!f10) {
                    eVar = eVar2;
                } else {
                    eVar = eVar2;
                }
                final int i20 = 0;
                L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.b
                    @Override // ho.a
                    public final Object invoke() {
                        z DailyStreakSettingsScreenUI$lambda$5$1$0$0;
                        z DailyStreakSettingsScreenUI$lambda$5$1$2$0;
                        switch (i20) {
                            case 0:
                                DailyStreakSettingsScreenUI$lambda$5$1$0$0 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreenUI$lambda$5$1$0$0(list2, y0Var2);
                                return DailyStreakSettingsScreenUI$lambda$5$1$0$0;
                            default:
                                DailyStreakSettingsScreenUI$lambda$5$1$2$0 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreenUI$lambda$5$1$2$0(list2, y0Var2);
                                return DailyStreakSettingsScreenUI$lambda$5$1$2$0;
                        }
                    }
                };
                qVar3.h0(L4);
                ButtonIconVariant buttonIconVariant = ButtonIconVariant.Square;
                e eVar7 = eVar;
                h4.f fVar3 = fVar;
                ButtonIconKt.ButtonIcon(i19, R, (ho.a) L4, null, buttonIconVariant, null, false, false, false, qVar3, 24576, 488);
                q qVar5 = qVar3;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t h11 = n.h(m3.h.c(r1.d.G(p2.c(new m1(1.0f, true), 1.0f), elevenLabsTheme2.getSpacings(qVar5, i18).m2356getX4D9Ej5fM(), u.P, 2), elevenLabsTheme2.getShapes(qVar5, i18).getMd()), elevenLabsTheme2.getColor(qVar5, i18).getDivider().m2058getLightLine0d7_KjU(), h0.f26395b);
                f1 d11 = r1.p.d(lVar6, false);
                int hashCode4 = Long.hashCode(qVar5.T);
                c3.o l11 = qVar5.l();
                t c12 = i3.a.c(h11, qVar5);
                qVar5.b0();
                if (qVar5.S) {
                    qVar5.k(fVar3);
                } else {
                    qVar5.k0();
                }
                r.J(eVar3, d11, qVar5);
                r.J(eVar4, l11, qVar5);
                defpackage.f.u(hashCode4, qVar5, eVar5, qVar5, dVar);
                r.J(eVar6, c12, qVar5);
                if (DailyStreakSettingsScreenUI$lambda$3(y0Var2) > 0) {
                    qVar5.X(1518070583);
                    y0Var = y0Var2;
                    i15 = i18;
                    elevenLabsTheme = elevenLabsTheme2;
                    qVar2 = qVar4;
                    list = list2;
                    j7.d(MinutesFormatterKt.formatMinutesShort(DailyStreakSettingsScreenUI$lambda$3(y0Var2), qVar5, 0), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar5, i18).getBodyMedium700(), qVar5, 0, 0, 131070);
                    qVar5 = qVar5;
                    z10 = false;
                    qVar5.p(false);
                } else {
                    elevenLabsTheme = elevenLabsTheme2;
                    i15 = i18;
                    z10 = false;
                    list = list2;
                    y0Var = y0Var2;
                    qVar2 = qVar4;
                    qVar5.X(1518255095);
                    qVar5.p(false);
                }
                qVar5.p(true);
                int i21 = R.drawable.plus_large;
                String R2 = kj.c.R(qVar5, io.elevenlabs.readerapp.R.string.daily_streak_settings_accessibility_increment);
                final y0 y0Var3 = y0Var;
                final List list3 = list;
                boolean f11 = qVar5.f(y0Var3) | qVar5.h(list3);
                Object L5 = qVar5.L();
                if (f11 || L5 == eVar7) {
                    final int i22 = 1;
                    L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.b
                        @Override // ho.a
                        public final Object invoke() {
                            z DailyStreakSettingsScreenUI$lambda$5$1$0$0;
                            z DailyStreakSettingsScreenUI$lambda$5$1$2$0;
                            switch (i22) {
                                case 0:
                                    DailyStreakSettingsScreenUI$lambda$5$1$0$0 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreenUI$lambda$5$1$0$0(list3, y0Var3);
                                    return DailyStreakSettingsScreenUI$lambda$5$1$0$0;
                                default:
                                    DailyStreakSettingsScreenUI$lambda$5$1$2$0 = DailyStreakSettingsScreenKt.DailyStreakSettingsScreenUI$lambda$5$1$2$0(list3, y0Var3);
                                    return DailyStreakSettingsScreenUI$lambda$5$1$2$0;
                            }
                        }
                    };
                    qVar5.h0(L5);
                }
                q qVar6 = qVar5;
                ButtonIconKt.ButtonIcon(i21, R2, (ho.a) L5, null, buttonIconVariant, null, false, false, false, qVar6, 24576, 488);
                qVar6.p(true);
                i3.q qVar7 = qVar2;
                r1.d.g(p2.f(qVar7, elevenLabsTheme.getSpacings(qVar6, i15).m2351getX10D9Ej5fM()), qVar6);
                String R3 = kj.c.R(qVar6, io.elevenlabs.readerapp.R.string.daily_streak_settings_save_listening_goal);
                if ((i14 & 112) == 32) {
                    z10 = true;
                }
                boolean f12 = qVar6.f(y0Var3) | z10;
                Object L6 = qVar6.L();
                if (!f12 && L6 != eVar7) {
                    lVar5 = lVar7;
                } else {
                    lVar5 = lVar7;
                    L6 = new a2.q(lVar5, y0Var3, 24);
                    qVar6.h0(L6);
                }
                ButtonKt.Button(R3, (ho.a) L6, p2.e(qVar7, 1.0f), null, ButtonVariant.Secondary, null, null, dailyStreakSettingsState.isLoading(), false, false, qVar6, 24960, 872);
                qVar = qVar6;
                qVar.p(true);
                lVar3 = lVar5;
            } else {
                qVar = qVar3;
                qVar.R();
                lVar3 = lVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.p((Object) dailyStreakSettingsState, lVar3, i10, i11, 12);
                return;
            }
            return;
        }
        lVar2 = lVar;
        i14 = i12;
        if ((i14 & 19) == 18) {
        }
        if (!qVar3.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z DailyStreakSettingsScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    private static final long DailyStreakSettingsScreenUI$lambda$3(y0 y0Var) {
        return ((g1) y0Var).h();
    }

    private static final void DailyStreakSettingsScreenUI$lambda$4(y0 y0Var, long j4) {
        ((g1) y0Var).i(j4);
    }

    public static final z DailyStreakSettingsScreenUI$lambda$5$1$0$0(List list, y0 y0Var) {
        long longValue;
        Long l4 = (Long) tn.o.z0(list.indexOf(Long.valueOf(DailyStreakSettingsScreenUI$lambda$3(y0Var))) - 1, list);
        if (l4 != null) {
            longValue = l4.longValue();
        } else {
            longValue = ((Number) tn.o.w0(list)).longValue();
        }
        DailyStreakSettingsScreenUI$lambda$4(y0Var, longValue);
        return z.f31622a;
    }

    public static final z DailyStreakSettingsScreenUI$lambda$5$1$2$0(List list, y0 y0Var) {
        long longValue;
        Long l4 = (Long) tn.o.z0(list.indexOf(Long.valueOf(DailyStreakSettingsScreenUI$lambda$3(y0Var))) + 1, list);
        if (l4 != null) {
            longValue = l4.longValue();
        } else {
            longValue = ((Number) tn.o.G0(list)).longValue();
        }
        DailyStreakSettingsScreenUI$lambda$4(y0Var, longValue);
        return z.f31622a;
    }

    public static final z DailyStreakSettingsScreenUI$lambda$5$2$0(ho.l lVar, y0 y0Var) {
        lVar.invoke(new c(y0Var, 1));
        return z.f31622a;
    }

    public static final z DailyStreakSettingsScreenUI$lambda$5$2$0$0(y0 y0Var, DailyStreakSettingsViewModel dailyStreakSettingsViewModel) {
        dailyStreakSettingsViewModel.getClass();
        dailyStreakSettingsViewModel.save(Long.valueOf(DailyStreakSettingsScreenUI$lambda$3(y0Var)));
        return z.f31622a;
    }

    public static final z DailyStreakSettingsScreenUI$lambda$6(DailyStreakSettingsState dailyStreakSettingsState, ho.l lVar, int i10, int i11, m mVar, int i12) {
        DailyStreakSettingsScreenUI(dailyStreakSettingsState, lVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_DailyStreakSettingsScreenUI_idle(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-870424331);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DailyStreakSettingsScreenUI(new DailyStreakSettingsState(0L, false, false, 7, null), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 22);
        }
    }

    public static final z Preview_DailyStreakSettingsScreenUI_idle$lambda$0(int i10, m mVar, int i11) {
        Preview_DailyStreakSettingsScreenUI_idle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_DailyStreakSettingsScreenUI_loaded(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-715794780);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DailyStreakSettingsScreenUI(new DailyStreakSettingsState(10L, false, false, 6, null), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.g(i10, 21);
        }
    }

    public static final z Preview_DailyStreakSettingsScreenUI_loaded$lambda$0(int i10, m mVar, int i11) {
        Preview_DailyStreakSettingsScreenUI_loaded(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
