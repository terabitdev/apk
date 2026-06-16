package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import f4.f1;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "product", "Lkotlin/Function0;", "Lsn/z;", "onDone", "OneTimeCreditsPurchaseSuccessScreen", "(Lio/elevenlabs/domain/model/OneTimeCreditsProduct;Lho/a;Lu2/m;I)V", "", "visible", "", "animationProgress", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OneTimeCreditsPurchaseSuccessScreenKt {
    public static final void OneTimeCreditsPurchaseSuccessScreen(OneTimeCreditsProduct oneTimeCreditsProduct, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        float f10;
        h4.f fVar;
        float f11;
        float f12;
        int i12;
        int i13;
        ho.a aVar2 = aVar;
        oneTimeCreditsProduct.getClass();
        aVar2.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(839580443);
        if ((i10 & 6) == 0) {
            if (qVar2.h(oneTimeCreditsProduct)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar3, 1.0f);
            f1 d11 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(d10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d11, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            Object L = qVar2.L();
            u2.e eVar5 = u2.l.f33918a;
            if (L == eVar5) {
                L = u2.r.A(Boolean.FALSE);
                qVar2.h0(L);
            }
            z0 z0Var = (z0) L;
            if (OneTimeCreditsPurchaseSuccessScreen$lambda$0$1(z0Var)) {
                f10 = 1.0f;
            } else {
                f10 = t2.u.P;
            }
            s2 b10 = j1.f.b(f10, null, null, qVar2, 0, 30);
            Object L2 = qVar2.L();
            if (L2 == eVar5) {
                L2 = new OneTimeCreditsPurchaseSuccessScreenKt$OneTimeCreditsPurchaseSuccessScreen$1$1$1(z0Var, null);
                qVar2.h0(L2);
            }
            u2.r.f((ho.p) L2, sn.z.f31622a, qVar2);
            r1.d.g(m3.h.h(p2.d(qVar3, 1.0f), kd.a.M(R.drawable.elevenreader_icon, qVar2, 0), null, f4.q.f8840c, t2.u.P, null, 54), qVar2);
            i3.t F = r1.d.F(p2.d(qVar3, 1.0f), 20, 16);
            i3.j jVar = i3.d.C0;
            r1.f fVar3 = r1.j.f29232e;
            r1.x a10 = r1.w.a(fVar3, jVar, qVar2, 54);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c10 = i3.a.c(F, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                fVar = fVar2;
                qVar2.k(fVar);
            } else {
                fVar = fVar2;
                qVar2.k0();
            }
            u2.r.J(eVar, a10, qVar2);
            u2.r.J(eVar2, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c10, qVar2);
            int i14 = i11;
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f11 = Float.MAX_VALUE;
            } else {
                f11 = 1.0f;
            }
            r1.d.g(new m1(f11, true), qVar2);
            i3.t e10 = p2.e(qVar3, 1.0f);
            float OneTimeCreditsPurchaseSuccessScreen$lambda$0$3 = OneTimeCreditsPurchaseSuccessScreen$lambda$0$3(b10);
            i3.t a11 = m3.h.a(m3.h.j(e10, OneTimeCreditsPurchaseSuccessScreen$lambda$0$3, OneTimeCreditsPurchaseSuccessScreen$lambda$0$3), OneTimeCreditsPurchaseSuccessScreen$lambda$0$3(b10));
            r1.x a12 = r1.w.a(fVar3, jVar, qVar2, 54);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c11 = i3.a.c(a11, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, a12, qVar2);
            u2.r.J(eVar2, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c11, qVar2);
            i3.k kVar = i3.d.f13005z0;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            r1.h n2 = ib.i.n(elevenLabsTheme, qVar2, i15);
            i3.t I = r1.d.I(qVar3, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar2, i15).m2351getX10D9Ej5fM(), 7);
            k2 a13 = i2.a(n2, kVar, qVar2, 48);
            int hashCode4 = Long.hashCode(qVar2.T);
            c3.o l11 = qVar2.l();
            i3.t c12 = i3.a.c(I, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar, a13, qVar2);
            u2.r.J(eVar2, l11, qVar2);
            defpackage.f.u(hashCode4, qVar2, eVar3, qVar2, dVar);
            u2.r.J(eVar4, c12, qVar2);
            l1.n.c(kd.a.M(io.elevenlabs.ui.R.drawable.clock, qVar2, 0), null, p2.o(qVar3, 32), null, null, t2.u.P, new p3.n(defpackage.f.b(elevenLabsTheme, qVar2, i15), 5), qVar2, u3.c.$stable | 432, 56);
            j7.d(oneTimeCreditsProduct.getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar2, i15), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i15).getTitleXLarge700Eleven(), qVar2, 0, 0, 131066);
            qVar2.p(true);
            j7.d(kj.c.R(qVar2, R.string.one_time_purchase_hours_purchased), r1.d.I(qVar3, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar2, i15).m2356getX4D9Ej5fM(), 7), defpackage.f.b(elevenLabsTheme, qVar2, i15), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i15).getTitleMedium700(), qVar2, 0, 0, 130040);
            j7.d(kj.c.R(qVar2, R.string.one_time_purchase_hours_processing), null, ib.i.w(elevenLabsTheme, qVar2, i15), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i15).getBodySmall500(), qVar2, 0, 0, 130042);
            qVar2.p(true);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f12 = Float.MAX_VALUE;
            } else {
                f12 = 1.0f;
            }
            r1.d.g(new m1(f12, true), qVar2);
            aVar2 = aVar;
            FullWidthButtonKt.FullWidthButton(kj.c.R(qVar2, R.string.one_time_purchase_cta), aVar2, p2.e(qVar3, 1.0f), null, null, null, false, false, false, qVar2, (i14 & 112) | 384, 504);
            qVar = qVar2;
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new s(oneTimeCreditsProduct, aVar2, i10, 1);
        }
    }

    private static final boolean OneTimeCreditsPurchaseSuccessScreen$lambda$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void OneTimeCreditsPurchaseSuccessScreen$lambda$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final float OneTimeCreditsPurchaseSuccessScreen$lambda$0$3(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z OneTimeCreditsPurchaseSuccessScreen$lambda$1(OneTimeCreditsProduct oneTimeCreditsProduct, ho.a aVar, int i10, u2.m mVar, int i11) {
        OneTimeCreditsPurchaseSuccessScreen(oneTimeCreditsProduct, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
