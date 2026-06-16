package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class k implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3833a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new i(this.f3833a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n c(String str) {
        HashMap hashMap = this.f3833a;
        if (hashMap.containsKey(str)) {
            return (n) hashMap.get(str);
        }
        return n.f3896c;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void d(String str, n nVar) {
        HashMap hashMap = this.f3833a;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return this.f3833a.equals(((k) obj).f3833a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n g(String str, k3.t tVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(toString());
        }
        return androidx.compose.ui.b.Y(this, new q(str), tVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f3833a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean i(String str) {
        return this.f3833a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        k kVar = new k();
        for (Map.Entry entry : this.f3833a.entrySet()) {
            boolean z10 = entry.getValue() instanceof j;
            HashMap hashMap = kVar.f3833a;
            if (z10) {
                hashMap.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((n) entry.getValue()).l());
            }
        }
        return kVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.f3833a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
