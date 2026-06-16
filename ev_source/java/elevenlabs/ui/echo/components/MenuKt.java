package io.elevenlabs.ui.echo.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import ho.a;
import ho.q;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.e;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.j1;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.components.MenuKt;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.w0;
import p4.b0;
import p4.k;
import p4.y;
import q2.e5;
import q2.j7;
import q2.l;
import q2.y2;
import r1.d;
import r1.d2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.l2;
import r1.m2;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a3\u0010\u0015\u001a\u00020\u0003*\u00020\u00132\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"", "expanded", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lkotlin/Function1;", "Lr1/y;", FirebaseAnalytics.Param.CONTENT, "Menu", "(ZLho/a;Lho/q;Lu2/m;I)V", "", ParameterNames.ICON, "", "title", "onClick", "isDestructive", "subtitle", "MenuItem", "(ILjava/lang/String;Lho/a;ZLjava/lang/String;Lu2/m;II)V", "Lr1/l2;", ParameterNames.TEXT, "MenuHorizontalButton", "(Lr1/l2;ILjava/lang/String;Lho/a;Lu2/m;I)V", "MenuDivider", "(Lu2/m;I)V", "Preview_MenuItem", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MenuKt {
    public static final void Menu(boolean z6, a aVar, q qVar, m mVar, int i10) {
        boolean z10;
        int i11;
        q qVar2;
        boolean z11;
        u2.q qVar3;
        int i12;
        int i13;
        int i14;
        aVar.getClass();
        qVar.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(311828822);
        if ((i10 & 6) == 0) {
            z10 = z6;
            if (qVar4.g(z10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            z10 = z6;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar4.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            qVar2 = qVar;
            if (qVar4.h(qVar2)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        } else {
            qVar2 = qVar;
        }
        if ((i11 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar4.O(i11 & 1, z11)) {
            t s10 = p2.s(i3.q.f13017a, 280);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            qVar3 = qVar4;
            l.a(z10, aVar, d.I(s10, u.P, echoTheme.getSpacings(qVar4, 6).getX2(), u.P, u.P, 13), 0L, null, null, echoTheme.getShapes(qVar4, 6).getThreeXl(qVar4, 0), echoTheme.getColors(qVar4, 6).getFill().getMenu(qVar4, 0), u.P, u.P, qVar2, qVar3, i11 & 126, (i11 >> 3) & 112);
        } else {
            qVar3 = qVar4;
            qVar3.R();
        }
        r1 r10 = qVar3.r();
        if (r10 != null) {
            r10.f34012d = new e(z6, aVar, qVar, i10, 5);
        }
    }

    public static final z Menu$lambda$0(boolean z6, a aVar, q qVar, int i10, m mVar, int i11) {
        Menu(z6, aVar, qVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void MenuDivider(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1977639763);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            float x42 = echoTheme.getSpacings(qVar, 6).getX4();
            float x22 = echoTheme.getSpacings(qVar, 6).getX2();
            i3.q qVar2 = i3.q.f13017a;
            t F = d.F(qVar2, x42, x22);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(F, qVar);
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
            DividerKt.m1827DivideriJQMabo(p2.e(qVar2, 1.0f), echoTheme.getColors(qVar, 6).getBorder().getQuiniary(qVar, 0), qVar, 6, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 6);
        }
    }

    public static final z MenuDivider$lambda$1(int i10, m mVar, int i11) {
        MenuDivider(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void MenuHorizontalButton(l2 l2Var, int i10, String str, a aVar, m mVar, int i11) {
        int i12;
        boolean z6;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        l2Var.getClass();
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1871911304);
        if ((i11 & 6) == 0) {
            if (qVar.f(l2Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.d(i10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 384) == 0) {
            if (qVar.f(str)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t b10 = l2Var.b(qVar2, 1.0f, true);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            t c5 = m3.h.c(b10, echoTheme.getShapes(qVar, 6).getMd(qVar, 0));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = c.o(qVar);
            }
            t F = d.F(n.n(c5, (p1.l) L, e5.b(u.P, 3, echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0), false), false, new k(0), aVar, 12), echoTheme.getSpacings(qVar, 6).getX1(), echoTheme.getSpacings(qVar, 6).getX4());
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L2 = qVar.L();
            if (z10 || L2 == eVar) {
                L2 = new lc.q(str, 25);
                qVar.h0(L2);
            }
            t c10 = p4.q.c(F, true, (ho.l) L2);
            u0 u0Var = j.f29228a;
            x a10 = w.a(j.i(echoTheme.getSpacings(qVar, 6).getX2(), i3.d.f13005z0), i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c11 = i3.a.c(c10, qVar);
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
            r.J(g.f11905d, c11, qVar);
            y2.a(kd.a.M(i10, qVar, (i12 >> 3) & 14), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0), qVar, u3.c.$stable | 432, 0);
            j7.d(str, null, i.v(6, 0, echoTheme, qVar, qVar), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, 6).getXsCompact500(qVar, 0), qVar, (i12 >> 6) & 14, 24960, 110586);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new om.a(l2Var, i10, str, aVar, i11);
        }
    }

    public static final z MenuHorizontalButton$lambda$1$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z MenuHorizontalButton$lambda$3(l2 l2Var, int i10, String str, a aVar, int i11, m mVar, int i12) {
        MenuHorizontalButton(l2Var, i10, str, aVar, mVar, r.M(i11 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MenuItem(final int i10, final String str, final a aVar, boolean z6, String str2, m mVar, final int i11, final int i12) {
        int i13;
        boolean z10;
        int i14;
        int i15;
        String str3;
        int i16;
        boolean z11;
        final boolean z12;
        final String str4;
        r1 r10;
        String str5;
        int i17;
        int i18;
        int i19;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2053599536);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i13 = i19 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.f(str)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i13 |= i18;
        }
        if ((i11 & 384) == 0) {
            if (qVar.h(aVar)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i13 |= i17;
        }
        int i20 = i12 & 8;
        if (i20 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                str3 = str2;
                if (qVar.f(str3)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i16;
                boolean z13 = false;
                if ((i13 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar.O(i13 & 1, z11)) {
                    if (i20 != 0) {
                        z10 = false;
                    }
                    if (i15 != 0) {
                        str5 = null;
                    } else {
                        str5 = str3;
                    }
                    t e10 = p2.e(i3.q.f13017a, 1.0f);
                    if ((i13 & 112) == 32) {
                        z13 = true;
                    }
                    Object L = qVar.L();
                    if (z13 || L == u2.l.f33918a) {
                        L = new lc.q(str, 26);
                        qVar.h0(L);
                    }
                    t c5 = p4.q.c(e10, true, (ho.l) L);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    float x42 = echoTheme.getSpacings(qVar, 6).getX4();
                    float x32 = echoTheme.getSpacings(qVar, 6).getX3();
                    l.b(c3.k.d(1286391040, true, new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.e(z10, str, str5), qVar), aVar, c5, c3.k.d(-1512851005, true, new j1(i10, z10), qVar), null, false, null, new d2(x42, x32, x42, x32), qVar, ((i13 >> 3) & 112) | 3078, 368);
                    z12 = z10;
                    str4 = str5;
                } else {
                    qVar.R();
                    z12 = z10;
                    str4 = str3;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new ho.p() { // from class: um.d
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z MenuItem$lambda$3;
                            int intValue = ((Integer) obj2).intValue();
                            MenuItem$lambda$3 = MenuKt.MenuItem$lambda$3(i10, str, aVar, z12, str4, i11, i12, (m) obj, intValue);
                            return MenuItem$lambda$3;
                        }
                    };
                    return;
                }
                return;
            }
            str3 = str2;
            boolean z132 = false;
            if ((i13 & 9363) != 9362) {
            }
            if (qVar.O(i13 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z10 = z6;
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        str3 = str2;
        boolean z1322 = false;
        if ((i13 & 9363) != 9362) {
        }
        if (qVar.O(i13 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z MenuItem$lambda$0$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z MenuItem$lambda$1(boolean z6, String str, String str2, m mVar, int i10) {
        boolean z10;
        long primary;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            y0 baseRegular400 = echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0);
            if (z6) {
                primary = i.g(1377306287, 6, echoTheme, qVar, qVar).getCriticalPrimary(qVar, 0);
                qVar.p(false);
            } else {
                primary = i.g(1377404247, 6, echoTheme, qVar, qVar).getPrimary(qVar, 0);
                qVar.p(false);
            }
            j7.d(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, y0.a(baseRegular400, primary, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, 0, 24960, 110590);
            u2.q qVar2 = qVar;
            if (str2 != null) {
                qVar2.X(1377686905);
                j7.d(str2, n.i(), echoTheme.getColors(qVar2, 6).getText().getQuaternary(qVar2, 0), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar2, 6).getSmRegular400(qVar2, 0), qVar2, 48, 24960, 110584);
                qVar2 = qVar2;
                qVar2.p(false);
            } else {
                qVar2.X(1378061292);
                qVar2.p(false);
            }
            qVar2.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z MenuItem$lambda$2(int i10, boolean z6, m mVar, int i11) {
        boolean z10;
        long primary;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z10)) {
            u3.c M = kd.a.M(i10, qVar, 0);
            t o6 = p2.o(i3.q.f13017a, 20);
            if (z6) {
                qVar.X(2042718034);
                primary = EchoTheme.INSTANCE.getColors(qVar, 6).getIcon().getCriticalPrimary(qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(2042800122);
                primary = EchoTheme.INSTANCE.getColors(qVar, 6).getIcon().getPrimary(qVar, 0);
                qVar.p(false);
            }
            y2.a(M, null, o6, primary, qVar, u3.c.$stable | 432, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z MenuItem$lambda$3(int i10, String str, a aVar, boolean z6, String str2, int i11, int i12, m mVar, int i13) {
        MenuItem(i10, str, aVar, z6, str2, mVar, r.M(i11 | 1), i12);
        return z.f31622a;
    }

    public static final void Preview_MenuItem(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1436056706);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            long D = i.D(6, 0, EchoTheme.INSTANCE, qVar, qVar);
            w0 w0Var = h0.f26395b;
            i3.q qVar2 = i3.q.f13017a;
            t h10 = n.h(qVar2, D, w0Var);
            x a10 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            k2 a11 = i2.a(j.f29228a, i3.d.f13004y0, qVar, 0);
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
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            int i11 = R.drawable.ic_bars_three_2;
            Object L = qVar.L();
            u2.e eVar5 = u2.l.f33918a;
            if (L == eVar5) {
                L = new u2.b0(10);
                qVar.h0(L);
            }
            a aVar = (a) L;
            m2 m2Var = m2.f29267a;
            MenuHorizontalButton(m2Var, i11, "MenuItem", aVar, qVar, 3462);
            int i12 = R.drawable.ic_bars_three_2;
            Object L2 = qVar.L();
            if (L2 == eVar5) {
                L2 = new u2.b0(11);
                qVar.h0(L2);
            }
            MenuHorizontalButton(m2Var, i12, "MenuItem", (a) L2, qVar, 3462);
            int i13 = R.drawable.ic_bars_three_2;
            Object L3 = qVar.L();
            if (L3 == eVar5) {
                L3 = new u2.b0(12);
                qVar.h0(L3);
            }
            MenuHorizontalButton(m2Var, i13, "MenuItem", (a) L3, qVar, 3462);
            qVar = qVar;
            qVar.p(true);
            MenuDivider(qVar, 0);
            int i14 = R.drawable.ic_bullet_list;
            Object L4 = qVar.L();
            if (L4 == eVar5) {
                L4 = new u2.b0(13);
                qVar.h0(L4);
            }
            MenuItem(i14, "MenuItem", (a) L4, false, null, qVar, 432, 24);
            int i15 = R.drawable.ic_bullet_list;
            Object L5 = qVar.L();
            if (L5 == eVar5) {
                L5 = new u2.b0(14);
                qVar.h0(L5);
            }
            MenuItem(i15, "MenuItem with subtitle", (a) L5, false, "This is a subtitle", qVar, 25008, 8);
            int i16 = R.drawable.ic_bullet_list;
            Object L6 = qVar.L();
            if (L6 == eVar5) {
                L6 = new u2.b0(7);
                qVar.h0(L6);
            }
            MenuItem(i16, "MenuItem", (a) L6, false, null, qVar, 432, 24);
            MenuDivider(qVar, 0);
            int i17 = R.drawable.ic_bullet_list;
            Object L7 = qVar.L();
            if (L7 == eVar5) {
                L7 = new u2.b0(8);
                qVar.h0(L7);
            }
            MenuItem(i17, "MenuItem", (a) L7, false, null, qVar, 432, 24);
            int i18 = R.drawable.ic_bullet_list;
            Object L8 = qVar.L();
            if (L8 == eVar5) {
                L8 = new u2.b0(9);
                qVar.h0(L8);
            }
            MenuItem(i18, "MenuItem", (a) L8, false, null, qVar, 432, 24);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new tm.a(i10, 5);
        }
    }

    public static final z Preview_MenuItem$lambda$1(int i10, m mVar, int i11) {
        Preview_MenuItem(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
