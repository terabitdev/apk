package io.elevenlabs.ui.components.primitives;

import i3.t;
import id.h0;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.e;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.s;
import p3.x;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/t;", "modifier", "", "Lp3/x;", "colors", "Lsn/z;", "VerticalGradient", "(Li3/t;Ljava/util/List;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VerticalGradientKt {
    public static final void VerticalGradient(t tVar, List<x> list, m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        int i14;
        list.getClass();
        q qVar = (q) mVar;
        qVar.Z(-740051708);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
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
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar = i3.q.f13017a;
            }
            boolean h10 = qVar.h(list);
            Object L = qVar.L();
            if (h10 || L == l.f33918a) {
                L = new h0(list, 2);
                qVar.h0(L);
            }
            n.b((ho.l) L, tVar, qVar, i12 & 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(tVar, list, i10, i11);
        }
    }

    public static final z VerticalGradient$lambda$0$0(List list, r3.e eVar) {
        eVar.getClass();
        r3.e.m(eVar, s.b(p3.t.Companion, list, u.P, u.P, 14), 0L, 0L, u.P, null, null, 0, 126);
        return z.f31622a;
    }

    public static final z VerticalGradient$lambda$1(t tVar, List list, int i10, int i11, m mVar, int i12) {
        VerticalGradient(tVar, list, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
