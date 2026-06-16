package com.google.gson.internal;

import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.u6;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class j extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f4327b;

    public /* synthetic */ j(AbstractMap abstractMap, int i) {
        this.f4326a = i;
        this.f4327b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f4326a) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((s6) this.f4327b).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4326a) {
            case 0:
                ((l) this.f4327b).clear();
                return;
            case 1:
                ((l) this.f4327b).clear();
                return;
            default:
                ((s6) this.f4327b).clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        k a10;
        switch (this.f4326a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                l lVar = (l) this.f4327b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        a10 = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a10 != null && Objects.equals(a10.q, entry.getValue())) {
                        kVar = a10;
                    }
                    if (kVar != null) {
                        return false;
                    }
                    return true;
                }
                a10 = null;
                if (a10 != null) {
                    kVar = a10;
                }
                if (kVar != null) {
                }
            case 1:
                return ((l) this.f4327b).containsKey(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((s6) this.f4327b).get(entry2.getKey());
                Object value = entry2.getValue();
                if (obj2 == value) {
                    return true;
                }
                if (obj2 != null && obj2.equals(value)) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4326a) {
            case 0:
                return new i((l) this.f4327b, 0);
            case 1:
                return new i((l) this.f4327b, 1);
            default:
                return new u6((s6) this.f4327b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        k a10;
        switch (this.f4326a) {
            case 0:
                l lVar = (l) this.f4327b;
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        a10 = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a10 != null && Objects.equals(a10.q, entry.getValue())) {
                        kVar = a10;
                    }
                    if (kVar != null) {
                        return false;
                    }
                    lVar.d(kVar, true);
                    return true;
                }
                a10 = null;
                if (a10 != null) {
                    kVar = a10;
                }
                if (kVar != null) {
                }
            case 1:
                l lVar2 = (l) this.f4327b;
                k kVar2 = null;
                if (obj != null) {
                    try {
                        kVar2 = lVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (kVar2 != null) {
                    lVar2.d(kVar2, true);
                }
                if (kVar2 == null) {
                    return false;
                }
                return true;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((s6) this.f4327b).remove(entry2.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4326a) {
            case 0:
                return ((l) this.f4327b).m;
            case 1:
                return ((l) this.f4327b).m;
            default:
                return ((s6) this.f4327b).size();
        }
    }
}
