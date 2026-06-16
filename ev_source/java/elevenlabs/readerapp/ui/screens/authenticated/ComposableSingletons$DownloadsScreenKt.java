package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$DownloadsScreenKt {
    public static final ComposableSingletons$DownloadsScreenKt INSTANCE = new ComposableSingletons$DownloadsScreenKt();
    private static ho.p lambda$1624366846 = new c3.j(new b(0), false, 1624366846);
    private static ho.q lambda$1724260836 = new c3.j(new c(0), false, 1724260836);
    private static ho.p lambda$1245552842 = new c3.j(new b(1), false, 1245552842);

    public static final sn.z lambda_1245552842$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t d10 = p2.d(l1.n.h(i3.q.f13017a, ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), p3.h0.f26395b), 1.0f);
            f4.f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            DownloadsScreenKt.DownloadsEmptyState(null, qVar, 0, 1);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1624366846$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1724260836$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(r1.u0.e(qVar).f29154l), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1245552842$app_productionRelease() {
        return lambda$1245552842;
    }

    public final ho.p getLambda$1624366846$app_productionRelease() {
        return lambda$1624366846;
    }

    public final ho.q getLambda$1724260836$app_productionRelease() {
        return lambda$1724260836;
    }
}
