package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o4.bd;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class l4 extends h {
    public final /* synthetic */ int l = 0;
    public final Object m;

    public l4(bd bdVar) {
        super("internal.logger");
        this.m = bdVar;
        this.f3792b.put("log", new d9(this, false, true));
        this.f3792b.put(NotificationCompat.GROUP_KEY_SILENT, new a6(NotificationCompat.GROUP_KEY_SILENT, 1));
        ((h) this.f3792b.get(NotificationCompat.GROUP_KEY_SILENT)).d("log", new d9(this, true, true));
        this.f3792b.put("unmonitored", new a6("unmonitored", 2));
        ((h) this.f3792b.get("unmonitored")).d("log", new d9(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n a(k3.t tVar, List list) {
        HashMap hashMap;
        Object obj;
        String str;
        int i;
        TreeMap treeMap;
        switch (this.l) {
            case 0:
                f1.g.X(3, this.f3791a, list);
                String f7 = ((t) tVar.l).c(tVar, (n) list.get(0)).f();
                n nVar = (n) list.get(1);
                t tVar2 = (t) tVar.l;
                long e02 = (long) f1.g.e0(tVar2.c(tVar, nVar).h().doubleValue());
                n c10 = tVar2.c(tVar, (n) list.get(2));
                if (c10 instanceof k) {
                    hashMap = f1.g.g0((k) c10);
                } else {
                    hashMap = new HashMap();
                }
                a3.i iVar = (a3.i) this.m;
                iVar.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str2 : hashMap.keySet()) {
                    HashMap hashMap3 = ((b) iVar.f69b).f3711c;
                    if (hashMap3.containsKey(str2)) {
                        obj = hashMap3.get(str2);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str2, b.b(obj, str2, hashMap.get(str2)));
                }
                ((ArrayList) iVar.m).add(new b(f7, e02, hashMap2));
                return n.f3896c;
            case 1:
                f1.g.X(2, "getValue", list);
                n c11 = ((t) tVar.l).c(tVar, (n) list.get(0));
                n c12 = ((t) tVar.l).c(tVar, (n) list.get(1));
                String f10 = c11.f();
                o4.a0 a0Var = (o4.a0) this.m;
                Map map = (Map) ((q1.l1) a0Var.l).m.get((String) a0Var.f8504b);
                if (map != null && map.containsKey(f10)) {
                    str = (String) map.get(f10);
                } else {
                    str = null;
                }
                if (str != null) {
                    return new q(str);
                }
                return c12;
            case 2:
                return n.f3896c;
            case 3:
                try {
                    return n2.t1.Q(((q1.j1) this.m).call());
                } catch (Exception unused) {
                    return n.f3896c;
                }
            default:
                f1.g.X(3, this.f3791a, list);
                ((t) tVar.l).c(tVar, (n) list.get(0)).f();
                n nVar2 = (n) list.get(1);
                t tVar3 = (t) tVar.l;
                n c13 = tVar3.c(tVar, nVar2);
                if (c13 instanceof m) {
                    n c14 = tVar3.c(tVar, (n) list.get(2));
                    if (c14 instanceof k) {
                        k kVar = (k) c14;
                        HashMap hashMap4 = kVar.f3833a;
                        if (hashMap4.containsKey(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                            String f11 = kVar.c(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY).f();
                            if (hashMap4.containsKey("priority")) {
                                i = f1.g.d0(kVar.c("priority").h().doubleValue());
                            } else {
                                i = 1000;
                            }
                            t tVar4 = (t) this.m;
                            m mVar = (m) c13;
                            tVar4.getClass();
                            if ("create".equals(f11)) {
                                treeMap = (TreeMap) tVar4.f3961b;
                            } else if ("edit".equals(f11)) {
                                treeMap = (TreeMap) tVar4.f3960a;
                            } else {
                                b.d.j("Unknown callback type: ".concat(String.valueOf(f11)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i))) {
                                i = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i), mVar);
                            return n.f3896c;
                        }
                        f2.i.k("Undefined rule type");
                    } else {
                        f2.i.k("Invalid callback params");
                    }
                } else {
                    f2.i.k("Invalid callback type");
                }
                return null;
        }
    }

    public l4(t tVar) {
        super("internal.registerCallback");
        this.m = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(a6 a6Var, o4.a0 a0Var) {
        super("getValue");
        this.m = a0Var;
    }

    public l4(a3.i iVar) {
        super("internal.eventLogger");
        this.m = iVar;
    }

    public l4(q1.j1 j1Var) {
        super("internal.appMetadata");
        this.m = j1Var;
    }
}
