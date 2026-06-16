package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class s6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f3955a;

    /* renamed from: b, reason: collision with root package name */
    public int f3956b;
    public Map l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public volatile com.google.gson.internal.j f3957n;
    public Map o;

    public s6() {
        Map map = Collections.EMPTY_MAP;
        this.l = map;
        this.o = map;
    }

    public final t6 a(int i) {
        if (i < this.f3956b) {
            return (t6) this.f3955a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set c() {
        Set entrySet;
        if (this.l.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.l.entrySet();
        }
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f3956b != 0) {
            this.f3955a = null;
            this.f3956b = 0;
        }
        if (!this.l.isEmpty()) {
            this.l.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (f(comparable) < 0 && !this.l.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int f7 = f(comparable);
        if (f7 >= 0) {
            return ((t6) this.f3955a[f7]).setValue(obj);
        }
        g();
        if (this.f3955a == null) {
            this.f3955a = new Object[16];
        }
        int i = -(f7 + 1);
        if (i >= 16) {
            return h().put(comparable, obj);
        }
        if (this.f3956b == 16) {
            t6 t6Var = (t6) this.f3955a[15];
            this.f3956b = 15;
            h().put(t6Var.f3973a, t6Var.f3974b);
        }
        Object[] objArr = this.f3955a;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f3955a[i] = new t6(this, comparable, obj);
        this.f3956b++;
        return null;
    }

    public final Object e(int i) {
        g();
        Object[] objArr = this.f3955a;
        Object obj = ((t6) objArr[i]).f3974b;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f3956b - i) - 1);
        this.f3956b--;
        if (!this.l.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            Object[] objArr2 = this.f3955a;
            int i3 = this.f3956b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i3] = new t6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f3956b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f3957n == null) {
            this.f3957n = new com.google.gson.internal.j(this, 2);
        }
        return this.f3957n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof s6)) {
                return super.equals(obj);
            }
            s6 s6Var = (s6) obj;
            int size = size();
            if (size == s6Var.size()) {
                int i = this.f3956b;
                if (i == s6Var.f3956b) {
                    for (int i3 = 0; i3 < i; i3++) {
                        if (a(i3).equals(s6Var.a(i3))) {
                        }
                    }
                    if (i != size) {
                        return this.l.equals(s6Var.l);
                    }
                    return true;
                }
                return entrySet().equals(s6Var.entrySet());
            }
            return false;
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i = this.f3956b;
        int i3 = i - 1;
        int i8 = 0;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((t6) this.f3955a[i3]).f3973a);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        while (i8 <= i3) {
            int i10 = (i8 + i3) / 2;
            int compareTo2 = comparable.compareTo(((t6) this.f3955a[i10]).f3973a);
            if (compareTo2 < 0) {
                i3 = i10 - 1;
            } else if (compareTo2 > 0) {
                i8 = i10 + 1;
            } else {
                return i10;
            }
        }
        return -(i8 + 1);
    }

    public final void g() {
        if (!this.m) {
            return;
        }
        androidx.compose.ui.graphics.f.i();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f7 = f(comparable);
        if (f7 >= 0) {
            return ((t6) this.f3955a[f7]).f3974b;
        }
        return this.l.get(comparable);
    }

    public final SortedMap h() {
        g();
        if (this.l.isEmpty() && !(this.l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.l = treeMap;
            this.o = treeMap.descendingMap();
        }
        return (SortedMap) this.l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f3956b;
        int i3 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            i3 += this.f3955a[i8].hashCode();
        }
        if (this.l.size() > 0) {
            return this.l.hashCode() + i3;
        }
        return i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f7 = f(comparable);
        if (f7 >= 0) {
            return e(f7);
        }
        if (this.l.isEmpty()) {
            return null;
        }
        return this.l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.l.size() + this.f3956b;
    }
}
