package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class e2 extends o5 {
    private static final e2 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        e2 e2Var = new e2();
        zzh = e2Var;
        o5.l(e2.class, e2Var);
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
                return new e2();
            }
            return new p6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String o() {
        return this.zzd;
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

    public final boolean s() {
        return this.zzf;
    }

    public final boolean t() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int u() {
        return this.zzg;
    }

    public final /* synthetic */ void v(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
