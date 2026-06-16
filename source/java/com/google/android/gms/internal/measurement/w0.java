package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class w0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4032a;

    public /* synthetic */ w0(int i) {
        this.f4032a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4032a) {
            case 0:
                int R = a.a.R(parcel);
                Bundle bundle = null;
                String str = null;
                boolean z10 = false;
                long j = 0;
                long j10 = 0;
                while (parcel.dataPosition() < R) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 7) {
                                    if (c10 != '\b') {
                                        a.a.Q(parcel, readInt);
                                    } else {
                                        str = a.a.n(parcel, readInt);
                                    }
                                } else {
                                    bundle = a.a.l(parcel, readInt);
                                }
                            } else {
                                z10 = a.a.L(parcel, readInt);
                            }
                        } else {
                            j10 = a.a.O(parcel, readInt);
                        }
                    } else {
                        j = a.a.O(parcel, readInt);
                    }
                }
                a.a.q(parcel, R);
                return new v0(j, j10, z10, bundle, str);
            default:
                int R2 = a.a.R(parcel);
                String str2 = null;
                int i = 0;
                Intent intent = null;
                while (parcel.dataPosition() < R2) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                a.a.Q(parcel, readInt2);
                            } else {
                                intent = (Intent) a.a.m(parcel, readInt2, Intent.CREATOR);
                            }
                        } else {
                            str2 = a.a.n(parcel, readInt2);
                        }
                    } else {
                        i = a.a.N(parcel, readInt2);
                    }
                }
                a.a.q(parcel, R2);
                return new x0(i, str2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f4032a) {
            case 0:
                return new v0[i];
            default:
                return new x0[i];
        }
    }
}
