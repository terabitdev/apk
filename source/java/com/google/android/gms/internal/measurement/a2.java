package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class a2 extends o5 {
    private static final a2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        a2 a2Var = new a2();
        zzf = a2Var;
        o5.l(a2.class, a2Var);
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
                return new a2();
            }
            return new p6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final String o() {
        return this.zzd;
    }
}
