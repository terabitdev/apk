package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents;

import c3.j;
import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import gg.b;
import h4.f;
import h4.g;
import h4.h;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.a1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
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
import q7.c;
import r1.d2;
import r1.p;
import r1.p2;
import rd.c1;
import sn.z;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aI\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001a²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lh5/f;", "bottomPadding", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/recents/VoicePickerRecentsViewModel;", "viewModel", "Lsn/z;", "VoicePickerRecentsScreen--orJrPs", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/recents/VoicePickerRecentsViewModel;Lu2/m;II)V", "VoicePickerRecentsScreen", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function0;", "onRetry", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "VoicePickerRecentsScreenUI-AjpBEmI", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/list/VoicesListContract$State;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "VoicePickerRecentsScreenUI", "Preview_VoiceRecentsScreen_Loading", "(Lu2/m;I)V", "Preview_VoiceRecentsScreen_Loading_NonEmptyItems", "Preview_VoiceRecentsScreen_Error", "Preview_VoiceRecentsScreen_Error_NonEmptyItems", "Preview_VoiceRecentsScreen_Data", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerRecentsScreenKt {
    public static final void Preview_VoiceRecentsScreen_Data(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1435086340);
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
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(4);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(15);
                qVar.h0(L2);
            }
            m1586VoicePickerRecentsScreenUIAjpBEmI(f10, state, aVar, state2, (ho.l) L2, qVar, 24966);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 7);
        }
    }

    public static final z Preview_VoiceRecentsScreen_Data$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceRecentsScreen_Data$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceRecentsScreen_Data(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceRecentsScreen_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-785270930);
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
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.ERROR, null, 2, null);
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(8);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(16);
                qVar.h0(L2);
            }
            m1586VoicePickerRecentsScreenUIAjpBEmI(f10, state, aVar, state2, (ho.l) L2, qVar, 24966);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 8);
        }
    }

    public static final z Preview_VoiceRecentsScreen_Error$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceRecentsScreen_Error$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceRecentsScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceRecentsScreen_Error_NonEmptyItems(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1931451213);
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
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(7);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(14);
                qVar.h0(L2);
            }
            m1586VoicePickerRecentsScreenUIAjpBEmI(f10, state, aVar, state2, (ho.l) L2, qVar, 24966);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 6);
        }
    }

    public static final z Preview_VoiceRecentsScreen_Error_NonEmptyItems$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceRecentsScreen_Error_NonEmptyItems$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceRecentsScreen_Error_NonEmptyItems(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceRecentsScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-839758918);
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
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.SYNCING, null, 2, null);
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(6);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(13);
                qVar.h0(L2);
            }
            m1586VoicePickerRecentsScreenUIAjpBEmI(f10, state, aVar, state2, (ho.l) L2, qVar, 24966);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 5);
        }
    }

    public static final z Preview_VoiceRecentsScreen_Loading$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceRecentsScreen_Loading$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceRecentsScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceRecentsScreen_Loading_NonEmptyItems(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1502561639);
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
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(5);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(12);
                qVar.h0(L2);
            }
            m1586VoicePickerRecentsScreenUIAjpBEmI(f10, state, aVar, state2, (ho.l) L2, qVar, 24966);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 4);
        }
    }

    public static final z Preview_VoiceRecentsScreen_Loading_NonEmptyItems$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceRecentsScreen_Loading_NonEmptyItems$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceRecentsScreen_Loading_NonEmptyItems(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* renamed from: VoicePickerRecentsScreen--orJrPs */
    public static final void m1585VoicePickerRecentsScreenorJrPs(float f10, VoicePickerRecentsViewModel voicePickerRecentsViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        VoicePickerRecentsViewModel voicePickerRecentsViewModel2;
        c cVar;
        VoicePickerRecentsViewModel voicePickerRecentsViewModel3;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-1181696376);
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
            if ((i11 & 2) == 0 && qVar.h(voicePickerRecentsViewModel)) {
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
                    voicePickerRecentsViewModel3 = (VoicePickerRecentsViewModel) b.j0(e0.f20562a.b(VoicePickerRecentsViewModel.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    z0 m10 = c1.m(voicePickerRecentsViewModel3.getSharedStateFlow(), qVar, 0);
                    VoicesListContract.State VoicePickerRecentsScreen__orJrPs$lambda$1 = VoicePickerRecentsScreen__orJrPs$lambda$1(c1.m(voicePickerRecentsViewModel3.getStateFlow(), qVar, 0));
                    h10 = qVar.h(voicePickerRecentsViewModel3);
                    L = qVar.L();
                    e eVar = l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new VoicePickerRecentsScreenKt$VoicePickerRecentsScreen$1$1(voicePickerRecentsViewModel3);
                        qVar.h0(L);
                    }
                    ho.a aVar = (ho.a) ((oo.g) L);
                    VoicePickerSharedContract.State VoicePickerRecentsScreen__orJrPs$lambda$0 = VoicePickerRecentsScreen__orJrPs$lambda$0(m10);
                    h11 = qVar.h(voicePickerRecentsViewModel3);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new VoicePickerRecentsScreenKt$VoicePickerRecentsScreen$2$1(voicePickerRecentsViewModel3);
                        qVar.h0(L2);
                    }
                    m1586VoicePickerRecentsScreenUIAjpBEmI(f10, VoicePickerRecentsScreen__orJrPs$lambda$1, aVar, VoicePickerRecentsScreen__orJrPs$lambda$0, (ho.l) ((oo.g) L2), qVar, i15 & 14);
                    voicePickerRecentsViewModel2 = voicePickerRecentsViewModel3;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            voicePickerRecentsViewModel3 = voicePickerRecentsViewModel;
            qVar.q();
            z0 m102 = c1.m(voicePickerRecentsViewModel3.getSharedStateFlow(), qVar, 0);
            VoicesListContract.State VoicePickerRecentsScreen__orJrPs$lambda$12 = VoicePickerRecentsScreen__orJrPs$lambda$1(c1.m(voicePickerRecentsViewModel3.getStateFlow(), qVar, 0));
            h10 = qVar.h(voicePickerRecentsViewModel3);
            L = qVar.L();
            e eVar2 = l.f33918a;
            if (!h10) {
            }
            L = new VoicePickerRecentsScreenKt$VoicePickerRecentsScreen$1$1(voicePickerRecentsViewModel3);
            qVar.h0(L);
            ho.a aVar2 = (ho.a) ((oo.g) L);
            VoicePickerSharedContract.State VoicePickerRecentsScreen__orJrPs$lambda$02 = VoicePickerRecentsScreen__orJrPs$lambda$0(m102);
            h11 = qVar.h(voicePickerRecentsViewModel3);
            L2 = qVar.L();
            if (!h11) {
            }
            L2 = new VoicePickerRecentsScreenKt$VoicePickerRecentsScreen$2$1(voicePickerRecentsViewModel3);
            qVar.h0(L2);
            m1586VoicePickerRecentsScreenUIAjpBEmI(f10, VoicePickerRecentsScreen__orJrPs$lambda$12, aVar2, VoicePickerRecentsScreen__orJrPs$lambda$02, (ho.l) ((oo.g) L2), qVar, i15 & 14);
            voicePickerRecentsViewModel2 = voicePickerRecentsViewModel3;
        } else {
            qVar.R();
            voicePickerRecentsViewModel2 = voicePickerRecentsViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a1(f10, voicePickerRecentsViewModel2, i10, i11, 5);
        }
    }

    /* renamed from: VoicePickerRecentsScreenUI-AjpBEmI */
    public static final void m1586VoicePickerRecentsScreenUIAjpBEmI(float f10, VoicesListContract.State state, ho.a aVar, VoicePickerSharedContract.State state2, ho.l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        state.getClass();
        aVar.getClass();
        state2.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1233543625);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(state)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(state2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        boolean z10 = true;
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            boolean isEmpty = state.getVoices().isEmpty();
            i3.q qVar2 = i3.q.f13017a;
            if (!isEmpty) {
                qVar.X(-757695116);
                h5.f fVar = new h5.f(f10);
                h5.f fVar2 = new h5.f(ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM());
                if (fVar.compareTo(fVar2) < 0) {
                    fVar = fVar2;
                }
                d2 f11 = r1.d.f(u.P, u.P, u.P, fVar.f12083a, 7);
                t d10 = p2.d(qVar2, 1.0f);
                boolean h10 = qVar.h(state) | qVar.h(state2);
                if ((i11 & 57344) != 16384) {
                    z10 = false;
                }
                boolean z11 = h10 | z10;
                Object L = qVar.L();
                if (z11 || L == l.f33918a) {
                    L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.a(state, state2, lVar, 2);
                    qVar.h0(L);
                }
                c1.c(d10, null, f11, false, null, null, null, false, null, (ho.l) L, qVar, 6, 506);
                qVar = qVar;
                qVar.p(false);
            } else {
                qVar.X(-757149175);
                if (state.getShowError()) {
                    qVar.X(-757106891);
                    ErrorScreenKt.m1836ErrorScreenV9fs2A(p2.d(qVar2, 1.0f), null, null, null, k.d(-1208391752, true, new hm.a(4, aVar), qVar), 0L, qVar, 24582, 46);
                    qVar.p(false);
                } else if (state.getShowLoading()) {
                    qVar.X(-756618238);
                    VoicePickerSectionsListKt.VoicePickerSectionsLoadingList(8, qVar, 6);
                    qVar.p(false);
                } else {
                    qVar.X(-756538165);
                    qVar.p(false);
                }
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.c(f10, state, aVar, state2, lVar, i10);
        }
    }

    public static final z VoicePickerRecentsScreenUI_AjpBEmI$lambda$0$0(VoicesListContract.State state, final VoicePickerSharedContract.State state2, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final List<Voice> voices = state.getVoices();
        ((t1.i) tVar).u(voices.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt$VoicePickerRecentsScreenUI_AjpBEmI$lambda$0$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                voices.get(i10);
                return null;
            }
        }, new j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt$VoicePickerRecentsScreenUI_AjpBEmI$lambda$0$0$$inlined$itemsIndexed$default$3
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
                    Voice voice = (Voice) voices.get(i10);
                    qVar.X(1472357017);
                    VoicePickerVoiceRowKt.VoicePickerVoiceRow(voice, state2, lVar, false, false, qVar, 3072, 16);
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
        return z.f31622a;
    }

    public static final z VoicePickerRecentsScreenUI_AjpBEmI$lambda$1(ho.a aVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonKt.Button(kj.c.R(qVar, R.string.common_retry), aVar, null, ButtonSize.Small, ButtonVariant.Primary, null, null, false, false, false, qVar, 27648, 996);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerRecentsScreenUI_AjpBEmI$lambda$2(float f10, VoicesListContract.State state, ho.a aVar, VoicePickerSharedContract.State state2, ho.l lVar, int i10, m mVar, int i11) {
        m1586VoicePickerRecentsScreenUIAjpBEmI(f10, state, aVar, state2, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final VoicePickerSharedContract.State VoicePickerRecentsScreen__orJrPs$lambda$0(s2 s2Var) {
        return (VoicePickerSharedContract.State) s2Var.getValue();
    }

    private static final VoicesListContract.State VoicePickerRecentsScreen__orJrPs$lambda$1(s2 s2Var) {
        return (VoicesListContract.State) s2Var.getValue();
    }

    public static final z VoicePickerRecentsScreen__orJrPs$lambda$4(float f10, VoicePickerRecentsViewModel voicePickerRecentsViewModel, int i10, int i11, m mVar, int i12) {
        m1585VoicePickerRecentsScreenorJrPs(f10, voicePickerRecentsViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
