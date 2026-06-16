package io.elevenlabs.readerapp.ui.screens.authenticated.account.components;

import c3.o;
import ho.p;
import i3.t;
import io.elevenlabs.ui.echo.EchoTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.i2;
import r1.k2;
import r1.u0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$AccountAvatarKt {
    public static final ComposableSingletons$AccountAvatarKt INSTANCE = new ComposableSingletons$AccountAvatarKt();

    /* renamed from: lambda$-937152009 */
    private static p f209lambda$937152009 = new c3.j(new io.elevenlabs.readerapp.ui.components.explore.d(15), false, -937152009);

    public static final z lambda__937152009$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(ib.i.m(EchoTheme.INSTANCE, qVar, EchoTheme.$stable), i3.d.f13004y0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            AccountAvatarKt.m1235AccountAvatarhGBTI10("John Doe", "example@example.com", null, u.P, null, qVar, 54, 28);
            AccountAvatarKt.m1235AccountAvatarhGBTI10("Alex", "example@example.com", null, u.P, null, qVar, 54, 28);
            AccountAvatarKt.m1235AccountAvatarhGBTI10("John Doe", "example@example.com", null, u.P, "https://lh3.googleusercontent.com/a/default-user", qVar, 24630, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-937152009$app_productionRelease */
    public final p m1237getLambda$937152009$app_productionRelease() {
        return f209lambda$937152009;
    }
}
