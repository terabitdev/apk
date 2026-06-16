package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh5/f;", "verticalPadding", "Lsn/z;", "VoiceRowShimmering-kHDZbjc", "(FLu2/m;II)V", "VoiceRowShimmering", "Preview_VoiceRowShimmering", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceRowShimmeringKt {
    public static final void Preview_VoiceRowShimmering(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-961375096);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1109VoiceRowShimmeringkHDZbjc(t2.u.P, qVar, 0, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 21);
        }
    }

    public static final sn.z Preview_VoiceRowShimmering$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_VoiceRowShimmering(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: VoiceRowShimmering-kHDZbjc */
    public static final void m1109VoiceRowShimmeringkHDZbjc(float f10, u2.m mVar, final int i10, final int i11) {
        final float f11;
        int i12;
        boolean z6;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-732274101);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0) {
                f11 = f10;
                if (qVar.c(f11)) {
                    i13 = 4;
                    i12 = i10 | i13;
                }
            } else {
                f11 = f10;
            }
            i13 = 2;
            i12 = i10 | i13;
        } else {
            f11 = f10;
            i12 = i10;
        }
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                int i14 = i11 & 1;
            } else if ((i11 & 1) != 0) {
                f11 = ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM();
            }
            qVar.q();
            i3.q qVar2 = i3.q.f13017a;
            i3.t v9 = p2.v(p2.e(qVar2, 1.0f), null, 3);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            i3.t a10 = fl.h.a(r1.d.F(v9, elevenLabsTheme.getSpacings(qVar, i15).m2357getX5D9Ej5fM(), f11), qVar);
            i3.k kVar = i3.d.f13005z0;
            r1.u0 u0Var = r1.j.f29228a;
            k2 a11 = i2.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i15).m2355getX3D9Ej5fM()), kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(a10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a11, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.t c10 = m3.h.c(p2.o(qVar2, 56), elevenLabsTheme.getShapes(qVar, i15).getFull());
            long m2067getHighlight0d7_KjU = elevenLabsTheme.getColor(qVar, i15).getLoadingShimmer().m2067getHighlight0d7_KjU();
            float f12 = f11;
            p3.w0 w0Var = p3.h0.f26395b;
            r1.p.a(l1.n.h(c10, m2067getHighlight0d7_KjU, w0Var), qVar, 0);
            r1.x a12 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i15).m2355getX3D9Ej5fM()), i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            r1.p.a(l1.n.h(p2.f(p2.e(qVar2, 0.5f), 12), elevenLabsTheme.getColor(qVar, i15).getLoadingShimmer().m2067getHighlight0d7_KjU(), w0Var), qVar, 0);
            r1.p.a(l1.n.h(p2.f(p2.e(qVar2, 0.8f), 10), elevenLabsTheme.getColor(qVar, i15).getLoadingShimmer().m2067getHighlight0d7_KjU(), w0Var), qVar, 0);
            qVar.p(true);
            qVar.p(true);
            f11 = f12;
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.h1
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z VoiceRowShimmering_kHDZbjc$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    VoiceRowShimmering_kHDZbjc$lambda$1 = VoiceRowShimmeringKt.VoiceRowShimmering_kHDZbjc$lambda$1(f11, i10, i11, (u2.m) obj, intValue);
                    return VoiceRowShimmering_kHDZbjc$lambda$1;
                }
            };
        }
    }

    public static final sn.z VoiceRowShimmering_kHDZbjc$lambda$1(float f10, int i10, int i11, u2.m mVar, int i12) {
        m1109VoiceRowShimmeringkHDZbjc(f10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
