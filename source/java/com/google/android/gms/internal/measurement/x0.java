package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class x0 extends x0.a {
    public static final Parcelable.Creator<x0> CREATOR = new w0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4040b;
    public final Intent l;

    public x0(int i, String str, Intent intent) {
        this.f4039a = i;
        this.f4040b = str;
        this.l = intent;
    }

    public static x0 b(Activity activity) {
        return new x0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f4039a == x0Var.f4039a && Objects.equals(this.f4040b, x0Var.f4040b) && Objects.equals(this.l, x0Var.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4039a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.H(parcel, 1, 4);
        parcel.writeInt(this.f4039a);
        a4.C(parcel, 2, this.f4040b);
        a4.B(parcel, 3, this.l, i);
        a4.N(parcel, J);
    }
}
