package io.elevenlabs.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li3/t;", "modifier", "Lsn/z;", "UltraBadge", "(Li3/t;Lu2/m;II)V", "Preview_UltraBadge", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UltraBadgeKt {
    public static final void Preview_UltraBadge(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1438049980);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$UltraBadgeKt.INSTANCE.getLambda$1761754146$ui_release(), qVar, 432, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 18);
        }
    }

    public static final sn.z Preview_UltraBadge$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_UltraBadge(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void UltraBadge(i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-560460598);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            if (i14 != 0) {
                tVar = qVar2;
            }
            i3.t c5 = m3.h.c(r1.p2.o(tVar, 20), z1.h.f39128a);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            i3.t h10 = l1.n.h(c5, echoTheme.getColors(qVar, 6).getFill().getDenaryAlpha(qVar, 0), p3.h0.f26395b);
            i3.l lVar = i3.d.f13001e;
            f4.f1 d10 = r1.p.d(lVar, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(h10, qVar);
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
            u2.r.J(h4.g.f11905d, c10, qVar);
            q2.y2.a(kd.a.M(R.drawable.ultra_badge, qVar, 0), null, r1.t.f29349a.b(r1.p2.o(qVar2, 12), lVar), echoTheme.getColors(qVar, 6).getIcon().getQuaternary(qVar, 0), qVar, u3.c.$stable | 48, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.t(tVar, i10, i11, 5);
        }
    }

    public static final sn.z UltraBadge$lambda$1(i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        UltraBadge(tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
