package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class y2 extends o5 {
    private static final y2 zzd;
    private t5 zzb = o6.f3920n;

    static {
        y2 y2Var = new y2();
        zzd = y2Var;
        o5.l(y2.class, y2Var);
    }

    public static v2 p() {
        return (v2) zzd.g();
    }

    public static y2 q() {
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
                return new y2();
            }
            return new p6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", x2.class});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zzb;
    }

    public final void r(ArrayList arrayList) {
        t5 t5Var = this.zzb;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzb = t5Var.k(size + size);
        }
        u4.c(arrayList, this.zzb);
    }
}
