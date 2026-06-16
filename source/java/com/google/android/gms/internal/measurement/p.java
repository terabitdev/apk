package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class p implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3925a;

    /* renamed from: b, reason: collision with root package name */
    public int f3926b = 0;
    public final /* synthetic */ Object l;

    public /* synthetic */ p(Object obj, int i) {
        this.f3925a = i;
        this.l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3925a) {
            case 0:
                if (this.f3926b < ((q) this.l).f3939a.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f3926b < ((q) this.l).f3939a.length()) {
                    return true;
                }
                return false;
            default:
                if (this.f3926b < ((d) this.l).o()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f3925a) {
            case 0:
                String str = ((q) this.l).f3939a;
                int i = this.f3926b;
                if (i < str.length()) {
                    this.f3926b = i + 1;
                    return new q(String.valueOf(i));
                }
                o2.a.g();
                return null;
            case 1:
                q qVar = (q) this.l;
                String str2 = qVar.f3939a;
                int i3 = this.f3926b;
                if (i3 < str2.length()) {
                    this.f3926b = i3 + 1;
                    return new q(String.valueOf(qVar.f3939a.charAt(i3)));
                }
                o2.a.g();
                return null;
            default:
                d dVar = (d) this.l;
                int i8 = this.f3926b;
                int o = dVar.o();
                int i10 = this.f3926b;
                if (i8 < o) {
                    this.f3926b = i10 + 1;
                    return dVar.p(i10);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i10);
                throw new NoSuchElementException(sb.toString());
        }
    }
}
