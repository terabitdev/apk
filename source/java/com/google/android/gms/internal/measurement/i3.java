package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i3 extends o5 {
    private static final i3 zzh;
    private int zzb;
    private t5 zzd = o6.f3920n;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        i3 i3Var = new i3();
        zzh = i3Var;
        o5.l(i3.class, i3Var);
    }

    public static h3 v() {
        return (h3) zzh.g();
    }

    public static h3 w(i3 i3Var) {
        n5 g = zzh.g();
        g.e(i3Var);
        return (h3) g;
    }

    public final void A() {
        this.zzd = o6.f3920n;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void D() {
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
                            return zzh;
                        }
                        throw null;
                    }
                    return new n5(zzh);
                }
                return new i3();
            }
            return new p6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", k3.class, "zze", "zzf", "zzg", t1.j});
        }
        return (byte) 1;
    }

    public final List o() {
        return this.zzd;
    }

    public final int p() {
        return this.zzd.size();
    }

    public final k3 q(int i) {
        return (k3) this.zzd.get(i);
    }

    public final boolean r() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String u() {
        return this.zzf;
    }

    public final /* synthetic */ void x(int i, k3 k3Var) {
        D();
        this.zzd.set(i, k3Var);
    }

    public final /* synthetic */ void y(k3 k3Var) {
        D();
        this.zzd.add(k3Var);
    }

    public final /* synthetic */ void z(ArrayList arrayList) {
        D();
        u4.c(arrayList, this.zzd);
    }
}
