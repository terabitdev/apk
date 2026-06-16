package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i1 extends y implements s0 {
    public final c2.b i;

    public i1(c2.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.i = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.i);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        z.d(parcel);
        m(readLong, bundle, readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final int b() {
        return System.identityHashCode(this.i);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final void m(long j, Bundle bundle, String str, String str2) {
        this.i.a(j, bundle, str, str2);
    }
}
