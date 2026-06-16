package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import e5.k;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.a1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.extensions.LazyListExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.y2;
import r1.j;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import rd.c1;
import sn.z;
import t1.b0;
import t2.u;
import u2.e;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001ak\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001d²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lh5/f;", "bottomPadding", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListViewModel;", "viewModel", "Lsn/z;", "VoicePickerSearchListScreen--orJrPs", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListViewModel;Lu2/m;II)V", "VoicePickerSearchListScreen", "", "scrollUp", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", "uiState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$Event;", "onEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "onNavigationEvent", "VoicePickerSearchListScreenUI-Q1bl1hc", "(FZLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lho/l;Lu2/m;I)V", "VoicePickerSearchListScreenUI", "Preview_VoiceFilteredListScreen_Empty", "(Lu2/m;I)V", "Preview_VoiceFilteredListScreen_Loading", "Preview_VoiceFilteredListScreen_Data", "hasReachedEnd", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSearchListScreenKt {
    public static final void Preview_VoiceFilteredListScreen_Data(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(174476169);
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
            VoicePickerSearchListContract.UiState.Data data = new VoicePickerSearchListContract.UiState.Data(ig.f.I(new ExploreVoiceSections.Section.VoiceList("Trending voices", stubVoicesList), new ExploreVoiceSections.Section.VoiceGrid("Grid voices", stubVoicesList)), true);
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            float f10 = 0;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(22);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(23);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(24);
                qVar.h0(L3);
            }
            m1610VoicePickerSearchListScreenUIQ1bl1hc(f10, false, data, lVar, state, lVar2, (ho.l) L3, qVar, 1772598);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 22);
        }
    }

    public static final z Preview_VoiceFilteredListScreen_Data$lambda$0$0$0(VoicePickerSearchListContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Data$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Data$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Data$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceFilteredListScreen_Data(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceFilteredListScreen_Empty(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1131763848);
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
            VoicePickerSearchListContract.UiState.Empty empty = VoicePickerSearchListContract.UiState.Empty.INSTANCE;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            float f10 = 0;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(25);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(18);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(19);
                qVar.h0(L3);
            }
            m1610VoicePickerSearchListScreenUIQ1bl1hc(f10, false, empty, lVar, state, lVar2, (ho.l) L3, qVar, 1772982);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 20);
        }
    }

    public static final z Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0(VoicePickerSearchListContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Empty$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Empty$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceFilteredListScreen_Empty(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceFilteredListScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1791571143);
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
            VoicePickerSearchListContract.UiState.Loading loading = VoicePickerSearchListContract.UiState.Loading.INSTANCE;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            float f10 = 0;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(17);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(20);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(21);
                qVar.h0(L3);
            }
            m1610VoicePickerSearchListScreenUIQ1bl1hc(f10, false, loading, lVar, state, lVar2, (ho.l) L3, qVar, 1772982);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 21);
        }
    }

    public static final z Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0(VoicePickerSearchListContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Loading$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Loading$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceFilteredListScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* renamed from: VoicePickerSearchListScreen--orJrPs */
    public static final void m1609VoicePickerSearchListScreenorJrPs(float f10, VoicePickerSearchListViewModel voicePickerSearchListViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        VoicePickerSearchListViewModel voicePickerSearchListViewModel2;
        q7.c cVar;
        VoicePickerSearchListViewModel voicePickerSearchListViewModel3;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        boolean h12;
        Object L3;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-115103434);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar.h(voicePickerSearchListViewModel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i15 = i12;
        if ((i15 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i15 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 2) != 0) {
                    i15 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    i15 &= -113;
                    voicePickerSearchListViewModel3 = (VoicePickerSearchListViewModel) gg.b.j0(e0.f20562a.b(VoicePickerSearchListViewModel.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    z0 l4 = c1.l(voicePickerSearchListViewModel3.getUiStateFlow(), VoicePickerSearchListContract.UiState.Initial.INSTANCE, qVar, 48);
                    z0 m10 = c1.m(voicePickerSearchListViewModel3.getSharedStateFlow(), qVar, 0);
                    boolean VoicePickerSearchListScreen__orJrPs$lambda$2 = VoicePickerSearchListScreen__orJrPs$lambda$2(c1.l(voicePickerSearchListViewModel3.getScrollUpFlow(), Boolean.FALSE, qVar, 48));
                    VoicePickerSearchListContract.UiState VoicePickerSearchListScreen__orJrPs$lambda$0 = VoicePickerSearchListScreen__orJrPs$lambda$0(l4);
                    h10 = qVar.h(voicePickerSearchListViewModel3);
                    L = qVar.L();
                    e eVar = l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$1$1(voicePickerSearchListViewModel3);
                        qVar.h0(L);
                    }
                    ho.l lVar = (ho.l) ((oo.g) L);
                    VoicePickerSharedContract.State VoicePickerSearchListScreen__orJrPs$lambda$1 = VoicePickerSearchListScreen__orJrPs$lambda$1(m10);
                    h11 = qVar.h(voicePickerSearchListViewModel3);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$2$1(voicePickerSearchListViewModel3);
                        qVar.h0(L2);
                    }
                    ho.l lVar2 = (ho.l) ((oo.g) L2);
                    h12 = qVar.h(voicePickerSearchListViewModel3);
                    L3 = qVar.L();
                    if (!h12 || L3 == eVar) {
                        L3 = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$3$1(voicePickerSearchListViewModel3);
                        qVar.h0(L3);
                    }
                    m1610VoicePickerSearchListScreenUIQ1bl1hc(f10, VoicePickerSearchListScreen__orJrPs$lambda$2, VoicePickerSearchListScreen__orJrPs$lambda$0, lVar, VoicePickerSearchListScreen__orJrPs$lambda$1, lVar2, (ho.l) L3, qVar, i15 & 14);
                    qVar = qVar;
                    voicePickerSearchListViewModel2 = voicePickerSearchListViewModel3;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            voicePickerSearchListViewModel3 = voicePickerSearchListViewModel;
            qVar.q();
            z0 l42 = c1.l(voicePickerSearchListViewModel3.getUiStateFlow(), VoicePickerSearchListContract.UiState.Initial.INSTANCE, qVar, 48);
            z0 m102 = c1.m(voicePickerSearchListViewModel3.getSharedStateFlow(), qVar, 0);
            boolean VoicePickerSearchListScreen__orJrPs$lambda$22 = VoicePickerSearchListScreen__orJrPs$lambda$2(c1.l(voicePickerSearchListViewModel3.getScrollUpFlow(), Boolean.FALSE, qVar, 48));
            VoicePickerSearchListContract.UiState VoicePickerSearchListScreen__orJrPs$lambda$02 = VoicePickerSearchListScreen__orJrPs$lambda$0(l42);
            h10 = qVar.h(voicePickerSearchListViewModel3);
            L = qVar.L();
            e eVar2 = l.f33918a;
            if (!h10) {
            }
            L = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$1$1(voicePickerSearchListViewModel3);
            qVar.h0(L);
            ho.l lVar3 = (ho.l) ((oo.g) L);
            VoicePickerSharedContract.State VoicePickerSearchListScreen__orJrPs$lambda$12 = VoicePickerSearchListScreen__orJrPs$lambda$1(m102);
            h11 = qVar.h(voicePickerSearchListViewModel3);
            L2 = qVar.L();
            if (!h11) {
            }
            L2 = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$2$1(voicePickerSearchListViewModel3);
            qVar.h0(L2);
            ho.l lVar22 = (ho.l) ((oo.g) L2);
            h12 = qVar.h(voicePickerSearchListViewModel3);
            L3 = qVar.L();
            if (!h12) {
            }
            L3 = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreen$3$1(voicePickerSearchListViewModel3);
            qVar.h0(L3);
            m1610VoicePickerSearchListScreenUIQ1bl1hc(f10, VoicePickerSearchListScreen__orJrPs$lambda$22, VoicePickerSearchListScreen__orJrPs$lambda$02, lVar3, VoicePickerSearchListScreen__orJrPs$lambda$12, lVar22, (ho.l) L3, qVar, i15 & 14);
            qVar = qVar;
            voicePickerSearchListViewModel2 = voicePickerSearchListViewModel3;
        } else {
            qVar.R();
            voicePickerSearchListViewModel2 = voicePickerSearchListViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a1(f10, voicePickerSearchListViewModel2, i10, i11, 6);
        }
    }

    /* renamed from: VoicePickerSearchListScreenUI-Q1bl1hc */
    public static final void m1610VoicePickerSearchListScreenUIQ1bl1hc(float f10, boolean z6, VoicePickerSearchListContract.UiState uiState, ho.l lVar, VoicePickerSharedContract.State state, ho.l lVar2, ho.l lVar3, m mVar, int i10) {
        int i11;
        ho.l lVar4;
        ho.l lVar5;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean h10;
        int i16;
        int i17;
        int i18;
        uiState.getClass();
        lVar.getClass();
        state.getClass();
        lVar2.getClass();
        lVar3.getClass();
        q qVar = (q) mVar;
        qVar.Z(1708597265);
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
            if (qVar.g(z6)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                h10 = qVar.f(uiState);
            } else {
                h10 = qVar.h(uiState);
            }
            if (h10) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
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
            lVar4 = lVar2;
            if (qVar.h(lVar4)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i11 |= i13;
        } else {
            lVar4 = lVar2;
        }
        if ((1572864 & i10) == 0) {
            lVar5 = lVar3;
            if (qVar.h(lVar5)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i11 |= i12;
        } else {
            lVar5 = lVar3;
        }
        if ((599187 & i11) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            final t1.z a10 = b0.a(0, qVar, 3);
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = r.s(new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.a
                    @Override // ho.a
                    public final Object invoke() {
                        boolean reachedEnd$default;
                        reachedEnd$default = LazyListExtensionsKt.reachedEnd$default(t1.z.this, 0, 1, null);
                        return Boolean.valueOf(reachedEnd$default);
                    }
                });
                qVar.h0(L);
            }
            s2 s2Var = (s2) L;
            Boolean valueOf = Boolean.valueOf(VoicePickerSearchListScreenUI_Q1bl1hc$lambda$1(s2Var));
            if ((i11 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L2 = qVar.L();
            int i19 = i11;
            if (z11 || L2 == eVar) {
                L2 = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$1$1(lVar, s2Var, null);
                qVar.h0(L2);
            }
            r.f((ho.p) L2, valueOf, qVar);
            Boolean valueOf2 = Boolean.valueOf(z6);
            if ((i19 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean f11 = z12 | qVar.f(a10);
            Object L3 = qVar.L();
            if (f11 || L3 == eVar) {
                L3 = new VoicePickerSearchListScreenKt$VoicePickerSearchListScreenUI$2$1(z6, a10, null);
                qVar.h0(L3);
            }
            r.f((ho.p) L3, valueOf2, qVar);
            if (uiState instanceof VoicePickerSearchListContract.UiState.Data) {
                qVar.X(1164375714);
                VoicePickerSearchListContract.UiState.Data data = (VoicePickerSearchListContract.UiState.Data) uiState;
                VoicePickerSectionsListKt.m1618VoicePickerSectionsListQ1bl1hc(f10, a10, data.isLoadingMore(), data.getSections(), state, lVar4, lVar5, qVar, i19 & 4186126);
                qVar = qVar;
                qVar.p(false);
            } else if (uiState instanceof VoicePickerSearchListContract.UiState.Empty) {
                qVar.X(1164797686);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(null, kj.c.R(qVar, R.string.voices_no_matching_voices_title), kj.c.R(qVar, R.string.voices_no_matching_voices_text), null, null, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), qVar, 0, 25);
                qVar = qVar;
                qVar.p(false);
            } else if (uiState instanceof VoicePickerSearchListContract.UiState.Initial) {
                qVar.X(1165132176);
                i3.q qVar2 = i3.q.f13017a;
                t d10 = p2.d(qVar2, 1.0f);
                u0 u0Var = j.f29228a;
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i20 = ElevenLabsTheme.$stable;
                x a11 = w.a(j.i(elevenLabsTheme.getSpacings(qVar, i20).m2353getX2D9Ej5fM(), i3.d.f13005z0), i3.d.C0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(d10, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a11, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.magnifying_glass, qVar, 0), null, p2.o(qVar2, 80), defpackage.f.b(elevenLabsTheme, qVar, i20), qVar, u3.c.$stable | 432, 0);
                j7.d(kj.c.R(qVar, R.string.voices_search_empty_state), r1.d.I(qVar2, u.P, elevenLabsTheme.getSpacings(qVar, i20).m2353getX2D9Ej5fM(), u.P, u.P, 13), 0L, 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i20).getSubtitleLarge500(), qVar, 0, 0, 130044);
                qVar = qVar;
                qVar.p(true);
                qVar.p(false);
            } else if (uiState instanceof VoicePickerSearchListContract.UiState.Loading) {
                qVar.X(1166120208);
                VoicePickerSectionsListKt.VoicePickerSectionsLoadingList(8, qVar, 6);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(1284486573, qVar, false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(f10, z6, uiState, lVar, state, lVar2, lVar3, i10);
        }
    }

    public static final boolean VoicePickerSearchListScreenUI_Q1bl1hc$lambda$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final z VoicePickerSearchListScreenUI_Q1bl1hc$lambda$5(float f10, boolean z6, VoicePickerSearchListContract.UiState uiState, ho.l lVar, VoicePickerSharedContract.State state, ho.l lVar2, ho.l lVar3, int i10, m mVar, int i11) {
        m1610VoicePickerSearchListScreenUIQ1bl1hc(f10, z6, uiState, lVar, state, lVar2, lVar3, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final VoicePickerSearchListContract.UiState VoicePickerSearchListScreen__orJrPs$lambda$0(s2 s2Var) {
        return (VoicePickerSearchListContract.UiState) s2Var.getValue();
    }

    private static final VoicePickerSharedContract.State VoicePickerSearchListScreen__orJrPs$lambda$1(s2 s2Var) {
        return (VoicePickerSharedContract.State) s2Var.getValue();
    }

    private static final boolean VoicePickerSearchListScreen__orJrPs$lambda$2(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final z VoicePickerSearchListScreen__orJrPs$lambda$6(float f10, VoicePickerSearchListViewModel voicePickerSearchListViewModel, int i10, int i11, m mVar, int i12) {
        m1609VoicePickerSearchListScreenorJrPs(f10, voicePickerSearchListViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
