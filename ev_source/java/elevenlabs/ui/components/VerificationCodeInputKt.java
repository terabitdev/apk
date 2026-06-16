package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "accessibilityPlaceholder", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "", MetaStatKeys.KEY_LENGTH, "Li3/t;", "modifier", "La2/z1;", "keyboardActions", "VerificationCodeInput", "(Ljava/lang/String;Ljava/lang/String;Lho/l;ILi3/t;La2/z1;Lu2/m;II)V", "Preview_VerificationCodeInput", "(Lu2/m;I)V", "input", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VerificationCodeInputKt {
    public static final void Preview_VerificationCodeInput(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-28550982);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t E = r1.d.E(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM());
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), i3.d.B0, qVar, 0);
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
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new v0(14);
                qVar.h0(L);
            }
            VerificationCodeInput("Field label", "", (ho.l) L, 6, null, null, qVar, 3510, 48);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new v0(15);
                qVar.h0(L2);
            }
            VerificationCodeInput("Field label", "123", (ho.l) L2, 6, null, null, qVar, 3510, 48);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = u2.r.A("");
                qVar.h0(L3);
            }
            u2.z0 z0Var = (u2.z0) L3;
            String Preview_VerificationCodeInput$lambda$0$3 = Preview_VerificationCodeInput$lambda$0$3(z0Var);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new e1(z0Var, 13);
                qVar.h0(L4);
            }
            VerificationCodeInput("Field label", Preview_VerificationCodeInput$lambda$0$3, (ho.l) L4, 6, null, null, qVar, 3462, 48);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 20);
        }
    }

    public static final sn.z Preview_VerificationCodeInput$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_VerificationCodeInput$lambda$0$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    private static final String Preview_VerificationCodeInput$lambda$0$3(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_VerificationCodeInput$lambda$0$5$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z Preview_VerificationCodeInput$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VerificationCodeInput(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerificationCodeInput(String str, String str2, ho.l lVar, int i10, i3.t tVar, a2.z1 z1Var, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        int i15;
        a2.z1 z1Var2;
        int i16;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        a2.z1 z1Var3;
        u2.r1 r10;
        i3.t tVar4;
        a2.z1 z1Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i17;
        int i18;
        int i19;
        int i20;
        str.getClass();
        str2.getClass();
        lVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1755900352);
        if ((i11 & 6) == 0) {
            if (qVar2.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i13 = i20 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar2.f(str2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i13 |= i19;
        }
        if ((i11 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i13 |= i18;
        }
        if ((i11 & 3072) == 0) {
            if (qVar2.d(i10)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i17;
        }
        int i21 = i12 & 16;
        if (i21 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 32;
            if (i15 == 0) {
                i13 |= 196608;
            } else if ((196608 & i11) == 0) {
                z1Var2 = z1Var;
                if (qVar2.f(z1Var2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
                boolean z13 = false;
                if ((74899 & i13) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i13 & 1, z6)) {
                    if (i21 != 0) {
                        tVar4 = i3.q.f13017a;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i15 != 0) {
                        z1Var4 = a2.z1.f1256d;
                    } else {
                        z1Var4 = z1Var2;
                    }
                    if ((i13 & 14) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i13 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = z10 | z11;
                    Object L = qVar2.L();
                    u2.e eVar = u2.l.f33918a;
                    if (z14 || L == eVar) {
                        L = new p(5, str, str2);
                        qVar2.h0(L);
                    }
                    i3.t c5 = p4.q.c(tVar4, true, (ho.l) L);
                    a2.a2 a2Var = new a2.a2(3, 7, 115);
                    if ((i13 & 7168) == 2048) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((i13 & 896) == 256) {
                        z13 = true;
                    }
                    boolean z15 = z12 | z13;
                    Object L2 = qVar2.L();
                    if (z15 || L2 == eVar) {
                        L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.h(i10, lVar);
                        qVar2.h0(L2);
                    }
                    qVar = qVar2;
                    i3.t tVar5 = tVar4;
                    a2.z1 z1Var5 = z1Var4;
                    a2.v.a(str2, (ho.l) L2, c5, false, null, a2Var, z1Var5, false, 0, 0, null, null, null, null, c3.k.d(-69473091, true, new y2(i10, str2), qVar2), qVar, ((i13 >> 3) & 14) | 1572864 | ((i13 << 6) & 29360128), 196608, 32568);
                    z1Var3 = z1Var5;
                    tVar3 = tVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    tVar3 = tVar2;
                    z1Var3 = z1Var2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new g2(str, str2, lVar, i10, tVar3, z1Var3, i11, i12);
                    return;
                }
                return;
            }
            z1Var2 = z1Var;
            boolean z132 = false;
            if ((74899 & i13) != 74898) {
            }
            if (qVar2.O(i13 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 32;
        if (i15 == 0) {
        }
        z1Var2 = z1Var;
        boolean z1322 = false;
        if ((74899 & i13) != 74898) {
        }
        if (qVar2.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z VerificationCodeInput$lambda$0$0(String str, String str2, p4.b0 b0Var) {
        String str3;
        b0Var.getClass();
        if (!wq.n.m0(str2)) {
            str3 = defpackage.f.i(" - ", str2);
        } else {
            str3 = "";
        }
        p4.y.d(str + str3, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z VerificationCodeInput$lambda$1$0(int i10, ho.l lVar, String str) {
        str.getClass();
        if (str.length() <= i10) {
            int i11 = 0;
            while (true) {
                if (i11 < str.length()) {
                    if (!Character.isDigit(str.charAt(i11))) {
                        break;
                    }
                    i11++;
                } else {
                    lVar.invoke(str);
                    break;
                }
            }
        }
        return sn.z.f31622a;
    }

    public static final sn.z VerificationCodeInput$lambda$2(int i10, String str, ho.p pVar, u2.m mVar, int i11) {
        boolean z6;
        int i12;
        ElevenLabsTheme elevenLabsTheme;
        pVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            float f10 = 1.0f;
            i3.t e10 = r1.p2.e(qVar2, 1.0f);
            r1.k2 a10 = r1.i2.a(r1.j.f29234g, i3.d.f13005z0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
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
            qVar.X(-1151186565);
            int i13 = 0;
            while (i13 < i10) {
                i3.l lVar = i3.d.f13001e;
                if (f10 <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                i3.t f11 = r1.p2.f(new r1.m1(f10, true), 64);
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                i3.t j4 = l1.n.j(1, elevenLabsTheme2.getColor(qVar, 6).getDivider().m2059getLine0d7_KjU(), f11, elevenLabsTheme2.getShapes(qVar, 6).getMd());
                f4.f1 d10 = r1.p.d(lVar, false);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(j4, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar);
                u2.r.J(h4.g.f11906e, l7, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c10, qVar);
                if (i13 < str.length()) {
                    qVar.X(1168584238);
                    u2.q qVar3 = qVar;
                    elevenLabsTheme = elevenLabsTheme2;
                    i12 = i13;
                    AutoScalingTextKt.m1775AutoScalingTextpB_G1vE(String.valueOf(str.charAt(i13)), null, elevenLabsTheme2.getTypo(qVar, 6).getTitleLarge700Inter(), defpackage.f.b(elevenLabsTheme2, qVar, 6), new e5.k(3), 0, false, 0L, 0, qVar3, 0, 482);
                    qVar = qVar3;
                    qVar.p(false);
                } else {
                    i12 = i13;
                    elevenLabsTheme = elevenLabsTheme2;
                    qVar.X(1168926199);
                    qVar.p(false);
                }
                qVar.p(true);
                if (i12 < i10 - 1) {
                    qVar.X(1110243022);
                    r1.d.g(r1.p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM()), qVar);
                    qVar.p(false);
                } else {
                    qVar.X(1110338161);
                    qVar.p(false);
                }
                i13 = i12 + 1;
                f10 = 1.0f;
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z VerificationCodeInput$lambda$3(String str, String str2, ho.l lVar, int i10, i3.t tVar, a2.z1 z1Var, int i11, int i12, u2.m mVar, int i13) {
        VerificationCodeInput(str, str2, lVar, i10, tVar, z1Var, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }
}
