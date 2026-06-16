package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import c3.o;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import i3.q;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.ui.components.ActionPillKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d2;
import r1.j;
import r1.w;
import r1.x;
import rd.c1;
import sn.z;
import t2.u;
import u2.m;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList;", "item", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList$HomeActionItem;", "Lsn/z;", "onItemClick", "Li3/t;", "modifier", "HomeActionListSectionV4", "(Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList;Lho/l;Li3/t;Lu2/m;II)V", "Preview_HomeActionListSectionV4", "(Lu2/m;I)V", "Preview_HomeActionListSectionV4_NoTitle", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeActionListSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeActionListSectionV4(HomePageV4.Section.HomeActionList homeActionList, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        int i14;
        t tVar5;
        q qVar;
        boolean z10;
        float x02;
        boolean z11;
        int i15;
        int i16;
        homeActionList.getClass();
        lVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1772110032);
        if ((i10 & 6) == 0) {
            if (qVar2.h(homeActionList)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
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
                q qVar3 = q.f13017a;
                if (i17 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                x a10 = w.a(j.f29230c, i3.d.B0, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(tVar4, qVar2);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(g.f11907f, a10, qVar2);
                r.J(g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar2);
                r.J(g.f11905d, c5, qVar2);
                t tVar6 = tVar4;
                String title = homeActionList.getTitle();
                if (title != null) {
                    qVar2.X(465090292);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i18 = EchoTheme.$stable;
                    tVar5 = tVar6;
                    qVar = qVar3;
                    i14 = i12;
                    z10 = false;
                    j7.d(title, r1.d.G(qVar3, echoTheme.getSpacings(qVar2, i18).getX5(), u.P, 2), echoTheme.getColors(qVar2, i18).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i18).getLgCompact500(qVar2, EchoThemeTypography.$stable), qVar2, 0, 0, 131064);
                    qVar2 = qVar2;
                    qVar2.p(false);
                } else {
                    i14 = i12;
                    tVar5 = tVar6;
                    qVar = qVar3;
                    z10 = false;
                    qVar2.X(465334696);
                    qVar2.p(false);
                }
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                d2 d10 = r1.d.d(echoTheme2.getSpacings(qVar2, i19).getX5(), u.P, 2);
                r1.h m10 = i.m(echoTheme2, qVar2, i19);
                if (title != null) {
                    qVar2.X(1539039900);
                    x02 = echoTheme2.getSpacings(qVar2, i19).getX4();
                } else {
                    qVar2.X(1539040764);
                    x02 = echoTheme2.getSpacings(qVar2, i19).getX0();
                }
                qVar2.p(z10);
                t I = r1.d.I(qVar, u.P, x02, u.P, u.P, 13);
                boolean h10 = qVar2.h(homeActionList);
                if ((i14 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                boolean z12 = h10 | z11;
                Object L = qVar2.L();
                if (z12 || L == u2.l.f33918a) {
                    L = new io.elevenlabs.data.database.entities.reads.h(homeActionList, lVar, 9);
                    qVar2.h0(L);
                }
                c1.d(I, null, d10, m10, null, null, false, null, (l) L, qVar2, 0, 490);
                qVar2.p(true);
                tVar3 = tVar5;
            } else {
                qVar2.R();
                tVar3 = tVar2;
            }
            r10 = qVar2.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(homeActionList, lVar, tVar3, i10, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final z HomeActionListSectionV4$lambda$0$0$0(HomePageV4.Section.HomeActionList homeActionList, final l lVar, t1.t tVar) {
        tVar.getClass();
        final List<HomePageV4.Section.HomeActionList.HomeActionItem> items = homeActionList.getItems();
        final io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a aVar = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.a(9);
        final HomeActionListSectionKt$HomeActionListSectionV4$lambda$0$0$0$$inlined$items$default$1 homeActionListSectionKt$HomeActionListSectionV4$lambda$0$0$0$$inlined$items$default$1 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt$HomeActionListSectionV4$lambda$0$0$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((HomePageV4.Section.HomeActionList.HomeActionItem) obj);
            }

            @Override // ho.l
            public final Void invoke(HomePageV4.Section.HomeActionList.HomeActionItem homeActionItem) {
                return null;
            }
        };
        ((t1.i) tVar).u(items.size(), new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt$HomeActionListSectionV4$lambda$0$0$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return l.this.invoke(items.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt$HomeActionListSectionV4$lambda$0$0$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return l.this.invoke(items.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt$HomeActionListSectionV4$lambda$0$0$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final HomePageV4.Section.HomeActionList.HomeActionItem homeActionItem = (HomePageV4.Section.HomeActionList.HomeActionItem) items.get(i10);
                    qVar.X(-2090549132);
                    String title = homeActionItem.getTitle();
                    String iconUrl = homeActionItem.getIconUrl();
                    boolean f10 = qVar.f(lVar) | qVar.h(homeActionItem);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeActionListSectionKt$HomeActionListSectionV4$1$1$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1444invoke() {
                                l.this.invoke(homeActionItem);
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1444invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ActionPillKt.ActionPill(title, iconUrl, (ho.a) L, null, qVar, 0, 8);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        return z.f31622a;
    }

    public static final Object HomeActionListSectionV4$lambda$0$0$0$0(HomePageV4.Section.HomeActionList.HomeActionItem homeActionItem) {
        homeActionItem.getClass();
        return homeActionItem.getAnalyticsId();
    }

    public static final z HomeActionListSectionV4$lambda$1(HomePageV4.Section.HomeActionList homeActionList, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        HomeActionListSectionV4(homeActionList, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_HomeActionListSectionV4(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2119625680);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeActionListSectionKt.INSTANCE.m1427getLambda$1032179018$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 15);
        }
    }

    public static final z Preview_HomeActionListSectionV4$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeActionListSectionV4(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_HomeActionListSectionV4_NoTitle(m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-835641720);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$HomeActionListSectionKt.INSTANCE.getLambda$724180846$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 14);
        }
    }

    public static final z Preview_HomeActionListSectionV4_NoTitle$lambda$0(int i10, m mVar, int i11) {
        Preview_HomeActionListSectionV4_NoTitle(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
