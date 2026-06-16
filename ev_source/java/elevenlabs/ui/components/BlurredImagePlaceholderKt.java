package io.elevenlabs.ui.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/k0;", "bitmap", "Li3/t;", "modifier", "Lsn/z;", "BlurredImagePlaceholder", "(Lp3/k0;Li3/t;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BlurredImagePlaceholderKt {
    public static final void BlurredImagePlaceholder(p3.k0 k0Var, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        int i14;
        k0Var.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-537766248);
        if ((i10 & 6) == 0) {
            if (qVar.h(k0Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar2 = i3.q.f13017a;
            } else {
                tVar2 = tVar;
            }
            l1.n.d(k0Var, null, m3.h.b(tVar2, 20, p3.h0.f26395b), qVar, (i12 & 14) | 24624, 104);
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(k0Var, tVar2, i10, i11, 20);
        }
    }

    public static final sn.z BlurredImagePlaceholder$lambda$0(p3.k0 k0Var, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        BlurredImagePlaceholder(k0Var, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static /* synthetic */ sn.z a(p3.k0 k0Var, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        return BlurredImagePlaceholder$lambda$0(k0Var, tVar, i10, i11, mVar, i12);
    }
}
