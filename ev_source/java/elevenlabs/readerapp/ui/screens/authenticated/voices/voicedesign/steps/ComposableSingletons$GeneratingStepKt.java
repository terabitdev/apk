package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import c3.o;
import f4.f1;
import ho.p;
import i3.t;
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
public final class ComposableSingletons$GeneratingStepKt {
    public static final ComposableSingletons$GeneratingStepKt INSTANCE = new ComposableSingletons$GeneratingStepKt();

    /* renamed from: lambda$-1585715272 */
    private static p f624lambda$1585715272 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.series.a(12), false, -1585715272);

    public static final z lambda__1585715272$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            GeneratingStepKt.GeneratingStep(null, "voice_design_generating", qVar, 48, 1);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1585715272$app_productionRelease */
    public final p m1754getLambda$1585715272$app_productionRelease() {
        return f624lambda$1585715272;
    }
}
