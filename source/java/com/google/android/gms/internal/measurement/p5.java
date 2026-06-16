package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class p5 extends v4 implements RandomAccess, r5, m6 {
    public static final int[] m;

    /* renamed from: n, reason: collision with root package name */
    public static final p5 f3929n;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3930b;
    public int l;

    static {
        int[] iArr = new int[0];
        m = iArr;
        f3929n = new p5(iArr, 0, false);
    }

    public p5(int[] iArr, int i, boolean z10) {
        super(z10);
        this.f3930b = iArr;
        this.l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i >= 0 && i <= (i3 = this.l)) {
            int i8 = i + 1;
            int[] iArr = this.f3930b;
            int length = iArr.length;
            if (i3 < length) {
                System.arraycopy(iArr, i, iArr, i8, i3 - i);
            } else {
                int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.f3930b, 0, iArr2, 0, i);
                System.arraycopy(this.f3930b, i, iArr2, i8, this.l - i);
                this.f3930b = iArr2;
            }
            this.f3930b[i] = intValue;
            this.l++;
            ((AbstractList) this).modCount++;
            return;
        }
        b.d.n(x4.a(this.l, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = u5.f3981a;
        collection.getClass();
        if (!(collection instanceof p5)) {
            return super.addAll(collection);
        }
        p5 p5Var = (p5) collection;
        int i = p5Var.l;
        if (i == 0) {
            return false;
        }
        int i3 = this.l;
        if (Integer.MAX_VALUE - i3 >= i) {
            int i8 = i3 + i;
            int[] iArr = this.f3930b;
            if (i8 > iArr.length) {
                this.f3930b = Arrays.copyOf(iArr, i8);
            }
            System.arraycopy(p5Var.f3930b, 0, this.f3930b, this.l, p5Var.l);
            this.l = i8;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.measurement.t5
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final p5 k(int i) {
        int[] copyOf;
        if (i >= this.l) {
            if (i == 0) {
                copyOf = m;
            } else {
                copyOf = Arrays.copyOf(this.f3930b, i);
            }
            return new p5(copyOf, this.l, true);
        }
        f2.i.n();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i) {
        g(i);
        return this.f3930b[i];
    }

    public final void e(int i) {
        b();
        int i3 = this.l;
        int length = this.f3930b.length;
        if (i3 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f3930b, 0, iArr, 0, this.l);
            this.f3930b = iArr;
        }
        int[] iArr2 = this.f3930b;
        int i8 = this.l;
        this.l = i8 + 1;
        iArr2[i8] = i;
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return super.equals(obj);
        }
        p5 p5Var = (p5) obj;
        if (this.l != p5Var.l) {
            return false;
        }
        int[] iArr = p5Var.f3930b;
        for (int i = 0; i < this.l; i++) {
            if (this.f3930b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        if (i >= 0 && i < this.l) {
            return;
        }
        b.d.n(x4.a(this.l, i, (byte) 13, "Index:", ", Size:"));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        g(i);
        return Integer.valueOf(this.f3930b[i]);
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i3 = 0; i3 < this.l; i3++) {
            i = (i * 31) + this.f3930b[i3];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.l;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f3930b[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        g(i);
        int[] iArr = this.f3930b;
        int i3 = iArr[i];
        if (i < this.l - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.l--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        b();
        if (i3 >= i) {
            int[] iArr = this.f3930b;
            System.arraycopy(iArr, i3, iArr, i, this.l - i3);
            this.l -= i3 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        b.d.n("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        g(i);
        int[] iArr = this.f3930b;
        int i3 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
