package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class u2 extends o5 {
    private static final u2 zzh;
    private int zzb;
    private int zzd;
    private n3 zze;
    private n3 zzf;
    private boolean zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.u2, com.google.android.gms.internal.measurement.o5] */
    static {
        ?? o5Var = new o5();
        zzh = o5Var;
        o5.l(u2.class, o5Var);
    }

    public static t2 v() {
        return (t2) zzh.g();
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzh;
                        }
                        throw null;
                    }
                    return new n5(zzh);
                }
                return new o5();
            }
            return new p6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
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

    public final n3 q() {
        n3 n3Var = this.zze;
        if (n3Var == null) {
            return n3.x();
        }
        return n3Var;
    }

    public final boolean r() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final n3 s() {
        n3 n3Var = this.zzf;
        if (n3Var == null) {
            return n3.x();
        }
        return n3Var;
    }

    public final boolean t() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final /* synthetic */ void w(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void x(n3 n3Var) {
        this.zze = n3Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void y(n3 n3Var) {
        this.zzf = n3Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void z(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }
}
