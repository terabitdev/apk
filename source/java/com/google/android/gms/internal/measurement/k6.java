package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class k6 implements q6 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f3836a;

    /* renamed from: b, reason: collision with root package name */
    public final m5 f3837b;

    public k6(m5 m5Var, u4 u4Var) {
        m5 m5Var2 = h5.f3797a;
        this.f3837b = m5Var;
        this.f3836a = u4Var;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final o5 a() {
        u4 u4Var = this.f3836a;
        if (u4Var instanceof o5) {
            return (o5) ((o5) u4Var).n(4);
        }
        n5 n5Var = (n5) ((o5) u4Var).n(5);
        boolean e10 = n5Var.f3903b.e();
        o5 o5Var = n5Var.f3903b;
        if (!e10) {
            return o5Var;
        }
        o5Var.getClass();
        n6.f3904c.a(o5Var.getClass()).g(o5Var);
        o5Var.f();
        return n5Var.f3903b;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void b(Object obj, Object obj2) {
        r6.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final int c(u4 u4Var) {
        v6 v6Var = ((o5) u4Var).zzc;
        int i = v6Var.f3999d;
        if (i == -1) {
            int i3 = 0;
            for (int i8 = 0; i8 < v6Var.f3996a; i8++) {
                int i10 = v6Var.f3997b[i8] >>> 3;
                c5 c5Var = (c5) v6Var.f3998c[i8];
                int s = d5.s(8);
                int s3 = d5.s(i10) + d5.s(16);
                int s10 = d5.s(24);
                int d10 = c5Var.d();
                i3 += s + s + s3 + i6.h(d10, d10, s10);
            }
            v6Var.f3999d = i3;
            return i3;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void d(Object obj, c6 c6Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final boolean e(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final boolean f(o5 o5Var, o5 o5Var2) {
        if (!o5Var.zzc.equals(o5Var2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void g(Object obj) {
        this.f3837b.getClass();
        v6 v6Var = ((o5) obj).zzc;
        if (v6Var.f4000e) {
            v6Var.f4000e = false;
        }
        m5 m5Var = h5.f3797a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void h(Object obj, byte[] bArr, int i, int i3, x4 x4Var) {
        o5 o5Var = (o5) obj;
        if (o5Var.zzc == v6.f3995f) {
            o5Var.zzc = v6.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final int i(o5 o5Var) {
        return o5Var.zzc.hashCode();
    }
}
