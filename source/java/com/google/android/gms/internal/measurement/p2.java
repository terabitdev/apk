package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class p2 extends o5 {
    private static final p2 zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private e6 zzl;
    private e6 zzm;

    static {
        p2 p2Var = new p2();
        zzn = p2Var;
        o5.l(p2.class, p2Var);
    }

    public p2() {
        e6 e6Var = e6.f3758b;
        this.zzl = e6Var;
        this.zzm = e6Var;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    public static m2 N() {
        return (m2) zzn.g();
    }

    public static p2 O() {
        return zzn;
    }

    public final String A() {
        return this.zze;
    }

    public final boolean B() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String C() {
        return this.zzf;
    }

    public final boolean D() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final long E() {
        return this.zzg;
    }

    public final boolean F() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final String G() {
        return this.zzh;
    }

    public final boolean H() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String I() {
        return this.zzi;
    }

    public final boolean J() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final String K() {
        return this.zzj;
    }

    public final boolean L() {
        if ((this.zzb & 128) != 0) {
            return true;
        }
        return false;
    }

    public final long M() {
        return this.zzk;
    }

    public final /* synthetic */ void P(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void Q() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void R(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void S() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void T(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void U() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void V(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzn;
                        }
                        throw null;
                    }
                    return new n5(zzn);
                }
                return new p2();
            }
            return new p6(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", n2.f3900a, "zzm", o2.f3913a});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void o(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void p() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void q(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void r() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void s(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void t() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final e6 v() {
        e6 e6Var = this.zzl;
        if (!e6Var.f3759a) {
            this.zzl = e6Var.a();
        }
        return this.zzl;
    }

    public final e6 w() {
        e6 e6Var = this.zzm;
        if (!e6Var.f3759a) {
            this.zzm = e6Var.a();
        }
        return this.zzm;
    }

    public final boolean x() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String y() {
        return this.zzd;
    }

    public final boolean z() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }
}
