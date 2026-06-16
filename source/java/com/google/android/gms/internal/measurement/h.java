package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class h implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f3791a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3792b = new HashMap();

    public h(String str) {
        this.f3791a = str;
    }

    public abstract n a(k3.t tVar, List list);

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new i(this.f3792b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n c(String str) {
        HashMap hashMap = this.f3792b;
        if (hashMap.containsKey(str)) {
            return (n) hashMap.get(str);
        }
        return n.f3896c;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void d(String str, n nVar) {
        HashMap hashMap = this.f3792b;
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f3791a;
        if (str == null) {
            return false;
        }
        return str.equals(hVar.f3791a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return this.f3791a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(this.f3791a);
        }
        return androidx.compose.ui.b.Y(this, new q(str), tVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.f3791a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean i(String str) {
        return this.f3792b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n l() {
        return this;
    }
}
