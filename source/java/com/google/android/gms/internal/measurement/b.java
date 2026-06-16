package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final x1.g f3708d = x1.g.i(3, "_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3711c;

    public b(String str, long j, HashMap hashMap) {
        this.f3709a = str;
        this.f3710b = j;
        HashMap hashMap2 = new HashMap();
        this.f3711c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, String str, Object obj2) {
        if (f3708d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f3709a, this.f3710b, new HashMap(this.f3711c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f3710b != bVar.f3710b || !this.f3709a.equals(bVar.f3709a)) {
                return false;
            }
            return this.f3711c.equals(bVar.f3711c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3709a.hashCode() * 31;
        long j = this.f3710b;
        return this.f3711c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f3709a;
        String obj = this.f3711c.toString();
        int length = String.valueOf(str).length();
        long j = this.f3710b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
