package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class n1 extends o5 {
    private static final n1 zzi;
    private int zzb;
    private int zzd;
    private t5 zze;
    private t5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        n1 n1Var = new n1();
        zzi = n1Var;
        o5.l(n1.class, n1Var);
    }

    public n1() {
        o6 o6Var = o6.f3920n;
        this.zze = o6Var;
        this.zzf = o6Var;
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
                return new n1();
            }
            return new p6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", w1.class, "zzf", p1.class, "zzg", "zzh"});
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

    public final w1 s(int i) {
        return (w1) this.zze.get(i);
    }

    public final t5 t() {
        return this.zzf;
    }

    public final int u() {
        return this.zzf.size();
    }

    public final p1 v(int i) {
        return (p1) this.zzf.get(i);
    }

    public final void w(int i, w1 w1Var) {
        t5 t5Var = this.zze;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zze = t5Var.k(size + size);
        }
        this.zze.set(i, w1Var);
    }

    public final void x(int i, p1 p1Var) {
        t5 t5Var = this.zzf;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzf = t5Var.k(size + size);
        }
        this.zzf.set(i, p1Var);
    }
}
