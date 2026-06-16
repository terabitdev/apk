package io.elevenlabs.ui.components;

import a2.h3;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Li3/t;", "modifier", "Lkotlin/Function1;", "Lio/elevenlabs/ui/components/ZoomableBoxScope;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "ZoomableBox", "(Li3/t;Lho/q;Lu2/m;II)V", "Preview_ZoomableBox", "(Lu2/m;I)V", "", "scale", "Lo3/b;", "offset", "Lh5/l;", "size", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ZoomableBoxKt {
    public static final void Preview_ZoomableBox(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(81455162);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ZoomableBox(l1.n.h(r1.p2.o(i3.q.f13017a, 300), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, 6), p3.h0.f26395b), ComposableSingletons$ZoomableBoxKt.INSTANCE.m1826getLambda$1863724568$ui_release(), qVar, 48, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 23);
        }
    }

    public static final sn.z Preview_ZoomableBox$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ZoomableBox(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ZoomableBox(i3.t tVar, ho.q qVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        int i14;
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(532468474);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar2.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(qVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar = i3.q.f13017a;
            }
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new u2.e1(1.0f);
                qVar2.h0(L);
            }
            u2.w0 w0Var = (u2.w0) L;
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = u2.r.A(new o3.b(0L));
                qVar2.h0(L2);
            }
            u2.z0 z0Var = (u2.z0) L2;
            Object L3 = qVar2.L();
            if (L3 == eVar) {
                L3 = u2.r.A(new h5.l(0L));
                qVar2.h0(L3);
            }
            u2.z0 z0Var2 = (u2.z0) L3;
            Object L4 = qVar2.L();
            if (L4 == eVar) {
                L4 = new n(w0Var, z0Var, 1);
                qVar2.h0(L4);
            }
            u2.z0 H = u2.r.H((ho.q) L4, qVar2);
            Object L5 = qVar2.L();
            if (L5 == eVar) {
                n1.g0 g0Var = new n1.g0(new h3(H, 12));
                qVar2.h0(g0Var);
                L5 = g0Var;
            }
            n1.g0 g0Var2 = (n1.g0) L5;
            i3.t c5 = m3.h.c(tVar, p3.h0.f26395b);
            Object L6 = qVar2.L();
            if (L6 == eVar) {
                L6 = new e1(z0Var2, 14);
                qVar2.h0(L6);
            }
            i3.t r10 = n1.g.r(f4.i0.q(c5, (ho.l) L6), g0Var2);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c10 = i3.a.c(r10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c10, qVar2);
            qVar.invoke(new ZoomableBoxScopeImpl(ZoomableBox$lambda$1(w0Var), ZoomableBox$lambda$4(z0Var), t2.u.P, null), qVar2, Integer.valueOf(i12 & 112));
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        i3.t tVar2 = tVar;
        u2.r1 r11 = qVar2.r();
        if (r11 != null) {
            r11.f34012d = new io.elevenlabs.readerapp.core.p(tVar2, qVar, i10, i11, 23);
        }
    }

    private static final float ZoomableBox$lambda$1(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    public static final sn.z ZoomableBox$lambda$10$0(u2.z0 z0Var, h5.l lVar) {
        ZoomableBox$lambda$8(z0Var, lVar.f12092a);
        return sn.z.f31622a;
    }

    public static final sn.z ZoomableBox$lambda$12(i3.t tVar, ho.q qVar, int i10, int i11, u2.m mVar, int i12) {
        ZoomableBox(tVar, qVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void ZoomableBox$lambda$2(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    private static final long ZoomableBox$lambda$4(u2.z0 z0Var) {
        return ((o3.b) z0Var.getValue()).f24764a;
    }

    private static final void ZoomableBox$lambda$5(u2.z0 z0Var, long j4) {
        z0Var.setValue(new o3.b(j4));
    }

    private static final void ZoomableBox$lambda$8(u2.z0 z0Var, long j4) {
        z0Var.setValue(new h5.l(j4));
    }

    public static final sn.z ZoomableBox$lambda$9$0(u2.w0 w0Var, u2.z0 z0Var, float f10, o3.b bVar, float f11) {
        ZoomableBox$lambda$2(w0Var, ZoomableBox$lambda$1(w0Var) * f10);
        ZoomableBox$lambda$5(z0Var, o3.b.h(ZoomableBox$lambda$4(z0Var), bVar.f24764a));
        return sn.z.f31622a;
    }
}
