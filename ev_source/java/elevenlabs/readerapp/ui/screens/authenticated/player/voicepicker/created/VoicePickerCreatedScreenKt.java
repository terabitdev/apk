package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created;

import androidx.lifecycle.j1;
import c3.j;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import e5.k;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.a1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpec;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q7.c;
import r1.d2;
import r1.p;
import r1.p2;
import rd.c1;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a;\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lh5/f;", "bottomPadding", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/created/VoicePickerCreatedViewModel;", "viewModel", "Lsn/z;", "VoicePickerCreatedScreen--orJrPs", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/created/VoicePickerCreatedViewModel;Lu2/m;II)V", "VoicePickerCreatedScreen", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "VoicePickerCreatedScreenUI-Kz89ssw", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListContract$State;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "VoicePickerCreatedScreenUI", "Preview_VoiceCreatedScreen_Loading", "(Lu2/m;I)V", "Preview_VoiceCreatedScreen_Loading_NonEmptyItems", "Preview_VoiceCreatedScreen_Error", "Preview_VoiceCreatedScreen_Error_NonEmptyItems", "Preview_VoiceCreatedScreen_Data", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerCreatedScreenKt {
    public static final void Preview_VoiceCreatedScreen_Data(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1478670196);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<Voice> stubVoicesList = VoicesFactoryKt.stubVoicesList();
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(d.f12997a, false);
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
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.READY, stubVoicesList);
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(6);
                qVar.h0(L);
            }
            m1554VoicePickerCreatedScreenUIKz89ssw(f10, state, state2, (ho.l) L, qVar, 3078);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 20);
        }
    }

    public static final z Preview_VoiceCreatedScreen_Data$lambda$0$0$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCreatedScreen_Data$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceCreatedScreen_Data(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceCreatedScreen_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-2025086690);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(d.f12997a, false);
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
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.ERROR, tn.t.f33547a);
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(4);
                qVar.h0(L);
            }
            m1554VoicePickerCreatedScreenUIKz89ssw(f10, state, state2, (ho.l) L, qVar, 3078);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 23);
        }
    }

    public static final z Preview_VoiceCreatedScreen_Error$lambda$0$0$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCreatedScreen_Error$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceCreatedScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceCreatedScreen_Error_NonEmptyItems(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-476493571);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<Voice> stubVoicesList = VoicesFactoryKt.stubVoicesList();
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(d.f12997a, false);
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
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.ERROR, stubVoicesList);
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(3);
                qVar.h0(L);
            }
            m1554VoicePickerCreatedScreenUIKz89ssw(f10, state, state2, (ho.l) L, qVar, 3078);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 21);
        }
    }

    public static final z Preview_VoiceCreatedScreen_Error_NonEmptyItems$lambda$0$0$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCreatedScreen_Error_NonEmptyItems$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceCreatedScreen_Error_NonEmptyItems(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceCreatedScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(964317546);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(d.f12997a, false);
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
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.SYNCING, tn.t.f33547a);
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(5);
                qVar.h0(L);
            }
            m1554VoicePickerCreatedScreenUIKz89ssw(f10, state, state2, (ho.l) L, qVar, 3078);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 24);
        }
    }

    public static final z Preview_VoiceCreatedScreen_Loading$lambda$0$0$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCreatedScreen_Loading$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceCreatedScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceCreatedScreen_Loading_NonEmptyItems(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1284012983);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<Voice> stubVoicesList = VoicesFactoryKt.stubVoicesList();
            t h10 = n.h(p2.d(i3.q.f13017a, 1.0f), i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
            f1 d10 = p.d(d.f12997a, false);
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
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.SYNCING, stubVoicesList);
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(2);
                qVar.h0(L);
            }
            m1554VoicePickerCreatedScreenUIKz89ssw(f10, state, state2, (ho.l) L, qVar, 3078);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 22);
        }
    }

    public static final z Preview_VoiceCreatedScreen_Loading_NonEmptyItems$lambda$0$0$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCreatedScreen_Loading_NonEmptyItems$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceCreatedScreen_Loading_NonEmptyItems(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if ((r16 & 2) != 0) goto L89;
     */
    /* renamed from: VoicePickerCreatedScreen--orJrPs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1553VoicePickerCreatedScreenorJrPs(float f10, VoicePickerCreatedViewModel voicePickerCreatedViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        c cVar;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-1914433336);
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
            if ((i11 & 2) == 0 && qVar.h(voicePickerCreatedViewModel)) {
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
            } else {
                if ((i11 & 2) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        j1 j02 = gg.b.j0(e0.f20562a.b(VoicePickerCreatedViewModel.class), a10, null, o6, cVar, qVar);
                        qVar = qVar;
                        voicePickerCreatedViewModel = (VoicePickerCreatedViewModel) j02;
                        i12 &= -113;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                z0 m10 = c1.m(voicePickerCreatedViewModel.getSharedStateFlow(), qVar, 0);
                VoicesListContract.State VoicePickerCreatedScreen__orJrPs$lambda$1 = VoicePickerCreatedScreen__orJrPs$lambda$1(c1.m(voicePickerCreatedViewModel.getStateFlow(), qVar, 0));
                VoicePickerSharedContract.State VoicePickerCreatedScreen__orJrPs$lambda$0 = VoicePickerCreatedScreen__orJrPs$lambda$0(m10);
                boolean h10 = qVar.h(voicePickerCreatedViewModel);
                Object L = qVar.L();
                if (h10 || L == l.f33918a) {
                    L = new VoicePickerCreatedScreenKt$VoicePickerCreatedScreen$1$1(voicePickerCreatedViewModel);
                    qVar.h0(L);
                }
                m1554VoicePickerCreatedScreenUIKz89ssw(f10, VoicePickerCreatedScreen__orJrPs$lambda$1, VoicePickerCreatedScreen__orJrPs$lambda$0, (ho.l) ((oo.g) L), qVar, i12 & 14);
            }
        } else {
            qVar.R();
        }
        VoicePickerCreatedViewModel voicePickerCreatedViewModel2 = voicePickerCreatedViewModel;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a1(f10, voicePickerCreatedViewModel2, i10, i11, 1);
        }
    }

    /* renamed from: VoicePickerCreatedScreenUI-Kz89ssw */
    public static final void m1554VoicePickerCreatedScreenUIKz89ssw(float f10, VoicesListContract.State state, VoicePickerSharedContract.State state2, ho.l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        state.getClass();
        state2.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1930841115);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(state)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(state2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        boolean z10 = true;
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            boolean isEmpty = state.getVoices().isEmpty();
            i3.q qVar2 = i3.q.f13017a;
            if (!isEmpty) {
                qVar.X(-809050495);
                h5.f fVar = new h5.f(f10);
                h5.f fVar2 = new h5.f(ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM());
                if (fVar.compareTo(fVar2) < 0) {
                    fVar = fVar2;
                }
                d2 f11 = r1.d.f(u.P, u.P, u.P, fVar.f12083a, 7);
                t d10 = p2.d(qVar2, 1.0f);
                boolean h10 = qVar.h(state);
                if ((i11 & 7168) != 2048) {
                    z10 = false;
                }
                boolean h11 = h10 | z10 | qVar.h(state2);
                Object L = qVar.L();
                if (h11 || L == l.f33918a) {
                    L = new a(state, lVar, state2);
                    qVar.h0(L);
                }
                c1.c(d10, null, f11, false, null, null, null, false, null, (ho.l) L, qVar, 6, 506);
                qVar = qVar;
                qVar.p(false);
            } else {
                boolean z11 = false;
                qVar.X(-806638881);
                if (state.getShowError()) {
                    qVar.X(-806613678);
                    ErrorScreenKt.m1836ErrorScreenV9fs2A(p2.d(qVar2, 1.0f), null, null, null, null, 0L, qVar, 6, 62);
                    qVar.p(false);
                } else if (state.getShowLoading()) {
                    qVar.X(-806464258);
                    VoicePickerSectionsListKt.VoicePickerSectionsLoadingList(8, qVar, 6);
                    qVar.p(false);
                } else {
                    qVar.X(-806355882);
                    t d11 = p2.d(qVar2, 1.0f);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i16 = ElevenLabsTheme.$stable;
                    t x10 = i.x(elevenLabsTheme, qVar, i16, d11);
                    f1 d12 = p.d(d.f13001e, false);
                    int hashCode = Long.hashCode(qVar.T);
                    o l4 = qVar.l();
                    t c5 = i3.a.c(x10, qVar);
                    h.f11920i.getClass();
                    f fVar3 = g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar3);
                    } else {
                        qVar.k0();
                    }
                    r.J(g.f11907f, d12, qVar);
                    r.J(g.f11906e, l4, qVar);
                    r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                    r.F(g.f11909h, qVar);
                    r.J(g.f11905d, c5, qVar);
                    j7.d(kj.c.R(qVar, R.string.voice_created_empty_state), null, 0L, 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i16).getSubtitleLarge500(), qVar, 0, 0, 130046);
                    qVar = qVar;
                    qVar.p(true);
                    z11 = false;
                    qVar.p(false);
                }
                qVar.p(z11);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(f10, state, state2, lVar, i10, 0);
        }
    }

    public static final z VoicePickerCreatedScreenUI_Kz89ssw$lambda$0$0(VoicesListContract.State state, final ho.l lVar, final VoicePickerSharedContract.State state2, t1.t tVar) {
        tVar.getClass();
        final List<Voice> voices = state.getVoices();
        ((t1.i) tVar).u(voices.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI_Kz89ssw$lambda$0$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                voices.get(i10);
                return null;
            }
        }, new j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI_Kz89ssw$lambda$0$0$$inlined$itemsIndexed$default$3
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                q qVar;
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
                    z6 = true;
                } else {
                    z6 = false;
                }
                q qVar2 = (q) mVar;
                if (qVar2.O(i12 & 1, z6)) {
                    final Voice voice = (Voice) voices.get(i10);
                    qVar2.X(-242997754);
                    if (voice.getCategory() == VoiceCategory.Generated) {
                        qVar2.X(-242959811);
                        final ActionConfig actionConfig = new ActionConfig(io.elevenlabs.ui.R.drawable.trash, kj.c.R(qVar2, R.string.swipe_action_delete), ReaderColors.INSTANCE.m2449getRed5000d7_KjU(), false, true, null);
                        final ho.l lVar2 = lVar;
                        ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(c3.k.d(2073415956, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI$1$1$1$spec$1
                            public final void invoke(ActionSpecBuilder actionSpecBuilder, m mVar2, int i15) {
                                boolean z10;
                                boolean h10;
                                int i16;
                                actionSpecBuilder.getClass();
                                if ((i15 & 6) == 0) {
                                    if ((i15 & 8) == 0) {
                                        h10 = ((q) mVar2).f(actionSpecBuilder);
                                    } else {
                                        h10 = ((q) mVar2).h(actionSpecBuilder);
                                    }
                                    if (h10) {
                                        i16 = 4;
                                    } else {
                                        i16 = 2;
                                    }
                                    i15 |= i16;
                                }
                                if ((i15 & 19) != 18) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                q qVar3 = (q) mVar2;
                                if (qVar3.O(i15 & 1, z10)) {
                                    boolean h11 = qVar3.h(ActionConfig.this) | qVar3.f(lVar2) | qVar3.h(voice);
                                    final ActionConfig actionConfig2 = ActionConfig.this;
                                    final ho.l lVar3 = lVar2;
                                    final Voice voice2 = voice;
                                    Object L = qVar3.L();
                                    u2.e eVar = l.f33918a;
                                    if (h11 || L == eVar) {
                                        L = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI$1$1$1$spec$1$1$1
                                            public final void invoke(ActionSpecBuilder.HandlerScope handlerScope) {
                                                handlerScope.getClass();
                                                ActionConfig actionConfig3 = ActionConfig.this;
                                                final ho.l lVar4 = lVar3;
                                                final Voice voice3 = voice2;
                                                handlerScope.handledBy(actionConfig3, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI$1$1$1$spec$1$1$1.1
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1556invoke() {
                                                        ho.l.this.invoke(new VoicePickerSharedContract.Event.ConfirmDeleteVoice(voice3));
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1556invoke();
                                                        return z.f31622a;
                                                    }
                                                });
                                            }

                                            @Override // ho.l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((ActionSpecBuilder.HandlerScope) obj);
                                                return z.f31622a;
                                            }
                                        };
                                        qVar3.h0(L);
                                    }
                                    actionSpecBuilder.handlers((ho.l) L);
                                    boolean h12 = qVar3.h(ActionConfig.this);
                                    final ActionConfig actionConfig3 = ActionConfig.this;
                                    Object L2 = qVar3.L();
                                    if (h12 || L2 == eVar) {
                                        L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI$1$1$1$spec$1$2$1
                                            public final void invoke(ActionSpecBuilder.PlacementScope placementScope) {
                                                placementScope.getClass();
                                                placementScope.setEndSide(ig.f.H(ActionConfig.this));
                                                placementScope.setLongPress(ig.f.H(ActionConfig.this));
                                            }

                                            @Override // ho.l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((ActionSpecBuilder.PlacementScope) obj);
                                                return z.f31622a;
                                            }
                                        };
                                        qVar3.h0(L2);
                                    }
                                    actionSpecBuilder.placement((ho.l) L2);
                                    return;
                                }
                                qVar3.R();
                            }

                            @Override // ho.q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((ActionSpecBuilder) obj, (m) obj2, ((Number) obj3).intValue());
                                return z.f31622a;
                            }
                        }, qVar2), qVar2, 6);
                        String name = voice.getName();
                        boolean f10 = qVar2.f(lVar) | qVar2.h(voice);
                        Object L = qVar2.L();
                        if (f10 || L == l.f33918a) {
                            final ho.l lVar3 = lVar;
                            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI$1$1$1$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1555invoke() {
                                    ho.l.this.invoke(new VoicePickerSharedContract.Event.SelectVoice(voice, true));
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1555invoke();
                                    return z.f31622a;
                                }
                            };
                            qVar2.h0(L);
                        }
                        ho.a aVar = (ho.a) L;
                        final VoicePickerSharedContract.State state3 = state2;
                        final ho.l lVar4 = lVar;
                        qVar = qVar2;
                        SwipeToActionBoxKt.SwipeToActionBox(name, null, aVar, actionSpec, null, null, c3.k.d(-1086756193, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedScreenKt$VoicePickerCreatedScreenUI$1$1$1$2
                            public final void invoke(m mVar2, int i15) {
                                boolean z10;
                                if ((i15 & 3) != 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                q qVar3 = (q) mVar2;
                                if (qVar3.O(i15 & 1, z10)) {
                                    t h10 = n.h(i3.q.f13017a, i.d(ElevenLabsTheme.INSTANCE, qVar3, ElevenLabsTheme.$stable), h0.f26395b);
                                    Voice voice2 = Voice.this;
                                    VoicePickerSharedContract.State state4 = state3;
                                    ho.l lVar5 = lVar4;
                                    f1 d10 = p.d(d.f12997a, false);
                                    int hashCode = Long.hashCode(qVar3.T);
                                    o l4 = qVar3.l();
                                    t c5 = i3.a.c(h10, qVar3);
                                    h.f11920i.getClass();
                                    f fVar = g.f11903b;
                                    qVar3.b0();
                                    if (qVar3.S) {
                                        qVar3.k(fVar);
                                    } else {
                                        qVar3.k0();
                                    }
                                    r.J(g.f11907f, d10, qVar3);
                                    r.J(g.f11906e, l4, qVar3);
                                    r.y(qVar3, Integer.valueOf(hashCode), g.f11908g);
                                    r.F(g.f11909h, qVar3);
                                    r.J(g.f11905d, c5, qVar3);
                                    VoicePickerVoiceRowKt.VoicePickerVoiceRow(voice2, state4, lVar5, false, false, qVar3, 24576, 8);
                                    qVar3.p(true);
                                    return;
                                }
                                qVar3.R();
                            }

                            @Override // ho.p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((m) obj, ((Number) obj2).intValue());
                                return z.f31622a;
                            }
                        }, qVar2), qVar, 1572864, 50);
                        qVar.p(false);
                    } else {
                        qVar2.X(-241140142);
                        VoicePickerVoiceRowKt.VoicePickerVoiceRow(voice, state2, lVar, false, false, qVar2, 0, 24);
                        qVar = qVar2;
                        qVar.p(false);
                    }
                    qVar.p(false);
                    return;
                }
                qVar2.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 2039820996));
        return z.f31622a;
    }

    public static final z VoicePickerCreatedScreenUI_Kz89ssw$lambda$2(float f10, VoicesListContract.State state, VoicePickerSharedContract.State state2, ho.l lVar, int i10, m mVar, int i11) {
        m1554VoicePickerCreatedScreenUIKz89ssw(f10, state, state2, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final VoicePickerSharedContract.State VoicePickerCreatedScreen__orJrPs$lambda$0(s2 s2Var) {
        return (VoicePickerSharedContract.State) s2Var.getValue();
    }

    private static final VoicesListContract.State VoicePickerCreatedScreen__orJrPs$lambda$1(s2 s2Var) {
        return (VoicesListContract.State) s2Var.getValue();
    }

    public static final z VoicePickerCreatedScreen__orJrPs$lambda$3(float f10, VoicePickerCreatedViewModel voicePickerCreatedViewModel, int i10, int i11, m mVar, int i12) {
        m1553VoicePickerCreatedScreenorJrPs(f10, voicePickerCreatedViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
