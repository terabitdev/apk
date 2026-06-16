package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ZoomableBoxKt {
    public static final ComposableSingletons$ZoomableBoxKt INSTANCE = new ComposableSingletons$ZoomableBoxKt();

    /* renamed from: lambda$-1863724568 */
    private static ho.q f670lambda$1863724568 = new c3.j(new c0(13), false, -1863724568);

    public static final sn.z lambda__1863724568$lambda$0(ZoomableBoxScope zoomableBoxScope, u2.m mVar, int i10) {
        boolean z6;
        boolean h10;
        int i11;
        zoomableBoxScope.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((u2.q) mVar).f(zoomableBoxScope);
            } else {
                h10 = ((u2.q) mVar).h(zoomableBoxScope);
            }
            if (h10) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t t10 = p3.h0.t(r1.p2.d(qVar2, 1.0f), zoomableBoxScope.getScale(), zoomableBoxScope.getScale(), t2.u.P, Float.intBitsToFloat((int) (zoomableBoxScope.mo1886getOffsetF1C5BW0() >> 32)), Float.intBitsToFloat((int) (zoomableBoxScope.mo1886getOffsetF1C5BW0() & 4294967295L)), zoomableBoxScope.getRotation(), null, 524004);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(t10, qVar);
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
            r1.p.a(l1.n.h(r1.p2.o(qVar2, 100), defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar, 6), p3.h0.f26395b), qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1863724568$ui_release */
    public final ho.q m1826getLambda$1863724568$ui_release() {
        return f670lambda$1863724568;
    }
}
