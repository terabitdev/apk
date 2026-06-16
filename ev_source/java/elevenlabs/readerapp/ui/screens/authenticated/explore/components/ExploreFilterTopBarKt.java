package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import a2.d0;
import a2.p0;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import ho.l;
import ho.p;
import i3.k;
import i3.t;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.domain.model.PageFilter;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.scaffolds.CenteredContentScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.livekit.android.rpc.RpcError;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import l1.n;
import l1.x;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.e5;
import r1.d2;
import r1.p2;
import r1.u0;
import rd.c1;
import sn.z;
import tn.a0;
import tn.o;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009f\u0001\u0010\u0011\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00000\u00032\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "Lio/elevenlabs/domain/model/PageFilter;", "pageFilters", "", "", "filterOptions", "Lkotlin/Function2;", "Lsn/z;", "onUpdateFilter", "Lkotlin/Function1;", "onClearFilter", "Lkotlin/Function0;", "onResetFilters", "Li3/t;", "modifier", "", "onFilterChipToggled", "ExploreFilterTopBar", "(Ljava/util/List;Ljava/util/Map;Lho/p;Lho/l;Lho/a;Li3/t;Lho/p;Lu2/m;II)V", "hasActiveFilters", "onClick", "FilterButton", "(ZLho/a;Li3/t;Lu2/m;II)V", "Preview_ExploreFilterTopBar_Empty", "(Lu2/m;I)V", "Preview_ExploreFilterTopBar_ActiveFilters", "TAGS_FILTER_KEY", "Ljava/lang/String;", "Lh5/f;", "FILTER_BUTTON_PADDING", TokenNames.F, "showFiltersSheet", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreFilterTopBarKt {
    private static final float FILTER_BUTTON_PADDING = 14;
    private static final String TAGS_FILTER_KEY = "tags";

    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreFilterTopBar(List<? extends PageFilter> list, Map<String, ? extends List<String>> map, p pVar, l lVar, ho.a aVar, t tVar, p pVar2, m mVar, int i10, int i11) {
        int i12;
        p pVar3;
        l lVar2;
        ho.a aVar2;
        t tVar2;
        int i13;
        int i14;
        p pVar4;
        int i15;
        boolean z6;
        p pVar5;
        r1 r10;
        p pVar6;
        Object obj;
        Collection collection;
        boolean z10;
        boolean z11;
        u2.e eVar;
        z0 z0Var;
        p pVar7;
        boolean c5;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        list.getClass();
        map.getClass();
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1193047104);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(map)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            pVar3 = pVar;
            if (qVar.h(pVar3)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        } else {
            pVar3 = pVar;
        }
        if ((i10 & 3072) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 24576) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        } else {
            aVar2 = aVar;
        }
        int i21 = i11 & 32;
        if (i21 != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                pVar4 = pVar2;
                if (qVar.h(pVar4)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                boolean z12 = true;
                if ((599187 & i12) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    if (i21 != 0) {
                        tVar2 = i3.q.f13017a;
                    }
                    t tVar3 = tVar2;
                    u2.e eVar2 = u2.l.f33918a;
                    if (i14 != 0) {
                        Object L = qVar.L();
                        if (L == eVar2) {
                            L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(25);
                            qVar.h0(L);
                        }
                        pVar6 = (p) L;
                    } else {
                        pVar6 = pVar4;
                    }
                    Object L2 = qVar.L();
                    if (L2 == eVar2) {
                        L2 = r.A(Boolean.FALSE);
                        qVar.h0(L2);
                    }
                    z0 z0Var2 = (z0) L2;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            PageFilter pageFilter = (PageFilter) obj;
                            if (pageFilter instanceof PageFilter.ExplorePageOneOptionFilterResponseModel) {
                                c5 = kotlin.jvm.internal.m.c(((PageFilter.ExplorePageOneOptionFilterResponseModel) pageFilter).getKey(), TAGS_FILTER_KEY);
                            } else if (pageFilter instanceof PageFilter.ExplorePageMultiOptionFilterResponseModel) {
                                c5 = kotlin.jvm.internal.m.c(((PageFilter.ExplorePageMultiOptionFilterResponseModel) pageFilter).getKey(), TAGS_FILTER_KEY);
                            } else {
                                c6.p();
                                return;
                            }
                            if (c5) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    PageFilter pageFilter2 = (PageFilter) obj;
                    boolean z13 = pageFilter2 instanceof PageFilter.ExplorePageMultiOptionFilterResponseModel;
                    Collection collection2 = tn.t.f33547a;
                    if (z13) {
                        collection = ((PageFilter.ExplorePageMultiOptionFilterResponseModel) pageFilter2).getOptions();
                    } else if (pageFilter2 instanceof PageFilter.ExplorePageOneOptionFilterResponseModel) {
                        collection = ((PageFilter.ExplorePageOneOptionFilterResponseModel) pageFilter2).getOptions();
                    } else {
                        collection = collection2;
                    }
                    Collection collection3 = (List) map.get(TAGS_FILTER_KEY);
                    if (collection3 != null) {
                        collection2 = collection3;
                    }
                    Set l12 = o.l1(collection2);
                    if (!map.isEmpty()) {
                        Iterator<Map.Entry<String, ? extends List<String>>> it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            if (!it2.next().getValue().isEmpty()) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    u0 u0Var = r1.j.f29228a;
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i22 = EchoTheme.$stable;
                    r1.h g10 = r1.j.g(echoTheme.getSpacings(qVar, i22).getX3());
                    k kVar = i3.d.f13005z0;
                    d2 f10 = r1.d.f(echoTheme.getSpacings(qVar, i22).getX5(), 0.0f, echoTheme.getSpacings(qVar, i22).getX5(), 0.0f, 10);
                    boolean g11 = qVar.g(z10) | qVar.h(collection) | qVar.h(l12);
                    if ((3670016 & i12) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = g11 | z11;
                    if ((i12 & 896) != 256) {
                        z12 = false;
                    }
                    boolean z15 = z14 | z12;
                    Object L3 = qVar.L();
                    if (z15 || L3 == eVar2) {
                        eVar = eVar2;
                        p0 p0Var = new p0(collection, z10, z0Var2, l12, pVar6, pVar3, 1);
                        z0Var = z0Var2;
                        pVar7 = pVar6;
                        qVar.h0(p0Var);
                        L3 = p0Var;
                    } else {
                        eVar = eVar2;
                        z0Var = z0Var2;
                        pVar7 = pVar6;
                    }
                    tVar2 = tVar3;
                    c1.d(tVar2, null, f10, g10, kVar, null, false, null, (l) L3, qVar, ((i12 >> 15) & 14) | 196608, 458);
                    if (ExploreFilterTopBar$lambda$2(z0Var)) {
                        qVar.X(-1208369311);
                        Object L4 = qVar.L();
                        if (L4 == eVar) {
                            L4 = new d0(z0Var, 11);
                            qVar.h0(L4);
                        }
                        int i23 = i12 << 3;
                        ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet((ho.a) L4, list, map, pVar, lVar2, aVar2, qVar, (i23 & 458752) | (i23 & 112) | 6 | (i23 & 896) | (i23 & 7168) | (57344 & i23), 0);
                        qVar.p(false);
                    } else {
                        qVar.X(-1208060830);
                        qVar.p(false);
                    }
                    pVar5 = pVar7;
                } else {
                    qVar.R();
                    pVar5 = pVar4;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.c(list, map, pVar, lVar, aVar, tVar2, pVar5, i10, i11);
                    return;
                }
                return;
            }
            pVar4 = pVar2;
            boolean z122 = true;
            if ((599187 & i12) != 599186) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        pVar4 = pVar2;
        boolean z1222 = true;
        if ((599187 & i12) != 599186) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z ExploreFilterTopBar$lambda$0$0(String str, boolean z6) {
        str.getClass();
        return z.f31622a;
    }

    private static final boolean ExploreFilterTopBar$lambda$2(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ExploreFilterTopBar$lambda$3(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z ExploreFilterTopBar$lambda$6$0(final List list, boolean z6, z0 z0Var, final Set set, final p pVar, final p pVar2, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new x(z6, z0Var, 2), true, -111899293), 3);
        if (!list.isEmpty()) {
            t1.t.c(tVar, null, null, ComposableSingletons$ExploreFilterTopBarKt.INSTANCE.getLambda$1007656446$app_productionRelease(), 3);
        }
        final ExploreFilterTopBarKt$ExploreFilterTopBar$lambda$6$0$$inlined$items$default$1 exploreFilterTopBarKt$ExploreFilterTopBar$lambda$6$0$$inlined$items$default$1 = new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterTopBarKt$ExploreFilterTopBar$lambda$6$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((KeyLabel) obj);
            }

            @Override // ho.l
            public final Void invoke(KeyLabel keyLabel) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), null, new l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterTopBarKt$ExploreFilterTopBar$lambda$6$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterTopBarKt$ExploreFilterTopBar$lambda$6$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z10;
                Integer num;
                ho.a aVar;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z10)) {
                    final KeyLabel keyLabel = (KeyLabel) list.get(i10);
                    qVar.X(1338691468);
                    final boolean contains = set.contains(keyLabel.getKey());
                    String label = keyLabel.getLabel();
                    String str = null;
                    if (contains) {
                        num = Integer.valueOf(R.drawable.close_rounded);
                    } else {
                        num = null;
                    }
                    boolean g10 = qVar.g(contains) | qVar.h(keyLabel) | qVar.f(pVar) | qVar.f(pVar2);
                    Object L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (g10 || L == obj) {
                        final p pVar3 = pVar;
                        final p pVar4 = pVar2;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterTopBarKt$ExploreFilterTopBar$2$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1376invoke() {
                                Iterable H;
                                boolean z11 = contains;
                                boolean z12 = !z11;
                                if (z11) {
                                    H = tn.t.f33547a;
                                } else {
                                    H = ig.f.H(keyLabel.getKey());
                                }
                                pVar3.invoke(keyLabel.getKey(), Boolean.valueOf(z12));
                                pVar4.invoke("tags", o.g1(H));
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1376invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.a aVar2 = (ho.a) L;
                    if (contains) {
                        qVar.X(1339291689);
                        boolean h10 = qVar.h(set) | qVar.h(keyLabel) | qVar.f(pVar) | qVar.f(pVar2);
                        Object L2 = qVar.L();
                        if (h10 || L2 == obj) {
                            final Set set2 = set;
                            final p pVar5 = pVar;
                            final p pVar6 = pVar2;
                            L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterTopBarKt$ExploreFilterTopBar$2$1$2$2$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1377invoke() {
                                    LinkedHashSet K = kd.a.K(set2, keyLabel.getKey());
                                    pVar5.invoke(keyLabel.getKey(), Boolean.FALSE);
                                    pVar6.invoke("tags", o.g1(K));
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1377invoke();
                                    return z.f31622a;
                                }
                            };
                            qVar.h0(L2);
                        }
                        qVar.p(false);
                        aVar = (ho.a) L2;
                    } else {
                        qVar.X(1339558195);
                        qVar.p(false);
                        aVar = null;
                    }
                    if (contains) {
                        qVar.X(-649523019);
                        str = kj.c.Q(io.elevenlabs.readerapp.R.string.accessibility_selectable_unselect, new Object[]{keyLabel.getLabel()}, qVar);
                    } else {
                        qVar.X(1339701043);
                    }
                    qVar.p(false);
                    ExploreFilterChipKt.ExploreFilterChip(label, contains, null, null, num, aVar2, aVar, str, qVar, 0, 12);
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

    public static final z ExploreFilterTopBar$lambda$6$0$0(boolean z6, z0 z0Var, t1.b bVar, m mVar, int i10) {
        boolean z10;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new d0(z0Var, 12);
                qVar.h0(L);
            }
            FilterButton(z6, (ho.a) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ExploreFilterTopBar$lambda$6$0$0$0$0(z0 z0Var) {
        ExploreFilterTopBar$lambda$3(z0Var, true);
        return z.f31622a;
    }

    public static final z ExploreFilterTopBar$lambda$7$0(z0 z0Var) {
        ExploreFilterTopBar$lambda$3(z0Var, false);
        return z.f31622a;
    }

    public static final z ExploreFilterTopBar$lambda$8(List list, Map map, p pVar, l lVar, ho.a aVar, t tVar, p pVar2, int i10, int i11, m mVar, int i12) {
        ExploreFilterTopBar(list, map, pVar, lVar, aVar, tVar, pVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FilterButton(boolean z6, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z10;
        r1 r10;
        sn.k kVar;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-727970672);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
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
            if ((i12 & 147) == 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar2 = qVar2;
                }
                if (z6) {
                    qVar.X(-1684237826);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i17 = EchoTheme.$stable;
                    kVar = new sn.k(new p3.x(echoTheme.getColors(qVar, i17).getFill().getPrimary(qVar, EchoThemeColors.Fill.$stable)), new p3.x(echoTheme.getColors(qVar, i17).getIcon().getOnFillPrimary(qVar, EchoThemeColors.Icon.$stable)));
                    qVar.p(false);
                } else {
                    qVar.X(-1684148608);
                    EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                    int i18 = EchoTheme.$stable;
                    kVar = new sn.k(new p3.x(echoTheme2.getColors(qVar, i18).getFill().getDenaryAlpha(qVar, EchoThemeColors.Fill.$stable)), new p3.x(echoTheme2.getColors(qVar, i18).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable)));
                    qVar.p(false);
                }
                long j4 = ((p3.x) kVar.f31600a).f26440a;
                long j10 = ((p3.x) kVar.f31601b).f26440a;
                Object L = qVar.L();
                if (L == u2.l.f33918a) {
                    L = j0.c.o(qVar);
                }
                EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                t E = r1.d.E(n.h(n.n(m3.h.c(tVar2, echoTheme3.getShapes(qVar, i19).getFull(qVar, EchoThemeShapes.$stable)), (p1.l) L, e5.b(0.0f, 3, j10, false), false, new p4.k(0), aVar, 12), j4, h0.f26395b), FILTER_BUTTON_PADDING);
                f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                t c5 = i3.a.c(E, qVar);
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
                n.c(kd.a.M(R.drawable.filter_echo, qVar, 0), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.explore_filters_title), p2.o(qVar2, echoTheme3.getSpacings(qVar, i19).getX5()), null, null, 0.0f, new p3.n(j10, 5), qVar, u3.c.$stable, 56);
                qVar.p(true);
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.agent.c(z6, aVar, tVar2, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z FilterButton$lambda$2(boolean z6, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        FilterButton(z6, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ExploreFilterTopBar_ActiveFilters(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(290866817);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, c3.k.d(516503662, true, new b(ig.f.I(new PageFilter.ExplorePageOneOptionFilterResponseModel("Price", FirebaseAnalytics.Param.PRICE, ig.f.I(new KeyLabel("free", "Free"), new KeyLabel("under_5", "Under £5"), new KeyLabel("under_10", "Under £10")), null, 8, null), new PageFilter.ExplorePageMultiOptionFilterResponseModel("Genres", "genres", ig.f.I(new KeyLabel("fantasy", "Fantasy"), new KeyLabel("scifi", "Science Fiction"), new KeyLabel("mystery", "Mystery")))), 0), qVar), qVar, 3072, 7);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 25);
        }
    }

    public static final z Preview_ExploreFilterTopBar_ActiveFilters$lambda$0(List list, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Map J = a0.J(new sn.k(FirebaseAnalytics.Param.PRICE, ig.f.H("under_10")), new sn.k("genres", ig.f.I("fantasy", "scifi")));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.a(24);
                qVar.h0(L);
            }
            p pVar = (p) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.k(6);
                qVar.h0(L2);
            }
            l lVar = (l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.author.p(16);
                qVar.h0(L3);
            }
            ExploreFilterTopBar(list, J, pVar, lVar, (ho.a) L3, null, null, qVar, 28080, 96);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_ExploreFilterTopBar_ActiveFilters$lambda$0$0$0(String str, List list) {
        str.getClass();
        list.getClass();
        return z.f31622a;
    }

    public static final z Preview_ExploreFilterTopBar_ActiveFilters$lambda$0$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z Preview_ExploreFilterTopBar_ActiveFilters$lambda$1(int i10, m mVar, int i11) {
        Preview_ExploreFilterTopBar_ActiveFilters(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ExploreFilterTopBar_Empty(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1077334201);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CenteredContentScaffoldKt.CenteredContentScaffold(null, null, null, ComposableSingletons$ExploreFilterTopBarKt.INSTANCE.getLambda$1146945446$app_productionRelease(), qVar, 3072, 7);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.x(i10, 26);
        }
    }

    public static final z Preview_ExploreFilterTopBar_Empty$lambda$0(int i10, m mVar, int i11) {
        Preview_ExploreFilterTopBar_Empty(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
