package com.google.android.gms.internal.measurement;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3950a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3951b;

    public s(int i) {
        this.f3951b = i;
    }

    public static m c(k3.t tVar, List list) {
        w wVar = w.ADD;
        f1.g.Y(2, "FN", list);
        n c10 = ((t) tVar.l).c(tVar, (n) list.get(0));
        n c11 = ((t) tVar.l).c(tVar, (n) list.get(1));
        if (c11 instanceof d) {
            List m = ((d) c11).m();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new m(c10.f(), (ArrayList) m, arrayList, tVar);
        }
        f2.i.k(android.support.v4.media.session.m.l("FN requires an ArrayValue of parameter names found ", c11.getClass().getCanonicalName()));
        return null;
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.f());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.f());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            if (((q) nVar).f3939a.compareTo(((q) nVar2).f3939a) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = nVar.h().doubleValue();
        double doubleValue2 = nVar2.h().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static n e(v vVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return g(vVar, ((Iterable) nVar).iterator(), nVar2);
        }
        f2.i.k("Non-iterable type in for...of loop.");
        return null;
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof r) || (nVar instanceof l)) {
                return true;
            }
            if (nVar instanceof g) {
                if (Double.isNaN(nVar.h().doubleValue()) || Double.isNaN(nVar2.h().doubleValue()) || nVar.h().doubleValue() != nVar2.h().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (nVar instanceof q) {
                return nVar.f().equals(nVar2.f());
            }
            if (nVar instanceof e) {
                return nVar.e().equals(nVar2.e());
            }
            if (nVar != nVar2) {
                return false;
            }
            return true;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z10 = nVar instanceof g;
        if (z10 && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.h()));
        }
        boolean z11 = nVar instanceof q;
        if (z11 && (nVar2 instanceof g)) {
            return f(new g(nVar.h()), nVar2);
        }
        if (nVar instanceof e) {
            return f(new g(nVar.h()), nVar2);
        }
        if (nVar2 instanceof e) {
            return f(nVar, new g(nVar2.h()));
        }
        if ((!z11 && !z10) || !(nVar2 instanceof j)) {
            if (!(nVar instanceof j) || (!(nVar2 instanceof q) && !(nVar2 instanceof g))) {
                return false;
            }
            return f(new q(nVar.f()), nVar2);
        }
        return f(nVar, new q(nVar2.f()));
    }

    public static n g(v vVar, Iterator it, n nVar) {
        k3.t L;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.f3988a) {
                    case 0:
                        L = vVar.f3989b.L();
                        String str = vVar.f3990c;
                        L.O(str, nVar2);
                        ((HashMap) L.f7248n).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        L = vVar.f3989b.L();
                        L.O(vVar.f3990c, nVar2);
                        break;
                    default:
                        L = vVar.f3989b;
                        L.O(vVar.f3990c, nVar2);
                        break;
                }
                n J = L.J((d) nVar);
                if (J instanceof f) {
                    f fVar = (f) J;
                    String str2 = fVar.f3765b;
                    if ("break".equals(str2)) {
                        return n.f3896c;
                    }
                    if ("return".equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.f3896c;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.f());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.f());
        }
        if (((!(nVar instanceof q) || !(nVar2 instanceof q)) && (Double.isNaN(nVar.h().doubleValue()) || Double.isNaN(nVar2.h().doubleValue()))) || d(nVar2, nVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:240:0x05da. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:533:0x0c59. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v101, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r12v104, types: [com.google.android.gms.internal.measurement.n] */
    /* JADX WARN: Type inference failed for: r12v320 */
    /* JADX WARN: Type inference failed for: r12v325 */
    /* JADX WARN: Type inference failed for: r12v344, types: [com.google.android.gms.internal.measurement.d] */
    /* JADX WARN: Type inference failed for: r12v351, types: [com.google.android.gms.internal.measurement.k] */
    /* JADX WARN: Type inference failed for: r12v386 */
    /* JADX WARN: Type inference failed for: r12v387 */
    /* JADX WARN: Type inference failed for: r13v0, types: [k3.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(String str, k3.t tVar, ArrayList arrayList) {
        boolean f7;
        boolean f10;
        r rVar;
        r rVar2;
        r rVar3;
        f fVar;
        n qVar;
        n nVar;
        String str2;
        int i = 0;
        switch (this.f3951b) {
            case 0:
                w wVar = w.ADD;
                switch (f1.g.b0(str).ordinal()) {
                    case 4:
                        f1.g.X(2, "BITWISE_AND", arrayList);
                        return new g(Double.valueOf(f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()) & f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue())));
                    case 5:
                        f1.g.X(2, "BITWISE_LEFT_SHIFT", arrayList);
                        return new g(Double.valueOf(f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()) << ((int) (f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue()) & 31))));
                    case 6:
                        f1.g.X(1, "BITWISE_NOT", arrayList);
                        return new g(Double.valueOf(~f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue())));
                    case 7:
                        f1.g.X(2, "BITWISE_OR", arrayList);
                        return new g(Double.valueOf(f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()) | f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue())));
                    case 8:
                        f1.g.X(2, "BITWISE_RIGHT_SHIFT", arrayList);
                        return new g(Double.valueOf(f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()) >> ((int) (f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue()) & 31))));
                    case 9:
                        f1.g.X(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                        return new g(Double.valueOf((f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()) & 4294967295L) >>> ((int) (f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue()) & 31))));
                    case 10:
                        f1.g.X(2, "BITWISE_XOR", arrayList);
                        return new g(Double.valueOf(f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()) ^ f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
            case 1:
                f1.g.X(2, f1.g.b0(str).name(), arrayList);
                n c10 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                n c11 = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                int ordinal = f1.g.b0(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal == 48) {
                        f10 = f(c10, c11);
                    } else if (ordinal == 42) {
                        f7 = d(c10, c11);
                    } else if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                f7 = d(c11, c10);
                                break;
                            case 38:
                                f7 = h(c11, c10);
                                break;
                            case 39:
                                f7 = f1.g.c0(c10, c11);
                                break;
                            case 40:
                                f10 = f1.g.c0(c10, c11);
                                break;
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        f7 = h(c10, c11);
                    }
                    f7 = !f10;
                } else {
                    f7 = f(c10, c11);
                }
                return f7 ? n.h : n.i;
            case 2:
                w wVar2 = w.ADD;
                int ordinal2 = f1.g.b0(str).ordinal();
                if (ordinal2 == 2) {
                    f1.g.X(3, "APPLY", arrayList);
                    n nVar2 = (n) arrayList.get(0);
                    t tVar2 = (t) tVar.l;
                    t tVar3 = (t) tVar.l;
                    n c12 = tVar2.c(tVar, nVar2);
                    String f11 = tVar3.c(tVar, (n) arrayList.get(1)).f();
                    n c13 = tVar3.c(tVar, (n) arrayList.get(2));
                    if (c13 instanceof d) {
                        if (!f11.isEmpty()) {
                            return c12.g(f11, tVar, (ArrayList) ((d) c13).m());
                        }
                        f2.i.k("Function name for apply is undefined");
                        return null;
                    }
                    f2.i.k(android.support.v4.media.session.m.l("Function arguments for Apply are not a list found ", c13.getClass().getCanonicalName()));
                    return null;
                }
                if (ordinal2 == 15) {
                    f1.g.X(0, "BREAK", arrayList);
                    return n.f3898e;
                }
                if (ordinal2 == 25) {
                    return c(tVar, arrayList);
                }
                if (ordinal2 != 41) {
                    if (ordinal2 == 54) {
                        return new d(arrayList);
                    }
                    if (ordinal2 != 57) {
                        if (ordinal2 != 19) {
                            if (ordinal2 == 20) {
                                f1.g.Y(2, "DEFINE_FUNCTION", arrayList);
                                m c14 = c(tVar, arrayList);
                                String str3 = c14.f3791a;
                                if (str3 == null) {
                                    tVar.N("", c14);
                                    return c14;
                                }
                                tVar.N(str3, c14);
                                return c14;
                            }
                            if (ordinal2 == 60) {
                                f1.g.X(3, "SWITCH", arrayList);
                                n nVar3 = (n) arrayList.get(0);
                                t tVar4 = (t) tVar.l;
                                t tVar5 = (t) tVar.l;
                                n c15 = tVar4.c(tVar, nVar3);
                                n c16 = tVar5.c(tVar, (n) arrayList.get(1));
                                n c17 = tVar5.c(tVar, (n) arrayList.get(2));
                                if (c16 instanceof d) {
                                    if (c17 instanceof d) {
                                        d dVar = (d) c16;
                                        d dVar2 = (d) c17;
                                        boolean z10 = false;
                                        for (int i3 = 0; i3 < dVar.o(); i3++) {
                                            if (z10 || c15.equals(tVar5.c(tVar, dVar.p(i3)))) {
                                                n c18 = tVar5.c(tVar, dVar2.p(i3));
                                                if (c18 instanceof f) {
                                                    return ((f) c18).f3765b.equals("break") ? n.f3896c : c18;
                                                }
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (dVar.o() + 1 == dVar2.o()) {
                                            n c19 = tVar5.c(tVar, dVar2.p(dVar.o()));
                                            if (c19 instanceof f) {
                                                String str4 = ((f) c19).f3765b;
                                                if (str4.equals("return") || str4.equals("continue")) {
                                                    return c19;
                                                }
                                            }
                                        }
                                        return n.f3896c;
                                    }
                                    f2.i.k("Malformed SWITCH statement, case statements are not a list");
                                    return null;
                                }
                                f2.i.k("Malformed SWITCH statement, cases are not a list");
                                return null;
                            }
                            if (ordinal2 != 61) {
                                switch (ordinal2) {
                                    case 11:
                                        return tVar.L().J(new d(arrayList));
                                    case 12:
                                        f1.g.X(0, "BREAK", arrayList);
                                        return n.f3899f;
                                    case 13:
                                        break;
                                    default:
                                        b(str);
                                        throw null;
                                }
                            } else {
                                f1.g.X(3, "TERNARY", arrayList);
                                n nVar4 = (n) arrayList.get(0);
                                t tVar6 = (t) tVar.l;
                                t tVar7 = (t) tVar.l;
                                if (tVar6.c(tVar, nVar4).e().booleanValue()) {
                                    return tVar7.c(tVar, (n) arrayList.get(1));
                                }
                                return tVar7.c(tVar, (n) arrayList.get(2));
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return n.f3896c;
                        }
                        n c20 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                        if (c20 instanceof d) {
                            return tVar.J((d) c20);
                        }
                        return n.f3896c;
                    }
                    if (arrayList.isEmpty()) {
                        return n.g;
                    }
                    f1.g.X(1, "RETURN", arrayList);
                    return new f("return", ((t) tVar.l).c(tVar, (n) arrayList.get(0)));
                }
                f1.g.Y(2, "IF", arrayList);
                n nVar5 = (n) arrayList.get(0);
                t tVar8 = (t) tVar.l;
                t tVar9 = (t) tVar.l;
                n c21 = tVar8.c(tVar, nVar5);
                n c22 = tVar9.c(tVar, (n) arrayList.get(1));
                n c23 = arrayList.size() > 2 ? tVar9.c(tVar, (n) arrayList.get(2)) : null;
                r rVar4 = n.f3896c;
                if (c21.e().booleanValue()) {
                    rVar2 = tVar.J((d) c22);
                } else {
                    if (c23 == null) {
                        rVar = rVar4;
                        return true == (rVar instanceof f) ? rVar4 : rVar;
                    }
                    rVar2 = tVar.J((d) c23);
                }
                rVar = rVar2;
                if (true == (rVar instanceof f)) {
                }
                break;
            case 3:
                w wVar3 = w.ADD;
                int ordinal3 = f1.g.b0(str).ordinal();
                if (ordinal3 == 1) {
                    f1.g.X(2, "AND", arrayList);
                    n c24 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                    return c24.e().booleanValue() ? ((t) tVar.l).c(tVar, (n) arrayList.get(1)) : c24;
                }
                if (ordinal3 == 47) {
                    f1.g.X(1, "NOT", arrayList);
                    return new e(Boolean.valueOf(!((t) tVar.l).c(tVar, (n) arrayList.get(0)).e().booleanValue()));
                }
                if (ordinal3 == 50) {
                    f1.g.X(2, "OR", arrayList);
                    n c25 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                    return !c25.e().booleanValue() ? ((t) tVar.l).c(tVar, (n) arrayList.get(1)) : c25;
                }
                b(str);
                throw null;
            case 4:
                w wVar4 = w.ADD;
                int ordinal4 = f1.g.b0(str).ordinal();
                if (ordinal4 != 65) {
                    switch (ordinal4) {
                        case 26:
                            f1.g.X(3, "FOR_IN", arrayList);
                            if (arrayList.get(0) instanceof q) {
                                String f12 = ((n) arrayList.get(0)).f();
                                n c26 = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                                n c27 = ((t) tVar.l).c(tVar, (n) arrayList.get(2));
                                Iterator b10 = c26.b();
                                if (b10 != null) {
                                    while (b10.hasNext()) {
                                        tVar.O(f12, (n) b10.next());
                                        n J = tVar.J((d) c27);
                                        if (J instanceof f) {
                                            fVar = (f) J;
                                            String str5 = fVar.f3765b;
                                            if ("break".equals(str5)) {
                                                rVar3 = n.f3896c;
                                                return rVar3;
                                            }
                                            if ("return".equals(str5)) {
                                                return fVar;
                                            }
                                        }
                                    }
                                }
                                rVar3 = n.f3896c;
                                return rVar3;
                            }
                            f2.i.k("Variable name in FOR_IN must be a string");
                            return null;
                        case 27:
                            f1.g.X(3, "FOR_IN_CONST", arrayList);
                            if (arrayList.get(0) instanceof q) {
                                return g(new v(tVar, ((n) arrayList.get(0)).f(), 0), ((t) tVar.l).c(tVar, (n) arrayList.get(1)).b(), ((t) tVar.l).c(tVar, (n) arrayList.get(2)));
                            }
                            f2.i.k("Variable name in FOR_IN_CONST must be a string");
                            return null;
                        case 28:
                            f1.g.X(3, "FOR_IN_LET", arrayList);
                            if (arrayList.get(0) instanceof q) {
                                String f13 = ((n) arrayList.get(0)).f();
                                n c28 = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                                n c29 = ((t) tVar.l).c(tVar, (n) arrayList.get(2));
                                Iterator b11 = c28.b();
                                if (b11 != null) {
                                    while (b11.hasNext()) {
                                        n nVar6 = (n) b11.next();
                                        k3.t L = tVar.L();
                                        L.O(f13, nVar6);
                                        n J2 = L.J((d) c29);
                                        if (J2 instanceof f) {
                                            fVar = (f) J2;
                                            String str6 = fVar.f3765b;
                                            if ("break".equals(str6)) {
                                                rVar3 = n.f3896c;
                                                return rVar3;
                                            }
                                            if ("return".equals(str6)) {
                                                return fVar;
                                            }
                                        }
                                    }
                                }
                                rVar3 = n.f3896c;
                                return rVar3;
                            }
                            f2.i.k("Variable name in FOR_IN_LET must be a string");
                            return null;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            f1.g.X(4, "FOR_LET", arrayList);
                            n nVar7 = (n) arrayList.get(0);
                            t tVar10 = (t) tVar.l;
                            t tVar11 = (t) tVar.l;
                            n c30 = tVar10.c(tVar, nVar7);
                            if (c30 instanceof d) {
                                d dVar3 = (d) c30;
                                n nVar8 = (n) arrayList.get(1);
                                n nVar9 = (n) arrayList.get(2);
                                n c31 = tVar11.c(tVar, (n) arrayList.get(3));
                                k3.t L2 = tVar.L();
                                for (int i8 = 0; i8 < dVar3.o(); i8++) {
                                    String f14 = dVar3.p(i8).f();
                                    L2.N(f14, tVar.P(f14));
                                }
                                while (tVar11.c(tVar, nVar8).e().booleanValue()) {
                                    n J3 = tVar.J((d) c31);
                                    if (J3 instanceof f) {
                                        f fVar2 = (f) J3;
                                        String str7 = fVar2.f3765b;
                                        if ("break".equals(str7)) {
                                            return n.f3896c;
                                        }
                                        if ("return".equals(str7)) {
                                            return fVar2;
                                        }
                                    }
                                    k3.t L3 = tVar.L();
                                    for (int i10 = 0; i10 < dVar3.o(); i10++) {
                                        String f15 = dVar3.p(i10).f();
                                        L3.N(f15, L2.P(f15));
                                    }
                                    L3.H(nVar9);
                                    L2 = L3;
                                }
                                return n.f3896c;
                            }
                            f2.i.k("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        case 30:
                            f1.g.X(3, "FOR_OF", arrayList);
                            if (arrayList.get(0) instanceof q) {
                                return e(new v(tVar, ((n) arrayList.get(0)).f(), 2), ((t) tVar.l).c(tVar, (n) arrayList.get(1)), ((t) tVar.l).c(tVar, (n) arrayList.get(2)));
                            }
                            f2.i.k("Variable name in FOR_OF must be a string");
                            return null;
                        case 31:
                            f1.g.X(3, "FOR_OF_CONST", arrayList);
                            if (arrayList.get(0) instanceof q) {
                                return e(new v(tVar, ((n) arrayList.get(0)).f(), 0), ((t) tVar.l).c(tVar, (n) arrayList.get(1)), ((t) tVar.l).c(tVar, (n) arrayList.get(2)));
                            }
                            f2.i.k("Variable name in FOR_OF_CONST must be a string");
                            return null;
                        case 32:
                            f1.g.X(3, "FOR_OF_LET", arrayList);
                            if (arrayList.get(0) instanceof q) {
                                return e(new v(tVar, ((n) arrayList.get(0)).f(), 1), ((t) tVar.l).c(tVar, (n) arrayList.get(1)), ((t) tVar.l).c(tVar, (n) arrayList.get(2)));
                            }
                            f2.i.k("Variable name in FOR_OF_LET must be a string");
                            return null;
                        default:
                            b(str);
                            throw null;
                    }
                }
                f1.g.X(4, "WHILE", arrayList);
                n nVar10 = (n) arrayList.get(0);
                n nVar11 = (n) arrayList.get(1);
                n nVar12 = (n) arrayList.get(2);
                n nVar13 = (n) arrayList.get(3);
                t tVar12 = (t) tVar.l;
                t tVar13 = (t) tVar.l;
                n c32 = tVar12.c(tVar, nVar13);
                if (tVar13.c(tVar, nVar12).e().booleanValue()) {
                    n J4 = tVar.J((d) c32);
                    if (J4 instanceof f) {
                        f fVar3 = (f) J4;
                        String str8 = fVar3.f3765b;
                        if ("break".equals(str8)) {
                            return n.f3896c;
                        }
                        if ("return".equals(str8)) {
                            return fVar3;
                        }
                    }
                }
                while (tVar13.c(tVar, nVar10).e().booleanValue()) {
                    n J5 = tVar.J((d) c32);
                    if (J5 instanceof f) {
                        f fVar4 = (f) J5;
                        String str9 = fVar4.f3765b;
                        if ("break".equals(str9)) {
                            return n.f3896c;
                        }
                        if ("return".equals(str9)) {
                            return fVar4;
                        }
                    }
                    tVar.H(nVar11);
                }
                return n.f3896c;
            case 5:
                w wVar5 = w.ADD;
                int ordinal5 = f1.g.b0(str).ordinal();
                if (ordinal5 == 0) {
                    f1.g.X(2, "ADD", arrayList);
                    n c33 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                    n c34 = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                    if (!(c33 instanceof j) && !(c33 instanceof q) && !(c34 instanceof j) && !(c34 instanceof q)) {
                        qVar = new g(Double.valueOf(c34.h().doubleValue() + c33.h().doubleValue()));
                    } else {
                        qVar = new q(String.valueOf(c33.f()).concat(String.valueOf(c34.f())));
                    }
                } else {
                    if (ordinal5 == 21) {
                        f1.g.X(2, "DIVIDE", arrayList);
                        return new g(Double.valueOf(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue() / ((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue()));
                    }
                    if (ordinal5 == 59) {
                        f1.g.X(2, "SUBTRACT", arrayList);
                        return new g(Double.valueOf(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue() + (-((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue())));
                    }
                    if (ordinal5 == 52 || ordinal5 == 53) {
                        f1.g.X(2, str, arrayList);
                        n c35 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                        tVar.H((n) arrayList.get(1));
                        return c35;
                    }
                    if (ordinal5 != 55 && ordinal5 != 56) {
                        switch (ordinal5) {
                            case 44:
                                f1.g.X(2, "MODULUS", arrayList);
                                return new g(Double.valueOf(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue() % ((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue()));
                            case 45:
                                f1.g.X(2, "MULTIPLY", arrayList);
                                qVar = new g(Double.valueOf(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue() * ((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()));
                                break;
                            case 46:
                                f1.g.X(1, "NEGATE", arrayList);
                                return new g(Double.valueOf(-((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue()));
                            default:
                                b(str);
                                throw null;
                        }
                    } else {
                        f1.g.X(1, str, arrayList);
                        return ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                    }
                }
                return qVar;
            case 6:
                if (str != null && !str.isEmpty() && tVar.M(str)) {
                    n P = tVar.P(str);
                    if (P instanceof h) {
                        return ((h) P).a(tVar, arrayList);
                    }
                    f2.i.k(androidx.compose.ui.b.N("Function ", str, " is not defined"));
                    return null;
                }
                f2.i.k(android.support.v4.media.session.m.l("Command not found: ", str));
                return null;
            default:
                w wVar6 = w.ADD;
                int ordinal6 = f1.g.b0(str).ordinal();
                if (ordinal6 == 3) {
                    f1.g.X(2, "ASSIGN", arrayList);
                    n c36 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                    if (c36 instanceof q) {
                        String str10 = ((q) c36).f3939a;
                        if (tVar.M(str10)) {
                            n c37 = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                            tVar.N(str10, c37);
                            return c37;
                        }
                        f2.i.k(android.support.v4.media.session.m.l("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    f2.i.k(android.support.v4.media.session.m.l("Expected string for assign var. got ", c36.getClass().getCanonicalName()));
                    return null;
                }
                if (ordinal6 == 14) {
                    f1.g.Y(2, "CONST", arrayList);
                    if (arrayList.size() % 2 == 0) {
                        while (i < arrayList.size() - 1) {
                            n c38 = ((t) tVar.l).c(tVar, (n) arrayList.get(i));
                            if (c38 instanceof q) {
                                String str11 = ((q) c38).f3939a;
                                tVar.O(str11, ((t) tVar.l).c(tVar, (n) arrayList.get(i + 1)));
                                ((HashMap) tVar.f7248n).put(str11, Boolean.TRUE);
                                i += 2;
                            } else {
                                f2.i.k(android.support.v4.media.session.m.l("Expected string for const name. got ", c38.getClass().getCanonicalName()));
                                return null;
                            }
                        }
                        return n.f3896c;
                    }
                    f2.i.k(i6.m(arrayList.size(), "CONST requires an even number of arguments, found "));
                    return null;
                }
                if (ordinal6 == 24) {
                    f1.g.Y(1, "EXPRESSION_LIST", arrayList);
                    nVar = n.f3896c;
                    while (i < arrayList.size()) {
                        n c39 = ((t) tVar.l).c(tVar, (n) arrayList.get(i));
                        if (c39 instanceof f) {
                            b.d.j("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        nVar = c39;
                    }
                } else {
                    if (ordinal6 == 33) {
                        f1.g.X(1, ShareTarget.METHOD_GET, arrayList);
                        n c40 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                        if (c40 instanceof q) {
                            return tVar.P(((q) c40).f3939a);
                        }
                        f2.i.k(android.support.v4.media.session.m.l("Expected string for get var. got ", c40.getClass().getCanonicalName()));
                        return null;
                    }
                    if (ordinal6 == 49) {
                        f1.g.X(0, "NULL", arrayList);
                        return n.f3897d;
                    }
                    if (ordinal6 == 58) {
                        f1.g.X(3, "SET_PROPERTY", arrayList);
                        n nVar14 = (n) arrayList.get(0);
                        t tVar14 = (t) tVar.l;
                        t tVar15 = (t) tVar.l;
                        n c41 = tVar14.c(tVar, nVar14);
                        n c42 = tVar15.c(tVar, (n) arrayList.get(1));
                        n c43 = tVar15.c(tVar, (n) arrayList.get(2));
                        if (c41 != n.f3896c && c41 != n.f3897d) {
                            if ((c41 instanceof d) && (c42 instanceof g)) {
                                ((d) c41).q(((g) c42).f3776a.intValue(), c43);
                            } else if (c41 instanceof j) {
                                ((j) c41).d(c42.f(), c43);
                            }
                            return c43;
                        }
                        androidx.privacysandbox.ads.adservices.customaudience.a.i("Can't set property ", c42.f(), " of ", c41.f());
                        return null;
                    }
                    if (ordinal6 != 17) {
                        if (ordinal6 != 18) {
                            if (ordinal6 != 35 && ordinal6 != 36) {
                                switch (ordinal6) {
                                    case RectListKt.BitOffsetForGesturable /* 62 */:
                                        f1.g.X(1, "TYPEOF", arrayList);
                                        n c44 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                                        if (c44 instanceof r) {
                                            str2 = "undefined";
                                        } else if (c44 instanceof e) {
                                            str2 = TypedValues.Custom.S_BOOLEAN;
                                        } else if (c44 instanceof g) {
                                            str2 = "number";
                                        } else if (c44 instanceof q) {
                                            str2 = TypedValues.Custom.S_STRING;
                                        } else if (c44 instanceof m) {
                                            str2 = "function";
                                        } else {
                                            if ((c44 instanceof o) || (c44 instanceof f)) {
                                                androidx.core.view.inputmethod.a.q("Unsupported value type %s in typeof", new Object[]{c44});
                                                return null;
                                            }
                                            str2 = "object";
                                        }
                                        return new q(str2);
                                    case 63:
                                        f1.g.X(0, "UNDEFINED", arrayList);
                                        return n.f3896c;
                                    case 64:
                                        f1.g.Y(1, "VAR", arrayList);
                                        int size = arrayList.size();
                                        while (i < size) {
                                            Object obj = arrayList.get(i);
                                            i++;
                                            n c45 = ((t) tVar.l).c(tVar, (n) obj);
                                            if (c45 instanceof q) {
                                                tVar.O(((q) c45).f3939a, n.f3896c);
                                            } else {
                                                f2.i.k(android.support.v4.media.session.m.l("Expected string for var name. got ", c45.getClass().getCanonicalName()));
                                                return null;
                                            }
                                        }
                                        return n.f3896c;
                                    default:
                                        b(str);
                                        throw null;
                                }
                            }
                            f1.g.X(2, "GET_PROPERTY", arrayList);
                            n c46 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                            n c47 = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                            if ((c46 instanceof d) && f1.g.a0(c47)) {
                                return ((d) c46).p(c47.h().intValue());
                            }
                            if (c46 instanceof j) {
                                return ((j) c46).c(c47.f());
                            }
                            if (c46 instanceof q) {
                                if ("length".equals(c47.f())) {
                                    return new g(Double.valueOf(((q) c46).f3939a.length()));
                                }
                                if (f1.g.a0(c47)) {
                                    double doubleValue = c47.h().doubleValue();
                                    String str12 = ((q) c46).f3939a;
                                    if (doubleValue < str12.length()) {
                                        return new q(String.valueOf(str12.charAt(c47.h().intValue())));
                                    }
                                }
                            }
                            return n.f3896c;
                        }
                        if (arrayList.isEmpty()) {
                            return new k();
                        }
                        if (arrayList.size() % 2 == 0) {
                            nVar = new k();
                            while (i < arrayList.size() - 1) {
                                n c48 = ((t) tVar.l).c(tVar, (n) arrayList.get(i));
                                n c49 = ((t) tVar.l).c(tVar, (n) arrayList.get(i + 1));
                                if (!(c48 instanceof f) && !(c49 instanceof f)) {
                                    nVar.d(c48.f(), c49);
                                    i += 2;
                                } else {
                                    b.d.j("Failed to evaluate map entry");
                                    return null;
                                }
                            }
                        } else {
                            f2.i.k(i6.m(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new d();
                        }
                        nVar = new d();
                        int size2 = arrayList.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            n c50 = ((t) tVar.l).c(tVar, (n) obj2);
                            if (!(c50 instanceof f)) {
                                nVar.q(i, c50);
                                i++;
                            } else {
                                b.d.j("Failed to evaluate array element");
                                return null;
                            }
                        }
                    }
                }
                return nVar;
        }
    }

    public final void b(String str) {
        if (this.f3950a.contains(f1.g.b0(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
