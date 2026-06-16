package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import a2.d0;
import c3.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import h4.f2;
import ho.l;
import ho.p;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.domain.model.PageFilter;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import r1.c3;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import t2.u;
import tn.o;
import tn.t;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u008b\u0001\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "", "Lio/elevenlabs/domain/model/PageFilter;", "pageFilters", "", "", "filterOptions", "Lkotlin/Function2;", "onUpdateFilter", "Lkotlin/Function1;", "onClearFilter", "onResetFilters", "ExploreFiltersBottomSheet", "(Lho/a;Ljava/util/List;Ljava/util/Map;Lho/p;Lho/l;Lho/a;Lu2/m;II)V", "Preview_ExploreFiltersBottomSheet", "(Lu2/m;I)V", "showFilterSheet", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreFiltersBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:124:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreFiltersBottomSheet(ho.a aVar, List<? extends PageFilter> list, Map<String, ? extends List<String>> map, final p pVar, final l lVar, ho.a aVar2, m mVar, int i10, int i11) {
        int i12;
        List<? extends PageFilter> list2;
        ho.a aVar3;
        int i13;
        int i14;
        boolean z6;
        r1 r10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        aVar.getClass();
        list.getClass();
        map.getClass();
        pVar.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(978757305);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            list2 = list;
            if (qVar.h(list2)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        } else {
            list2 = list;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(map)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(pVar)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        int i20 = i11 & 32;
        if (i20 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            aVar3 = aVar2;
            if (qVar.h(aVar3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i12;
            if ((74899 & i14) == 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i14 & 1, z6)) {
                String str = null;
                if (i20 != 0) {
                    aVar3 = null;
                }
                Object L = qVar.L();
                Object obj = u2.l.f33918a;
                if (L == obj) {
                    L = r.A(null);
                    qVar.h0(L);
                }
                z0 z0Var = (z0) L;
                if (!map.isEmpty()) {
                    Iterator<Map.Entry<String, ? extends List<String>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!it.next().getValue().isEmpty()) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar, kj.c.R(qVar, R.string.explore_filters_title), true, null, null, k.d(921317830, true, new c(list2, map, z0Var, aVar3, z10), qVar), qVar, ((i14 << 3) & 112) | 1575936, 49);
                qVar = qVar;
                final PageFilter ExploreFiltersBottomSheet$lambda$1 = ExploreFiltersBottomSheet$lambda$1(z0Var);
                if (ExploreFiltersBottomSheet$lambda$1 == null) {
                    qVar.X(-370080541);
                    qVar.p(false);
                } else {
                    qVar.X(-370080540);
                    if (ExploreFiltersBottomSheet$lambda$1 instanceof PageFilter.ExplorePageOneOptionFilterResponseModel) {
                        qVar.X(2104704066);
                        Object L2 = qVar.L();
                        if (L2 == obj) {
                            L2 = new d0(z0Var, 13);
                            qVar.h0(L2);
                        }
                        ho.a aVar4 = (ho.a) L2;
                        PageFilter.ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel = (PageFilter.ExplorePageOneOptionFilterResponseModel) ExploreFiltersBottomSheet$lambda$1;
                        String title = explorePageOneOptionFilterResponseModel.getTitle();
                        List<KeyLabel> options = explorePageOneOptionFilterResponseModel.getOptions();
                        List<String> list3 = map.get(explorePageOneOptionFilterResponseModel.getKey());
                        if (list3 != null) {
                            str = (String) o.y0(list3);
                        }
                        if ((i14 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean h10 = z13 | qVar.h(ExploreFiltersBottomSheet$lambda$1);
                        Object L3 = qVar.L();
                        if (h10 || L3 == obj) {
                            final int i21 = 0;
                            L3 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.e
                                @Override // ho.l
                                public final Object invoke(Object obj2) {
                                    z ExploreFiltersBottomSheet$lambda$5$1$0;
                                    z ExploreFiltersBottomSheet$lambda$5$4$0;
                                    switch (i21) {
                                        case 0:
                                            ExploreFiltersBottomSheet$lambda$5$1$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$1$0(pVar, ExploreFiltersBottomSheet$lambda$1, (String) obj2);
                                            return ExploreFiltersBottomSheet$lambda$5$1$0;
                                        default:
                                            ExploreFiltersBottomSheet$lambda$5$4$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$4$0(pVar, ExploreFiltersBottomSheet$lambda$1, (List) obj2);
                                            return ExploreFiltersBottomSheet$lambda$5$4$0;
                                    }
                                }
                            };
                            qVar.h0(L3);
                        }
                        l lVar2 = (l) L3;
                        if ((i14 & 57344) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean h11 = z14 | qVar.h(ExploreFiltersBottomSheet$lambda$1);
                        Object L4 = qVar.L();
                        if (h11 || L4 == obj) {
                            final int i22 = 0;
                            L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.f
                                @Override // ho.a
                                public final Object invoke() {
                                    z ExploreFiltersBottomSheet$lambda$5$2$0;
                                    z ExploreFiltersBottomSheet$lambda$5$5$0;
                                    switch (i22) {
                                        case 0:
                                            ExploreFiltersBottomSheet$lambda$5$2$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$2$0(lVar, ExploreFiltersBottomSheet$lambda$1);
                                            return ExploreFiltersBottomSheet$lambda$5$2$0;
                                        default:
                                            ExploreFiltersBottomSheet$lambda$5$5$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$5$0(lVar, ExploreFiltersBottomSheet$lambda$1);
                                            return ExploreFiltersBottomSheet$lambda$5$5$0;
                                    }
                                }
                            };
                            qVar.h0(L4);
                        }
                        SingleOptionFilterBottomSheetKt.SingleOptionFilterBottomSheet(aVar4, title, options, str, lVar2, (ho.a) L4, qVar, 6, 0);
                        qVar.p(false);
                    } else if (ExploreFiltersBottomSheet$lambda$1 instanceof PageFilter.ExplorePageMultiOptionFilterResponseModel) {
                        qVar.X(2105247341);
                        Object L5 = qVar.L();
                        if (L5 == obj) {
                            L5 = new d0(z0Var, 14);
                            qVar.h0(L5);
                        }
                        ho.a aVar5 = (ho.a) L5;
                        PageFilter.ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel = (PageFilter.ExplorePageMultiOptionFilterResponseModel) ExploreFiltersBottomSheet$lambda$1;
                        String title2 = explorePageMultiOptionFilterResponseModel.getTitle();
                        List<KeyLabel> options2 = explorePageMultiOptionFilterResponseModel.getOptions();
                        List<String> list4 = map.get(explorePageMultiOptionFilterResponseModel.getKey());
                        if (list4 == null) {
                            list4 = t.f33547a;
                        }
                        Set l12 = o.l1(list4);
                        if ((i14 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean h12 = z11 | qVar.h(ExploreFiltersBottomSheet$lambda$1);
                        Object L6 = qVar.L();
                        if (h12 || L6 == obj) {
                            final int i23 = 1;
                            L6 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.e
                                @Override // ho.l
                                public final Object invoke(Object obj2) {
                                    z ExploreFiltersBottomSheet$lambda$5$1$0;
                                    z ExploreFiltersBottomSheet$lambda$5$4$0;
                                    switch (i23) {
                                        case 0:
                                            ExploreFiltersBottomSheet$lambda$5$1$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$1$0(pVar, ExploreFiltersBottomSheet$lambda$1, (String) obj2);
                                            return ExploreFiltersBottomSheet$lambda$5$1$0;
                                        default:
                                            ExploreFiltersBottomSheet$lambda$5$4$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$4$0(pVar, ExploreFiltersBottomSheet$lambda$1, (List) obj2);
                                            return ExploreFiltersBottomSheet$lambda$5$4$0;
                                    }
                                }
                            };
                            qVar.h0(L6);
                        }
                        l lVar3 = (l) L6;
                        if ((i14 & 57344) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean h13 = z12 | qVar.h(ExploreFiltersBottomSheet$lambda$1);
                        Object L7 = qVar.L();
                        if (h13 || L7 == obj) {
                            final int i24 = 1;
                            L7 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.f
                                @Override // ho.a
                                public final Object invoke() {
                                    z ExploreFiltersBottomSheet$lambda$5$2$0;
                                    z ExploreFiltersBottomSheet$lambda$5$5$0;
                                    switch (i24) {
                                        case 0:
                                            ExploreFiltersBottomSheet$lambda$5$2$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$2$0(lVar, ExploreFiltersBottomSheet$lambda$1);
                                            return ExploreFiltersBottomSheet$lambda$5$2$0;
                                        default:
                                            ExploreFiltersBottomSheet$lambda$5$5$0 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$5$5$0(lVar, ExploreFiltersBottomSheet$lambda$1);
                                            return ExploreFiltersBottomSheet$lambda$5$5$0;
                                    }
                                }
                            };
                            qVar.h0(L7);
                        }
                        MultiOptionFilterBottomSheetKt.MultiOptionFilterBottomSheet(aVar5, title2, options2, l12, lVar3, (ho.a) L7, qVar, 6, 0);
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(622080920, qVar, false);
                    }
                    qVar.p(false);
                }
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new u0(aVar, list, map, pVar, lVar, aVar3, i10, i11, 4);
                return;
            }
            return;
        }
        aVar3 = aVar2;
        i14 = i12;
        if ((74899 & i14) == 74898) {
        }
        if (!qVar.O(i14 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final PageFilter ExploreFiltersBottomSheet$lambda$1(z0 z0Var) {
        return (PageFilter) z0Var.getValue();
    }

    public static final z ExploreFiltersBottomSheet$lambda$4(List list, Map map, z0 z0Var, ho.a aVar, boolean z6, y yVar, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        BottomSheetControl bottomSheetControl2;
        i3.q qVar;
        float f10;
        u2.e eVar;
        q qVar2;
        boolean z10;
        i3.t e10;
        float f11;
        boolean z11;
        float f12;
        String str;
        Object obj;
        m mVar2 = mVar;
        yVar.getClass();
        bottomSheetControl.getClass();
        i3.q qVar3 = i3.q.f13017a;
        i3.t d10 = p2.d(qVar3, 1.0f);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i11 = EchoTheme.$stable;
        i3.t I = r1.d.I(d10, u.P, u.P, u.P, echoTheme.getSpacings(mVar2, i11).getX4(), 7);
        r1.e eVar2 = r1.j.f29230c;
        i3.j jVar = i3.d.B0;
        x a10 = w.a(eVar2, jVar, mVar2, 0);
        q qVar4 = (q) mVar2;
        int hashCode = Long.hashCode(qVar4.T);
        c3.o l4 = qVar4.l();
        i3.t c5 = i3.a.c(I, mVar2);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar4.f33969a;
        qVar4.b0();
        if (qVar4.S) {
            qVar4.k(fVar);
        } else {
            qVar4.k0();
        }
        h4.e eVar3 = h4.g.f11907f;
        r.J(eVar3, a10, mVar2);
        h4.e eVar4 = h4.g.f11906e;
        r.J(eVar4, l4, mVar2);
        Integer valueOf = Integer.valueOf(hashCode);
        h4.e eVar5 = h4.g.f11908g;
        r.y(mVar2, valueOf, eVar5);
        h4.d dVar = h4.g.f11909h;
        r.F(dVar, mVar2);
        h4.e eVar6 = h4.g.f11905d;
        r.J(eVar6, c5, mVar2);
        if (1.0f <= 0.0d) {
            s1.a.a("invalid weight; must be greater than zero");
        }
        i3.t G = r1.d.G(n.y(new m1(1.0f, true), n.x(mVar2), true, true), u.P, echoTheme.getSpacings(mVar2, i11).getX4(), 1);
        x a11 = w.a(r1.j.g(echoTheme.getSpacings(mVar2, i11).getX2()), jVar, mVar2, 0);
        int hashCode2 = Long.hashCode(qVar4.T);
        c3.o l7 = qVar4.l();
        i3.t c10 = i3.a.c(G, mVar2);
        qVar4.b0();
        if (qVar4.S) {
            qVar4.k(fVar);
        } else {
            qVar4.k0();
        }
        r.J(eVar3, a11, mVar2);
        r.J(eVar4, l7, mVar2);
        r.y(mVar2, Integer.valueOf(hashCode2), eVar5);
        r.F(dVar, mVar2);
        r.J(eVar6, c10, mVar2);
        qVar4.X(996869612);
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            u2.e eVar7 = u2.l.f33918a;
            if (hasNext) {
                PageFilter pageFilter = (PageFilter) it.next();
                String str2 = null;
                if (pageFilter instanceof PageFilter.ExplorePageOneOptionFilterResponseModel) {
                    qVar4.X(2085048248);
                    PageFilter.ExplorePageOneOptionFilterResponseModel explorePageOneOptionFilterResponseModel = (PageFilter.ExplorePageOneOptionFilterResponseModel) pageFilter;
                    List list2 = (List) map.get(explorePageOneOptionFilterResponseModel.getKey());
                    if (list2 != null) {
                        str = (String) o.y0(list2);
                    } else {
                        str = null;
                    }
                    Iterator<T> it2 = explorePageOneOptionFilterResponseModel.getOptions().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (kotlin.jvm.internal.m.c(((KeyLabel) obj).getKey(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    KeyLabel keyLabel = (KeyLabel) obj;
                    String title = explorePageOneOptionFilterResponseModel.getTitle();
                    if (keyLabel != null) {
                        str2 = keyLabel.getLabel();
                    }
                    boolean h10 = qVar4.h(pageFilter);
                    Object L = qVar4.L();
                    if (h10 || L == eVar7) {
                        L = new a2.q(explorePageOneOptionFilterResponseModel, z0Var, 21);
                        qVar4.h0(L);
                    }
                    FilterRowKt.FilterRow(title, str2, (ho.a) L, null, mVar2, 0, 8);
                    qVar4.p(false);
                    mVar2 = mVar;
                } else if (pageFilter instanceof PageFilter.ExplorePageMultiOptionFilterResponseModel) {
                    qVar4.X(2085664528);
                    PageFilter.ExplorePageMultiOptionFilterResponseModel explorePageMultiOptionFilterResponseModel = (PageFilter.ExplorePageMultiOptionFilterResponseModel) pageFilter;
                    Iterable iterable = (List) map.get(explorePageMultiOptionFilterResponseModel.getKey());
                    if (iterable == null) {
                        iterable = t.f33547a;
                    }
                    Set l12 = o.l1(iterable);
                    List<KeyLabel> options = explorePageMultiOptionFilterResponseModel.getOptions();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : options) {
                        if (l12.contains(((KeyLabel) obj2).getKey())) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() == 1) {
                            str2 = ((KeyLabel) o.w0(arrayList)).getLabel();
                        } else {
                            str2 = ((KeyLabel) o.w0(arrayList)).getLabel() + " +" + (arrayList.size() - 1);
                        }
                    }
                    String title2 = explorePageMultiOptionFilterResponseModel.getTitle();
                    boolean h11 = qVar4.h(pageFilter);
                    Object L2 = qVar4.L();
                    if (h11 || L2 == eVar7) {
                        L2 = new a2.q(explorePageMultiOptionFilterResponseModel, z0Var, 22);
                        qVar4.h0(L2);
                    }
                    ho.a aVar2 = (ho.a) L2;
                    mVar2 = mVar;
                    FilterRowKt.FilterRow(title2, str2, aVar2, null, mVar2, 0, 8);
                    qVar4.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(1314183564, qVar4, false);
                }
            } else {
                qVar4.p(false);
                qVar4.p(true);
                i3.t e11 = p2.e(qVar3, 1.0f);
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i12 = EchoTheme.$stable;
                i3.t G2 = r1.d.G(e11, echoTheme2.getSpacings(mVar2, i12).getX5(), u.P, 2);
                r1.u0 u0Var = r1.j.f29228a;
                k2 a12 = i2.a(r1.j.g(echoTheme2.getSpacings(mVar2, i12).getX4()), i3.d.f13004y0, mVar2, 0);
                int hashCode3 = Long.hashCode(qVar4.T);
                c3.o l10 = qVar4.l();
                i3.t c11 = i3.a.c(G2, mVar2);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar2);
                } else {
                    qVar4.k0();
                }
                r.J(h4.g.f11907f, a12, mVar2);
                r.J(h4.g.f11906e, l10, mVar2);
                r.y(mVar2, Integer.valueOf(hashCode3), h4.g.f11908g);
                r.F(h4.g.f11909h, mVar2);
                r.J(h4.g.f11905d, c11, mVar2);
                if (aVar != null && z6) {
                    qVar4.X(-58389228);
                    String R = kj.c.R(mVar2, R.string.explore_filters_clear_filter);
                    boolean f13 = qVar4.f(aVar) | qVar4.h(bottomSheetControl);
                    Object L3 = qVar4.L();
                    if (!f13 && L3 != eVar7) {
                        z11 = false;
                    } else {
                        z11 = false;
                        L3 = new d(aVar, bottomSheetControl, 0);
                        qVar4.h0(L3);
                    }
                    ho.a aVar3 = (ho.a) L3;
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    boolean z12 = z11;
                    if (1.0f > Float.MAX_VALUE) {
                        f12 = Float.MAX_VALUE;
                    } else {
                        f12 = 1.0f;
                    }
                    qVar = qVar3;
                    f10 = Float.MAX_VALUE;
                    eVar = eVar7;
                    qVar2 = qVar4;
                    bottomSheetControl2 = bottomSheetControl;
                    FullWidthButtonKt.EchoThemeFullWidthButton(R, aVar3, new m1(f12, true), null, FullWidthButtonVariant.Secondary, null, false, false, false, mVar, 24576, 488);
                    mVar2 = mVar;
                    qVar2.p(z12);
                } else {
                    bottomSheetControl2 = bottomSheetControl;
                    qVar = qVar3;
                    f10 = Float.MAX_VALUE;
                    eVar = eVar7;
                    qVar2 = qVar4;
                    qVar2.X(-57956778);
                    qVar2.p(false);
                }
                String R2 = kj.c.R(mVar2, R.string.explore_filters_show_results);
                boolean h12 = qVar2.h(bottomSheetControl2);
                Object L4 = qVar2.L();
                if (h12 || L4 == eVar) {
                    L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.g(bottomSheetControl2, 1);
                    qVar2.h0(L4);
                }
                ho.a aVar4 = (ho.a) L4;
                if (aVar != null && z6) {
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > f10) {
                        f11 = f10;
                    } else {
                        f11 = 1.0f;
                    }
                    z10 = true;
                    e10 = new m1(f11, true);
                } else {
                    z10 = true;
                    e10 = p2.e(qVar, 1.0f);
                }
                q qVar5 = qVar2;
                boolean z13 = z10;
                FullWidthButtonKt.EchoThemeFullWidthButton(R2, aVar4, e10, null, null, null, false, false, false, mVar, 0, 504);
                qVar5.p(z13);
                WeakHashMap weakHashMap = c3.f29142x;
                r1.d.g(r1.d.N(r1.u0.e(mVar).f29154l), mVar);
                qVar5.p(z13);
                return z.f31622a;
            }
        }
    }

    public static final z ExploreFiltersBottomSheet$lambda$4$0$0$0$1$0(PageFilter pageFilter, z0 z0Var) {
        z0Var.setValue(pageFilter);
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$4$0$0$0$3$0(PageFilter pageFilter, z0 z0Var) {
        z0Var.setValue(pageFilter);
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$4$0$1$0$0(ho.a aVar, BottomSheetControl bottomSheetControl) {
        aVar.invoke();
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$4$0$1$1$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$5$0$0(z0 z0Var) {
        z0Var.setValue(null);
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$5$1$0(p pVar, PageFilter pageFilter, String str) {
        pVar.invoke(((PageFilter.ExplorePageOneOptionFilterResponseModel) pageFilter).getKey(), ig.f.J(str));
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$5$2$0(l lVar, PageFilter pageFilter) {
        lVar.invoke(((PageFilter.ExplorePageOneOptionFilterResponseModel) pageFilter).getKey());
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$5$3$0(z0 z0Var) {
        z0Var.setValue(null);
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$5$4$0(p pVar, PageFilter pageFilter, List list) {
        list.getClass();
        pVar.invoke(((PageFilter.ExplorePageMultiOptionFilterResponseModel) pageFilter).getKey(), list);
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$5$5$0(l lVar, PageFilter pageFilter) {
        lVar.invoke(((PageFilter.ExplorePageMultiOptionFilterResponseModel) pageFilter).getKey());
        return z.f31622a;
    }

    public static final z ExploreFiltersBottomSheet$lambda$6(ho.a aVar, List list, Map map, p pVar, l lVar, ho.a aVar2, int i10, int i11, m mVar, int i12) {
        ExploreFiltersBottomSheet(aVar, list, map, pVar, lVar, aVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreFiltersBottomSheet(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1582346795);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List I = ig.f.I(new PageFilter.ExplorePageOneOptionFilterResponseModel("Price", FirebaseAnalytics.Param.PRICE, ig.f.I(new KeyLabel("free", "Free"), new KeyLabel("under_5", "Under £5"), new KeyLabel("under_10", "Under £10")), null, 8, null), new PageFilter.ExplorePageMultiOptionFilterResponseModel("Genres", "genres", ig.f.I(new KeyLabel("fantasy", "Fantasy"), new KeyLabel("scifi", "Science Fiction"), new KeyLabel("mystery", "Mystery"))));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(17);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Map singletonMap = Collections.singletonMap(FirebaseAnalytics.Param.PRICE, ig.f.H("under_10"));
            singletonMap.getClass();
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(26);
                qVar.h0(L2);
            }
            p pVar = (p) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.k(7);
                qVar.h0(L3);
            }
            ExploreFiltersBottomSheet(aVar, I, singletonMap, pVar, (l) L3, null, qVar, 28038, 32);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 27);
        }
    }

    public static final z Preview_ExploreFiltersBottomSheet$lambda$1$0(String str, List list) {
        str.getClass();
        list.getClass();
        return z.f31622a;
    }

    public static final z Preview_ExploreFiltersBottomSheet$lambda$2$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_ExploreFiltersBottomSheet$lambda$3(int i10, m mVar, int i11) {
        Preview_ExploreFiltersBottomSheet(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
