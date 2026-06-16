package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3912b;

    public o(String str, ArrayList arrayList) {
        this.f3911a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f3912b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = oVar.f3911a;
        String str2 = this.f3911a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        return this.f3912b.equals(oVar.f3912b);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        int i;
        String str = this.f3911a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.f3912b.hashCode() + (i * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return this;
    }
}
