package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b2 extends o5 {
    private static final b2 zzi;
    private int zzb;
    private t5 zzd;
    private t5 zze;
    private t5 zzf;
    private boolean zzg;
    private t5 zzh;

    static {
        b2 b2Var = new b2();
        zzi = b2Var;
        o5.l(b2.class, b2Var);
    }

    public b2() {
        o6 o6Var = o6.f3920n;
        this.zzd = o6Var;
        this.zze = o6Var;
        this.zzf = o6Var;
        this.zzh = o6Var;
    }

    public static b2 u() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzi;
                        }
                        throw null;
                    }
                    return new n5(zzi);
                }
                return new b2();
            }
            return new p6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", y1.class, "zze", z1.class, "zzf", a2.class, "zzg", "zzh", y1.class});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zzd;
    }

    public final List p() {
        return this.zze;
    }

    public final List q() {
        return this.zzf;
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final t5 t() {
        return this.zzh;
    }
}
