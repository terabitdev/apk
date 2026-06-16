package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class x2 extends o5 {
    private static final x2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.o5, com.google.android.gms.internal.measurement.x2] */
    static {
        ?? o5Var = new o5();
        zzf = o5Var;
        o5.l(x2.class, o5Var);
    }

    public static w2 o() {
        return (w2) zzf.g();
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final Object n(int i) {
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            return zzf;
                        }
                        throw null;
                    }
                    return new n5(zzf);
                }
                return new o5();
            }
            return new p6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", t1.h, "zze", t1.i});
        }
        return (byte) 1;
    }

    public final int p() {
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

    public final int q() {
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

    public final /* synthetic */ void r(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void s(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
