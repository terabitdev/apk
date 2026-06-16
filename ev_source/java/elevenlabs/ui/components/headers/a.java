package io.elevenlabs.ui.components.headers;

import f4.e1;
import f4.h1;
import f4.s1;
import ho.l;
import ho.q;
import io.elevenlabs.ui.components.scaffolds.ComposableSingletons$BottomSheetScaffoldKt;
import j1.a2;
import j1.p1;
import j1.y;
import l1.n;
import m1.c;
import m1.e;
import m2.l1;
import m2.p0;
import m2.r1;
import p3.h0;
import r1.d;
import r1.l2;
import r1.p;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17431a;

    public /* synthetic */ a(int i10) {
        this.f17431a = i10;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z lambda__928325014$lambda$0;
        z lambda__746591765$lambda$0;
        z Preview_HeaderActions$lambda$0$0;
        z Preview_HeaderActions$lambda$0$1;
        z Preview_HeaderActions$lambda$0$2;
        z Preview_HeaderActions$lambda$0$3;
        boolean z6;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean h10;
        int i13;
        Object a2Var;
        switch (this.f17431a) {
            case 0:
                lambda__928325014$lambda$0 = ComposableSingletons$HeaderKt.lambda__928325014$lambda$0((l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return lambda__928325014$lambda$0;
            case 1:
                lambda__746591765$lambda$0 = ComposableSingletons$HeaderKt.lambda__746591765$lambda$0((l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return lambda__746591765$lambda$0;
            case 2:
                Preview_HeaderActions$lambda$0$0 = HeaderActionsKt.Preview_HeaderActions$lambda$0$0((l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return Preview_HeaderActions$lambda$0$0;
            case 3:
                Preview_HeaderActions$lambda$0$1 = HeaderActionsKt.Preview_HeaderActions$lambda$0$1((l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return Preview_HeaderActions$lambda$0$1;
            case 4:
                Preview_HeaderActions$lambda$0$2 = HeaderActionsKt.Preview_HeaderActions$lambda$0$2((l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return Preview_HeaderActions$lambda$0$2;
            case 5:
                Preview_HeaderActions$lambda$0$3 = HeaderActionsKt.Preview_HeaderActions$lambda$0$3((l2) obj, (m) obj2, ((Integer) obj3).intValue());
                return Preview_HeaderActions$lambda$0$3;
            case 6:
                return ComposableSingletons$BottomSheetScaffoldKt.a((l2) obj, (m) obj2, ((Integer) obj3).intValue());
            case 7:
                c cVar = (c) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((u2.q) mVar).f(cVar)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(intValue & 1, z6)) {
                    p.a(n.h(p2.f(p2.e(d.G(i3.q.f13017a, u.P, e.f22424l, 1), 1.0f), e.f22423k), cVar.f22409c, h0.f26395b), qVar, 0);
                } else {
                    qVar.R();
                }
                return z.f31622a;
            case 8:
                l1 l1Var = (l1) obj;
                m mVar2 = (m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((u2.q) mVar2).f(l1Var)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    intValue2 |= i11;
                }
                if ((intValue2 & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u2.q qVar2 = (u2.q) mVar2;
                if (qVar2.O(intValue2 & 1, z10)) {
                    m2.n.e(l1Var, null, null, qVar2, intValue2 & 14);
                } else {
                    qVar2.R();
                }
                return z.f31622a;
            case 9:
                l1 l1Var2 = (l1) obj;
                m mVar3 = (m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    if (((u2.q) mVar3).f(l1Var2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    intValue3 |= i12;
                }
                if ((intValue3 & 19) != 18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u2.q qVar3 = (u2.q) mVar3;
                if (qVar3.O(intValue3 & 1, z11)) {
                    m2.n.e(l1Var2, null, null, qVar3, intValue3 & 14);
                } else {
                    qVar3.R();
                }
                return z.f31622a;
            case 10:
                if (obj == null) {
                    m mVar4 = (m) obj2;
                    int intValue4 = ((Integer) obj3).intValue();
                    if ((intValue4 & 6) == 0) {
                        if ((intValue4 & 8) == 0) {
                            h10 = ((u2.q) mVar4).f(null);
                        } else {
                            h10 = ((u2.q) mVar4).h(null);
                        }
                        if (h10) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        intValue4 |= i13;
                    }
                    if ((intValue4 & 19) != 18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    u2.q qVar4 = (u2.q) mVar4;
                    if (qVar4.O(intValue4 & 1, z12)) {
                        r1.c(null, null, 0L, 0L, 0L, u.P, qVar4, intValue4 & 14);
                    } else {
                        qVar4.R();
                    }
                    return z.f31622a;
                }
                a9.a.c();
                return null;
            case 11:
                p1 p1Var = (p1) obj;
                ((Integer) obj3).getClass();
                u2.q qVar5 = (u2.q) ((m) obj2);
                qVar5.X(1849239065);
                p0 p0Var = p0.f22674a;
                p0 p0Var2 = p0.f22675b;
                if (p1Var.c(p0Var, p0Var2)) {
                    a2Var = j1.e.s(67, 0, y.f18447d, 2);
                } else if (!p1Var.c(p0Var2, p0Var) && !p1Var.c(p0.f22676c, p0Var2)) {
                    a2Var = j1.e.r(u.P, u.P, 7, null);
                } else {
                    a2Var = new a2(83, 67, y.f18447d);
                }
                qVar5.p(false);
                return a2Var;
            case 12:
                h1 h1Var = (h1) obj;
                final int B = h1Var.B(s2.b.f30728a);
                long j4 = ((h5.a) obj3).f12077a;
                int i14 = B * 2;
                final s1 V = ((e1) obj2).V(h5.b.i(j4, i14, 0));
                final int i15 = 1;
                return h1Var.Z(V.f8868a - i14, V.f8869b, tn.u.f33548a, new l() { // from class: s2.a
                    @Override // ho.l
                    public final Object invoke(Object obj4) {
                        f4.r1 r1Var = (f4.r1) obj4;
                        switch (i15) {
                            case 0:
                                r1Var.k(V, 0, -B, t2.u.P);
                                break;
                            default:
                                r1Var.k(V, -B, 0, t2.u.P);
                                break;
                        }
                        return sn.z.f31622a;
                    }
                });
            default:
                h1 h1Var2 = (h1) obj;
                final int B2 = h1Var2.B(s2.b.f30729b);
                long j10 = ((h5.a) obj3).f12077a;
                int i16 = B2 * 2;
                final int i17 = 0;
                final s1 V2 = ((e1) obj2).V(h5.b.i(j10, 0, i16));
                return h1Var2.Z(V2.f8868a, V2.f8869b - i16, tn.u.f33548a, new l() { // from class: s2.a
                    @Override // ho.l
                    public final Object invoke(Object obj4) {
                        f4.r1 r1Var = (f4.r1) obj4;
                        switch (i17) {
                            case 0:
                                r1Var.k(V2, 0, -B2, t2.u.P);
                                break;
                            default:
                                r1Var.k(V2, -B2, 0, t2.u.P);
                                break;
                        }
                        return sn.z.f31622a;
                    }
                });
        }
    }
}
