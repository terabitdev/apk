package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.AnimationKt;
import androidx.core.internal.view.SupportMenu;
import com.uptodown.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static q2.c f3692a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3693b;

    /* renamed from: c, reason: collision with root package name */
    public static int f3694c;

    /* renamed from: d, reason: collision with root package name */
    public static int f3695d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3696e;

    /* renamed from: f, reason: collision with root package name */
    public static String f3697f;

    public static void A(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int J = J(parcel, i);
        parcel.writeStrongBinder(iBinder);
        N(parcel, J);
    }

    public static void B(Parcel parcel, int i, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int J = J(parcel, i);
        parcelable.writeToParcel(parcel, i3);
        N(parcel, J);
    }

    public static void C(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int J = J(parcel, i);
        parcel.writeString(str);
        N(parcel, J);
    }

    public static void D(Parcel parcel, int i, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int J = J(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N(parcel, J);
    }

    public static void E(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int J = J(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        N(parcel, J);
    }

    public static int F(int i) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
            int i8 = iArr[i3];
            int i10 = i8 - 1;
            if (i8 != 0) {
                if (i10 == i) {
                    return i8;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static String G(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(L(objArr[i]));
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(L(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void H(Parcel parcel, int i, int i3) {
        parcel.writeInt(i | (i3 << 16));
    }

    public static synchronized void I(q2.c cVar) {
        synchronized (a4.class) {
            if (f3692a == null) {
                f3692a = cVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }

    public static int J(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static n K(d dVar, k3.t tVar, ArrayList arrayList, boolean z10) {
        n nVar;
        int i;
        int i3;
        f1.g.Y(1, "reduce", arrayList);
        f1.g.Z(2, "reduce", arrayList);
        n c10 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
        if (c10 instanceof h) {
            if (arrayList.size() == 2) {
                nVar = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                if (nVar instanceof f) {
                    f2.i.k("Failed to parse initial value");
                    return null;
                }
            } else if (dVar.o() != 0) {
                nVar = null;
            } else {
                b.d.j("Empty array with no initial value error");
                return null;
            }
            h hVar = (h) c10;
            int o = dVar.o();
            if (z10) {
                i = 0;
            } else {
                i = o - 1;
            }
            int i8 = -1;
            if (z10) {
                i3 = o - 1;
            } else {
                i3 = 0;
            }
            if (true == z10) {
                i8 = 1;
            }
            if (nVar == null) {
                nVar = dVar.p(i);
                i += i8;
            }
            while ((i3 - i) * i8 >= 0) {
                if (!dVar.r(i)) {
                    i += i8;
                } else {
                    nVar = hVar.a(tVar, Arrays.asList(nVar, dVar.p(i), new g(Double.valueOf(i)), dVar));
                    if (!(nVar instanceof f)) {
                        i += i8;
                    } else {
                        b.d.j("Reduce operation failed");
                        return null;
                    }
                }
            }
            return nVar;
        }
        f2.i.k("Callback should be a method");
        return null;
    }

    public static String L(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String O = androidx.compose.ui.b.O(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(O), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb = new StringBuilder(O.length() + 8 + name2.length() + 1);
            androidx.compose.ui.b.Q(sb, "<", O, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static d M(d dVar, k3.t tVar, m mVar, Boolean bool, Boolean bool2) {
        d dVar2 = new d();
        Iterator n10 = dVar.n();
        while (n10.hasNext()) {
            int intValue = ((Integer) n10.next()).intValue();
            if (dVar.r(intValue)) {
                n a10 = mVar.a(tVar, Arrays.asList(dVar.p(intValue), new g(Double.valueOf(intValue)), dVar));
                if (a10.e().equals(bool)) {
                    break;
                }
                if (bool2 == null || a10.e().equals(bool2)) {
                    dVar2.q(intValue, a10);
                }
            }
        }
        return dVar2;
    }

    public static void N(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean O(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static final ArrayList a(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    int i3 = i + 1;
                    int optInt = jSONArray.optInt(i);
                    Integer valueOf = Integer.valueOf(optInt);
                    if (optInt == 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        arrayList.add(Integer.valueOf(valueOf.intValue()));
                    }
                    i = i3;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final boolean b(byte[] bArr, int i, byte[] bArr2, int i3, int i8) {
        bArr.getClass();
        bArr2.getClass();
        for (int i10 = 0; i10 < i8; i10++) {
            if (bArr[i10 + i] != bArr2[i10 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final Object c(v1.o oVar, o3.w wVar) {
        if (oVar.h()) {
            Exception f7 = oVar.f();
            if (f7 == null) {
                if (!oVar.f10885d) {
                    return oVar.g();
                }
                throw new CancellationException("Task " + oVar + " was cancelled normally.");
            }
            throw f7;
        }
        c8.m mVar = new c8.m(1, t(wVar));
        mVar.t();
        oVar.a(m8.a.f7931a, new m3.c(mVar, 12));
        return mVar.s();
    }

    public static final ArrayList d(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() > 0) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    int i3 = i + 1;
                    String optString = jSONArray.optString(i);
                    optString.getClass();
                    if (optString.length() <= 0) {
                        optString = null;
                    }
                    if (optString != null) {
                        arrayList.add(optString);
                    }
                    i = i3;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static String e(int i, int i3, String str) {
        if (i < 0) {
            return l5.y("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i3 >= 0) {
            return l5.y("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void f(int i, int i3) {
        String y10;
        if (i >= 0 && i < i3) {
            return;
        }
        if (i >= 0) {
            if (i3 >= 0) {
                y10 = l5.y("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i3));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            y10 = l5.y("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(y10);
    }

    public static final void g(long j, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j && j - j10 >= j11) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j10 + " byteCount=" + j11);
    }

    public static void h(int i, int i3) {
        if (i >= 0 && i <= i3) {
            return;
        }
        b.d.n(e(i, i3, "index"));
    }

    public static void i(int i, int i3, int i8) {
        String e10;
        if (i >= 0 && i3 >= i && i3 <= i8) {
            return;
        }
        if (i >= 0 && i <= i8) {
            if (i3 >= 0 && i3 <= i8) {
                e10 = l5.y("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i));
            } else {
                e10 = e(i3, i8, "end index");
            }
        } else {
            e10 = e(i, i8, "start index");
        }
        throw new IndexOutOfBoundsException(e10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g7.c j(g7.c cVar, g7.c cVar2, q7.e eVar) {
        eVar.getClass();
        if (eVar instanceof i7.a) {
            return ((i7.a) eVar).create(cVar, cVar2);
        }
        g7.h context = cVar2.getContext();
        if (context == g7.i.f5693a) {
            return new h7.b(cVar2, cVar, eVar);
        }
        return new h7.c(cVar2, context, eVar, cVar);
    }

    public static boolean k(String str) {
        if (str.equals("1")) {
            return true;
        }
        if (str.equals("0")) {
            return false;
        }
        throw new RuntimeException(androidx.compose.ui.b.N("Undecodable Boolean '", str, "'"));
    }

    public static boolean l(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                file2.getClass();
                l(file2);
            }
        }
        return file.delete();
    }

    public static void m(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            e2.b bVar = (e2.b) obj;
            e2.h hVar = new e2.h(bVar);
            for (e2.r rVar : bVar.f4820b) {
                if (bVar.f4823e == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e2.i iVar = new e2.i(rVar, !z11);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set = (Set) hashMap.get(iVar);
                if (!set.isEmpty() && z11) {
                    androidx.core.view.inputmethod.a.h(rVar, "Multiple components provide ", ".");
                    return;
                }
                set.add(hVar);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (e2.h hVar2 : (Set) it.next()) {
                for (e2.j jVar : hVar2.f4831a.f4821c) {
                    if (jVar.f4838c == 0) {
                        e2.r rVar2 = jVar.f4836a;
                        if (jVar.f4837b == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Set<e2.h> set2 = (Set) hashMap.get(new e2.i(rVar2, z10));
                        if (set2 != null) {
                            for (e2.h hVar3 : set2) {
                                hVar2.f4832b.add(hVar3);
                                hVar3.f4833c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            e2.h hVar4 = (e2.h) it3.next();
            if (hVar4.f4833c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            e2.h hVar5 = (e2.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i++;
            Iterator it4 = hVar5.f4832b.iterator();
            while (it4.hasNext()) {
                e2.h hVar6 = (e2.h) it4.next();
                hVar6.f4833c.remove(hVar5);
                if (hVar6.f4833c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            e2.h hVar7 = (e2.h) it5.next();
            if (!hVar7.f4833c.isEmpty() && !hVar7.f4832b.isEmpty()) {
                arrayList2.add(hVar7.f4831a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static String n(Boolean bool) {
        if (bool.booleanValue()) {
            return "1";
        }
        if (!bool.booleanValue()) {
            return "0";
        }
        throw new RuntimeException("Unencodable Boolean '" + bool + "'");
    }

    public static ArrayList o(String str, ArrayList arrayList) {
        str.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k5.e eVar = (k5.e) obj;
            String str2 = eVar.f7339b;
            boolean z10 = true;
            if (str2 != null && str2.length() != 0) {
                String str3 = eVar.f7339b;
                str3.getClass();
                z10 = z7.n.h0(str3, str, true);
            } else {
                String str4 = eVar.l;
                if (str4 != null && str4.length() != 0) {
                    String str5 = eVar.l;
                    str5.getClass();
                    z10 = z7.n.h0(str5, str, true);
                }
            }
            if (z10) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k5.i, java.lang.Object] */
    public static k5.i p(JSONObject jSONObject) {
        ?? obj = new Object();
        if (!jSONObject.isNull("id")) {
            obj.f7400a = jSONObject.optLong("id");
        }
        if (!jSONObject.isNull("sha256")) {
            jSONObject.optString("sha256");
        }
        if (!jSONObject.isNull("active")) {
            obj.f7401b = jSONObject.optInt("active");
        }
        if (!jSONObject.isNull("url")) {
            obj.f7402c = jSONObject.optString("url");
        }
        if (!jSONObject.isNull("isTurbo")) {
            jSONObject.optInt("isTurbo");
        }
        return obj;
    }

    public static k5.m2 q(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        String optString = jSONObject.optString("title");
        if (optString.length() == 0) {
            str = null;
        } else {
            str = optString;
        }
        String optString2 = jSONObject.optString("body");
        if (optString2.length() == 0) {
            str2 = null;
        } else {
            str2 = optString2;
        }
        String optString3 = jSONObject.optString("url");
        if (optString3.length() == 0) {
            str3 = null;
        } else {
            str3 = optString3;
        }
        String optString4 = jSONObject.optString("actionButtonText");
        if (optString4.length() == 0) {
            str4 = null;
        } else {
            str4 = optString4;
        }
        return new k5.m2(0L, str, str2, str3, str4);
    }

    public static final x7.c r(p8.e eVar) {
        eVar.getClass();
        if (eVar instanceof p8.b) {
            return ((p8.b) eVar).f9408b;
        }
        if (eVar instanceof r8.x0) {
            return r(((r8.x0) eVar).f10376a);
        }
        return null;
    }

    public static void s(y1.b bVar) {
        boolean z10 = false;
        if (bVar.isDone()) {
            while (true) {
                try {
                    bVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
        b.d.j(l5.y("Future was expected to be done: %s", bVar));
    }

    public static g7.c t(g7.c cVar) {
        i7.c cVar2;
        g7.c intercepted;
        cVar.getClass();
        if (cVar instanceof i7.c) {
            cVar2 = (i7.c) cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null && (intercepted = cVar2.intercepted()) != null) {
            return intercepted;
        }
        return cVar;
    }

    public static boolean u(Throwable th) {
        f5.b1 b1Var;
        if (th instanceof f5.b1) {
            b1Var = (f5.b1) th;
        } else {
            b1Var = null;
        }
        if (b1Var != null && b1Var.f5042a == 451) {
            return true;
        }
        return false;
    }

    public static String v(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < AnimationKt.MillisToNanos) {
            return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000)}, 1)).concat("K");
        }
        return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000)}, 1)).concat("M");
    }

    public static String w(long j) {
        double d10 = j / 1024.0d;
        if (d10 < 1024.0d) {
            return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1)).concat(" KB");
        }
        double d11 = 1024;
        double d12 = d10 / d11;
        if (d12 < 1024.0d) {
            return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d12)}, 1)).concat(" MB");
        }
        return String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d12 / d11)}, 1)).concat(" GB");
    }

    public static String x(Context context, long j) {
        context.getClass();
        double d10 = j / 1024.0d;
        if (d10 < 1024.0d) {
            String string = context.getString(R.string.kb_placeholder, String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1)));
            string.getClass();
            return string;
        }
        double d11 = 1024;
        double d12 = d10 / d11;
        if (d12 < 1024.0d) {
            String string2 = context.getString(R.string.mb_placeholder, String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d12)}, 1)));
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.gb_placeholder, String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d12 / d11)}, 1)));
        string3.getClass();
        return string3;
    }

    public static Object y(q7.e eVar, Object obj, g7.c cVar) {
        Object cVar2;
        eVar.getClass();
        g7.h context = cVar.getContext();
        if (context == g7.i.f5693a) {
            cVar2 = new i7.h(cVar);
        } else {
            cVar2 = new i7.c(cVar, context);
        }
        kotlin.jvm.internal.k0.c(2, eVar);
        return eVar.invoke(obj, cVar2);
    }

    public static void z(int i, Bundle bundle, Parcel parcel) {
        if (bundle == null) {
            return;
        }
        int J = J(parcel, i);
        parcel.writeBundle(bundle);
        N(parcel, J);
    }
}
