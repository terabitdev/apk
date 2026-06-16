package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class r3 extends o5 {
    private static final r3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.r3, com.google.android.gms.internal.measurement.o5] */
    static {
        ?? o5Var = new o5();
        zzg = o5Var;
        o5.l(r3.class, o5Var);
    }

    public static q3 p() {
        return (q3) zzg.g();
    }

    public static r3 q() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzg;
                        }
                        throw null;
                    }
                    return new n5(zzg);
                }
                return new o5();
            }
            return new p6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", t1.f3968n, "zze", t1.l, "zzf", t1.m});
        }
        return (byte) 1;
    }

    public final int o() {
        int x5 = androidx.compose.ui.b.x(this.zze);
        if (x5 == 0) {
            return 1;
        }
        return x5;
    }

    public final void r(int i) {
        this.zze = androidx.compose.ui.b.F(i);
        this.zzb |= 2;
    }

    public final int s() {
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

    public final int t() {
        int i;
        int i3 = this.zzf;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1) {
                int i8 = 3;
                if (i3 != 2) {
                    i = 4;
                    if (i3 != 3) {
                        i8 = 5;
                        if (i3 != 4) {
                            if (i3 != 5) {
                                i = 0;
                            } else {
                                i = 6;
                            }
                        }
                    }
                }
                i = i8;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void u(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
