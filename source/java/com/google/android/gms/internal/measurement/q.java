package com.google.android.gms.internal.measurement;

import androidx.collection.SieveCacheKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class q implements Iterable, n {

    /* renamed from: a, reason: collision with root package name */
    public final String f3939a;

    public q(String str) {
        if (str != null) {
            this.f3939a = str;
        } else {
            f2.i.k("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new p(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.valueOf(!this.f3939a.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return this.f3939a.equals(((q) obj).f3939a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return this.f3939a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e2, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        String str2;
        String str3;
        int i;
        double doubleValue;
        double e02;
        String f7;
        double d10;
        double min;
        double length;
        double min2;
        long j;
        int i3;
        int i8;
        int i10;
        int length2;
        k3.t tVar2;
        double doubleValue2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                f2.i.k(str.concat(" is not a String function"));
                return null;
            }
        }
        int hashCode = str.hashCode();
        String str4 = "undefined";
        String str5 = this.f3939a;
        int i11 = 0;
        r8 = false;
        boolean z10 = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    f1.g.X(1, str6, arrayList);
                    n c10 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                    boolean equals = "length".equals(c10.f());
                    e eVar = n.h;
                    if (equals) {
                        return eVar;
                    }
                    double doubleValue3 = c10.h().doubleValue();
                    if (doubleValue3 == Math.floor(doubleValue3) && (i = (int) doubleValue3) >= 0 && i < str5.length()) {
                        return eVar;
                    }
                    return n.i;
                }
                f2.i.k("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    f1.g.X(0, "toString", arrayList);
                    return this;
                }
                f2.i.k("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    f1.g.X(0, "toLocaleLowerCase", arrayList);
                    return new q(str5.toLowerCase());
                }
                f2.i.k("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    f1.g.Z(1, "charAt", arrayList);
                    if (!arrayList.isEmpty()) {
                        i11 = (int) f1.g.e0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue());
                    }
                    if (i11 >= 0 && i11 < str5.length()) {
                        return new q(String.valueOf(str5.charAt(i11)));
                    }
                    return n.j;
                }
                f2.i.k("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str5);
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            sb.append(((t) tVar.l).c(tVar, (n) arrayList.get(i12)).f());
                        }
                        return new q(sb.toString());
                    }
                    return this;
                }
                f2.i.k("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    f1.g.X(0, "toLowerCase", arrayList);
                    return new q(str5.toLowerCase(Locale.ENGLISH));
                }
                f2.i.k("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    f1.g.Z(1, "search", arrayList);
                    if (!arrayList.isEmpty()) {
                        str4 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).f();
                    }
                    if (Pattern.compile(str4).matcher(str5).find()) {
                        return new g(Double.valueOf(r0.start()));
                    }
                    return new g(Double.valueOf(-1.0d));
                }
                f2.i.k("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    f1.g.X(0, "toLocaleUpperCase", arrayList);
                    return new q(str5.toUpperCase());
                }
                f2.i.k("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    f1.g.Z(2, "lastIndexOf", arrayList);
                    if (arrayList.size() > 0) {
                        str4 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).f();
                    }
                    String str7 = str4;
                    if (arrayList.size() < 2) {
                        doubleValue = Double.NaN;
                    } else {
                        doubleValue = ((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue();
                    }
                    if (Double.isNaN(doubleValue)) {
                        e02 = Double.POSITIVE_INFINITY;
                    } else {
                        e02 = f1.g.e0(doubleValue);
                    }
                    return new g(Double.valueOf(str5.lastIndexOf(str7, (int) e02)));
                }
                f2.i.k("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    f1.g.X(0, "toUpperCase", arrayList);
                    return new q(str5.toUpperCase(Locale.ENGLISH));
                }
                f2.i.k("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str3)) {
                    f1.g.X(0, "toUpperCase", arrayList);
                    return new q(str5.trim());
                }
                f2.i.k("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    f1.g.Z(1, "match", arrayList);
                    if (arrayList.size() <= 0) {
                        f7 = "";
                    } else {
                        f7 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).f();
                    }
                    Matcher matcher = Pattern.compile(f7).matcher(str5);
                    if (matcher.find()) {
                        return new d(Arrays.asList(new q(matcher.group())));
                    }
                    return n.f3897d;
                }
                f2.i.k("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    f1.g.Z(2, "slice", arrayList);
                    if (!arrayList.isEmpty()) {
                        d10 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue();
                    } else {
                        d10 = 0.0d;
                    }
                    double e03 = f1.g.e0(d10);
                    if (e03 < 0.0d) {
                        min = Math.max(str5.length() + e03, 0.0d);
                    } else {
                        min = Math.min(e03, str5.length());
                    }
                    if (arrayList.size() > 1) {
                        length = ((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue();
                    } else {
                        length = str5.length();
                    }
                    double e04 = f1.g.e0(length);
                    if (e04 < 0.0d) {
                        min2 = Math.max(str5.length() + e04, 0.0d);
                    } else {
                        min2 = Math.min(e04, str5.length());
                    }
                    int i13 = (int) min;
                    return new q(str5.substring(i13, Math.max(0, ((int) min2) - i13) + i13));
                }
                f2.i.k("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    f1.g.Z(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new d(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String f10 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).f();
                        if (arrayList.size() > 1) {
                            j = f1.g.d0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue()) & 4294967295L;
                        } else {
                            j = SieveCacheKt.NodeLinkMask;
                        }
                        if (j == 0) {
                            return new d();
                        }
                        String[] split = str5.split(Pattern.quote(f10), ((int) j) + 1);
                        int length3 = split.length;
                        if (f10.isEmpty() && length3 > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i3 = length3 - 1;
                            i8 = isEmpty;
                            z10 = isEmpty;
                            break;
                        }
                        i3 = length3;
                        i8 = z10;
                        if (length3 > j) {
                            i3--;
                        }
                        while (i8 < i3) {
                            arrayList2.add(new q(split[i8]));
                            i8++;
                        }
                    }
                    return new d(arrayList2);
                }
                f2.i.k("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    f1.g.Z(2, "substring", arrayList);
                    if (!arrayList.isEmpty()) {
                        i10 = (int) f1.g.e0(((t) tVar.l).c(tVar, (n) arrayList.get(0)).h().doubleValue());
                    } else {
                        i10 = 0;
                    }
                    if (arrayList.size() > 1) {
                        length2 = (int) f1.g.e0(((t) tVar.l).c(tVar, (n) arrayList.get(1)).h().doubleValue());
                    } else {
                        length2 = str5.length();
                    }
                    int min3 = Math.min(Math.max(i10, 0), str5.length());
                    int min4 = Math.min(Math.max(length2, 0), str5.length());
                    return new q(str5.substring(Math.min(min3, min4), Math.max(min3, min4)));
                }
                f2.i.k("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    f1.g.Z(2, "replace", arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    n nVar = n.f3896c;
                    if (!isEmpty2) {
                        str4 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).f();
                        if (arrayList.size() > 1) {
                            nVar = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                        }
                    }
                    String str8 = str4;
                    int indexOf = str5.indexOf(str8);
                    if (indexOf >= 0) {
                        if (nVar instanceof h) {
                            nVar = ((h) nVar).a(tVar, Arrays.asList(new q(str8), new g(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String f11 = nVar.f();
                        String substring2 = str5.substring(str8.length() + indexOf);
                        return new q(androidx.compose.ui.b.O(new StringBuilder(substring.length() + String.valueOf(f11).length() + substring2.length()), substring, f11, substring2));
                    }
                    return this;
                }
                f2.i.k("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    f1.g.Z(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        tVar2 = tVar;
                    } else {
                        tVar2 = tVar;
                        str4 = ((t) tVar2.l).c(tVar2, (n) arrayList.get(0)).f();
                    }
                    String str9 = str4;
                    if (arrayList.size() < 2) {
                        doubleValue2 = 0.0d;
                    } else {
                        doubleValue2 = ((t) tVar2.l).c(tVar2, (n) arrayList.get(1)).h().doubleValue();
                    }
                    return new g(Double.valueOf(str5.indexOf(str9, (int) f1.g.e0(doubleValue2))));
                }
                f2.i.k("Command not supported");
                return null;
            default:
                f2.i.k("Command not supported");
                return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        String str = this.f3939a;
        if (!str.isEmpty()) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.NaN);
            }
        }
        return Double.valueOf(0.0d);
    }

    public final int hashCode() {
        return this.f3939a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new q(this.f3939a);
    }

    public final String toString() {
        String str = this.f3939a;
        return androidx.compose.ui.b.O(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
