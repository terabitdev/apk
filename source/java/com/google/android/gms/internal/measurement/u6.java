package com.google.android.gms.internal.measurement;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class u6 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f3983a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3984b;
    public Iterator l;
    public final /* synthetic */ s6 m;

    public /* synthetic */ u6(s6 s6Var) {
        Objects.requireNonNull(s6Var);
        this.m = s6Var;
        this.f3983a = -1;
    }

    public final Iterator a() {
        if (this.l == null) {
            this.l = this.m.l.entrySet().iterator();
        }
        return this.l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3983a + 1;
        s6 s6Var = this.m;
        if (i < s6Var.f3956b) {
            return true;
        }
        if (!s6Var.l.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f3984b = true;
        int i = this.f3983a + 1;
        this.f3983a = i;
        s6 s6Var = this.m;
        if (i < s6Var.f3956b) {
            return (t6) s6Var.f3955a[i];
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f3984b) {
            this.f3984b = false;
            s6 s6Var = this.m;
            s6Var.g();
            int i = this.f3983a;
            if (i < s6Var.f3956b) {
                this.f3983a = i - 1;
                s6Var.e(i);
                return;
            } else {
                a().remove();
                return;
            }
        }
        b.d.j("remove() was called before next()");
    }
}
