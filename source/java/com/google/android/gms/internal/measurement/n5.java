package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class n5 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final o5 f3902a;

    /* renamed from: b, reason: collision with root package name */
    public o5 f3903b;

    public n5(o5 o5Var) {
        this.f3902a = o5Var;
        if (!o5Var.e()) {
            this.f3903b = (o5) o5Var.n(4);
        } else {
            f2.i.k("Default instance must be immutable.");
            throw null;
        }
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i) {
                list.remove(size2);
            } else {
                throw new NullPointerException(sb2);
            }
        }
    }

    public final void b() {
        if (!this.f3903b.e()) {
            o5 o5Var = (o5) this.f3902a.n(4);
            n6.f3904c.a(o5Var.getClass()).b(o5Var, this.f3903b);
            this.f3903b = o5Var;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final n5 clone() {
        n5 n5Var = (n5) this.f3902a.n(5);
        boolean e10 = this.f3903b.e();
        o5 o5Var = this.f3903b;
        if (e10) {
            o5Var.getClass();
            n6.f3904c.a(o5Var.getClass()).g(o5Var);
            o5Var.f();
            o5Var = this.f3903b;
        }
        n5Var.f3903b = o5Var;
        return n5Var;
    }

    public final o5 d() {
        boolean e10 = this.f3903b.e();
        o5 o5Var = this.f3903b;
        if (e10) {
            o5Var.getClass();
            n6.f3904c.a(o5Var.getClass()).g(o5Var);
            o5Var.f();
            o5Var = this.f3903b;
        }
        o5Var.getClass();
        boolean z10 = true;
        byte byteValue = ((Byte) o5Var.n(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                z10 = n6.f3904c.a(o5Var.getClass()).e(o5Var);
                o5Var.n(2);
            }
        }
        if (z10) {
            return o5Var;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void e(o5 o5Var) {
        o5 o5Var2 = this.f3902a;
        if (!o5Var2.equals(o5Var)) {
            if (!this.f3903b.e()) {
                o5 o5Var3 = (o5) o5Var2.n(4);
                n6.f3904c.a(o5Var3.getClass()).b(o5Var3, this.f3903b);
                this.f3903b = o5Var3;
            }
            o5 o5Var4 = this.f3903b;
            n6.f3904c.a(o5Var4.getClass()).b(o5Var4, o5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.google.android.gms.internal.measurement.x4] */
    public final void f(byte[] bArr, int i, g5 g5Var) {
        if (!this.f3903b.e()) {
            o5 o5Var = (o5) this.f3902a.n(4);
            n6.f3904c.a(o5Var.getClass()).b(o5Var, this.f3903b);
            this.f3903b = o5Var;
        }
        try {
            q6 a10 = n6.f3904c.a(this.f3903b.getClass());
            o5 o5Var2 = this.f3903b;
            ?? obj = new Object();
            g5Var.getClass();
            a10.h(o5Var2, bArr, 0, i, obj);
        } catch (w5 e10) {
            throw e10;
        } catch (IOException e11) {
            androidx.privacysandbox.ads.adservices.customaudience.a.l("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            b.d.l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
