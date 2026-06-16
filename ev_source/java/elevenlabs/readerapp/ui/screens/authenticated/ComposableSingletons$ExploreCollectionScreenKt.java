package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ExploreFactoryKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ExploreCollectionScreenKt {
    public static final ComposableSingletons$ExploreCollectionScreenKt INSTANCE = new ComposableSingletons$ExploreCollectionScreenKt();
    private static ho.q lambda$1162160120 = new c3.j(new c(1), false, 1162160120);
    private static ho.q lambda$1041201945 = new c3.j(new c(2), false, 1041201945);

    /* renamed from: lambda$-382791107 */
    private static ho.q f181lambda$382791107 = new c3.j(new c(3), false, -382791107);
    private static ho.q lambda$2055464820 = new c3.j(new c(4), false, 2055464820);
    private static ho.p lambda$827183577 = new c3.j(new b(2), false, 827183577);
    private static ho.p lambda$1833963981 = new c3.j(new b(3), false, 1833963981);
    private static ho.p lambda$1198483227 = new c3.j(new b(4), false, 1198483227);

    /* renamed from: lambda$-778844036 */
    private static ho.p f182lambda$778844036 = new c3.j(new b(5), false, -778844036);

    public static final sn.z lambda_1041201945$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ib.i.o(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, i3.q.f13017a, qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1162160120$lambda$0(r1.s sVar, u2.m mVar, int i10) {
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
        return sn.z.f31622a;
    }

    public static final sn.z lambda_1198483227$lambda$0(u2.m mVar, int i10) {
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

    public static final sn.z lambda_1833963981$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t d10 = p2.d(i3.q.f13017a, 1.0f);
            long primary = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new d(0);
                qVar.h0(L);
            }
            ErrorScreenKt.m1837ErrorScreenuDo3WH8(d10, null, "Something went wrong. Please try again.", primary, (ho.a) L, qVar, 24966, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_2055464820$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(p2.e(i3.q.f13017a, 1.0f), 16);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_827183577$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(p2.d(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__382791107$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(p2.e(i3.q.f13017a, 1.0f), 32);
            f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__778844036$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ExploreCollectionDetails stubExploreCollectionDetails = CollectionFactoryKt.stubExploreCollectionDetails();
            List<ExploreRead> stubExploreReadList = ExploreFactoryKt.stubExploreReadList(6);
            stubExploreReadList.getClass();
            ua.b a10 = ua.d.a(new a7.u(new ta.z0(new a7.u(new ta.z(stubExploreReadList, null), 3), ta.z0.f32777e, ta.z0.f32778f, new io.elevenlabs.readerapp.ui.components.e(stubExploreReadList, 6)), 3), qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new d(2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new w(7);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(1);
                qVar.h0(L3);
            }
            ExploreCollectionScreenKt.ExploreCollectionScreenUI(stubExploreCollectionDetails, a10, aVar, lVar, (ho.a) L3, null, null, lambda$1198483227, qVar, 12611008, 96);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final boolean lambda__778844036$lambda$0$0$0() {
        return true;
    }

    public static final sn.z lambda__778844036$lambda$0$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-382791107$app_productionRelease */
    public final ho.q m1190getLambda$382791107$app_productionRelease() {
        return f181lambda$382791107;
    }

    /* renamed from: getLambda$-778844036$app_productionRelease */
    public final ho.p m1191getLambda$778844036$app_productionRelease() {
        return f182lambda$778844036;
    }

    public final ho.q getLambda$1041201945$app_productionRelease() {
        return lambda$1041201945;
    }

    public final ho.q getLambda$1162160120$app_productionRelease() {
        return lambda$1162160120;
    }

    public final ho.p getLambda$1198483227$app_productionRelease() {
        return lambda$1198483227;
    }

    public final ho.p getLambda$1833963981$app_productionRelease() {
        return lambda$1833963981;
    }

    public final ho.q getLambda$2055464820$app_productionRelease() {
        return lambda$2055464820;
    }

    public final ho.p getLambda$827183577$app_productionRelease() {
        return lambda$827183577;
    }
}
