package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import c3.o;
import e5.k;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.components.SectionHeaderKt;
import io.elevenlabs.ui.components.SectionHeaderStyle;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList;", "item", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList$HomeActionItem;", "Lsn/z;", "onItemClick", "Li3/t;", "modifier", "HomeActionListSectionV3", "(Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList;Lho/l;Li3/t;Lu2/m;II)V", "Lkotlin/Function0;", "onClick", "HomeActionItemV3", "(Lio/elevenlabs/domain/model/home/HomePageV3$Section$HomeActionList$HomeActionItem;Lho/a;Li3/t;Lu2/m;II)V", "Preview_HomeActionListSectionV3", "(Lu2/m;I)V", "Preview_HomeActionListSectionV3_SingleItem", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeActionListSectionV2Kt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeActionItemV3(HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        int i14;
        int i15;
        homeActionItem.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-125202408);
        if ((i10 & 6) == 0) {
            if (qVar.h(homeActionItem)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            boolean z10 = false;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i17 = ElevenLabsTheme.$stable;
                z1.g b10 = z1.h.b(elevenLabsTheme.getSpacings(qVar, i17).m2355getX3D9Ej5fM());
                t c5 = m3.h.c(tVar3, b10);
                if ((i12 & 112) == 32) {
                    z10 = true;
                }
                Object L = qVar.L();
                if (z10 || L == l.f33918a) {
                    L = new fm.g(20, aVar);
                    qVar.h0(L);
                }
                t x10 = i.x(elevenLabsTheme, qVar, i17, n.h(n.p(c5, false, null, null, null, (ho.a) L, 15), elevenLabsTheme.getColor(qVar, i17).getSquareIconButton().m2168getBg0d7_KjU(), b10));
                u0 u0Var = j.f29228a;
                x a10 = w.a(j.i(elevenLabsTheme.getSpacings(qVar, i17).m2353getX2D9Ej5fM(), i3.d.f13005z0), i3.d.C0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c10 = i3.a.c(x10, qVar);
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
                r.J(h4.g.f11905d, c10, qVar);
                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(homeActionItem.getIconUrl(), p2.o(qVar2, 24), new p3.x(elevenLabsTheme.getColor(qVar, i17).getSquareIconButton().m2169getFg0d7_KjU()), null, null, Integer.valueOf(R.drawable.more_dots), null, qVar, 48, 88);
                j7.d(homeActionItem.getTitle(), p2.e(qVar2, 1.0f), 0L, 0L, null, 0L, new k(3), 0L, 2, false, 2, 2, null, elevenLabsTheme.getTypo(qVar, i17).getBodyXSmall500(), qVar, 48, 221568, 76796);
                qVar = qVar;
                qVar.p(true);
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new c(homeActionItem, aVar, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z102 = false;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeActionItemV3$lambda$0$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z HomeActionItemV3$lambda$2(HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        HomeActionItemV3(homeActionItem, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeActionListSectionV3(HomePageV3.Section.HomeActionList homeActionList, ho.l lVar, t tVar, m mVar, int i10, int i11) {
        HomePageV3.Section.HomeActionList homeActionList2;
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        ho.l lVar2;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        int i14;
        int i15;
        homeActionList.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(224528310);
        if ((i10 & 6) == 0) {
            homeActionList2 = homeActionList;
            if (qVar2.h(homeActionList2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            homeActionList2 = homeActionList;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i17 = ElevenLabsTheme.$stable;
                t I = r1.d.I(tVar4, u.P, u.P, u.P, elevenLabsTheme.getSpacings(qVar2, i17).m2356getX4D9Ej5fM(), 7);
                x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(I, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                h4.e eVar = h4.g.f11907f;
                r.J(eVar, a10, qVar2);
                h4.e eVar2 = h4.g.f11906e;
                r.J(eVar2, l4, qVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                r.y(qVar2, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar2);
                h4.e eVar4 = h4.g.f11905d;
                r.J(eVar4, c5, qVar2);
                qVar = qVar2;
                int i18 = i12;
                SectionHeaderKt.SectionHeader(homeActionList2.getTitle(), SectionHeaderStyle.Large, null, null, qVar, 48, 12);
                t G = r1.d.G(p2.e(tVar4, 1.0f), elevenLabsTheme.getSpacings(qVar, i17).m2357getX5D9Ej5fM(), u.P, 2);
                k2 a11 = i2.a(i.n(elevenLabsTheme, qVar, i17), i3.d.f13004y0, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c10 = i3.a.c(G, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, a11, qVar);
                r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c10, qVar);
                qVar.X(-1592439419);
                for (HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem : homeActionList.getItems()) {
                    if ((i18 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean h10 = qVar.h(homeActionItem) | z10;
                    Object L = qVar.L();
                    if (h10 || L == l.f33918a) {
                        L = new a2.q(lVar, homeActionItem, 25);
                        qVar.h0(L);
                    }
                    ho.a aVar = (ho.a) L;
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    q qVar3 = qVar;
                    HomeActionItemV3(homeActionItem, aVar, new m1(1.0f, true), qVar3, 0, 0);
                    qVar = qVar3;
                }
                lVar2 = lVar;
                p.n.t(qVar, false, true, true);
                tVar3 = tVar4;
            } else {
                lVar2 = lVar;
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new c(homeActionList, lVar2, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeActionListSectionV3$lambda$0$0$0$0$0(ho.l lVar, HomePageV3.Section.HomeActionList.HomeActionItem homeActionItem) {
        lVar.invoke(homeActionItem);
        return z.f31622a;
    }

    public static final z HomeActionListSectionV3$lambda$1(HomePageV3.Section.HomeActionList homeActionList, ho.l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        HomeActionListSectionV3(homeActionList, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HomeActionListSectionV3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1576178132);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$HomeActionListSectionV2Kt.INSTANCE.m1414getLambda$1901291286$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 1);
        }
    }

    public static final z Preview_HomeActionListSectionV3$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeActionListSectionV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeActionListSectionV3_SingleItem(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1128277702);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$HomeActionListSectionV2Kt.INSTANCE.getLambda$948938852$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 0);
        }
    }

    public static final z Preview_HomeActionListSectionV3_SingleItem$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeActionListSectionV3_SingleItem(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
