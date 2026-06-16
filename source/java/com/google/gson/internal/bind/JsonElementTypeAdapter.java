package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.j;
import com.google.gson.internal.k;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import o4.b1;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class JsonElementTypeAdapter extends i {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonElementTypeAdapter f4260a = new JsonElementTypeAdapter();

    private JsonElementTypeAdapter() {
    }

    public static com.google.gson.d d(int i, w3.a aVar) {
        int c10 = c.i.c(i);
        if (c10 != 5) {
            if (c10 != 6) {
                if (c10 != 7) {
                    if (c10 == 8) {
                        aVar.D();
                        return f.f4229a;
                    }
                    b.d.j("Unexpected token: ".concat(b1.o(i)));
                    return null;
                }
                return new h(Boolean.valueOf(aVar.x()));
            }
            return new h(new com.google.gson.internal.h(aVar.F()));
        }
        return new h(aVar.F());
    }

    public static void e(w3.b bVar, com.google.gson.d dVar) {
        boolean parseBoolean;
        if (dVar != null && !(dVar instanceof f)) {
            boolean z10 = dVar instanceof h;
            if (z10) {
                if (z10) {
                    h hVar = (h) dVar;
                    Serializable serializable = hVar.f4231a;
                    if (serializable instanceof Number) {
                        bVar.B(hVar.c());
                        return;
                    }
                    if (serializable instanceof Boolean) {
                        if (serializable instanceof Boolean) {
                            parseBoolean = ((Boolean) serializable).booleanValue();
                        } else {
                            parseBoolean = Boolean.parseBoolean(hVar.d());
                        }
                        bVar.D(parseBoolean);
                        return;
                    }
                    bVar.C(hVar.d());
                    return;
                }
                f2.i.q(dVar, "Not a JSON Primitive: ");
                return;
            }
            boolean z11 = dVar instanceof com.google.gson.c;
            if (z11) {
                bVar.d();
                if (z11) {
                    ArrayList arrayList = ((com.google.gson.c) dVar).f4228a;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        e(bVar, (com.google.gson.d) obj);
                    }
                    bVar.g();
                    return;
                }
                f2.i.q(dVar, "Not a JSON Array: ");
                return;
            }
            boolean z12 = dVar instanceof g;
            if (z12) {
                bVar.e();
                if (z12) {
                    Iterator it = ((j) ((g) dVar).f4230a.entrySet()).iterator();
                    while (((com.google.gson.internal.i) it).hasNext()) {
                        k b10 = ((com.google.gson.internal.i) it).b();
                        bVar.k((String) b10.getKey());
                        e(bVar, (com.google.gson.d) b10.getValue());
                    }
                    bVar.h();
                    return;
                }
                f2.i.q(dVar, "Not a JSON Object: ");
                return;
            }
            androidx.privacysandbox.ads.adservices.customaudience.a.t(dVar.getClass(), "Couldn't write ");
            return;
        }
        bVar.q();
    }

    @Override // com.google.gson.i
    public final Object b(w3.a aVar) {
        com.google.gson.d cVar;
        String str;
        com.google.gson.d cVar2;
        boolean z10;
        int H = aVar.H();
        int c10 = c.i.c(H);
        if (c10 != 0) {
            if (c10 != 2) {
                cVar = null;
            } else {
                aVar.d();
                cVar = new g();
            }
        } else {
            aVar.b();
            cVar = new com.google.gson.c();
        }
        if (cVar == null) {
            return d(H, aVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.q()) {
                if (cVar instanceof g) {
                    str = aVar.B();
                } else {
                    str = null;
                }
                int H2 = aVar.H();
                int c11 = c.i.c(H2);
                if (c11 != 0) {
                    if (c11 != 2) {
                        cVar2 = null;
                    } else {
                        aVar.d();
                        cVar2 = new g();
                    }
                } else {
                    aVar.b();
                    cVar2 = new com.google.gson.c();
                }
                if (cVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (cVar2 == null) {
                    cVar2 = d(H2, aVar);
                }
                if (cVar instanceof com.google.gson.c) {
                    ((com.google.gson.c) cVar).f4228a.add(cVar2);
                } else {
                    ((g) cVar).f4230a.put(str, cVar2);
                }
                if (z10) {
                    arrayDeque.addLast(cVar);
                    cVar = cVar2;
                }
            } else {
                if (cVar instanceof com.google.gson.c) {
                    aVar.g();
                } else {
                    aVar.h();
                }
                if (arrayDeque.isEmpty()) {
                    return cVar;
                }
                cVar = (com.google.gson.d) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.i
    public final /* bridge */ /* synthetic */ void c(w3.b bVar, Object obj) {
        e(bVar, (com.google.gson.d) obj);
    }
}
