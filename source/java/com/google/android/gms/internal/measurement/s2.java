package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class s2 extends o5 {
    private static final s2 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.s2, com.google.android.gms.internal.measurement.o5] */
    static {
        ?? o5Var = new o5();
        zzk = o5Var;
        o5.l(s2.class, o5Var);
    }

    public static r2 v() {
        return (r2) zzk.g();
    }

    public static s2 w() {
        return zzk;
    }

    public final /* synthetic */ void A(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    public final /* synthetic */ void B(boolean z10) {
        this.zzb |= 16;
        this.zzh = z10;
    }

    public final /* synthetic */ void C(boolean z10) {
        this.zzb |= 32;
        this.zzi = z10;
    }

    public final /* synthetic */ void D(boolean z10) {
        this.zzb |= 64;
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzk;
                        }
                        throw null;
                    }
                    return new n5(zzk);
                }
                return new o5();
            }
            return new p6(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final boolean o() {
        return this.zzd;
    }

    public final boolean p() {
        return this.zze;
    }

    public final boolean q() {
        return this.zzf;
    }

    public final boolean r() {
        return this.zzg;
    }

    public final boolean s() {
        return this.zzh;
    }

    public final boolean t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzj;
    }

    public final /* synthetic */ void x(boolean z10) {
        this.zzb |= 1;
        this.zzd = z10;
    }

    public final /* synthetic */ void y(boolean z10) {
        this.zzb |= 2;
        this.zze = z10;
    }

    public final /* synthetic */ void z(boolean z10) {
        this.zzb |= 4;
        this.zzf = z10;
    }
}
