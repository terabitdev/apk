package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.o;
import h4.f;
import h4.g;
import h4.h;
import i3.d;
import i3.k;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.e;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import j1.r0;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p;
import r1.p2;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li3/t;", "modifier", "Lsn/z;", "TypingIndicator", "(Li3/t;Lu2/m;II)V", "Preview_TypingIndicator", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class TypingIndicatorKt {
    public static final void Preview_TypingIndicator(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(811352320);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m1294getLambda$2038837402$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 27);
        }
    }

    public static final z Preview_TypingIndicator$lambda$0(int i10, m mVar, int i11) {
        Preview_TypingIndicator(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void TypingIndicator(t tVar, m mVar, int i10, int i11) {
        t tVar2;
        int i12;
        int i13;
        boolean z6;
        t tVar3;
        q qVar = (q) mVar;
        qVar.Z(231427520);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
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
                tVar3 = qVar2;
            } else {
                tVar3 = tVar2;
            }
            t e10 = p2.e(tVar3, 1.0f);
            k2 a10 = i2.a(j.f29228a, d.f13004y0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = g.f11905d;
            r.J(eVar4, c5, qVar);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            r1.h g10 = j.g(echoTheme.getSpacings(qVar, i15).getX1());
            k kVar = d.f13005z0;
            t G = r1.d.G(qVar2, u.P, echoTheme.getSpacings(qVar, i15).getX2(), 1);
            k2 a11 = i2.a(g10, kVar, qVar, 48);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(G, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a11, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            qVar.X(623270183);
            for (int i16 = 0; i16 < 3; i16++) {
                p.a(n.h(r1.d.B(p2.o(qVar2, 4), u.P, ((Number) j1.e.g(j1.e.q("dot_" + i16, qVar, 0), u.P, -8.0f, j1.e.p(j1.e.s(600, i16 * 150, null, 4), r0.f18351b, 0L, 4), defpackage.f.e(i16, "dot_offset_"), qVar, 4152, 0).f18235c.getValue()).floatValue(), 1), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getText().getQuaternary(qVar, EchoThemeColors.Text.$stable), z1.h.f39128a), qVar, 0);
            }
            p.n.t(qVar, false, true, true);
        } else {
            qVar.R();
            tVar3 = tVar2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.t(tVar3, i10, i11, 1);
        }
    }

    public static final z TypingIndicator$lambda$1(t tVar, int i10, int i11, m mVar, int i12) {
        TypingIndicator(tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
