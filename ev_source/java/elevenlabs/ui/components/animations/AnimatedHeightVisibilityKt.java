package io.elevenlabs.ui.components.animations;

import c3.o;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import f4.f1;
import h4.g;
import h5.c;
import ho.p;
import i3.d;
import i3.t;
import i4.j1;
import io.livekit.android.rpc.RpcError;
import j1.e;
import j1.f;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import m3.h;
import r1.p2;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.x0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000f²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Li3/t;", "modifier", "", "visible", "Lkotlin/Function0;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "AnimatedHeightVisibility", "(Li3/t;ZLho/p;Lu2/m;II)V", "", "height", "Lh5/f;", "heightInDp", "", "opacity", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AnimatedHeightVisibilityKt {
    public static final void AnimatedHeightVisibility(t tVar, boolean z6, p pVar, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        boolean z10;
        t tVar3;
        float f10;
        float f11;
        int i14;
        int i15;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-354014054);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(pVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i12;
        if ((i17 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i17 & 1, z10)) {
            if (i16 != 0) {
                tVar3 = i3.q.f13017a;
            } else {
                tVar3 = tVar2;
            }
            c cVar = (c) qVar.j(j1.f13129h);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = b.t(300, qVar);
            }
            x0 x0Var = (x0) L;
            if (z6) {
                f10 = cVar.S(AnimatedHeightVisibility$lambda$1(x0Var));
            } else {
                f10 = 0;
            }
            s2 a10 = f.a(f10, e.s(300, 0, null, 6), "AnimatedHeightVisibility:heightInDp", qVar, 432, 8);
            if (z6) {
                f11 = 1.0f;
            } else {
                f11 = u.P;
            }
            t a11 = h.a(p2.f(tVar3, AnimatedHeightVisibility$lambda$4(a10)), AnimatedHeightVisibility$lambda$5(f.b(f11, e.s(300, 0, null, 6), "AnimatedHeightVisibility:opacity", qVar, 3120, 20)));
            f1 d10 = r1.p.d(d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(a11, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            j0.c.q((i17 >> 6) & 14, pVar, qVar, true);
            tVar2 = tVar3;
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new id.c(tVar2, z6, pVar, i10, i11, 4);
        }
    }

    private static final int AnimatedHeightVisibility$lambda$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final float AnimatedHeightVisibility$lambda$4(s2 s2Var) {
        return ((h5.f) s2Var.getValue()).f12083a;
    }

    private static final float AnimatedHeightVisibility$lambda$5(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final z AnimatedHeightVisibility$lambda$7(t tVar, boolean z6, p pVar, int i10, int i11, m mVar, int i12) {
        AnimatedHeightVisibility(tVar, z6, pVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
