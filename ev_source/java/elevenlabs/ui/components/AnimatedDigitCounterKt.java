package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", ParameterNames.TEXT, "Ls4/y0;", "textStyle", "Lp3/x;", "textColor", "Lsn/z;", "AnimatedDigitCounter-FNF3uiM", "(Ljava/lang/String;Ls4/y0;JLu2/m;II)V", "AnimatedDigitCounter", "previousText", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AnimatedDigitCounterKt {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if ((r27 & 4) != 0) goto L147;
     */
    /* renamed from: AnimatedDigitCounter-FNF3uiM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1774AnimatedDigitCounterFNF3uiM(String str, s4.y0 y0Var, long j4, u2.m mVar, int i10, int i11) {
        int i12;
        s4.y0 y0Var2;
        long j10;
        boolean z6;
        s4.y0 y0Var3;
        long j11;
        boolean z10;
        Character ch2;
        char c5;
        boolean z11;
        int i13;
        int i14;
        int i15;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1977697699);
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
            if ((i11 & 2) == 0) {
                y0Var2 = y0Var;
                if (qVar.f(y0Var2)) {
                    i14 = 32;
                    i12 |= i14;
                }
            } else {
                y0Var2 = y0Var;
            }
            i14 = 16;
            i12 |= i14;
        } else {
            y0Var2 = y0Var;
        }
        if ((i10 & 384) == 0) {
            j10 = j4;
            if ((i11 & 4) == 0 && qVar.e(j10)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            j10 = j4;
        }
        boolean z12 = true;
        if ((i12 & 147) != 146) {
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
            } else {
                if ((i11 & 2) != 0) {
                    y0Var2 = ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getTitleXLarge700Eleven();
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    j10 = defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar, 6);
                    i12 &= -897;
                }
                qVar.q();
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = u2.r.A(str);
                    qVar.h0(L);
                }
                u2.z0 z0Var = (u2.z0) L;
                if ((i12 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L2 = qVar.L();
                if (z10 || L2 == eVar) {
                    L2 = new AnimatedDigitCounterKt$AnimatedDigitCounter$1$1(str, z0Var, null);
                    qVar.h0(L2);
                }
                u2.r.f((ho.p) L2, str, qVar);
                String str2 = str.toString();
                String s02 = wq.n.s0(str2.length(), AnimatedDigitCounter_FNF3uiM$lambda$1(z0Var).toString());
                r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c10 = i3.a.c(i3.q.f13017a, qVar);
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
                u2.r.J(h4.g.f11905d, c10, qVar);
                qVar.X(207893049);
                int i16 = 0;
                int i17 = 0;
                while (i16 < str2.length()) {
                    char charAt = str2.charAt(i16);
                    int i18 = i17 + 1;
                    s02.getClass();
                    if (i17 >= 0 && i17 < s02.length()) {
                        ch2 = Character.valueOf(s02.charAt(i17));
                    } else {
                        ch2 = null;
                    }
                    if (ch2 != null) {
                        c5 = ch2.charValue();
                    } else {
                        c5 = '0';
                    }
                    if (kotlin.jvm.internal.m.d(charAt, c5) >= 0) {
                        z11 = z12;
                    } else {
                        z11 = false;
                    }
                    Character valueOf = Character.valueOf(charAt);
                    boolean g10 = qVar.g(z11);
                    Object L3 = qVar.L();
                    if (g10 || L3 == eVar) {
                        L3 = new io.elevenlabs.ocr.t(z11, 9);
                        qVar.h0(L3);
                    }
                    i1.l.b(valueOf, null, (ho.l) L3, null, "DigitAnimation", null, c3.k.d(1142773105, z12, new io.elevenlabs.readerapp.ui.components.a1(j10, y0Var2), qVar), qVar, 1597440, 42);
                    i16++;
                    str2 = str2;
                    i17 = i18;
                    j10 = j10;
                    eVar = eVar;
                    z12 = true;
                }
                qVar.p(false);
                qVar.p(true);
                y0Var3 = y0Var2;
                j11 = j10;
            }
        } else {
            qVar.R();
            y0Var3 = y0Var2;
            j11 = j10;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.n(str, y0Var3, j11, i10, i11, 2);
        }
    }

    private static final String AnimatedDigitCounter_FNF3uiM$lambda$1(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final i1.m0 AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0(boolean z6, int i10, i1.q qVar) {
        i1.m0 c5;
        qVar.getClass();
        if (z6) {
            c5 = i1.l.c(i1.y0.m(new io.elevenlabs.highlighter.t(i10, 16)).a(i1.y0.e(null, 3)), i1.y0.p(new io.elevenlabs.highlighter.t(i10, 17)).a(i1.y0.f(null, 3)));
        } else {
            c5 = i1.l.c(i1.y0.m(new io.elevenlabs.highlighter.t(i10, 18)).a(i1.y0.e(null, 3)), i1.y0.p(new io.elevenlabs.highlighter.t(i10, 19)).a(i1.y0.f(null, 3)));
        }
        c5.f12835d = new i1.c3(false, i1.k.f12811b);
        return c5;
    }

    public static final int AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$0(int i10, int i11) {
        return i11 / i10;
    }

    public static final int AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$1(int i10, int i11) {
        return (-i11) / i10;
    }

    public static final int AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$2(int i10, int i11) {
        return (-i11) / i10;
    }

    public static final int AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$3(int i10, int i11) {
        return i11 / i10;
    }

    public static final sn.z AnimatedDigitCounter_FNF3uiM$lambda$4$0$1(long j4, s4.y0 y0Var, i1.o oVar, char c5, u2.m mVar, int i10) {
        oVar.getClass();
        j7.d(String.valueOf(c5), null, j4, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, y0Var, mVar, 0, 0, 130042);
        return sn.z.f31622a;
    }

    public static final sn.z AnimatedDigitCounter_FNF3uiM$lambda$5(String str, s4.y0 y0Var, long j4, int i10, int i11, u2.m mVar, int i12) {
        m1774AnimatedDigitCounterFNF3uiM(str, y0Var, j4, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static /* synthetic */ int a(int i10, int i11) {
        return AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$3(i10, i11);
    }

    public static /* synthetic */ int b(int i10, int i11) {
        return AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$2(i10, i11);
    }

    public static /* synthetic */ int f(int i10, int i11) {
        return AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$0(i10, i11);
    }

    public static /* synthetic */ int g(int i10, int i11) {
        return AnimatedDigitCounter_FNF3uiM$lambda$4$0$0$0$1(i10, i11);
    }
}
