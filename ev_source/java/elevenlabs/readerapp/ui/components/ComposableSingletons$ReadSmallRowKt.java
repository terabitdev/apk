package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.y2;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ReadSmallRowKt {
    public static final ComposableSingletons$ReadSmallRowKt INSTANCE = new ComposableSingletons$ReadSmallRowKt();
    private static ho.p lambda$1558816164 = new c3.j(new o(1), false, 1558816164);

    public static final sn.z lambda_1558816164$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            float x32 = echoTheme.getSpacings(qVar, i11).getX3();
            i3.q qVar2 = i3.q.f13017a;
            i3.t I = r1.d.I(qVar2, x32, t2.u.P, t2.u.P, t2.u.P, 14);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(I, qVar);
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
            y2.a(kd.a.M(R.drawable.playlist_drag, qVar, 0), null, p2.o(qVar2, 20), echoTheme.getColors(qVar, i11).getIcon().getInactive(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public final ho.p getLambda$1558816164$app_productionRelease() {
        return lambda$1558816164;
    }
}
