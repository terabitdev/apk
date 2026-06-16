package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class w3 extends o5 {
    private static final w3 zzf;
    private int zzb;
    private t5 zzd = o6.f3920n;
    private u3 zze;

    static {
        w3 w3Var = new w3();
        zzf = w3Var;
        o5.l(w3.class, w3Var);
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
                return new w3();
            }
            return new p6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", x3.class, "zze"});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zzd;
    }

    public final u3 p() {
        u3 u3Var = this.zze;
        if (u3Var == null) {
            return u3.q();
        }
        return u3Var;
    }
}
