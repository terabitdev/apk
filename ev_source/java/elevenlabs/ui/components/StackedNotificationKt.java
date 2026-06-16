package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"", "title", "subtitle", "Li3/t;", "modifier", "Lsn/z;", "StackedNotification", "(Ljava/lang/String;Ljava/lang/String;Li3/t;Lu2/m;II)V", "NotificationCard", "Preview_StackedNotification_Light", "(Lu2/m;I)V", "Preview_StackedNotification_Dark", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class StackedNotificationKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void NotificationCard(String str, String str2, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        long m2466getWhite0d7_KjU;
        long m2366getBlack0d7_KjU;
        long m2417getNeutral6000d7_KjU;
        long m2466getWhite0d7_KjU2;
        long m2411getNeutral1000d7_KjU;
        long m2366getBlack0d7_KjU2;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-133425825);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                if (elevenLabsTheme.getColors(qVar, 6).getIsDark()) {
                    m2466getWhite0d7_KjU = ReaderColors.INSTANCE.m2420getNeutral9000d7_KjU();
                } else {
                    m2466getWhite0d7_KjU = ReaderColors.INSTANCE.m2466getWhite0d7_KjU();
                }
                long m2482getBlack40d7_KjU = ReaderColors.Transparent.INSTANCE.m2482getBlack40d7_KjU();
                if (elevenLabsTheme.getColors(qVar, 6).getIsDark()) {
                    m2366getBlack0d7_KjU = ReaderColors.INSTANCE.m2466getWhite0d7_KjU();
                } else {
                    m2366getBlack0d7_KjU = ReaderColors.INSTANCE.m2366getBlack0d7_KjU();
                }
                if (elevenLabsTheme.getColors(qVar, 6).getIsDark()) {
                    m2417getNeutral6000d7_KjU = ReaderColors.INSTANCE.m2414getNeutral4000d7_KjU();
                } else {
                    m2417getNeutral6000d7_KjU = ReaderColors.INSTANCE.m2417getNeutral6000d7_KjU();
                }
                long j4 = m2417getNeutral6000d7_KjU;
                if (elevenLabsTheme.getColors(qVar, 6).getIsDark()) {
                    m2466getWhite0d7_KjU2 = ReaderColors.INSTANCE.m2419getNeutral8000d7_KjU();
                } else {
                    m2466getWhite0d7_KjU2 = ReaderColors.INSTANCE.m2466getWhite0d7_KjU();
                }
                long j10 = m2466getWhite0d7_KjU2;
                if (elevenLabsTheme.getColors(qVar, 6).getIsDark()) {
                    m2411getNeutral1000d7_KjU = ReaderColors.INSTANCE.m2418getNeutral7000d7_KjU();
                } else {
                    m2411getNeutral1000d7_KjU = ReaderColors.INSTANCE.m2411getNeutral1000d7_KjU();
                }
                long j11 = m2411getNeutral1000d7_KjU;
                if (elevenLabsTheme.getColors(qVar, 6).getIsDark()) {
                    m2366getBlack0d7_KjU2 = ReaderColors.INSTANCE.m2466getWhite0d7_KjU();
                } else {
                    m2366getBlack0d7_KjU2 = ReaderColors.INSTANCE.m2366getBlack0d7_KjU();
                }
                float f10 = 1;
                i3.t j12 = l1.n.j(f10, m2482getBlack40d7_KjU, m3.h.c(r1.p2.f(r1.p2.e(tVar4, 1.0f), 73), elevenLabsTheme.getShapes(qVar, 6).getLg()), elevenLabsTheme.getShapes(qVar, 6).getLg());
                p3.w0 w0Var = p3.h0.f26395b;
                i3.t h10 = l1.n.h(j12, m2466getWhite0d7_KjU, w0Var);
                Object L = qVar.L();
                if (L == u2.l.f33918a) {
                    L = new v0(12);
                    qVar.h0(L);
                }
                i3.t E = r1.d.E(p4.q.c(h10, true, (ho.l) L), elevenLabsTheme.getSpacings(qVar, 6).m2355getX3D9Ej5fM());
                r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(E, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar = h4.g.f11907f;
                u2.r.J(eVar, a10, qVar);
                h4.e eVar2 = h4.g.f11906e;
                u2.r.J(eVar2, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                u2.r.y(qVar, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar);
                int i17 = i12;
                h4.e eVar4 = h4.g.f11905d;
                u2.r.J(eVar4, c5, qVar);
                i3.t tVar5 = tVar4;
                i3.t h11 = l1.n.h(l1.n.j(f10, j11, m3.h.c(r1.p2.o(qVar2, 32), elevenLabsTheme.getShapes(qVar, 6).getMd()), elevenLabsTheme.getShapes(qVar, 6).getMd()), j10, w0Var);
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(h11, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar, d10, qVar);
                u2.r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                u2.r.J(eVar4, c10, qVar);
                float f11 = 16;
                q2.y2.a(kd.a.M(R.drawable.elevenreader_logo, qVar, 0), null, r1.p2.p(qVar2, f11, f11), m2366getBlack0d7_KjU2, qVar, u3.c.$stable | 432, 0);
                qVar.p(true);
                r1.d.g(r1.p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM()), qVar);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                r1.m1 m1Var = new r1.m1(1.0f, true);
                r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c11 = i3.a.c(m1Var, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar, a11, qVar);
                u2.r.J(eVar2, l10, qVar);
                defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
                u2.r.J(eVar4, c11, qVar);
                j7.d(str, null, m2366getBlack0d7_KjU, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall600(), qVar, i17 & 14, 24960, 110586);
                r1.d.g(r1.p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2349getX05D9Ej5fM()), qVar);
                j7.d(str2, null, j4, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, s4.y0.a(elevenLabsTheme.getTypo(qVar, 6).getSubtitleSmall500(), 0L, 0L, null, null, null, 0L, 0, ae.l.K(16), null, new e5.i(e5.f.f8275b, 0, 0), 15597567), qVar, (i17 >> 3) & 14, 24960, 110586);
                qVar = qVar;
                qVar.p(true);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new r1(str, str2, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z NotificationCard$lambda$0$0(p4.b0 b0Var) {
        b0Var.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z NotificationCard$lambda$2(String str, String str2, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        NotificationCard(str, str2, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_StackedNotification_Dark(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-372749771);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(true, ComposableSingletons$StackedNotificationKt.INSTANCE.getLambda$116324959$ui_release(), qVar, 54, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 14);
        }
    }

    public static final sn.z Preview_StackedNotification_Dark$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_StackedNotification_Dark(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_StackedNotification_Light(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-536711375);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$StackedNotificationKt.INSTANCE.getLambda$1739703367$ui_release(), qVar, 54, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 13);
        }
    }

    public static final sn.z Preview_StackedNotification_Light$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_StackedNotification_Light(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StackedNotification(String str, String str2, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        u2.r1 r10;
        int i14;
        int i15;
        str.getClass();
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(984653146);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar2 = qVar2;
                }
                i3.t F = r1.d.F(r1.p2.e(r1.p2.u(tVar2, t2.u.P, 320, 1), 1.0f), ElevenLabsTheme.INSTANCE.getSpacings(qVar, 6).m2356getX4D9Ej5fM(), 24);
                f4.f1 d10 = r1.p.d(i3.d.f12998b, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(F, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                int i17 = i12 & 126;
                NotificationCard(str, str2, m3.h.k(r1.d.B(r1.d.G(qVar2, 26, t2.u.P, 2), t2.u.P, -8, 1), (float) 6.69d, null, p3.h0.c(436207616), p3.h0.c(436207616), 6), qVar, i17, 0);
                NotificationCard(str, str2, m3.h.k(qVar2, 8, null, p3.h0.c(436207616), p3.h0.c(436207616), 6), qVar, i17, 0);
                qVar.p(true);
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new r1(str, str2, tVar2, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z StackedNotification$lambda$1(String str, String str2, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        StackedNotification(str, str2, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
