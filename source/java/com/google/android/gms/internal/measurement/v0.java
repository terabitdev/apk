package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class v0 extends x0.a {
    public static final Parcelable.Creator<v0> CREATOR = new w0(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f3991a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3992b;
    public final boolean l;
    public final Bundle m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3993n;

    public v0(long j, long j10, boolean z10, Bundle bundle, String str) {
        this.f3991a = j;
        this.f3992b = j10;
        this.l = z10;
        this.m = bundle;
        this.f3993n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int J = a4.J(parcel, 20293);
        a4.H(parcel, 1, 8);
        parcel.writeLong(this.f3991a);
        a4.H(parcel, 2, 8);
        parcel.writeLong(this.f3992b);
        a4.H(parcel, 3, 4);
        parcel.writeInt(this.l ? 1 : 0);
        a4.z(7, this.m, parcel);
        a4.C(parcel, 8, this.f3993n);
        a4.N(parcel, J);
    }
}
