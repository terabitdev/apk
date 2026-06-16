package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class d implements Iterable, n, j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f3730a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f3731b;

    public d(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                q(i, (n) list.get(i));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new c(this, this.f3730a.keySet().iterator(), this.f3731b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n c(String str) {
        n nVar;
        if ("length".equals(str)) {
            return new g(Double.valueOf(o()));
        }
        if (i(str) && (nVar = (n) this.f3731b.get(str)) != null) {
            return nVar;
        }
        return n.f3896c;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void d(String str, n nVar) {
        TreeMap treeMap = this.f3731b;
        if (nVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (o() == dVar.o()) {
                    TreeMap treeMap = this.f3730a;
                    if (treeMap.isEmpty()) {
                        return dVar.f3730a.isEmpty();
                    }
                    for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                        if (!p(intValue).equals(dVar.p(intValue))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return t(",");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02dc, code lost:
    
        if (com.google.android.gms.internal.measurement.a4.M(r7, r2, (com.google.android.gms.internal.measurement.m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).o() == r7.o()) goto L168;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0123. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        String str2;
        String str3;
        Object obj;
        String str4;
        k3.t tVar2;
        String str5;
        Object obj2;
        d dVar;
        ArrayList arrayList2;
        int hashCode;
        TreeMap treeMap;
        double d10;
        String str6;
        h hVar;
        double min;
        String str7 = "toString";
        String str8 = "splice";
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str)) {
            str2 = "lastIndexOf";
            str3 = "filter";
            obj = "unshift";
            str4 = "sort";
            tVar2 = tVar;
            str5 = "forEach";
            obj2 = "reduce";
            dVar = this;
        } else {
            str3 = "filter";
            str4 = "sort";
            if (!str4.equals(str)) {
                obj2 = "reduce";
                if (str8.equals(str)) {
                    str2 = "lastIndexOf";
                    str8 = str8;
                } else {
                    str8 = str8;
                    if (str7.equals(str)) {
                        str2 = "lastIndexOf";
                        str7 = str7;
                    } else {
                        str7 = str7;
                        if ("unshift".equals(str)) {
                            str2 = "lastIndexOf";
                            str5 = "forEach";
                            obj = "unshift";
                            dVar = this;
                            tVar2 = tVar;
                        } else {
                            return androidx.compose.ui.b.Y(this, new q(str), tVar, arrayList);
                        }
                    }
                }
            } else {
                str2 = "lastIndexOf";
                obj2 = "reduce";
            }
            obj = "unshift";
            tVar2 = tVar;
            arrayList2 = arrayList;
            str5 = "forEach";
            dVar = this;
            Double valueOf = Double.valueOf(-1.0d);
            hashCode = str.hashCode();
            TreeMap treeMap2 = dVar.f3730a;
            n nVar = n.f3896c;
            TreeMap treeMap3 = treeMap2;
            double d11 = 0.0d;
            switch (hashCode) {
                case -1776922004:
                    String str9 = str7;
                    if (str.equals(str9)) {
                        f1.g.X(0, str9, arrayList2);
                        return new q(dVar.t(","));
                    }
                    f2.i.k("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        d dVar2 = (d) dVar.l();
                        if (!arrayList2.isEmpty()) {
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj3 = arrayList2.get(i);
                                i++;
                                n c10 = ((t) tVar2.l).c(tVar2, (n) obj3);
                                if (!(c10 instanceof f)) {
                                    int o = dVar2.o();
                                    if (c10 instanceof d) {
                                        d dVar3 = (d) c10;
                                        Iterator n10 = dVar3.n();
                                        while (n10.hasNext()) {
                                            Integer num = (Integer) n10.next();
                                            dVar2.q(num.intValue() + o, dVar3.p(num.intValue()));
                                        }
                                    } else {
                                        dVar2.q(o, c10);
                                    }
                                } else {
                                    b.d.j("Failed evaluation of arguments");
                                    return null;
                                }
                            }
                        }
                        return dVar2;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case -1274492040:
                    String str10 = str3;
                    if (str.equals(str10)) {
                        f1.g.X(1, str10, arrayList2);
                        n c11 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                        if (c11 instanceof m) {
                            if (treeMap3.size() == 0) {
                                return new d();
                            }
                            d dVar4 = (d) dVar.l();
                            d M = a4.M(dVar, tVar2, (m) c11, null, Boolean.TRUE);
                            d dVar5 = new d();
                            Iterator n11 = M.n();
                            while (n11.hasNext()) {
                                dVar5.q(dVar5.o(), dVar4.p(((Integer) n11.next()).intValue()));
                            }
                            return dVar5;
                        }
                        f2.i.k("Callback should be a method");
                        return null;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return a4.K(dVar, tVar2, arrayList2, true);
                    }
                    f2.i.k("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str8)) {
                        if (arrayList2.isEmpty()) {
                            return new d();
                        }
                        n nVar2 = (n) arrayList2.get(0);
                        t tVar3 = (t) tVar2.l;
                        t tVar4 = (t) tVar2.l;
                        int e02 = (int) f1.g.e0(tVar3.c(tVar2, nVar2).h().doubleValue());
                        if (e02 < 0) {
                            e02 = Math.max(0, dVar.o() + e02);
                        } else if (e02 > dVar.o()) {
                            e02 = dVar.o();
                        }
                        int o7 = dVar.o();
                        d dVar6 = new d();
                        if (arrayList2.size() > 1) {
                            int max = Math.max(0, (int) f1.g.e0(tVar4.c(tVar2, (n) arrayList2.get(1)).h().doubleValue()));
                            if (max > 0) {
                                for (int i3 = e02; i3 < Math.min(o7, e02 + max); i3++) {
                                    dVar6.q(dVar6.o(), dVar.p(e02));
                                    dVar.s(e02);
                                }
                            }
                            int i8 = 2;
                            if (arrayList2.size() > 2) {
                                while (i8 < arrayList2.size()) {
                                    n c12 = tVar4.c(tVar2, (n) arrayList2.get(i8));
                                    if (!(c12 instanceof f)) {
                                        int i10 = (e02 + i8) - 2;
                                        if (i10 >= 0) {
                                            if (i10 >= dVar.o()) {
                                                dVar.q(i10, c12);
                                                treeMap = treeMap3;
                                            } else {
                                                int intValue = ((Integer) treeMap3.lastKey()).intValue();
                                                while (intValue >= i10) {
                                                    Integer valueOf2 = Integer.valueOf(intValue);
                                                    TreeMap treeMap4 = treeMap3;
                                                    n nVar3 = (n) treeMap4.get(valueOf2);
                                                    if (nVar3 != null) {
                                                        dVar.q(intValue + 1, nVar3);
                                                        treeMap4.remove(valueOf2);
                                                    }
                                                    intValue--;
                                                    treeMap3 = treeMap4;
                                                }
                                                treeMap = treeMap3;
                                                dVar.q(i10, c12);
                                            }
                                            i8++;
                                            treeMap3 = treeMap;
                                        } else {
                                            f2.i.g(String.valueOf(i10).length() + 21, i10, "Invalid value index: ");
                                            return null;
                                        }
                                    } else {
                                        f2.i.k("Failed to parse elements to add");
                                        return null;
                                    }
                                }
                            }
                        } else {
                            while (e02 < o7) {
                                dVar6.q(dVar6.o(), dVar.p(e02));
                                dVar.q(e02, null);
                                e02++;
                            }
                        }
                        return dVar6;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case -678635926:
                    String str11 = str5;
                    if (str.equals(str11)) {
                        f1.g.X(1, str11, arrayList2);
                        n c13 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                        if (c13 instanceof m) {
                            if (treeMap3.size() != 0) {
                                a4.M(dVar, tVar2, (m) c13, null, null);
                                return nVar;
                            }
                            return nVar;
                        }
                        f2.i.k("Callback should be a method");
                        return null;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case -467511597:
                    String str12 = str2;
                    if (str.equals(str12)) {
                        f1.g.Z(2, str12, arrayList2);
                        if (!arrayList2.isEmpty()) {
                            nVar = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                        }
                        n nVar4 = nVar;
                        int o8 = dVar.o() - 1;
                        if (arrayList2.size() > 1) {
                            n c14 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(1));
                            d10 = Double.isNaN(c14.h().doubleValue()) ? dVar.o() - 1 : f1.g.e0(c14.h().doubleValue());
                            if (d10 < 0.0d) {
                                d10 += dVar.o();
                            }
                        } else {
                            d10 = o8;
                        }
                        if (d10 < 0.0d) {
                            return new g(valueOf);
                        }
                        for (int min2 = (int) Math.min(dVar.o(), d10); min2 >= 0; min2--) {
                            if (dVar.r(min2) && f1.g.c0(dVar.p(min2), nVar4)) {
                                return new g(Double.valueOf(min2));
                            }
                        }
                        return new g(valueOf);
                    }
                    f2.i.k("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList2.isEmpty()) {
                            d dVar7 = new d();
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj4 = arrayList2.get(i11);
                                i11++;
                                n c15 = ((t) tVar2.l).c(tVar2, (n) obj4);
                                if (!(c15 instanceof f)) {
                                    dVar7.q(dVar7.o(), c15);
                                } else {
                                    b.d.j("Argument evaluation failed");
                                    return null;
                                }
                            }
                            int o10 = dVar7.o();
                            Iterator n12 = dVar.n();
                            while (n12.hasNext()) {
                                Integer num2 = (Integer) n12.next();
                                dVar7.q(num2.intValue() + o10, dVar.p(num2.intValue()));
                            }
                            treeMap3.clear();
                            Iterator n13 = dVar7.n();
                            while (n13.hasNext()) {
                                Integer num3 = (Integer) n13.next();
                                dVar.q(num3.intValue(), dVar7.p(num3.intValue()));
                            }
                        }
                        return new g(Double.valueOf(dVar.o()));
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        f1.g.X(1, "map", arrayList2);
                        n c16 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                        if (c16 instanceof m) {
                            if (dVar.o() == 0) {
                                return new d();
                            }
                            return a4.M(dVar, tVar2, (m) c16, null, null);
                        }
                        f2.i.k("Callback should be a method");
                        return null;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        f1.g.X(0, "pop", arrayList2);
                        int o11 = dVar.o();
                        if (o11 != 0) {
                            int i12 = o11 - 1;
                            n p = dVar.p(i12);
                            dVar.s(i12);
                            return p;
                        }
                        return nVar;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        f1.g.Z(1, "join", arrayList2);
                        if (dVar.o() == 0) {
                            return n.j;
                        }
                        if (arrayList2.isEmpty()) {
                            str6 = ",";
                        } else {
                            n c17 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                            if (!(c17 instanceof l) && !(c17 instanceof r)) {
                                str6 = c17.f();
                            } else {
                                str6 = "";
                            }
                        }
                        return new q(dVar.t(str6));
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size3) {
                                Object obj5 = arrayList2.get(i13);
                                i13++;
                                dVar.q(dVar.o(), ((t) tVar2.l).c(tVar2, (n) obj5));
                            }
                        }
                        return new g(Double.valueOf(dVar.o()));
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        f1.g.X(1, "some", arrayList2);
                        n c18 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                        if (c18 instanceof h) {
                            if (dVar.o() != 0) {
                                h hVar2 = (h) c18;
                                Iterator n14 = dVar.n();
                                while (n14.hasNext()) {
                                    int intValue2 = ((Integer) n14.next()).intValue();
                                    if (dVar.r(intValue2) && hVar2.a(tVar2, Arrays.asList(dVar.p(intValue2), new g(Double.valueOf(intValue2)), dVar)).e().booleanValue()) {
                                        return n.h;
                                    }
                                }
                            }
                            return n.i;
                        }
                        f2.i.k("Callback should be a method");
                        return null;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str4)) {
                        f1.g.Z(1, str4, arrayList2);
                        if (dVar.o() >= 2) {
                            List m = dVar.m();
                            if (!arrayList2.isEmpty()) {
                                n c19 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                                if (c19 instanceof h) {
                                    hVar = (h) c19;
                                } else {
                                    f2.i.k("Comparator should be a method");
                                    return null;
                                }
                            } else {
                                hVar = null;
                            }
                            Collections.sort(m, new u(hVar, tVar2));
                            treeMap3.clear();
                            ArrayList arrayList3 = (ArrayList) m;
                            int size4 = arrayList3.size();
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < size4) {
                                Object obj6 = arrayList3.get(i14);
                                i14++;
                                dVar.q(i15, (n) obj6);
                                i15++;
                            }
                        }
                        return dVar;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        f1.g.X(1, "every", arrayList2);
                        n c20 = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                        if (c20 instanceof m) {
                            if (dVar.o() != 0) {
                                break;
                            }
                            return n.h;
                        }
                        f2.i.k("Callback should be a method");
                        return null;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        f1.g.X(0, "shift", arrayList2);
                        if (dVar.o() != 0) {
                            n p7 = dVar.p(0);
                            dVar.s(0);
                            return p7;
                        }
                        return nVar;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        f1.g.Z(2, "slice", arrayList2);
                        if (arrayList2.isEmpty()) {
                            return dVar.l();
                        }
                        double o12 = dVar.o();
                        double e03 = f1.g.e0(((t) tVar2.l).c(tVar2, (n) arrayList2.get(0)).h().doubleValue());
                        if (e03 < 0.0d) {
                            min = Math.max(e03 + o12, 0.0d);
                        } else {
                            min = Math.min(e03, o12);
                        }
                        if (arrayList2.size() == 2) {
                            double e04 = f1.g.e0(((t) tVar2.l).c(tVar2, (n) arrayList2.get(1)).h().doubleValue());
                            if (e04 < 0.0d) {
                                o12 = Math.max(o12 + e04, 0.0d);
                            } else {
                                o12 = Math.min(o12, e04);
                            }
                        }
                        d dVar8 = new d();
                        for (int i16 = (int) min; i16 < o12; i16++) {
                            dVar8.q(dVar8.o(), dVar.p(i16));
                        }
                        return dVar8;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return a4.K(dVar, tVar2, arrayList2, false);
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        f1.g.X(0, "reverse", arrayList2);
                        int o13 = dVar.o();
                        if (o13 != 0) {
                            for (int i17 = 0; i17 < o13 / 2; i17++) {
                                if (dVar.r(i17)) {
                                    n p10 = dVar.p(i17);
                                    dVar.q(i17, null);
                                    int i18 = (o13 - 1) - i17;
                                    if (dVar.r(i18)) {
                                        dVar.q(i17, dVar.p(i18));
                                    }
                                    dVar.q(i18, p10);
                                }
                            }
                        }
                        return dVar;
                    }
                    f2.i.k("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        f1.g.Z(2, "indexOf", arrayList2);
                        if (!arrayList2.isEmpty()) {
                            nVar = ((t) tVar2.l).c(tVar2, (n) arrayList2.get(0));
                        }
                        n nVar5 = nVar;
                        if (arrayList2.size() > 1) {
                            double e05 = f1.g.e0(((t) tVar2.l).c(tVar2, (n) arrayList2.get(1)).h().doubleValue());
                            if (e05 >= dVar.o()) {
                                return new g(valueOf);
                            }
                            if (e05 < 0.0d) {
                                d11 = dVar.o() + e05;
                            } else {
                                d11 = e05;
                            }
                        }
                        Iterator n15 = dVar.n();
                        while (n15.hasNext()) {
                            int intValue3 = ((Integer) n15.next()).intValue();
                            double d12 = intValue3;
                            if (d12 >= d11 && f1.g.c0(dVar.p(intValue3), nVar5)) {
                                return new g(Double.valueOf(d12));
                            }
                        }
                        return new g(valueOf);
                    }
                    f2.i.k("Command not supported");
                    return null;
                default:
                    f2.i.k("Command not supported");
                    return null;
            }
        }
        arrayList2 = arrayList;
        Double valueOf3 = Double.valueOf(-1.0d);
        hashCode = str.hashCode();
        TreeMap treeMap22 = dVar.f3730a;
        n nVar6 = n.f3896c;
        TreeMap treeMap32 = treeMap22;
        double d112 = 0.0d;
        switch (hashCode) {
            case -1776922004:
                break;
            case -1354795244:
                break;
            case -1274492040:
                break;
            case -934873754:
                break;
            case -895859076:
                break;
            case -678635926:
                break;
            case -467511597:
                break;
            case -277637751:
                break;
            case 107868:
                break;
            case 111185:
                break;
            case 3267882:
                break;
            case 3452698:
                break;
            case 3536116:
                break;
            case 3536286:
                break;
            case 96891675:
                break;
            case 109407362:
                break;
            case 109526418:
                break;
            case 965561430:
                break;
            case 1099846370:
                break;
            case 1943291465:
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        TreeMap treeMap = this.f3730a;
        if (treeMap.size() == 1) {
            return p(0).h();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f3730a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean i(String str) {
        if (!"length".equals(str) && !this.f3731b.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, 2);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        d dVar = new d();
        for (Map.Entry entry : this.f3730a.entrySet()) {
            boolean z10 = entry.getValue() instanceof j;
            TreeMap treeMap = dVar.f3730a;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((n) entry.getValue()).l());
            }
        }
        return dVar;
    }

    public final List m() {
        ArrayList arrayList = new ArrayList(o());
        for (int i = 0; i < o(); i++) {
            arrayList.add(p(i));
        }
        return arrayList;
    }

    public final Iterator n() {
        return this.f3730a.keySet().iterator();
    }

    public final int o() {
        TreeMap treeMap = this.f3730a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final n p(int i) {
        n nVar;
        if (i < o()) {
            if (r(i) && (nVar = (n) this.f3730a.get(Integer.valueOf(i))) != null) {
                return nVar;
            }
            return n.f3896c;
        }
        b.d.n("Attempting to get element outside of current array");
        return null;
    }

    public final void q(int i, n nVar) {
        if (i <= 32468) {
            if (i >= 0) {
                TreeMap treeMap = this.f3730a;
                if (nVar == null) {
                    treeMap.remove(Integer.valueOf(i));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i), nVar);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        b.d.j("Array too large");
    }

    public final boolean r(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f3730a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void s(int i) {
        TreeMap treeMap = this.f3730a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            treeMap.remove(Integer.valueOf(i));
            if (i == intValue) {
                int i3 = i - 1;
                Integer valueOf = Integer.valueOf(i3);
                if (!treeMap.containsKey(valueOf) && i3 >= 0) {
                    treeMap.put(valueOf, n.f3896c);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i);
                    n nVar = (n) treeMap.get(valueOf2);
                    if (nVar != null) {
                        treeMap.put(Integer.valueOf(i - 1), nVar);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String t(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f3730a.isEmpty()) {
            int i = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i >= o()) {
                    break;
                }
                n p = p(i);
                sb.append(str2);
                if (!(p instanceof r) && !(p instanceof l)) {
                    sb.append(p.f());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return t(",");
    }

    public d() {
        this.f3730a = new TreeMap();
        this.f3731b = new TreeMap();
    }
}
