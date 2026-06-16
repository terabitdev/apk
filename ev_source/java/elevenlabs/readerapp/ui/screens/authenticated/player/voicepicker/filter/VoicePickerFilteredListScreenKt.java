package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import a2.o0;
import c3.j;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i3.t;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.a1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import r1.d2;
import r1.p;
import r1.p2;
import rd.c1;
import sn.z;
import t1.b0;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u000f\u0010\u001a\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001c²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lh5/f;", "bottomPadding", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListViewModel;", "viewModel", "Lsn/z;", "VoicePickerFilteredListScreen--orJrPs", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListViewModel;Lu2/m;II)V", "VoicePickerFilteredListScreen", "", "scrollUp", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$Event;", "onEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "VoicePickerFilteredListScreenUI-PBTpf3Q", "(FZLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "VoicePickerFilteredListScreenUI", "Preview_VoiceFilteredListScreen_Empty", "(Lu2/m;I)V", "Preview_VoiceFilteredListScreen_Loading", "Preview_VoiceFilteredListScreen_Error", "Preview_VoiceFilteredListScreen_Data", "hasReachedEnd", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerFilteredListScreenKt {
    public static final void Preview_VoiceFilteredListScreen_Data(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-563309494);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<Voice> stubVoicesList = VoicesFactoryKt.stubVoicesList();
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            float f10 = 0;
            VoicePickerFilteredListContract.UiState.Data data = new VoicePickerFilteredListContract.UiState.Data(stubVoicesList, true);
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new h(4);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new h(5);
                qVar.h0(L2);
            }
            m1579VoicePickerFilteredListScreenUIPBTpf3Q(f10, false, data, lVar, state, (ho.l) L2, qVar, 199734);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 1);
        }
    }

    public static final z Preview_VoiceFilteredListScreen_Data$lambda$0$0$0(VoicePickerFilteredListContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Data$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Data$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceFilteredListScreen_Data(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceFilteredListScreen_Empty(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(267148681);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            float f10 = 0;
            VoicePickerFilteredListContract.UiState.Empty empty = VoicePickerFilteredListContract.UiState.Empty.INSTANCE;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new h(2);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new h(3);
                qVar.h0(L2);
            }
            m1579VoicePickerFilteredListScreenUIPBTpf3Q(f10, false, empty, lVar, state, (ho.l) L2, qVar, 200118);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 0);
        }
    }

    public static final z Preview_VoiceFilteredListScreen_Empty$lambda$0$0$0(VoicePickerFilteredListContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Empty$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Empty$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceFilteredListScreen_Empty(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceFilteredListScreen_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1498052590);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            float f10 = 0;
            VoicePickerFilteredListContract.UiState.Error error = new VoicePickerFilteredListContract.UiState.Error("Did you know Scotland has 421 words for snow?");
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new h(6);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new h(7);
                qVar.h0(L2);
            }
            m1579VoicePickerFilteredListScreenUIPBTpf3Q(f10, false, error, lVar, state, (ho.l) L2, qVar, 199734);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 2);
        }
    }

    public static final z Preview_VoiceFilteredListScreen_Error$lambda$0$0$0(VoicePickerFilteredListContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Error$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Error$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceFilteredListScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceFilteredListScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-149166086);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(h10, qVar);
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
            float f10 = 0;
            VoicePickerFilteredListContract.UiState.Loading loading = VoicePickerFilteredListContract.UiState.Loading.INSTANCE;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new h(8);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new h(9);
                qVar.h0(L2);
            }
            m1579VoicePickerFilteredListScreenUIPBTpf3Q(f10, false, loading, lVar, state, (ho.l) L2, qVar, 200118);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 3);
        }
    }

    public static final z Preview_VoiceFilteredListScreen_Loading$lambda$0$0$0(VoicePickerFilteredListContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Loading$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceFilteredListScreen_Loading$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceFilteredListScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* renamed from: VoicePickerFilteredListScreen--orJrPs */
    public static final void m1578VoicePickerFilteredListScreenorJrPs(float f10, VoicePickerFilteredListViewModel voicePickerFilteredListViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        VoicePickerFilteredListViewModel voicePickerFilteredListViewModel2;
        q7.c cVar;
        VoicePickerFilteredListViewModel voicePickerFilteredListViewModel3;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(1498638679);
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
            if ((i11 & 2) == 0 && qVar.h(voicePickerFilteredListViewModel)) {
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
                    voicePickerFilteredListViewModel3 = (VoicePickerFilteredListViewModel) gg.b.j0(e0.f20562a.b(VoicePickerFilteredListViewModel.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    z0 l4 = c1.l(voicePickerFilteredListViewModel3.getUiStateFlow(), VoicePickerFilteredListContract.UiState.Loading.INSTANCE, qVar, 48);
                    z0 m10 = c1.m(voicePickerFilteredListViewModel3.getSharedStateFlow(), qVar, 0);
                    boolean VoicePickerFilteredListScreen__orJrPs$lambda$2 = VoicePickerFilteredListScreen__orJrPs$lambda$2(c1.l(voicePickerFilteredListViewModel3.getScrollUpFlow(), Boolean.FALSE, qVar, 48));
                    VoicePickerFilteredListContract.UiState VoicePickerFilteredListScreen__orJrPs$lambda$0 = VoicePickerFilteredListScreen__orJrPs$lambda$0(l4);
                    h10 = qVar.h(voicePickerFilteredListViewModel3);
                    L = qVar.L();
                    u2.e eVar = l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreen$1$1(voicePickerFilteredListViewModel3);
                        qVar.h0(L);
                    }
                    ho.l lVar = (ho.l) ((oo.g) L);
                    VoicePickerSharedContract.State VoicePickerFilteredListScreen__orJrPs$lambda$1 = VoicePickerFilteredListScreen__orJrPs$lambda$1(m10);
                    h11 = qVar.h(voicePickerFilteredListViewModel3);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreen$2$1(voicePickerFilteredListViewModel3);
                        qVar.h0(L2);
                    }
                    m1579VoicePickerFilteredListScreenUIPBTpf3Q(f10, VoicePickerFilteredListScreen__orJrPs$lambda$2, VoicePickerFilteredListScreen__orJrPs$lambda$0, lVar, VoicePickerFilteredListScreen__orJrPs$lambda$1, (ho.l) ((oo.g) L2), qVar, i15 & 14);
                    qVar = qVar;
                    voicePickerFilteredListViewModel2 = voicePickerFilteredListViewModel3;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            voicePickerFilteredListViewModel3 = voicePickerFilteredListViewModel;
            qVar.q();
            z0 l42 = c1.l(voicePickerFilteredListViewModel3.getUiStateFlow(), VoicePickerFilteredListContract.UiState.Loading.INSTANCE, qVar, 48);
            z0 m102 = c1.m(voicePickerFilteredListViewModel3.getSharedStateFlow(), qVar, 0);
            boolean VoicePickerFilteredListScreen__orJrPs$lambda$22 = VoicePickerFilteredListScreen__orJrPs$lambda$2(c1.l(voicePickerFilteredListViewModel3.getScrollUpFlow(), Boolean.FALSE, qVar, 48));
            VoicePickerFilteredListContract.UiState VoicePickerFilteredListScreen__orJrPs$lambda$02 = VoicePickerFilteredListScreen__orJrPs$lambda$0(l42);
            h10 = qVar.h(voicePickerFilteredListViewModel3);
            L = qVar.L();
            u2.e eVar2 = l.f33918a;
            if (!h10) {
            }
            L = new VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreen$1$1(voicePickerFilteredListViewModel3);
            qVar.h0(L);
            ho.l lVar2 = (ho.l) ((oo.g) L);
            VoicePickerSharedContract.State VoicePickerFilteredListScreen__orJrPs$lambda$12 = VoicePickerFilteredListScreen__orJrPs$lambda$1(m102);
            h11 = qVar.h(voicePickerFilteredListViewModel3);
            L2 = qVar.L();
            if (!h11) {
            }
            L2 = new VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreen$2$1(voicePickerFilteredListViewModel3);
            qVar.h0(L2);
            m1579VoicePickerFilteredListScreenUIPBTpf3Q(f10, VoicePickerFilteredListScreen__orJrPs$lambda$22, VoicePickerFilteredListScreen__orJrPs$lambda$02, lVar2, VoicePickerFilteredListScreen__orJrPs$lambda$12, (ho.l) ((oo.g) L2), qVar, i15 & 14);
            qVar = qVar;
            voicePickerFilteredListViewModel2 = voicePickerFilteredListViewModel3;
        } else {
            qVar.R();
            voicePickerFilteredListViewModel2 = voicePickerFilteredListViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a1(f10, voicePickerFilteredListViewModel2, i10, i11, 4);
        }
    }

    /* renamed from: VoicePickerFilteredListScreenUI-PBTpf3Q */
    public static final void m1579VoicePickerFilteredListScreenUIPBTpf3Q(final float f10, final boolean z6, final VoicePickerFilteredListContract.UiState uiState, final ho.l lVar, final VoicePickerSharedContract.State state, final ho.l lVar2, m mVar, final int i10) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        int i14;
        boolean h10;
        int i15;
        int i16;
        int i17;
        uiState.getClass();
        lVar.getClass();
        state.getClass();
        lVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(-831589834);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                h10 = qVar.f(uiState);
            } else {
                h10 = qVar.h(uiState);
            }
            if (h10) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(state)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(lVar2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((74899 & i11) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            t1.z a10 = b0.a(0, qVar, 3);
            Object L = qVar.L();
            Object obj = l.f33918a;
            if (L == obj) {
                L = r.s(new f(a10, 1));
                qVar.h0(L);
            }
            s2 s2Var = (s2) L;
            Boolean valueOf = Boolean.valueOf(VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$1(s2Var));
            if ((i11 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L2 = qVar.L();
            if (z11 || L2 == obj) {
                L2 = new VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$1$1(lVar, s2Var, null);
                qVar.h0(L2);
            }
            r.f((ho.p) L2, valueOf, qVar);
            Boolean valueOf2 = Boolean.valueOf(z6);
            if ((i11 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean f11 = z12 | qVar.f(a10);
            Object L3 = qVar.L();
            if (f11 || L3 == obj) {
                L3 = new VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI$2$1(z6, a10, null);
                qVar.h0(L3);
            }
            r.f((ho.p) L3, valueOf2, qVar);
            boolean z15 = uiState instanceof VoicePickerFilteredListContract.UiState.Data;
            i3.q qVar2 = i3.q.f13017a;
            if (z15) {
                qVar.X(-520701007);
                h5.f fVar = new h5.f(f10);
                h5.f fVar2 = new h5.f(ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2353getX2D9Ej5fM());
                if (fVar.compareTo(fVar2) < 0) {
                    fVar = fVar2;
                }
                d2 f12 = r1.d.f(u.P, u.P, u.P, fVar.f12083a, 7);
                t d10 = p2.d(qVar2, 1.0f);
                if ((i11 & 896) != 256 && ((i11 & 512) == 0 || !qVar.h(uiState))) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                boolean h11 = z13 | qVar.h(state);
                if ((i11 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z16 = z14 | h11;
                Object L4 = qVar.L();
                if (z16 || L4 == obj) {
                    L4 = new o0(uiState, state, lVar2, 29);
                    qVar.h0(L4);
                }
                c1.c(d10, a10, f12, false, null, null, null, false, null, (ho.l) L4, qVar, 6, 504);
                qVar = qVar;
                qVar.p(false);
            } else if (uiState instanceof VoicePickerFilteredListContract.UiState.Empty) {
                qVar.X(-519060456);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(null, kj.c.R(qVar, R.string.voices_no_matching_voices_title), kj.c.R(qVar, R.string.voices_no_matching_voices_text), null, null, 0L, qVar, 0, 57);
                qVar.p(false);
            } else if (uiState instanceof VoicePickerFilteredListContract.UiState.Error) {
                qVar.X(-518812084);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(p2.d(qVar2, 1.0f), null, ((VoicePickerFilteredListContract.UiState.Error) uiState).getError(), null, k.d(-1176384463, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.c
                    @Override // ho.p
                    public final Object invoke(Object obj2, Object obj3) {
                        z VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5;
                        int intValue = ((Integer) obj3).intValue();
                        VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5 = VoicePickerFilteredListScreenKt.VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5(ho.l.this, (m) obj2, intValue);
                        return VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5;
                    }
                }, qVar), 0L, qVar, 24582, 42);
                qVar.p(false);
            } else if (uiState instanceof VoicePickerFilteredListContract.UiState.Loading) {
                qVar.X(-518317045);
                VoicePickerSectionsListKt.VoicePickerSectionsLoadingList(8, qVar, 6);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(-293892342, qVar, false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.d
                @Override // ho.p
                public final Object invoke(Object obj2, Object obj3) {
                    z VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$6;
                    int intValue = ((Integer) obj3).intValue();
                    VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$6 = VoicePickerFilteredListScreenKt.VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$6(f10, z6, uiState, lVar, state, lVar2, i10, (m) obj2, intValue);
                    return VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$6;
                }
            };
        }
    }

    public static final boolean VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final z VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0(VoicePickerFilteredListContract.UiState uiState, final VoicePickerSharedContract.State state, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        VoicePickerFilteredListContract.UiState.Data data = (VoicePickerFilteredListContract.UiState.Data) uiState;
        if (!data.getItems().isEmpty()) {
            final List<Voice> items = data.getItems();
            final a aVar = new a(8);
            ((t1.i) tVar).u(items.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$$inlined$itemsIndexed$1
                public final Object invoke(int i10) {
                    return ho.p.this.invoke(Integer.valueOf(i10), items.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$$inlined$itemsIndexed$2
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Object invoke(int i10) {
                    return VoicePickerContract.ViewType.VOICE_ROW;
                }
            }, new j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListScreenKt$VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$$inlined$itemsIndexed$3
                public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                    int i12;
                    boolean z6;
                    int i13;
                    int i14;
                    if ((i11 & 6) == 0) {
                        if (((q) mVar).f(bVar)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i12 = i14 | i11;
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
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    q qVar = (q) mVar;
                    if (qVar.O(i12 & 1, z6)) {
                        Voice voice = (Voice) items.get(i10);
                        qVar.X(1921580844);
                        VoicePickerVoiceRowKt.VoicePickerVoiceRow(voice, state, lVar, false, false, qVar, 0, 24);
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
            }, true, 2039820996));
        }
        if (data.isLoadingMore()) {
            ((t1.i) tVar).t(VoicePickerContract.ViewType.VOICE_PAGINATION_LOADING_SHIMMER, VoicePickerContract.ViewType.VOICE_PAGINATION_LOADING_SHIMMER, ComposableSingletons$VoicePickerFilteredListScreenKt.INSTANCE.getLambda$1423597303$app_productionRelease());
        } else {
            ((t1.i) tVar).t(VoicePickerContract.ViewType.LIST_BOTTOM_SPACER, VoicePickerContract.ViewType.LIST_BOTTOM_SPACER, ComposableSingletons$VoicePickerFilteredListScreenKt.INSTANCE.getLambda$1126711054$app_productionRelease());
        }
        return z.f31622a;
    }

    public static final Object VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$4$0$0(int i10, Voice voice) {
        voice.getClass();
        return defpackage.f.i("filters_active_voice_picker_view_type_voice_row_", voice.getVoiceId());
    }

    public static final z VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5(ho.l lVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            ButtonVariant buttonVariant = ButtonVariant.Primary;
            ButtonSize buttonSize = ButtonSize.Small;
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == l.f33918a) {
                L = new f(lVar, 0);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, null, buttonSize, buttonVariant, null, null, false, false, false, qVar, 27648, 996);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5$0$0(ho.l lVar) {
        lVar.invoke(VoicePickerFilteredListContract.Event.ErrorRetry.INSTANCE);
        return z.f31622a;
    }

    public static final z VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$6(float f10, boolean z6, VoicePickerFilteredListContract.UiState uiState, ho.l lVar, VoicePickerSharedContract.State state, ho.l lVar2, int i10, m mVar, int i11) {
        m1579VoicePickerFilteredListScreenUIPBTpf3Q(f10, z6, uiState, lVar, state, lVar2, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final VoicePickerFilteredListContract.UiState VoicePickerFilteredListScreen__orJrPs$lambda$0(s2 s2Var) {
        return (VoicePickerFilteredListContract.UiState) s2Var.getValue();
    }

    private static final VoicePickerSharedContract.State VoicePickerFilteredListScreen__orJrPs$lambda$1(s2 s2Var) {
        return (VoicePickerSharedContract.State) s2Var.getValue();
    }

    private static final boolean VoicePickerFilteredListScreen__orJrPs$lambda$2(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final z VoicePickerFilteredListScreen__orJrPs$lambda$5(float f10, VoicePickerFilteredListViewModel voicePickerFilteredListViewModel, int i10, int i11, m mVar, int i12) {
        m1578VoicePickerFilteredListScreenorJrPs(f10, voicePickerFilteredListViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
