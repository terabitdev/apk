package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.e5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008b\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", "accessibilityLabel", "Lkotlin/Function0;", "Lsn/z;", "onPress", "Li3/t;", "modifier", "Lp3/x;", "rippleColor", "", "enabled", "Lp4/k;", "role", "stateDescription", "bounded", "onLongPress", "Lkotlin/Function1;", "Lr1/s;", FirebaseAnalytics.Param.CONTENT, "ButtonContainer-83mGB3Q", "(Ljava/lang/String;Lho/a;Li3/t;JZILjava/lang/String;ZLho/a;Lho/q;Lu2/m;II)V", "ButtonContainer", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ButtonContainerKt {
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0185, code lost:
    
        if (r19 != 0) goto L319;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d0  */
    /* renamed from: ButtonContainer-83mGB3Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1780ButtonContainer83mGB3Q(final String str, final ho.a aVar, i3.t tVar, long j4, boolean z6, int i10, String str2, boolean z10, ho.a aVar2, final ho.q qVar, u2.m mVar, final int i11, final int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        long j10;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z12;
        final ho.a aVar3;
        final i3.t tVar3;
        final long j11;
        final String str3;
        final boolean z13;
        u2.r1 r10;
        i3.t tVar4;
        long j12;
        ho.a aVar4;
        String str4;
        boolean z14;
        float f10;
        boolean z15;
        boolean z16;
        int i25;
        boolean z17;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        str.getClass();
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1838063581);
        if ((i11 & 6) == 0) {
            if (qVar2.f(str)) {
                i30 = 4;
            } else {
                i30 = 2;
            }
            i13 = i30 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i13 |= i29;
        }
        int i31 = i12 & 4;
        if (i31 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            if ((i11 & 3072) != 0) {
                if ((i12 & 8) == 0) {
                    j10 = j4;
                    if (qVar2.e(j10)) {
                        i28 = 2048;
                        i13 |= i28;
                    }
                } else {
                    j10 = j4;
                }
                i28 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i13 |= i28;
            } else {
                j10 = j4;
            }
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                z11 = z6;
                if (qVar2.g(z11)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i16;
                if ((196608 & i11) == 0) {
                    if ((i12 & 32) == 0) {
                        i17 = i10;
                        if (qVar2.d(i17)) {
                            i27 = 131072;
                            i13 |= i27;
                        }
                    } else {
                        i17 = i10;
                    }
                    i27 = 65536;
                    i13 |= i27;
                } else {
                    i17 = i10;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (qVar2.f(str2)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (qVar2.g(z10)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                i22 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i22 != 0) {
                    i13 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i23 = i22;
                    if (qVar2.h(aVar2)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i13 |= i24;
                    if ((i11 & 805306368) == 0) {
                        if (qVar2.h(qVar)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                        i13 |= i26;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!qVar2.O(i13 & 1, z12)) {
                        qVar2.T();
                        if ((i11 & 1) != 0 && !qVar2.y()) {
                            qVar2.R();
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                            }
                            z14 = z10;
                            tVar4 = tVar2;
                            j12 = j10;
                            str4 = str2;
                        } else {
                            if (i31 != 0) {
                                tVar4 = i3.q.f13017a;
                            } else {
                                tVar4 = tVar2;
                            }
                            if ((i12 & 8) != 0) {
                                j12 = defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar2, 6);
                                i13 &= -7169;
                            } else {
                                j12 = j10;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                i17 = 0;
                            }
                            aVar4 = null;
                            if (i18 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i20 != 0) {
                                z14 = true;
                            } else {
                                z14 = z10;
                            }
                        }
                        aVar4 = aVar2;
                        qVar2.q();
                        qVar2.X(-1147518058);
                        if (z11) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.3f;
                        }
                        i3.t a10 = m3.h.a(tVar4, f10);
                        i3.t tVar5 = tVar4;
                        if ((i13 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z18 = z15;
                        if ((3670016 & i13) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z19 = z18 | z16;
                        Object L = qVar2.L();
                        u2.e eVar = u2.l.f33918a;
                        if (!z19 && L != eVar) {
                            i25 = i13;
                        } else {
                            i25 = i13;
                            L = new p(1, str, str4);
                            qVar2.h0(L);
                        }
                        i3.t c5 = p4.q.c(a10, true, (ho.l) L);
                        if (aVar != null && aVar4 != null) {
                            qVar2.X(-412164910);
                            Object L2 = qVar2.L();
                            if (L2 == eVar) {
                                L2 = j0.c.o(qVar2);
                            }
                            c5 = l1.n.q(c5, (p1.l) L2, e5.b(t2.u.P, 2, j12, z14), z11, new p4.k(i17), aVar4, aVar, 424);
                            z17 = false;
                            qVar2.p(false);
                        } else if (aVar != null) {
                            qVar2.X(-411666895);
                            Object L3 = qVar2.L();
                            if (L3 == eVar) {
                                L3 = j0.c.o(qVar2);
                            }
                            c5 = l1.n.n(c5, (p1.l) L3, e5.b(t2.u.P, 2, j12, z14), z11, new p4.k(i17), aVar, 8);
                            z17 = false;
                            qVar2.p(false);
                        } else {
                            z17 = false;
                            qVar2.X(-411278372);
                            qVar2.p(false);
                        }
                        qVar2.p(z17);
                        f4.f1 d10 = r1.p.d(i3.d.f13001e, z17);
                        long j13 = j12;
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
                        u2.r.J(h4.g.f11907f, d10, qVar2);
                        u2.r.J(h4.g.f11906e, l4, qVar2);
                        u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar2);
                        u2.r.J(h4.g.f11905d, c10, qVar2);
                        qVar.invoke(r1.t.f29349a, qVar2, Integer.valueOf(6 | ((i25 >> 24) & 112)));
                        qVar2.p(true);
                        boolean z20 = z14;
                        aVar3 = aVar4;
                        str3 = str4;
                        z13 = z20;
                        tVar3 = tVar5;
                        j11 = j13;
                    } else {
                        qVar2.R();
                        aVar3 = aVar2;
                        tVar3 = tVar2;
                        j11 = j10;
                        str3 = str2;
                        z13 = z10;
                    }
                    final boolean z21 = z11;
                    final int i32 = i17;
                    r10 = qVar2.r();
                    if (r10 == null) {
                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.q
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                sn.z ButtonContainer_83mGB3Q$lambda$3;
                                int intValue = ((Integer) obj2).intValue();
                                ButtonContainer_83mGB3Q$lambda$3 = ButtonContainerKt.ButtonContainer_83mGB3Q$lambda$3(str, aVar, tVar3, j11, z21, i32, str3, z13, aVar3, qVar, i11, i12, (u2.m) obj, intValue);
                                return ButtonContainer_83mGB3Q$lambda$3;
                            }
                        };
                        return;
                    }
                    return;
                }
                i23 = i22;
                if ((i11 & 805306368) == 0) {
                }
                if ((i13 & 306783379) == 306783378) {
                }
                if (!qVar2.O(i13 & 1, z12)) {
                }
                final boolean z212 = z11;
                final int i322 = i17;
                r10 = qVar2.r();
                if (r10 == null) {
                }
            }
            z11 = z6;
            if ((196608 & i11) == 0) {
            }
            i18 = i12 & 64;
            if (i18 != 0) {
            }
            i20 = i12 & 128;
            if (i20 != 0) {
            }
            i22 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i22 != 0) {
            }
            i23 = i22;
            if ((i11 & 805306368) == 0) {
            }
            if ((i13 & 306783379) == 306783378) {
            }
            if (!qVar2.O(i13 & 1, z12)) {
            }
            final boolean z2122 = z11;
            final int i3222 = i17;
            r10 = qVar2.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        if ((i11 & 3072) != 0) {
        }
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        z11 = z6;
        if ((196608 & i11) == 0) {
        }
        i18 = i12 & 64;
        if (i18 != 0) {
        }
        i20 = i12 & 128;
        if (i20 != 0) {
        }
        i22 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i22 != 0) {
        }
        i23 = i22;
        if ((i11 & 805306368) == 0) {
        }
        if ((i13 & 306783379) == 306783378) {
        }
        if (!qVar2.O(i13 & 1, z12)) {
        }
        final boolean z21222 = z11;
        final int i32222 = i17;
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ButtonContainer_83mGB3Q$lambda$0$0(String str, String str2, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        if (str2 != null) {
            p4.y.l(str2, b0Var);
        }
        return sn.z.f31622a;
    }

    public static final sn.z ButtonContainer_83mGB3Q$lambda$3(String str, ho.a aVar, i3.t tVar, long j4, boolean z6, int i10, String str2, boolean z10, ho.a aVar2, ho.q qVar, int i11, int i12, u2.m mVar, int i13) {
        m1780ButtonContainer83mGB3Q(str, aVar, tVar, j4, z6, i10, str2, z10, aVar2, qVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }
}
