package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class g2 extends o5 {
    private static final g2 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private t5 zzg;
    private t5 zzh;
    private t5 zzi;
    private String zzj;
    private boolean zzk;
    private t5 zzl;
    private t5 zzm;
    private String zzn;
    private String zzo;
    private b2 zzp;
    private i2 zzq;
    private l2 zzr;
    private j2 zzs;
    private h2 zzt;

    static {
        g2 g2Var = new g2();
        zzu = g2Var;
        o5.l(g2.class, g2Var);
    }

    public g2() {
        o6 o6Var = o6.f3920n;
        this.zzg = o6Var;
        this.zzh = o6Var;
        this.zzi = o6Var;
        this.zzj = "";
        this.zzl = o6Var;
        this.zzm = o6Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static f2 E() {
        return (f2) zzu.g();
    }

    public static g2 F() {
        return zzu;
    }

    public final boolean A() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final b2 B() {
        b2 b2Var = this.zzp;
        if (b2Var == null) {
            return b2.u();
        }
        return b2Var;
    }

    public final boolean C() {
        if ((this.zzb & 512) != 0) {
            return true;
        }
        return false;
    }

    public final l2 D() {
        l2 l2Var = this.zzr;
        if (l2Var == null) {
            return l2.q();
        }
        return l2Var;
    }

    public final void G(int i, e2 e2Var) {
        t5 t5Var = this.zzh;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzh = t5Var.k(size + size);
        }
        this.zzh.set(i, e2Var);
    }

    public final void H() {
        this.zzi = o6.f3920n;
    }

    public final void I() {
        this.zzl = o6.f3920n;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzu;
                        }
                        throw null;
                    }
                    return new n5(zzu);
                }
                return new g2();
            }
            return new p6(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", k2.class, "zzh", e2.class, "zzi", n1.class, "zzj", "zzk", "zzl", w3.class, "zzm", c2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        return (byte) 1;
    }

    public final boolean o() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final long p() {
        return this.zzd;
    }

    public final boolean q() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String r() {
        return this.zze;
    }

    public final t5 s() {
        return this.zzg;
    }

    public final int t() {
        return this.zzh.size();
    }

    public final e2 u(int i) {
        return (e2) this.zzh.get(i);
    }

    public final t5 v() {
        return this.zzi;
    }

    public final t5 w() {
        return this.zzl;
    }

    public final int x() {
        return this.zzl.size();
    }

    public final List y() {
        return this.zzm;
    }

    public final String z() {
        return this.zzn;
    }
}
