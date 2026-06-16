package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class c3 extends o5 {
    private static final c3 zzj;
    private int zzb;
    private t5 zzd = o6.f3920n;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        c3 c3Var = new c3();
        zzj = c3Var;
        o5.l(c3.class, c3Var);
    }

    public static b3 y() {
        return (b3) zzj.g();
    }

    public final /* synthetic */ void A(f3 f3Var) {
        f3Var.getClass();
        I();
        this.zzd.add(f3Var);
    }

    public final /* synthetic */ void B(Iterable iterable) {
        I();
        u4.c(iterable, this.zzd);
    }

    public final void C() {
        this.zzd = o6.f3920n;
    }

    public final /* synthetic */ void D(int i) {
        I();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void I() {
        t5 t5Var = this.zzd;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzd = t5Var.k(size + size);
        }
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
                return new c3();
            }
            return new p6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", f3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zzd;
    }

    public final int p() {
        return this.zzd.size();
    }

    public final f3 q(int i) {
        return (f3) this.zzd.get(i);
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final long t() {
        return this.zzf;
    }

    public final boolean u() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long v() {
        return this.zzg;
    }

    public final boolean w() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int x() {
        return this.zzh;
    }

    public final /* synthetic */ void z(int i, f3 f3Var) {
        I();
        this.zzd.set(i, f3Var);
    }
}
