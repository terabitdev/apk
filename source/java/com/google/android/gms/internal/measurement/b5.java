package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b5 extends c5 {
    public final int m;

    public b5(byte[] bArr, int i) {
        super(bArr);
        c5.g(0, i, bArr.length);
        this.m = i;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final byte b(int i) {
        int i3 = this.m;
        if (((i3 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i3).length());
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.f3724b[i];
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final byte c(int i) {
        return this.f3724b[i];
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final int d() {
        return this.m;
    }
}
