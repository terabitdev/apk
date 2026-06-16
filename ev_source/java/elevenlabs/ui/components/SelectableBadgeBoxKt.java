package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.a7;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aQ\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "accessibilityLabel", "", "isSelected", "Lkotlin/Function0;", "Lsn/z;", "onSelected", "Li3/t;", "modifier", "badge", FirebaseAnalytics.Param.CONTENT, "SelectableBadgeBox", "(Ljava/lang/String;ZLho/a;Li3/t;Ljava/lang/String;Lho/p;Lu2/m;II)V", "Preview_SelectableBadgeBox", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SelectableBadgeBoxKt {
    public static final void Preview_SelectableBadgeBox(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1867688622);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(ElevenLabsTheme.INSTANCE.getSpacings(qVar, 6).m2356getX4D9Ej5fM()), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
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
                L = new u0(17);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            ComposableSingletons$SelectableBadgeBoxKt composableSingletons$SelectableBadgeBoxKt = ComposableSingletons$SelectableBadgeBoxKt.INSTANCE;
            SelectableBadgeBox("a", true, aVar, null, null, composableSingletons$SelectableBadgeBoxKt.m1820getLambda$239422764$ui_release(), qVar, 197046, 24);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new u0(18);
                qVar.h0(L2);
            }
            SelectableBadgeBox("a", true, (ho.a) L2, null, "Badge", composableSingletons$SelectableBadgeBoxKt.getLambda$1109497035$ui_release(), qVar, 221622, 8);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new u0(19);
                qVar.h0(L3);
            }
            SelectableBadgeBox("a", false, (ho.a) L3, null, null, composableSingletons$SelectableBadgeBoxKt.getLambda$1302428236$ui_release(), qVar, 197046, 24);
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new u0(20);
                qVar.h0(L4);
            }
            SelectableBadgeBox("a", false, (ho.a) L4, null, "Badge", composableSingletons$SelectableBadgeBoxKt.getLambda$1495359437$ui_release(), qVar, 221622, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 7);
        }
    }

    public static final sn.z Preview_SelectableBadgeBox$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SelectableBadgeBox(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectableBadgeBox(String str, boolean z6, ho.a aVar, i3.t tVar, String str2, ho.p pVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        int i15;
        boolean z10;
        u2.q qVar;
        ho.p pVar2;
        String str3;
        u2.r1 r10;
        i3.t tVar3;
        String str4;
        h4.d dVar;
        h4.e eVar;
        i3.t tVar4;
        int i16;
        i3.t tVar5;
        boolean z11;
        boolean z12;
        String str5;
        i3.t tVar6;
        boolean z13;
        int i17;
        int i18;
        int i19;
        int i20;
        str.getClass();
        aVar.getClass();
        pVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1400089097);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.g(z6)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
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
                if (qVar2.f(str2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((196608 & i10) == 0) {
                    if (qVar2.h(pVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (qVar2.O(i12 & 1, z10)) {
                    i3.q qVar3 = i3.q.f13017a;
                    if (i21 != 0) {
                        tVar3 = qVar3;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    i3.t e10 = r1.p2.e(tVar3, 1.0f);
                    i3.l lVar = i3.d.f12997a;
                    f4.f1 d10 = r1.p.d(lVar, false);
                    int hashCode = Long.hashCode(qVar2.T);
                    c3.o l4 = qVar2.l();
                    i3.t c5 = i3.a.c(e10, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar2 = h4.g.f11907f;
                    u2.r.J(eVar2, d10, qVar2);
                    h4.e eVar3 = h4.g.f11906e;
                    u2.r.J(eVar3, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar4 = h4.g.f11908g;
                    u2.r.y(qVar2, valueOf, eVar4);
                    h4.d dVar2 = h4.g.f11909h;
                    u2.r.F(dVar2, qVar2);
                    h4.e eVar5 = h4.g.f11905d;
                    u2.r.J(eVar5, c5, qVar2);
                    if (z6) {
                        qVar2.X(-10362249);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        tVar4 = tVar3;
                        i16 = 6;
                        dVar = dVar2;
                        eVar = eVar4;
                        tVar5 = l1.n.j(2, elevenLabsTheme.getColor(qVar2, 6).getButtonBackground().m2017getPrimary0d7_KjU(), qVar3, elevenLabsTheme.getShapes(qVar2, 6).getMx());
                        qVar2.p(false);
                    } else {
                        dVar = dVar2;
                        eVar = eVar4;
                        tVar4 = tVar3;
                        i16 = 6;
                        qVar2.X(-10157339);
                        qVar2.p(false);
                        tVar5 = qVar3;
                    }
                    i3.t e11 = r1.p2.e(qVar3, 1.0f);
                    ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                    i3.t then = l1.n.h(m3.h.c(e11, elevenLabsTheme2.getShapes(qVar2, i16).getMx()), elevenLabsTheme2.getColors(qVar2, i16).getSecondaryButtonBg(), p3.h0.f26395b).then(tVar5);
                    if ((i12 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object L = qVar2.L();
                    u2.e eVar6 = u2.l.f33918a;
                    if (z11 || L == eVar6) {
                        L = new o(9, aVar);
                        qVar2.h0(L);
                    }
                    i3.t F = r1.d.F(l1.n.p(then, false, null, null, null, (ho.a) L, 15), elevenLabsTheme2.getSpacings(qVar2, 6).m2357getX5D9Ej5fM(), elevenLabsTheme2.getSpacings(qVar2, 6).m2356getX4D9Ej5fM());
                    if ((i12 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Object L2 = qVar2.L();
                    if (z12 || L2 == eVar6) {
                        L2 = new g(str, 14);
                        qVar2.h0(L2);
                    }
                    i3.t c10 = p4.q.c(F, false, (ho.l) L2);
                    f4.f1 d11 = r1.p.d(lVar, false);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    c3.o l7 = qVar2.l();
                    i3.t c11 = i3.a.c(c10, qVar2);
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    u2.r.J(eVar2, d11, qVar2);
                    u2.r.J(eVar3, l7, qVar2);
                    defpackage.f.u(hashCode2, qVar2, eVar, qVar2, dVar);
                    u2.r.J(eVar5, c11, qVar2);
                    int i22 = (i12 >> 15) & 14;
                    pVar2 = pVar;
                    j0.c.q(i22, pVar2, qVar2, true);
                    if (str4 == null || wq.n.m0(str4)) {
                        qVar = qVar2;
                        str5 = str4;
                        tVar6 = tVar4;
                        z13 = true;
                        qVar.X(-8733819);
                        qVar.p(false);
                    } else {
                        qVar2.X(-9408751);
                        long m2017getPrimary0d7_KjU = elevenLabsTheme2.getColor(qVar2, 6).getButtonBackground().m2017getPrimary0d7_KjU();
                        z1.g gVar = z1.h.f39128a;
                        i3.t A = r1.d.A(r1.t.f29349a.b(qVar3, i3.d.f12999c), -14, -12);
                        c3.j d12 = c3.k.d(-1591063629, true, new w(str4, 4), qVar2);
                        z13 = true;
                        tVar6 = tVar4;
                        str5 = str4;
                        a7.a(A, gVar, m2017getPrimary0d7_KjU, 0L, t2.u.P, t2.u.P, null, d12, qVar2, 12582912, 120);
                        qVar = qVar2;
                        qVar.p(false);
                    }
                    qVar.p(z13);
                    tVar2 = tVar6;
                    str3 = str5;
                } else {
                    qVar = qVar2;
                    pVar2 = pVar;
                    qVar.R();
                    str3 = str2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new h2(str, z6, aVar, tVar2, str3, pVar2, i10, i11, 0);
                    return;
                }
                return;
            }
            if ((196608 & i10) == 0) {
            }
            if ((74899 & i12) != 74898) {
            }
            if (qVar2.O(i12 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i12) != 74898) {
        }
        if (qVar2.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z SelectableBadgeBox$lambda$0$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z SelectableBadgeBox$lambda$0$1$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        p4.y.i(b0Var, 0);
        return sn.z.f31622a;
    }

    public static final sn.z SelectableBadgeBox$lambda$0$3(String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            j7.d(str, r1.d.F(i3.q.f13017a, elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, 6).m2350getX1D9Ej5fM()), elevenLabsTheme.getColor(qVar, 6).getButtonText().m2041getPrimary0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, 6).getBodyXSmall600(), qVar, 0, 0, 131064);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SelectableBadgeBox$lambda$1(String str, boolean z6, ho.a aVar, i3.t tVar, String str2, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        SelectableBadgeBox(str, z6, aVar, tVar, str2, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
