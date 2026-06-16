package io.elevenlabs.ui.components;

import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "toast", "onToastHidden", "", "visible", "ToastContainer", "(Lho/p;Lho/a;ZLu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ToastContainerKt {
    public static final void ToastContainer(ho.p pVar, ho.a aVar, boolean z6, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        pVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1770565536);
        if ((i10 & 6) == 0) {
            if (qVar.h(pVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.g(z6)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            i3.t d10 = r1.p2.d(i3.q.f13017a, 1.0f);
            f4.f1 d11 = r1.p.d(i3.d.f12998b, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility(z6, c3.k.d(1728149841, true, new k(aVar, pVar, 4), qVar), qVar, ((i11 >> 6) & 14) | 48);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.e(pVar, aVar, z6, i10, 2);
        }
    }

    public static final sn.z ToastContainer$lambda$0$0(ho.a aVar, ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        boolean O = qVar.O(i10 & 1, z6);
        sn.z zVar = sn.z.f31622a;
        if (O) {
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a0(aVar, 3);
                qVar.h0(L);
            }
            u2.r.c(zVar, (ho.l) L, qVar);
            pVar.invoke(qVar, 0);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final u2.h0 ToastContainer$lambda$0$0$0$0(final ho.a aVar, u2.i0 i0Var) {
        i0Var.getClass();
        return new u2.h0() { // from class: io.elevenlabs.ui.components.ToastContainerKt$ToastContainer$lambda$0$0$0$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                ho.a.this.invoke();
            }
        };
    }

    public static final sn.z ToastContainer$lambda$1(ho.p pVar, ho.a aVar, boolean z6, int i10, u2.m mVar, int i11) {
        ToastContainer(pVar, aVar, z6, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
