package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.p;
import i1.j2;
import i1.o;
import i3.t;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.model.Filter;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.x;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.FiltersState;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.InputSearchKt;
import io.elevenlabs.ui.components.SearchButtonKt;
import io.elevenlabs.ui.components.headers.EchoHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import n3.v;
import p3.h0;
import r1.l2;
import r1.p2;
import r1.s;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\u001ag\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001as\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u000f\u0010\u001d\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001d\u0010\u0019\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u000f\u0010\u001f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u000f\u0010 \u001a\u00020\u0006H\u0001¢\u0006\u0004\b \u0010\u0019\u001a\u000f\u0010!\u001a\u00020\u0006H\u0001¢\u0006\u0004\b!\u0010\u0019¨\u0006$²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;", "mode", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$Event;", "Lsn/z;", "onEvent", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "headerTitleAnimatedContentScope", "VoicePickerHeader", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Li1/j2;Li1/o;Lu2/m;II)V", "searchButtonAnimatedContentScope", "DefaultHeader", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerMode;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$State;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Li1/j2;Li1/o;Li1/o;Lu2/m;II)V", "animatedContentScope", "SearchHeader", "(Lho/l;Li1/j2;Li1/o;Lu2/m;II)V", "Preview_VoicePickerHeader_VoicePicker_NoFiltersNoSearch", "(Lu2/m;I)V", "Preview_VoicePickerHeader_VoicePicker_Default_NoFilters", "Preview_VoicePickerHeader_VoicePicker_Default_WithFilters", "Preview_VoicePickerHeader_VoicePicker_WithFiltersSelected", "Preview_VoicePickerHeader_VoicesTab_Default_NoFilters", "Preview_VoicePickerHeader_VoicesTab_Default_WithFilters", "Preview_VoicePickerHeader_VoicesTab_WithFiltersSelected", "Preview_VoicePickerHeader_VoicePicker_Search", "Preview_VoicePickerHeader_VoicesTab_Search", "", "query", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void DefaultHeader(final VoicePickerMode voicePickerMode, VoicePickerContract.State state, final ho.l lVar, final VoicePickerSharedContract.State state2, final ho.l lVar2, j2 j2Var, o oVar, o oVar2, u2.m mVar, int i10, int i11) {
        int i12;
        final j2 j2Var2;
        int i13;
        int i14;
        o oVar3;
        int i15;
        int i16;
        o oVar4;
        int i17;
        int i18;
        boolean z6;
        q qVar;
        j2 j2Var3;
        o oVar5;
        r1 r10;
        final o oVar6;
        final boolean z10;
        String R;
        boolean z11;
        EchoHeaderStyle echoHeaderStyle;
        int i19;
        int i20;
        int i21;
        boolean h10;
        int i22;
        boolean h11;
        int i23;
        q qVar2 = (q) mVar;
        qVar2.Z(-668897080);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h11 = qVar2.f(voicePickerMode);
            } else {
                h11 = qVar2.h(voicePickerMode);
            }
            if (h11) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar2.f(state);
            } else {
                h10 = qVar2.h(state);
            }
            if (h10) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(state2)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.h(lVar2)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        int i24 = i11 & 32;
        if (i24 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            j2Var2 = j2Var;
            if (qVar2.f(j2Var2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                oVar3 = oVar;
                if (qVar2.h(oVar3)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                i16 = i11 & 128;
                if (i16 != 0) {
                    i12 |= 12582912;
                } else if ((12582912 & i10) == 0) {
                    oVar4 = oVar2;
                    if (qVar2.h(oVar4)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                    i18 = i12;
                    if ((4793491 & i12) == 4793490) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i18 & 1, z6)) {
                        if (i24 != 0) {
                            j2Var2 = null;
                        }
                        if (i14 != 0) {
                            oVar3 = null;
                        }
                        if (i16 != 0) {
                            oVar6 = null;
                        } else {
                            oVar6 = oVar4;
                        }
                        VoicePickerContract.FilterAndSearchMenuState filterAndSearchMenu = state.getFilterAndSearchMenu();
                        if (!kotlin.jvm.internal.m.c(filterAndSearchMenu, VoicePickerContract.FilterAndSearchMenuState.Hidden.INSTANCE) && !kotlin.jvm.internal.m.c(filterAndSearchMenu, VoicePickerContract.FilterAndSearchMenuState.Initial.INSTANCE)) {
                            if (kotlin.jvm.internal.m.c(filterAndSearchMenu, VoicePickerContract.FilterAndSearchMenuState.Shown.INSTANCE)) {
                                z10 = true;
                            } else {
                                c6.p();
                                return;
                            }
                        } else {
                            z10 = false;
                        }
                        boolean z12 = voicePickerMode instanceof VoicePickerMode.VoicePicker;
                        if (z12) {
                            qVar2.X(1435023836);
                            R = kj.c.R(qVar2, R.string.voice_picker_select_a_voice);
                            qVar2.p(false);
                        } else if (voicePickerMode instanceof VoicePickerMode.VoicesTab) {
                            qVar2.X(1435026924);
                            R = kj.c.R(qVar2, R.string.home_voices);
                            qVar2.p(false);
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(1435022067, qVar2, false);
                        }
                        boolean z13 = voicePickerMode instanceof VoicePickerMode.VoicesTab;
                        t tVar = i3.q.f13017a;
                        if (z13) {
                            qVar2.X(1435031504);
                            int i25 = i18 >> 12;
                            tVar = SearchButtonKt.headerTitleSharedElement(tVar, j2Var2, oVar3, qVar2, (i25 & 112) | 6 | (i25 & 896));
                            qVar2.p(false);
                            z11 = z12;
                        } else if (z12) {
                            z11 = z12;
                            qVar2.X(1435038256);
                            qVar2.p(false);
                        } else {
                            throw com.google.android.gms.internal.play_billing.b.h(1435029493, qVar2, false);
                        }
                        if (z13) {
                            echoHeaderStyle = EchoHeaderStyle.Large;
                        } else if (z11) {
                            echoHeaderStyle = EchoHeaderStyle.Default;
                        } else {
                            c6.p();
                            return;
                        }
                        qVar = qVar2;
                        HeaderKt.EchoHeader(R, null, tVar, c3.k.d(-312466798, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.d
                            @Override // ho.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                z DefaultHeader$lambda$0;
                                int intValue = ((Integer) obj3).intValue();
                                DefaultHeader$lambda$0 = VoicePickerHeaderKt.DefaultHeader$lambda$0(z10, j2Var2, oVar6, lVar2, state2, voicePickerMode, lVar, (l2) obj, (u2.m) obj2, intValue);
                                return DefaultHeader$lambda$0;
                            }
                        }, qVar2), echoHeaderStyle, qVar, 3072, 2);
                        j2Var3 = j2Var2;
                        oVar5 = oVar6;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        j2Var3 = j2Var2;
                        oVar5 = oVar4;
                    }
                    o oVar7 = oVar3;
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new x(voicePickerMode, state, lVar, state2, lVar2, j2Var3, oVar7, oVar5, i10, i11);
                        return;
                    }
                    return;
                }
                oVar4 = oVar2;
                i18 = i12;
                if ((4793491 & i12) == 4793490) {
                }
                if (!qVar2.O(i18 & 1, z6)) {
                }
                o oVar72 = oVar3;
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            oVar3 = oVar;
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            oVar4 = oVar2;
            i18 = i12;
            if ((4793491 & i12) == 4793490) {
            }
            if (!qVar2.O(i18 & 1, z6)) {
            }
            o oVar722 = oVar3;
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        j2Var2 = j2Var;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        oVar3 = oVar;
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        oVar4 = oVar2;
        i18 = i12;
        if ((4793491 & i12) == 4793490) {
        }
        if (!qVar2.O(i18 & 1, z6)) {
        }
        o oVar7222 = oVar3;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z DefaultHeader$lambda$0(boolean z6, j2 j2Var, o oVar, ho.l lVar, VoicePickerSharedContract.State state, VoicePickerMode voicePickerMode, ho.l lVar2, l2 l2Var, u2.m mVar, int i10) {
        boolean z10;
        q qVar;
        ButtonIconVariant buttonIconVariant;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar2 = (q) mVar;
        if (qVar2.O(i10 & 1, z10)) {
            u2.e eVar = u2.l.f33918a;
            if (z6) {
                qVar2.X(-1504170416);
                int i11 = io.elevenlabs.ui.R.drawable.magnifying_glass;
                String R = kj.c.R(qVar2, R.string.search_accessibility_search);
                ButtonIconVariant buttonIconVariant2 = ButtonIconVariant.Secondary;
                ButtonIconSize buttonIconSize = ButtonIconSize.Medium;
                t searchButtonSharedElement = SearchButtonKt.searchButtonSharedElement(i3.q.f13017a, j2Var, oVar, qVar2, 6);
                boolean f10 = qVar2.f(lVar);
                Object L = qVar2.L();
                if (f10 || L == eVar) {
                    L = new id.z(lVar, 26);
                    qVar2.h0(L);
                }
                ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, searchButtonSharedElement, buttonIconVariant2, buttonIconSize, false, false, false, qVar2, 221184, 448);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(-1503510736);
                qVar.p(false);
            }
            if (z6 && state.getFilters().getAvailable() != null) {
                qVar.X(-1503412497);
                int i12 = io.elevenlabs.ui.R.drawable.settings_slider_hor;
                String R2 = kj.c.R(qVar, R.string.accessibility_voices_filter);
                boolean f11 = qVar.f(lVar);
                Object L2 = qVar.L();
                if (f11 || L2 == eVar) {
                    L2 = new id.z(lVar, 27);
                    qVar.h0(L2);
                }
                ho.a aVar = (ho.a) L2;
                if (state.getFilters().isActive()) {
                    buttonIconVariant = ButtonIconVariant.Primary;
                } else {
                    buttonIconVariant = ButtonIconVariant.Secondary;
                }
                ButtonIconKt.ButtonIcon(i12, R2, aVar, null, buttonIconVariant, ButtonIconSize.Medium, false, false, false, qVar, 196608, 456);
                qVar.p(false);
            } else {
                qVar.X(-1502858000);
                qVar.p(false);
            }
            if (voicePickerMode instanceof VoicePickerMode.VoicePicker) {
                qVar.X(-1502766860);
                int i13 = io.elevenlabs.ui.R.drawable.close;
                String R3 = kj.c.R(qVar, io.elevenlabs.ui.R.string.accessibility_bottom_sheet_dialog_close);
                boolean f12 = qVar.f(lVar2);
                Object L3 = qVar.L();
                if (f12 || L3 == eVar) {
                    L3 = new id.z(lVar2, 28);
                    qVar.h0(L3);
                }
                ButtonIconKt.ButtonIcon(i13, R3, (ho.a) L3, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
                qVar.p(false);
            } else if (voicePickerMode instanceof VoicePickerMode.VoicesTab) {
                qVar.X(-1502290514);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(367163728, qVar, false);
            }
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z DefaultHeader$lambda$0$0$0(ho.l lVar) {
        lVar.invoke(new VoicePickerSharedContract.Event.UpdateSearchShown(true));
        return z.f31622a;
    }

    public static final z DefaultHeader$lambda$0$1$0(ho.l lVar) {
        lVar.invoke(new VoicePickerSharedContract.Event.UpdateFiltersDialogShown(true));
        return z.f31622a;
    }

    public static final z DefaultHeader$lambda$0$2$0(ho.l lVar) {
        lVar.invoke(VoicePickerContract.Event.Close.INSTANCE);
        return z.f31622a;
    }

    public static final z DefaultHeader$lambda$1(VoicePickerMode voicePickerMode, VoicePickerContract.State state, ho.l lVar, VoicePickerSharedContract.State state2, ho.l lVar2, j2 j2Var, o oVar, o oVar2, int i10, int i11, u2.m mVar, int i12) {
        DefaultHeader(voicePickerMode, state, lVar, state2, lVar2, j2Var, oVar, oVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicePicker_Default_NoFilters(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1959492387);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicePicker voicePicker = new VoicePickerMode.VoicePicker("");
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(2);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(7);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicePicker, state, lVar, state2, (ho.l) L2, null, null, qVar, 24960, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 13);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Default_NoFilters$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Default_NoFilters$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Default_NoFilters$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicePicker_Default_NoFilters(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicePicker_Default_WithFilters(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1884682850);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicePicker voicePicker = new VoicePickerMode.VoicePicker("");
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(3);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            tn.t tVar = tn.t.f33547a;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, new FiltersState(new AvailableFilters(tVar, tVar, tVar, tVar, tVar, tVar, tVar), null, null, null, null, null, null, 126, null), false, null, null, null, null, false, 8127, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(4);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicePicker, state, lVar, state2, (ho.l) L2, null, null, qVar, 24960, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 9);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Default_WithFilters$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Default_WithFilters$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Default_WithFilters$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicePicker_Default_WithFilters(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicePicker_NoFiltersNoSearch(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(813583030);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicePicker voicePicker = new VoicePickerMode.VoicePicker("");
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), VoicePickerContract.FilterAndSearchMenuState.Hidden.INSTANCE, false, 4, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(12);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(13);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicePicker, state, lVar, state2, (ho.l) L2, null, null, qVar, 24960, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 14);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_NoFiltersNoSearch$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_NoFiltersNoSearch$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_NoFiltersNoSearch$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicePicker_NoFiltersNoSearch(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicePicker_Search(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(278220837);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicePicker voicePicker = new VoicePickerMode.VoicePicker("");
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(10);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, true, null, false, null, null, null, null, false, 8159, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(11);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicePicker, state, lVar, state2, (ho.l) L2, null, null, qVar, 24960, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 12);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Search$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Search$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_Search$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicePicker_Search(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicePicker_WithFiltersSelected(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1937612759);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicePicker voicePicker = new VoicePickerMode.VoicePicker("");
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(8);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            tn.t tVar = tn.t.f33547a;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, new FiltersState(new AvailableFilters(tVar, tVar, tVar, tVar, tVar, tVar, tVar), null, null, null, new Filter.Default("age", "age"), null, null, 110, null), false, null, null, null, null, false, 8127, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(9);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicePicker, state, lVar, state2, (ho.l) L2, null, null, qVar, 24960, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 11);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_WithFiltersSelected$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_WithFiltersSelected$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicePicker_WithFiltersSelected$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicePicker_WithFiltersSelected(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicesTab_Default_NoFilters(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-535475671);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicesTab voicesTab = VoicePickerMode.VoicesTab.INSTANCE;
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(16);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(17);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicesTab, state, lVar, state2, (ho.l) L2, null, null, qVar, 24966, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 16);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Default_NoFilters$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Default_NoFilters$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Default_NoFilters$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicesTab_Default_NoFilters(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicesTab_Default_WithFilters(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(270179502);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicesTab voicesTab = VoicePickerMode.VoicesTab.INSTANCE;
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(18);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            tn.t tVar = tn.t.f33547a;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, new FiltersState(new AvailableFilters(tVar, tVar, tVar, tVar, tVar, tVar, tVar), null, null, null, null, null, null, 126, null), false, null, null, null, null, false, 8127, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(19);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicesTab, state, lVar, state2, (ho.l) L2, null, null, qVar, 24966, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 17);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Default_WithFilters$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Default_WithFilters$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Default_WithFilters$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicesTab_Default_WithFilters(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicesTab_Search(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1694834087);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicesTab voicesTab = VoicePickerMode.VoicesTab.INSTANCE;
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(5);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, true, null, false, null, null, null, null, false, 8159, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(6);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicesTab, state, lVar, state2, (ho.l) L2, null, null, qVar, 24966, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 10);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Search$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Search$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_Search$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicesTab_Search(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePickerHeader_VoicesTab_WithFiltersSelected(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(742851189);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerMode.VoicesTab voicesTab = VoicePickerMode.VoicesTab.INSTANCE;
            VoicePickerContract.State state = new VoicePickerContract.State(VoicePickerContract.TabsState.Visible.INSTANCE.initialState(VoicePickerTab.Recents), null, false, 6, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(14);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            tn.t tVar = tn.t.f33547a;
            VoicePickerSharedContract.State state2 = new VoicePickerSharedContract.State(null, null, null, null, null, false, new FiltersState(new AvailableFilters(tVar, tVar, tVar, tVar, tVar, tVar, tVar), null, null, null, new Filter.Default("age", "age"), null, null, 110, null), false, null, null, null, null, false, 8127, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(15);
                qVar.h0(L2);
            }
            VoicePickerHeader(voicesTab, state, lVar, state2, (ho.l) L2, null, null, qVar, 24966, 96);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 15);
        }
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_WithFiltersSelected$lambda$0$0(VoicePickerContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_WithFiltersSelected$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerHeader_VoicesTab_WithFiltersSelected$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_VoicePickerHeader_VoicesTab_WithFiltersSelected(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SearchHeader(ho.l lVar, j2 j2Var, o oVar, u2.m mVar, int i10, int i11) {
        int i12;
        j2 j2Var2;
        int i13;
        int i14;
        o oVar2;
        int i15;
        boolean z6;
        j2 j2Var3;
        o oVar3;
        r1 r10;
        int i16;
        q qVar = (q) mVar;
        qVar.Z(802730755);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            j2Var2 = j2Var;
            if (qVar.f(j2Var2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                oVar2 = oVar;
                if (qVar.h(oVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    if (i17 != 0) {
                        j2Var3 = null;
                    } else {
                        j2Var3 = j2Var2;
                    }
                    if (i14 != 0) {
                        oVar3 = null;
                    } else {
                        oVar3 = oVar2;
                    }
                    Object L = qVar.L();
                    if (L == u2.l.f33918a) {
                        L = r.A("");
                        qVar.h0(L);
                    }
                    HeaderActionsKt.HeaderActions(r1.d.G(l1.n.h(p2.e(i3.q.f13017a, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b), u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2350getX1D9Ej5fM(), 1), c3.k.d(1328585968, true, new e(lVar, j2Var3, oVar3, (z0) L, 0), qVar), (ho.q) null, c3.k.d(1845890685, true, new fr.m(lVar, 1), qVar), (i3.f) null, qVar, 3120, 20);
                } else {
                    qVar.R();
                    j2Var3 = j2Var2;
                    oVar3 = oVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(lVar, j2Var3, oVar3, i10, i11, 9);
                    return;
                }
                return;
            }
            oVar2 = oVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        j2Var2 = j2Var;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        oVar2 = oVar;
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final String SearchHeader$lambda$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z SearchHeader$lambda$3(ho.l lVar, j2 j2Var, o oVar, z0 z0Var, s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        boolean O = qVar.O(i10 & 1, z6);
        z zVar = z.f31622a;
        if (O) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new v();
                qVar.h0(L);
            }
            v vVar = (v) L;
            String SearchHeader$lambda$1 = SearchHeader$lambda$1(z0Var);
            boolean f10 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new a2.h0(lVar, z0Var, 4);
                qVar.h0(L2);
            }
            InputSearchKt.InputSearch(SearchHeader$lambda$1, (ho.l) L2, n3.d.j(SearchButtonKt.searchButtonSharedElement(i3.q.f13017a, j2Var, oVar, qVar, 6), vVar), kj.c.R(qVar, R.string.search_placeholder), qVar, 0, 0);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new VoicePickerHeaderKt$SearchHeader$1$2$1(vVar, null);
                qVar.h0(L3);
            }
            r.f((p) L3, zVar, qVar);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final z SearchHeader$lambda$3$1$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new VoicePickerSharedContract.Event.UpdateSearchQuery(str));
        return z.f31622a;
    }

    public static final z SearchHeader$lambda$4(ho.l lVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = io.elevenlabs.ui.R.drawable.close;
            String R = kj.c.R(qVar, R.string.voices_search_close_accessibility_hint);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new id.z(lVar, 25);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Secondary, ButtonIconSize.Small, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SearchHeader$lambda$4$0$0(ho.l lVar) {
        lVar.invoke(new VoicePickerSharedContract.Event.UpdateSearchShown(false));
        lVar.invoke(new VoicePickerSharedContract.Event.UpdateSearchQuery(null));
        return z.f31622a;
    }

    public static final z SearchHeader$lambda$5(ho.l lVar, j2 j2Var, o oVar, int i10, int i11, u2.m mVar, int i12) {
        SearchHeader(lVar, j2Var, oVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoicePickerHeader(final VoicePickerMode voicePickerMode, final VoicePickerContract.State state, final ho.l lVar, final VoicePickerSharedContract.State state2, ho.l lVar2, j2 j2Var, o oVar, u2.m mVar, int i10, int i11) {
        int i12;
        final ho.l lVar3;
        j2 j2Var2;
        int i13;
        int i14;
        o oVar2;
        int i15;
        boolean z6;
        q qVar;
        j2 j2Var3;
        o oVar3;
        r1 r10;
        final j2 j2Var4;
        final o oVar4;
        int i16;
        int i17;
        int i18;
        boolean h10;
        int i19;
        boolean h11;
        int i20;
        voicePickerMode.getClass();
        state.getClass();
        lVar.getClass();
        state2.getClass();
        lVar2.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1961468167);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h11 = qVar2.f(voicePickerMode);
            } else {
                h11 = qVar2.h(voicePickerMode);
            }
            if (h11) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar2.f(state);
            } else {
                h10 = qVar2.h(state);
            }
            if (h10) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(state2)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        if ((i10 & 24576) == 0) {
            lVar3 = lVar2;
            if (qVar2.h(lVar3)) {
                i16 = 16384;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        } else {
            lVar3 = lVar2;
        }
        int i21 = i11 & 32;
        if (i21 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            j2Var2 = j2Var;
            if (qVar2.f(j2Var2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                oVar2 = oVar;
                if (qVar2.h(oVar2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                if ((599187 & i12) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    if (i21 != 0) {
                        j2Var4 = null;
                    } else {
                        j2Var4 = j2Var2;
                    }
                    if (i14 != 0) {
                        oVar4 = null;
                    } else {
                        oVar4 = oVar2;
                    }
                    qVar = qVar2;
                    i1.l.b(Boolean.valueOf(state2.getSearchShown()), null, null, null, "voicePickerHeader", null, c3.k.d(-1432534314, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.c
                        @Override // ho.r
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            z VoicePickerHeader$lambda$0;
                            int intValue = ((Integer) obj4).intValue();
                            VoicePickerHeader$lambda$0 = VoicePickerHeaderKt.VoicePickerHeader$lambda$0(ho.l.this, j2Var4, voicePickerMode, state, lVar, state2, oVar4, (o) obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, intValue);
                            return VoicePickerHeader$lambda$0;
                        }
                    }, qVar2), qVar, 1597440, 46);
                    oVar3 = oVar4;
                    j2Var3 = j2Var4;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    j2Var3 = j2Var2;
                    oVar3 = oVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.c(voicePickerMode, state, lVar, state2, lVar2, j2Var3, oVar3, i10, i11, 5);
                    return;
                }
                return;
            }
            oVar2 = oVar;
            if ((599187 & i12) != 599186) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        j2Var2 = j2Var;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        oVar2 = oVar;
        if ((599187 & i12) != 599186) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z VoicePickerHeader$lambda$0(ho.l lVar, j2 j2Var, VoicePickerMode voicePickerMode, VoicePickerContract.State state, ho.l lVar2, VoicePickerSharedContract.State state2, o oVar, o oVar2, boolean z6, u2.m mVar, int i10) {
        oVar2.getClass();
        if (z6) {
            q qVar = (q) mVar;
            qVar.X(-1834646770);
            SearchHeader(lVar, j2Var, oVar2, qVar, (i10 << 6) & 896, 0);
            qVar.p(false);
        } else {
            q qVar2 = (q) mVar;
            qVar2.X(-1834413340);
            DefaultHeader(voicePickerMode, state, lVar2, state2, lVar, j2Var, oVar, oVar2, qVar2, (i10 << 21) & 29360128, 0);
            qVar2.p(false);
        }
        return z.f31622a;
    }

    public static final z VoicePickerHeader$lambda$1(VoicePickerMode voicePickerMode, VoicePickerContract.State state, ho.l lVar, VoicePickerSharedContract.State state2, ho.l lVar2, j2 j2Var, o oVar, int i10, int i11, u2.m mVar, int i12) {
        VoicePickerHeader(voicePickerMode, state, lVar, state2, lVar2, j2Var, oVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
