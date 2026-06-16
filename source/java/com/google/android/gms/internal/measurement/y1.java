package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class y1 extends o5 {
    private static final y1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.y1, com.google.android.gms.internal.measurement.o5] */
    static {
        ?? o5Var = new o5();
        zzg = o5Var;
        o5.l(y1.class, o5Var);
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
            return new p6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", t1.f3965e, "zze", t1.f3964d, "zzf", t1.f3966f});
        }
        return (byte) 1;
    }

    public final int o() {
        int H = l5.H(this.zzd);
        if (H == 0) {
            return 1;
        }
        return H;
    }

    public final int p() {
        int i;
        int i3 = this.zze;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 0;
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

    public final int q() {
        int i;
        int i3 = this.zzf;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 0;
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
