package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import c3.o;
import ho.p;
import ho.q;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.k;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;
import r1.i2;
import r1.k2;
import r1.p2;
import r1.u0;
import sn.z;
import tn.u;
import u2.l;
import u2.m;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExploreFilterTopBarKt {
    public static final ComposableSingletons$ExploreFilterTopBarKt INSTANCE = new ComposableSingletons$ExploreFilterTopBarKt();
    private static q lambda$1007656446 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(9), false, 1007656446);
    private static p lambda$1146945446 = new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(8), false, 1146945446);

    public static final z lambda_1007656446$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            k2 a10 = i2.a(r1.j.g(echoTheme.getSpacings(qVar, i11).getX3()), i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            d5.m(p2.f(qVar2, 24), 1, echoTheme.getColors(qVar, i11).getBorder().getQuiniary(qVar, EchoThemeColors.Border.$stable), qVar, 54);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1146945446$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(9);
                qVar.h0(L);
            }
            p pVar = (p) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k(5);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(15);
                qVar.h0(L3);
            }
            ExploreFilterTopBarKt.ExploreFilterTopBar(tn.t.f33547a, u.f33548a, pVar, lVar, (ho.a) L3, null, null, qVar, 28086, 96);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1146945446$lambda$0$0$0(String str, List list) {
        str.getClass();
        list.getClass();
        return z.f31622a;
    }

    public static final z lambda_1146945446$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public final q getLambda$1007656446$app_productionRelease() {
        return lambda$1007656446;
    }

    public final p getLambda$1146945446$app_productionRelease() {
        return lambda$1146945446;
    }
}
