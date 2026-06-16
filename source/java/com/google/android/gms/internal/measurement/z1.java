package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class z1 extends o5 {
    private static final z1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.z1, com.google.android.gms.internal.measurement.o5] */
    static {
        ?? o5Var = new o5();
        zzf = o5Var;
        o5.l(z1.class, o5Var);
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
            t1 t1Var = t1.f3965e;
            return new p6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", t1Var, "zze", t1Var});
        }
        return (byte) 1;
    }

    public final int o() {
        int H = l5.H(this.zzd);
        if (H == 0) {
            return 1;
        }
        return H;
    }

    public final int p() {
        int H = l5.H(this.zze);
        if (H == 0) {
            return 1;
        }
        return H;
    }
}
