package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import a2.l0;
import a2.s1;
import ae.l;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import e5.k;
import i3.t;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.k0;
import io.elevenlabs.readerapp.ui.components.q0;
import io.elevenlabs.readerapp.ui.screens.authenticated.c1;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.PlanBadgeKt;
import io.elevenlabs.ui.components.PlanBadgeStyles;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeSpacings;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.e0;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u001aI\u0010\n\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u000f\u0010 \u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001e\u001a\u000f\u0010!\u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lio/elevenlabs/domain/model/User;", "user", "Lio/elevenlabs/domain/model/AccountPage$Section$Credits;", "creditsSection", "Lio/elevenlabs/domain/model/AccountPage$Section$CreditsUnlimited;", "unlimitedSection", "Lkotlin/Function0;", "Lsn/z;", "onNavigateToGetMoreCredits", "onNavigateToPaywall", "AccountSummary", "(Lio/elevenlabs/domain/model/User;Lio/elevenlabs/domain/model/AccountPage$Section$Credits;Lio/elevenlabs/domain/model/AccountPage$Section$CreditsUnlimited;Lho/a;Lho/a;Lu2/m;I)V", "", ParameterNames.TEXT, "Li3/t;", "modifier", "Lp3/x;", "color", "Ls4/y0;", "style", "TextSectionTitle-cf5BqRc", "(Ljava/lang/String;Li3/t;JLs4/y0;Lu2/m;II)V", "TextSectionTitle", "AccountHourRenewalText", "(Ljava/lang/String;Lu2/m;I)V", "", "canUpgrade", "CreditsActionButtons", "(ZLho/a;Lho/a;Lu2/m;I)V", "Preview_AccountSummary_Free", "(Lu2/m;I)V", "Preview_AccountSummary_Paid", "Preview_AccountSummary_NoDisplayName", "Preview_AccountSummary_UnlimitedBadgeOnly", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountSummaryKt {
    private static final void AccountHourRenewalText(String str, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        q qVar2 = (q) mVar;
        qVar2.Z(787635982);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            Map singletonMap = Collections.singletonMap(ParameterNames.ICON, new s1(new e0(l.K(16), 4, l.K(16)), ComposableSingletons$AccountSummaryKt.INSTANCE.getLambda$1255901868$app_productionRelease()));
            singletonMap.getClass();
            s4.e eVar = new s4.e();
            l0.n(eVar, ParameterNames.ICON);
            eVar.d(Separators.SP + str);
            s4.h k4 = eVar.k();
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            qVar = qVar2;
            j7.e(k4, p2.e(i3.q.f13017a, 1.0f), echoTheme.getColors(qVar2, i13).getText().getTertiary(qVar2, EchoThemeColors.Text.$stable), 0L, 0L, new k(3), 0L, 0, false, 0, 0, singletonMap, null, echoTheme.getTypography(qVar2, i13).getSmRegular400(qVar2, EchoThemeTypography.$stable), qVar, 48, 0, 195576);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q0(str, i10, 3);
        }
    }

    public static final z AccountHourRenewalText$lambda$1(String str, int i10, m mVar, int i11) {
        AccountHourRenewalText(str, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f9, code lost:
    
        if (r10 == null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e7, code lost:
    
        if (r10 == u2.l.f33918a) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSummary(User user, AccountPage.Section.Credits credits, AccountPage.Section.CreditsUnlimited creditsUnlimited, ho.a aVar, ho.a aVar2, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        String str;
        String str2;
        int i12;
        String str3;
        String str4;
        String str5;
        Integer num;
        String str6;
        String description;
        Object obj;
        String str7;
        String currentPlan;
        boolean z10;
        String str8;
        String str9;
        q qVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        aVar.getClass();
        aVar2.getClass();
        q qVar3 = (q) mVar;
        qVar3.Z(985879720);
        if ((i10 & 6) == 0) {
            if (qVar3.h(user)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(credits)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(creditsUnlimited)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(aVar)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.h(aVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i11 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i18 = EchoTheme.$stable;
            EchoThemeSpacings spacings = echoTheme.getSpacings(qVar3, i18);
            if (user == null || (str = user.getName()) == null || n.m0(str)) {
                str = null;
            }
            if (user != null) {
                str2 = user.getEmail();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str == null) {
                i12 = i18;
                if (!n.m0(str2)) {
                    str3 = str2;
                } else {
                    str3 = null;
                }
            } else {
                i12 = i18;
                str3 = str;
            }
            if (!n.m0(str2) && !str2.equalsIgnoreCase(str3)) {
                str4 = str2;
            } else {
                str4 = null;
            }
            if (credits != null) {
                str5 = credits.getTimeText();
            } else {
                str5 = null;
            }
            if (credits != null) {
                num = Integer.valueOf(credits.getCounterNumber());
            } else {
                num = null;
            }
            boolean f10 = qVar3.f(credits);
            Object L = qVar3.L();
            if (!f10) {
                obj = L;
            }
            if (credits != null && (description = credits.getDescription()) != null) {
                boolean m02 = n.m0(description);
                str6 = description;
                if (m02) {
                    str6 = null;
                }
            }
            if (credits == null || (str6 = credits.getTimeText()) == null || n.m0(str6)) {
                str6 = null;
            }
            qVar3.h0(str6);
            obj = str6;
            String str10 = (String) obj;
            if (credits == null || (currentPlan = credits.getCurrentPlan()) == null) {
                if (creditsUnlimited != null) {
                    currentPlan = creditsUnlimited.getCurrentPlan();
                } else {
                    str7 = null;
                    if ((credits == null && credits.isPaidPlan()) || creditsUnlimited != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i3.q qVar4 = i3.q.f13017a;
                    int i19 = i11;
                    t G = r1.d.G(p2.e(qVar4, 1.0f), spacings.getX6(), u.P, 2);
                    x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar3, 48);
                    int hashCode = Long.hashCode(qVar3.T);
                    o l4 = qVar3.l();
                    t c5 = i3.a.c(G, qVar3);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar3.b0();
                    if (!qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    r.J(h4.g.f11907f, a10, qVar3);
                    r.J(h4.g.f11906e, l4, qVar3);
                    r.y(qVar3, Integer.valueOf(hashCode), h4.g.f11908g);
                    r.F(h4.g.f11909h, qVar3);
                    r.J(h4.g.f11905d, c5, qVar3);
                    r1.d.g(p2.f(qVar4, spacings.getX6()), qVar3);
                    if (user == null) {
                        str8 = user.getPhoto();
                    } else {
                        str8 = null;
                    }
                    str9 = str3;
                    int i20 = i12;
                    AccountAvatarKt.m1235AccountAvatarhGBTI10(str, str2, null, u.P, str8, qVar3, 0, 12);
                    r1.d.g(p2.f(qVar4, spacings.getX4()), qVar3);
                    if (str7 != null) {
                        qVar3.X(690460425);
                        qVar3.p(false);
                        qVar2 = qVar3;
                    } else {
                        qVar3.X(690460426);
                        PlanBadgeKt.PlanBadge(str7, z10, PlanBadgeStyles.INSTANCE.echo(qVar3, 6), qVar3, 0, 0);
                        q qVar5 = qVar3;
                        r1.d.g(p2.f(qVar4, spacings.getX2()), qVar5);
                        qVar5.p(false);
                        qVar2 = qVar5;
                    }
                    if (str9 != null) {
                        qVar2.X(690711463);
                        qVar2.p(false);
                    } else {
                        m1236TextSectionTitlecf5BqRc(str9, null, ib.i.g(690711464, i20, echoTheme, qVar2, qVar2).getPrimary(qVar2, EchoThemeColors.Text.$stable), echoTheme.getTypography(qVar2, i20).getLgRegular500(qVar2, EchoThemeTypography.$stable), qVar2, 0, 2);
                        qVar2.p(false);
                    }
                    r1.d.g(p2.f(qVar4, spacings.getX0_5()), qVar2);
                    if (str4 != null) {
                        qVar2.X(690994214);
                        qVar2.p(false);
                    } else {
                        m1236TextSectionTitlecf5BqRc(str4, null, ib.i.g(690994215, i20, echoTheme, qVar2, qVar2).getTertiary(qVar2, EchoThemeColors.Text.$stable), echoTheme.getTypography(qVar2, i20).getSmCompact400(qVar2, EchoThemeTypography.$stable), qVar2, 0, 2);
                        qVar2.p(false);
                    }
                    r1.d.g(p2.f(qVar4, spacings.getX6()), qVar2);
                    if (str5 != null) {
                        qVar2.X(691264627);
                    } else {
                        qVar2.X(691264628);
                        m1236TextSectionTitlecf5BqRc(str5, null, 0L, null, qVar2, 0, 14);
                    }
                    qVar2.p(false);
                    r1.d.g(p2.f(qVar4, spacings.getX3()), qVar2);
                    if (num != null) {
                        qVar2.X(691381838);
                        qVar2.p(false);
                    } else {
                        qVar2.X(691381839);
                        AccountDurationCounterKt.AccountDurationCounter(String.valueOf(num.intValue()), qVar2, 0);
                        qVar2.p(false);
                    }
                    if (str10 != null) {
                        qVar2.X(691470653);
                        qVar2.p(false);
                    } else {
                        qVar2.X(691470654);
                        r1.d.g(p2.f(qVar4, spacings.getX3()), qVar2);
                        AccountHourRenewalText(str10, qVar2, 0);
                        qVar2.p(false);
                    }
                    if (credits != null) {
                        qVar2.X(691615268);
                        qVar2.p(false);
                    } else {
                        qVar2.X(691615269);
                        r1.d.g(p2.f(qVar4, spacings.getX8()), qVar2);
                        CreditsActionButtons(credits.getCanUpgrade(), aVar, aVar2, qVar2, (i19 >> 6) & 1008);
                        qVar2.p(false);
                    }
                    r1.d.g(p2.f(qVar4, spacings.getX6()), qVar2);
                    qVar2.p(true);
                    qVar = qVar2;
                }
            }
            str7 = currentPlan;
            if (credits == null) {
            }
            z10 = false;
            i3.q qVar42 = i3.q.f13017a;
            int i192 = i11;
            t G2 = r1.d.G(p2.e(qVar42, 1.0f), spacings.getX6(), u.P, 2);
            x a102 = w.a(r1.j.f29230c, i3.d.C0, qVar3, 48);
            int hashCode2 = Long.hashCode(qVar3.T);
            o l42 = qVar3.l();
            t c52 = i3.a.c(G2, qVar3);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar3.b0();
            if (!qVar3.S) {
            }
            r.J(h4.g.f11907f, a102, qVar3);
            r.J(h4.g.f11906e, l42, qVar3);
            r.y(qVar3, Integer.valueOf(hashCode2), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar3);
            r.J(h4.g.f11905d, c52, qVar3);
            r1.d.g(p2.f(qVar42, spacings.getX6()), qVar3);
            if (user == null) {
            }
            str9 = str3;
            int i202 = i12;
            AccountAvatarKt.m1235AccountAvatarhGBTI10(str, str2, null, u.P, str8, qVar3, 0, 12);
            r1.d.g(p2.f(qVar42, spacings.getX4()), qVar3);
            if (str7 != null) {
            }
            if (str9 != null) {
            }
            r1.d.g(p2.f(qVar42, spacings.getX0_5()), qVar2);
            if (str4 != null) {
            }
            r1.d.g(p2.f(qVar42, spacings.getX6()), qVar2);
            if (str5 != null) {
            }
            qVar2.p(false);
            r1.d.g(p2.f(qVar42, spacings.getX3()), qVar2);
            if (num != null) {
            }
            if (str10 != null) {
            }
            if (credits != null) {
            }
            r1.d.g(p2.f(qVar42, spacings.getX6()), qVar2);
            qVar2.p(true);
            qVar = qVar2;
        } else {
            qVar3.R();
            qVar = qVar3;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.f(user, credits, creditsUnlimited, aVar, aVar2, i10, 3);
        }
    }

    public static final z AccountSummary$lambda$5(User user, AccountPage.Section.Credits credits, AccountPage.Section.CreditsUnlimited creditsUnlimited, ho.a aVar, ho.a aVar2, int i10, m mVar, int i11) {
        AccountSummary(user, credits, creditsUnlimited, aVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void CreditsActionButtons(boolean z6, ho.a aVar, ho.a aVar2, m mVar, int i10) {
        int i11;
        ho.a aVar3;
        boolean z10;
        int i12;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(1524765582);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar3 = aVar;
            if (qVar.h(aVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        } else {
            aVar3 = aVar;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            u0 u0Var = r1.j.f29228a;
            x a10 = w.a(r1.j.g(EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX6()), i3.d.B0, qVar, 0);
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
            if (z6) {
                qVar.X(1490574765);
                AccountUpgradeToUltraBoxKt.AccountUpgradeToUltraBox(aVar2, qVar, (i11 >> 6) & 14);
                qVar.p(false);
            } else {
                qVar.X(1490664138);
                qVar.p(false);
            }
            ho.a aVar4 = aVar3;
            FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar, R.string.account_get_more_hours), aVar4, p2.e(qVar2, 1.0f), FullWidthButtonSize.Large, FullWidthButtonVariant.Border, null, false, false, false, qVar, (i11 & 112) | 28032, 480);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(z6, aVar, aVar2, i10, 0);
        }
    }

    public static final z CreditsActionButtons$lambda$1(boolean z6, ho.a aVar, ho.a aVar2, int i10, m mVar, int i11) {
        CreditsActionButtons(z6, aVar, aVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountSummary_Free(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(791520626);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountSummaryKt.INSTANCE.m1240getLambda$1665014836$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 23);
        }
    }

    public static final z Preview_AccountSummary_Free$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountSummary_Free(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountSummary_NoDisplayName(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-790288812);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountSummaryKt.INSTANCE.getLambda$352873786$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 24);
        }
    }

    public static final z Preview_AccountSummary_NoDisplayName$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountSummary_NoDisplayName(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountSummary_Paid(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-673802990);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountSummaryKt.INSTANCE.getLambda$1164628844$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 22);
        }
    }

    public static final z Preview_AccountSummary_Paid$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountSummary_Paid(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AccountSummary_UnlimitedBadgeOnly(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-110766896);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AccountSummaryKt.INSTANCE.m1241getLambda$824644182$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c1(i10, 25);
        }
    }

    public static final z Preview_AccountSummary_UnlimitedBadgeOnly$lambda$0(int i10, m mVar, int i11) {
        Preview_AccountSummary_UnlimitedBadgeOnly(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0052  */
    /* renamed from: TextSectionTitle-cf5BqRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1236TextSectionTitlecf5BqRc(String str, t tVar, long j4, y0 y0Var, m mVar, int i10, int i11) {
        String str2;
        int i12;
        t tVar2;
        int i13;
        long j10;
        y0 y0Var2;
        boolean z6;
        q qVar;
        t tVar3;
        long j11;
        r1 r10;
        t tVar4;
        y0 baseRegular400;
        int i14;
        int i15;
        int i16;
        q qVar2 = (q) mVar;
        qVar2.Z(1666542814);
        if ((i10 & 6) == 0) {
            str2 = str;
            if (qVar2.f(str2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            str2 = str;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) != 0) {
                j10 = j4;
                if ((i11 & 4) == 0 && qVar2.e(j10)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
            } else {
                j10 = j4;
            }
            if ((i10 & 3072) != 0) {
                if ((i11 & 8) == 0) {
                    y0Var2 = y0Var;
                    if (qVar2.f(y0Var2)) {
                        i14 = 2048;
                        i12 |= i14;
                    }
                } else {
                    y0Var2 = y0Var;
                }
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i12 |= i14;
            } else {
                y0Var2 = y0Var;
            }
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                qVar2.T();
                if ((i10 & 1) != 0 && !qVar2.y()) {
                    qVar2.R();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    tVar4 = tVar2;
                } else {
                    if (i17 != 0) {
                        tVar4 = i3.q.f13017a;
                    } else {
                        tVar4 = tVar2;
                    }
                    if ((i11 & 4) != 0) {
                        j10 = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        baseRegular400 = EchoTheme.INSTANCE.getTypography(qVar2, EchoTheme.$stable).getBaseRegular400(qVar2, EchoThemeTypography.$stable);
                        long j12 = j10;
                        qVar2.q();
                        qVar = qVar2;
                        j7.d(str2, p2.e(tVar4, 1.0f), j12, 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, baseRegular400, qVar, i12 & 910, (i12 << 12) & 29360128, 130040);
                        tVar3 = tVar4;
                        j11 = j12;
                        y0Var2 = baseRegular400;
                    }
                }
                baseRegular400 = y0Var2;
                long j122 = j10;
                qVar2.q();
                qVar = qVar2;
                j7.d(str2, p2.e(tVar4, 1.0f), j122, 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, baseRegular400, qVar, i12 & 910, (i12 << 12) & 29360128, 130040);
                tVar3 = tVar4;
                j11 = j122;
                y0Var2 = baseRegular400;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
                j11 = j10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new k0(str, tVar3, j11, y0Var2, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i10 & 384) != 0) {
        }
        if ((i10 & 3072) != 0) {
        }
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z TextSectionTitle_cf5BqRc$lambda$0(String str, t tVar, long j4, y0 y0Var, int i10, int i11, m mVar, int i12) {
        m1236TextSectionTitlecf5BqRc(str, tVar, j4, y0Var, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
