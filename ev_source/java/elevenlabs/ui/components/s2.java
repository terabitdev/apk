package io.elevenlabs.ui.components;

import io.elevenlabs.ui.components.headers.HeaderKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17624b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17625c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17626d;

    public /* synthetic */ s2(Object obj, Object obj2, Object obj3, int i10) {
        this.f17623a = i10;
        this.f17624b = obj;
        this.f17625c = obj2;
        this.f17626d = obj3;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$0;
        sn.z EchoHeader$lambda$0;
        boolean z6;
        int i10;
        Boolean bool;
        Object x2Var;
        Object obj4;
        boolean z10;
        Object obj5;
        int i11;
        boolean z11;
        int i12;
        switch (this.f17623a) {
            case 0:
                Preview_SwipeToActionBox_EndSideOpen$lambda$0 = SwipeToActionBoxKt.Preview_SwipeToActionBox_EndSideOpen$lambda$0((ActionConfig) this.f17624b, (ActionConfig) this.f17625c, (ActionConfig) this.f17626d, (ActionSpecBuilder) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return Preview_SwipeToActionBox_EndSideOpen$lambda$0;
            case 1:
                EchoHeader$lambda$0 = HeaderKt.EchoHeader$lambda$0((i3.t) this.f17624b, (String) this.f17625c, (s4.y0) this.f17626d, (r1.l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return EchoHeader$lambda$0;
            case 2:
                ArrayList arrayList = (ArrayList) this.f17624b;
                Object obj6 = (m2.f0) this.f17625c;
                String str = (String) this.f17626d;
                ho.p pVar = (ho.p) obj;
                u2.m mVar = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((u2.q) mVar).h(pVar)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    intValue |= i11;
                }
                if ((intValue & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(intValue & 1, z6)) {
                    if (j5.a.a(arrayList).size() != 1) {
                        i10 = 75;
                    } else {
                        i10 = 0;
                    }
                    j1.a2 a2Var = new j1.a2(150, i10, j1.y.f18447d);
                    boolean h10 = qVar.h(null) | qVar.h(obj6);
                    Object L = qVar.L();
                    Object obj7 = u2.l.f33918a;
                    if (h10 || L == obj7) {
                        L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.g(obj6, 14);
                        qVar.h0(L);
                    }
                    ho.a aVar = (ho.a) L;
                    Object L2 = qVar.L();
                    if (L2 == obj7) {
                        L2 = j1.e.a(t2.u.P);
                        qVar.h0(L2);
                    }
                    j1.d dVar = (j1.d) L2;
                    boolean h11 = qVar.h(dVar) | qVar.g(true) | qVar.h(a2Var) | qVar.f(aVar);
                    Object L3 = qVar.L();
                    if (h11 || L3 == obj7) {
                        bool = true;
                        obj4 = obj7;
                        z10 = true;
                        x2Var = new a2.x2(dVar, z10, a2Var, aVar, null, 3);
                        qVar.h0(x2Var);
                    } else {
                        x2Var = L3;
                        bool = true;
                        obj4 = obj7;
                        z10 = true;
                    }
                    u2.r.f((ho.p) x2Var, bool, qVar);
                    j1.l lVar = dVar.f18189c;
                    Object a2Var2 = new j1.a2(150, i10, j1.y.f18444a);
                    Object L4 = qVar.L();
                    if (L4 == obj4) {
                        L4 = j1.e.a(0.8f);
                        qVar.h0(L4);
                    }
                    j1.d dVar2 = (j1.d) L4;
                    Boolean valueOf = Boolean.valueOf(z10);
                    boolean h12 = qVar.h(dVar2) | qVar.g(z10) | qVar.h(a2Var2);
                    Object L5 = qVar.L();
                    if (!h12 && L5 != obj4) {
                        obj5 = null;
                    } else {
                        Object i0Var = new androidx.room.i0(1, dVar2, a2Var2, null, z10);
                        obj5 = null;
                        qVar.h0(i0Var);
                        L5 = i0Var;
                    }
                    u2.r.f((ho.p) L5, valueOf, qVar);
                    j1.l lVar2 = dVar2.f18189c;
                    i3.t s10 = p3.h0.s(i3.q.f13017a, ((Number) lVar2.f18306b.getValue()).floatValue(), ((Number) lVar2.f18306b.getValue()).floatValue(), ((Number) lVar.f18306b.getValue()).floatValue(), t2.u.P, null, 131064);
                    boolean g10 = qVar.g(z10) | qVar.f(str) | qVar.h(obj5);
                    Object L6 = qVar.L();
                    if (g10 || L6 == obj4) {
                        L6 = new io.elevenlabs.readerapp.ui.screens.authenticated.agent.g(2, str, z10);
                        qVar.h0(L6);
                    }
                    i3.t c5 = p4.q.c(s10, false, (ho.l) L6);
                    f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c10 = i3.a.c(c5, qVar);
                    h4.h.f11920i.getClass();
                    ho.a aVar2 = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(aVar2);
                    } else {
                        qVar.k0();
                    }
                    u2.r.J(h4.g.f11907f, d10, qVar);
                    u2.r.J(h4.g.f11906e, l4, qVar);
                    h4.e eVar = h4.g.f11908g;
                    if (qVar.S || !kotlin.jvm.internal.m.c(qVar.L(), Integer.valueOf(hashCode))) {
                        j0.c.s(hashCode, qVar, hashCode, eVar);
                    }
                    u2.r.J(h4.g.f11905d, c10, qVar);
                    j0.c.q(intValue & 14, pVar, qVar, true);
                } else {
                    qVar.R();
                }
                return sn.z.f31622a;
            default:
                ho.a aVar3 = (ho.a) this.f17624b;
                ho.p pVar2 = (ho.p) this.f17625c;
                vk.i iVar = (vk.i) this.f17626d;
                h5.l lVar3 = (h5.l) obj;
                u2.m mVar2 = (u2.m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((u2.q) mVar2).e(lVar3.f12092a)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    intValue2 |= i12;
                }
                if ((intValue2 & 19) != 18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                u2.q qVar2 = (u2.q) mVar2;
                if (qVar2.O(intValue2 & 1, z11)) {
                    kd.a.d(lVar3.f12092a, new vk.j(aVar3.invoke()), iVar, new vk.j(pVar2.invoke(qVar2, 0)), qVar2, intValue2 & 14);
                } else {
                    qVar2.R();
                }
                return sn.z.f31622a;
        }
    }
}
