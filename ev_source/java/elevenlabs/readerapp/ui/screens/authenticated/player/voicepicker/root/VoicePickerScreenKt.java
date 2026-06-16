package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import a2.k3;
import androidx.room.m0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.p;
import i1.j2;
import i3.t;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.b0;
import io.elevenlabs.readerapp.ui.components.w;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedDeleteConfirmationDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedFavoriteRemoveConfirmationDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.FiltersState;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.SelectFiltersEvent;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceFiltersDialogKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.b3;
import r1.c3;
import r1.i0;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.x;
import r1.y;
import r1.z1;
import rd.c1;
import sn.z;
import t2.u;
import tn.o;
import u2.f1;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\u001a¯\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0089\u0002\u0010'\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0003\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0003\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0003\u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0003\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0003\u0010%\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0003\u0010&\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b'\u0010(\u001a3\u0010)\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010+\u001a\u00020\u0003H\u0001¢\u0006\u0004\b+\u0010,¨\u0006/²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\u000e\u0010.\u001a\u00020-8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "mode", "Lkotlin/Function0;", "Lsn/z;", "navigateBack", "Lkotlin/Function1;", "", "navigateToVoiceCollection", "navigateToVoiceDesign", "Lkotlin/Function2;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "navigateToPlayer", "bottomBar", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "animatedContentScope", "createdVoiceId", "onCreatedVoiceHandled", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerViewModel;", "viewModel", "VoicePickerScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;Lho/a;Lho/l;Lho/a;Lho/p;Lho/p;Li1/j2;Li1/o;Ljava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerViewModel;Lu2/m;III)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "onEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "miniPlayer", "Lh5/f;", "searchListSlot", "filteredListSlot", "recentsSlot", "favoritesSlot", "createdSlot", "exploreSlot", "VoicePickerUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lho/p;Li1/j2;Li1/o;Lho/p;Lho/q;Lho/q;Lho/q;Lho/q;Lho/q;Lho/q;Lu2/m;III)V", "SelectedVoiceControls", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "Preview_VoicePicker", "(Lu2/m;I)V", "", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoicePickerTab.values().length];
            try {
                iArr[VoicePickerTab.Recents.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoicePickerTab.Favorites.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoicePickerTab.Created.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoicePickerTab.Explore.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void Preview_VoicePicker(u2.m mVar, int i10) {
        boolean z6;
        q qVar;
        q qVar2 = (q) mVar;
        qVar2.Z(-1589691095);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i10 & 1, z6)) {
            List<Voice> stubVoicesList = VoicesFactoryKt.stubVoicesList();
            VoicePickerMode.VoicePicker voicePicker = new VoicePickerMode.VoicePicker("");
            VoicePickerContract.State state = new VoicePickerContract.State(new VoicePickerContract.TabsState.Visible(VoicePickerTab.Recents, VoicePickerTab.getEntries()), null, false, 2, null);
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(20);
                qVar2.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = new n(21);
                qVar2.h0(L2);
            }
            ComposableSingletons$VoicePickerScreenKt composableSingletons$VoicePickerScreenKt = ComposableSingletons$VoicePickerScreenKt.INSTANCE;
            qVar = qVar2;
            VoicePickerUI(voicePicker, state, lVar, state2, (ho.l) L2, null, null, null, composableSingletons$VoicePickerScreenKt.m1600getLambda$1111912952$app_productionRelease(), composableSingletons$VoicePickerScreenKt.m1605getLambda$593881699$app_productionRelease(), composableSingletons$VoicePickerScreenKt.m1604getLambda$538023613$app_productionRelease(), c3.k.d(-1240619452, true, new w(stubVoicesList, 1), qVar2), composableSingletons$VoicePickerScreenKt.m1602getLambda$1943215291$app_productionRelease(), composableSingletons$VoicePickerScreenKt.getLambda$1649156166$app_productionRelease(), composableSingletons$VoicePickerScreenKt.getLambda$946560327$app_productionRelease(), qVar, 906191232, 28086, 192);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 18);
        }
    }

    public static final z Preview_VoicePicker$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePicker$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePicker$lambda$2(List list, h5.f fVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 0;
            VoicesListContract.State state = new VoicesListContract.State(SyncStatus.READY, list);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new f(1);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) o.w0(list)).getVoiceId(), ((Voice) o.w0(list)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(22);
                qVar.h0(L2);
            }
            VoicePickerRecentsScreenKt.m1586VoicePickerRecentsScreenUIAjpBEmI(f10, state, aVar, state2, (ho.l) L2, qVar, 24966);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z Preview_VoicePicker$lambda$2$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePicker$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_VoicePicker(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SelectedVoiceControls(VoicePickerContract.State state, VoicePickerSharedContract.State state2, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        VoicePickerSharedContract.State state3;
        boolean z6;
        q qVar;
        float f10;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean h10;
        int i14;
        q qVar2 = (q) mVar;
        qVar2.Z(419939414);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar2.f(state);
            } else {
                h10 = qVar2.h(state);
            }
            if (h10) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            state3 = state2;
            if (qVar2.h(state3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        } else {
            state3 = state2;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            if (state3.canChangeVoices()) {
                qVar2.X(-824477110);
                i3.q qVar3 = i3.q.f13017a;
                t e10 = p2.e(qVar3, 1.0f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i15 = ElevenLabsTheme.$stable;
                t x10 = ib.i.x(elevenLabsTheme, qVar2, i15, e10);
                k2 a10 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar2, 0);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                t c5 = i3.a.c(x10, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(h4.g.f11907f, a10, qVar2);
                r.J(h4.g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar2);
                r.J(h4.g.f11905d, c5, qVar2);
                String R = kj.c.R(qVar2, R.string.player_voice_picker_reset);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonVariant buttonVariant = ButtonVariant.Secondary;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f10 = Float.MAX_VALUE;
                } else {
                    f10 = 1.0f;
                }
                m1 m1Var = new m1(f10, true);
                int i16 = i11 & 896;
                if (i16 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (z10 || L == eVar) {
                    L = new id.z(lVar, 29);
                    qVar2.h0(L);
                }
                ButtonKt.Button(R, (ho.a) L, m1Var, buttonSize, buttonVariant, null, null, false, false, false, qVar2, 27648, 992);
                r1.d.g(p2.s(qVar3, elevenLabsTheme.getSpacings(qVar2, i15).m2356getX4D9Ej5fM()), qVar2);
                String R2 = kj.c.R(qVar2, R.string.player_voice_picker_save);
                float f11 = 1.0f;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f11 = Float.MAX_VALUE;
                }
                m1 m1Var2 = new m1(f11, true);
                boolean isSaveLoading = state.isSaveLoading();
                boolean z12 = !state.isSaveLoading();
                if (i16 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L2 = qVar2.L();
                if (z11 || L2 == eVar) {
                    L2 = new k(lVar, 0);
                    qVar2.h0(L2);
                }
                ButtonKt.Button(R2, (ho.a) L2, m1Var2, buttonSize, null, null, null, isSaveLoading, z12, false, qVar2, 3072, 624);
                qVar = qVar2;
                qVar.p(true);
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(-823644884);
                qVar.p(false);
            }
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 20, state, state2, lVar);
        }
    }

    public static final z SelectedVoiceControls$lambda$0$0$0(ho.l lVar) {
        lVar.invoke(VoicePickerContract.Event.Reset.INSTANCE);
        return z.f31622a;
    }

    public static final z SelectedVoiceControls$lambda$0$1$0(ho.l lVar) {
        lVar.invoke(VoicePickerContract.Event.Save.INSTANCE);
        return z.f31622a;
    }

    public static final z SelectedVoiceControls$lambda$1(VoicePickerContract.State state, VoicePickerSharedContract.State state2, ho.l lVar, int i10, u2.m mVar, int i11) {
        SelectedVoiceControls(state, state2, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void VoicePickerScreen(final VoicePickerMode voicePickerMode, final ho.a aVar, final ho.l lVar, final ho.a aVar2, final p pVar, final p pVar2, j2 j2Var, i1.o oVar, String str, ho.a aVar3, VoicePickerViewModel voicePickerViewModel, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        ho.a aVar4;
        j2 j2Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z6;
        final String str2;
        final ho.a aVar5;
        final VoicePickerViewModel voicePickerViewModel2;
        q qVar;
        final i1.o oVar2;
        i1.o oVar3;
        String str3;
        ho.a aVar6;
        i1.o oVar4;
        String str4;
        VoicePickerViewModel voicePickerViewModel3;
        ho.a aVar7;
        boolean z10;
        q7.e f02;
        boolean z11;
        j2 j2Var3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        VoicePickerViewModel voicePickerViewModel4;
        VoicePickerViewModel voicePickerViewModel5;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean h10;
        int i25;
        voicePickerMode.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        pVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-860152652);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = qVar2.f(voicePickerMode);
            } else {
                h10 = qVar2.h(voicePickerMode);
            }
            if (h10) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i13 = i25 | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i13 |= i24;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i23 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i23 = 128;
            }
            i13 |= i23;
        }
        if ((i10 & 3072) == 0) {
            aVar4 = aVar2;
            if (qVar2.h(aVar4)) {
                i22 = 2048;
            } else {
                i22 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i22;
        } else {
            aVar4 = aVar2;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(pVar)) {
                i21 = 16384;
            } else {
                i21 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i21;
        }
        if ((196608 & i10) == 0) {
            if (qVar2.h(pVar2)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i13 |= i20;
        }
        int i26 = i12 & 64;
        if (i26 != 0) {
            i13 |= 1572864;
            j2Var2 = j2Var;
        } else {
            j2Var2 = j2Var;
            if ((i10 & 1572864) == 0) {
                if (qVar2.f(j2Var2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i13 |= i14;
            }
        }
        int i27 = i12 & 128;
        if (i27 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (qVar2.h(oVar)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i13 |= i15;
        }
        int i28 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i28 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (qVar2.f(str)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i13 |= i16;
        }
        int i29 = i12 & 512;
        if (i29 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (qVar2.h(aVar3)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i13 |= i17;
        }
        if ((i11 & 6) == 0) {
            if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 && qVar2.h(voicePickerViewModel)) {
                i19 = 4;
                i18 = i11 | i19;
            }
            i19 = 2;
            i18 = i11 | i19;
        } else {
            i18 = i11;
        }
        if ((i13 & 306783379) == 306783378 && (i18 & 3) == 2) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (qVar2.O(i13 & 1, z6)) {
            qVar2.T();
            int i30 = i10 & 1;
            u2.e eVar = u2.l.f33918a;
            if (i30 != 0 && !qVar2.y()) {
                qVar2.R();
                oVar4 = oVar;
                str4 = str;
                aVar7 = aVar3;
                voicePickerViewModel3 = voicePickerViewModel;
            } else {
                if (i26 != 0) {
                    j2Var2 = null;
                }
                if (i27 != 0) {
                    oVar3 = null;
                } else {
                    oVar3 = oVar;
                }
                if (i28 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i29 != 0) {
                    Object L = qVar2.L();
                    if (L == eVar) {
                        L = new f(0);
                        qVar2.h0(L);
                    }
                    aVar6 = (ho.a) L;
                } else {
                    aVar6 = aVar3;
                }
                if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    if ((i13 & 14) != 4 && ((i13 & 8) == 0 || !qVar2.h(voicePickerMode))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    Object L2 = qVar2.L();
                    if (z10 || L2 == eVar) {
                        L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.a(voicePickerMode, 2);
                        qVar2.h0(L2);
                    }
                    ho.l lVar2 = (ho.l) L2;
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar2);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar2);
                        if (a10 instanceof androidx.lifecycle.o) {
                            f02 = m0.f0(((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras(), lVar2);
                        } else {
                            f02 = m0.f0(q7.a.f28123b, lVar2);
                        }
                        VoicePickerViewModel voicePickerViewModel6 = (VoicePickerViewModel) gg.b.j0(e0.f20562a.b(VoicePickerViewModel.class), a10, null, o6, f02, qVar2);
                        String str5 = str3;
                        oVar4 = oVar3;
                        str4 = str5;
                        voicePickerViewModel3 = voicePickerViewModel6;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                } else {
                    String str6 = str3;
                    oVar4 = oVar3;
                    str4 = str6;
                    voicePickerViewModel3 = voicePickerViewModel;
                }
                aVar7 = aVar6;
            }
            j2 j2Var4 = j2Var2;
            qVar2.q();
            z0 m10 = c1.m(voicePickerViewModel3.getSharedStateFlow(), qVar2, 0);
            z0 m11 = c1.m(voicePickerViewModel3.getStateFlow(), qVar2, 0);
            boolean h11 = qVar2.h(voicePickerViewModel3);
            int i31 = i13 & 14;
            if (i31 != 4 && ((i13 & 8) == 0 || !qVar2.h(voicePickerMode))) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z17 = h11 | z11;
            Object L3 = qVar2.L();
            if (!z17 && L3 != eVar) {
                j2Var3 = j2Var4;
            } else {
                j2Var3 = j2Var4;
                L3 = new VoicePickerScreenKt$VoicePickerScreen$3$1(voicePickerViewModel3, voicePickerMode, null);
                qVar2.h0(L3);
            }
            r.f((p) L3, voicePickerMode, qVar2);
            if ((234881024 & i13) == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean h12 = z12 | qVar2.h(voicePickerViewModel3);
            if ((1879048192 & i13) == 536870912) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z18 = z13 | h12;
            Object L4 = qVar2.L();
            if (z18 || L4 == eVar) {
                L4 = new VoicePickerScreenKt$VoicePickerScreen$4$1(str4, voicePickerViewModel3, aVar7, null);
                qVar2.h0(L4);
            }
            r.f((p) L4, str4, qVar2);
            boolean h13 = qVar2.h(voicePickerViewModel3);
            if ((i13 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z19 = h13 | z14;
            if ((i13 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z20 = z19 | z15;
            if ((i13 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z21 = z20 | z16;
            Object L5 = qVar2.L();
            if (!z21 && L5 != eVar) {
                voicePickerViewModel4 = voicePickerViewModel3;
            } else {
                VoicePickerViewModel voicePickerViewModel7 = voicePickerViewModel3;
                L5 = new VoicePickerScreenKt$VoicePickerScreen$5$1(voicePickerViewModel7, aVar, lVar, aVar4, null);
                voicePickerViewModel4 = voicePickerViewModel7;
                qVar2.h0(L5);
            }
            r.f((p) L5, z.f31622a, qVar2);
            VoicePickerContract.State VoicePickerScreen$lambda$3 = VoicePickerScreen$lambda$3(m11);
            boolean h14 = qVar2.h(voicePickerViewModel4);
            Object L6 = qVar2.L();
            if (h14 || L6 == eVar) {
                L6 = new VoicePickerScreenKt$VoicePickerScreen$6$1(voicePickerViewModel4);
                qVar2.h0(L6);
            }
            ho.l lVar3 = (ho.l) ((oo.g) L6);
            VoicePickerSharedContract.State VoicePickerScreen$lambda$2 = VoicePickerScreen$lambda$2(m10);
            boolean h15 = qVar2.h(voicePickerViewModel4);
            Object L7 = qVar2.L();
            if (h15 || L7 == eVar) {
                L7 = new VoicePickerScreenKt$VoicePickerScreen$7$1(voicePickerViewModel4);
                qVar2.h0(L7);
            }
            VoicePickerViewModel voicePickerViewModel8 = voicePickerViewModel4;
            int i32 = i31 | 100663296 | (458752 & i13) | (3670016 & i13) | (i13 & 29360128);
            ho.a aVar8 = aVar7;
            String str7 = str4;
            j2 j2Var5 = j2Var3;
            VoicePickerUI(voicePickerMode, VoicePickerScreen$lambda$3, lVar3, VoicePickerScreen$lambda$2, (ho.l) ((oo.g) L7), pVar2, j2Var5, oVar4, c3.k.d(-1792142125, true, new f2.i(pVar2, pVar, 9), qVar2), null, null, null, null, null, null, qVar2, i32, 0, 32256);
            j2Var2 = j2Var5;
            i1.o oVar5 = oVar4;
            if (VoicePickerScreen$lambda$2(m10).getFiltersDialogShown()) {
                qVar2.X(-1030424783);
                voicePickerViewModel5 = voicePickerViewModel8;
                boolean h16 = qVar2.h(voicePickerViewModel5);
                Object L8 = qVar2.L();
                if (h16 || L8 == eVar) {
                    L8 = new g(voicePickerViewModel5, 0);
                    qVar2.h0(L8);
                }
                BottomSheetScaffoldKt.m1898BottomSheetScaffoldjb40ds(false, false, 0L, u.P, (ho.a) L8, kj.c.R(qVar2, R.string.voices_filters), (ho.r) c3.k.d(1823576391, true, new io.elevenlabs.readerapp.e(voicePickerViewModel5, m10, 4), qVar2), (u2.m) qVar2, 1572864, 15);
                qVar2.p(false);
            } else {
                voicePickerViewModel5 = voicePickerViewModel8;
                qVar2.X(-1029904882);
                qVar2.p(false);
            }
            qVar = qVar2;
            oVar2 = oVar5;
            voicePickerViewModel2 = voicePickerViewModel5;
            aVar5 = aVar8;
            str2 = str7;
        } else {
            qVar2.R();
            str2 = str;
            aVar5 = aVar3;
            voicePickerViewModel2 = voicePickerViewModel;
            qVar = qVar2;
            oVar2 = oVar;
        }
        final j2 j2Var6 = j2Var2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.h
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z VoicePickerScreen$lambda$12;
                    int intValue = ((Integer) obj2).intValue();
                    VoicePickerScreen$lambda$12 = VoicePickerScreenKt.VoicePickerScreen$lambda$12(VoicePickerMode.this, aVar, lVar, aVar2, pVar, pVar2, j2Var6, oVar2, str2, aVar5, voicePickerViewModel2, i10, i11, i12, (u2.m) obj, intValue);
                    return VoicePickerScreen$lambda$12;
                }
            };
        }
    }

    public static final VoicePickerViewModel VoicePickerScreen$lambda$1$0(VoicePickerMode voicePickerMode, VoicePickerViewModel.Factory factory) {
        factory.getClass();
        return factory.create(voicePickerMode);
    }

    public static final z VoicePickerScreen$lambda$10$0(VoicePickerViewModel voicePickerViewModel) {
        voicePickerViewModel.onSharedEvent(new VoicePickerSharedContract.Event.UpdateFiltersDialogShown(false));
        return z.f31622a;
    }

    public static final z VoicePickerScreen$lambda$11(VoicePickerViewModel voicePickerViewModel, s2 s2Var, y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        FiltersState filters = VoicePickerScreen$lambda$2(s2Var).getFilters();
        q qVar = (q) mVar;
        boolean h10 = qVar.h(voicePickerViewModel);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.a(voicePickerViewModel, 3);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(bottomSheetControl);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new VoicePickerScreenKt$VoicePickerScreen$10$2$1(bottomSheetControl);
            qVar.h0(L2);
        }
        VoiceFiltersDialogKt.VoiceFiltersDialog(filters, lVar, (ho.a) ((oo.g) L2), qVar, 0);
        return z.f31622a;
    }

    public static final z VoicePickerScreen$lambda$11$0$0(VoicePickerViewModel voicePickerViewModel, SelectFiltersEvent selectFiltersEvent) {
        selectFiltersEvent.getClass();
        voicePickerViewModel.onSharedEvent(new VoicePickerSharedContract.Event.UpdateFilters(selectFiltersEvent));
        return z.f31622a;
    }

    public static final z VoicePickerScreen$lambda$12(VoicePickerMode voicePickerMode, ho.a aVar, ho.l lVar, ho.a aVar2, p pVar, p pVar2, j2 j2Var, i1.o oVar, String str, ho.a aVar3, VoicePickerViewModel voicePickerViewModel, int i10, int i11, int i12, u2.m mVar, int i13) {
        VoicePickerScreen(voicePickerMode, aVar, lVar, aVar2, pVar, pVar2, j2Var, oVar, str, aVar3, voicePickerViewModel, mVar, r.M(i10 | 1), r.M(i11), i12);
        return z.f31622a;
    }

    private static final VoicePickerSharedContract.State VoicePickerScreen$lambda$2(s2 s2Var) {
        return (VoicePickerSharedContract.State) s2Var.getValue();
    }

    private static final VoicePickerContract.State VoicePickerScreen$lambda$3(s2 s2Var) {
        return (VoicePickerContract.State) s2Var.getValue();
    }

    public static final z VoicePickerScreen$lambda$9(p pVar, p pVar2, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (pVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean f10 = qVar.f(pVar2);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new l(pVar2, 0);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(u.P, z10, 0L, (ho.l) L, null, qVar, 0, 21);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerScreen$lambda$9$0$0(p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return z.f31622a;
    }

    private static final void VoicePickerUI(final VoicePickerMode voicePickerMode, final VoicePickerContract.State state, final ho.l lVar, final VoicePickerSharedContract.State state2, final ho.l lVar2, final p pVar, j2 j2Var, i1.o oVar, final p pVar2, ho.q qVar, ho.q qVar2, ho.q qVar3, ho.q qVar4, ho.q qVar5, ho.q qVar6, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        ho.l lVar3;
        j2 j2Var2;
        i1.o oVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        final ho.q qVar7;
        final ho.q qVar8;
        final ho.q qVar9;
        final ho.q qVar10;
        final j2 j2Var3;
        final i1.o oVar3;
        q qVar11;
        final ho.q qVar12;
        final ho.q qVar13;
        ho.q qVar14;
        final ho.q qVar15;
        b3 b3Var;
        final VoicePickerSharedContract.State state3 = state2;
        q qVar16 = (q) mVar;
        qVar16.Z(1722045971);
        if ((i10 & 6) == 0) {
            i13 = ((i10 & 8) == 0 ? qVar16.f(voicePickerMode) : qVar16.h(voicePickerMode) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= (i10 & 64) == 0 ? qVar16.f(state) : qVar16.h(state) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            lVar3 = lVar;
            i13 |= qVar16.h(lVar3) ? RpcError.MAX_MESSAGE_BYTES : 128;
        } else {
            lVar3 = lVar;
        }
        int i22 = i10 & 3072;
        int i23 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i22 == 0) {
            i13 |= qVar16.h(state3) ? 2048 : 1024;
        }
        int i24 = i10 & 24576;
        int i25 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i24 == 0) {
            i13 |= qVar16.h(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= qVar16.h(pVar) ? 131072 : 65536;
        }
        int i26 = i12 & 64;
        if (i26 != 0) {
            i13 |= 1572864;
            j2Var2 = j2Var;
        } else {
            j2Var2 = j2Var;
            if ((i10 & 1572864) == 0) {
                i13 |= qVar16.f(j2Var2) ? 1048576 : 524288;
            }
        }
        int i27 = i12 & 128;
        if (i27 != 0) {
            i13 |= 12582912;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            if ((i10 & 12582912) == 0) {
                i13 |= qVar16.h(oVar2) ? 8388608 : 4194304;
            }
        }
        if ((i10 & 100663296) == 0) {
            i13 |= qVar16.h(pVar2) ? 67108864 : 33554432;
        }
        int i28 = i13;
        int i29 = i12 & 512;
        if (i29 != 0) {
            i14 = i29;
            i15 = i28 | 805306368;
        } else {
            if ((i10 & 805306368) == 0) {
                i14 = i29;
                i28 |= qVar16.h(qVar) ? 536870912 : 268435456;
            } else {
                i14 = i29;
            }
            i15 = i28;
        }
        int i30 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i30 != 0) {
            i17 = i11 | 6;
            i16 = i30;
        } else if ((i11 & 6) == 0) {
            i16 = i30;
            i17 = i11 | (qVar16.h(qVar2) ? 4 : 2);
        } else {
            i16 = i30;
            i17 = i11;
        }
        int i31 = i12 & 2048;
        if (i31 != 0) {
            i17 |= 48;
            i18 = i31;
        } else if ((i11 & 48) == 0) {
            i18 = i31;
            i17 |= qVar16.h(qVar3) ? 32 : 16;
        } else {
            i18 = i31;
        }
        int i32 = i17;
        int i33 = i12 & 4096;
        if (i33 != 0) {
            i19 = i32 | 384;
        } else if ((i11 & 384) == 0) {
            i19 = i32 | (qVar16.h(qVar4) ? RpcError.MAX_MESSAGE_BYTES : 128);
        } else {
            i19 = i32;
        }
        int i34 = i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i34 != 0) {
            i20 = i19 | 3072;
        } else {
            int i35 = i19;
            if ((i11 & 3072) == 0) {
                if (qVar16.h(qVar5)) {
                    i23 = 2048;
                }
                i20 = i35 | i23;
            } else {
                i20 = i35;
            }
        }
        int i36 = i12 & 16384;
        if (i36 != 0) {
            i21 = i20 | 24576;
        } else {
            int i37 = i20;
            if ((i11 & 24576) == 0) {
                if (qVar16.h(qVar6)) {
                    i25 = 16384;
                }
                i37 |= i25;
            }
            i21 = i37;
        }
        if (qVar16.O(i15 & 1, ((i15 & 306783379) == 306783378 && (i21 & 9363) == 9362) ? false : true)) {
            j2 j2Var4 = i26 != 0 ? null : j2Var2;
            i1.o oVar4 = i27 != 0 ? null : oVar2;
            ho.q lambda$982886357$app_productionRelease = i14 != 0 ? ComposableSingletons$VoicePickerScreenKt.INSTANCE.getLambda$982886357$app_productionRelease() : qVar;
            ho.q lambda$612304774$app_productionRelease = i16 != 0 ? ComposableSingletons$VoicePickerScreenKt.INSTANCE.getLambda$612304774$app_productionRelease() : qVar2;
            final ho.q m1601getLambda$1550675403$app_productionRelease = i18 != 0 ? ComposableSingletons$VoicePickerScreenKt.INSTANCE.m1601getLambda$1550675403$app_productionRelease() : qVar3;
            ho.q lambda$66974582$app_productionRelease = i33 != 0 ? ComposableSingletons$VoicePickerScreenKt.INSTANCE.getLambda$66974582$app_productionRelease() : qVar4;
            if (i34 != 0) {
                qVar14 = lambda$982886357$app_productionRelease;
                qVar15 = ComposableSingletons$VoicePickerScreenKt.INSTANCE.m1603getLambda$240415035$app_productionRelease();
            } else {
                qVar14 = lambda$982886357$app_productionRelease;
                qVar15 = qVar5;
            }
            final ho.q lambda$1519106810$app_productionRelease = i36 != 0 ? ComposableSingletons$VoicePickerScreenKt.INSTANCE.getLambda$1519106810$app_productionRelease() : qVar6;
            Object L = qVar16.L();
            if (L == u2.l.f33918a) {
                L = com.google.android.gms.internal.play_billing.b.t(0, qVar16);
            }
            final x0 x0Var = (x0) L;
            final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(VoicePickerUI$lambda$1(x0Var), (u2.m) qVar16, 0);
            long primary = EchoTheme.INSTANCE.getColors(qVar16, EchoTheme.$stable).getBackground().getPrimary(qVar16, EchoThemeColors.Background.$stable);
            if (voicePickerMode instanceof VoicePickerMode.VoicePicker) {
                qVar16.X(-1911451017);
                WeakHashMap weakHashMap = c3.f29142x;
                b3 b3Var2 = u0.e(qVar16).f29154l;
                qVar16.p(false);
                b3Var = b3Var2;
            } else if (voicePickerMode instanceof VoicePickerMode.VoicesTab) {
                qVar16.X(-1911345307);
                WeakHashMap weakHashMap2 = c3.f29142x;
                b3 i0Var = new i0(u0.e(qVar16).f29154l, new o1(u0.e(qVar16).f29154l, 16));
                qVar16.p(false);
                b3Var = i0Var;
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(1323812009, qVar16, false);
            }
            j2 j2Var5 = j2Var4;
            c3.j d10 = c3.k.d(-1945676593, true, new id.n(lVar3, lVar2, oVar4, j2Var4, state, voicePickerMode, state2), qVar16);
            c3.j d11 = c3.k.d(-1633570386, true, new f3.a(pVar, 1), qVar16);
            final ho.q qVar17 = lambda$612304774$app_productionRelease;
            final ho.q qVar18 = lambda$66974582$app_productionRelease;
            final ho.q qVar19 = qVar14;
            state3 = state2;
            qVar11 = qVar16;
            k5.a(null, d10, d11, null, null, 0, primary, 0L, b3Var, c3.k.d(-526715484, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.i
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z VoicePickerUI$lambda$5;
                    int intValue = ((Integer) obj3).intValue();
                    VoicePickerUI$lambda$5 = VoicePickerScreenKt.VoicePickerUI$lambda$5(VoicePickerSharedContract.State.this, state, lVar, voicePickerMode, qVar19, rememberPxToDp, qVar17, lambda$1519106810$app_productionRelease, m1601getLambda$1550675403$app_productionRelease, qVar18, qVar15, x0Var, pVar2, (z1) obj, (u2.m) obj2, intValue);
                    return VoicePickerUI$lambda$5;
                }
            }, qVar16), qVar11, 805306800, 185);
            int i38 = (i15 >> 9) & 126;
            VoicePickerSharedFavoriteRemoveConfirmationDialogKt.VoicePickerSharedFavoriteRemoveConfirmationDialog(state3, lVar2, qVar16, i38);
            VoicePickerSharedDeleteConfirmationDialogKt.VoicePickerSharedDeleteConfirmationDialog(state3, lVar2, qVar16, i38);
            qVar10 = lambda$1519106810$app_productionRelease;
            qVar9 = m1601getLambda$1550675403$app_productionRelease;
            qVar12 = qVar18;
            oVar3 = oVar4;
            qVar7 = qVar19;
            qVar13 = qVar15;
            qVar8 = qVar17;
            j2Var3 = j2Var5;
        } else {
            qVar16.R();
            qVar7 = qVar;
            qVar8 = qVar2;
            qVar9 = qVar3;
            qVar10 = qVar6;
            j2Var3 = j2Var2;
            oVar3 = oVar2;
            qVar11 = qVar16;
            qVar12 = qVar4;
            qVar13 = qVar5;
        }
        r1 r10 = qVar11.r();
        if (r10 != null) {
            r10.f34012d = new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.j
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z VoicePickerUI$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    VoicePickerUI$lambda$6 = VoicePickerScreenKt.VoicePickerUI$lambda$6(VoicePickerMode.this, state, lVar, state3, lVar2, pVar, j2Var3, oVar3, pVar2, qVar7, qVar8, qVar9, qVar12, qVar13, qVar10, i10, i11, i12, (u2.m) obj, intValue);
                    return VoicePickerUI$lambda$6;
                }
            };
        }
    }

    private static final int VoicePickerUI$lambda$1(x0 x0Var) {
        return ((f1) x0Var).h();
    }

    private static final void VoicePickerUI$lambda$2(x0 x0Var, int i10) {
        ((f1) x0Var).i(i10);
    }

    public static final z VoicePickerUI$lambda$3(VoicePickerMode voicePickerMode, VoicePickerContract.State state, ho.l lVar, VoicePickerSharedContract.State state2, ho.l lVar2, j2 j2Var, i1.o oVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerHeaderKt.VoicePickerHeader(voicePickerMode, state, lVar, state2, lVar2, j2Var, oVar, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerUI$lambda$4(p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (pVar == null) {
                qVar.X(579086699);
            } else {
                qVar.X(2096890198);
                pVar.invoke(qVar, 0);
            }
            qVar.p(false);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    public static final z VoicePickerUI$lambda$5(VoicePickerSharedContract.State state, VoicePickerContract.State state2, ho.l lVar, VoicePickerMode voicePickerMode, ho.q qVar, float f10, ho.q qVar2, ho.q qVar3, ho.q qVar4, ho.q qVar5, ho.q qVar6, x0 x0Var, p pVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        Object obj;
        boolean z10;
        boolean z11;
        ?? r22;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
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
        q qVar7 = (q) mVar;
        if (qVar7.O(i11 & 1, z6)) {
            i3.q qVar8 = i3.q.f13017a;
            t D = r1.d.D(p2.d(qVar8, 1.0f), z1Var);
            i3.l lVar2 = i3.d.f12997a;
            f4.f1 d10 = r1.p.d(lVar2, false);
            int hashCode = Long.hashCode(qVar7.T);
            c3.o l4 = qVar7.l();
            t c5 = i3.a.c(D, qVar7);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar7.b0();
            if (qVar7.S) {
                qVar7.k(fVar);
            } else {
                qVar7.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d10, qVar7);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar7);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar7, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar7);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar7);
            t d11 = p2.d(qVar8, 1.0f);
            x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar7, 0);
            int hashCode2 = Long.hashCode(qVar7.T);
            c3.o l7 = qVar7.l();
            t c10 = i3.a.c(d11, qVar7);
            qVar7.b0();
            if (qVar7.S) {
                qVar7.k(fVar);
            } else {
                qVar7.k0();
            }
            r.J(eVar, a10, qVar7);
            r.J(eVar2, l7, qVar7);
            defpackage.f.u(hashCode2, qVar7, eVar3, qVar7, dVar);
            r.J(eVar4, c10, qVar7);
            boolean isActive = state.getFilters().isActive();
            Object obj2 = u2.l.f33918a;
            if (!isActive && !state.getSearchShown()) {
                qVar7.X(-1158099706);
                VoicePickerContract.TabsState tabs = state2.getTabs();
                boolean f11 = qVar7.f(lVar);
                Object L = qVar7.L();
                if (f11 || L == obj2) {
                    L = new g3.m(lVar, 6);
                    qVar7.h0(L);
                }
                VoicePickerTabsKt.VoicePickerTabs(tabs, (ho.l) L, qVar7, 0);
                qVar7.p(false);
            } else {
                qVar7.X(-1158138208);
                qVar7.p(false);
            }
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            f4.f1 d12 = r1.p.d(i3.d.Z, false);
            int hashCode3 = Long.hashCode(qVar7.T);
            c3.o l10 = qVar7.l();
            t c11 = i3.a.c(m1Var, qVar7);
            qVar7.b0();
            if (qVar7.S) {
                qVar7.k(fVar);
            } else {
                qVar7.k0();
            }
            r.J(eVar, d12, qVar7);
            r.J(eVar2, l10, qVar7);
            defpackage.f.u(hashCode3, qVar7, eVar3, qVar7, dVar);
            r.J(eVar4, c11, qVar7);
            if (state.getSearchShown()) {
                qVar7.X(-1313393145);
                obj = 0;
                qVar.invoke(new h5.f(f10), qVar7, null);
                qVar7.p(false);
            } else {
                obj = 0;
                if (state.getFilters().isActive()) {
                    qVar7.X(-1313117307);
                    qVar2.invoke(new h5.f(f10), qVar7, null);
                    qVar7.p(false);
                } else {
                    qVar7.X(-1312933911);
                    VoicePickerContract.TabsState tabs2 = state2.getTabs();
                    if (tabs2 instanceof VoicePickerContract.TabsState.Hidden) {
                        qVar7.X(-1312872934);
                        qVar3.invoke(new h5.f(f10), qVar7, null);
                        z10 = false;
                        qVar7.p(false);
                    } else if (tabs2 instanceof VoicePickerContract.TabsState.Visible) {
                        qVar7.X(-1312638946);
                        int i13 = WhenMappings.$EnumSwitchMapping$0[((VoicePickerContract.TabsState.Visible) state2.getTabs()).getActiveTab().ordinal()];
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 == 4) {
                                        qVar7.X(-1312019318);
                                        qVar3.invoke(new h5.f(f10), qVar7, null);
                                        z10 = false;
                                        qVar7.p(false);
                                    } else {
                                        throw com.google.android.gms.internal.play_billing.b.h(-180890524, qVar7, false);
                                    }
                                } else {
                                    z10 = false;
                                    qVar7.X(-1312199862);
                                    qVar6.invoke(new h5.f(f10), qVar7, null);
                                    qVar7.p(false);
                                }
                            } else {
                                z10 = false;
                                qVar7.X(-1312382328);
                                qVar5.invoke(new h5.f(f10), qVar7, null);
                                qVar7.p(false);
                            }
                        } else {
                            z10 = false;
                            qVar7.X(-1312564918);
                            qVar4.invoke(new h5.f(f10), qVar7, null);
                            qVar7.p(false);
                        }
                        qVar7.p(z10);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(-180900039, qVar7, false);
                    }
                    qVar7.p(z10);
                }
            }
            boolean z12 = voicePickerMode instanceof VoicePickerMode.VoicePicker;
            if (z12) {
                qVar7.X(-1311652371);
                t f12 = p2.f(p2.e(qVar8, 1.0f), 50);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i14 = ElevenLabsTheme.$stable;
                VerticalGradientKt.VerticalGradient(f12, ig.f.I(new p3.x(p3.x.b(u.P, elevenLabsTheme.getColor(qVar7, i14).getBackground().m2003getPrimary0d7_KjU())), new p3.x(ib.i.d(elevenLabsTheme, qVar7, i14))), qVar7, 6, 0);
                qVar7.p(false);
                r22 = 0;
                z11 = true;
            } else if (voicePickerMode instanceof VoicePickerMode.VoicesTab) {
                qVar7.X(-1311109406);
                Object L2 = qVar7.L();
                if (L2 == obj2) {
                    L2 = new b0(x0Var, 2);
                    qVar7.h0(L2);
                }
                t q = f4.i0.q(qVar8, (ho.l) L2);
                f4.f1 d13 = r1.p.d(lVar2, false);
                int hashCode4 = Long.hashCode(qVar7.T);
                c3.o l11 = qVar7.l();
                t c12 = i3.a.c(q, qVar7);
                qVar7.b0();
                if (qVar7.S) {
                    qVar7.k(fVar);
                } else {
                    qVar7.k0();
                }
                r.J(eVar, d13, qVar7);
                r.J(eVar2, l11, qVar7);
                defpackage.f.u(hashCode4, qVar7, eVar3, qVar7, dVar);
                r.J(eVar4, c12, qVar7);
                pVar.invoke(qVar7, obj);
                z11 = true;
                qVar7.p(true);
                r22 = 0;
                qVar7.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(-180860537, qVar7, false);
            }
            qVar7.p(z11);
            if (z12) {
                qVar7.X(-1154851247);
                SelectedVoiceControls(state2, state, lVar, qVar7, r22);
                qVar7.p(r22);
            } else if (voicePickerMode instanceof VoicePickerMode.VoicesTab) {
                qVar7.X(-1154566016);
                qVar7.p(r22);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(-1007086625, qVar7, r22);
            }
            qVar7.p(true);
            qVar7.p(true);
        } else {
            qVar7.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerUI$lambda$5$0$0$0$0(ho.l lVar, VoicePickerTab voicePickerTab) {
        voicePickerTab.getClass();
        lVar.invoke(new VoicePickerContract.Event.SelectTab(voicePickerTab));
        return z.f31622a;
    }

    public static final z VoicePickerUI$lambda$5$0$0$1$0$0(x0 x0Var, h5.l lVar) {
        VoicePickerUI$lambda$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z VoicePickerUI$lambda$6(VoicePickerMode voicePickerMode, VoicePickerContract.State state, ho.l lVar, VoicePickerSharedContract.State state2, ho.l lVar2, p pVar, j2 j2Var, i1.o oVar, p pVar2, ho.q qVar, ho.q qVar2, ho.q qVar3, ho.q qVar4, ho.q qVar5, ho.q qVar6, int i10, int i11, int i12, u2.m mVar, int i13) {
        VoicePickerUI(voicePickerMode, state, lVar, state2, lVar2, pVar, j2Var, oVar, pVar2, qVar, qVar2, qVar3, qVar4, qVar5, qVar6, mVar, r.M(i10 | 1), r.M(i11), i12);
        return z.f31622a;
    }
}
