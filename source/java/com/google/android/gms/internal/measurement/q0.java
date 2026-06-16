package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class q0 extends x implements s0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final int b() {
        Parcel d10 = d(G(), 2);
        int readInt = d10.readInt();
        d10.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final void m(long j, Bundle bundle, String str, String str2) {
        Parcel G = G();
        G.writeString(str);
        G.writeString(str2);
        z.b(G, bundle);
        G.writeLong(j);
        H(G, 1);
    }
}
