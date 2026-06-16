package com.google.gson.internal.bind;

import com.google.android.gms.internal.measurement.i6;
import com.google.gson.i;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o4.b1;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class ObjectTypeAdapter extends i {

    /* renamed from: c, reason: collision with root package name */
    public static final j f4268c = new AnonymousClass1(1);

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.b f4269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4270b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4271a;

        public AnonymousClass1(int i) {
            this.f4271a = i;
        }

        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            if (typeToken.f4354a == Object.class) {
                return new ObjectTypeAdapter(bVar, this.f4271a);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(com.google.gson.b bVar, int i) {
        this.f4269a = bVar;
        this.f4270b = i;
    }

    public static j d(int i) {
        if (i == 1) {
            return f4268c;
        }
        return new AnonymousClass1(i);
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        Object arrayList;
        String str;
        Serializable arrayList2;
        boolean z10;
        int H = aVar.H();
        int c10 = c.i.c(H);
        if (c10 != 0) {
            if (c10 != 2) {
                arrayList = null;
            } else {
                aVar.d();
                arrayList = new l(true);
            }
        } else {
            aVar.b();
            arrayList = new ArrayList();
        }
        if (arrayList == null) {
            return e(H, aVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.q()) {
                if (arrayList instanceof Map) {
                    str = aVar.B();
                } else {
                    str = null;
                }
                int H2 = aVar.H();
                int c11 = c.i.c(H2);
                if (c11 != 0) {
                    if (c11 != 2) {
                        arrayList2 = null;
                    } else {
                        aVar.d();
                        arrayList2 = new l(true);
                    }
                } else {
                    aVar.b();
                    arrayList2 = new ArrayList();
                }
                if (arrayList2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (arrayList2 == null) {
                    arrayList2 = e(H2, aVar);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(str, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.g();
                } else {
                    aVar.h();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.i
    public final void c(w3.b bVar, Object obj) {
        if (obj == null) {
            bVar.q();
            return;
        }
        Class<?> cls = obj.getClass();
        com.google.gson.b bVar2 = this.f4269a;
        bVar2.getClass();
        i c10 = bVar2.c(new TypeToken(cls));
        if (c10 instanceof ObjectTypeAdapter) {
            bVar.e();
            bVar.h();
        } else {
            c10.c(bVar, obj);
        }
    }

    public final Serializable e(int i, w3.a aVar) {
        int c10 = c.i.c(i);
        if (c10 != 5) {
            if (c10 != 6) {
                if (c10 != 7) {
                    if (c10 == 8) {
                        aVar.D();
                        return null;
                    }
                    b.d.j("Unexpected token: ".concat(b1.o(i)));
                    return null;
                }
                return Boolean.valueOf(aVar.x());
            }
            return i6.b(this.f4270b, aVar);
        }
        return aVar.F();
    }
}
