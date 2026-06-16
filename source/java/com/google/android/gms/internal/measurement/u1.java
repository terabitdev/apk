package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class u1 extends o5 {
    private static final u1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        u1 u1Var = new u1();
        zzi = u1Var;
        o5.l(u1.class, u1Var);
    }

    public static u1 x() {
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
                return new u1();
            }
            return new p6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", t1.f3962b, "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean o() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        return this.zze;
    }

    public final boolean r() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String s() {
        return this.zzf;
    }

    public final boolean t() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzh;
    }

    public final int y() {
        int i;
        int i3 = this.zzd;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 4;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            i = 0;
                        } else {
                            i = 5;
                        }
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
