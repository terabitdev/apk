package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class o5 extends u4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected v6 zzc;

    public o5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = v6.f3995f;
    }

    public static o5 k(Class cls) {
        Map map = zzd;
        o5 o5Var = (o5) map.get(cls);
        if (o5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o5Var = (o5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (o5Var == null) {
            o5 o5Var2 = (o5) ((o5) a7.e(cls)).n(6);
            if (o5Var2 != null) {
                map.put(cls, o5Var2);
                return o5Var2;
            }
            a8.c.s();
            return null;
        }
        return o5Var;
    }

    public static void l(Class cls, o5 o5Var) {
        o5Var.f();
        zzd.put(cls, o5Var);
    }

    public static Object m(Method method, o5 o5Var, Object... objArr) {
        try {
            return method.invoke(o5Var, objArr);
        } catch (IllegalAccessException e10) {
            androidx.privacysandbox.ads.adservices.customaudience.a.l("Couldn't use Java reflection to implement protocol message reflection.", e10);
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.l("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final int b(q6 q6Var) {
        if (e()) {
            int c10 = q6Var.c(this);
            if (c10 >= 0) {
                return c10;
            }
            b.d.f(String.valueOf(c10).length() + 42, c10);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int c11 = q6Var.c(this);
            if (c11 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | c11;
                return c11;
            }
            b.d.f(String.valueOf(c11).length() + 42, c11);
            return 0;
        }
        return i;
    }

    public final void d(d5 d5Var) {
        q6 a10 = n6.f3904c.a(getClass());
        c6 c6Var = d5Var.f3739a;
        if (c6Var == null) {
            c6Var = new c6(d5Var);
        }
        a10.d(this, c6Var);
    }

    public final boolean e() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return n6.f3904c.a(getClass()).f(this, (o5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final n5 g() {
        return (n5) n(5);
    }

    public final n5 h() {
        n5 n5Var = (n5) n(5);
        n5Var.e(this);
        return n5Var;
    }

    public final int hashCode() {
        if (!e()) {
            int i = this.zza;
            if (i == 0) {
                int i3 = n6.f3904c.a(getClass()).i(this);
                this.zza = i3;
                return i3;
            }
            return i;
        }
        return n6.f3904c.a(getClass()).i(this);
    }

    public final void i() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int j() {
        if (e()) {
            int c10 = n6.f3904c.a(getClass()).c(this);
            if (c10 >= 0) {
                return c10;
            }
            b.d.f(String.valueOf(c10).length() + 42, c10);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int c11 = n6.f3904c.a(getClass()).c(this);
        if (c11 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | c11;
            return c11;
        }
        b.d.f(String.valueOf(c11).length() + 42, c11);
        return 0;
    }

    public abstract Object n(int i);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = h6.f3798a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        h6.b(this, sb, 0);
        return sb.toString();
    }
}
