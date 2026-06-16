package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\u001a=\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\r\u001aY\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0003\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0010\u001ag\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", Constants.ScionAnalytics.PARAM_LABEL, "Li3/t;", "modifier", "Lkotlin/Function0;", "Lsn/z;", "onClick", "textRight", "Select", "(Ljava/lang/String;Li3/t;Lho/a;Ljava/lang/String;Lu2/m;II)V", "", "iconStartRes", "iconEndRes", "(Ljava/lang/String;Li3/t;Lho/a;Ljava/lang/Integer;ILjava/lang/String;Lu2/m;II)V", "iconStart", "iconEnd", "(Ljava/lang/String;Li3/t;Lho/a;Lho/p;ILjava/lang/String;Lu2/m;II)V", FirebaseAnalytics.Param.CONTENT, "(Ljava/lang/String;Lho/p;Lho/p;Li3/t;Lho/a;ILjava/lang/String;Lu2/m;II)V", "Preview_Select", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SelectKt {
    public static final void Preview_Select(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-333390350);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = r1.p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar, 6, e10);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(x10, qVar);
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
            Select("Label", r1.p2.e(qVar2, 1.0f), null, "TextRight", qVar, 3126, 4);
            qVar = qVar;
            Select("Label", r1.p2.e(qVar2, 1.0f), (ho.a) null, Integer.valueOf(R.drawable.suitcase_work), 0, "TextRight", qVar, 196662, 20);
            Select("Very long label text that wont fit the component", r1.p2.e(qVar2, 1.0f), (ho.a) null, Integer.valueOf(R.drawable.suitcase_work), 0, "TextRight", qVar, 196662, 20);
            Select("Label", r1.p2.e(qVar2, 1.0f), (ho.a) null, Integer.valueOf(R.drawable.suitcase_work), 0, (String) null, qVar, 54, 52);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 6);
        }
    }

    public static final sn.z Preview_Select$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Select(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Select(String str, ho.p pVar, ho.p pVar2, i3.t tVar, ho.a aVar, int i10, String str2, u2.m mVar, int i11, int i12) {
        int i13;
        ho.p pVar3;
        int i14;
        int i15;
        i3.t tVar2;
        int i16;
        int i17;
        ho.a aVar2;
        int i18;
        int i19;
        int i20;
        String str3;
        int i21;
        int i22;
        boolean z6;
        u2.q qVar;
        ho.p pVar4;
        i3.t tVar3;
        int i23;
        String str4;
        u2.r1 r10;
        int i24;
        int i25;
        int i26;
        String str5;
        int i27;
        int i28;
        int i29;
        str.getClass();
        pVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1312411645);
        if ((i11 & 6) == 0) {
            if (qVar2.f(str)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i13 = i29 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar2.h(pVar)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i13 |= i28;
        }
        int i30 = i12 & 4;
        if (i30 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            pVar3 = pVar2;
            if (qVar2.h(pVar3)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            i15 = i12 & 8;
            if (i15 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                tVar2 = tVar;
                if (qVar2.f(tVar2)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i16;
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    aVar2 = aVar;
                    if (qVar2.h(aVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i13 |= i18;
                    if ((196608 & i11) != 0) {
                        if ((i12 & 32) == 0) {
                            i19 = i10;
                            if (qVar2.d(i19)) {
                                i27 = 131072;
                                i13 |= i27;
                            }
                        } else {
                            i19 = i10;
                        }
                        i27 = 65536;
                        i13 |= i27;
                    } else {
                        i19 = i10;
                    }
                    i20 = i12 & 64;
                    if (i20 == 0) {
                        i13 |= 1572864;
                    } else if ((1572864 & i11) == 0) {
                        str3 = str2;
                        if (qVar2.f(str3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                        i22 = i13;
                        if ((599187 & i13) != 599186) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i22 & 1, z6)) {
                            qVar2.T();
                            if ((i11 & 1) != 0 && !qVar2.y()) {
                                qVar2.R();
                                if ((i12 & 32) != 0) {
                                    i25 = i22 & (-458753);
                                } else {
                                    i25 = i22;
                                }
                                i26 = i19;
                            } else {
                                if (i30 != 0) {
                                    pVar3 = null;
                                }
                                if (i15 != 0) {
                                    tVar2 = i3.q.f13017a;
                                }
                                if (i17 != 0) {
                                    Object L = qVar2.L();
                                    if (L == u2.l.f33918a) {
                                        L = new u0(15);
                                        qVar2.h0(L);
                                    }
                                    aVar2 = (ho.a) L;
                                }
                                if ((i12 & 32) != 0) {
                                    i24 = i22 & (-458753);
                                    i19 = R.drawable.chevron_right;
                                } else {
                                    i24 = i22;
                                }
                                i25 = i24;
                                i26 = i19;
                                if (i20 != 0) {
                                    str5 = null;
                                    qVar2.q();
                                    qVar = qVar2;
                                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar2, m3.h.c(tVar2, ElevenLabsTheme.INSTANCE.getShapes(qVar2, 6).getMd()), 0L, false, 0, null, false, null, c3.k.d(1574822631, true, new io.elevenlabs.readerapp.ui.screens.authenticated.e1(pVar3, str5, i26, pVar), qVar2), qVar, (i25 & 14) | 805306368 | ((i25 >> 9) & 112), 504);
                                    i3.t tVar4 = tVar2;
                                    i23 = i26;
                                    pVar4 = pVar3;
                                    tVar3 = tVar4;
                                    str4 = str5;
                                }
                            }
                            str5 = str3;
                            qVar2.q();
                            qVar = qVar2;
                            ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar2, m3.h.c(tVar2, ElevenLabsTheme.INSTANCE.getShapes(qVar2, 6).getMd()), 0L, false, 0, null, false, null, c3.k.d(1574822631, true, new io.elevenlabs.readerapp.ui.screens.authenticated.e1(pVar3, str5, i26, pVar), qVar2), qVar, (i25 & 14) | 805306368 | ((i25 >> 9) & 112), 504);
                            i3.t tVar42 = tVar2;
                            i23 = i26;
                            pVar4 = pVar3;
                            tVar3 = tVar42;
                            str4 = str5;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            pVar4 = pVar3;
                            tVar3 = tVar2;
                            i23 = i19;
                            str4 = str3;
                        }
                        ho.a aVar3 = aVar2;
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.g(str, pVar, pVar4, tVar3, aVar3, i23, str4, i11, i12);
                            return;
                        }
                        return;
                    }
                    str3 = str2;
                    i22 = i13;
                    if ((599187 & i13) != 599186) {
                    }
                    if (qVar2.O(i22 & 1, z6)) {
                    }
                    ho.a aVar32 = aVar2;
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                aVar2 = aVar;
                if ((196608 & i11) != 0) {
                }
                i20 = i12 & 64;
                if (i20 == 0) {
                }
                str3 = str2;
                i22 = i13;
                if ((599187 & i13) != 599186) {
                }
                if (qVar2.O(i22 & 1, z6)) {
                }
                ho.a aVar322 = aVar2;
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            tVar2 = tVar;
            i17 = i12 & 16;
            if (i17 != 0) {
            }
            aVar2 = aVar;
            if ((196608 & i11) != 0) {
            }
            i20 = i12 & 64;
            if (i20 == 0) {
            }
            str3 = str2;
            i22 = i13;
            if ((599187 & i13) != 599186) {
            }
            if (qVar2.O(i22 & 1, z6)) {
            }
            ho.a aVar3222 = aVar2;
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        pVar3 = pVar2;
        i15 = i12 & 8;
        if (i15 == 0) {
        }
        tVar2 = tVar;
        i17 = i12 & 16;
        if (i17 != 0) {
        }
        aVar2 = aVar;
        if ((196608 & i11) != 0) {
        }
        i20 = i12 & 64;
        if (i20 == 0) {
        }
        str3 = str2;
        i22 = i13;
        if ((599187 & i13) != 599186) {
        }
        if (qVar2.O(i22 & 1, z6)) {
        }
        ho.a aVar32222 = aVar2;
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z Select$lambda$1(String str, i3.t tVar, ho.a aVar, String str2, int i10, int i11, u2.m mVar, int i12) {
        Select(str, tVar, aVar, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z Select$lambda$10(String str, ho.p pVar, ho.p pVar2, i3.t tVar, ho.a aVar, int i10, String str2, int i11, int i12, u2.m mVar, int i13) {
        Select(str, pVar, pVar2, tVar, aVar, i10, str2, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final sn.z Select$lambda$3(Integer num, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            q2.y2.a(kd.a.M(num.intValue(), qVar, 0), null, r1.p2.o(i3.q.f13017a, 20), defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar, 6), qVar, u3.c.$stable | 432, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Select$lambda$4(String str, i3.t tVar, ho.a aVar, Integer num, int i10, String str2, int i11, int i12, u2.m mVar, int i13) {
        Select(str, tVar, aVar, num, i10, str2, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final sn.z Select$lambda$6(String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            j7.d(str, r1.p2.e(i3.q.f13017a, 1.0f), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ElevenLabsTheme.INSTANCE.getTypo(qVar, 6).getPill700(), qVar, 48, 24960, 110588);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Select$lambda$7(String str, i3.t tVar, ho.a aVar, ho.p pVar, int i10, String str2, int i11, int i12, u2.m mVar, int i13) {
        Select(str, tVar, aVar, pVar, i10, str2, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final sn.z Select$lambda$9(ho.p pVar, String str, int i10, ho.p pVar2, r1.s sVar, u2.m mVar, int i11) {
        boolean z6;
        i3.q qVar;
        int i12;
        sVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            long m2059getLine0d7_KjU = elevenLabsTheme.getColor(qVar2, 6).getDivider().m2059getLine0d7_KjU();
            p3.b1 md = elevenLabsTheme.getShapes(qVar2, 6).getMd();
            i3.q qVar3 = i3.q.f13017a;
            i3.t F = r1.d.F(l1.n.j(1, m2059getLine0d7_KjU, qVar3, md), elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM());
            r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13005z0, qVar2, 48);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(F, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            if (pVar != null) {
                qVar2.X(-1751265368);
                pVar.invoke(qVar2, 0);
                r1.d.g(r1.p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), qVar2);
                qVar2.p(false);
            } else {
                qVar2.X(-1751158697);
                qVar2.p(false);
            }
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            r1.m1 m1Var = new r1.m1(1.0f, true);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(m1Var, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, d10, qVar2);
            u2.r.J(eVar2, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c10, qVar2);
            pVar2.invoke(qVar2, 0);
            qVar2.p(true);
            if (str != null) {
                qVar2.X(-1751032713);
                i12 = 6;
                r1.d.g(r1.p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, 6).m2356getX4D9Ej5fM()), qVar2);
                qVar = qVar3;
                j7.d(str, null, ib.i.w(elevenLabsTheme, qVar2, 6), 0L, null, 0L, null, 0L, 0, false, 1, 0, null, elevenLabsTheme.getTypo(qVar2, 6).getBodySmall500(), qVar2, 0, 24576, 114682);
                qVar2 = qVar2;
                r1.d.g(r1.p2.s(qVar, elevenLabsTheme.getSpacings(qVar2, 6).m2355getX3D9Ej5fM()), qVar2);
                qVar2.p(false);
            } else {
                qVar = qVar3;
                i12 = 6;
                qVar2.X(-1750663689);
                qVar2.p(false);
            }
            q2.y2.a(kd.a.M(i10, qVar2, 0), null, r1.p2.o(qVar, 12), ib.i.w(elevenLabsTheme, qVar2, i12), qVar2, u3.c.$stable | 432, 0);
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Select(String str, i3.t tVar, ho.a aVar, Integer num, int i10, String str2, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        ho.a aVar2;
        int i15;
        Integer num2;
        int i16;
        int i17;
        String str3;
        ho.a aVar3;
        Integer num3;
        int i18;
        String str4;
        u2.r1 r10;
        ho.a aVar4;
        ho.a aVar5;
        int i19;
        String str5;
        i3.t tVar3;
        int i20;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-243502718);
        if ((i11 & 6) == 0) {
            i13 = (qVar.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            tVar2 = tVar;
            i13 |= qVar.f(tVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                aVar2 = aVar;
                i13 |= qVar.h(aVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    num2 = num;
                    i13 |= qVar.f(num2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16) == 0) {
                            i16 = i10;
                            if (qVar.d(i16)) {
                                i20 = 16384;
                                i13 |= i20;
                            }
                        } else {
                            i16 = i10;
                        }
                        i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        i13 |= i20;
                    } else {
                        i16 = i10;
                    }
                    i17 = i12 & 32;
                    if (i17 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        str3 = str2;
                        i13 |= qVar.f(str3) ? 131072 : 65536;
                        if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
                            qVar.T();
                            c3.j jVar = null;
                            if ((i11 & 1) != 0 && !qVar.y()) {
                                qVar.R();
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                aVar5 = aVar2;
                                i19 = i16;
                                str5 = str3;
                                tVar3 = tVar2;
                            } else {
                                i3.t tVar4 = i21 != 0 ? i3.q.f13017a : tVar2;
                                if (i14 != 0) {
                                    Object L = qVar.L();
                                    if (L == u2.l.f33918a) {
                                        L = new u0(16);
                                        qVar.h0(L);
                                    }
                                    aVar4 = (ho.a) L;
                                } else {
                                    aVar4 = aVar2;
                                }
                                if (i15 != 0) {
                                    num2 = null;
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    i16 = R.drawable.chevron_right;
                                }
                                if (i17 != 0) {
                                    aVar5 = aVar4;
                                    i19 = i16;
                                    str5 = null;
                                } else {
                                    aVar5 = aVar4;
                                    i19 = i16;
                                    str5 = str3;
                                }
                                tVar3 = tVar4;
                            }
                            qVar.q();
                            if (num2 != null) {
                                qVar.X(10614524);
                                jVar = c3.k.d(-684038364, true, new d2(num2, 3), qVar);
                                qVar.p(false);
                            } else {
                                qVar.X(10901211);
                                qVar.p(false);
                            }
                            Select(str, tVar3, aVar5, jVar, i19, str5, qVar, i13 & 517118, 0);
                            num3 = num2;
                            tVar2 = tVar3;
                            aVar3 = aVar5;
                            i18 = i19;
                            str4 = str5;
                        } else {
                            qVar.R();
                            aVar3 = aVar2;
                            num3 = num2;
                            i18 = i16;
                            str4 = str3;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new g2(str, tVar2, aVar3, num3, i18, str4, i11, i12, 1);
                            return;
                        }
                        return;
                    }
                    str3 = str2;
                    if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                num2 = num;
                if ((i11 & 24576) != 0) {
                }
                i17 = i12 & 32;
                if (i17 == 0) {
                }
                str3 = str2;
                if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            aVar2 = aVar;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            num2 = num;
            if ((i11 & 24576) != 0) {
            }
            i17 = i12 & 32;
            if (i17 == 0) {
            }
            str3 = str2;
            if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        num2 = num;
        if ((i11 & 24576) != 0) {
        }
        i17 = i12 & 32;
        if (i17 == 0) {
        }
        str3 = str2;
        if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Select(String str, i3.t tVar, ho.a aVar, ho.p pVar, int i10, String str2, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        ho.a aVar2;
        int i15;
        ho.p pVar2;
        int i16;
        int i17;
        String str3;
        i3.t tVar3;
        ho.a aVar3;
        ho.p pVar3;
        int i18;
        String str4;
        u2.r1 r10;
        ho.a aVar4;
        ho.a aVar5;
        ho.p pVar4;
        int i19;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-788072154);
        if ((i11 & 6) == 0) {
            i13 = (qVar.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i20 = i12 & 2;
        if (i20 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            tVar2 = tVar;
            i13 |= qVar.f(tVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                aVar2 = aVar;
                i13 |= qVar.h(aVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    pVar2 = pVar;
                    i13 |= qVar.h(pVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 16) == 0) {
                            i16 = i10;
                            if (qVar.d(i16)) {
                                i19 = 16384;
                                i13 |= i19;
                            }
                        } else {
                            i16 = i10;
                        }
                        i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        i13 |= i19;
                    } else {
                        i16 = i10;
                    }
                    i17 = i12 & 32;
                    if (i17 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        str3 = str2;
                        i13 |= qVar.f(str3) ? 131072 : 65536;
                        if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
                            qVar.T();
                            if ((i11 & 1) != 0 && !qVar.y()) {
                                qVar.R();
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                aVar5 = aVar2;
                                pVar4 = pVar2;
                                i18 = i16;
                                str4 = str3;
                            } else {
                                i3.t tVar4 = i20 != 0 ? i3.q.f13017a : tVar2;
                                if (i14 != 0) {
                                    Object L = qVar.L();
                                    if (L == u2.l.f33918a) {
                                        L = new u0(13);
                                        qVar.h0(L);
                                    }
                                    aVar4 = (ho.a) L;
                                } else {
                                    aVar4 = aVar2;
                                }
                                if (i15 != 0) {
                                    pVar2 = null;
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                    i16 = R.drawable.chevron_right;
                                }
                                if (i17 != 0) {
                                    str4 = null;
                                    i18 = i16;
                                    aVar5 = aVar4;
                                } else {
                                    aVar5 = aVar4;
                                    i18 = i16;
                                    str4 = str3;
                                }
                                tVar2 = tVar4;
                                pVar4 = pVar2;
                            }
                            qVar.q();
                            int i21 = (i13 & 14) | 48 | ((i13 >> 3) & 896);
                            int i22 = i13 << 6;
                            int i23 = i13 << 3;
                            Select(str, c3.k.d(848752944, true, new w(str, 3), qVar), pVar4, tVar2, aVar5, i18, str4, qVar, (i23 & 3670016) | i21 | (i22 & 7168) | (i22 & 57344) | (458752 & i23), 0);
                            ho.a aVar6 = aVar5;
                            pVar3 = pVar4;
                            tVar3 = tVar2;
                            aVar3 = aVar6;
                        } else {
                            qVar.R();
                            tVar3 = tVar2;
                            aVar3 = aVar2;
                            pVar3 = pVar2;
                            i18 = i16;
                            str4 = str3;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new g2(str, tVar3, aVar3, pVar3, i18, str4, i11, i12, 0);
                            return;
                        }
                        return;
                    }
                    str3 = str2;
                    if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                pVar2 = pVar;
                if ((i11 & 24576) != 0) {
                }
                i17 = i12 & 32;
                if (i17 == 0) {
                }
                str3 = str2;
                if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            aVar2 = aVar;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            pVar2 = pVar;
            if ((i11 & 24576) != 0) {
            }
            i17 = i12 & 32;
            if (i17 == 0) {
            }
            str3 = str2;
            if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        pVar2 = pVar;
        if ((i11 & 24576) != 0) {
        }
        i17 = i12 & 32;
        if (i17 == 0) {
        }
        str3 = str2;
        if (qVar.O(i13 & 1, (74899 & i13) != 74898)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Select(String str, i3.t tVar, ho.a aVar, String str2, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        ho.a aVar2;
        int i14;
        String str3;
        i3.t tVar3;
        ho.a aVar3;
        u2.r1 r10;
        int i15;
        i3.t tVar4;
        ho.a aVar4;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1221245960);
        if ((i10 & 6) == 0) {
            i12 = (qVar.f(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            i12 |= qVar.f(tVar2) ? 32 : 16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar2 = aVar;
                i12 |= qVar.h(aVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    i12 |= qVar.f(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (!qVar.O(i12 & 1, (i12 & 1171) == 1170)) {
                        if (i16 != 0) {
                            tVar4 = i3.q.f13017a;
                            i15 = i14;
                        } else {
                            i15 = i14;
                            tVar4 = tVar2;
                        }
                        if (i13 != 0) {
                            Object L = qVar.L();
                            if (L == u2.l.f33918a) {
                                L = new u0(14);
                                qVar.h0(L);
                            }
                            aVar4 = (ho.a) L;
                        } else {
                            aVar4 = aVar2;
                        }
                        String str4 = i15 != 0 ? null : str2;
                        Select(str, tVar4, aVar4, (ho.p) null, 0, str4, qVar, (i12 & 14) | 3072 | (i12 & 112) | (i12 & 896) | ((i12 << 6) & 458752), 16);
                        tVar3 = tVar4;
                        aVar3 = aVar4;
                        str3 = str4;
                    } else {
                        qVar.R();
                        str3 = str2;
                        tVar3 = tVar2;
                        aVar3 = aVar2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.q(str, tVar3, aVar3, str3, i10, i11);
                        return;
                    }
                    return;
                }
                if (!qVar.O(i12 & 1, (i12 & 1171) == 1170)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            aVar2 = aVar;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            if (!qVar.O(i12 & 1, (i12 & 1171) == 1170)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        aVar2 = aVar;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        if (!qVar.O(i12 & 1, (i12 & 1171) == 1170)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }
}
