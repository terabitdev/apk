package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class u4 {
    protected int zza;

    public static void c(Iterable iterable, List list) {
        Charset charset = u5.f3981a;
        iterable.getClass();
        if (iterable instanceof y5) {
            List a10 = ((y5) iterable).a();
            y5 y5Var = (y5) list;
            int size = list.size();
            for (Object obj : a10) {
                if (obj == null) {
                    int size2 = y5Var.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = y5Var.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            y5Var.remove(size3);
                        } else {
                            o2.a.h(sb2);
                            return;
                        }
                    }
                } else if (obj instanceof c5) {
                    y5Var.j();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    c5.e(0, bArr.length, bArr);
                    y5Var.j();
                } else {
                    y5Var.add((String) obj);
                }
            }
            return;
        }
        if (!(iterable instanceof m6)) {
            if (iterable instanceof Collection) {
                int size4 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size4);
                } else if (list instanceof o6) {
                    o6 o6Var = (o6) list;
                    int i = o6Var.l + size4;
                    int length = o6Var.f3921b.length;
                    if (i > length) {
                        if (length != 0) {
                            while (length < i) {
                                length = Math.max(((length * 3) / 2) + 1, 10);
                            }
                            o6Var.f3921b = Arrays.copyOf(o6Var.f3921b, length);
                        } else {
                            o6Var.f3921b = new Object[Math.max(i, 10)];
                        }
                    }
                }
            }
            int size5 = list.size();
            if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
                List list2 = (List) iterable;
                int size6 = list2.size();
                for (int i3 = 0; i3 < size6; i3++) {
                    Object obj2 = list2.get(i3);
                    if (obj2 != null) {
                        list.add(obj2);
                    } else {
                        n5.a(size5, list);
                        throw null;
                    }
                }
                return;
            }
            for (Object obj3 : iterable) {
                if (obj3 != null) {
                    list.add(obj3);
                } else {
                    n5.a(size5, list);
                    throw null;
                }
            }
            return;
        }
        list.addAll((Collection) iterable);
    }

    public final byte[] a() {
        try {
            o5 o5Var = (o5) this;
            int j = o5Var.j();
            byte[] bArr = new byte[j];
            d5 d5Var = new d5(bArr, j);
            o5Var.d(d5Var);
            if (j - d5Var.f3742d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            androidx.privacysandbox.ads.adservices.customaudience.a.l(androidx.compose.ui.b.O(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
            return null;
        }
    }

    public abstract int b(q6 q6Var);
}
