package io.elevenlabs.ui.echo.components;

import a2.l0;
import a2.s1;
import c3.k;
import c3.o;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.a;
import i3.d;
import i3.t;
import i4.j1;
import ib.i;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.b;
import io.elevenlabs.ui.components.PlanBadgeKt;
import io.elevenlabs.ui.components.PlanBadgeStyles;
import io.elevenlabs.ui.components.i1;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.e5;
import q2.j7;
import r1.j;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.e;
import s4.e0;
import s4.y0;
import sn.z;
import t2.u;
import u2.b0;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "title", "description", "Lkotlin/Function0;", "Lsn/z;", "onClick", "UpsellBanner", "(Ljava/lang/String;Ljava/lang/String;Lho/a;Lu2/m;I)V", "placeholder", "UpsellTitle", "(Ljava/lang/String;Ljava/lang/String;Lu2/m;II)V", "Preview_UpsellBanner", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UpsellTitleKt {
    public static final void Preview_UpsellBanner(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1714447585);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            t e10 = i.e(echoTheme, qVar, 6, n.h(i3.q.f13017a, i.D(6, 0, echoTheme, qVar, qVar), h0.f26395b));
            f1 d10 = p.d(d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(e10, qVar);
            h.f11920i.getClass();
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
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new b0(17);
                qVar.h0(L);
            }
            UpsellBanner("Get ULTRA now!", "Listen unlimited, offline, with premium voices, faster playback, and more...", (ho.a) L, qVar, 438);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 9);
        }
    }

    public static final z Preview_UpsellBanner$lambda$1(int i10, m mVar, int i11) {
        Preview_UpsellBanner(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void UpsellBanner(String str, String str2, ho.a aVar, m mVar, int i10) {
        int i11;
        String str3;
        boolean z6;
        int i12;
        int i13;
        int i14;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-402041748);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            str3 = str2;
            if (qVar.f(str3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        } else {
            str3 = str2;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            t e10 = p2.e(m3.h.c(i3.q.f13017a, echoTheme.getShapes(qVar, 6).getXl(qVar, 0)), 1.0f);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = c.o(qVar);
            }
            t e11 = i.e(echoTheme, qVar, 6, n.j(1, echoTheme.getColors(qVar, 6).getBorder().getSeptenaryAlpha(qVar, 0), n.h(n.n(e10, (p1.l) L, e5.b(u.P, 3, i.v(6, 0, echoTheme, qVar, qVar), false), false, null, aVar, 28), echoTheme.getColors(qVar, 6).getFill().getUndenaryAlpha(qVar, 0), h0.f26395b), echoTheme.getShapes(qVar, 6).getXl(qVar, 0)));
            u0 u0Var = j.f29228a;
            x a10 = w.a(j.i(echoTheme.getSpacings(qVar, 6).getX2(), d.f13005z0), d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(e11, qVar);
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
            UpsellTitle(str, null, qVar, i11 & 14, 2);
            j7.d(str3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0.a(echoTheme.getTypography(qVar, 6).getSmRegular400(qVar, 0), i.b(6, 0, echoTheme, qVar, qVar), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, (i11 >> 3) & 14, 0, 131070);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.a(str, str2, aVar, i10, 2);
        }
    }

    public static final z UpsellBanner$lambda$2(String str, String str2, ho.a aVar, int i10, m mVar, int i11) {
        UpsellBanner(str, str2, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void UpsellTitle(String str, String str2, m mVar, int i10, int i11) {
        int i12;
        String str3;
        int i13;
        boolean z6;
        q qVar;
        String str4;
        r1 r10;
        String str5;
        long K;
        int i14;
        q qVar2 = (q) mVar;
        qVar2.Z(-1739046794);
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
            str3 = str2;
            if (qVar2.f(str3)) {
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
                    str5 = "ULTRA";
                } else {
                    str5 = str3;
                }
                int k02 = wq.n.k0(str, str5, 0, false, 6);
                String substring = str.substring(0, k02);
                String substring2 = str.substring(str5.length() + k02);
                if (((h5.c) qVar2.j(j1.f13129h)).X() > 1.0f) {
                    K = ae.l.K(60);
                } else {
                    K = ae.l.K(64);
                }
                long j4 = K;
                long K2 = ae.l.K(18);
                e eVar = new e();
                eVar.d(substring);
                l0.n(eVar, str5);
                eVar.d(substring2);
                s4.h k4 = eVar.k();
                y0 baseRegular500 = EchoTheme.INSTANCE.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0);
                Map singletonMap = Collections.singletonMap(str5, new s1(new e0(j4, 7, K2), k.d(-2042234282, true, new b(str5, 2), qVar2)));
                singletonMap.getClass();
                qVar = qVar2;
                j7.e(k4, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, singletonMap, null, baseRegular500, qVar, 0, 0, 196606);
                str4 = str5;
            } else {
                qVar = qVar2;
                qVar.R();
                str4 = str3;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new i1(str, str4, i10, i11, 1);
                return;
            }
            return;
        }
        str3 = str2;
        if ((i12 & 19) == 18) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z UpsellTitle$lambda$2(String str, String str2, m mVar, int i10) {
        boolean z6;
        str2.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlanBadgeKt.PlanBadge(str, true, PlanBadgeStyles.INSTANCE.echo(qVar, 6), qVar, 48, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z UpsellTitle$lambda$3(String str, String str2, int i10, int i11, m mVar, int i12) {
        UpsellTitle(str, str2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
