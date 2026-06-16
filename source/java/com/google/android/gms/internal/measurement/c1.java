package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class c1 extends y implements p0 {
    public final /* synthetic */ y1.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(y0 y0Var, y1.a aVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.i = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            e();
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void e() {
        this.i.run();
    }
}
