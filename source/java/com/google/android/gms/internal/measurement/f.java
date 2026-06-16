package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f3764a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3765b;

    public f(String str) {
        this.f3764a = n.f3896c;
        this.f3765b = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f3765b.equals(fVar.f3765b) && this.f3764a.equals(fVar.f3764a)) {
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
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.f3764a.hashCode() + (this.f3765b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new f(this.f3765b, this.f3764a.l());
    }

    public f(String str, n nVar) {
        this.f3764a = nVar;
        this.f3765b = str;
    }
}
