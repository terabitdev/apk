package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "Hint", "(Lho/p;Lu2/m;I)V", "Preview_Hint", "(Lu2/m;I)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HintKt {
    public static final void Hint(ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        pVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(499597464);
        if ((i10 & 6) == 0) {
            if (qVar.h(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar, 6, l1.n.h(m3.h.c(i3.q.f13017a, elevenLabsTheme.getShapes(qVar, 6).getMd()), elevenLabsTheme.getColors(qVar, 6).getHintBg(), p3.h0.f26395b));
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(x10, qVar);
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
            u2.c0 c0Var = j7.f27325a;
            u2.r.a(c0Var.a(((s4.y0) qVar.j(c0Var)).d(elevenLabsTheme.getTypo(qVar, 6).getBodyLarge500())), c3.k.d(988184210, true, new v(pVar, 2), qVar), qVar, 56);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.d(i10, 1, pVar);
        }
    }

    public static final sn.z Hint$lambda$0$0(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            pVar.invoke(qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Hint$lambda$1(ho.p pVar, int i10, u2.m mVar, int i11) {
        Hint(pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_Hint(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(500304284);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 10;
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, f10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            ComposableSingletons$HintKt composableSingletons$HintKt = ComposableSingletons$HintKt.INSTANCE;
            Hint(composableSingletons$HintKt.getLambda$1829776294$ui_release(), qVar, 6);
            r1.d.g(r1.p2.f(qVar2, f10), qVar);
            Hint(composableSingletons$HintKt.getLambda$495529245$ui_release(), qVar, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y0(i10, 13);
        }
    }

    public static final sn.z Preview_Hint$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_Hint(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
