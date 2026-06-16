package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class n3 extends o5 {
    private static final n3 zzg;
    private s5 zzb;
    private s5 zzd;
    private t5 zze;
    private t5 zzf;

    static {
        n3 n3Var = new n3();
        zzg = n3Var;
        o5.l(n3.class, n3Var);
    }

    public n3() {
        b6 b6Var = b6.f3715n;
        this.zzb = b6Var;
        this.zzd = b6Var;
        o6 o6Var = o6.f3920n;
        this.zze = o6Var;
        this.zzf = o6Var;
    }

    public static m3 w() {
        return (m3) zzg.g();
    }

    public static n3 x() {
        return zzg;
    }

    public final void A(List list) {
        List list2 = this.zzd;
        if (!((v4) list2).f3994a) {
            int size = list2.size();
            this.zzd = ((b6) list2).k(size + size);
        }
        u4.c(list, this.zzd);
    }

    public final void B() {
        this.zzd = b6.f3715n;
    }

    public final void C(ArrayList arrayList) {
        t5 t5Var = this.zze;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zze = t5Var.k(size + size);
        }
        u4.c(arrayList, this.zze);
    }

    public final void D() {
        this.zze = o6.f3920n;
    }

    public final void E(Iterable iterable) {
        t5 t5Var = this.zzf;
        if (!((v4) t5Var).f3994a) {
            int size = t5Var.size();
            this.zzf = t5Var.k(size + size);
        }
        u4.c(iterable, this.zzf);
    }

    public final void F() {
        this.zzf = o6.f3920n;
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
                return new n3();
            }
            return new p6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", a3.class, "zzf", p3.class});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zzb;
    }

    public final int p() {
        return this.zzb.size();
    }

    public final List q() {
        return this.zzd;
    }

    public final int r() {
        return this.zzd.size();
    }

    public final t5 s() {
        return this.zze;
    }

    public final int t() {
        return this.zze.size();
    }

    public final List u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final void y(Iterable iterable) {
        List list = this.zzb;
        if (!((v4) list).f3994a) {
            int size = list.size();
            this.zzb = ((b6) list).k(size + size);
        }
        u4.c(iterable, this.zzb);
    }

    public final void z() {
        this.zzb = b6.f3715n;
    }
}
