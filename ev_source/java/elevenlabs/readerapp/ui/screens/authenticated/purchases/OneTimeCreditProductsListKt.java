package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.readerapp.ui.formatter.MoneyPriceFormatterKt;
import io.elevenlabs.readerapp.ui.previews.ProductsFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.SelectableBadgeBoxKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "products", "Lkotlin/Function1;", "Lsn/z;", "onProductSelected", "OneTimeCreditProductsList", "(Ljava/util/List;Lho/l;Lu2/m;I)V", "product", "Lkotlin/Function0;", "onClick", "OneTimeCreditsProductItem", "(Lio/elevenlabs/domain/model/OneTimeCreditsProduct;Lho/a;Lu2/m;I)V", "Preview_OneTimeCreditProductsList", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OneTimeCreditProductsListKt {
    public static final void OneTimeCreditProductsList(List<OneTimeCreditsProduct> list, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        list.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1887827198);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM()), i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c5, h4.g.f11905d, -1481905537, list);
            while (s10.hasNext()) {
                OneTimeCreditsProduct oneTimeCreditsProduct = (OneTimeCreditsProduct) s10.next();
                if ((i11 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean h10 = z10 | qVar.h(oneTimeCreditsProduct);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new t(lVar, oneTimeCreditsProduct, 0);
                    qVar.h0(L);
                }
                OneTimeCreditsProductItem(oneTimeCreditsProduct, (ho.a) L, qVar, 0);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.k(list, lVar, i10, 1);
        }
    }

    public static final sn.z OneTimeCreditProductsList$lambda$0$0$0$0(ho.l lVar, OneTimeCreditsProduct oneTimeCreditsProduct) {
        lVar.invoke(oneTimeCreditsProduct);
        return sn.z.f31622a;
    }

    public static final sn.z OneTimeCreditProductsList$lambda$1(List list, ho.l lVar, int i10, u2.m mVar, int i11) {
        OneTimeCreditProductsList(list, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void OneTimeCreditsProductItem(OneTimeCreditsProduct oneTimeCreditsProduct, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-14142232);
        if ((i10 & 6) == 0) {
            if (qVar.h(oneTimeCreditsProduct)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            aVar2 = aVar;
            SelectableBadgeBoxKt.SelectableBadgeBox(oneTimeCreditsProduct.getTitle() + " - " + oneTimeCreditsProduct.getDescription() + " - " + MoneyPriceFormatterKt.format(oneTimeCreditsProduct.getPrice()), false, aVar2, null, null, c3.k.d(-1800813544, true, new n(oneTimeCreditsProduct, 1), qVar), qVar, ((i11 << 3) & 896) | 221232, 8);
        } else {
            aVar2 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new s(oneTimeCreditsProduct, aVar2, i10, 0);
        }
    }

    public static final sn.z OneTimeCreditsProductItem$lambda$0(OneTimeCreditsProduct oneTimeCreditsProduct, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            i3.k kVar = i3.d.f13005z0;
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(u0Var, kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            r1.h g10 = r1.j.g(6);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            r1.x a11 = r1.w.a(g10, i3.d.B0, qVar, 6);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            i3.t e11 = p2.e(qVar2, 1.0f);
            k2 a12 = i2.a(u0Var, kVar, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(e11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            u3.c M = kd.a.M(R.drawable.clock__time__timer, qVar, 0);
            i3.t o6 = p2.o(qVar2, 16);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            l1.n.c(M, null, o6, null, null, t2.u.P, new p3.n(defpackage.f.b(elevenLabsTheme, qVar, i11), 5), qVar, u3.c.$stable | 432, 56);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2350getX1D9Ej5fM()), qVar);
            j7.d(oneTimeCreditsProduct.getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyLarge500(), qVar, 0, 0, 131066);
            u2.q qVar3 = qVar;
            qVar3.p(true);
            String description = oneTimeCreditsProduct.getDescription();
            if (description != null && !wq.n.m0(description)) {
                qVar3.X(1147535553);
                j7.d(description, null, defpackage.f.A(elevenLabsTheme, qVar3, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i11).getBodySmall500(), qVar3, 0, 0, 131066);
                qVar3 = qVar3;
                qVar3.p(false);
            } else {
                qVar3.X(1147752336);
                qVar3.p(false);
            }
            qVar3.p(true);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar3, i11).m2356getX4D9Ej5fM()), qVar3);
            u2.q qVar4 = qVar3;
            j7.d(MoneyPriceFormatterKt.format(oneTimeCreditsProduct.getPrice()), null, defpackage.f.b(elevenLabsTheme, qVar3, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i11).getBodyLarge600(), qVar4, 0, 0, 131066);
            qVar4.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z OneTimeCreditsProductItem$lambda$1(OneTimeCreditsProduct oneTimeCreditsProduct, ho.a aVar, int i10, u2.m mVar, int i11) {
        OneTimeCreditsProductItem(oneTimeCreditsProduct, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_OneTimeCreditProductsList(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1538568914);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List I = ig.f.I(OneTimeCreditsProduct.copy$default(ProductsFactoryKt.stubOneTimeCreditsProduct(), null, null, "Description", null, 11, null), OneTimeCreditsProduct.copy$default(ProductsFactoryKt.stubOneTimeCreditsProduct(), null, null, null, null, 11, null));
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new k(14);
                qVar.h0(L);
            }
            OneTimeCreditProductsList(I, (ho.l) L, qVar, 48);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.h(i10, 17);
        }
    }

    public static final sn.z Preview_OneTimeCreditProductsList$lambda$0$0(OneTimeCreditsProduct oneTimeCreditsProduct) {
        oneTimeCreditsProduct.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_OneTimeCreditProductsList$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_OneTimeCreditProductsList(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
