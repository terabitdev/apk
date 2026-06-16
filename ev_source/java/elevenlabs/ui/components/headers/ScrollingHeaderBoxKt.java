package io.elevenlabs.ui.components.headers;

import a2.k3;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import f4.f0;
import f4.i0;
import h4.f;
import h4.g;
import h5.c;
import ho.l;
import ho.p;
import ho.q;
import i3.t;
import i4.j1;
import io.elevenlabs.data.database.entities.reads.h;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.f2;
import livekit.LivekitInternal$NodeStats;
import r1.d;
import sn.z;
import t2.u;
import u2.e;
import u2.f1;
import u2.m;
import u2.r;
import u2.r1;
import u2.x0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a?\u0010\b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0011²\u0006\u000e\u0010\u000e\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "", "Lsn/z;", "onHeightUpdated", "Ll1/f2;", "scrollState", "Lr1/s;", FirebaseAnalytics.Param.CONTENT, "ScrollingHeaderBox", "(Lho/l;Ll1/f2;Lho/q;Lu2/m;I)V", "Lh5/f;", "shadowRaised", TokenNames.F, "shadowDisabled", "topBarHeight", "lastOffset", "globalOffset", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScrollingHeaderBoxKt {
    private static final float shadowRaised = 8;
    private static final float shadowDisabled = 0;

    public static final void ScrollingHeaderBox(l lVar, f2 f2Var, q qVar, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        x0 x0Var;
        Object scrollingHeaderBoxKt$ScrollingHeaderBox$1$1;
        Integer num;
        boolean z11;
        float f10;
        int i12;
        int i13;
        int i14;
        lVar.getClass();
        f2Var.getClass();
        f1 f1Var = f2Var.f20901a;
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-128538234);
        if ((i10 & 6) == 0) {
            if (qVar2.h(lVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(f2Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(qVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        int i15 = i11;
        if ((i15 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i15 & 1, z6)) {
            Object L = qVar2.L();
            e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
            }
            x0 x0Var2 = (x0) L;
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
            }
            x0 x0Var3 = (x0) L2;
            Object L3 = qVar2.L();
            if (L3 == eVar) {
                L3 = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
            }
            x0 x0Var4 = (x0) L3;
            Integer valueOf = Integer.valueOf(f1Var.h());
            if ((i15 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L4 = qVar2.L();
            if (z10 || L4 == eVar) {
                x0Var = x0Var4;
                num = valueOf;
                scrollingHeaderBoxKt$ScrollingHeaderBox$1$1 = new ScrollingHeaderBoxKt$ScrollingHeaderBox$1$1(f2Var, x0Var3, x0Var, x0Var2, null);
                qVar2.h0(scrollingHeaderBoxKt$ScrollingHeaderBox$1$1);
            } else {
                x0Var = x0Var4;
                scrollingHeaderBoxKt$ScrollingHeaderBox$1$1 = L4;
                num = valueOf;
            }
            r.f((p) scrollingHeaderBoxKt$ScrollingHeaderBox$1$1, num, qVar2);
            if ((i15 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L5 = qVar2.L();
            if (z11 || L5 == eVar) {
                L5 = new h(lVar, x0Var2, 22);
                qVar2.h0(L5);
            }
            t B = d.B(i0.p(i3.q.f13017a, (l) L5), u.P, -((c) qVar2.j(j1.f13129h)).S(ScrollingHeaderBox$lambda$7(x0Var)), 1);
            if (f1Var.h() > ScrollingHeaderBox$lambda$7(x0Var) + 10) {
                f10 = shadowRaised;
            } else {
                f10 = shadowDisabled;
            }
            t k4 = m3.h.k(B, f10, null, 0L, 0L, 30);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = i3.a.c(k4, qVar2);
            h4.h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(g.f11907f, d10, qVar2);
            r.J(g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar2);
            r.J(g.f11905d, c5, qVar2);
            qVar.invoke(r1.t.f29349a, qVar2, Integer.valueOf(((i15 >> 3) & 112) | 6));
            qVar2.p(true);
        } else {
            qVar2.R();
        }
        r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new k3(lVar, f2Var, qVar, i10);
        }
    }

    public static final int ScrollingHeaderBox$lambda$1(x0 x0Var) {
        return ((f1) x0Var).h();
    }

    public static final z ScrollingHeaderBox$lambda$10$0(l lVar, x0 x0Var, f0 f0Var) {
        f0Var.getClass();
        ScrollingHeaderBox$lambda$2(x0Var, (int) (f0Var.k() & 4294967295L));
        lVar.invoke(Integer.valueOf((int) (f0Var.k() & 4294967295L)));
        return z.f31622a;
    }

    public static final z ScrollingHeaderBox$lambda$13(l lVar, f2 f2Var, q qVar, int i10, m mVar, int i11) {
        ScrollingHeaderBox(lVar, f2Var, qVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void ScrollingHeaderBox$lambda$2(x0 x0Var, int i10) {
        ((f1) x0Var).i(i10);
    }

    public static final int ScrollingHeaderBox$lambda$4(x0 x0Var) {
        return ((f1) x0Var).h();
    }

    public static final void ScrollingHeaderBox$lambda$5(x0 x0Var, int i10) {
        ((f1) x0Var).i(i10);
    }

    public static final int ScrollingHeaderBox$lambda$7(x0 x0Var) {
        return ((f1) x0Var).h();
    }

    public static final void ScrollingHeaderBox$lambda$8(x0 x0Var, int i10) {
        ((f1) x0Var).i(i10);
    }

    public static /* synthetic */ z a(l lVar, f2 f2Var, q qVar, int i10, m mVar, int i11) {
        return ScrollingHeaderBox$lambda$13(lVar, f2Var, qVar, i10, mVar, i11);
    }

    public static /* synthetic */ z b(l lVar, x0 x0Var, f0 f0Var) {
        return ScrollingHeaderBox$lambda$10$0(lVar, x0Var, f0Var);
    }
}
