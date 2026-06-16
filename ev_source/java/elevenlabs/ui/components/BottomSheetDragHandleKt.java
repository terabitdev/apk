package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lsn/z;", "BottomSheetDragHandle", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BottomSheetDragHandleKt {
    public static final void BottomSheetDragHandle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-696998191);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = r1.p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t f10 = r1.p2.f(e10, elevenLabsTheme.getSpacings(qVar, 6).m2357getX5D9Ej5fM());
            f4.f1 d10 = r1.p.d(i3.d.f12998b, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f10, qVar);
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
            r1.p.a(l1.n.h(m3.h.c(r1.p2.p(qVar2, 36, 5), elevenLabsTheme.getShapes(qVar, 6).getFull()), elevenLabsTheme.getColor(qVar, 6).getDivider().m2059getLine0d7_KjU(), p3.h0.f26395b), qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 24);
        }
    }

    public static final sn.z BottomSheetDragHandle$lambda$1(int i10, u2.m mVar, int i11) {
        BottomSheetDragHandle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
