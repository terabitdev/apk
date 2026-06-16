package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class u3 extends o5 {
    private static final u3 zzd;
    private t5 zzb = o6.f3920n;

    static {
        u3 u3Var = new u3();
        zzd = u3Var;
        o5.l(u3.class, u3Var);
    }

    public static u3 q() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzd;
                        }
                        throw null;
                    }
                    return new n5(zzd);
                }
                return new u3();
            }
            return new p6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", v3.class});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zzb;
    }

    public final int p() {
        return this.zzb.size();
    }
}
