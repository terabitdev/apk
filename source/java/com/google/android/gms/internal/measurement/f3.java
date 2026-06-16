package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class f3 extends o5 {
    private static final f3 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private t5 zzi = o6.f3920n;

    static {
        f3 f3Var = new f3();
        zzj = f3Var;
        o5.l(f3.class, f3Var);
    }

    public static e3 A() {
        return (e3) zzj.g();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void D() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void F() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void G(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    public final /* synthetic */ void H() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final void I(f3 f3Var) {
        t5 t5Var = this.zzi;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzi = t5Var.k(size + size);
        }
        this.zzi.add(f3Var);
    }

    public final void J(ArrayList arrayList) {
        t5 t5Var = this.zzi;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzi = t5Var.k(size + size);
        }
        u4.c(arrayList, this.zzi);
    }

    public final void K() {
        this.zzi = o6.f3920n;
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
                return new f3();
            }
            return new p6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", f3.class});
        }
        return (byte) 1;
    }

    public final boolean o() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String p() {
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

    public final boolean s() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long t() {
        return this.zzf;
    }

    public final boolean u() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final float v() {
        return this.zzg;
    }

    public final boolean w() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final double x() {
        return this.zzh;
    }

    public final List y() {
        return this.zzi;
    }

    public final int z() {
        return this.zzi.size();
    }
}
