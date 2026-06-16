package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.b6;
import q2.i6;
import q2.j6;
import q2.x5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ai\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "", "accessibilityLabel", "Li3/t;", "modifier", "accessibilityStateLabel", "Lkotlin/Function0;", "onValueChangeFinished", "Lno/d;", "valueRange", "Slider", "(FLho/l;Ljava/lang/String;Li3/t;Ljava/lang/String;Lho/a;Lno/d;Lu2/m;II)V", "Preview_Slider", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SliderKt {
    public static final void Preview_Slider(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1443384024);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new u2.e1(0.5f);
                qVar.h0(L);
            }
            u2.w0 w0Var = (u2.w0) L;
            float Preview_Slider$lambda$1 = Preview_Slider$lambda$1(w0Var);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n2(w0Var, 0);
                qVar.h0(L2);
            }
            Slider(Preview_Slider$lambda$1, (ho.l) L2, "Content description", null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 11);
        }
    }

    private static final float Preview_Slider$lambda$1(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    private static final void Preview_Slider$lambda$2(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    public static final sn.z Preview_Slider$lambda$3$0(u2.w0 w0Var, float f10) {
        Preview_Slider$lambda$2(w0Var, f10);
        return sn.z.f31622a;
    }

    public static final sn.z Preview_Slider$lambda$4(int i10, u2.m mVar, int i11) {
        Preview_Slider(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(float f10, ho.l lVar, String str, i3.t tVar, String str2, ho.a aVar, no.d dVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        String str3;
        int i15;
        int i16;
        ho.a aVar2;
        int i17;
        no.d dVar2;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        String str4;
        ho.a aVar3;
        no.d dVar3;
        u2.r1 r10;
        no.d cVar;
        ho.a aVar4;
        int i18;
        String str5;
        ElevenLabsTheme elevenLabsTheme;
        long b10;
        long b11;
        long b12;
        int i19;
        long c5;
        long m2005getSecondary0d7_KjU;
        long j4;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        Object L;
        int i20;
        int i21;
        int i22;
        int i23;
        lVar.getClass();
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-267986722);
        if ((i10 & 6) == 0) {
            if (qVar2.c(f10)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.f(str)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        int i24 = i11 & 8;
        if (i24 != 0) {
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
                str3 = str2;
                if (qVar2.f(str3)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    aVar2 = aVar;
                    if (qVar2.h(aVar2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    if ((1572864 & i10) != 0) {
                        if ((i11 & 64) == 0) {
                            dVar2 = dVar;
                            if (qVar2.f(dVar2)) {
                                i20 = 1048576;
                                i12 |= i20;
                            }
                        } else {
                            dVar2 = dVar;
                        }
                        i20 = 524288;
                        i12 |= i20;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i12 & 599187) == 599186) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i12 & 1, z6)) {
                        qVar2.T();
                        int i25 = i10 & 1;
                        u2.e eVar = u2.l.f33918a;
                        if (i25 != 0 && !qVar2.y()) {
                            qVar2.R();
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                        } else {
                            if (i24 != 0) {
                                tVar2 = i3.q.f13017a;
                            }
                            if (i14 != 0) {
                                str3 = null;
                            }
                            if (i16 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == eVar) {
                                    L2 = new u0(25);
                                    qVar2.h0(L2);
                                }
                                aVar2 = (ho.a) L2;
                            }
                            if ((i11 & 64) != 0) {
                                cVar = new no.c(t2.u.P, 1.0f);
                                aVar4 = aVar2;
                                i18 = i12 & (-3670017);
                                str5 = str3;
                                qVar2.q();
                                b6 b6Var = b6.f26896a;
                                x5 c10 = b6.c(qVar2);
                                elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                                b10 = defpackage.f.b(elevenLabsTheme, qVar2, 6);
                                b11 = defpackage.f.b(elevenLabsTheme, qVar2, 6);
                                b12 = defpackage.f.b(elevenLabsTheme, qVar2, 6);
                                if (!elevenLabsTheme.getColor(qVar2, 6).isDark()) {
                                    i19 = 1728053247;
                                } else {
                                    i19 = 436207616;
                                }
                                c5 = p3.h0.c(i19);
                                m2005getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getBackground().m2005getSecondary0d7_KjU();
                                long j13 = c10.f27899f;
                                long j14 = c10.f27900g;
                                long j15 = c10.f27901h;
                                long j16 = c10.f27902i;
                                long j17 = c10.f27903j;
                                if (b10 == 16) {
                                    j4 = j17;
                                } else {
                                    j4 = j17;
                                    b10 = c10.f27894a;
                                }
                                if (b11 == 16) {
                                    j10 = b11;
                                } else {
                                    j10 = c10.f27895b;
                                }
                                if (b12 == 16) {
                                    j11 = b12;
                                } else {
                                    j11 = c10.f27896c;
                                }
                                if (c5 == 16) {
                                    j12 = c5;
                                } else {
                                    j12 = c10.f27897d;
                                }
                                if (m2005getSecondary0d7_KjU == 16) {
                                    m2005getSecondary0d7_KjU = c10.f27898e;
                                }
                                x5 x5Var = new x5(b10, j10, j11, j12, m2005getSecondary0d7_KjU, j13, j14, j15, j16, j4);
                                if ((i18 & 896) != 256) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ((i18 & 57344) != 16384) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z10 | z11;
                                L = qVar2.L();
                                if (!z12 || L == eVar) {
                                    L = new p(4, str, str5);
                                    qVar2.h0(L);
                                }
                                qVar = qVar2;
                                i6.a(f10, lVar, p4.q.c(tVar2, false, (ho.l) L), false, aVar4, x5Var, null, ComposableSingletons$SliderKt.INSTANCE.m1823getLambda$958054878$ui_release(), c3.k.d(727845057, true, new c1(x5Var, 3), qVar2), cVar, qVar, (i18 & 14) | 905969664 | (i18 & 112) | (57344 & (i18 >> 3)), (i18 >> 18) & 14);
                                str4 = str5;
                                tVar3 = tVar2;
                                aVar3 = aVar4;
                                dVar3 = cVar;
                            }
                        }
                        i18 = i12;
                        str5 = str3;
                        aVar4 = aVar2;
                        cVar = dVar2;
                        qVar2.q();
                        b6 b6Var2 = b6.f26896a;
                        x5 c102 = b6.c(qVar2);
                        elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        b10 = defpackage.f.b(elevenLabsTheme, qVar2, 6);
                        b11 = defpackage.f.b(elevenLabsTheme, qVar2, 6);
                        b12 = defpackage.f.b(elevenLabsTheme, qVar2, 6);
                        if (!elevenLabsTheme.getColor(qVar2, 6).isDark()) {
                        }
                        c5 = p3.h0.c(i19);
                        m2005getSecondary0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getBackground().m2005getSecondary0d7_KjU();
                        long j132 = c102.f27899f;
                        long j142 = c102.f27900g;
                        long j152 = c102.f27901h;
                        long j162 = c102.f27902i;
                        long j172 = c102.f27903j;
                        if (b10 == 16) {
                        }
                        if (b11 == 16) {
                        }
                        if (b12 == 16) {
                        }
                        if (c5 == 16) {
                        }
                        if (m2005getSecondary0d7_KjU == 16) {
                        }
                        x5 x5Var2 = new x5(b10, j10, j11, j12, m2005getSecondary0d7_KjU, j132, j142, j152, j162, j4);
                        if ((i18 & 896) != 256) {
                        }
                        if ((i18 & 57344) != 16384) {
                        }
                        z12 = z10 | z11;
                        L = qVar2.L();
                        if (!z12) {
                        }
                        L = new p(4, str, str5);
                        qVar2.h0(L);
                        qVar = qVar2;
                        i6.a(f10, lVar, p4.q.c(tVar2, false, (ho.l) L), false, aVar4, x5Var2, null, ComposableSingletons$SliderKt.INSTANCE.m1823getLambda$958054878$ui_release(), c3.k.d(727845057, true, new c1(x5Var2, 3), qVar2), cVar, qVar, (i18 & 14) | 905969664 | (i18 & 112) | (57344 & (i18 >> 3)), (i18 >> 18) & 14);
                        str4 = str5;
                        tVar3 = tVar2;
                        aVar3 = aVar4;
                        dVar3 = cVar;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        tVar3 = tVar2;
                        str4 = str3;
                        aVar3 = aVar2;
                        dVar3 = dVar2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.f(f10, lVar, str, tVar3, str4, aVar3, dVar3, i10, i11);
                        return;
                    }
                    return;
                }
                aVar2 = aVar;
                if ((1572864 & i10) != 0) {
                }
                if ((i12 & 599187) == 599186) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            str3 = str2;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            aVar2 = aVar;
            if ((1572864 & i10) != 0) {
            }
            if ((i12 & 599187) == 599186) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        str3 = str2;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        aVar2 = aVar;
        if ((1572864 & i10) != 0) {
        }
        if ((i12 & 599187) == 599186) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z Slider$lambda$1$0(String str, String str2, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        if (str2 != null) {
            p4.y.l(str2, b0Var);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Slider$lambda$2(x5 x5Var, j6 j6Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean h10;
        int i12;
        j6Var.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((u2.q) mVar).f(j6Var);
            } else {
                h10 = ((u2.q) mVar).h(j6Var);
            }
            if (h10) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            int i13 = i11;
            b6 b6Var = b6.f26896a;
            float f10 = 0;
            i3.t h11 = r1.p2.h(i3.q.f13017a, t2.u.P, 2, 1);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n0(24);
                qVar.h0(L);
            }
            ho.p pVar = (ho.p) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new ho.q() { // from class: io.elevenlabs.ui.components.SliderKt$Slider$3$2$1
                    @Override // ho.q
                    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        m1880invokewPWG1Vc((r3.e) obj, ((o3.b) obj2).f24764a, ((p3.x) obj3).f26440a);
                        return sn.z.f31622a;
                    }

                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                    public final void m1880invokewPWG1Vc(r3.e eVar2, long j4, long j10) {
                        eVar2.getClass();
                    }
                };
                qVar.h0(L2);
            }
            b6Var.a(j6Var, h11, true, x5Var, pVar, (ho.q) L2, f10, t2.u.P, qVar, 102457784 | (i13 & 14), 128);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Slider$lambda$2$0$0(r3.e eVar, o3.b bVar) {
        eVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Slider$lambda$3(float f10, ho.l lVar, String str, i3.t tVar, String str2, ho.a aVar, no.d dVar, int i10, int i11, u2.m mVar, int i12) {
        Slider(f10, lVar, str, tVar, str2, aVar, dVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
