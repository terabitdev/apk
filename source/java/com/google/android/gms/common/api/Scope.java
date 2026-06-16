package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.measurement.a4;
import q1.f;
import w0.x;
import x0.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class Scope extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new f(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f3678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3679b;

    public Scope(int i, String str) {
        x.e(str, "scopeUri must not be null or empty");
        this.f3678a = i;
        this.f3679b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3679b.equals(((Scope) obj).f3679b);
    }

    public final int hashCode() {
        return this.f3679b.hashCode();
    }

    public final String toString() {
        return this.f3679b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.H(parcel, 1, 4);
        parcel.writeInt(this.f3678a);
        a4.C(parcel, 2, this.f3679b);
        a4.N(parcel, J);
    }
}
