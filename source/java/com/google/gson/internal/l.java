package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class l extends AbstractMap implements Serializable {
    public static final b6.k r = new b6.k(2);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4332b;
    public k l;
    public final k o;
    public j p;
    public j q;
    public int m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4333n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f4331a = r;

    public l(boolean z10) {
        this.f4332b = z10;
        this.o = new k(z10);
    }

    public final k a(Object obj, boolean z10) {
        int i;
        k kVar;
        Comparable comparable;
        k kVar2;
        k kVar3 = this.l;
        b6.k kVar4 = r;
        Comparator comparator = this.f4331a;
        if (kVar3 != null) {
            if (comparator == kVar4) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = kVar3.o;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = comparator.compare(obj, obj2);
                }
                if (i == 0) {
                    return kVar3;
                }
                if (i < 0) {
                    kVar2 = kVar3.f4329b;
                } else {
                    kVar2 = kVar3.l;
                }
                if (kVar2 == null) {
                    break;
                }
                kVar3 = kVar2;
            }
        } else {
            i = 0;
        }
        k kVar5 = kVar3;
        if (!z10) {
            return null;
        }
        k kVar6 = this.o;
        if (kVar5 == null) {
            if (comparator == kVar4 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f4332b, kVar5, obj, kVar6, kVar6.f4330n);
            this.l = kVar;
        } else {
            kVar = new k(this.f4332b, kVar5, obj, kVar6, kVar6.f4330n);
            if (i < 0) {
                kVar5.f4329b = kVar;
            } else {
                kVar5.l = kVar;
            }
            c(kVar5, true);
        }
        this.m++;
        this.f4333n++;
        return kVar;
    }

    public final void c(k kVar, boolean z10) {
        int i;
        int i3;
        int i8;
        int i10;
        while (kVar != null) {
            k kVar2 = kVar.f4329b;
            k kVar3 = kVar.l;
            int i11 = 0;
            if (kVar2 != null) {
                i = kVar2.r;
            } else {
                i = 0;
            }
            if (kVar3 != null) {
                i3 = kVar3.r;
            } else {
                i3 = 0;
            }
            int i12 = i - i3;
            if (i12 == -2) {
                k kVar4 = kVar3.f4329b;
                k kVar5 = kVar3.l;
                if (kVar5 != null) {
                    i10 = kVar5.r;
                } else {
                    i10 = 0;
                }
                if (kVar4 != null) {
                    i11 = kVar4.r;
                }
                int i13 = i11 - i10;
                if (i13 != -1 && (i13 != 0 || z10)) {
                    g(kVar3);
                    f(kVar);
                } else {
                    f(kVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                k kVar6 = kVar2.f4329b;
                k kVar7 = kVar2.l;
                if (kVar7 != null) {
                    i8 = kVar7.r;
                } else {
                    i8 = 0;
                }
                if (kVar6 != null) {
                    i11 = kVar6.r;
                }
                int i14 = i11 - i8;
                if (i14 != 1 && (i14 != 0 || z10)) {
                    f(kVar2);
                    g(kVar);
                } else {
                    g(kVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                kVar.r = i + 1;
                if (z10) {
                    return;
                }
            } else {
                kVar.r = Math.max(i, i3) + 1;
                if (!z10) {
                    return;
                }
            }
            kVar = kVar.f4328a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.l = null;
        this.m = 0;
        this.f4333n++;
        k kVar = this.o;
        kVar.f4330n = kVar;
        kVar.m = kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        k kVar = null;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (kVar == null) {
            return false;
        }
        return true;
    }

    public final void d(k kVar, boolean z10) {
        k kVar2;
        k kVar3;
        int i;
        if (z10) {
            k kVar4 = kVar.f4330n;
            kVar4.m = kVar.m;
            kVar.m.f4330n = kVar4;
        }
        k kVar5 = kVar.f4329b;
        k kVar6 = kVar.l;
        k kVar7 = kVar.f4328a;
        int i3 = 0;
        if (kVar5 != null && kVar6 != null) {
            if (kVar5.r > kVar6.r) {
                k kVar8 = kVar5.l;
                while (true) {
                    k kVar9 = kVar8;
                    kVar3 = kVar5;
                    kVar5 = kVar9;
                    if (kVar5 == null) {
                        break;
                    } else {
                        kVar8 = kVar5.l;
                    }
                }
            } else {
                k kVar10 = kVar6.f4329b;
                while (true) {
                    kVar2 = kVar6;
                    kVar6 = kVar10;
                    if (kVar6 == null) {
                        break;
                    } else {
                        kVar10 = kVar6.f4329b;
                    }
                }
                kVar3 = kVar2;
            }
            d(kVar3, false);
            k kVar11 = kVar.f4329b;
            if (kVar11 != null) {
                i = kVar11.r;
                kVar3.f4329b = kVar11;
                kVar11.f4328a = kVar3;
                kVar.f4329b = null;
            } else {
                i = 0;
            }
            k kVar12 = kVar.l;
            if (kVar12 != null) {
                i3 = kVar12.r;
                kVar3.l = kVar12;
                kVar12.f4328a = kVar3;
                kVar.l = null;
            }
            kVar3.r = Math.max(i, i3) + 1;
            e(kVar, kVar3);
            return;
        }
        if (kVar5 != null) {
            e(kVar, kVar5);
            kVar.f4329b = null;
        } else if (kVar6 != null) {
            e(kVar, kVar6);
            kVar.l = null;
        } else {
            e(kVar, null);
        }
        c(kVar7, false);
        this.m--;
        this.f4333n++;
    }

    public final void e(k kVar, k kVar2) {
        k kVar3 = kVar.f4328a;
        kVar.f4328a = null;
        if (kVar2 != null) {
            kVar2.f4328a = kVar3;
        }
        if (kVar3 != null) {
            if (kVar3.f4329b == kVar) {
                kVar3.f4329b = kVar2;
                return;
            } else {
                kVar3.l = kVar2;
                return;
            }
        }
        this.l = kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.p;
        if (jVar == null) {
            j jVar2 = new j(this, 0);
            this.p = jVar2;
            return jVar2;
        }
        return jVar;
    }

    public final void f(k kVar) {
        int i;
        int i3;
        k kVar2 = kVar.f4329b;
        k kVar3 = kVar.l;
        k kVar4 = kVar3.f4329b;
        k kVar5 = kVar3.l;
        kVar.l = kVar4;
        if (kVar4 != null) {
            kVar4.f4328a = kVar;
        }
        e(kVar, kVar3);
        kVar3.f4329b = kVar;
        kVar.f4328a = kVar3;
        int i8 = 0;
        if (kVar2 != null) {
            i = kVar2.r;
        } else {
            i = 0;
        }
        if (kVar4 != null) {
            i3 = kVar4.r;
        } else {
            i3 = 0;
        }
        int max = Math.max(i, i3) + 1;
        kVar.r = max;
        if (kVar5 != null) {
            i8 = kVar5.r;
        }
        kVar3.r = Math.max(max, i8) + 1;
    }

    public final void g(k kVar) {
        int i;
        int i3;
        k kVar2 = kVar.f4329b;
        k kVar3 = kVar.l;
        k kVar4 = kVar2.f4329b;
        k kVar5 = kVar2.l;
        kVar.f4329b = kVar5;
        if (kVar5 != null) {
            kVar5.f4328a = kVar;
        }
        e(kVar, kVar2);
        kVar2.l = kVar;
        kVar.f4328a = kVar2;
        int i8 = 0;
        if (kVar3 != null) {
            i = kVar3.r;
        } else {
            i = 0;
        }
        if (kVar5 != null) {
            i3 = kVar5.r;
        } else {
            i3 = 0;
        }
        int max = Math.max(i, i3) + 1;
        kVar.r = max;
        if (kVar4 != null) {
            i8 = kVar4.r;
        }
        kVar2.r = Math.max(max, i8) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        k kVar;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (kVar != null) {
                return null;
            }
            return kVar.q;
        }
        kVar = null;
        if (kVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.q;
        if (jVar == null) {
            j jVar2 = new j(this, 1);
            this.q = jVar2;
            return jVar2;
        }
        return jVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f4332b) {
                o2.a.h("value == null");
                return null;
            }
            k a10 = a(obj, true);
            Object obj3 = a10.q;
            a10.q = obj2;
            return obj3;
        }
        o2.a.h("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        k kVar;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (kVar != null) {
                d(kVar, true);
            }
            if (kVar != null) {
                return null;
            }
            return kVar.q;
        }
        kVar = null;
        if (kVar != null) {
        }
        if (kVar != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.m;
    }
}
