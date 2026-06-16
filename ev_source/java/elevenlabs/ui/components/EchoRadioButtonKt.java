package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.b5;
import q2.j7;
import q2.z4;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "checked", "Lkotlin/Function0;", "Lsn/z;", "onCheckedChange", "", Constants.ScionAnalytics.PARAM_LABEL, "Li3/t;", "modifier", "leadingContent", "EchoRadioButton", "(ZLho/a;Ljava/lang/String;Li3/t;Lho/p;Lu2/m;II)V", "Preview_EchoRadioButton", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoRadioButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoRadioButton(boolean z6, ho.a aVar, String str, i3.t tVar, ho.p pVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        ho.p pVar2;
        int i15;
        boolean z10;
        u2.q qVar;
        i3.t tVar3;
        ho.p pVar3;
        u2.r1 r10;
        i3.t tVar4;
        boolean z11;
        int i16;
        int i17;
        int i18;
        aVar.getClass();
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(21561492);
        if ((i10 & 6) == 0) {
            if (qVar2.g(z6)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.f(str)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                pVar2 = pVar;
                if (qVar2.h(pVar2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (qVar2.O(i12 & 1, z10)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i19 != 0) {
                        tVar4 = qVar3;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        pVar2 = null;
                    }
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    ho.p pVar4 = pVar2;
                    i3.t then = l1.n.p(m3.h.c(r1.p2.h(qVar3, echoTheme.getSpacings(qVar2, 6).getX14(), t2.u.P, 2), echoTheme.getShapes(qVar2, 6).getMd(qVar2, 0)), false, null, null, null, aVar, 15).then(tVar4);
                    if ((i12 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object L = qVar2.L();
                    if (z11 || L == u2.l.f33918a) {
                        L = new g(str, 10);
                        qVar2.h0(L);
                    }
                    i3.t c5 = p4.q.c(then, true, (ho.l) L);
                    r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar2, 48);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    i3.t c10 = i3.a.c(c5, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(h4.g.f11907f, a10, qVar2);
                    u2.r.J(h4.g.f11906e, l4, qVar2);
                    u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar2);
                    u2.r.J(h4.g.f11905d, c10, qVar2);
                    if (pVar4 == null) {
                        qVar2.X(1346690313);
                        qVar2.p(false);
                    } else {
                        qVar2.X(1151820280);
                        j0.c.q((i12 >> 12) & 14, pVar4, qVar2, false);
                    }
                    s4.y0 baseRegular500 = echoTheme.getTypography(qVar2, 6).getBaseRegular500(qVar2, 0);
                    int i20 = i12;
                    long v9 = ib.i.v(6, 0, echoTheme, qVar2, qVar2);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    j7.d(str, r1.d.G(new r1.m1(1.0f, true), echoTheme.getSpacings(qVar2, 6).getX2(), t2.u.P, 2), v9, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar2, (i20 >> 6) & 14, 0, 131064);
                    qVar = qVar2;
                    u2.r.a(q2.b3.f26885c.a(new h5.f(0)), c3.k.d(-523346448, true, new io.elevenlabs.readerapp.ui.components.m0(z6, 3), qVar), qVar, 56);
                    qVar.p(true);
                    pVar3 = pVar4;
                    tVar3 = tVar4;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    tVar3 = tVar2;
                    pVar3 = pVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new o2(z6, aVar, str, tVar3, pVar3, i10, i11);
                    return;
                }
                return;
            }
            pVar2 = pVar;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar2.O(i12 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        pVar2 = pVar;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar2.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z EchoRadioButton$lambda$0$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 3);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z EchoRadioButton$lambda$1$0(boolean z6, u2.m mVar, int i10) {
        boolean z10;
        long j4;
        long j10;
        long j11;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            long primary = echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0);
            long quaternary = echoTheme.getColors(qVar, 6).getBorder().getQuaternary(qVar, 0);
            long j12 = p3.x.f26438m;
            q2.f0 f0Var = (q2.f0) qVar.j(q2.g0.f27130a);
            z4 z4Var = f0Var.f27077e0;
            if (z4Var == null) {
                j4 = quaternary;
                z4 z4Var2 = new z4(q2.g0.e(f0Var, t2.w.f32260d), q2.g0.e(f0Var, t2.w.f32261e), p3.x.b(0.38f, q2.g0.e(f0Var, t2.w.f32257a)), p3.x.b(0.38f, q2.g0.e(f0Var, t2.w.f32258b)));
                f0Var.f27077e0 = z4Var2;
                z4Var = z4Var2;
            } else {
                j4 = quaternary;
            }
            if (primary == 16) {
                primary = z4Var.f27960a;
            }
            long j13 = primary;
            if (j4 != 16) {
                j10 = j4;
            } else {
                j10 = z4Var.f27961b;
            }
            if (j12 != 16) {
                j11 = j12;
            } else {
                j11 = z4Var.f27962c;
            }
            if (j12 == 16) {
                j12 = z4Var.f27963d;
            }
            b5.a(z6, r1.p2.o(i3.q.f13017a, 24), false, new z4(j13, j10, j11, j12), qVar, 432, 40);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z EchoRadioButton$lambda$2(boolean z6, ho.a aVar, String str, i3.t tVar, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        EchoRadioButton(z6, aVar, str, tVar, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_EchoRadioButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(105658490);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(EchoTheme.INSTANCE.getSpacings(qVar, 6).getX0()), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new u0(1);
                qVar.h0(L);
            }
            EchoRadioButton(true, (ho.a) L, "Selected option", null, null, qVar, 438, 24);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new u0(2);
                qVar.h0(L2);
            }
            EchoRadioButton(false, (ho.a) L2, "Unselected option", null, null, qVar, 438, 24);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new u0(3);
                qVar.h0(L3);
            }
            EchoRadioButton(false, (ho.a) L3, "Option with a long label that should wrap across multiple lines", null, null, qVar, 438, 24);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 27);
        }
    }

    public static final sn.z Preview_EchoRadioButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_EchoRadioButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
