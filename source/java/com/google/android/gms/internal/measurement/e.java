package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3750a;

    public e(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f3750a = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean e() {
        return Boolean.valueOf(this.f3750a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.f3750a == ((e) obj).f3750a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String f() {
        return Boolean.toString(this.f3750a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z10 = this.f3750a;
        if (equals) {
            return new q(Boolean.toString(z10));
        }
        throw new IllegalArgumentException(Boolean.toString(z10) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double h() {
        double d10;
        if (true != this.f3750a) {
            d10 = 0.0d;
        } else {
            d10 = 1.0d;
        }
        return Double.valueOf(d10);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f3750a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new e(Boolean.valueOf(this.f3750a));
    }

    public final String toString() {
        return String.valueOf(this.f3750a);
    }
}
