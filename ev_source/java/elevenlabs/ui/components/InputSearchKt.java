package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "Li3/t;", "modifier", "placeholder", "InputSearch", "(Ljava/lang/String;Lho/l;Li3/t;Ljava/lang/String;Lu2/m;II)V", "Preview_InpuSearch", "(Lu2/m;I)V", "", "alpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class InputSearchKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputSearch(String str, ho.l lVar, i3.t tVar, String str2, u2.m mVar, int i10, int i11) {
        String str3;
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        String str4;
        int i15;
        int i16;
        boolean z6;
        ho.l lVar2;
        u2.q qVar;
        String str5;
        u2.r1 r10;
        i3.t tVar3;
        String str6;
        long m2005getSecondary0d7_KjU;
        long m2186getSecondary0d7_KjU;
        float f10;
        long j4;
        boolean z10;
        int i17;
        int i18;
        str.getClass();
        lVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1277838151);
        if ((i10 & 6) == 0) {
            str3 = str;
            if (qVar2.f(str3)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            str3 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                str4 = str2;
                if (qVar2.f(str4)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i12;
                if ((i16 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i16 & 1, z6)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i19 != 0) {
                        tVar3 = qVar3;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    i3.t e10 = r1.p2.e(tVar3, 1.0f);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    i3.t c5 = m3.h.c(e10, elevenLabsTheme.getShapes(qVar2, 6).getFull());
                    if (elevenLabsTheme.getColor(qVar2, 6).isDark()) {
                        qVar2.X(358193258);
                        qVar2.p(false);
                        m2005getSecondary0d7_KjU = p3.h0.c(1719960708);
                    } else {
                        qVar2.X(358195042);
                        m2005getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getBackground().m2005getSecondary0d7_KjU();
                        qVar2.p(false);
                    }
                    i3.t F = r1.d.F(l1.n.h(c5, m2005getSecondary0d7_KjU, p3.h0.f26395b), elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, 6).m2353getX2D9Ej5fM());
                    r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar2, 48);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    i3.t c10 = i3.a.c(F, qVar2);
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
                    u3.c M = kd.a.M(R.drawable.magnifying_glass, qVar2, 0);
                    if (elevenLabsTheme.getColor(qVar2, 6).isDark()) {
                        qVar2.X(-607140508);
                        m2186getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getText().m2185getPrimary0d7_KjU();
                    } else {
                        qVar2.X(-607139226);
                        m2186getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getText().m2186getSecondary0d7_KjU();
                    }
                    qVar2.p(false);
                    int i20 = u3.c.$stable | 48;
                    i3.t tVar4 = tVar3;
                    q2.y2.a(M, null, null, m2186getSecondary0d7_KjU, qVar2, i20, 4);
                    r1.d.g(r1.p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM()), qVar2);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    r1.m1 m1Var = new r1.m1(1.0f, true);
                    s4.y0 bodySmall500 = elevenLabsTheme.getTypo(qVar2, 6).getBodySmall500();
                    int i21 = i16 & 112;
                    String str7 = str6;
                    InputBorderlessKt.InputBorderless(str3, lVar, m1Var, str7, null, null, null, bodySmall500, false, true, qVar2, (i16 & 14) | 805306368 | i21 | (i16 & 7168), 368);
                    lVar2 = lVar;
                    str5 = str7;
                    r1.d.g(r1.p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM()), qVar2);
                    if (str.length() == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    u2.s2 b10 = j1.f.b(f10, null, "alpha", qVar2, 3072, 22);
                    u3.c M2 = kd.a.M(R.drawable.clear, qVar2, 0);
                    if (elevenLabsTheme.getColor(qVar2, 6).isDark()) {
                        j4 = 2583691263L;
                    } else {
                        j4 = 2570861635L;
                    }
                    long e11 = p3.h0.e(j4);
                    i3.t a11 = m3.h.a(m3.h.c(qVar3, elevenLabsTheme.getShapes(qVar2, 6).getFull()), InputSearch$lambda$0$0(b10));
                    if (i21 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object L = qVar2.L();
                    if (z10 || L == u2.l.f33918a) {
                        L = new w0(lVar2, 1);
                        qVar2.h0(L);
                    }
                    q2.y2.a(M2, null, l1.n.p(a11, true, null, null, null, (ho.a) L, 14), e11, qVar2, i20, 0);
                    qVar = qVar2;
                    qVar.p(true);
                    tVar2 = tVar4;
                } else {
                    lVar2 = lVar;
                    qVar = qVar2;
                    qVar.R();
                    str5 = str4;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new x0(str, lVar2, tVar2, str5, i10, i11, 1);
                    return;
                }
                return;
            }
            str4 = str2;
            i16 = i12;
            if ((i16 & 1171) != 1170) {
            }
            if (qVar2.O(i16 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        str4 = str2;
        i16 = i12;
        if ((i16 & 1171) != 1170) {
        }
        if (qVar2.O(i16 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final float InputSearch$lambda$0$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z InputSearch$lambda$0$1$0(ho.l lVar) {
        lVar.invoke("");
        return sn.z.f31622a;
    }

    public static final sn.z InputSearch$lambda$1(String str, ho.l lVar, i3.t tVar, String str2, int i10, int i11, u2.m mVar, int i12) {
        InputSearch(str, lVar, tVar, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_InpuSearch(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1477528572);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = r1.p2.e(qVar2, 1.0f);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            i3.t e11 = r1.p2.e(qVar2, 1.0f);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new v0(2);
                qVar.h0(L);
            }
            InputSearch("", (ho.l) L, e11, "Search", qVar, 3510, 0);
            i3.t e12 = r1.p2.e(qVar2, 1.0f);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new v0(3);
                qVar.h0(L2);
            }
            InputSearch("Non empty", (ho.l) L2, e12, "Search", qVar, 3510, 0);
            i3.t e13 = r1.p2.e(qVar2, 1.0f);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new v0(4);
                qVar.h0(L3);
            }
            InputSearch("Very long text that don't fint input space and will be cut off", (ho.l) L3, e13, "Search", qVar, 3510, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 16);
        }
    }

    public static final sn.z Preview_InpuSearch$lambda$0$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_InpuSearch$lambda$0$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_InpuSearch$lambda$0$2$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_InpuSearch$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_InpuSearch(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
