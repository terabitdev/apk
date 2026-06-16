package io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components;

import c3.j;
import c3.o;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import ho.p;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import r1.p2;
import sn.z;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$TypingIndicatorKt {
    public static final ComposableSingletons$TypingIndicatorKt INSTANCE = new ComposableSingletons$TypingIndicatorKt();

    /* renamed from: lambda$-2038837402 */
    private static p f258lambda$2038837402 = new j(new c(19), false, -2038837402);

    public static final z lambda__2038837402$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            t e11 = i.e(echoTheme, qVar, i11, n.h(e10, echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b));
            f1 d10 = r1.p.d(d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e11, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            TypingIndicatorKt.TypingIndicator(null, qVar, 0, 1);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-2038837402$app_productionRelease */
    public final p m1294getLambda$2038837402$app_productionRelease() {
        return f258lambda$2038837402;
    }
}
