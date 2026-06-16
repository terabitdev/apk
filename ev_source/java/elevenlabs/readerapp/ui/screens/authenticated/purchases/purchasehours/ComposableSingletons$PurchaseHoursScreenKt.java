package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import c3.o;
import f4.f1;
import ho.p;
import ho.q;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.CustomerFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ProductsFactoryKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.r;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PurchaseHoursScreenKt {

    /* renamed from: lambda$-1904014941 */
    private static q f559lambda$1904014941;
    private static q lambda$1353451145;
    public static final ComposableSingletons$PurchaseHoursScreenKt INSTANCE = new ComposableSingletons$PurchaseHoursScreenKt();
    private static p lambda$1745360728 = new c3.j(new a(7), false, 1745360728);
    private static p lambda$778236748 = new c3.j(new a(8), false, 778236748);
    private static p lambda$890986107 = new c3.j(new a(9), false, 890986107);
    private static p lambda$1783112443 = new c3.j(new a(10), false, 1783112443);
    private static p lambda$830330500 = new c3.j(new a(11), false, 830330500);
    private static p lambda$643206520 = new c3.j(new a(12), false, 643206520);
    private static p lambda$1798194397 = new c3.j(new a(13), false, 1798194397);

    static {
        final int i10 = 0;
        f559lambda$1904014941 = new c3.j(new q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.b
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda__1904014941$lambda$0;
                z lambda_1353451145$lambda$0;
                int i11 = i10;
                t1.b bVar = (t1.b) obj;
                u2.m mVar = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i11) {
                    case 0:
                        lambda__1904014941$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda__1904014941$lambda$0(bVar, mVar, intValue);
                        return lambda__1904014941$lambda$0;
                    default:
                        lambda_1353451145$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_1353451145$lambda$0(bVar, mVar, intValue);
                        return lambda_1353451145$lambda$0;
                }
            }
        }, false, -1904014941);
        final int i11 = 1;
        lambda$1353451145 = new c3.j(new q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.b
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                z lambda__1904014941$lambda$0;
                z lambda_1353451145$lambda$0;
                int i112 = i11;
                t1.b bVar = (t1.b) obj;
                u2.m mVar = (u2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                switch (i112) {
                    case 0:
                        lambda__1904014941$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda__1904014941$lambda$0(bVar, mVar, intValue);
                        return lambda__1904014941$lambda$0;
                    default:
                        lambda_1353451145$lambda$0 = ComposableSingletons$PurchaseHoursScreenKt.lambda_1353451145$lambda$0(bVar, mVar, intValue);
                        return lambda_1353451145$lambda$0;
                }
            }
        }, false, 1353451145);
    }

    public static final z lambda_1353451145$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t I = r1.d.I(e10, u.P, elevenLabsTheme.getSpacings(qVar, i11).m2355getX3D9Ej5fM(), u.P, elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM(), 5);
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
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
            j7.d(kj.c.R(qVar, R.string.hours_page_subscribers_info), r1.d.I(p2.e(qVar2, 1.0f), u.P, elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM(), u.P, u.P, 13), ib.i.w(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodySmall500(), qVar, 0, 0, 130040);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1745360728$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursScreenKt.PurchaseHoursScreenUI(new PurchaseHoursState(true, null, null, null, false, null, null, 126, null), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1783112443$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursState purchaseHoursState = new PurchaseHoursState(false, null, null, ProductsFactoryKt.stubOneTimeProductsPage(qVar, 0), false, null, CustomerFactoryKt.stubCustomer(), 54, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new c(2);
                qVar.h0(L);
            }
            PurchaseHoursScreenKt.PurchaseHoursScreenUI(purchaseHoursState, null, null, null, (ho.a) L, qVar, 24576, 14);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1798194397$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursState purchaseHoursState = new PurchaseHoursState(false, null, null, ProductsFactoryKt.stubOneTimeProductsPage(qVar, 0), false, ProductsFactoryKt.stubOneTimeCreditsProduct(), null, 86, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new c(4);
                qVar.h0(L);
            }
            PurchaseHoursScreenKt.PurchaseHoursScreenUI(purchaseHoursState, null, null, null, (ho.a) L, qVar, 24576, 14);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_643206520$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursState purchaseHoursState = new PurchaseHoursState(false, null, "Failed to make purchase", null, false, null, CustomerFactoryKt.stubCustomer(), 42, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new c(1);
                qVar.h0(L);
            }
            PurchaseHoursScreenKt.PurchaseHoursScreenUI(purchaseHoursState, null, null, null, (ho.a) L, qVar, 24576, 14);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_778236748$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursScreenKt.PurchaseHoursScreenUI(new PurchaseHoursState(false, "Failed to load products", null, null, false, null, null, 124, null), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_830330500$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursState purchaseHoursState = new PurchaseHoursState(false, null, null, ProductsFactoryKt.stubOneTimeProductsPage(qVar, 0), true, null, CustomerFactoryKt.stubCustomer(), 38, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new c(3);
                qVar.h0(L);
            }
            PurchaseHoursScreenKt.PurchaseHoursScreenUI(purchaseHoursState, null, null, null, (ho.a) L, qVar, 24576, 14);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_890986107$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PurchaseHoursState purchaseHoursState = new PurchaseHoursState(false, null, null, ProductsFactoryKt.stubOneTimeProductsPage(qVar, 0), false, null, CustomerFactoryKt.stubCustomer(), 54, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new c(0);
                qVar.h0(L);
            }
            PurchaseHoursScreenKt.PurchaseHoursScreenUI(purchaseHoursState, null, null, null, (ho.a) L, qVar, 24576, 14);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1904014941$lambda$0(t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float m2356getX4D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM();
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(r1.d.E(qVar2, m2356getX4D9Ej5fM), 1.0f);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(e10, qVar);
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
            DividerKt.m1828DividerLightiJQMabo(p2.s(qVar2, 120), 0L, qVar, 6, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* renamed from: getLambda$-1904014941$app_productionRelease */
    public final q m1666getLambda$1904014941$app_productionRelease() {
        return f559lambda$1904014941;
    }

    public final q getLambda$1353451145$app_productionRelease() {
        return lambda$1353451145;
    }

    public final p getLambda$1745360728$app_productionRelease() {
        return lambda$1745360728;
    }

    public final p getLambda$1783112443$app_productionRelease() {
        return lambda$1783112443;
    }

    public final p getLambda$1798194397$app_productionRelease() {
        return lambda$1798194397;
    }

    public final p getLambda$643206520$app_productionRelease() {
        return lambda$643206520;
    }

    public final p getLambda$778236748$app_productionRelease() {
        return lambda$778236748;
    }

    public final p getLambda$830330500$app_productionRelease() {
        return lambda$830330500;
    }

    public final p getLambda$890986107$app_productionRelease() {
        return lambda$890986107;
    }
}
