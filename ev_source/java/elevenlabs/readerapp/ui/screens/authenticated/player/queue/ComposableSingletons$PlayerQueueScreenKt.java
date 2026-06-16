package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import c3.j;
import c3.o;
import f4.f1;
import h4.g;
import h4.h;
import ho.p;
import ho.q;
import ho.r;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadSmallRowKt;
import io.elevenlabs.readerapp.ui.components.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayerQueueScreenKt {
    public static final ComposableSingletons$PlayerQueueScreenKt INSTANCE = new ComposableSingletons$PlayerQueueScreenKt();
    private static p lambda$709542494 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.a(2), false, 709542494);
    private static r lambda$310816351 = new j(new l(7), false, 310816351);
    private static q lambda$69262001 = new j(new f(10), false, 69262001);

    public static final z lambda_310816351$lambda$0(t1.b bVar, int i10, m mVar, int i11) {
        boolean z6;
        bVar.getClass();
        if ((i11 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            ReadSmallRowKt.ReadSmallShimmeringRow(r1.d.E(p2.e(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX1_5()), qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_69262001$lambda$0(t1.b bVar, m mVar, int i10) {
        int i11;
        boolean z6;
        t e10;
        int i12;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            e10 = ((t1.c) bVar).e(1.0f);
            t E = r1.d.E(((t1.c) bVar).d(e10, 0.6f), 24);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h.f11920i.getClass();
            h4.f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(g.f11907f, d10, qVar);
            u2.r.J(g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            u2.r.F(g.f11909h, qVar);
            u2.r.J(g.f11905d, c5, qVar);
            j7.d(kj.c.R(qVar, R.string.player_queue_empty_state_text), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, EchoTheme.INSTANCE.getTypography(qVar, EchoTheme.$stable).getBaseRegular400(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131070);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_709542494$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadSmallRowKt.ReadSmallShimmeringRow(i.e(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, p2.e(i3.q.f13017a, 1.0f)), qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public final r getLambda$310816351$app_productionRelease() {
        return lambda$310816351;
    }

    public final q getLambda$69262001$app_productionRelease() {
        return lambda$69262001;
    }

    public final p getLambda$709542494$app_productionRelease() {
        return lambda$709542494;
    }
}
