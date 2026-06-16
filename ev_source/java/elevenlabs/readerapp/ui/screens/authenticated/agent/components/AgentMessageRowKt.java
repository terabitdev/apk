package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import f4.f1;
import g1.l0;
import h4.g;
import i3.k;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.ChatMessage;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import p3.a1;
import p3.h0;
import q2.j7;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p;
import r1.p2;
import r1.u0;
import s4.p0;
import s4.v;
import s4.v0;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import w4.a0;
import w4.b0;
import w4.g0;
import w4.u;
import wq.i;
import wq.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0007H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\r\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\r\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;", "message", "Li3/t;", "modifier", "Lsn/z;", "AgentMessageRow", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/ChatMessage;Li3/t;Lu2/m;II)V", "", ParameterNames.TEXT, "UserMessageRow", "(Ljava/lang/String;Li3/t;Lu2/m;II)V", "AgentMessageBubble", "AgentAvatar", "(Lu2/m;I)V", "Ls4/h;", "toLinkifiedAnnotatedString", "(Ljava/lang/String;Lu2/m;I)Ls4/h;", "Preview_AgentMessageRow_User", "Preview_AgentMessageRow_Agent", "Lwq/l;", "UrlRegex", "Lwq/l;", "Lh5/f;", "AvatarSize", TokenNames.F, "", "USER_BUBBLE_MAX_WIDTH_FRACTION", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentMessageRowKt {
    private static final float USER_BUBBLE_MAX_WIDTH_FRACTION = 0.85f;
    private static final l UrlRegex = new l("(https?://[^\\s]+|www\\.[^\\s]+)", 0);
    private static final float AvatarSize = 18;

    private static final void AgentAvatar(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(193995414);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            float f10 = AvatarSize;
            i3.q qVar2 = i3.q.f13017a;
            t h10 = n.h(h.c(p2.o(qVar2, f10), z1.h.f39128a), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b);
            f1 d10 = p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
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
            n.c(kd.a.M(R.drawable.circle_145, qVar, 0), null, p2.o(qVar2, f10), null, null, 0.0f, null, qVar, u3.c.$stable | 432, 120);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 9);
        }
    }

    public static final z AgentAvatar$lambda$1(int i10, m mVar, int i11) {
        AgentAvatar(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AgentMessageBubble(String str, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        q qVar;
        r1 r10;
        t tVar3;
        int i14;
        q qVar2 = (q) mVar;
        qVar2.Z(-1460111320);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
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
            if (qVar2.f(tVar2)) {
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
            if (!qVar2.O(i12 & 1, z6)) {
                if (i15 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                t e10 = p2.e(tVar3, 1.0f);
                k kVar = i3.d.f13004y0;
                u0 u0Var = j.f29228a;
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                k2 a10 = i2.a(j.g(echoTheme.getSpacings(qVar2, i16).getX3()), kVar, qVar2, 48);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(e10, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(g.f11907f, a10, qVar2);
                r.J(g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar2);
                r.J(g.f11905d, c5, qVar2);
                AgentAvatar(qVar2, 0);
                j7.e(toLinkifiedAnnotatedString(str, qVar2, i12 & 14), null, echoTheme.getColors(qVar2, i16).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, 0L, null, 0L, 0, false, 0, 0, null, null, echoTheme.getTypography(qVar2, i16).getBaseCompact400(qVar2, EchoThemeTypography.$stable), qVar2, 0, 0, 262138);
                qVar = qVar2;
                qVar.p(true);
                tVar2 = tVar3;
            } else {
                qVar = qVar2;
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.r(str, tVar2, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z AgentMessageBubble$lambda$1(String str, t tVar, int i10, int i11, m mVar, int i12) {
        AgentMessageBubble(str, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void AgentMessageRow(ChatMessage chatMessage, t tVar, m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        int i14;
        chatMessage.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1291428612);
        if ((i10 & 6) == 0) {
            if (qVar.f(chatMessage)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar = i3.q.f13017a;
            }
            if (chatMessage.isFromUser()) {
                qVar.X(1367372891);
                UserMessageRow(chatMessage.getContent(), tVar, qVar, i12 & 112, 0);
                qVar.p(false);
            } else {
                qVar.X(1367453367);
                AgentMessageBubble(chatMessage.getContent(), tVar, qVar, i12 & 112, 0);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        t tVar2 = tVar;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(chatMessage, tVar2, i10, i11, 11);
        }
    }

    public static final z AgentMessageRow$lambda$0(ChatMessage chatMessage, t tVar, int i10, int i11, m mVar, int i12) {
        AgentMessageRow(chatMessage, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AgentMessageRow_Agent(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1633196191);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AgentMessageRowKt.INSTANCE.m1267getLambda$1504959099$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 8);
        }
    }

    public static final z Preview_AgentMessageRow_Agent$lambda$0(int i10, m mVar, int i11) {
        Preview_AgentMessageRow_Agent(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AgentMessageRow_User(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-641227203);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$AgentMessageRowKt.INSTANCE.getLambda$1197204631$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e(i10, 7);
        }
    }

    public static final z Preview_AgentMessageRow_User$lambda$0(int i10, m mVar, int i11) {
        Preview_AgentMessageRow_User(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void UserMessageRow(String str, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        r1 r10;
        t tVar3;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(419101976);
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
                i3.q qVar2 = i3.q.f13017a;
                if (i15 != 0) {
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                t e10 = p2.e(tVar3, 1.0f);
                k2 a10 = i2.a(j.f29229b, i3.d.f13004y0, qVar, 6);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(e10, qVar);
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
                t x10 = p2.x(p2.e(qVar2, 0.85f), i3.d.D0, 2);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                t F = r1.d.F(n.h(x10, echoTheme.getColors(qVar, i16).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), z1.h.b(echoTheme.getRadii(qVar, i16).getThreeXl())), echoTheme.getSpacings(qVar, i16).getX4(), echoTheme.getSpacings(qVar, i16).getX3());
                f1 d10 = p.d(i3.d.f12997a, false);
                t tVar4 = tVar3;
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c10 = i3.a.c(F, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, d10, qVar);
                r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c10, qVar);
                j7.d(str, null, echoTheme.getColors(qVar, i16).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i16).getBaseCompact400(qVar, EchoThemeTypography.$stable), qVar, i12 & 14, 0, 131066);
                qVar = qVar;
                qVar.p(true);
                qVar.p(true);
                tVar2 = tVar4;
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.r(str, tVar2, i10, i11, 1);
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

    public static final z UserMessageRow$lambda$1(String str, t tVar, int i10, int i11, m mVar, int i12) {
        UserMessageRow(str, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final s4.h toLinkifiedAnnotatedString(String str, m mVar, int i10) {
        String concat;
        v0 v0Var = new v0(new p0(EchoTheme.INSTANCE.getColors(mVar, EchoTheme.$stable).getText().getPrimary(mVar, EchoThemeColors.Text.$stable), 0L, (g0) null, (a0) null, (b0) null, (u) null, (String) null, 0L, (e5.a) null, (e5.p) null, (a5.c) null, 0L, e5.l.f8290c, (a1) null, 61438), null, null, null);
        s4.e eVar = new s4.e();
        l0 l0Var = new l0(l.b(UrlRegex, str), (byte) 0);
        int i11 = 0;
        while (l0Var.hasNext()) {
            i iVar = (i) ((wq.h) l0Var.next());
            if (iVar.b().f24556a > i11) {
                eVar.d(str.substring(i11, iVar.b().f24556a));
            }
            String group = iVar.f37255a.group();
            group.getClass();
            if (wq.u.W(group, "http", true)) {
                concat = group;
            } else {
                concat = "https://".concat(group);
            }
            int h10 = eVar.h(new v(concat, v0Var));
            try {
                eVar.d(group);
                eVar.g(h10);
                i11 = iVar.b().f24557b + 1;
            } catch (Throwable th) {
                eVar.g(h10);
                throw th;
            }
        }
        if (i11 < str.length()) {
            eVar.d(str.substring(i11));
        }
        return eVar.k();
    }
}
