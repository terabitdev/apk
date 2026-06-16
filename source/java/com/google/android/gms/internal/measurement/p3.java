package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class p3 extends o5 {
    private static final p3 zzf;
    private int zzb;
    private int zzd;
    private s5 zze = b6.f3715n;

    static {
        p3 p3Var = new p3();
        zzf = p3Var;
        o5.l(p3.class, p3Var);
    }

    public static o3 t() {
        return (o3) zzf.g();
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
                return new p3();
            }
            return new p6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
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

    public final List q() {
        return this.zze;
    }

    public final int r() {
        return this.zze.size();
    }

    public final long s(int i) {
        return ((b6) this.zze).c(i);
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void v(List list) {
        List list2 = this.zze;
        if (!((v4) list2).f3994a) {
            int size = list2.size();
            this.zze = ((b6) list2).k(size + size);
        }
        u4.c(list, this.zze);
    }
}
