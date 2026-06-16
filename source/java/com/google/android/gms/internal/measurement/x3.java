package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class x3 extends o5 {
    private static final x3 zzj;
    private int zzb;
    private int zzd;
    private t5 zze = o6.f3920n;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        x3 x3Var = new x3();
        zzj = x3Var;
        o5.l(x3.class, x3Var);
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzj;
                        }
                        throw null;
                    }
                    return new n5(zzj);
                }
                return new x3();
            }
            return new p6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", t1.o, "zze", x3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zze;
    }

    public final String p() {
        return this.zzf;
    }

    public final boolean q() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String r() {
        return this.zzg;
    }

    public final boolean s() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final double v() {
        return this.zzi;
    }

    public final int w() {
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
