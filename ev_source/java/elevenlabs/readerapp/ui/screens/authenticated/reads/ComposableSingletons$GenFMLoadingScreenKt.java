package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import f4.f1;
import h4.f2;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import s4.y0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$GenFMLoadingScreenKt {
    public static final ComposableSingletons$GenFMLoadingScreenKt INSTANCE = new ComposableSingletons$GenFMLoadingScreenKt();
    private static ho.r lambda$1637749807 = new c3.j(new Object(), false, 1637749807);

    /* JADX INFO: Access modifiers changed from: private */
    public static final sn.z lambda_1637749807$lambda$0(i1.o oVar, LoadingMessage loadingMessage, u2.m mVar, int i10) {
        u2.q qVar;
        oVar.getClass();
        loadingMessage.getClass();
        i3.q qVar2 = i3.q.f13017a;
        i3.t d10 = p2.d(qVar2, 1.0f);
        f1 d11 = r1.p.d(i3.d.f13001e, false);
        u2.q qVar3 = (u2.q) mVar;
        int hashCode = Long.hashCode(qVar3.T);
        c3.o l4 = qVar3.l();
        i3.t c5 = i3.a.c(d10, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar3.f33969a;
        qVar3.b0();
        if (qVar3.S) {
            qVar3.k(fVar);
        } else {
            qVar3.k0();
        }
        u2.r.J(h4.g.f11907f, d11, mVar);
        u2.r.J(h4.g.f11906e, l4, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode), h4.g.f11908g);
        u2.r.F(h4.g.f11909h, mVar);
        u2.r.J(h4.g.f11905d, c5, mVar);
        if (loadingMessage.getMessage() != null) {
            qVar3.X(-1039729214);
            String R = kj.c.R(mVar, loadingMessage.getMessage().intValue());
            y0 titleLarge700Inter = ElevenLabsTheme.INSTANCE.getTypo(mVar, ElevenLabsTheme.$stable).getTitleLarge700Inter();
            j7.d(R, p2.e(qVar2, 1.0f), p3.x.f26431f, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, titleLarge700Inter, mVar, 432, 0, 130040);
            qVar = qVar3;
            qVar.p(false);
        } else {
            qVar = qVar3;
            qVar.X(-1039304359);
            qVar.p(false);
        }
        qVar.p(true);
        return sn.z.f31622a;
    }

    public final ho.r getLambda$1637749807$app_productionRelease() {
        return lambda$1637749807;
    }
}
