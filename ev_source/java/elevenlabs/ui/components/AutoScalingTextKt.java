package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ai\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", ParameterNames.TEXT, "Li3/t;", "modifier", "Ls4/y0;", "style", "Lp3/x;", "color", "Le5/k;", "textAlign", "", "maxLines", "", "softWrap", "Lh5/o;", "minFontSize", "", "overflow", "Lsn/z;", "AutoScalingText-pB_G1vE", "(Ljava/lang/String;Li3/t;Ls4/y0;JLe5/k;IZJILu2/m;II)V", "AutoScalingText", "Preview_AutoScalingText", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AutoScalingTextKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00de  */
    /* renamed from: AutoScalingText-pB_G1vE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1775AutoScalingTextpB_G1vE(final String str, i3.t tVar, s4.y0 y0Var, long j4, e5.k kVar, int i10, boolean z6, long j10, int i11, u2.m mVar, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        long j11;
        int i17;
        int i18;
        e5.k kVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z10;
        final s4.y0 y0Var2;
        final boolean z11;
        final long j12;
        final e5.k kVar3;
        final int i33;
        final long j13;
        final int i34;
        final i3.t tVar2;
        u2.r1 r10;
        s4.y0 y0Var3;
        long j14;
        e5.k kVar4;
        boolean z12;
        long j15;
        final int i35;
        final s4.y0 y0Var4;
        final long j16;
        final e5.k kVar5;
        final boolean z13;
        final long j17;
        final int i36;
        int i37;
        int i38;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-436785431);
        if ((i12 & 6) == 0) {
            if (qVar.f(str)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i14 = i38 | i12;
        } else {
            i14 = i12;
        }
        int i39 = i13 & 2;
        if (i39 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            if (qVar.f(tVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i14 |= i15;
            if ((i12 & 384) == 0) {
                if ((i13 & 4) == 0 && qVar.f(y0Var)) {
                    i37 = RpcError.MAX_MESSAGE_BYTES;
                    i14 |= i37;
                }
                i37 = 128;
                i14 |= i37;
            }
            i16 = i13 & 8;
            if (i16 == 0) {
                i14 |= 3072;
            } else if ((i12 & 3072) == 0) {
                j11 = j4;
                if (qVar.e(j11)) {
                    i17 = 2048;
                } else {
                    i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i14 |= i17;
                i18 = i13 & 16;
                if (i18 != 0) {
                    i14 |= 24576;
                } else if ((i12 & 24576) == 0) {
                    kVar2 = kVar;
                    if (qVar.f(kVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i14 |= i19;
                    i20 = i13 & 32;
                    if (i20 == 0) {
                        i14 |= 196608;
                    } else if ((196608 & i12) == 0) {
                        i21 = i10;
                        if (qVar.d(i21)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i24 = i14 | 1572864;
                        } else {
                            int i40 = i14;
                            if ((i12 & 1572864) == 0) {
                                if (qVar.g(z6)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i24 = i40 | i25;
                            } else {
                                i24 = i40;
                            }
                        }
                        i26 = i13 & 128;
                        if (i26 != 0) {
                            i24 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            i27 = i26;
                            i28 = i39;
                            if (qVar.e(j10)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i24 |= i29;
                            i30 = i13 & RpcError.MAX_MESSAGE_BYTES;
                            if (i30 == 0) {
                                i24 |= 100663296;
                            } else if ((100663296 & i12) == 0) {
                                if (qVar.d(i11)) {
                                    i31 = 67108864;
                                } else {
                                    i31 = 33554432;
                                }
                                i24 |= i31;
                                i32 = i24;
                                if ((i32 & 38347923) != 38347922) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (qVar.O(i32 & 1, z10)) {
                                    qVar.T();
                                    if ((i12 & 1) != 0 && !qVar.y()) {
                                        qVar.R();
                                        if ((i13 & 4) != 0) {
                                            i32 &= -897;
                                        }
                                        tVar2 = tVar;
                                        y0Var4 = y0Var;
                                        z13 = z6;
                                        j17 = j10;
                                        i35 = i11;
                                        j16 = j11;
                                        kVar5 = kVar2;
                                    } else {
                                        if (i28 != 0) {
                                            tVar2 = i3.q.f13017a;
                                        } else {
                                            tVar2 = tVar;
                                        }
                                        if ((i13 & 4) != 0) {
                                            y0Var3 = ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getBody();
                                            i32 &= -897;
                                        } else {
                                            y0Var3 = y0Var;
                                        }
                                        if (i16 != 0) {
                                            j14 = p3.x.f26438m;
                                        } else {
                                            j14 = j11;
                                        }
                                        if (i18 != 0) {
                                            kVar4 = null;
                                        } else {
                                            kVar4 = kVar2;
                                        }
                                        if (i20 != 0) {
                                            i21 = 1;
                                        }
                                        if (i23 != 0) {
                                            z12 = true;
                                        } else {
                                            z12 = z6;
                                        }
                                        if (i27 != 0) {
                                            j15 = ae.l.K(8);
                                        } else {
                                            j15 = j10;
                                        }
                                        if (i30 != 0) {
                                            y0Var4 = y0Var3;
                                            j16 = j14;
                                            kVar5 = kVar4;
                                            z13 = z12;
                                            j17 = j15;
                                            i36 = i21;
                                            i35 = 1;
                                            qVar.q();
                                            final s4.w0 j18 = s4.t.j(qVar);
                                            r1.d.a(tVar2, null, false, c3.k.d(-1875818541, true, new ho.q() { // from class: io.elevenlabs.ui.components.e
                                                @Override // ho.q
                                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                                    sn.z AutoScalingText_pB_G1vE$lambda$0;
                                                    int intValue = ((Integer) obj3).intValue();
                                                    AutoScalingText_pB_G1vE$lambda$0 = AutoScalingTextKt.AutoScalingText_pB_G1vE$lambda$0(str, y0Var4, i36, z13, j17, i35, j16, kVar5, j18, (r1.u) obj, (u2.m) obj2, intValue);
                                                    return AutoScalingText_pB_G1vE$lambda$0;
                                                }
                                            }, qVar), qVar, ((i32 >> 3) & 14) | 3072, 6);
                                            y0Var2 = y0Var4;
                                            i33 = i36;
                                            z11 = z13;
                                            j13 = j17;
                                            i34 = i35;
                                            j12 = j16;
                                            kVar3 = kVar5;
                                        } else {
                                            i35 = i11;
                                            y0Var4 = y0Var3;
                                            j16 = j14;
                                            kVar5 = kVar4;
                                            z13 = z12;
                                            j17 = j15;
                                        }
                                    }
                                    i36 = i21;
                                    qVar.q();
                                    final s4.w0 j182 = s4.t.j(qVar);
                                    r1.d.a(tVar2, null, false, c3.k.d(-1875818541, true, new ho.q() { // from class: io.elevenlabs.ui.components.e
                                        @Override // ho.q
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            sn.z AutoScalingText_pB_G1vE$lambda$0;
                                            int intValue = ((Integer) obj3).intValue();
                                            AutoScalingText_pB_G1vE$lambda$0 = AutoScalingTextKt.AutoScalingText_pB_G1vE$lambda$0(str, y0Var4, i36, z13, j17, i35, j16, kVar5, j182, (r1.u) obj, (u2.m) obj2, intValue);
                                            return AutoScalingText_pB_G1vE$lambda$0;
                                        }
                                    }, qVar), qVar, ((i32 >> 3) & 14) | 3072, 6);
                                    y0Var2 = y0Var4;
                                    i33 = i36;
                                    z11 = z13;
                                    j13 = j17;
                                    i34 = i35;
                                    j12 = j16;
                                    kVar3 = kVar5;
                                } else {
                                    qVar.R();
                                    y0Var2 = y0Var;
                                    z11 = z6;
                                    j12 = j11;
                                    kVar3 = kVar2;
                                    i33 = i21;
                                    j13 = j10;
                                    i34 = i11;
                                    tVar2 = tVar;
                                }
                                r10 = qVar.r();
                                if (r10 != null) {
                                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.f
                                        @Override // ho.p
                                        public final Object invoke(Object obj, Object obj2) {
                                            sn.z AutoScalingText_pB_G1vE$lambda$1;
                                            int intValue = ((Integer) obj2).intValue();
                                            AutoScalingText_pB_G1vE$lambda$1 = AutoScalingTextKt.AutoScalingText_pB_G1vE$lambda$1(str, tVar2, y0Var2, j12, kVar3, i33, z11, j13, i34, i12, i13, (u2.m) obj, intValue);
                                            return AutoScalingText_pB_G1vE$lambda$1;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            i32 = i24;
                            if ((i32 & 38347923) != 38347922) {
                            }
                            if (qVar.O(i32 & 1, z10)) {
                            }
                            r10 = qVar.r();
                            if (r10 != null) {
                            }
                        }
                        i27 = i26;
                        i28 = i39;
                        i30 = i13 & RpcError.MAX_MESSAGE_BYTES;
                        if (i30 == 0) {
                        }
                        i32 = i24;
                        if ((i32 & 38347923) != 38347922) {
                        }
                        if (qVar.O(i32 & 1, z10)) {
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                        }
                    }
                    i21 = i10;
                    i23 = i13 & 64;
                    if (i23 != 0) {
                    }
                    i26 = i13 & 128;
                    if (i26 != 0) {
                    }
                    i27 = i26;
                    i28 = i39;
                    i30 = i13 & RpcError.MAX_MESSAGE_BYTES;
                    if (i30 == 0) {
                    }
                    i32 = i24;
                    if ((i32 & 38347923) != 38347922) {
                    }
                    if (qVar.O(i32 & 1, z10)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                kVar2 = kVar;
                i20 = i13 & 32;
                if (i20 == 0) {
                }
                i21 = i10;
                i23 = i13 & 64;
                if (i23 != 0) {
                }
                i26 = i13 & 128;
                if (i26 != 0) {
                }
                i27 = i26;
                i28 = i39;
                i30 = i13 & RpcError.MAX_MESSAGE_BYTES;
                if (i30 == 0) {
                }
                i32 = i24;
                if ((i32 & 38347923) != 38347922) {
                }
                if (qVar.O(i32 & 1, z10)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            j11 = j4;
            i18 = i13 & 16;
            if (i18 != 0) {
            }
            kVar2 = kVar;
            i20 = i13 & 32;
            if (i20 == 0) {
            }
            i21 = i10;
            i23 = i13 & 64;
            if (i23 != 0) {
            }
            i26 = i13 & 128;
            if (i26 != 0) {
            }
            i27 = i26;
            i28 = i39;
            i30 = i13 & RpcError.MAX_MESSAGE_BYTES;
            if (i30 == 0) {
            }
            i32 = i24;
            if ((i32 & 38347923) != 38347922) {
            }
            if (qVar.O(i32 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        if ((i12 & 384) == 0) {
        }
        i16 = i13 & 8;
        if (i16 == 0) {
        }
        j11 = j4;
        i18 = i13 & 16;
        if (i18 != 0) {
        }
        kVar2 = kVar;
        i20 = i13 & 32;
        if (i20 == 0) {
        }
        i21 = i10;
        i23 = i13 & 64;
        if (i23 != 0) {
        }
        i26 = i13 & 128;
        if (i26 != 0) {
        }
        i27 = i26;
        i28 = i39;
        i30 = i13 & RpcError.MAX_MESSAGE_BYTES;
        if (i30 == 0) {
        }
        i32 = i24;
        if ((i32 & 38347923) != 38347922) {
        }
        if (qVar.O(i32 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z AutoScalingText_pB_G1vE$lambda$0(String str, s4.y0 y0Var, int i10, boolean z6, long j4, int i11, long j10, e5.k kVar, s4.w0 w0Var, r1.u uVar, u2.m mVar, int i12) {
        int i13;
        boolean z10;
        s4.y0 y0Var2;
        u2.q qVar;
        long j11;
        int i14;
        uVar.getClass();
        if ((i12 & 6) == 0) {
            if (((u2.q) mVar).f(uVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i12 | i14;
        } else {
            i13 = i12;
        }
        boolean z11 = true;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i13 & 1, z10)) {
            long j12 = ((r1.v) uVar).f29369b;
            int h10 = h5.a.h(j12);
            if (!h5.a.d(j12) || h10 == Integer.MAX_VALUE) {
                z11 = false;
            }
            boolean f10 = qVar2.f(str) | qVar2.f(y0Var) | qVar2.d(h10) | qVar2.d(i10) | qVar2.g(z6) | qVar2.e(j4) | qVar2.d(i11) | qVar2.g(z11);
            Object L = qVar2.L();
            if (!f10 && L != u2.l.f33918a) {
                qVar = qVar2;
            } else {
                if (z11) {
                    s4.p0 p0Var = y0Var.f31174a;
                    s4.c0 c0Var = y0Var.f31175b;
                    if (!AutoScalingText_pB_G1vE$lambda$0$0$fits(y0Var, h10, w0Var, str, i11, z6, i10, p0Var.f31102b)) {
                        long j13 = p0Var.f31102b;
                        if (!AutoScalingText_pB_G1vE$lambda$0$0$fits(y0Var, h10, w0Var, str, i11, z6, i10, j4)) {
                            j11 = j4;
                        } else {
                            long j14 = j4;
                            long j15 = j13;
                            long j16 = j14;
                            for (int i15 = 0; i15 < 20; i15++) {
                                long T = ae.l.T((h5.o.c(j15) + h5.o.c(j16)) / 2.0f, 4294967296L);
                                if (AutoScalingText_pB_G1vE$lambda$0$0$fits(y0Var, h10, w0Var, str, i11, z6, i10, T)) {
                                    j16 = T;
                                    j14 = j16;
                                } else {
                                    j15 = T;
                                }
                            }
                            j11 = j14;
                        }
                        boolean d10 = h5.o.d(c0Var.f31011c);
                        long j17 = c0Var.f31011c;
                        if (d10) {
                            float c5 = h5.o.c(j11) / h5.o.c(p0Var.f31102b);
                            ae.l.j(j17);
                            j17 = ae.l.T(h5.o.c(j17) * c5, 1095216660480L & j17);
                        }
                        qVar = qVar2;
                        y0Var2 = s4.y0.a(y0Var, 0L, j11, null, null, null, 0L, 0, j17, null, null, 16646141);
                        qVar.h0(y0Var2);
                        L = y0Var2;
                    }
                }
                y0Var2 = y0Var;
                qVar = qVar2;
                qVar.h0(y0Var2);
                L = y0Var2;
            }
            j7.d(str, r1.p2.e(i3.q.f13017a, 1.0f), j10, 0L, null, 0L, kVar, 0L, i11, z6, i10, 0, null, (s4.y0) L, qVar, 48, 0, 101368);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    private static final boolean AutoScalingText_pB_G1vE$lambda$0$0$fits(s4.y0 y0Var, int i10, s4.w0 w0Var, String str, int i11, boolean z6, int i12, long j4) {
        long j10;
        boolean d10 = h5.o.d(y0Var.f31175b.f31011c);
        s4.c0 c0Var = y0Var.f31175b;
        if (d10) {
            long j11 = c0Var.f31011c;
            float c5 = h5.o.c(j4) / h5.o.c(y0Var.f31174a.f31102b);
            ae.l.j(j11);
            j10 = ae.l.T(h5.o.c(j11) * c5, 1095216660480L & j11);
        } else {
            j10 = c0Var.f31011c;
        }
        return !s4.w0.a(s4.y0.a(y0Var, 0L, j4, null, null, null, 0L, 0, j10, null, null, 16646141), i11, w0Var, str, i12, z6, 960, h5.b.b(i10, 0, 12)).d();
    }

    public static final sn.z AutoScalingText_pB_G1vE$lambda$1(String str, i3.t tVar, s4.y0 y0Var, long j4, e5.k kVar, int i10, boolean z6, long j10, int i11, int i12, int i13, u2.m mVar, int i14) {
        m1775AutoScalingTextpB_G1vE(str, tVar, y0Var, j4, kVar, i10, z6, j10, i11, mVar, u2.r.M(i12 | 1), i13);
        return sn.z.f31622a;
    }

    public static final void Preview_AutoScalingText(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1534860954);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 10;
            i3.q qVar2 = i3.q.f13017a;
            i3.t h10 = l1.n.h(r1.p2.s(r1.d.E(qVar2, f10), 100), ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getBackground().m2005getSecondary0d7_KjU(), p3.h0.f26395b);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            m1775AutoScalingTextpB_G1vE("Hello", null, null, 0L, null, 1, false, 0L, 0, qVar, 196614, 478);
            r1.d.g(r1.p2.f(qVar2, f10), qVar);
            m1775AutoScalingTextpB_G1vE("Center", null, null, 0L, new e5.k(3), 1, false, 0L, 0, qVar, 196614, 462);
            r1.d.g(r1.p2.f(qVar2, f10), qVar);
            m1775AutoScalingTextpB_G1vE("Very long text with resize", null, null, 0L, null, 1, false, 0L, 0, qVar, 196614, 478);
            r1.d.g(r1.p2.f(qVar2, f10), qVar);
            m1775AutoScalingTextpB_G1vE("Very long text with center", null, null, 0L, new e5.k(3), 1, false, 0L, 0, qVar, 196614, 462);
            m1775AutoScalingTextpB_G1vE("Very long text that should automatically wrap and scale to fit within two lines without manual line breaks", null, null, 0L, new e5.k(3), 2, false, 0L, 0, qVar, 196614, 462);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 20);
        }
    }

    public static final sn.z Preview_AutoScalingText$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AutoScalingText(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
