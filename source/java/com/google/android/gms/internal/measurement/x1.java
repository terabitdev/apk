package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class x1 extends o5 {
    private static final x1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private t5 zzg = o6.f3920n;

    static {
        x1 x1Var = new x1();
        zzh = x1Var;
        o5.l(x1.class, x1Var);
    }

    public static x1 v() {
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
                return new x1();
            }
            return new p6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", t1.f3963c, "zze", "zzf", "zzg"});
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

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        return this.zzf;
    }

    public final t5 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzg.size();
    }

    public final int w() {
        int i;
        switch (this.zzd) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
