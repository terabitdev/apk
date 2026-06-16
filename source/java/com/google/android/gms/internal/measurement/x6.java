package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class x6 extends z6 {
    @Override // com.google.android.gms.internal.measurement.z6
    public final void a(Object obj, long j, byte b10) {
        if (a7.g) {
            a7.c(obj, j, b10);
        } else {
            a7.d(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final boolean b(Object obj, long j) {
        if (a7.g) {
            return a7.n(obj, j);
        }
        return a7.o(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final void c(Object obj, long j, boolean z10) {
        if (a7.g) {
            a7.c(obj, j, z10 ? (byte) 1 : (byte) 0);
        } else {
            a7.d(obj, j, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final float d(Object obj, long j) {
        return Float.intBitsToFloat(this.f4063a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final void e(Object obj, long j, float f7) {
        this.f4063a.putInt(obj, j, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final double f(Object obj, long j) {
        return Double.longBitsToDouble(this.f4063a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.z6
    public final void g(Object obj, long j, double d10) {
        this.f4063a.putLong(obj, j, Double.doubleToLongBits(d10));
    }
}
