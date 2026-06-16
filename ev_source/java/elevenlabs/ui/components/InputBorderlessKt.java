package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a}\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001b²\u0006\u000e\u0010\u0017\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "Li3/t;", "modifier", "placeholder", "La2/a2;", "keyboardOptions", "La2/z1;", "keyboardActions", "Ly4/d0;", "visualTransformation", "Ls4/y0;", "textStyle", "", "enabled", "singleLine", "InputBorderless", "(Ljava/lang/String;Lho/l;Li3/t;Ljava/lang/String;La2/a2;La2/z1;Ly4/d0;Ls4/y0;ZZLu2/m;II)V", "Preview_InputBorderless", "(Lu2/m;I)V", "isFocused", "a", "b", "c", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class InputBorderlessKt {
    /* JADX WARN: Removed duplicated region for block: B:113:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputBorderless(final String str, final ho.l lVar, i3.t tVar, String str2, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, s4.y0 y0Var, boolean z6, boolean z10, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        String str3;
        int i15;
        int i16;
        a2.a2 a2Var2;
        int i17;
        int i18;
        a2.z1 z1Var2;
        int i19;
        int i20;
        y4.d0 d0Var2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z11;
        s4.y0 y0Var2;
        boolean z12;
        i3.t tVar3;
        String str4;
        a2.a2 a2Var3;
        a2.z1 z1Var3;
        y4.d0 d0Var3;
        boolean z13;
        u2.r1 r10;
        s4.y0 y0Var3;
        int i29;
        boolean z14;
        s4.y0 y0Var4;
        int i30;
        a2.z1 z1Var4;
        y4.d0 d0Var4;
        String str5;
        boolean z15;
        Object L;
        u2.e eVar;
        Object L2;
        String str6;
        s4.y0 y0Var5;
        int i31;
        int i32;
        int i33;
        str.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(180333223);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i33 = 4;
            } else {
                i33 = 2;
            }
            i12 = i33 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i32 = 32;
            } else {
                i32 = 16;
            }
            i12 |= i32;
        }
        int i34 = i11 & 4;
        if (i34 != 0) {
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
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    a2Var2 = a2Var;
                    if (qVar.f(a2Var2)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 32;
                    if (i18 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i10) == 0) {
                        z1Var2 = z1Var;
                        if (qVar.f(z1Var2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                        i20 = i11 & 64;
                        if (i20 != 0) {
                            i12 |= 1572864;
                        } else if ((1572864 & i10) == 0) {
                            d0Var2 = d0Var;
                            if (qVar.f(d0Var2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                            if ((i10 & 12582912) == 0) {
                                if ((i11 & 128) == 0 && qVar.f(y0Var)) {
                                    i31 = 8388608;
                                    i12 |= i31;
                                }
                                i31 = 4194304;
                                i12 |= i31;
                            }
                            i22 = i11 & RpcError.MAX_MESSAGE_BYTES;
                            if (i22 == 0) {
                                i12 |= 100663296;
                            } else if ((i10 & 100663296) == 0) {
                                i23 = i22;
                                if (qVar.g(z6)) {
                                    i24 = 67108864;
                                } else {
                                    i24 = 33554432;
                                }
                                i12 |= i24;
                                i25 = i11 & 512;
                                if (i25 != 0) {
                                    i12 |= 805306368;
                                } else if ((i10 & 805306368) == 0) {
                                    i26 = i25;
                                    if (qVar.g(z10)) {
                                        i27 = 536870912;
                                    } else {
                                        i27 = 268435456;
                                    }
                                    i12 |= i27;
                                    i28 = i12;
                                    if ((i12 & 306783379) == 306783378) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!qVar.O(i28 & 1, z11)) {
                                        qVar.T();
                                        int i35 = i10 & 1;
                                        i3.q qVar2 = i3.q.f13017a;
                                        if (i35 != 0 && !qVar.y()) {
                                            qVar.R();
                                            if ((i11 & 128) != 0) {
                                                y0Var4 = y0Var;
                                                z14 = z6;
                                                i30 = i28 & (-29360129);
                                            } else {
                                                y0Var4 = y0Var;
                                                z14 = z6;
                                                i30 = i28;
                                            }
                                            z1Var4 = z1Var2;
                                            d0Var4 = d0Var2;
                                            str5 = str3;
                                        } else {
                                            if (i34 != 0) {
                                                tVar2 = qVar2;
                                            }
                                            if (i14 != 0) {
                                                str3 = null;
                                            }
                                            if (i16 != 0) {
                                                a2Var2 = a2.a2.f773e;
                                            }
                                            if (i18 != 0) {
                                                z1Var2 = a2.z1.f1256d;
                                            }
                                            if (i20 != 0) {
                                                d0Var2 = y4.c0.f38288a;
                                            }
                                            if ((i11 & 128) != 0) {
                                                y0Var3 = ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getBody();
                                                i29 = i28 & (-29360129);
                                            } else {
                                                y0Var3 = y0Var;
                                                i29 = i28;
                                            }
                                            if (i23 != 0) {
                                                z14 = true;
                                            } else {
                                                z14 = z6;
                                            }
                                            y0Var4 = y0Var3;
                                            i30 = i29;
                                            z1Var4 = z1Var2;
                                            d0Var4 = d0Var2;
                                            str5 = str3;
                                            if (i26 != 0) {
                                                z15 = false;
                                                qVar.q();
                                                L = qVar.L();
                                                eVar = u2.l.f33918a;
                                                if (L == eVar) {
                                                    L = u2.r.A(Boolean.FALSE);
                                                    qVar.h0(L);
                                                }
                                                final u2.z0 z0Var = (u2.z0) L;
                                                i3.t e10 = r1.p2.e(tVar2, 1.0f);
                                                L2 = qVar.L();
                                                if (L2 == eVar) {
                                                    L2 = new v0(1);
                                                    qVar.h0(L2);
                                                }
                                                i3.t c5 = p4.q.c(e10, true, (ho.l) L2);
                                                final a2.z1 z1Var5 = z1Var4;
                                                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 6);
                                                final y4.d0 d0Var5 = d0Var4;
                                                i3.t tVar4 = tVar2;
                                                int hashCode = Long.hashCode(qVar.T);
                                                c3.o l4 = qVar.l();
                                                i3.t c10 = i3.a.c(c5, qVar);
                                                h4.h.f11920i.getClass();
                                                h4.f fVar = h4.g.f11903b;
                                                qVar.b0();
                                                if (!qVar.S) {
                                                    qVar.k(fVar);
                                                } else {
                                                    qVar.k0();
                                                }
                                                h4.e eVar2 = h4.g.f11907f;
                                                u2.r.J(eVar2, a10, qVar);
                                                h4.e eVar3 = h4.g.f11906e;
                                                u2.r.J(eVar3, l4, qVar);
                                                Integer valueOf = Integer.valueOf(hashCode);
                                                h4.e eVar4 = h4.g.f11908g;
                                                u2.r.y(qVar, valueOf, eVar4);
                                                h4.d dVar = h4.g.f11909h;
                                                u2.r.F(dVar, qVar);
                                                final boolean z16 = z14;
                                                h4.e eVar5 = h4.g.f11905d;
                                                u2.r.J(eVar5, c10, qVar);
                                                final boolean z17 = z15;
                                                f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                                                int i36 = i30;
                                                int hashCode2 = Long.hashCode(qVar.T);
                                                c3.o l7 = qVar.l();
                                                final a2.a2 a2Var4 = a2Var2;
                                                i3.t c11 = i3.a.c(qVar2, qVar);
                                                qVar.b0();
                                                if (!qVar.S) {
                                                    qVar.k(fVar);
                                                } else {
                                                    qVar.k0();
                                                }
                                                u2.r.J(eVar2, d10, qVar);
                                                u2.r.J(eVar3, l7, qVar);
                                                defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                                                u2.r.J(eVar5, c11, qVar);
                                                if (str5 == null && !wq.n.m0(str5) && wq.n.m0(str)) {
                                                    qVar.X(1754404863);
                                                    y0Var5 = y0Var4;
                                                    j7.d(str5, r1.p2.e(qVar2, 1.0f), ib.i.w(ElevenLabsTheme.INSTANCE, qVar, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0Var5, qVar, ((i36 >> 9) & 14) | 48, i36 & 29360128, 131064);
                                                    str6 = str5;
                                                    qVar.p(false);
                                                } else {
                                                    str6 = str5;
                                                    y0Var5 = y0Var4;
                                                    qVar.X(1754626327);
                                                    qVar.p(false);
                                                }
                                                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                                                final long b10 = defpackage.f.b(elevenLabsTheme, qVar, 6);
                                                final s4.y0 y0Var6 = y0Var5;
                                                u2.r.a(l2.y0.f21297a.a(new l2.x0(b10, elevenLabsTheme.getColor(qVar, 6).getBackground().m2005getSecondary0d7_KjU())), c3.k.d(-1674769685, true, new ho.p() { // from class: io.elevenlabs.ui.components.f1
                                                    @Override // ho.p
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        sn.z InputBorderless$lambda$4$0$0;
                                                        int intValue = ((Integer) obj2).intValue();
                                                        InputBorderless$lambda$4$0$0 = InputBorderlessKt.InputBorderless$lambda$4$0$0(b10, str, lVar, z16, y0Var6, a2Var4, z1Var5, z17, d0Var5, z0Var, (u2.m) obj, intValue);
                                                        return InputBorderless$lambda$4$0$0;
                                                    }
                                                }, qVar), qVar, 56);
                                                qVar.p(true);
                                                qVar.p(true);
                                                tVar3 = tVar4;
                                                str4 = str6;
                                                z13 = z16;
                                                a2Var3 = a2Var4;
                                                z1Var3 = z1Var5;
                                                z12 = z17;
                                                d0Var3 = d0Var5;
                                                y0Var2 = y0Var5;
                                            }
                                        }
                                        z15 = z10;
                                        qVar.q();
                                        L = qVar.L();
                                        eVar = u2.l.f33918a;
                                        if (L == eVar) {
                                        }
                                        final u2.z0 z0Var2 = (u2.z0) L;
                                        i3.t e102 = r1.p2.e(tVar2, 1.0f);
                                        L2 = qVar.L();
                                        if (L2 == eVar) {
                                        }
                                        i3.t c52 = p4.q.c(e102, true, (ho.l) L2);
                                        final a2.z1 z1Var52 = z1Var4;
                                        r1.x a102 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 6);
                                        final y4.d0 d0Var52 = d0Var4;
                                        i3.t tVar42 = tVar2;
                                        int hashCode3 = Long.hashCode(qVar.T);
                                        c3.o l42 = qVar.l();
                                        i3.t c102 = i3.a.c(c52, qVar);
                                        h4.h.f11920i.getClass();
                                        h4.f fVar2 = h4.g.f11903b;
                                        qVar.b0();
                                        if (!qVar.S) {
                                        }
                                        h4.e eVar22 = h4.g.f11907f;
                                        u2.r.J(eVar22, a102, qVar);
                                        h4.e eVar32 = h4.g.f11906e;
                                        u2.r.J(eVar32, l42, qVar);
                                        Integer valueOf2 = Integer.valueOf(hashCode3);
                                        h4.e eVar42 = h4.g.f11908g;
                                        u2.r.y(qVar, valueOf2, eVar42);
                                        h4.d dVar2 = h4.g.f11909h;
                                        u2.r.F(dVar2, qVar);
                                        final boolean z162 = z14;
                                        h4.e eVar52 = h4.g.f11905d;
                                        u2.r.J(eVar52, c102, qVar);
                                        final boolean z172 = z15;
                                        f4.f1 d102 = r1.p.d(i3.d.f12997a, false);
                                        int i362 = i30;
                                        int hashCode22 = Long.hashCode(qVar.T);
                                        c3.o l72 = qVar.l();
                                        final a2.a2 a2Var42 = a2Var2;
                                        i3.t c112 = i3.a.c(qVar2, qVar);
                                        qVar.b0();
                                        if (!qVar.S) {
                                        }
                                        u2.r.J(eVar22, d102, qVar);
                                        u2.r.J(eVar32, l72, qVar);
                                        defpackage.f.u(hashCode22, qVar, eVar42, qVar, dVar2);
                                        u2.r.J(eVar52, c112, qVar);
                                        if (str5 == null) {
                                        }
                                        str6 = str5;
                                        y0Var5 = y0Var4;
                                        qVar.X(1754626327);
                                        qVar.p(false);
                                        ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                                        final long b102 = defpackage.f.b(elevenLabsTheme2, qVar, 6);
                                        final s4.y0 y0Var62 = y0Var5;
                                        u2.r.a(l2.y0.f21297a.a(new l2.x0(b102, elevenLabsTheme2.getColor(qVar, 6).getBackground().m2005getSecondary0d7_KjU())), c3.k.d(-1674769685, true, new ho.p() { // from class: io.elevenlabs.ui.components.f1
                                            @Override // ho.p
                                            public final Object invoke(Object obj, Object obj2) {
                                                sn.z InputBorderless$lambda$4$0$0;
                                                int intValue = ((Integer) obj2).intValue();
                                                InputBorderless$lambda$4$0$0 = InputBorderlessKt.InputBorderless$lambda$4$0$0(b102, str, lVar, z162, y0Var62, a2Var42, z1Var52, z172, d0Var52, z0Var2, (u2.m) obj, intValue);
                                                return InputBorderless$lambda$4$0$0;
                                            }
                                        }, qVar), qVar, 56);
                                        qVar.p(true);
                                        qVar.p(true);
                                        tVar3 = tVar42;
                                        str4 = str6;
                                        z13 = z162;
                                        a2Var3 = a2Var42;
                                        z1Var3 = z1Var52;
                                        z12 = z172;
                                        d0Var3 = d0Var52;
                                        y0Var2 = y0Var5;
                                    } else {
                                        qVar.R();
                                        y0Var2 = y0Var;
                                        z12 = z10;
                                        tVar3 = tVar2;
                                        str4 = str3;
                                        a2Var3 = a2Var2;
                                        z1Var3 = z1Var2;
                                        d0Var3 = d0Var2;
                                        z13 = z6;
                                    }
                                    r10 = qVar.r();
                                    if (r10 == null) {
                                        r10.f34012d = new g1(str, lVar, tVar3, str4, a2Var3, z1Var3, d0Var3, y0Var2, z13, z12, i10, i11);
                                        return;
                                    }
                                    return;
                                }
                                i26 = i25;
                                i28 = i12;
                                if ((i12 & 306783379) == 306783378) {
                                }
                                if (!qVar.O(i28 & 1, z11)) {
                                }
                                r10 = qVar.r();
                                if (r10 == null) {
                                }
                            }
                            i23 = i22;
                            i25 = i11 & 512;
                            if (i25 != 0) {
                            }
                            i26 = i25;
                            i28 = i12;
                            if ((i12 & 306783379) == 306783378) {
                            }
                            if (!qVar.O(i28 & 1, z11)) {
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                            }
                        }
                        d0Var2 = d0Var;
                        if ((i10 & 12582912) == 0) {
                        }
                        i22 = i11 & RpcError.MAX_MESSAGE_BYTES;
                        if (i22 == 0) {
                        }
                        i23 = i22;
                        i25 = i11 & 512;
                        if (i25 != 0) {
                        }
                        i26 = i25;
                        i28 = i12;
                        if ((i12 & 306783379) == 306783378) {
                        }
                        if (!qVar.O(i28 & 1, z11)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    z1Var2 = z1Var;
                    i20 = i11 & 64;
                    if (i20 != 0) {
                    }
                    d0Var2 = d0Var;
                    if ((i10 & 12582912) == 0) {
                    }
                    i22 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i22 == 0) {
                    }
                    i23 = i22;
                    i25 = i11 & 512;
                    if (i25 != 0) {
                    }
                    i26 = i25;
                    i28 = i12;
                    if ((i12 & 306783379) == 306783378) {
                    }
                    if (!qVar.O(i28 & 1, z11)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                a2Var2 = a2Var;
                i18 = i11 & 32;
                if (i18 == 0) {
                }
                z1Var2 = z1Var;
                i20 = i11 & 64;
                if (i20 != 0) {
                }
                d0Var2 = d0Var;
                if ((i10 & 12582912) == 0) {
                }
                i22 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i22 == 0) {
                }
                i23 = i22;
                i25 = i11 & 512;
                if (i25 != 0) {
                }
                i26 = i25;
                i28 = i12;
                if ((i12 & 306783379) == 306783378) {
                }
                if (!qVar.O(i28 & 1, z11)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            str3 = str2;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            a2Var2 = a2Var;
            i18 = i11 & 32;
            if (i18 == 0) {
            }
            z1Var2 = z1Var;
            i20 = i11 & 64;
            if (i20 != 0) {
            }
            d0Var2 = d0Var;
            if ((i10 & 12582912) == 0) {
            }
            i22 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i22 == 0) {
            }
            i23 = i22;
            i25 = i11 & 512;
            if (i25 != 0) {
            }
            i26 = i25;
            i28 = i12;
            if ((i12 & 306783379) == 306783378) {
            }
            if (!qVar.O(i28 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        str3 = str2;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        a2Var2 = a2Var;
        i18 = i11 & 32;
        if (i18 == 0) {
        }
        z1Var2 = z1Var;
        i20 = i11 & 64;
        if (i20 != 0) {
        }
        d0Var2 = d0Var;
        if ((i10 & 12582912) == 0) {
        }
        i22 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i22 == 0) {
        }
        i23 = i22;
        i25 = i11 & 512;
        if (i25 != 0) {
        }
        i26 = i25;
        i28 = i12;
        if ((i12 & 306783379) == 306783378) {
        }
        if (!qVar.O(i28 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final void InputBorderless$lambda$2(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z InputBorderless$lambda$3$0(p4.b0 b0Var) {
        b0Var.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z InputBorderless$lambda$4$0$0(long j4, String str, ho.l lVar, boolean z6, s4.y0 y0Var, a2.a2 a2Var, a2.z1 z1Var, boolean z10, y4.d0 d0Var, u2.z0 z0Var, u2.m mVar, int i10) {
        boolean z11;
        if ((i10 & 3) != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z11)) {
            p3.d1 d1Var = new p3.d1(j4);
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e1(z0Var, 0);
                qVar.h0(L);
            }
            a2.v.a(str, lVar, n3.d.s(e10, (ho.l) L), z6, y0Var, a2Var, z1Var, z10, 0, 0, d0Var, null, null, d1Var, null, qVar, 0, 0, 46608);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z InputBorderless$lambda$4$0$0$0$0(u2.z0 z0Var, n3.z zVar) {
        zVar.getClass();
        InputBorderless$lambda$2(z0Var, ((n3.a0) zVar).b());
        return sn.z.f31622a;
    }

    public static final sn.z InputBorderless$lambda$5(String str, ho.l lVar, i3.t tVar, String str2, a2.a2 a2Var, a2.z1 z1Var, y4.d0 d0Var, s4.y0 y0Var, boolean z6, boolean z10, int i10, int i11, u2.m mVar, int i12) {
        InputBorderless(str, lVar, tVar, str2, a2Var, z1Var, d0Var, y0Var, z6, z10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_InputBorderless(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(39138522);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(l1.n.y(i3.q.f13017a, l1.n.x(qVar), true, true), 10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
                L = u2.r.A("");
                qVar.h0(L);
            }
            u2.z0 z0Var = (u2.z0) L;
            String Preview_InputBorderless$lambda$0$1 = Preview_InputBorderless$lambda$0$1(z0Var);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e1(z0Var, 1);
                qVar.h0(L2);
            }
            InputBorderless(Preview_InputBorderless$lambda$0$1, (ho.l) L2, null, "Placeholder", null, null, null, null, false, false, qVar, 3120, 1012);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = u2.r.A("");
                qVar.h0(L3);
            }
            u2.z0 z0Var2 = (u2.z0) L3;
            String Preview_InputBorderless$lambda$0$5 = Preview_InputBorderless$lambda$0$5(z0Var2);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new e1(z0Var2, 2);
                qVar.h0(L4);
            }
            InputBorderless(Preview_InputBorderless$lambda$0$5, (ho.l) L4, null, "Very long placeholder that normally should take few lines", null, null, null, null, false, false, qVar, 3120, 1012);
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = u2.r.A("Very long prefilled text that takes much of space xyz");
                qVar.h0(L5);
            }
            u2.z0 z0Var3 = (u2.z0) L5;
            String Preview_InputBorderless$lambda$0$9 = Preview_InputBorderless$lambda$0$9(z0Var3);
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new e1(z0Var3, 3);
                qVar.h0(L6);
            }
            InputBorderless(Preview_InputBorderless$lambda$0$9, (ho.l) L6, null, "Very long placeholder that normally should take few lines", null, null, null, null, false, false, qVar, 3120, 1012);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 14);
        }
    }

    private static final String Preview_InputBorderless$lambda$0$1(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_InputBorderless$lambda$0$11$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z Preview_InputBorderless$lambda$0$3$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_InputBorderless$lambda$0$5(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_InputBorderless$lambda$0$7$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    private static final String Preview_InputBorderless$lambda$0$9(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z Preview_InputBorderless$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_InputBorderless(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
