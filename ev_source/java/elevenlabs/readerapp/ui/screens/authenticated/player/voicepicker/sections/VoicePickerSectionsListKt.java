package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import a2.t0;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCollection;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.p1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.k;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import r1.d2;
import r1.p;
import r1.p2;
import rd.c1;
import t1.z;
import t2.u;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u001ae\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lh5/f;", "bottomPadding", "Lt1/z;", "lazyListState", "", "showLoading", "", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "sections", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "Lsn/z;", "onSharedEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "onNavigationEvent", "VoicePickerSectionsList-Q1bl1hc", "(FLt1/z;ZLjava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lho/l;Lu2/m;I)V", "VoicePickerSectionsList", "", "count", "VoicePickerSectionsLoadingList", "(ILu2/m;I)V", "Preview_VoicePickerSectionsLoadingList", "(Lu2/m;I)V", "Preview_VoicePickerSectionsList", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSectionsListKt {
    public static final void Preview_VoicePickerSectionsList(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1402102167);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<Voice> stubVoicesList = VoicesFactoryKt.stubVoicesList();
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
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
            float f10 = 0;
            z zVar = new z(0, 0);
            List H = ig.f.H(new ExploreVoiceSections.Section.VoiceList("Trending voices", stubVoicesList));
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(29);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(0);
                qVar.h0(L2);
            }
            m1618VoicePickerSectionsListQ1bl1hc(f10, zVar, true, H, state, lVar, (ho.l) L2, qVar, 1769862);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 24);
        }
    }

    public static final sn.z Preview_VoicePickerSectionsList$lambda$0$0$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_VoicePickerSectionsList$lambda$0$1$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_VoicePickerSectionsList$lambda$1(int i10, m mVar, int i11) {
        Preview_VoicePickerSectionsList(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_VoicePickerSectionsLoadingList(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(551627647);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
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
            VoicePickerSectionsLoadingList(8, qVar, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 25);
        }
    }

    public static final sn.z Preview_VoicePickerSectionsLoadingList$lambda$1(int i10, m mVar, int i11) {
        Preview_VoicePickerSectionsLoadingList(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* renamed from: VoicePickerSectionsList-Q1bl1hc */
    public static final void m1618VoicePickerSectionsListQ1bl1hc(float f10, z zVar, boolean z6, List<? extends ExploreVoiceSections.Section> list, VoicePickerSharedContract.State state, ho.l lVar, ho.l lVar2, m mVar, int i10) {
        int i11;
        ho.l lVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zVar.getClass();
        list.getClass();
        state.getClass();
        lVar.getClass();
        lVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(277415884);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(zVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.g(z6)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(list)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(state)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i14;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(lVar)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i11 |= i13;
        }
        if ((1572864 & i10) == 0) {
            lVar3 = lVar2;
            if (qVar.h(lVar3)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i11 |= i12;
        } else {
            lVar3 = lVar2;
        }
        int i19 = i11;
        boolean z13 = true;
        if ((599187 & i19) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i19 & 1, z10)) {
            float m2353getX2D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2353getX2D9Ej5fM();
            if (f10 >= m2353getX2D9Ej5fM) {
                m2353getX2D9Ej5fM = f10;
            }
            d2 f11 = r1.d.f(u.P, u.P, u.P, m2353getX2D9Ej5fM, 7);
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            boolean h10 = qVar.h(list) | qVar.h(state);
            if ((i19 & 458752) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = h10 | z11;
            if ((3670016 & i19) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = z14 | z12;
            if ((i19 & 896) != 256) {
                z13 = false;
            }
            boolean z16 = z15 | z13;
            Object L = qVar.L();
            if (z16 || L == l.f33918a) {
                p1 p1Var = new p1(1, list, state, lVar, lVar3, z6);
                qVar.h0(p1Var);
                L = p1Var;
            }
            c1.c(d10, zVar, f11, false, null, null, null, false, null, (ho.l) L, qVar, (i19 & 112) | 6, 504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.b(f10, zVar, z6, list, state, lVar, lVar2, i10);
        }
    }

    public static final sn.z VoicePickerSectionsList_Q1bl1hc$lambda$0$0(List list, VoicePickerSharedContract.State state, ho.l lVar, boolean z6, ho.l lVar2, t1.t tVar) {
        VoicePickerSharedContract.State state2;
        ho.l lVar3;
        t1.t tVar2;
        tVar.getClass();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            ExploreVoiceSections.Section section = (ExploreVoiceSections.Section) it.next();
            if (section instanceof ExploreVoiceSections.Section.VoiceList) {
                ExploreVoiceSections.Section.VoiceList voiceList = (ExploreVoiceSections.Section.VoiceList) section;
                if (!voiceList.getVoices().isEmpty()) {
                    state2 = state;
                    lVar3 = lVar;
                    tVar2 = tVar;
                    VoicePickerExploreListSectionKt.voicePickerExploreListSection(tVar2, String.valueOf(i10), new t0(voiceList, 15), voiceList.getVoices(), state2, lVar3);
                } else {
                    state2 = state;
                    lVar3 = lVar;
                    tVar2 = tVar;
                }
            } else {
                state2 = state;
                lVar3 = lVar;
                tVar2 = tVar;
                if (section instanceof ExploreVoiceSections.Section.VoiceGrid) {
                    ExploreVoiceSections.Section.VoiceGrid voiceGrid = (ExploreVoiceSections.Section.VoiceGrid) section;
                    if (!voiceGrid.getVoices().isEmpty()) {
                        VoicePickerExploreGridSectionKt.voicePickerExploreGridSection(tVar2, String.valueOf(i10), voiceGrid, state2, lVar3);
                    }
                } else if (section instanceof ExploreVoiceSections.Section.FeaturedVoices) {
                    ExploreVoiceSections.Section.FeaturedVoices featuredVoices = (ExploreVoiceSections.Section.FeaturedVoices) section;
                    if (!featuredVoices.getFeaturedVoices().isEmpty() || !featuredVoices.getVoices().isEmpty()) {
                        VoicePickerExploreFeaturedSectionKt.voicePickerExploreFeaturedSection(tVar2, String.valueOf(i10), featuredVoices, state2, lVar3);
                    }
                } else if (section instanceof ExploreVoiceSections.Section.VoiceCollections) {
                    ExploreVoiceSections.Section.VoiceCollections voiceCollections = (ExploreVoiceSections.Section.VoiceCollections) section;
                    if (!voiceCollections.getCollections().isEmpty()) {
                        VoicePickerExploreCollectionsSectionKt.voicePickerExploreCollectionsSection(tVar2, String.valueOf(i10), voiceCollections, new g3.m(lVar2, 8));
                    }
                } else if (section instanceof ExploreVoiceSections.Section.VoiceDesign) {
                    ExploreVoiceSections.Section.VoiceDesign voiceDesign = (ExploreVoiceSections.Section.VoiceDesign) section;
                    VoicePickerDesignVoiceSectionKt.voicePickerDesignVoiceSection(tVar2, voiceDesign.getTitle(), voiceDesign.getActionTitle(), voiceDesign.getSubtitle(), new k(lVar2, 1));
                } else {
                    c6.p();
                    return null;
                }
            }
            i10 = i11;
            tVar = tVar2;
            state = state2;
            lVar = lVar3;
        }
        t1.t tVar3 = tVar;
        if (z6) {
            ((t1.i) tVar3).t(VoicePickerContract.ViewType.VOICE_PAGINATION_LOADING_SHIMMER, VoicePickerContract.ViewType.VOICE_PAGINATION_LOADING_SHIMMER, ComposableSingletons$VoicePickerSectionsListKt.INSTANCE.m1617getLambda$1428770564$app_productionRelease());
        } else {
            ((t1.i) tVar3).t(VoicePickerContract.ViewType.LIST_BOTTOM_SPACER, VoicePickerContract.ViewType.LIST_BOTTOM_SPACER, ComposableSingletons$VoicePickerSectionsListKt.INSTANCE.m1616getLambda$1324513851$app_productionRelease());
        }
        return sn.z.f31622a;
    }

    public static final String VoicePickerSectionsList_Q1bl1hc$lambda$0$0$0(ExploreVoiceSections.Section section, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.X(744902626);
        String title = ((ExploreVoiceSections.Section.VoiceList) section).getTitle();
        qVar.p(false);
        return title;
    }

    public static final sn.z VoicePickerSectionsList_Q1bl1hc$lambda$0$0$1(ho.l lVar, VoiceCollection voiceCollection) {
        voiceCollection.getClass();
        lVar.invoke(new VoicePickerSharedContract.NavigationEvent.NavigateToVoiceCollection(voiceCollection));
        return sn.z.f31622a;
    }

    public static final sn.z VoicePickerSectionsList_Q1bl1hc$lambda$0$0$2(ho.l lVar) {
        lVar.invoke(VoicePickerSharedContract.NavigationEvent.NavigateToVoiceDesign.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z VoicePickerSectionsList_Q1bl1hc$lambda$1(float f10, z zVar, boolean z6, List list, VoicePickerSharedContract.State state, ho.l lVar, ho.l lVar2, int i10, m mVar, int i11) {
        m1618VoicePickerSectionsListQ1bl1hc(f10, zVar, z6, list, state, lVar, lVar2, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void VoicePickerSectionsLoadingList(final int i10, m mVar, final int i11) {
        int i12;
        boolean z6;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(-933319159);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        boolean z10 = false;
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            d2 f10 = r1.d.f(u.P, u.P, u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2353getX2D9Ej5fM(), 7);
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            if ((i12 & 14) == 4) {
                z10 = true;
            }
            Object L = qVar.L();
            if (z10 || L == l.f33918a) {
                L = new io.elevenlabs.highlighter.t(i10, 14);
                qVar.h0(L);
            }
            c1.c(d10, null, f10, false, null, null, null, false, null, (ho.l) L, qVar, 6, 506);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.c
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z VoicePickerSectionsLoadingList$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    VoicePickerSectionsLoadingList$lambda$1 = VoicePickerSectionsListKt.VoicePickerSectionsLoadingList$lambda$1(i10, i11, (m) obj, intValue);
                    return VoicePickerSectionsLoadingList$lambda$1;
                }
            };
        }
    }

    public static final sn.z VoicePickerSectionsLoadingList$lambda$0$0(int i10, t1.t tVar) {
        tVar.getClass();
        t1.t.d(tVar, i10, null, ComposableSingletons$VoicePickerSectionsListKt.INSTANCE.getLambda$635010091$app_productionRelease(), 6);
        return sn.z.f31622a;
    }

    public static final sn.z VoicePickerSectionsLoadingList$lambda$1(int i10, int i11, m mVar, int i12) {
        VoicePickerSectionsLoadingList(i10, mVar, r.M(i11 | 1));
        return sn.z.f31622a;
    }
}
