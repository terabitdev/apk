package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ReorderableRowKt {
    public static final ComposableSingletons$ReorderableRowKt INSTANCE = new ComposableSingletons$ReorderableRowKt();
    private static ho.r lambda$821822278 = new c3.j(new i0(1), false, 821822278);

    public static final sn.z lambda_821822278$lambda$0(t1.b bVar, String str, u2.m mVar, int i10) {
        String str2;
        int i11;
        boolean z6;
        int i12;
        bVar.getClass();
        str.getClass();
        if ((i10 & 48) == 0) {
            str2 = str;
            if (((u2.q) mVar).f(str2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 = i10 | i12;
        } else {
            str2 = str;
            i11 = i10;
        }
        if ((i11 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.t o6 = r1.p2.o(i3.q.f13017a, 50);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(o6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            j7.d(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, qVar, (i11 >> 3) & 14, 0, 262142);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.r getLambda$821822278$ui_release() {
        return lambda$821822278;
    }
}
