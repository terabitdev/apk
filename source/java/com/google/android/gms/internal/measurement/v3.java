package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class v3 extends o5 {
    private static final v3 zzf;
    private int zzb;
    private String zzd = "";
    private t5 zze = o6.f3920n;

    static {
        v3 v3Var = new v3();
        zzf = v3Var;
        o5.l(v3.class, v3Var);
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
                return new v3();
            }
            return new p6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", x3.class});
        }
        return (byte) 1;
    }

    public final String o() {
        return this.zzd;
    }

    public final List p() {
        return this.zze;
    }
}
