package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components;

import c3.j;
import c3.o;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.a;
import i3.d;
import i3.k;
import i3.t;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import lm.e;
import m2.k1;
import p.n;
import r1.i2;
import r1.k2;
import r1.w;
import r1.x;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PronunciationPreviewButtonKt {
    public static final ComposableSingletons$PronunciationPreviewButtonKt INSTANCE = new ComposableSingletons$PronunciationPreviewButtonKt();

    /* renamed from: lambda$-1768621833 */
    private static p f528lambda$1768621833 = new j(new e(17), false, -1768621833);

    public static final z lambda__1768621833$lambda$0(m mVar, int i10) {
        boolean z6;
        u2.e eVar;
        k kVar = d.f13005z0;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 8;
            x a10 = w.a(r1.j.g(f10), d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = a.c(qVar2, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = g.f11907f;
            r.J(eVar2, a10, qVar);
            h4.e eVar3 = g.f11906e;
            r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = g.f11908g;
            r.y(qVar, valueOf, eVar4);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar5 = g.f11905d;
            r.J(eVar5, c5, qVar);
            k2 a11 = i2.a(r1.j.g(f10), kVar, qVar, 54);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar2, a11, qVar);
            r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            r.J(eVar5, c10, qVar);
            qVar.X(-1294611514);
            Iterator<E> it = PronunciationPreviewButtonVariant.getEntries().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                eVar = l.f33918a;
                if (!hasNext) {
                    break;
                }
                PronunciationPreviewButtonVariant pronunciationPreviewButtonVariant = (PronunciationPreviewButtonVariant) it.next();
                PronunciationPreviewState pronunciationPreviewState = PronunciationPreviewState.Stopped;
                Object L = qVar.L();
                if (L == eVar) {
                    L = new k1(3);
                    qVar.h0(L);
                }
                PronunciationPreviewButtonKt.PronunciationPreviewButton(pronunciationPreviewState, pronunciationPreviewButtonVariant, (ho.a) L, null, true, qVar, 24966, 8);
            }
            qVar.p(false);
            qVar.p(true);
            k2 a12 = i2.a(r1.j.g(f10), kVar, qVar, 54);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c11 = a.c(qVar2, qVar);
            h.f11920i.getClass();
            f fVar2 = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a12, qVar);
            r.J(g.f11906e, l10, qVar);
            r.y(qVar, Integer.valueOf(hashCode3), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c11, qVar);
            qVar.X(1336351023);
            for (PronunciationPreviewButtonVariant pronunciationPreviewButtonVariant2 : PronunciationPreviewButtonVariant.getEntries()) {
                PronunciationPreviewState pronunciationPreviewState2 = PronunciationPreviewState.Playing;
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = new k1(4);
                    qVar.h0(L2);
                }
                PronunciationPreviewButtonKt.PronunciationPreviewButton(pronunciationPreviewState2, pronunciationPreviewButtonVariant2, (ho.a) L2, null, true, qVar, 24966, 8);
            }
            qVar.p(false);
            qVar.p(true);
            k2 a13 = i2.a(r1.j.g(f10), kVar, qVar, 54);
            int hashCode4 = Long.hashCode(qVar.T);
            o l11 = qVar.l();
            t c12 = a.c(qVar2, qVar);
            h.f11920i.getClass();
            f fVar3 = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar3);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a13, qVar);
            r.J(g.f11906e, l11, qVar);
            r.y(qVar, Integer.valueOf(hashCode4), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c12, qVar);
            qVar.X(677284942);
            for (PronunciationPreviewButtonVariant pronunciationPreviewButtonVariant3 : PronunciationPreviewButtonVariant.getEntries()) {
                PronunciationPreviewState pronunciationPreviewState3 = PronunciationPreviewState.Loading;
                Object L3 = qVar.L();
                if (L3 == eVar) {
                    L3 = new k1(5);
                    qVar.h0(L3);
                }
                PronunciationPreviewButtonKt.PronunciationPreviewButton(pronunciationPreviewState3, pronunciationPreviewButtonVariant3, (ho.a) L3, null, true, qVar, 24966, 8);
            }
            qVar.p(false);
            qVar.p(true);
            k2 a14 = i2.a(r1.j.g(f10), kVar, qVar, 54);
            int hashCode5 = Long.hashCode(qVar.T);
            o l12 = qVar.l();
            t c13 = a.c(qVar2, qVar);
            h.f11920i.getClass();
            f fVar4 = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar4);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a14, qVar);
            r.J(g.f11906e, l12, qVar);
            r.y(qVar, Integer.valueOf(hashCode5), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c13, qVar);
            qVar.X(18218862);
            for (PronunciationPreviewButtonVariant pronunciationPreviewButtonVariant4 : PronunciationPreviewButtonVariant.getEntries()) {
                PronunciationPreviewState pronunciationPreviewState4 = PronunciationPreviewState.Stopped;
                Object L4 = qVar.L();
                if (L4 == eVar) {
                    L4 = new k1(6);
                    qVar.h0(L4);
                }
                PronunciationPreviewButtonKt.PronunciationPreviewButton(pronunciationPreviewState4, pronunciationPreviewButtonVariant4, (ho.a) L4, null, false, qVar, 24966, 8);
            }
            n.t(qVar, false, true, true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1768621833$app_productionRelease */
    public final p m1630getLambda$1768621833$app_productionRelease() {
        return f528lambda$1768621833;
    }
}
