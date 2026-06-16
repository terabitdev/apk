package io.elevenlabs.readerapp.ui.screens.authenticated.series;

import a7.u;
import c3.j;
import c3.o;
import f4.f1;
import h4.g;
import h4.h;
import ho.p;
import ho.q;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.CollectionCategory;
import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import r1.s;
import sn.z;
import ta.z0;
import u2.l;
import u2.m;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExploreSeriesScreenKt {
    public static final ComposableSingletons$ExploreSeriesScreenKt INSTANCE = new ComposableSingletons$ExploreSeriesScreenKt();
    private static q lambda$2053551859 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(14), false, 2053551859);
    private static q lambda$420730049 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(15), false, 420730049);

    /* renamed from: lambda$-117846243 */
    private static q f609lambda$117846243 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(16), false, -117846243);

    /* renamed from: lambda$-424364666 */
    private static q f611lambda$424364666 = new j(new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(17), false, -424364666);
    private static p lambda$902956553 = new j(new a(0), false, 902956553);

    /* renamed from: lambda$-1737505919 */
    private static p f610lambda$1737505919 = new j(new a(1), false, -1737505919);

    public static final z lambda_2053551859$lambda$0(s sVar, m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (!qVar.O(i10 & 1, z6)) {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_420730049$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i.o(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, i3.q.f13017a, qVar);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_902956553$lambda$0(m mVar, int i10) {
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
        return z.f31622a;
    }

    public static final z lambda__117846243$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t E = r1.d.E(p2.e(i3.q.f13017a, 1.0f), 32);
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
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1737505919$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            List<ExploreRead> stubExploreReadList = ExploreFactoryKt.stubExploreReadList(6);
            ExploreCollectionDetails copy$default = ExploreCollectionDetails.copy$default(CollectionFactoryKt.stubExploreCollectionDetails(), null, null, null, null, CollectionCategory.Series, null, null, 111, null);
            stubExploreReadList.getClass();
            ua.b a10 = ua.d.a(new u(new z0(new u(new ta.z(stubExploreReadList, null), 3), z0.f32777e, z0.f32778f, new io.elevenlabs.readerapp.ui.components.e(stubExploreReadList, 6)), 3), qVar);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(12);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(8);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(13);
                qVar.h0(L3);
            }
            ExploreSeriesScreenKt.ExploreSeriesScreenUI(copy$default, a10, aVar, lVar, (ho.a) L3, null, null, lambda$902956553, qVar, 12611008, 96);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final boolean lambda__1737505919$lambda$0$0$0() {
        return true;
    }

    public static final z lambda__1737505919$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z lambda__424364666$lambda$0(t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            t E = r1.d.E(p2.e(i3.q.f13017a, 1.0f), 16);
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
            r.J(g.f11907f, d10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-117846243$app_productionRelease */
    public final q m1737getLambda$117846243$app_productionRelease() {
        return f609lambda$117846243;
    }

    /* renamed from: getLambda$-1737505919$app_productionRelease */
    public final p m1738getLambda$1737505919$app_productionRelease() {
        return f610lambda$1737505919;
    }

    /* renamed from: getLambda$-424364666$app_productionRelease */
    public final q m1739getLambda$424364666$app_productionRelease() {
        return f611lambda$424364666;
    }

    public final q getLambda$2053551859$app_productionRelease() {
        return lambda$2053551859;
    }

    public final q getLambda$420730049$app_productionRelease() {
        return lambda$420730049;
    }

    public final p getLambda$902956553$app_productionRelease() {
        return lambda$902956553;
    }
}
