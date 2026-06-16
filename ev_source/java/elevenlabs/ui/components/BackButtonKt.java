package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "EchoThemeBackButton", "(Lho/a;Li3/t;Lu2/m;II)V", "BackButton", "Preview_BackButton", "(Lu2/m;I)V", "Preview_EchoThemeBackButton", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BackButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BackButton(ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        int i14;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(287797562);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
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
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                String R = kj.c.R(qVar, R.string.accessibility_go_back);
                u3.c M = kd.a.M(R.drawable.chevron_left, qVar, 0);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                long b10 = defpackage.f.b(elevenLabsTheme, qVar, 6);
                boolean f10 = qVar.f(R);
                Object L = qVar.L();
                Object obj = u2.l.f33918a;
                if (f10 || L == obj) {
                    L = new g(R, 2);
                    qVar.h0(L);
                }
                i3.t c5 = p4.q.c(qVar2, true, (ho.l) L);
                Object L2 = qVar.L();
                if (L2 == obj) {
                    L2 = j0.c.o(qVar);
                }
                q2.y2.a(M, null, l1.n.n(c5, (p1.l) L2, e5.b(t2.u.P, 2, defpackage.f.b(elevenLabsTheme, qVar, 6), false), false, new p4.k(0), aVar, 12).then(tVar4), b10, qVar, u3.c.$stable | 48, 0);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.b(aVar, tVar3, i10, i11, 7);
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

    public static final sn.z BackButton$lambda$0$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z BackButton$lambda$2(ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        BackButton(aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoThemeBackButton(ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        int i14;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(19625234);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
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
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                String R = kj.c.R(qVar, R.string.accessibility_go_back);
                boolean f10 = qVar.f(R);
                Object L = qVar.L();
                Object obj = u2.l.f33918a;
                if (f10 || L == obj) {
                    L = new g(R, 1);
                    qVar.h0(L);
                }
                i3.t c5 = p4.q.c(qVar2, true, (ho.l) L);
                Object L2 = qVar.L();
                if (L2 == obj) {
                    L2 = j0.c.o(qVar);
                }
                p1.l lVar = (p1.l) L2;
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                i3.t o6 = r1.p2.o(l1.n.n(c5, lVar, e5.b(t2.u.P, 2, echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0), false), false, new p4.k(0), aVar, 12).then(tVar4), 48);
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c10 = i3.a.c(o6, qVar);
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
                u2.r.J(h4.g.f11905d, c10, qVar);
                q2.y2.a(kd.a.M(R.drawable.chevron_left_round, qVar, 0), null, r1.p2.o(qVar2, 20), echoTheme.getColors(qVar, 6).getIcon().getPrimary(qVar, 0), qVar, u3.c.$stable | 432, 0);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.b(aVar, tVar3, i10, i11, 6);
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

    public static final sn.z EchoThemeBackButton$lambda$0$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z EchoThemeBackButton$lambda$3(ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        EchoThemeBackButton(aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_BackButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1076195720);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(i3.q.f13017a, 10);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
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
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(5);
                qVar.h0(L);
            }
            BackButton((ho.a) L, null, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 21);
        }
    }

    public static final sn.z Preview_BackButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_BackButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_EchoThemeBackButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1499212642);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$BackButtonKt.INSTANCE.m1795getLambda$812961288$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 22);
        }
    }

    public static final sn.z Preview_EchoThemeBackButton$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EchoThemeBackButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
