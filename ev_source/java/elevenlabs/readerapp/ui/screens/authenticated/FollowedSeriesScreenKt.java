package io.elevenlabs.readerapp.ui.screens.authenticated;

import androidx.lifecycle.r1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.SeriesSection;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.SeriesSectionKt;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.InputSearchKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.l2;
import r1.p2;
import r1.z1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u0010²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/FollowedSeriesViewModel;", "vm", "FollowedSeriesScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/FollowedSeriesViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/FollowedSeriesState;", RemoteConfigConstants.ResponseFieldKey.STATE, "FollowedSeriesScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/FollowedSeriesState;Lho/a;Lu2/m;II)V", "Preview_FollowedSeriesScreenUI_Empty", "(Lu2/m;I)V", "Preview_FollowedSeriesScreenUI_WithSeries", "", "searchText", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class FollowedSeriesScreenKt {
    public static final void FollowedSeriesScreen(ho.a aVar, FollowedSeriesViewModel followedSeriesViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        FollowedSeriesViewModel followedSeriesViewModel2;
        q7.c cVar;
        int i13;
        int i14;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1541459392);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar.h(followedSeriesViewModel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    followedSeriesViewModel2 = (FollowedSeriesViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(FollowedSeriesViewModel.class), a10, null, o6, cVar, qVar);
                    i12 &= -113;
                    qVar.q();
                    FollowedSeriesScreenUI(FollowedSeriesScreen$lambda$0(u2.r.o(followedSeriesViewModel2.getStateFlow(), qVar, 0)), aVar, qVar, (i12 << 3) & 112, 0);
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            followedSeriesViewModel2 = followedSeriesViewModel;
            qVar.q();
            FollowedSeriesScreenUI(FollowedSeriesScreen$lambda$0(u2.r.o(followedSeriesViewModel2.getStateFlow(), qVar, 0)), aVar, qVar, (i12 << 3) & 112, 0);
        } else {
            qVar.R();
            followedSeriesViewModel2 = followedSeriesViewModel;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(aVar, followedSeriesViewModel2, i10, i11, 4);
        }
    }

    private static final FollowedSeriesState FollowedSeriesScreen$lambda$0(s2 s2Var) {
        return (FollowedSeriesState) s2Var.getValue();
    }

    public static final sn.z FollowedSeriesScreen$lambda$1(ho.a aVar, FollowedSeriesViewModel followedSeriesViewModel, int i10, int i11, u2.m mVar, int i12) {
        FollowedSeriesScreen(aVar, followedSeriesViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FollowedSeriesScreenUI(FollowedSeriesState followedSeriesState, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        int i13;
        boolean z6;
        ho.a aVar3;
        u2.r1 r10;
        ho.a aVar4;
        String subtitle;
        int i14;
        followedSeriesState.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2101848255);
        if ((i10 & 6) == 0) {
            if (qVar.h(followedSeriesState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                u2.e eVar = u2.l.f33918a;
                if (i15 != 0) {
                    Object L = qVar.L();
                    if (L == eVar) {
                        L = new d(28);
                        qVar.h0(L);
                    }
                    aVar4 = (ho.a) L;
                } else {
                    aVar4 = aVar2;
                }
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = u2.r.A("");
                    qVar.h0(L2);
                }
                u2.z0 z0Var = (u2.z0) L2;
                boolean f10 = qVar.f(followedSeriesState.getFollowedSeries()) | qVar.f(FollowedSeriesScreenUI$lambda$2(z0Var));
                Object L3 = qVar.L();
                if (f10 || L3 == eVar) {
                    if (FollowedSeriesScreenUI$lambda$2(z0Var).length() == 0) {
                        L3 = followedSeriesState.getFollowedSeries();
                    } else {
                        List<CollectionMeta> followedSeries = followedSeriesState.getFollowedSeries();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : followedSeries) {
                            CollectionMeta collectionMeta = (CollectionMeta) obj;
                            if (wq.n.a0(collectionMeta.getTitle(), FollowedSeriesScreenUI$lambda$2(z0Var), true) || ((subtitle = collectionMeta.getSubtitle()) != null && wq.n.a0(subtitle, FollowedSeriesScreenUI$lambda$2(z0Var), true))) {
                                arrayList.add(obj);
                            }
                        }
                        L3 = arrayList;
                    }
                    qVar.h0(L3);
                }
                k5.a(null, c3.k.d(1976325763, true, new o(1, aVar4), qVar), null, null, null, 0, 0L, 0L, null, c3.k.d(1207432718, true, new fm.o(followedSeriesState, (List) L3, z0Var, 4), qVar), qVar, 805306416, 509);
                aVar3 = aVar4;
            } else {
                qVar.R();
                aVar3 = aVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.p(followedSeriesState, aVar3, i10, i11, 5);
                return;
            }
            return;
        }
        aVar2 = aVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final String FollowedSeriesScreenUI$lambda$2(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z FollowedSeriesScreenUI$lambda$5(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, kj.c.R(qVar, R.string.following_series_carousel_title), c3.k.d(1283667550, true, new u(1, aVar), qVar), (ho.q) null, (i3.f) null, qVar, 384, 25);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z FollowedSeriesScreenUI$lambda$5$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, t2.u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z FollowedSeriesScreenUI$lambda$6(FollowedSeriesState followedSeriesState, List list, u2.z0 z0Var, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            boolean isEmpty = followedSeriesState.getFollowedSeries().isEmpty();
            i3.q qVar2 = i3.q.f13017a;
            if (isEmpty) {
                qVar.X(277080369);
                i3.t D = r1.d.D(p2.d(qVar2, 1.0f), z1Var);
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(D, qVar);
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
                String R = kj.c.R(qVar, R.string.following_series_empty_title);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i13 = ElevenLabsTheme.$stable;
                j7.d(R, r1.d.G(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2358getX6D9Ej5fM(), t2.u.P, 2), defpackage.f.A(elevenLabsTheme, qVar, i13), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodySmall500(), qVar, 0, 0, 130040);
                qVar.p(true);
                qVar.p(false);
            } else {
                qVar.X(277718504);
                i3.t D2 = r1.d.D(p2.d(qVar2, 1.0f), z1Var);
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(D2, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a10, qVar);
                u2.r.J(h4.g.f11906e, l7, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode2), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c10, qVar);
                String FollowedSeriesScreenUI$lambda$2 = FollowedSeriesScreenUI$lambda$2(z0Var);
                String R2 = kj.c.R(qVar, R.string.search_placeholder);
                i3.t e10 = p2.e(qVar2, 1.0f);
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                int i14 = ElevenLabsTheme.$stable;
                i3.t G = r1.d.G(r1.d.G(e10, elevenLabsTheme2.getSpacings(qVar, i14).m2357getX5D9Ej5fM(), t2.u.P, 2), t2.u.P, elevenLabsTheme2.getSpacings(qVar, i14).m2355getX3D9Ej5fM(), 1);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = new l0(z0Var, 7);
                    qVar.h0(L);
                }
                InputSearchKt.InputSearch(FollowedSeriesScreenUI$lambda$2, (ho.l) L, G, R2, qVar, 48, 0);
                i3.t d11 = p2.d(qVar2, 1.0f);
                boolean h10 = qVar.h(list);
                Object L2 = qVar.L();
                if (h10 || L2 == eVar) {
                    L2 = new x(list, 2);
                    qVar.h0(L2);
                }
                rd.c1.c(d11, null, null, false, null, null, null, false, null, (ho.l) L2, qVar, 6, 510);
                qVar.p(true);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z FollowedSeriesScreenUI$lambda$6$1$0$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z FollowedSeriesScreenUI$lambda$6$1$1$0(final List list, t1.t tVar) {
        tVar.getClass();
        final w wVar = new w(22);
        final FollowedSeriesScreenKt$FollowedSeriesScreenUI$lambda$6$1$1$0$$inlined$items$default$1 followedSeriesScreenKt$FollowedSeriesScreenUI$lambda$6$1$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesScreenKt$FollowedSeriesScreenUI$lambda$6$1$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CollectionMeta) obj);
            }

            @Override // ho.l
            public final Void invoke(CollectionMeta collectionMeta) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesScreenKt$FollowedSeriesScreenUI$lambda$6$1$1$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesScreenKt$FollowedSeriesScreenUI$lambda$6$1$1$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesScreenKt$FollowedSeriesScreenUI$lambda$6$1$1$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
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
                    CollectionMeta collectionMeta = (CollectionMeta) list.get(i10);
                    qVar.X(-19246944);
                    SeriesSectionKt.SeriesSection(new AuthorProfileSection.Series(new SeriesSection(defpackage.f.i("elevenlabs://collection/", collectionMeta.getId()), collectionMeta.getTitle(), collectionMeta.getSubtitle(), collectionMeta.getImageUrl())), t1.b.a(bVar, i3.q.f13017a, null, 7), qVar, 0, 0);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
        return sn.z.f31622a;
    }

    public static final Object FollowedSeriesScreenUI$lambda$6$1$1$0$0(CollectionMeta collectionMeta) {
        collectionMeta.getClass();
        return collectionMeta.getId();
    }

    public static final sn.z FollowedSeriesScreenUI$lambda$7(FollowedSeriesState followedSeriesState, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        FollowedSeriesScreenUI(followedSeriesState, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_FollowedSeriesScreenUI_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1002347700);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FollowedSeriesScreenUI(new FollowedSeriesState(tn.t.f33547a), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 15);
        }
    }

    public static final sn.z Preview_FollowedSeriesScreenUI_Empty$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FollowedSeriesScreenUI_Empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_FollowedSeriesScreenUI_WithSeries(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(785010634);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            FollowedSeriesScreenUI(new FollowedSeriesState(ig.f.I(CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), "1", "The Daily Show", "Comedy Central", null, null, true, null, null, "series", null, false, null, 3800, null), CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), "2", "Tech News Weekly", "TWiT Network", null, null, false, null, null, "series", null, false, null, 3800, null), CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), "3", "Science Friday", "NPR", null, null, true, null, null, "series", null, false, null, 3800, null), CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), "4", "This Week in Tech", "TWiT Network", null, null, false, null, null, "series", null, false, null, 3800, null), CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), "5", "The Vergecast", "The Verge", null, null, true, null, null, "series", null, false, null, 3800, null))), null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 16);
        }
    }

    public static final sn.z Preview_FollowedSeriesScreenUI_WithSeries$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_FollowedSeriesScreenUI_WithSeries(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
