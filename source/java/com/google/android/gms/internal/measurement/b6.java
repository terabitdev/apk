package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b6 extends v4 implements RandomAccess, s5, m6 {
    public static final long[] m;

    /* renamed from: n, reason: collision with root package name */
    public static final b6 f3715n;

    /* renamed from: b, reason: collision with root package name */
    public long[] f3716b;
    public int l;

    static {
        long[] jArr = new long[0];
        m = jArr;
        f3715n = new b6(jArr, 0, false);
    }

    public b6(long[] jArr, int i, boolean z10) {
        super(z10);
        this.f3716b = jArr;
        this.l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        b();
        if (i >= 0 && i <= (i3 = this.l)) {
            int i8 = i + 1;
            long[] jArr = this.f3716b;
            int length = jArr.length;
            if (i3 < length) {
                System.arraycopy(jArr, i, jArr, i8, i3 - i);
            } else {
                long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
                System.arraycopy(this.f3716b, 0, jArr2, 0, i);
                System.arraycopy(this.f3716b, i, jArr2, i8, this.l - i);
                this.f3716b = jArr2;
            }
            this.f3716b[i] = longValue;
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
        if (!(collection instanceof b6)) {
            return super.addAll(collection);
        }
        b6 b6Var = (b6) collection;
        int i = b6Var.l;
        if (i == 0) {
            return false;
        }
        int i3 = this.l;
        if (Integer.MAX_VALUE - i3 >= i) {
            int i8 = i3 + i;
            long[] jArr = this.f3716b;
            if (i8 > jArr.length) {
                this.f3716b = Arrays.copyOf(jArr, i8);
            }
            System.arraycopy(b6Var.f3716b, 0, this.f3716b, this.l, b6Var.l);
            this.l = i8;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long c(int i) {
        g(i);
        return this.f3716b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.t5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final b6 k(int i) {
        long[] copyOf;
        if (i >= this.l) {
            if (i == 0) {
                copyOf = m;
            } else {
                copyOf = Arrays.copyOf(this.f3716b, i);
            }
            return new b6(copyOf, this.l, true);
        }
        f2.i.n();
        return null;
    }

    public final void e(long j) {
        b();
        int i = this.l;
        int length = this.f3716b.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f3716b, 0, jArr, 0, this.l);
            this.f3716b = jArr;
        }
        long[] jArr2 = this.f3716b;
        int i3 = this.l;
        this.l = i3 + 1;
        jArr2[i3] = j;
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return super.equals(obj);
        }
        b6 b6Var = (b6) obj;
        if (this.l != b6Var.l) {
            return false;
        }
        long[] jArr = b6Var.f3716b;
        for (int i = 0; i < this.l; i++) {
            if (this.f3716b[i] != jArr[i]) {
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
        return Long.valueOf(this.f3716b[i]);
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i3 = 0; i3 < this.l; i3++) {
            long j = this.f3716b[i3];
            Charset charset = u5.f3981a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.l;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f3716b[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.v4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        g(i);
        long[] jArr = this.f3716b;
        long j = jArr[i];
        if (i < this.l - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.l--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        b();
        if (i3 >= i) {
            long[] jArr = this.f3716b;
            System.arraycopy(jArr, i3, jArr, i, this.l - i3);
            this.l -= i3 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        b.d.n("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        g(i);
        long[] jArr = this.f3716b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
