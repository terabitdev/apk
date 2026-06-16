package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class p1 extends o5 {
    private static final p1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private t5 zzf = o6.f3920n;
    private boolean zzg;
    private u1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        p1 p1Var = new p1();
        zzl = p1Var;
        o5.l(p1.class, p1Var);
    }

    public static o1 A() {
        return (o1) zzl.g();
    }

    public final /* synthetic */ void B(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void C(int i, r1 r1Var) {
        t5 t5Var = this.zzf;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzf = t5Var.k(size + size);
        }
        this.zzf.set(i, r1Var);
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzl;
                        }
                        throw null;
                    }
                    return new n5(zzl);
                }
                return new p1();
            }
            return new p6(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", r1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
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

    public final String q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final int s() {
        return this.zzf.size();
    }

    public final r1 t(int i) {
        return (r1) this.zzf.get(i);
    }

    public final boolean u() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final u1 v() {
        u1 u1Var = this.zzh;
        if (u1Var == null) {
            return u1.x();
        }
        return u1Var;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        return this.zzk;
    }
}
