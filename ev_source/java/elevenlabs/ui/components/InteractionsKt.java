package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/t;", "Lp1/l;", "interactionSource", "", "compressScale", "normalScale", "bounceOnPress", "(Li3/t;Lp1/l;FF)Li3/t;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class InteractionsKt {
    public static final i3.t bounceOnPress(i3.t tVar, p1.l lVar, float f10, float f11) {
        tVar.getClass();
        lVar.getClass();
        return i3.a.a(new defpackage.c(f10, f11, 1, lVar), tVar);
    }

    public static /* synthetic */ i3.t bounceOnPress$default(i3.t tVar, p1.l lVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.965f;
        }
        if ((i10 & 4) != 0) {
            f11 = 1.0f;
        }
        return bounceOnPress(tVar, lVar, f10, f11);
    }

    public static final i3.t bounceOnPress$lambda$0(p1.l lVar, float f10, float f11, i3.t tVar, u2.m mVar, int i10) {
        p1.l lVar2;
        tVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.X(1129794567);
        x3.a aVar = (x3.a) qVar.j(i4.j1.f13133l);
        Object L = qVar.L();
        Object obj = u2.l.f33918a;
        if (L == obj) {
            L = j1.e.a(f11);
            qVar.h0(L);
        }
        j1.d dVar = (j1.d) L;
        boolean f12 = qVar.f(lVar) | qVar.h(aVar) | qVar.h(dVar) | qVar.c(f10) | qVar.c(f11);
        Object L2 = qVar.L();
        if (!f12 && L2 != obj) {
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            L2 = new InteractionsKt$bounceOnPress$1$1$1(lVar2, aVar, dVar, f10, f11, null);
            qVar.h0(L2);
        }
        u2.r.f((ho.p) L2, lVar2, qVar);
        boolean h10 = qVar.h(dVar);
        Object L3 = qVar.L();
        if (h10 || L3 == obj) {
            L3 = new a0(dVar, 1);
            qVar.h0(L3);
        }
        i3.t r10 = p3.h0.r(tVar, (ho.l) L3);
        qVar.p(false);
        return r10;
    }

    public static final sn.z bounceOnPress$lambda$0$2$0(j1.d dVar, p3.i0 i0Var) {
        i0Var.getClass();
        p3.y0 y0Var = (p3.y0) i0Var;
        y0Var.r(((Number) dVar.d()).floatValue());
        y0Var.s(((Number) dVar.d()).floatValue());
        return sn.z.f31622a;
    }
}
