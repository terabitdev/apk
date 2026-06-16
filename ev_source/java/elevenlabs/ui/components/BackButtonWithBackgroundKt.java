package io.elevenlabs.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "", "backgroundAlpha", "BackButtonWithBackground", "(Lho/a;FLu2/m;II)V", "Preview_BackButtonWithBackground", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BackButtonWithBackgroundKt {
    public static final void BackButtonWithBackground(ho.a aVar, float f10, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        int i14;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1331751477);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
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
            if (qVar.c(f10)) {
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
                f10 = 1.0f;
            }
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            BackButtonKt.BackButton(aVar, r1.d.E(l1.n.h(m3.h.c(i3.q.f13017a, elevenLabsTheme.getShapes(qVar, 6).getFull()), p3.x.b(f10, elevenLabsTheme.getColors(qVar, 6).getSecondaryButtonBg()), p3.h0.f26395b), elevenLabsTheme.getSpacings(qVar, 6).m2353getX2D9Ej5fM()), qVar, i12 & 14, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.a1(aVar, f10, i10, i11);
        }
    }

    public static final sn.z BackButtonWithBackground$lambda$0(ho.a aVar, float f10, int i10, int i11, u2.m mVar, int i12) {
        BackButtonWithBackground(aVar, f10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_BackButtonWithBackground(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1034178768);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(i3.q.f13017a, 10);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(6);
                qVar.h0(L);
            }
            BackButtonWithBackground((ho.a) L, t2.u.P, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 23);
        }
    }

    public static final sn.z Preview_BackButtonWithBackground$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_BackButtonWithBackground(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
