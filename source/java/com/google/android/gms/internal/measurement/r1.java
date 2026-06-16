package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class r1 extends o5 {
    private static final r1 zzh;
    private int zzb;
    private x1 zzd;
    private u1 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        r1 r1Var = new r1();
        zzh = r1Var;
        o5.l(r1.class, r1Var);
    }

    public static r1 w() {
        return zzh;
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
                return new r1();
            }
            return new p6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean o() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final x1 p() {
        x1 x1Var = this.zzd;
        if (x1Var == null) {
            return x1.v();
        }
        return x1Var;
    }

    public final boolean q() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final u1 r() {
        u1 u1Var = this.zze;
        if (u1Var == null) {
            return u1.x();
        }
        return u1Var;
    }

    public final boolean s() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final String v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
