package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class z4 extends k {

    /* renamed from: b, reason: collision with root package name */
    public final a3.i f4061b;

    public z4(a3.i iVar) {
        this.f4061b = iVar;
    }

    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n g(String str, k3.t tVar, ArrayList arrayList) {
        Object obj;
        int hashCode = str.hashCode();
        a3.i iVar = this.f4061b;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    f1.g.X(0, "getEventName", arrayList);
                    return new q(((b) iVar.l).f3709a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    f1.g.X(0, "getTimestamp", arrayList);
                    return new g(Double.valueOf(((b) iVar.l).f3710b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    f1.g.X(1, "getParamValue", arrayList);
                    String f7 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).f();
                    HashMap hashMap = ((b) iVar.l).f3711c;
                    if (hashMap.containsKey(f7)) {
                        obj = hashMap.get(f7);
                    } else {
                        obj = null;
                    }
                    return n2.t1.Q(obj);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    f1.g.X(0, "getParams", arrayList);
                    HashMap hashMap2 = ((b) iVar.l).f3711c;
                    k kVar = new k();
                    for (String str2 : hashMap2.keySet()) {
                        kVar.d(str2, n2.t1.Q(hashMap2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    f1.g.X(2, "setParamValue", arrayList);
                    String f10 = ((t) tVar.l).c(tVar, (n) arrayList.get(0)).f();
                    n c10 = ((t) tVar.l).c(tVar, (n) arrayList.get(1));
                    b bVar = (b) iVar.l;
                    Object f02 = f1.g.f0(c10);
                    HashMap hashMap3 = bVar.f3711c;
                    if (f02 == null) {
                        hashMap3.remove(f10);
                        return c10;
                    }
                    hashMap3.put(f10, b.b(hashMap3.get(f10), f10, f02));
                    return c10;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    f1.g.X(1, "setEventName", arrayList);
                    n c11 = ((t) tVar.l).c(tVar, (n) arrayList.get(0));
                    if (!n.f3896c.equals(c11) && !n.f3897d.equals(c11)) {
                        ((b) iVar.l).f3709a = c11.f();
                        return new q(c11.f());
                    }
                    f2.i.k("Illegal event name");
                    return null;
                }
                break;
        }
        return super.g(str, tVar, arrayList);
    }
}
