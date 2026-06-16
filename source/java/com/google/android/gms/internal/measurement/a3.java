package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class a3 extends o5 {
    private static final a3 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.a3, com.google.android.gms.internal.measurement.o5] */
    static {
        ?? o5Var = new o5();
        zzf = o5Var;
        o5.l(a3.class, o5Var);
    }

    public static z2 s() {
        return (z2) zzf.g();
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzf;
                        }
                        throw null;
                    }
                    return new n5(zzf);
                }
                return new o5();
            }
            return new p6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final boolean o() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int p() {
        return this.zzd;
    }

    public final boolean q() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final long r() {
        return this.zze;
    }

    public final /* synthetic */ void t(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
