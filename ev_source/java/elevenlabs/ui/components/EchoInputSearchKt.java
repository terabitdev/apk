package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "Li3/t;", "modifier", "placeholder", "EchoInputSearch", "(Ljava/lang/String;Lho/l;Li3/t;Ljava/lang/String;Lu2/m;II)V", "Preview_EchoInputSearch_Empty", "(Lu2/m;I)V", "Preview_EchoInputSearch_WithValue", "", "alpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EchoInputSearchKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EchoInputSearch(String str, ho.l lVar, i3.t tVar, String str2, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        String str3;
        int i15;
        boolean z6;
        String str4;
        i3.t tVar3;
        String str5;
        u2.r1 r10;
        i3.t tVar4;
        String str6;
        float f10;
        float f11;
        int i16;
        boolean z10;
        String str7;
        EchoTheme echoTheme;
        boolean z11;
        int i17;
        int i18;
        int i19;
        ho.l lVar2 = lVar;
        str.getClass();
        lVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1557223783);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        int i20 = i11 & 4;
        if (i20 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                str3 = str2;
                if (qVar.f(str3)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                if ((i12 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i20 != 0) {
                        tVar4 = qVar2;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i14 != 0) {
                        str6 = null;
                    } else {
                        str6 = str3;
                    }
                    EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                    long v9 = ib.i.v(6, 0, echoTheme2, qVar, qVar);
                    if (str.length() == 0) {
                        f10 = t2.u.P;
                        f11 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        f11 = 1.0f;
                    }
                    u2.s2 b10 = j1.f.b(f10, null, "alpha", qVar, 3072, 22);
                    qVar = qVar;
                    int i21 = i12;
                    float f12 = 12;
                    i3.t F = r1.d.F(l1.n.j(1, echoTheme2.getColors(qVar, 6).getBorder().getSenary(qVar, 0), l1.n.h(m3.h.c(r1.p2.e(tVar4, f11), echoTheme2.getShapes(qVar, 6).getFull(qVar, 0)), echoTheme2.getColors(qVar, 6).getFill().getInput(qVar, 0), p3.h0.f26395b), echoTheme2.getShapes(qVar, 6).getFull(qVar, 0)), 14, f12);
                    r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
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
                    h4.e eVar = h4.g.f11907f;
                    u2.r.J(eVar, a10, qVar);
                    h4.e eVar2 = h4.g.f11906e;
                    u2.r.J(eVar2, l4, qVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar3 = h4.g.f11908g;
                    u2.r.y(qVar, valueOf, eVar3);
                    h4.d dVar = h4.g.f11909h;
                    u2.r.F(dVar, qVar);
                    h4.e eVar4 = h4.g.f11905d;
                    u2.r.J(eVar4, c5, qVar);
                    i3.t tVar5 = tVar4;
                    u3.c M = kd.a.M(R.drawable.magnifying_glass, qVar, 0);
                    long quaternary = echoTheme2.getColors(qVar, 6).getIcon().getQuaternary(qVar, 0);
                    i3.t o6 = r1.p2.o(qVar2, 20);
                    int i22 = u3.c.$stable;
                    q2.y2.a(M, null, o6, quaternary, qVar, i22 | 432, 0);
                    r1.d.g(r1.p2.s(qVar2, f12), qVar);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    r1.m1 m1Var = new r1.m1(1.0f, true);
                    f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                    int hashCode2 = Long.hashCode(qVar.T);
                    c3.o l7 = qVar.l();
                    i3.t c10 = i3.a.c(m1Var, qVar);
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
                    if (str6 != null && str.length() == 0) {
                        qVar.X(-1279117535);
                        echoTheme = echoTheme2;
                        String str8 = str6;
                        z10 = true;
                        i17 = 6;
                        z11 = false;
                        i16 = i22;
                        j7.d(str8, null, echoTheme.getColors(qVar, 6).getText().getQuaternary(qVar, 0), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), qVar, (i21 >> 9) & 14, 0, 131066);
                        str7 = str8;
                        qVar = qVar;
                        qVar.p(false);
                    } else {
                        i16 = i22;
                        z10 = true;
                        str7 = str6;
                        echoTheme = echoTheme2;
                        z11 = false;
                        i17 = 6;
                        qVar.X(-1278921057);
                        qVar.p(false);
                    }
                    str4 = str;
                    int i23 = i16;
                    lVar2 = lVar;
                    u2.r.a(l2.y0.f21297a.a(new l2.x0(v9, echoTheme.getColors(qVar, i17).getFill().getSecondary(qVar, z11 ? 1 : 0))), c3.k.d(-1776629693, z10, new a2.d(v9, str4, lVar2), qVar), qVar, 56);
                    qVar.p(z10);
                    r1.d.g(r1.p2.s(qVar2, echoTheme.getSpacings(qVar, i17).getX3()), qVar);
                    u3.c M2 = kd.a.M(R.drawable.clear, qVar, z11 ? 1 : 0);
                    long quaternary2 = echoTheme.getColors(qVar, i17).getIcon().getQuaternary(qVar, z11 ? 1 : 0);
                    i3.t a11 = m3.h.a(m3.h.c(qVar2, echoTheme.getShapes(qVar, i17).getFull(qVar, z11 ? 1 : 0)), EchoInputSearch$lambda$0(b10));
                    if ((i21 & 112) == 32) {
                        z11 = z10;
                    }
                    Object L = qVar.L();
                    if (z11 || L == u2.l.f33918a) {
                        L = new w0(lVar2, 0);
                        qVar.h0(L);
                    }
                    q2.y2.a(M2, null, l1.n.p(a11, true, null, null, null, (ho.a) L, 14), quaternary2, qVar, i23 | 48, 0);
                    qVar.p(z10);
                    str5 = str7;
                    tVar3 = tVar5;
                } else {
                    str4 = str;
                    qVar.R();
                    tVar3 = tVar2;
                    str5 = str3;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new x0(str4, lVar2, tVar3, str5, i10, i11, 0);
                    return;
                }
                return;
            }
            str3 = str2;
            if ((i12 & 1171) != 1170) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        str3 = str2;
        if ((i12 & 1171) != 1170) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final float EchoInputSearch$lambda$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z EchoInputSearch$lambda$1$0$0(long j4, String str, ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            a2.v.a(str, lVar, r1.p2.e(i3.q.f13017a, 1.0f), false, s4.y0.a(echoTheme.getTypography(qVar, 6).getBaseRegular400(qVar, 0), ib.i.v(6, 0, echoTheme, qVar, qVar), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), null, null, true, 0, 0, null, null, null, new p3.d1(j4), null, qVar, 100663680, 0, 48856);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z EchoInputSearch$lambda$1$1$0(ho.l lVar) {
        lVar.invoke("");
        return sn.z.f31622a;
    }

    public static final sn.z EchoInputSearch$lambda$2(String str, ho.l lVar, i3.t tVar, String str2, int i10, int i11, u2.m mVar, int i12) {
        EchoInputSearch(str, lVar, tVar, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_EchoInputSearch_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-893759160);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoInputSearchKt.INSTANCE.getLambda$1919556270$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 25);
        }
    }

    public static final sn.z Preview_EchoInputSearch_Empty$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EchoInputSearch_Empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_EchoInputSearch_WithValue(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1466069830);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$EchoInputSearchKt.INSTANCE.m1808getLambda$1516037716$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 26);
        }
    }

    public static final sn.z Preview_EchoInputSearch_WithValue$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EchoInputSearch_WithValue(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
