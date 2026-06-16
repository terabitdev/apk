package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class t3 extends o5 {
    private static final t3 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        t3 t3Var = new t3();
        zzj = t3Var;
        o5.l(t3.class, t3Var);
    }

    public static s3 z() {
        return (s3) zzj.g();
    }

    public final /* synthetic */ void A(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void D() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void G(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    public final /* synthetic */ void H() {
        this.zzb &= -33;
        this.zzi = 0.0d;
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
                return new t3();
            }
            return new p6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
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

    public final String q() {
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

    public final long u() {
        return this.zzg;
    }

    public final boolean v() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final float w() {
        return this.zzh;
    }

    public final boolean x() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final double y() {
        return this.zzi;
    }
}
