package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import i3.t;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCollection;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.a1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import r1.p;
import r1.p2;
import rd.c1;
import sn.z;
import t1.b0;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001am\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u000f\u0010\u001d\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u0019\u001a\u000f\u0010\u001e\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u0019¨\u0006 ²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lh5/f;", "bottomPadding", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreViewModel;", "viewModel", "Lsn/z;", "VoicePickerExploreScreen--orJrPs", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreViewModel;Lu2/m;II)V", "VoicePickerExploreScreen", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;", "uiState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$Event;", "onEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$NavigationEvent;", "onNavigationEvent", "", "showVoiceDesignSection", "VoicePickerExploreScreenUI-AxmokPg", "(FLio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lho/l;ZLu2/m;II)V", "VoicePickerExploreScreenUI", "Preview_VoiceExploreScreen_Loading", "(Lu2/m;I)V", "Preview_VoiceExploreScreen_Error", "Preview_VoiceExploreScreen_Data_List", "Preview_VoiceExploreScreen_Data_Grid", "Preview_VoiceExploreScreen_Data_Featured", "Preview_VoiceExploreScreen_Data_Collections", "hasReachedEnd", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreScreenKt {
    public static final void Preview_VoiceExploreScreen_Data_Collections(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1140214251);
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
            VoicePickerExploreContract.UiState.Data data = new VoicePickerExploreContract.UiState.Data(ig.f.H(new ExploreVoiceSections.Section.VoiceCollections("Handpicked collections", ig.f.I(new VoiceCollection("1", "Sci-Fi Essentials", "", "#9333ea"), new VoiceCollection("2", "Matilda Essentials", "", "#9333ea"), new VoiceCollection("3", "1337 Essentials", "", "#9333ea")))), true);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(9);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, null, null, false, null, false, null, null, null, null, false, 8190, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(10);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new f(12);
                qVar.h0(L3);
            }
            m1565VoicePickerExploreScreenUIAxmokPg(f10, data, lVar, state, lVar2, (ho.l) L3, false, qVar, 221574, 64);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(i10, 2);
        }
    }

    public static final z Preview_VoiceExploreScreen_Data_Collections$lambda$0$0$0(VoicePickerExploreContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Collections$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Collections$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Collections$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceExploreScreen_Data_Collections(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceExploreScreen_Data_Featured(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1613870750);
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
            VoicePickerExploreContract.UiState.Data data = new VoicePickerExploreContract.UiState.Data(ig.f.H(new ExploreVoiceSections.Section.FeaturedVoices("Trending voices", stubVoicesList, stubVoicesList)), true);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(13);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(14);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new f(15);
                qVar.h0(L3);
            }
            m1565VoicePickerExploreScreenUIAxmokPg(f10, data, lVar, state, lVar2, (ho.l) L3, false, qVar, 221574, 64);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(i10, 3);
        }
    }

    public static final z Preview_VoiceExploreScreen_Data_Featured$lambda$0$0$0(VoicePickerExploreContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Featured$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Featured$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Featured$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceExploreScreen_Data_Featured(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceExploreScreen_Data_Grid(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1125592246);
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
            VoicePickerExploreContract.UiState.Data data = new VoicePickerExploreContract.UiState.Data(ig.f.H(new ExploreVoiceSections.Section.VoiceGrid("Trending voices", stubVoicesList)), true);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(18);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(19);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new f(20);
                qVar.h0(L3);
            }
            m1565VoicePickerExploreScreenUIAxmokPg(f10, data, lVar, state, lVar2, (ho.l) L3, false, qVar, 221574, 64);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(i10, 5);
        }
    }

    public static final z Preview_VoiceExploreScreen_Data_Grid$lambda$0$0$0(VoicePickerExploreContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Grid$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Grid$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_Grid$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceExploreScreen_Data_Grid(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceExploreScreen_Data_List(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1807502066);
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
            VoicePickerExploreContract.UiState.Data data = new VoicePickerExploreContract.UiState.Data(ig.f.H(new ExploreVoiceSections.Section.VoiceList("Trending voices", stubVoicesList)), true);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(3);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), ((Voice) tn.o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(4);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new f(5);
                qVar.h0(L3);
            }
            m1565VoicePickerExploreScreenUIAxmokPg(f10, data, lVar, state, lVar2, (ho.l) L3, false, qVar, 221574, 64);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(i10, 0);
        }
    }

    public static final z Preview_VoiceExploreScreen_Data_List$lambda$0$0$0(VoicePickerExploreContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_List$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_List$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Data_List$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceExploreScreen_Data_List(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceExploreScreen_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(977734653);
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
            VoicePickerExploreContract.UiState.Error error = new VoicePickerExploreContract.UiState.Error("Did you know octopuses have three hearts?");
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(11);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(16);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new f(17);
                qVar.h0(L3);
            }
            m1565VoicePickerExploreScreenUIAxmokPg(f10, error, lVar, state, lVar2, (ho.l) L3, false, qVar, 221574, 64);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(i10, 4);
        }
    }

    public static final z Preview_VoiceExploreScreen_Error$lambda$0$0$0(VoicePickerExploreContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Error$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Error$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Error$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceExploreScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceExploreScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-399281399);
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
            VoicePickerExploreContract.UiState.Loading loading = VoicePickerExploreContract.UiState.Loading.INSTANCE;
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new f(6);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new f(7);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new f(8);
                qVar.h0(L3);
            }
            m1565VoicePickerExploreScreenUIAxmokPg(f10, loading, lVar, state, lVar2, (ho.l) L3, false, qVar, 221622, 64);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(i10, 1);
        }
    }

    public static final z Preview_VoiceExploreScreen_Loading$lambda$0$0$0(VoicePickerExploreContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Loading$lambda$0$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Loading$lambda$0$2$0(VoicePickerSharedContract.NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceExploreScreen_Loading$lambda$1(int i10, m mVar, int i11) {
        Preview_VoiceExploreScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* renamed from: VoicePickerExploreScreen--orJrPs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1564VoicePickerExploreScreenorJrPs(float f10, VoicePickerExploreViewModel voicePickerExploreViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        VoicePickerExploreViewModel voicePickerExploreViewModel2;
        q7.c cVar;
        VoicePickerExploreViewModel voicePickerExploreViewModel3;
        VoicePickerSharedContract.ReadMetaState readMeta;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        boolean h12;
        Object L3;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-518963300);
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
            if ((i11 & 2) == 0 && qVar.h(voicePickerExploreViewModel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i15 = i12;
        boolean z10 = false;
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
                    voicePickerExploreViewModel3 = (VoicePickerExploreViewModel) gg.b.j0(e0.f20562a.b(VoicePickerExploreViewModel.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    z0 m10 = c1.m(voicePickerExploreViewModel3.getUiStateFlow(), qVar, 0);
                    z0 m11 = c1.m(voicePickerExploreViewModel3.getSharedStateFlow(), qVar, 0);
                    readMeta = VoicePickerExploreScreen__orJrPs$lambda$1(m11).getReadMeta();
                    if (!(readMeta instanceof VoicePickerSharedContract.ReadMetaState.Absent)) {
                        z10 = true;
                    } else if (!(readMeta instanceof VoicePickerSharedContract.ReadMetaState.Initial)) {
                        if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Present) {
                            z10 = VoicePickerExploreScreen__orJrPs$lambda$1(m11).canChangeVoices();
                        } else {
                            c6.p();
                            return;
                        }
                    }
                    VoicePickerExploreContract.UiState VoicePickerExploreScreen__orJrPs$lambda$0 = VoicePickerExploreScreen__orJrPs$lambda$0(m10);
                    h10 = qVar.h(voicePickerExploreViewModel3);
                    L = qVar.L();
                    u2.e eVar = l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new VoicePickerExploreScreenKt$VoicePickerExploreScreen$1$1(voicePickerExploreViewModel3);
                        qVar.h0(L);
                    }
                    ho.l lVar = (ho.l) ((oo.g) L);
                    VoicePickerSharedContract.State VoicePickerExploreScreen__orJrPs$lambda$1 = VoicePickerExploreScreen__orJrPs$lambda$1(m11);
                    h11 = qVar.h(voicePickerExploreViewModel3);
                    L2 = qVar.L();
                    if (!h11 || L2 == eVar) {
                        L2 = new VoicePickerExploreScreenKt$VoicePickerExploreScreen$2$1(voicePickerExploreViewModel3);
                        qVar.h0(L2);
                    }
                    ho.l lVar2 = (ho.l) ((oo.g) L2);
                    h12 = qVar.h(voicePickerExploreViewModel3);
                    L3 = qVar.L();
                    if (!h12 || L3 == eVar) {
                        L3 = new VoicePickerExploreScreenKt$VoicePickerExploreScreen$3$1(voicePickerExploreViewModel3);
                        qVar.h0(L3);
                    }
                    m1565VoicePickerExploreScreenUIAxmokPg(f10, VoicePickerExploreScreen__orJrPs$lambda$0, lVar, VoicePickerExploreScreen__orJrPs$lambda$1, lVar2, (ho.l) L3, z10, qVar, i15 & 14, 0);
                    qVar = qVar;
                    voicePickerExploreViewModel2 = voicePickerExploreViewModel3;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            voicePickerExploreViewModel3 = voicePickerExploreViewModel;
            qVar.q();
            z0 m102 = c1.m(voicePickerExploreViewModel3.getUiStateFlow(), qVar, 0);
            z0 m112 = c1.m(voicePickerExploreViewModel3.getSharedStateFlow(), qVar, 0);
            readMeta = VoicePickerExploreScreen__orJrPs$lambda$1(m112).getReadMeta();
            if (!(readMeta instanceof VoicePickerSharedContract.ReadMetaState.Absent)) {
            }
            VoicePickerExploreContract.UiState VoicePickerExploreScreen__orJrPs$lambda$02 = VoicePickerExploreScreen__orJrPs$lambda$0(m102);
            h10 = qVar.h(voicePickerExploreViewModel3);
            L = qVar.L();
            u2.e eVar2 = l.f33918a;
            if (!h10) {
            }
            L = new VoicePickerExploreScreenKt$VoicePickerExploreScreen$1$1(voicePickerExploreViewModel3);
            qVar.h0(L);
            ho.l lVar3 = (ho.l) ((oo.g) L);
            VoicePickerSharedContract.State VoicePickerExploreScreen__orJrPs$lambda$12 = VoicePickerExploreScreen__orJrPs$lambda$1(m112);
            h11 = qVar.h(voicePickerExploreViewModel3);
            L2 = qVar.L();
            if (!h11) {
            }
            L2 = new VoicePickerExploreScreenKt$VoicePickerExploreScreen$2$1(voicePickerExploreViewModel3);
            qVar.h0(L2);
            ho.l lVar22 = (ho.l) ((oo.g) L2);
            h12 = qVar.h(voicePickerExploreViewModel3);
            L3 = qVar.L();
            if (!h12) {
            }
            L3 = new VoicePickerExploreScreenKt$VoicePickerExploreScreen$3$1(voicePickerExploreViewModel3);
            qVar.h0(L3);
            m1565VoicePickerExploreScreenUIAxmokPg(f10, VoicePickerExploreScreen__orJrPs$lambda$02, lVar3, VoicePickerExploreScreen__orJrPs$lambda$12, lVar22, (ho.l) L3, z10, qVar, i15 & 14, 0);
            qVar = qVar;
            voicePickerExploreViewModel2 = voicePickerExploreViewModel3;
        } else {
            qVar.R();
            voicePickerExploreViewModel2 = voicePickerExploreViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a1(f10, voicePickerExploreViewModel2, i10, i11, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be  */
    /* renamed from: VoicePickerExploreScreenUI-AxmokPg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1565VoicePickerExploreScreenUIAxmokPg(final float f10, final VoicePickerExploreContract.UiState uiState, final ho.l lVar, final VoicePickerSharedContract.State state, final ho.l lVar2, final ho.l lVar3, boolean z6, m mVar, final int i10, final int i11) {
        int i12;
        final boolean z10;
        int i13;
        boolean z11;
        q qVar;
        r1 r10;
        boolean z12;
        List list;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean h10;
        int i18;
        int i19;
        uiState.getClass();
        lVar.getClass();
        state.getClass();
        lVar2.getClass();
        lVar3.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(416108988);
        if ((i10 & 6) == 0) {
            if (qVar2.c(f10)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar2.f(uiState);
            } else {
                h10 = qVar2.h(uiState);
            }
            if (h10) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(state)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar2)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(lVar3)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        int i20 = i11 & 64;
        if (i20 != 0) {
            i12 |= 1572864;
        } else if ((1572864 & i10) == 0) {
            z10 = z6;
            if (qVar2.g(z10)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
            if ((599187 & i12) == 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar2.O(i12 & 1, z11)) {
                if (i20 != 0) {
                    z10 = false;
                }
                t1.z a10 = b0.a(0, qVar2, 3);
                Object L = qVar2.L();
                u2.e eVar = l.f33918a;
                if (L == eVar) {
                    L = r.s(new a(a10, 1));
                    qVar2.h0(L);
                }
                s2 s2Var = (s2) L;
                Boolean valueOf = Boolean.valueOf(VoicePickerExploreScreenUI_AxmokPg$lambda$1(s2Var));
                if ((i12 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object L2 = qVar2.L();
                if (z12 || L2 == eVar) {
                    L2 = new VoicePickerExploreScreenKt$VoicePickerExploreScreenUI$1$1(lVar, s2Var, null);
                    qVar2.h0(L2);
                }
                r.f((ho.p) L2, valueOf, qVar2);
                if (uiState instanceof VoicePickerExploreContract.UiState.Data) {
                    qVar2.X(1027836548);
                    if (z10) {
                        list = ((VoicePickerExploreContract.UiState.Data) uiState).getSections();
                    } else {
                        List<ExploreVoiceSections.Section> sections = ((VoicePickerExploreContract.UiState.Data) uiState).getSections();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : sections) {
                            if (!(((ExploreVoiceSections.Section) obj) instanceof ExploreVoiceSections.Section.VoiceDesign)) {
                                arrayList.add(obj);
                            }
                        }
                        list = arrayList;
                    }
                    int i21 = i12 & 14;
                    int i22 = i12 << 3;
                    VoicePickerSectionsListKt.m1618VoicePickerSectionsListQ1bl1hc(f10, a10, ((VoicePickerExploreContract.UiState.Data) uiState).isLoadingMore(), list, state, lVar2, lVar3, qVar2, i21 | (57344 & i22) | (458752 & i22) | (i22 & 3670016));
                    qVar = qVar2;
                    qVar.p(false);
                } else {
                    qVar = qVar2;
                    if (uiState instanceof VoicePickerExploreContract.UiState.Error) {
                        qVar.X(1028467491);
                        ErrorScreenKt.m1836ErrorScreenV9fs2A(p2.d(i3.q.f13017a, 1.0f), null, ((VoicePickerExploreContract.UiState.Error) uiState).getError(), null, k.d(-645579518, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.c
                            @Override // ho.p
                            public final Object invoke(Object obj2, Object obj3) {
                                z VoicePickerExploreScreenUI_AxmokPg$lambda$4;
                                int intValue = ((Integer) obj3).intValue();
                                VoicePickerExploreScreenUI_AxmokPg$lambda$4 = VoicePickerExploreScreenKt.VoicePickerExploreScreenUI_AxmokPg$lambda$4(ho.l.this, (m) obj2, intValue);
                                return VoicePickerExploreScreenUI_AxmokPg$lambda$4;
                            }
                        }, qVar), 0L, qVar, 24582, 42);
                        qVar.p(false);
                    } else if (uiState instanceof VoicePickerExploreContract.UiState.Loading) {
                        qVar.X(1028965413);
                        VoicePickerSectionsListKt.VoicePickerSectionsLoadingList(8, qVar, 6);
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(448797266, qVar, false);
                    }
                }
            } else {
                qVar = qVar2;
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.d
                    @Override // ho.p
                    public final Object invoke(Object obj2, Object obj3) {
                        z VoicePickerExploreScreenUI_AxmokPg$lambda$5;
                        int intValue = ((Integer) obj3).intValue();
                        VoicePickerExploreScreenUI_AxmokPg$lambda$5 = VoicePickerExploreScreenKt.VoicePickerExploreScreenUI_AxmokPg$lambda$5(f10, uiState, lVar, state, lVar2, lVar3, z10, i10, i11, (m) obj2, intValue);
                        return VoicePickerExploreScreenUI_AxmokPg$lambda$5;
                    }
                };
                return;
            }
            return;
        }
        z10 = z6;
        if ((599187 & i12) == 599186) {
        }
        if (!qVar2.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final boolean VoicePickerExploreScreenUI_AxmokPg$lambda$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final z VoicePickerExploreScreenUI_AxmokPg$lambda$4(ho.l lVar, m mVar, int i10) {
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
                L = new a(lVar, 0);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, null, buttonSize, buttonVariant, null, null, false, false, false, qVar, 27648, 996);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerExploreScreenUI_AxmokPg$lambda$4$0$0(ho.l lVar) {
        lVar.invoke(VoicePickerExploreContract.Event.ErrorRetry.INSTANCE);
        return z.f31622a;
    }

    public static final z VoicePickerExploreScreenUI_AxmokPg$lambda$5(float f10, VoicePickerExploreContract.UiState uiState, ho.l lVar, VoicePickerSharedContract.State state, ho.l lVar2, ho.l lVar3, boolean z6, int i10, int i11, m mVar, int i12) {
        m1565VoicePickerExploreScreenUIAxmokPg(f10, uiState, lVar, state, lVar2, lVar3, z6, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final VoicePickerExploreContract.UiState VoicePickerExploreScreen__orJrPs$lambda$0(s2 s2Var) {
        return (VoicePickerExploreContract.UiState) s2Var.getValue();
    }

    private static final VoicePickerSharedContract.State VoicePickerExploreScreen__orJrPs$lambda$1(s2 s2Var) {
        return (VoicePickerSharedContract.State) s2Var.getValue();
    }

    public static final z VoicePickerExploreScreen__orJrPs$lambda$5(float f10, VoicePickerExploreViewModel voicePickerExploreViewModel, int i10, int i11, m mVar, int i12) {
        m1564VoicePickerExploreScreenorJrPs(f10, voicePickerExploreViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
