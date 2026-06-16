package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.o;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.d;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"", "message", "Li3/t;", "modifier", "Lsn/z;", "UserMessageBubble", "(Ljava/lang/String;Li3/t;Lu2/m;II)V", "AssistantMessageBubble", "Preview_UserMessageBubble", "(Lu2/m;I)V", "Preview_AssistantMessageBubble", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ChatMessageBubbleKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistantMessageBubble(String str, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        r1 r10;
        t tVar3;
        int i14;
        str.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1030541019);
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
                k2 a10 = i2.a(j.f29228a, d.f13004y0, qVar, 6);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(e10, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a10, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                j7.d(str, p2.u(qVar2, u.P, 280, 1), echoTheme.getColors(qVar, i16).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i16).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, (i12 & 14) | 48, 0, 131064);
                qVar = qVar;
                qVar.p(true);
                tVar2 = tVar3;
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.r(str, tVar2, i10, i11, 3);
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

    public static final z AssistantMessageBubble$lambda$1(String str, t tVar, int i10, int i11, m mVar, int i12) {
        AssistantMessageBubble(str, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AssistantMessageBubble(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1326737148);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChatMessageBubbleKt.INSTANCE.m1284getLambda$42934946$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 22);
        }
    }

    public static final z Preview_AssistantMessageBubble$lambda$0(int i10, m mVar, int i11) {
        Preview_AssistantMessageBubble(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_UserMessageBubble(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-886943347);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$ChatMessageBubbleKt.INSTANCE.m1283getLambda$1587135245$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 23);
        }
    }

    public static final z Preview_UserMessageBubble$lambda$0(int i10, m mVar, int i11) {
        Preview_UserMessageBubble(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserMessageBubble(String str, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        r1 r10;
        t tVar3;
        int i14;
        str.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1115868690);
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
                k2 a10 = i2.a(j.f29229b, d.f13004y0, qVar, 6);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(e10, qVar);
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
                t u6 = p2.u(qVar2, u.P, 280, 1);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i16 = EchoTheme.$stable;
                t F = r1.d.F(n.h(u6, echoTheme.getColors(qVar, i16).getFill().getUndenaryAlpha(qVar, EchoThemeColors.Fill.$stable), z1.h.b(echoTheme.getRadii(qVar, i16).getTwoXl())), echoTheme.getSpacings(qVar, i16).getX3(), echoTheme.getSpacings(qVar, i16).getX2_5());
                f1 d10 = p.d(d.f12997a, false);
                int i17 = i12;
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
                j7.d(str, null, echoTheme.getColors(qVar, i16).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i16).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, i17 & 14, 0, 131066);
                qVar = qVar;
                qVar.p(true);
                qVar.p(true);
                tVar2 = tVar4;
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.components.r(str, tVar2, i10, i11, 4);
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

    public static final z UserMessageBubble$lambda$1(String str, t tVar, int i10, int i11, m mVar, int i12) {
        UserMessageBubble(str, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
