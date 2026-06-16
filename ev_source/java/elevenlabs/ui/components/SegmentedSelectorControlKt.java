package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aM\u0010\u000b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"", "", "options", "", "selectedIndex", "Lkotlin/Function1;", "Lsn/z;", "onSelectionChange", "Li3/t;", "modifier", "accessibilityLabel", "SegmentedSelectorControl", "(Ljava/util/List;ILho/l;Li3/t;Ljava/lang/String;Lu2/m;II)V", "Preview_SegmentedSelectorControl", "(Lu2/m;I)V", "Lh5/l;", "containerSize", "", "animatedOffset", "textAlpha", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SegmentedSelectorControlKt {
    public static final void Preview_SegmentedSelectorControl(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-790090414);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SegmentedSelectorControlKt.INSTANCE.m1819getLambda$1743059096$ui_release(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 5);
        }
    }

    public static final sn.z Preview_SegmentedSelectorControl$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SegmentedSelectorControl(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedSelectorControl(List<String> list, int i10, ho.l lVar, i3.t tVar, String str, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        int i15;
        String str2;
        int i16;
        boolean z6;
        i3.t tVar3;
        String str3;
        u2.r1 r10;
        i3.t tVar4;
        String str4;
        boolean z10;
        h4.e eVar;
        int i17;
        boolean z11;
        float f10;
        boolean z12;
        int i18;
        boolean z13;
        long m2141getInactiveText0d7_KjU;
        int i19;
        int i20;
        int i21;
        List<String> list2 = list;
        list2.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1238029937);
        if ((i11 & 6) == 0) {
            if (qVar.h(list2)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.d(i10)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
        }
        if ((i11 & 384) == 0) {
            if (qVar.h(lVar)) {
                i19 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i19 = 128;
            }
            i13 |= i19;
        }
        int i22 = i12 & 8;
        if (i22 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                str2 = str;
                if (qVar.f(str2)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i16;
                if ((i13 & 9363) != 9362) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i13 & 1, z6)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i22 != 0) {
                        tVar4 = qVar2;
                    } else {
                        tVar4 = tVar2;
                    }
                    if (i15 != 0) {
                        str4 = "Segment selector";
                    } else {
                        str4 = str2;
                    }
                    Object L = qVar.L();
                    u2.e eVar2 = u2.l.f33918a;
                    if (L == eVar2) {
                        L = u2.r.A(new h5.l(0L));
                        qVar.h0(L);
                    }
                    u2.z0 z0Var = (u2.z0) L;
                    String str5 = str4;
                    int i23 = i13;
                    u2.s2 b10 = j1.f.b(i10, j1.e.r(1.0f, 1500.0f, 4, null), "segmentOffset", qVar, 3120, 20);
                    i3.t c5 = m3.h.c(r1.p2.e(tVar4, 1.0f), z1.h.b(12));
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    long m2140getInactiveBg0d7_KjU = elevenLabsTheme.getColor(qVar, 6).getSelectable().m2140getInactiveBg0d7_KjU();
                    p3.w0 w0Var = p3.h0.f26395b;
                    i3.t t10 = r1.d.t(l1.n.h(c5, m2140getInactiveBg0d7_KjU, w0Var), r1.i1.f29224a);
                    Object L2 = qVar.L();
                    if (L2 == eVar2) {
                        L2 = new e1(z0Var, 12);
                        qVar.h0(L2);
                    }
                    i3.t q = f4.i0.q(t10, (ho.l) L2);
                    if ((i23 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object L3 = qVar.L();
                    if (z10 || L3 == eVar2) {
                        L3 = new g(str5, 13);
                        qVar.h0(L3);
                    }
                    i3.t c10 = p4.q.c(q, false, (ho.l) L3);
                    f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c11 = i3.a.c(c10, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    h4.e eVar3 = h4.g.f11907f;
                    u2.r.J(eVar3, d10, qVar);
                    h4.e eVar4 = h4.g.f11906e;
                    u2.r.J(eVar4, l4, qVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar5 = h4.g.f11908g;
                    u2.r.y(qVar, valueOf, eVar5);
                    h4.d dVar = h4.g.f11909h;
                    u2.r.F(dVar, qVar);
                    h4.e eVar6 = h4.g.f11905d;
                    u2.r.J(eVar6, c11, qVar);
                    z1.g b11 = z1.h.b(10);
                    float f11 = 2;
                    i3.t tVar5 = tVar4;
                    if (!h5.l.b(SegmentedSelectorControl$lambda$1(z0Var), 0L) && !list.isEmpty()) {
                        qVar.X(-182461506);
                        int SegmentedSelectorControl$lambda$1 = ((int) (SegmentedSelectorControl$lambda$1(z0Var) >> 32)) / list.size();
                        i3.t c12 = r1.p2.c(r1.d.E(r1.p2.e(qVar2, 1.0f / list.size()), f11), 1.0f);
                        eVar = eVar3;
                        boolean f12 = qVar.f(b10) | qVar.d(SegmentedSelectorControl$lambda$1);
                        Object L4 = qVar.L();
                        if (f12 || L4 == eVar2) {
                            L4 = new g3.q(SegmentedSelectorControl$lambda$1, b10, 4);
                            qVar.h0(L4);
                        }
                        i17 = 0;
                        r1.p.a(l1.n.h(m3.h.c(r1.d.z(c12, (ho.l) L4), b11), elevenLabsTheme.getColor(qVar, 6).getSelectable().m2138getActiveBg0d7_KjU(), w0Var), qVar, 0);
                        qVar.p(false);
                    } else {
                        eVar = eVar3;
                        i17 = 0;
                        qVar.X(-181864725);
                        qVar.p(false);
                    }
                    i3.t c13 = r1.p2.c(r1.p2.e(qVar2, 1.0f), 1.0f);
                    r1.k2 a10 = r1.i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, i17);
                    int hashCode2 = Long.hashCode(qVar.T);
                    c3.o l7 = qVar.l();
                    i3.t c14 = i3.a.c(c13, qVar);
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(eVar, a10, qVar);
                    u2.r.J(eVar4, l7, qVar);
                    defpackage.f.u(hashCode2, qVar, eVar5, qVar, dVar);
                    list2 = list;
                    Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c14, eVar6, 1543885380, list2);
                    int i24 = 0;
                    while (s10.hasNext()) {
                        Object next = s10.next();
                        int i25 = i24 + 1;
                        if (i24 >= 0) {
                            String str6 = (String) next;
                            if (i10 == i24) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.6f;
                            }
                            z1.g gVar = b11;
                            Iterator it = s10;
                            boolean z14 = z11;
                            u2.s2 b12 = j1.f.b(f10, j1.e.r(t2.u.P, t2.u.P, 7, null), "textAlpha", qVar, 3120, 20);
                            if (1.0f <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            i3.t c15 = m3.h.c(r1.d.E(new r1.m1(1.0f, true), f11), gVar);
                            int i26 = i23;
                            if ((i26 & 896) == 256) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean d11 = z12 | qVar.d(i24);
                            Object L5 = qVar.L();
                            if (d11 || L5 == eVar2) {
                                L5 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.g(lVar, i24, 1);
                                qVar.h0(L5);
                            }
                            i3.t p10 = l1.n.p(c15, false, null, null, null, (ho.a) L5, 15);
                            f4.f1 d12 = r1.p.d(i3.d.f13001e, false);
                            int hashCode3 = Long.hashCode(qVar.T);
                            c3.o l10 = qVar.l();
                            i3.t c16 = i3.a.c(p10, qVar);
                            h4.h.f11920i.getClass();
                            h4.f fVar2 = h4.g.f11903b;
                            qVar.b0();
                            if (qVar.S) {
                                qVar.k(fVar2);
                            } else {
                                qVar.k0();
                            }
                            u2.r.J(h4.g.f11907f, d12, qVar);
                            u2.r.J(h4.g.f11906e, l10, qVar);
                            u2.r.y(qVar, Integer.valueOf(hashCode3), h4.g.f11908g);
                            u2.r.F(h4.g.f11909h, qVar);
                            u2.r.J(h4.g.f11905d, c16, qVar);
                            i3.t G = r1.d.G(qVar2, t2.u.P, 8, 1);
                            if (z14) {
                                qVar.X(244540017);
                                i18 = 6;
                                m2141getInactiveText0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getSelectable().m2139getActiveText0d7_KjU();
                                z13 = false;
                            } else {
                                i18 = 6;
                                z13 = false;
                                qVar.X(244541587);
                                m2141getInactiveText0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, 6).getSelectable().m2141getInactiveText0d7_KjU();
                            }
                            qVar.p(z13);
                            u2.q qVar3 = qVar;
                            i23 = i26;
                            j7.d(str6, G, p3.x.b(SegmentedSelectorControl$lambda$6$1$0$0(b12), m2141getInactiveText0d7_KjU), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ElevenLabsTheme.INSTANCE.getTypo(qVar, i18).getBodySmall500(), qVar3, 48, 0, 131064);
                            qVar = qVar3;
                            qVar.p(true);
                            eVar2 = eVar2;
                            i24 = i25;
                            b11 = gVar;
                            s10 = it;
                        } else {
                            ig.f.U();
                            throw null;
                        }
                    }
                    p.n.t(qVar, false, true, true);
                    str3 = str5;
                    tVar3 = tVar5;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    str3 = str2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new t1(i10, i11, i12, lVar, tVar3, str3, list2);
                    return;
                }
                return;
            }
            str2 = str;
            if ((i13 & 9363) != 9362) {
            }
            if (qVar.O(i13 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        str2 = str;
        if ((i13 & 9363) != 9362) {
        }
        if (qVar.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final long SegmentedSelectorControl$lambda$1(u2.z0 z0Var) {
        return ((h5.l) z0Var.getValue()).f12092a;
    }

    private static final void SegmentedSelectorControl$lambda$2(u2.z0 z0Var, long j4) {
        z0Var.setValue(new h5.l(j4));
    }

    private static final float SegmentedSelectorControl$lambda$3(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z SegmentedSelectorControl$lambda$4$0(u2.z0 z0Var, h5.l lVar) {
        SegmentedSelectorControl$lambda$2(z0Var, lVar.f12092a);
        return sn.z.f31622a;
    }

    public static final sn.z SegmentedSelectorControl$lambda$5$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final h5.j SegmentedSelectorControl$lambda$6$0$0(int i10, u2.s2 s2Var, h5.c cVar) {
        cVar.getClass();
        return new h5.j((((int) (SegmentedSelectorControl$lambda$3(s2Var) * i10)) << 32) | (0 & 4294967295L));
    }

    private static final float SegmentedSelectorControl$lambda$6$1$0$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z SegmentedSelectorControl$lambda$6$1$0$1$0(ho.l lVar, int i10) {
        lVar.invoke(Integer.valueOf(i10));
        return sn.z.f31622a;
    }

    public static final sn.z SegmentedSelectorControl$lambda$7(List list, int i10, ho.l lVar, i3.t tVar, String str, int i11, int i12, u2.m mVar, int i13) {
        SegmentedSelectorControl(list, i10, lVar, tVar, str, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }
}
