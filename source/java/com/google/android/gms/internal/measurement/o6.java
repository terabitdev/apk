package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class o6 extends v4 implements RandomAccess {
    public static final Object[] m;

    /* renamed from: n, reason: collision with root package name */
    public static final o6 f3920n;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3921b;
    public int l;

    static {
        Object[] objArr = new Object[0];
        m = objArr;
        f3920n = new o6(objArr, 0, false);
    }

    public o6(Object[] objArr, int i, boolean z10) {
        super(z10);
        this.f3921b = objArr;
        this.l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        b();
        if (i >= 0 && i <= (i3 = this.l)) {
            int i8 = i + 1;
            Object[] objArr = this.f3921b;
            int length = objArr.length;
            if (i3 < length) {
                System.arraycopy(objArr, i, objArr, i8, i3 - i);
            } else {
                Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.f3921b, 0, objArr2, 0, i);
                System.arraycopy(this.f3921b, i, objArr2, i8, this.l - i);
                this.f3921b = objArr2;
            }
            this.f3921b[i] = obj;
            this.l++;
            ((AbstractList) this).modCount++;
            return;
        }
        b.d.n(x4.a(this.l, i, (byte) 13, "Index:", ", Size:"));
    }

    public final void c(int i) {
        if (i >= 0 && i < this.l) {
            return;
        }
        b.d.n(x4.a(this.l, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f3921b[i];
    }

    @Override // com.google.android.gms.internal.measurement.t5
    public final /* bridge */ /* synthetic */ t5 k(int i) {
        Object[] copyOf;
        if (i >= this.l) {
            if (i == 0) {
                copyOf = m;
            } else {
                copyOf = Arrays.copyOf(this.f3921b, i);
            }
            return new o6(copyOf, this.l, true);
        }
        f2.i.n();
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        Object[] objArr = this.f3921b;
        Object obj = objArr[i];
        if (i < this.l - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        c(i);
        Object[] objArr = this.f3921b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.l;
        int length = this.f3921b.length;
        if (i == length) {
            this.f3921b = Arrays.copyOf(this.f3921b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f3921b;
        int i3 = this.l;
        this.l = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
