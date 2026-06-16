package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.EffectivePlaybackMode;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.OriginalVoice;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerError;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.SampleConfig;
import io.elevenlabs.domain.model.SkipDuration;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.highlighter.HighlighterData;
import io.elevenlabs.highlighter.HighlighterKt;
import io.elevenlabs.highlighter.HighlighterPosition;
import io.elevenlabs.highlighter.TextSelectionMenuConfig;
import io.elevenlabs.highlighter.TextSelectionMenuConfigKt;
import io.elevenlabs.highlighter.WordTapTarget;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.FlowExtensionsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlaybackPosition;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerToastMessage;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerAdditionalActionsPagerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerAdditionalActionsSoundscapesState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerAdditionalActionsUsedVoiceState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerButtonsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerButtonsPlayButtonState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerButtonsSleepTimerState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerButtonsSpeedState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerSliderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemBottomSheetKt;
import io.elevenlabs.ui.AccessibilityExtensionsKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.KeepScreenOnKt;
import io.elevenlabs.ui.components.SecureContentKt;
import io.elevenlabs.ui.components.ShadowKt;
import io.elevenlabs.ui.components.ToastContainerKt;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.ScreenHeightBreakpoints;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.c3;
import r1.p2;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aË\u0002\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00112\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00112\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aù\u0001\u0010+\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00042 \b\u0002\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0004\u0012\u00020\u00070\u00112\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00112\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00112\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00112\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0001¢\u0006\u0004\b+\u0010,\u001a=\u0010-\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u001e\u0010%\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0004\u0012\u00020\u00070\u0011H\u0003¢\u0006\u0004\b-\u0010.\u001a#\u00100\u001a\u00020\u0007*\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101¨\u0006>²\u0006\u0010\u00102\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00103\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00104\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00107\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00108\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010:\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "source", "", "readId", "Lkotlin/Function2;", "Lh5/f;", "Lio/elevenlabs/domain/model/MediaItemState;", "Lsn/z;", "playerPlaylistScreenSlot", "Lkotlin/Function0;", "onGoBack", "voiceId", "", "startAtChapter", "", "forceRefresh", "showAssistantOnLaunch", "Lkotlin/Function1;", "onNavigateToRead", "onNavigateToVoicePicker", "onNavigateToSoundscapes", "onNavigateToGenFMLoading", "onNavigateToReadShareDetails", "onNavigateToBookmarkShareDetails", "onNavigateToLink", "onNavigateToPurchaseHours", "onNavigateToVoiceDesignPaywall", "onNavigateToPaywall", "onNavigateToPlayerPreferences", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "vm", "PlayerScreen", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;Ljava/lang/String;Lho/r;Lho/a;Ljava/lang/String;Ljava/lang/Integer;ZZLho/l;Lho/a;Lho/a;Lho/p;Lho/l;Lho/p;Lho/l;Lho/l;Lho/a;Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;Lu2/m;III)V", "Lir/z1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "playerQueueScreenSlot", "action", "onShowAddToCollectionSheet", "onNavigateToPronunciations", "Lir/i;", "Lio/elevenlabs/domain/services/player/AssistantTriggerEvent;", "assistantTriggerFlow", "PlayerScreenUI", "(Lir/z1;Lho/r;Lho/l;Lho/a;Lho/a;Lho/a;Lho/l;Lho/l;Lho/l;Lho/a;Lir/i;ZLu2/m;III)V", "PlayerErrorToast", "(Lir/z1;Lho/l;Lu2/m;I)V", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "logVoicePickerOpened", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerState;Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "addToCollectionReadId", "createCollectionForReadId", "headerHeight", "playerControlHeight", "showMoreActionsSheet", "showSearch", "showReportProblemSheet", "showAssistantSheet", "wasPlayingBeforeAgent", "isTitleScrolled", "isTitleVisible", "isTalkbackEnabled", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayerConnectionState.values().length];
            try {
                iArr[PlayerConnectionState.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerConnectionState.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerConnectionState.BUFFERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerConnectionState.READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerConnectionState.ENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EffectivePlaybackMode.values().length];
            try {
                iArr2[EffectivePlaybackMode.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EffectivePlaybackMode.Tts.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final void PlayerErrorToast(ir.z1 z1Var, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(304568171);
        if ((i10 & 6) == 0) {
            if (qVar.h(z1Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z11 = false;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new s0(9);
                qVar.h0(L);
            }
            PlayerToastMessage playerToastMessage = (PlayerToastMessage) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L, qVar, (i11 & 14) | 48).getValue();
            c3.j d10 = c3.k.d(1100574180, true, new t0(playerToastMessage, lVar), qVar);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L2 = qVar.L();
            if (z10 || L2 == eVar) {
                L2 = new l(lVar, 22);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            if (playerToastMessage != null) {
                z11 = true;
            }
            ToastContainerKt.ToastContainer(d10, aVar, z11, qVar, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k0(z1Var, lVar, i10, 1);
        }
    }

    public static final PlayerToastMessage PlayerErrorToast$lambda$0$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getToastMessage();
    }

    public static final sn.z PlayerErrorToast$lambda$1(PlayerToastMessage playerToastMessage, ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        String str;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            i3.t P = r1.d.P(i3.q.f13017a, r1.u0.e(qVar).f29154l);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t I = r1.d.I(P, echoTheme.getSpacings(qVar, i11).getX4(), echoTheme.getSpacings(qVar, i11).getX6(), echoTheme.getSpacings(qVar, i11).getX4(), t2.u.P, 8);
            if (playerToastMessage instanceof PlayerToastMessage.PlayerError) {
                qVar.X(-574454024);
                PlayerToastMessage.PlayerError playerError = (PlayerToastMessage.PlayerError) playerToastMessage;
                PlayerError error = playerError.getError();
                if (error instanceof PlayerError.ApiError) {
                    qVar.X(1089849515);
                    qVar.p(false);
                    str = ((PlayerError.ApiError) playerError.getError()).getMessage();
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.Network.INSTANCE)) {
                    qVar.X(1089851313);
                    str = kj.c.R(qVar, R.string.player_error_offline);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.Unknown.INSTANCE)) {
                    qVar.X(1089854289);
                    str = kj.c.R(qVar, R.string.player_error_unknown);
                    qVar.p(false);
                } else if (error instanceof PlayerError.InsufficientCredits) {
                    qVar.X(-574146411);
                    str = ((PlayerError.InsufficientCredits) playerError.getError()).getMessage();
                    if (str == null) {
                        qVar.X(1089859603);
                        str = kj.c.R(qVar, R.string.ran_out_of_hours_error);
                    } else {
                        qVar.X(1089857805);
                    }
                    qVar.p(false);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.VoiceDesignNotAllowed.INSTANCE)) {
                    qVar.X(1089863109);
                    str = kj.c.R(qVar, R.string.play_error_voice_design_free_not_allowed);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.NotFoundError.INSTANCE)) {
                    qVar.X(1089866910);
                    str = kj.c.R(qVar, R.string.player_error_audio_file_not_found);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.DrmAuthenticationFailed.INSTANCE)) {
                    qVar.X(1089870804);
                    str = kj.c.R(qVar, R.string.player_error_drm_failed);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.DrmLicenseError.INSTANCE)) {
                    qVar.X(1089874132);
                    str = kj.c.R(qVar, R.string.player_error_drm_failed);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.DrmLicenseExpired.INSTANCE)) {
                    qVar.X(1089877533);
                    str = kj.c.R(qVar, R.string.player_error_drm_license_expired);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.DrmProvisioningError.INSTANCE)) {
                    qVar.X(1089881300);
                    str = kj.c.R(qVar, R.string.player_error_drm_failed);
                    qVar.p(false);
                } else if (error instanceof PlayerError.DrmDeviceNotSupported) {
                    qVar.X(1089884916);
                    str = kj.c.R(qVar, R.string.player_error_drm_failed);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.ContentNotLicensed.INSTANCE)) {
                    qVar.X(1089888350);
                    str = kj.c.R(qVar, R.string.player_error_content_not_licensed);
                    qVar.p(false);
                } else if (kotlin.jvm.internal.m.c(error, PlayerError.SubscriptionRequired.INSTANCE)) {
                    qVar.X(1089892159);
                    str = kj.c.R(qVar, R.string.player_error_subscription_required);
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(1089847882, qVar, false);
                }
                qVar.p(false);
            } else if (kotlin.jvm.internal.m.c(playerToastMessage, PlayerToastMessage.BookmarkNotSupported.INSTANCE)) {
                qVar.X(1089897597);
                str = kj.c.R(qVar, R.string.bookmark_not_supported_this_read);
                qVar.p(false);
            } else if (playerToastMessage == null) {
                qVar.X(-572828262);
                qVar.p(false);
                str = "";
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(1089845629, qVar, false);
            }
            String str2 = str;
            Integer valueOf = Integer.valueOf(io.elevenlabs.ui.R.drawable.warning_triangle_filled);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new v0(lVar, 5);
                qVar.h0(L);
            }
            EchoToastKt.EchoToast(str2, I, null, valueOf, (ho.a) L, null, qVar, 0, 36);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerErrorToast$lambda$1$0$0(ho.l lVar) {
        lVar.invoke(new y0(4));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerErrorToast$lambda$1$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onToastDismiss();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerErrorToast$lambda$2$0(ho.l lVar) {
        lVar.invoke(new y0(7));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerErrorToast$lambda$2$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onToastDismiss();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerErrorToast$lambda$3(ir.z1 z1Var, ho.l lVar, int i10, u2.m mVar, int i11) {
        PlayerErrorToast(z1Var, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlayerScreen(final Analytics.Event.PlayerActivationSource playerActivationSource, final String str, final ho.r rVar, final ho.a aVar, String str2, Integer num, boolean z6, boolean z10, final ho.l lVar, final ho.a aVar2, final ho.a aVar3, final ho.p pVar, final ho.l lVar2, final ho.p pVar2, final ho.l lVar3, final ho.l lVar4, final ho.a aVar4, final ho.a aVar5, final ho.a aVar6, PlayerViewModel playerViewModel, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final String str3;
        final boolean z11;
        final boolean z12;
        final PlayerViewModel playerViewModel2;
        u2.q qVar;
        final Integer num2;
        u2.r1 r10;
        String str4;
        Integer num3;
        boolean z13;
        PlayerViewModel playerViewModel3;
        boolean z14;
        q7.c cVar;
        int i18;
        Object playerScreenKt$PlayerScreen$2$1;
        String str5;
        int i19;
        u2.q qVar2;
        Integer num4;
        int i20;
        int i21;
        PlayerViewModel playerViewModel4;
        String str6;
        boolean z15;
        PlayerViewModel playerViewModel5;
        Object obj;
        int i22;
        final u2.z0 z0Var;
        String str7;
        Integer num5;
        u2.q qVar3;
        final u2.z0 z0Var2;
        boolean z16;
        playerActivationSource.getClass();
        str.getClass();
        rVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        pVar.getClass();
        lVar2.getClass();
        pVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(983313385);
        if ((i10 & 6) == 0) {
            i13 = (qVar4.d(playerActivationSource.ordinal()) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= qVar4.f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= qVar4.h(rVar) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        int i23 = i10 & 3072;
        int i24 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i23 == 0) {
            i13 |= qVar4.h(aVar) ? 2048 : 1024;
        }
        int i25 = i12 & 16;
        int i26 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i25 != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i13 |= qVar4.f(str2) ? 16384 : 8192;
            i14 = i12 & 32;
            if (i14 == 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                i13 |= qVar4.f(num) ? 131072 : 65536;
            }
            i15 = i12 & 64;
            if (i15 == 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                i13 |= qVar4.g(z6) ? 1048576 : 524288;
            }
            i16 = i12 & 128;
            if (i16 == 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                i13 |= qVar4.g(z10) ? 8388608 : 4194304;
            }
            if ((i10 & 100663296) == 0) {
                i13 |= qVar4.h(lVar) ? 67108864 : 33554432;
            }
            int i27 = 268435456;
            if ((i10 & 805306368) == 0) {
                i13 |= qVar4.h(aVar2) ? 536870912 : 268435456;
            }
            if ((i11 & 6) != 0) {
                i17 = i11 | (qVar4.h(aVar3) ? 4 : 2);
            } else {
                i17 = i11;
            }
            if ((i11 & 48) == 0) {
                i17 |= qVar4.h(pVar) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                i17 |= qVar4.h(lVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
            }
            if ((i11 & 3072) == 0) {
                if (qVar4.h(pVar2)) {
                    i24 = 2048;
                }
                i17 |= i24;
            }
            if ((i11 & 24576) == 0) {
                if (qVar4.h(lVar3)) {
                    i26 = 16384;
                }
                i17 |= i26;
            }
            if ((i11 & 196608) == 0) {
                i17 |= qVar4.h(lVar4) ? 131072 : 65536;
            }
            if ((i11 & 1572864) == 0) {
                i17 |= qVar4.h(aVar4) ? 1048576 : 524288;
            }
            if ((i11 & 12582912) == 0) {
                i17 |= qVar4.h(aVar5) ? 8388608 : 4194304;
            }
            if ((i11 & 100663296) == 0) {
                i17 |= qVar4.h(aVar6) ? 67108864 : 33554432;
            }
            if ((i11 & 805306368) == 0) {
                if ((i12 & 524288) == 0 && qVar4.h(playerViewModel)) {
                    i27 = 536870912;
                }
                i17 |= i27;
            }
            if (!qVar4.O(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 306783379) != 306783378)) {
                qVar4.T();
                if ((i10 & 1) == 0 || qVar4.y()) {
                    str4 = i25 != 0 ? null : str2;
                    num3 = i14 != 0 ? null : num;
                    boolean z17 = i15 != 0 ? false : z6;
                    z13 = i16 != 0 ? false : z10;
                    if ((i12 & 524288) != 0) {
                        androidx.lifecycle.r1 a10 = r7.a.a(qVar4);
                        if (a10 != null) {
                            pl.f o6 = tb.a.o(a10, qVar4);
                            if (a10 instanceof androidx.lifecycle.o) {
                                cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                            } else {
                                cVar = q7.a.f28123b;
                            }
                            i17 &= -1879048193;
                            playerViewModel3 = (PlayerViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(PlayerViewModel.class), a10, null, o6, cVar, qVar4);
                            z14 = z17;
                            str4 = str4;
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    } else {
                        playerViewModel3 = playerViewModel;
                        z14 = z17;
                    }
                } else {
                    qVar4.R();
                    if ((i12 & 524288) != 0) {
                        i17 &= -1879048193;
                    }
                    str4 = str2;
                    num3 = num;
                    z14 = z6;
                    z13 = z10;
                    playerViewModel3 = playerViewModel;
                }
                qVar4.q();
                ir.z1 stateFlow = playerViewModel3.getStateFlow();
                String str8 = str4;
                Object L = qVar4.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = new j0(25);
                    qVar4.h0(L);
                }
                boolean booleanValue = ((Boolean) ComposeExtensionsKt.selectAsState(stateFlow, (ho.l) L, qVar4, 48).getValue()).booleanValue();
                ir.z1 stateFlow2 = playerViewModel3.getStateFlow();
                Object L2 = qVar4.L();
                if (L2 == eVar) {
                    L2 = new j0(29);
                    qVar4.h0(L2);
                }
                boolean booleanValue2 = ((Boolean) ComposeExtensionsKt.selectAsState(stateFlow2, (ho.l) L2, qVar4, 48).getValue()).booleanValue();
                ir.z1 stateFlow3 = playerViewModel3.getStateFlow();
                Object L3 = qVar4.L();
                if (L3 == eVar) {
                    L3 = new s0(0);
                    qVar4.h0(L3);
                }
                SecureContentKt.SecureContent(booleanValue, booleanValue2, ((Boolean) ComposeExtensionsKt.selectAsState(stateFlow3, (ho.l) L3, qVar4, 48).getValue()).booleanValue(), qVar4, 0, 0);
                KeepScreenOnKt.KeepScreenOn(booleanValue, qVar4, 0);
                ir.z1 stateFlow4 = playerViewModel3.getStateFlow();
                Object L4 = qVar4.L();
                if (L4 == eVar) {
                    L4 = new s0(1);
                    qVar4.h0(L4);
                }
                Boolean bool = (Boolean) ComposeExtensionsKt.selectAsState(stateFlow4, (ho.l) L4, qVar4, 48).getValue();
                boolean booleanValue3 = bool.booleanValue();
                int i28 = i13 & 7168;
                boolean g10 = qVar4.g(booleanValue3) | (i28 == 2048);
                Object L5 = qVar4.L();
                if (g10 || L5 == eVar) {
                    i18 = i13;
                    L5 = new PlayerScreenKt$PlayerScreen$1$1(booleanValue3, aVar, null);
                    qVar4.h0(L5);
                } else {
                    i18 = i13;
                }
                u2.r.f((ho.p) L5, bool, qVar4);
                boolean h10 = qVar4.h(playerViewModel3) | ((i18 & 112) == 32) | ((i18 & 57344) == 16384) | ((i18 & 458752) == 131072) | ((i18 & 3670016) == 1048576);
                Object L6 = qVar4.L();
                if (h10 || L6 == eVar) {
                    str5 = str8;
                    i19 = i28;
                    qVar2 = qVar4;
                    num4 = num3;
                    i20 = i17;
                    i21 = 4;
                    playerScreenKt$PlayerScreen$2$1 = new PlayerScreenKt$PlayerScreen$2$1(playerViewModel3, str, str5, num4, z14, null);
                    playerViewModel4 = playerViewModel3;
                    str6 = str;
                    z15 = z14;
                    qVar2.h0(playerScreenKt$PlayerScreen$2$1);
                } else {
                    qVar2 = qVar4;
                    playerViewModel4 = playerViewModel3;
                    playerScreenKt$PlayerScreen$2$1 = L6;
                    z15 = z14;
                    i19 = i28;
                    num4 = num3;
                    i20 = i17;
                    i21 = 4;
                    str6 = str;
                    str5 = str8;
                }
                int i29 = i18 >> 3;
                u2.r.h(str6, str5, num4, (ho.p) playerScreenKt$PlayerScreen$2$1, qVar2);
                boolean h11 = qVar2.h(playerViewModel4) | ((i18 & 14) == i21);
                Object L7 = qVar2.L();
                if (h11 || L7 == eVar) {
                    L7 = new PlayerScreenKt$PlayerScreen$3$1(playerViewModel4, playerActivationSource, null);
                    qVar2.h0(L7);
                }
                u2.r.f((ho.p) L7, playerActivationSource, qVar2);
                ir.z1 stateFlow5 = playerViewModel4.getStateFlow();
                Object L8 = qVar2.L();
                if (L8 == eVar) {
                    L8 = new s0(2);
                    qVar2.h0(L8);
                }
                String str9 = (String) ComposeExtensionsKt.selectAsState(stateFlow5, (ho.l) L8, qVar2, 48).getValue();
                boolean f10 = ((i20 & 112) == 32) | qVar2.f(str9) | qVar2.h(playerViewModel4);
                Object L9 = qVar2.L();
                if (f10 || L9 == eVar) {
                    L9 = new PlayerScreenKt$PlayerScreen$4$1(str9, pVar, playerViewModel4, null);
                    qVar2.h0(L9);
                }
                u2.r.f((ho.p) L9, str9, qVar2);
                ir.z1 stateFlow6 = playerViewModel4.getStateFlow();
                Object L10 = qVar2.L();
                if (L10 == eVar) {
                    L10 = new s0(3);
                    qVar2.h0(L10);
                }
                String str10 = (String) ComposeExtensionsKt.selectAsState(stateFlow6, (ho.l) L10, qVar2, 48).getValue();
                boolean f11 = qVar2.f(str10) | ((i20 & 896) == 256) | qVar2.h(playerViewModel4);
                Object L11 = qVar2.L();
                if (f11 || L11 == eVar) {
                    L11 = new PlayerScreenKt$PlayerScreen$5$1(str10, lVar2, playerViewModel4, null);
                    qVar2.h0(L11);
                }
                u2.r.f((ho.p) L11, str10, qVar2);
                ir.z1 stateFlow7 = playerViewModel4.getStateFlow();
                Object L12 = qVar2.L();
                if (L12 == eVar) {
                    L12 = new s0(4);
                    qVar2.h0(L12);
                }
                Boolean bool2 = (Boolean) ComposeExtensionsKt.selectAsState(stateFlow7, (ho.l) L12, qVar2, 48).getValue();
                boolean booleanValue4 = bool2.booleanValue();
                ir.z1 stateFlow8 = playerViewModel4.getStateFlow();
                Object L13 = qVar2.L();
                if (L13 == eVar) {
                    L13 = new s0(5);
                    qVar2.h0(L13);
                }
                String str11 = (String) ComposeExtensionsKt.selectAsState(stateFlow8, (ho.l) L13, qVar2, 48).getValue();
                boolean g11 = ((i20 & 458752) == 131072) | qVar2.g(booleanValue4) | qVar2.h(playerViewModel4) | qVar2.f(str11);
                Object L14 = qVar2.L();
                if (g11 || L14 == eVar) {
                    PlayerViewModel playerViewModel6 = playerViewModel4;
                    L14 = new PlayerScreenKt$PlayerScreen$6$1(booleanValue4, playerViewModel6, lVar4, str11, null);
                    playerViewModel5 = playerViewModel6;
                    qVar2.h0(L14);
                } else {
                    playerViewModel5 = playerViewModel4;
                }
                u2.r.f((ho.p) L14, bool2, qVar2);
                ir.z1 stateFlow9 = playerViewModel5.getStateFlow();
                Object L15 = qVar2.L();
                if (L15 == eVar) {
                    L15 = new s0(6);
                    qVar2.h0(L15);
                }
                Boolean bool3 = (Boolean) ComposeExtensionsKt.selectAsState(stateFlow9, (ho.l) L15, qVar2, 48).getValue();
                boolean booleanValue5 = bool3.booleanValue();
                boolean g12 = qVar2.g(booleanValue5) | qVar2.h(playerViewModel5) | ((i20 & 3670016) == 1048576);
                Object L16 = qVar2.L();
                if (g12 || L16 == eVar) {
                    L16 = new PlayerScreenKt$PlayerScreen$7$1(booleanValue5, playerViewModel5, aVar4, null);
                    qVar2.h0(L16);
                }
                u2.r.f((ho.p) L16, bool3, qVar2);
                ir.z1 stateFlow10 = playerViewModel5.getStateFlow();
                Object L17 = qVar2.L();
                if (L17 == eVar) {
                    L17 = new s0(7);
                    qVar2.h0(L17);
                }
                Boolean bool4 = (Boolean) ComposeExtensionsKt.selectAsState(stateFlow10, (ho.l) L17, qVar2, 48).getValue();
                boolean booleanValue6 = bool4.booleanValue();
                boolean g13 = qVar2.g(booleanValue6) | qVar2.h(playerViewModel5) | ((29360128 & i20) == 8388608);
                Object L18 = qVar2.L();
                if (g13 || L18 == eVar) {
                    L18 = new PlayerScreenKt$PlayerScreen$8$1(booleanValue6, playerViewModel5, aVar5, null);
                    qVar2.h0(L18);
                }
                u2.r.f((ho.p) L18, bool4, qVar2);
                ir.z1 stateFlow11 = playerViewModel5.getStateFlow();
                Object L19 = qVar2.L();
                if (L19 == eVar) {
                    L19 = new j0(26);
                    qVar2.h0(L19);
                }
                Boolean bool5 = (Boolean) ComposeExtensionsKt.selectAsState(stateFlow11, (ho.l) L19, qVar2, 48).getValue();
                boolean booleanValue7 = bool5.booleanValue();
                boolean g14 = qVar2.g(booleanValue7) | qVar2.h(playerViewModel5) | ((i20 & 234881024) == 67108864);
                Object L20 = qVar2.L();
                if (g14 || L20 == eVar) {
                    L20 = new PlayerScreenKt$PlayerScreen$9$1(booleanValue7, playerViewModel5, aVar6, null);
                    qVar2.h0(L20);
                }
                u2.r.f((ho.p) L20, bool5, qVar2);
                ir.z1 stateFlow12 = playerViewModel5.getStateFlow();
                Object L21 = qVar2.L();
                if (L21 == eVar) {
                    L21 = new j0(27);
                    qVar2.h0(L21);
                }
                sn.k kVar = (sn.k) ComposeExtensionsKt.selectAsState(stateFlow12, (ho.l) L21, qVar2, 48).getValue();
                boolean f12 = qVar2.f(kVar) | ((i20 & 7168) == 2048) | qVar2.h(playerViewModel5);
                Object L22 = qVar2.L();
                if (f12 || L22 == eVar) {
                    L22 = new PlayerScreenKt$PlayerScreen$10$1(kVar, pVar2, playerViewModel5, null);
                    qVar2.h0(L22);
                }
                u2.r.f((ho.p) L22, kVar, qVar2);
                boolean h12 = qVar2.h(playerViewModel5);
                Object L23 = qVar2.L();
                if (h12 || L23 == eVar) {
                    L23 = new e2(1, playerViewModel5);
                    qVar2.h0(L23);
                }
                ComposeExtensionsKt.OnLifecycleEvent((ho.l) L23, qVar2, 0);
                Object L24 = qVar2.L();
                if (L24 == eVar) {
                    obj = null;
                    L24 = u2.r.A(null);
                    qVar2.h0(L24);
                } else {
                    obj = null;
                }
                u2.z0 z0Var3 = (u2.z0) L24;
                Object L25 = qVar2.L();
                if (L25 == eVar) {
                    L25 = u2.r.A(obj);
                    qVar2.h0(L25);
                }
                u2.z0 z0Var4 = (u2.z0) L25;
                String PlayerScreen$lambda$24 = PlayerScreen$lambda$24(z0Var3);
                if (PlayerScreen$lambda$24 == null) {
                    qVar2.X(-2078292827);
                    z16 = false;
                    qVar2.p(false);
                    str7 = str5;
                    num5 = num4;
                    i22 = 234881024;
                    qVar3 = qVar2;
                    z0Var2 = z0Var3;
                    z0Var = z0Var4;
                } else {
                    i22 = 234881024;
                    qVar2.X(-2078292826);
                    Object L26 = qVar2.L();
                    if (L26 == eVar) {
                        L26 = new l0(z0Var3, 1);
                        qVar2.h0(L26);
                    }
                    ho.a aVar7 = (ho.a) L26;
                    boolean f13 = qVar2.f(PlayerScreen$lambda$24);
                    Object L27 = qVar2.L();
                    if (f13 || L27 == eVar) {
                        L27 = new s(PlayerScreen$lambda$24, z0Var4, 2);
                        qVar2.h0(L27);
                    }
                    z0Var = z0Var4;
                    str7 = str5;
                    num5 = num4;
                    qVar3 = qVar2;
                    z0Var2 = z0Var3;
                    AddReadToCollectionScreenKt.AddReadToCollectionSheet(PlayerScreen$lambda$24, aVar7, (ho.a) L27, null, qVar3, 48, 8);
                    z16 = false;
                    qVar3.p(false);
                }
                if (PlayerScreen$lambda$27(z0Var) == null) {
                    qVar3.X(-2078018105);
                    qVar3.p(z16);
                } else {
                    qVar3.X(-2078018104);
                    ir.z1 stateFlow13 = playerViewModel5.getStateFlow();
                    Object L28 = qVar3.L();
                    if (L28 == eVar) {
                        L28 = new j0(28);
                        qVar3.h0(L28);
                    }
                    ReadMeta readMeta = (ReadMeta) ComposeExtensionsKt.selectAsState(stateFlow13, (ho.l) L28, qVar3, 48).getValue();
                    Object L29 = qVar3.L();
                    if (L29 == eVar) {
                        L29 = new l0(z0Var, 2);
                        qVar3.h0(L29);
                    }
                    ho.a aVar8 = (ho.a) L29;
                    Object L30 = qVar3.L();
                    if (L30 == eVar) {
                        final int i30 = 0;
                        L30 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.p0
                            @Override // ho.l
                            public final Object invoke(Object obj2) {
                                sn.z PlayerScreen$lambda$30$2$0;
                                sn.z PlayerScreen$lambda$32$0;
                                switch (i30) {
                                    case 0:
                                        PlayerScreen$lambda$30$2$0 = PlayerScreenKt.PlayerScreen$lambda$30$2$0(z0Var, (String) obj2);
                                        return PlayerScreen$lambda$30$2$0;
                                    default:
                                        PlayerScreen$lambda$32$0 = PlayerScreenKt.PlayerScreen$lambda$32$0(z0Var, (String) obj2);
                                        return PlayerScreen$lambda$32$0;
                                }
                            }
                        };
                        qVar3.h0(L30);
                    }
                    CreateCollectionSheetKt.CreateCollectionSheet(readMeta, aVar8, (ho.l) L30, null, qVar3, 432, 8);
                    qVar3.p(false);
                }
                ir.z1 stateFlow14 = playerViewModel5.getStateFlow();
                ir.i observeAssistantTrigger = playerViewModel5.observeAssistantTrigger();
                boolean h13 = qVar3.h(playerViewModel5);
                Object L31 = qVar3.L();
                if (h13 || L31 == eVar) {
                    L31 = new e2(2, playerViewModel5);
                    qVar3.h0(L31);
                }
                ho.l lVar5 = (ho.l) L31;
                Object L32 = qVar3.L();
                if (L32 == eVar) {
                    final int i31 = 1;
                    L32 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.p0
                        @Override // ho.l
                        public final Object invoke(Object obj2) {
                            sn.z PlayerScreen$lambda$30$2$0;
                            sn.z PlayerScreen$lambda$32$0;
                            switch (i31) {
                                case 0:
                                    PlayerScreen$lambda$30$2$0 = PlayerScreenKt.PlayerScreen$lambda$30$2$0(z0Var2, (String) obj2);
                                    return PlayerScreen$lambda$30$2$0;
                                default:
                                    PlayerScreen$lambda$32$0 = PlayerScreenKt.PlayerScreen$lambda$32$0(z0Var2, (String) obj2);
                                    return PlayerScreen$lambda$32$0;
                            }
                        }
                    };
                    qVar3.h0(L32);
                }
                ho.l lVar6 = (ho.l) L32;
                boolean h14 = qVar3.h(playerViewModel5);
                Object L33 = qVar3.L();
                if (h14 || L33 == eVar) {
                    L33 = new q0(playerViewModel5, 0);
                    qVar3.h0(L33);
                }
                u2.q qVar5 = qVar3;
                boolean z18 = z13;
                PlayerScreenUI(stateFlow14, rVar, lVar5, aVar, aVar2, aVar3, lVar, lVar6, lVar3, (ho.a) L33, observeAssistantTrigger, z18, qVar5, (i29 & 112) | 12582912 | i19 | ((i18 >> 15) & 57344) | ((i20 << 15) & 458752) | ((i18 >> 6) & 3670016) | ((i20 << 12) & i22), (i18 >> 18) & 112, 0);
                playerViewModel2 = playerViewModel5;
                z12 = z18;
                qVar = qVar5;
                str3 = str7;
                num2 = num5;
                z11 = z15;
            } else {
                qVar4.R();
                str3 = str2;
                z11 = z6;
                z12 = z10;
                playerViewModel2 = playerViewModel;
                qVar = qVar4;
                num2 = num;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.r0
                    @Override // ho.p
                    public final Object invoke(Object obj2, Object obj3) {
                        sn.z PlayerScreen$lambda$34;
                        int intValue = ((Integer) obj3).intValue();
                        PlayerScreen$lambda$34 = PlayerScreenKt.PlayerScreen$lambda$34(Analytics.Event.PlayerActivationSource.this, str, rVar, aVar, str3, num2, z11, z12, lVar, aVar2, aVar3, pVar, lVar2, pVar2, lVar3, lVar4, aVar4, aVar5, aVar6, playerViewModel2, i10, i11, i12, (u2.m) obj2, intValue);
                        return PlayerScreen$lambda$34;
                    }
                };
                return;
            }
            return;
        }
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        i15 = i12 & 64;
        if (i15 == 0) {
        }
        i16 = i12 & 128;
        if (i16 == 0) {
        }
        if ((i10 & 100663296) == 0) {
        }
        int i272 = 268435456;
        if ((i10 & 805306368) == 0) {
        }
        if ((i11 & 6) != 0) {
        }
        if ((i11 & 48) == 0) {
        }
        if ((i11 & 384) == 0) {
        }
        if ((i11 & 3072) == 0) {
        }
        if ((i11 & 24576) == 0) {
        }
        if ((i11 & 196608) == 0) {
        }
        if ((i11 & 1572864) == 0) {
        }
        if ((i11 & 12582912) == 0) {
        }
        if ((i11 & 100663296) == 0) {
        }
        if ((i11 & 805306368) == 0) {
        }
        if (!qVar4.O(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 306783379) != 306783378)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final boolean PlayerScreen$lambda$0$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getPlayer().isPlayingWhenReady();
    }

    public static final boolean PlayerScreen$lambda$1$0(PlayerState playerState) {
        playerState.getClass();
        Configuration configuration = playerState.getConfiguration();
        if (configuration == null || !configuration.getDebugMode()) {
            return false;
        }
        return true;
    }

    public static final boolean PlayerScreen$lambda$11$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateToPurchaseHours();
    }

    public static final String PlayerScreen$lambda$12$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getPurchaseHoursContext();
    }

    public static final boolean PlayerScreen$lambda$14$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateToVoiceDesignPaywall();
    }

    public static final boolean PlayerScreen$lambda$16$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateToPaywall();
    }

    public static final boolean PlayerScreen$lambda$18$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateToPlayerPreferences();
    }

    public static final boolean PlayerScreen$lambda$2$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.isScreenRecordingEnabled();
    }

    public static final sn.k PlayerScreen$lambda$20$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateToBookmarkShareDetails();
    }

    public static final sn.z PlayerScreen$lambda$22$0(PlayerViewModel playerViewModel, androidx.lifecycle.t tVar) {
        tVar.getClass();
        if (tVar == androidx.lifecycle.t.ON_RESUME) {
            playerViewModel.onResume();
        } else if (tVar == androidx.lifecycle.t.ON_PAUSE) {
            playerViewModel.onPause();
        }
        return sn.z.f31622a;
    }

    private static final String PlayerScreen$lambda$24(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final String PlayerScreen$lambda$27(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z PlayerScreen$lambda$29$0$0(u2.z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreen$lambda$29$1$0(String str, u2.z0 z0Var) {
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreen$lambda$3$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateBack();
    }

    public static final ReadMeta PlayerScreen$lambda$30$0$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getReadMeta();
        }
        return null;
    }

    public static final sn.z PlayerScreen$lambda$30$1$0(u2.z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreen$lambda$30$2$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreen$lambda$31$0(PlayerViewModel playerViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(playerViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreen$lambda$32$0(u2.z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreen$lambda$33$0(PlayerViewModel playerViewModel) {
        playerViewModel.onNavigateToPronunciationsList();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreen$lambda$34(Analytics.Event.PlayerActivationSource playerActivationSource, String str, ho.r rVar, ho.a aVar, String str2, Integer num, boolean z6, boolean z10, ho.l lVar, ho.a aVar2, ho.a aVar3, ho.p pVar, ho.l lVar2, ho.p pVar2, ho.l lVar3, ho.l lVar4, ho.a aVar4, ho.a aVar5, ho.a aVar6, PlayerViewModel playerViewModel, int i10, int i11, int i12, u2.m mVar, int i13) {
        PlayerScreen(playerActivationSource, str, rVar, aVar, str2, num, z6, z10, lVar, aVar2, aVar3, pVar, lVar2, pVar2, lVar3, lVar4, aVar4, aVar5, aVar6, playerViewModel, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final String PlayerScreen$lambda$7$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateToGenFMLoaderWithReadId();
    }

    public static final String PlayerScreen$lambda$9$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getNavigateToShareDetails();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PlayerScreenUI(final ir.z1 z1Var, ho.r rVar, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.a aVar4, ir.i iVar, boolean z6, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        ho.r rVar2;
        int i14;
        int i15;
        ho.l lVar5;
        int i16;
        int i17;
        ho.a aVar5;
        int i18;
        int i19;
        int i20;
        int i21;
        ho.a aVar6;
        int i22;
        int i23;
        int i24;
        int i25;
        ho.l lVar6;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z10;
        u2.q qVar;
        final ho.a aVar7;
        final ho.l lVar7;
        final ho.l lVar8;
        final ir.i iVar2;
        final ho.a aVar8;
        final ho.r rVar3;
        final ho.l lVar9;
        final ho.l lVar10;
        final ho.a aVar9;
        final ho.a aVar10;
        final boolean z11;
        u2.r1 r10;
        ho.r rVar4;
        ho.l lVar11;
        ho.a aVar11;
        ho.a aVar12;
        ho.l lVar12;
        ho.l lVar13;
        ho.l lVar14;
        ho.a aVar13;
        ir.i iVar3;
        final ho.r rVar5;
        ho.l lVar15;
        ho.a aVar14;
        final ho.a aVar15;
        boolean z12;
        ho.a aVar16;
        ho.a aVar17;
        ho.a aVar18;
        int i37;
        boolean z13;
        ir.i iVar4;
        ho.l lVar16;
        u2.z0 z0Var;
        u2.z0 z0Var2;
        boolean z14;
        boolean z15;
        boolean z16;
        ho.l lVar17;
        PlayerDisplayMode playerDisplayMode;
        final t1.z zVar;
        final u2.z0 z0Var3;
        final float f10;
        final s2 s2Var;
        final ho.a aVar19;
        final boolean z17;
        int i38;
        int i39;
        z1Var.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1242379164);
        if ((i10 & 6) == 0) {
            if (qVar2.h(z1Var)) {
                i39 = 4;
            } else {
                i39 = 2;
            }
            i13 = i39 | i10;
        } else {
            i13 = i10;
        }
        int i40 = i12 & 2;
        if (i40 != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            rVar2 = rVar;
            if (qVar2.h(rVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
            i15 = i12 & 4;
            if (i15 == 0) {
                i13 |= 384;
            } else if ((i10 & 384) == 0) {
                lVar5 = lVar;
                if (qVar2.h(lVar5)) {
                    i16 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i16 = 128;
                }
                i13 |= i16;
                i17 = i12 & 8;
                if (i17 != 0) {
                    i13 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    aVar5 = aVar;
                    if (qVar2.h(aVar5)) {
                        i18 = 2048;
                    } else {
                        i18 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i13 |= i18;
                    i19 = i12 & 16;
                    if (i19 == 0) {
                        i13 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (qVar2.h(aVar2)) {
                            i20 = 16384;
                        } else {
                            i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i13 |= i20;
                        i21 = i12 & 32;
                        if (i21 != 0) {
                            i13 |= 196608;
                            aVar6 = aVar3;
                        } else {
                            aVar6 = aVar3;
                            if ((i10 & 196608) == 0) {
                                if (qVar2.h(aVar6)) {
                                    i22 = 131072;
                                } else {
                                    i22 = 65536;
                                }
                                i13 |= i22;
                            }
                        }
                        i23 = i12 & 64;
                        if (i23 != 0) {
                            i13 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (qVar2.h(lVar2)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i13 |= i24;
                        }
                        i25 = i12 & 128;
                        if (i25 != 0) {
                            i13 |= 12582912;
                            lVar6 = lVar3;
                        } else {
                            lVar6 = lVar3;
                            if ((i10 & 12582912) == 0) {
                                if (qVar2.h(lVar6)) {
                                    i26 = 8388608;
                                } else {
                                    i26 = 4194304;
                                }
                                i13 |= i26;
                            }
                        }
                        i27 = i12 & RpcError.MAX_MESSAGE_BYTES;
                        if (i27 != 0) {
                            i13 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            i28 = i27;
                            if (qVar2.h(lVar4)) {
                                i29 = 67108864;
                            } else {
                                i29 = 33554432;
                            }
                            i13 |= i29;
                            i30 = i12 & 512;
                            if (i30 == 0) {
                                i13 |= 805306368;
                            } else if ((i10 & 805306368) == 0) {
                                i31 = i30;
                                if (qVar2.h(aVar4)) {
                                    i32 = 536870912;
                                } else {
                                    i32 = 268435456;
                                }
                                i13 |= i32;
                                if ((i11 & 6) == 0) {
                                    if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 && qVar2.h(iVar)) {
                                        i38 = 4;
                                        i33 = i11 | i38;
                                    }
                                    i38 = 2;
                                    i33 = i11 | i38;
                                } else {
                                    i33 = i11;
                                }
                                i34 = i12 & 2048;
                                if (i34 != 0) {
                                    i33 |= 48;
                                } else if ((i11 & 48) == 0) {
                                    i35 = i34;
                                    if (qVar2.g(z6)) {
                                        i36 = 32;
                                    } else {
                                        i36 = 16;
                                    }
                                    i33 |= i36;
                                    if ((i13 & 306783379) != 306783378 && (i33 & 19) == 18) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (!qVar2.O(i13 & 1, z10)) {
                                        qVar2.T();
                                        int i41 = i10 & 1;
                                        Object obj = u2.l.f33918a;
                                        if (i41 != 0 && !qVar2.y()) {
                                            qVar2.R();
                                            if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i33 &= -15;
                                            }
                                            aVar14 = aVar2;
                                            lVar15 = lVar4;
                                            aVar15 = aVar4;
                                            z12 = z6;
                                            rVar5 = rVar2;
                                            lVar11 = lVar5;
                                            aVar11 = aVar5;
                                            lVar12 = lVar2;
                                            iVar3 = iVar;
                                        } else {
                                            if (i40 != 0) {
                                                rVar4 = ComposableSingletons$PlayerScreenKt.INSTANCE.getLambda$260189678$app_productionRelease();
                                            } else {
                                                rVar4 = rVar2;
                                            }
                                            if (i15 != 0) {
                                                Object L = qVar2.L();
                                                if (L == obj) {
                                                    L = new s0(15);
                                                    qVar2.h0(L);
                                                }
                                                lVar11 = (ho.l) L;
                                            } else {
                                                lVar11 = lVar5;
                                            }
                                            if (i17 != 0) {
                                                Object L2 = qVar2.L();
                                                if (L2 == obj) {
                                                    L2 = new i(11);
                                                    qVar2.h0(L2);
                                                }
                                                aVar11 = (ho.a) L2;
                                            } else {
                                                aVar11 = aVar5;
                                            }
                                            if (i19 != 0) {
                                                Object L3 = qVar2.L();
                                                if (L3 == obj) {
                                                    L3 = new i(12);
                                                    qVar2.h0(L3);
                                                }
                                                aVar12 = (ho.a) L3;
                                            } else {
                                                aVar12 = aVar2;
                                            }
                                            if (i21 != 0) {
                                                Object L4 = qVar2.L();
                                                if (L4 == obj) {
                                                    L4 = new i(13);
                                                    qVar2.h0(L4);
                                                }
                                                aVar6 = (ho.a) L4;
                                            }
                                            if (i23 != 0) {
                                                Object L5 = qVar2.L();
                                                if (L5 == obj) {
                                                    L5 = new y0(24);
                                                    qVar2.h0(L5);
                                                }
                                                lVar12 = (ho.l) L5;
                                            } else {
                                                lVar12 = lVar2;
                                            }
                                            if (i25 != 0) {
                                                Object L6 = qVar2.L();
                                                if (L6 == obj) {
                                                    L6 = new y0(25);
                                                    qVar2.h0(L6);
                                                }
                                                lVar13 = (ho.l) L6;
                                            } else {
                                                lVar13 = lVar6;
                                            }
                                            if (i28 != 0) {
                                                Object L7 = qVar2.L();
                                                if (L7 == obj) {
                                                    L7 = new y0(26);
                                                    qVar2.h0(L7);
                                                }
                                                lVar14 = (ho.l) L7;
                                            } else {
                                                lVar14 = lVar4;
                                            }
                                            if (i31 != 0) {
                                                Object L8 = qVar2.L();
                                                if (L8 == obj) {
                                                    L8 = new i(14);
                                                    qVar2.h0(L8);
                                                }
                                                aVar13 = (ho.a) L8;
                                            } else {
                                                aVar13 = aVar4;
                                            }
                                            if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                i33 &= -15;
                                                iVar3 = ir.h.f17943a;
                                            } else {
                                                iVar3 = iVar;
                                            }
                                            ho.a aVar20 = aVar13;
                                            rVar5 = rVar4;
                                            lVar15 = lVar14;
                                            lVar6 = lVar13;
                                            aVar14 = aVar12;
                                            aVar15 = aVar20;
                                            if (i35 != 0) {
                                                z12 = false;
                                            } else {
                                                z12 = z6;
                                            }
                                        }
                                        qVar2.q();
                                        long rememberWindowContainerSize = ComposeExtensionsKt.rememberWindowContainerSize(qVar2, 0);
                                        final ho.l lVar18 = lVar15;
                                        Object[] objArr = new Object[0];
                                        Object L9 = qVar2.L();
                                        if (L9 == obj) {
                                            L9 = new i(15);
                                            qVar2.h0(L9);
                                        }
                                        final u2.x0 x0Var = (u2.x0) f3.m.e(objArr, (ho.a) L9, qVar2, 48);
                                        final float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(PlayerScreenUI$lambda$9(x0Var), (u2.m) qVar2, 0);
                                        Object L10 = qVar2.L();
                                        if (L10 == obj) {
                                            L10 = com.google.android.gms.internal.play_billing.b.t(300, qVar2);
                                        }
                                        final u2.x0 x0Var2 = (u2.x0) L10;
                                        float rememberPxToDp2 = ComposeExtensionsKt.rememberPxToDp(PlayerScreenUI$lambda$12(x0Var2), (u2.m) qVar2, 0);
                                        Object L11 = qVar2.L();
                                        if (L11 == obj) {
                                            L11 = new y0(27);
                                            qVar2.h0(L11);
                                        }
                                        int i42 = (i13 & 14) | 48;
                                        final int intValue = ((Number) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L11, qVar2, i42).getValue()).intValue();
                                        Object L12 = qVar2.L();
                                        ho.l lVar19 = lVar11;
                                        if (L12 == obj) {
                                            L12 = new s0(22);
                                            qVar2.h0(L12);
                                        }
                                        PlayerDisplayMode playerDisplayMode2 = (PlayerDisplayMode) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L12, qVar2, i42).getValue();
                                        if (playerDisplayMode2 == null) {
                                            playerDisplayMode2 = PlayerDisplayMode.Text;
                                        }
                                        Object L13 = qVar2.L();
                                        if (L13 == obj) {
                                            aVar16 = aVar6;
                                            L13 = new s0(27);
                                            qVar2.h0(L13);
                                        } else {
                                            aVar16 = aVar6;
                                        }
                                        final UserConfig.PlayerConfig playerConfig = (UserConfig.PlayerConfig) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L13, qVar2, i42).getValue();
                                        Object L14 = qVar2.L();
                                        if (L14 == obj) {
                                            L14 = new y0(3);
                                            qVar2.h0(L14);
                                        }
                                        final boolean booleanValue = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L14, qVar2, i42).getValue()).booleanValue();
                                        Object L15 = qVar2.L();
                                        if (L15 == obj) {
                                            L15 = u2.r.A(Boolean.FALSE);
                                            qVar2.h0(L15);
                                        }
                                        final u2.z0 z0Var4 = (u2.z0) L15;
                                        Object L16 = qVar2.L();
                                        if (L16 == obj) {
                                            L16 = u2.r.A(Boolean.FALSE);
                                            qVar2.h0(L16);
                                        }
                                        final u2.z0 z0Var5 = (u2.z0) L16;
                                        Object L17 = qVar2.L();
                                        if (L17 == obj) {
                                            L17 = u2.r.A(Boolean.FALSE);
                                            qVar2.h0(L17);
                                        }
                                        final u2.z0 z0Var6 = (u2.z0) L17;
                                        Object[] objArr2 = new Object[0];
                                        Object L18 = qVar2.L();
                                        if (L18 == obj) {
                                            aVar17 = aVar14;
                                            L18 = new i(9);
                                            qVar2.h0(L18);
                                        } else {
                                            aVar17 = aVar14;
                                        }
                                        u2.z0 z0Var7 = (u2.z0) f3.m.e(objArr2, (ho.a) L18, qVar2, 48);
                                        Object[] objArr3 = new Object[0];
                                        Object L19 = qVar2.L();
                                        if (L19 == obj) {
                                            aVar18 = aVar11;
                                            L19 = new i(10);
                                            qVar2.h0(L19);
                                        } else {
                                            aVar18 = aVar11;
                                        }
                                        u2.z0 z0Var8 = (u2.z0) f3.m.e(objArr3, (ho.a) L19, qVar2, 48);
                                        boolean c5 = qVar2.c(h5.h.a(rememberWindowContainerSize));
                                        Object L20 = qVar2.L();
                                        if (c5 || L20 == obj) {
                                            if (h5.f.a(h5.h.a(rememberWindowContainerSize), ScreenHeightBreakpoints.INSTANCE.m1983getCompactD9Ej5fM()) <= 0) {
                                                i37 = 40;
                                            } else {
                                                i37 = 80;
                                            }
                                            L20 = new h5.f(i37);
                                            qVar2.h0(L20);
                                        }
                                        final float f11 = ((h5.f) L20).f12083a;
                                        boolean c10 = qVar2.c(rememberPxToDp2) | qVar2.c(f11);
                                        Object L21 = qVar2.L();
                                        if (c10 || L21 == obj) {
                                            h5.f fVar = new h5.f(rememberPxToDp2 + f11);
                                            qVar2.h0(fVar);
                                            L21 = fVar;
                                        }
                                        float f12 = ((h5.f) L21).f12083a;
                                        boolean h10 = qVar2.h(iVar3) | qVar2.f(z0Var7);
                                        int i43 = i13 & 896;
                                        if (i43 == 256) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        boolean h11 = z13 | h10 | qVar2.h(z1Var) | qVar2.f(z0Var8);
                                        Object L22 = qVar2.L();
                                        if (!h11 && L22 != obj) {
                                            iVar4 = iVar3;
                                            z0Var2 = z0Var8;
                                            z0Var = z0Var7;
                                            lVar16 = lVar19;
                                        } else {
                                            ir.i iVar5 = iVar3;
                                            L22 = new PlayerScreenKt$PlayerScreenUI$9$1(iVar5, lVar19, z1Var, z0Var7, z0Var8, null);
                                            iVar4 = iVar5;
                                            lVar16 = lVar19;
                                            z0Var = z0Var7;
                                            z0Var2 = z0Var8;
                                            qVar2.h0(L22);
                                        }
                                        u2.r.f((ho.p) L22, iVar4, qVar2);
                                        Boolean valueOf = Boolean.valueOf(z12);
                                        ir.i iVar6 = iVar4;
                                        ho.l lVar20 = lVar16;
                                        if ((i33 & 112) == 32) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        boolean f13 = z14 | qVar2.f(z0Var);
                                        if (i43 == 256) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        boolean h12 = f13 | z15 | qVar2.h(z1Var) | qVar2.f(z0Var2);
                                        Object L23 = qVar2.L();
                                        if (!h12 && L23 != obj) {
                                            lVar17 = lVar20;
                                            z16 = z12;
                                        } else {
                                            boolean z18 = z12;
                                            L23 = new PlayerScreenKt$PlayerScreenUI$10$1(z18, lVar20, z1Var, z0Var, z0Var2, null);
                                            z16 = z18;
                                            lVar17 = lVar20;
                                            qVar2.h0(L23);
                                        }
                                        u2.r.f((ho.p) L23, valueOf, qVar2);
                                        t1.z a10 = t1.b0.a(0, qVar2, 3);
                                        Object L24 = qVar2.L();
                                        if (L24 == obj) {
                                            L24 = u2.r.s(new q0(a10, 1));
                                            qVar2.h0(L24);
                                        }
                                        s2 s2Var2 = (s2) L24;
                                        final ho.l lVar21 = lVar17;
                                        boolean d10 = qVar2.d(playerDisplayMode2.ordinal()) | qVar2.g(PlayerScreenUI$lambda$38(s2Var2));
                                        Object L25 = qVar2.L();
                                        if (d10 || L25 == obj) {
                                            L25 = u2.r.s(new s(playerDisplayMode2, s2Var2, 4));
                                            qVar2.h0(L25);
                                        }
                                        s2 s2Var3 = (s2) L25;
                                        s2 collectIsTalkbackEnabledAsState = AccessibilityExtensionsKt.collectIsTalkbackEnabledAsState((Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b), qVar2, 0);
                                        Object L26 = qVar2.L();
                                        if (L26 == obj) {
                                            playerDisplayMode = playerDisplayMode2;
                                            L26 = new y0(21);
                                            qVar2.h0(L26);
                                        } else {
                                            playerDisplayMode = playerDisplayMode2;
                                        }
                                        if (!((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L26, qVar2, i42).getValue()).booleanValue() && !PlayerScreenUI$lambda$41(collectIsTalkbackEnabledAsState)) {
                                            zVar = a10;
                                            z0Var3 = z0Var2;
                                            f10 = f12;
                                            s2Var = s2Var3;
                                            aVar19 = aVar16;
                                            z17 = false;
                                        } else {
                                            zVar = a10;
                                            z0Var3 = z0Var2;
                                            f10 = f12;
                                            s2Var = s2Var3;
                                            aVar19 = aVar16;
                                            z17 = true;
                                        }
                                        Object L27 = qVar2.L();
                                        if (L27 == obj) {
                                            L27 = new y0(22);
                                            qVar2.h0(L27);
                                        }
                                        final boolean booleanValue2 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L27, qVar2, i42).getValue()).booleanValue();
                                        WeakHashMap weakHashMap = c3.f29142x;
                                        r1.o1 o1Var = new r1.o1(r1.u0.e(qVar2).f29154l, r1.d.f29175k);
                                        qVar = qVar2;
                                        final u2.z0 z0Var9 = z0Var;
                                        final ho.l lVar22 = lVar6;
                                        final ho.l lVar23 = lVar12;
                                        final ho.a aVar21 = aVar17;
                                        final ho.a aVar22 = aVar18;
                                        final PlayerDisplayMode playerDisplayMode3 = playerDisplayMode;
                                        ho.q qVar3 = new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.z0
                                            @Override // ho.q
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                sn.z PlayerScreenUI$lambda$44;
                                                int intValue2 = ((Integer) obj4).intValue();
                                                PlayerScreenUI$lambda$44 = PlayerScreenKt.PlayerScreenUI$lambda$44(ir.z1.this, lVar21, z0Var9, z0Var3, playerDisplayMode3, booleanValue2, lVar23, lVar22, aVar21, aVar19, aVar15, lVar18, booleanValue, rVar5, f10, intValue, playerConfig, rememberPxToDp, z17, zVar, x0Var, aVar22, s2Var, z0Var4, z0Var5, z0Var6, f11, x0Var2, (r1.z1) obj2, (u2.m) obj3, intValue2);
                                                return PlayerScreenUI$lambda$44;
                                            }
                                        };
                                        ho.a aVar23 = aVar19;
                                        k5.a(null, null, null, null, null, 0, 0L, 0L, o1Var, c3.k.d(-1484233677, true, qVar3, qVar), qVar, 805306368, 255);
                                        lVar10 = lVar21;
                                        lVar7 = lVar23;
                                        lVar9 = lVar22;
                                        aVar10 = aVar15;
                                        aVar8 = aVar23;
                                        lVar8 = lVar18;
                                        rVar3 = rVar5;
                                        iVar2 = iVar6;
                                        aVar7 = aVar17;
                                        aVar9 = aVar18;
                                        z11 = z16;
                                    } else {
                                        qVar = qVar2;
                                        qVar.R();
                                        aVar7 = aVar2;
                                        lVar7 = lVar2;
                                        lVar8 = lVar4;
                                        iVar2 = iVar;
                                        aVar8 = aVar6;
                                        rVar3 = rVar2;
                                        lVar9 = lVar6;
                                        lVar10 = lVar5;
                                        aVar9 = aVar5;
                                        aVar10 = aVar4;
                                        z11 = z6;
                                    }
                                    r10 = qVar.r();
                                    if (r10 == null) {
                                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.a1
                                            @Override // ho.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                sn.z PlayerScreenUI$lambda$45;
                                                int intValue2 = ((Integer) obj3).intValue();
                                                PlayerScreenUI$lambda$45 = PlayerScreenKt.PlayerScreenUI$lambda$45(ir.z1.this, rVar3, lVar10, aVar9, aVar7, aVar8, lVar7, lVar9, lVar8, aVar10, iVar2, z11, i10, i11, i12, (u2.m) obj2, intValue2);
                                                return PlayerScreenUI$lambda$45;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                                i35 = i34;
                                if ((i13 & 306783379) != 306783378) {
                                }
                                z10 = true;
                                if (!qVar2.O(i13 & 1, z10)) {
                                }
                                r10 = qVar.r();
                                if (r10 == null) {
                                }
                            }
                            i31 = i30;
                            if ((i11 & 6) == 0) {
                            }
                            i34 = i12 & 2048;
                            if (i34 != 0) {
                            }
                            i35 = i34;
                            if ((i13 & 306783379) != 306783378) {
                            }
                            z10 = true;
                            if (!qVar2.O(i13 & 1, z10)) {
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                            }
                        }
                        i28 = i27;
                        i30 = i12 & 512;
                        if (i30 == 0) {
                        }
                        i31 = i30;
                        if ((i11 & 6) == 0) {
                        }
                        i34 = i12 & 2048;
                        if (i34 != 0) {
                        }
                        i35 = i34;
                        if ((i13 & 306783379) != 306783378) {
                        }
                        z10 = true;
                        if (!qVar2.O(i13 & 1, z10)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    i21 = i12 & 32;
                    if (i21 != 0) {
                    }
                    i23 = i12 & 64;
                    if (i23 != 0) {
                    }
                    i25 = i12 & 128;
                    if (i25 != 0) {
                    }
                    i27 = i12 & RpcError.MAX_MESSAGE_BYTES;
                    if (i27 != 0) {
                    }
                    i28 = i27;
                    i30 = i12 & 512;
                    if (i30 == 0) {
                    }
                    i31 = i30;
                    if ((i11 & 6) == 0) {
                    }
                    i34 = i12 & 2048;
                    if (i34 != 0) {
                    }
                    i35 = i34;
                    if ((i13 & 306783379) != 306783378) {
                    }
                    z10 = true;
                    if (!qVar2.O(i13 & 1, z10)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                aVar5 = aVar;
                i19 = i12 & 16;
                if (i19 == 0) {
                }
                i21 = i12 & 32;
                if (i21 != 0) {
                }
                i23 = i12 & 64;
                if (i23 != 0) {
                }
                i25 = i12 & 128;
                if (i25 != 0) {
                }
                i27 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i27 != 0) {
                }
                i28 = i27;
                i30 = i12 & 512;
                if (i30 == 0) {
                }
                i31 = i30;
                if ((i11 & 6) == 0) {
                }
                i34 = i12 & 2048;
                if (i34 != 0) {
                }
                i35 = i34;
                if ((i13 & 306783379) != 306783378) {
                }
                z10 = true;
                if (!qVar2.O(i13 & 1, z10)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar5 = lVar;
            i17 = i12 & 8;
            if (i17 != 0) {
            }
            aVar5 = aVar;
            i19 = i12 & 16;
            if (i19 == 0) {
            }
            i21 = i12 & 32;
            if (i21 != 0) {
            }
            i23 = i12 & 64;
            if (i23 != 0) {
            }
            i25 = i12 & 128;
            if (i25 != 0) {
            }
            i27 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i27 != 0) {
            }
            i28 = i27;
            i30 = i12 & 512;
            if (i30 == 0) {
            }
            i31 = i30;
            if ((i11 & 6) == 0) {
            }
            i34 = i12 & 2048;
            if (i34 != 0) {
            }
            i35 = i34;
            if ((i13 & 306783379) != 306783378) {
            }
            z10 = true;
            if (!qVar2.O(i13 & 1, z10)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        rVar2 = rVar;
        i15 = i12 & 4;
        if (i15 == 0) {
        }
        lVar5 = lVar;
        i17 = i12 & 8;
        if (i17 != 0) {
        }
        aVar5 = aVar;
        i19 = i12 & 16;
        if (i19 == 0) {
        }
        i21 = i12 & 32;
        if (i21 != 0) {
        }
        i23 = i12 & 64;
        if (i23 != 0) {
        }
        i25 = i12 & 128;
        if (i25 != 0) {
        }
        i27 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i27 != 0) {
        }
        i28 = i27;
        i30 = i12 & 512;
        if (i30 == 0) {
        }
        i31 = i30;
        if ((i11 & 6) == 0) {
        }
        i34 = i12 & 2048;
        if (i34 != 0) {
        }
        i35 = i34;
        if ((i13 & 306783379) != 306783378) {
        }
        z10 = true;
        if (!qVar2.O(i13 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z PlayerScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    private static final void PlayerScreenUI$lambda$10(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final int PlayerScreenUI$lambda$12(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void PlayerScreenUI$lambda$13(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final int PlayerScreenUI$lambda$14$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getHtmlLoadingProgress();
    }

    public static final PlayerDisplayMode PlayerScreenUI$lambda$15$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getDisplayMode();
    }

    public static final UserConfig.PlayerConfig PlayerScreenUI$lambda$16$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getPlayerConfig();
    }

    public static final boolean PlayerScreenUI$lambda$17$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowQueue();
    }

    private static final boolean PlayerScreenUI$lambda$19(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void PlayerScreenUI$lambda$20(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final boolean PlayerScreenUI$lambda$22(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void PlayerScreenUI$lambda$23(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final boolean PlayerScreenUI$lambda$25(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void PlayerScreenUI$lambda$26(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final u2.z0 PlayerScreenUI$lambda$27$0() {
        return u2.r.A(Boolean.FALSE);
    }

    public static final boolean PlayerScreenUI$lambda$28(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void PlayerScreenUI$lambda$29(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final u2.z0 PlayerScreenUI$lambda$30$0() {
        return u2.r.A(Boolean.FALSE);
    }

    private static final boolean PlayerScreenUI$lambda$31(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void PlayerScreenUI$lambda$32(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final boolean PlayerScreenUI$lambda$37$0(t1.z zVar) {
        if (zVar.f31876e.f31852b.h() > 0) {
            return true;
        }
        return false;
    }

    private static final boolean PlayerScreenUI$lambda$38(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final boolean PlayerScreenUI$lambda$39$0(PlayerDisplayMode playerDisplayMode, s2 s2Var) {
        if (PlayerScreenUI$lambda$38(s2Var) && playerDisplayMode != PlayerDisplayMode.Audio) {
            return true;
        }
        return false;
    }

    public static final sn.z PlayerScreenUI$lambda$4$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    private static final boolean PlayerScreenUI$lambda$40(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    private static final boolean PlayerScreenUI$lambda$41(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final boolean PlayerScreenUI$lambda$42$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShouldShowControls();
    }

    public static final boolean PlayerScreenUI$lambda$43$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowShareButton();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x071d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sn.z PlayerScreenUI$lambda$44(final ir.z1 z1Var, final ho.l lVar, final u2.z0 z0Var, final u2.z0 z0Var2, PlayerDisplayMode playerDisplayMode, final boolean z6, ho.l lVar2, ho.l lVar3, final ho.a aVar, final ho.a aVar2, ho.a aVar3, ho.l lVar4, final boolean z10, ho.r rVar, final float f10, int i10, final UserConfig.PlayerConfig playerConfig, final float f11, boolean z11, final t1.z zVar, u2.x0 x0Var, ho.a aVar4, s2 s2Var, u2.z0 z0Var3, final u2.z0 z0Var4, final u2.z0 z0Var5, float f12, final u2.x0 x0Var2, r1.z1 z1Var2, u2.m mVar, int i11) {
        int i12;
        h4.d dVar;
        h4.e eVar;
        h4.e eVar2;
        i3.l lVar5;
        int i13;
        Object obj;
        i3.q qVar;
        u2.q qVar2;
        h4.e eVar3;
        h4.e eVar4;
        p3.w0 w0Var;
        int i14;
        h4.d dVar2;
        h4.e eVar5;
        boolean z12;
        ir.z1 z1Var3;
        i3.l lVar6;
        h4.e eVar6;
        Object L;
        boolean booleanValue;
        Object L2;
        p3.w0 w0Var2;
        int i15;
        EchoTheme echoTheme;
        int i16;
        i3.l lVar7;
        h4.d dVar3;
        h4.e eVar7;
        h4.e eVar8;
        h4.e eVar9;
        i3.q qVar3;
        h4.e eVar10;
        i3.l lVar8;
        h4.e eVar11;
        h4.e eVar12;
        h4.d dVar4;
        i3.q qVar4;
        int i17;
        final ho.l lVar9;
        ir.z1 z1Var4;
        h4.e eVar13;
        PlayerDisplayMode playerDisplayMode2;
        u2.q qVar5;
        boolean z13;
        final float f13;
        u2.q qVar6;
        Object obj2;
        boolean z14;
        Object L3;
        ho.a aVar5;
        ho.l lVar10;
        char c5;
        boolean z15;
        final u2.z0 z0Var6;
        ho.l lVar11;
        i3.l lVar12 = i3.d.Z;
        z1Var2.getClass();
        if ((i11 & 6) == 0) {
            i12 = i11 | (((u2.q) mVar).f(z1Var2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        u2.q qVar7 = (u2.q) mVar;
        if (qVar7.O(i12 & 1, (i12 & 19) != 18)) {
            i3.q qVar8 = i3.q.f13017a;
            i3.t d10 = p2.d(r1.d.D(qVar8, z1Var2), 1.0f);
            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
            int i18 = EchoTheme.$stable;
            EchoThemeColors.Background background = echoTheme2.getColors(qVar7, i18).getBackground();
            int i19 = EchoThemeColors.Background.$stable;
            long primary = background.getPrimary(qVar7, i19);
            p3.w0 w0Var3 = p3.h0.f26395b;
            i3.t h10 = l1.n.h(d10, primary, w0Var3);
            i3.l lVar13 = i3.d.f12997a;
            f4.f1 d11 = r1.p.d(lVar13, false);
            int hashCode = Long.hashCode(qVar7.T);
            c3.o l4 = qVar7.l();
            i3.t c10 = i3.a.c(h10, qVar7);
            h4.h.f11920i.getClass();
            ho.a aVar6 = h4.g.f11903b;
            qVar7.b0();
            if (qVar7.S) {
                qVar7.k(aVar6);
            } else {
                qVar7.k0();
            }
            h4.e eVar14 = h4.g.f11907f;
            u2.r.J(eVar14, d11, qVar7);
            h4.e eVar15 = h4.g.f11906e;
            u2.r.J(eVar15, l4, qVar7);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar16 = h4.g.f11908g;
            u2.r.y(qVar7, valueOf, eVar16);
            h4.d dVar5 = h4.g.f11909h;
            u2.r.F(dVar5, qVar7);
            h4.e eVar17 = h4.g.f11905d;
            u2.r.J(eVar17, c10, qVar7);
            Object obj3 = u2.l.f33918a;
            if (z10) {
                qVar7.X(-566724626);
                Object fVar = new h5.f(f10);
                lVar5 = lVar13;
                Object L4 = qVar7.L();
                if (L4 == obj3) {
                    eVar2 = eVar17;
                    L4 = new b1(6);
                    qVar7.h0(L4);
                } else {
                    eVar2 = eVar17;
                }
                dVar = dVar5;
                eVar = eVar16;
                rVar.invoke(fVar, ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L4, qVar7, 48).getValue(), qVar7, 0);
                qVar7.p(false);
            } else {
                dVar = dVar5;
                eVar = eVar16;
                eVar2 = eVar17;
                lVar5 = lVar13;
                if (playerDisplayMode == PlayerDisplayMode.Audio) {
                    qVar7.X(-565790193);
                    Object L5 = qVar7.L();
                    if (L5 == obj3) {
                        L5 = new b1(11);
                        qVar7.h0(L5);
                    }
                    AudioOnlyPlayerUiKt.m1467AudioOnlyPlayerUirAjV9yQ(FlowExtensionsKt.mapState(z1Var, (ho.l) L5), f10, qVar7, 0, 0);
                    qVar7.p(false);
                } else {
                    qVar7.X(-565393548);
                    if (i10 == 100 && playerConfig != null) {
                        qVar7.X(-565324914);
                        i3.t d12 = p2.d(qVar8, 1.0f);
                        Object L6 = qVar7.L();
                        if (L6 == obj3) {
                            L6 = new b1(22);
                            qVar7.h0(L6);
                        }
                        i3.t c11 = p4.q.c(d12, true, (ho.l) L6);
                        Object L7 = qVar7.L();
                        if (L7 == obj3) {
                            L7 = new b1(25);
                            qVar7.h0(L7);
                        }
                        i3.t b10 = p4.q.b(c11, (ho.l) L7);
                        f4.f1 d13 = r1.p.d(lVar12, false);
                        int hashCode2 = Long.hashCode(qVar7.T);
                        c3.o l7 = qVar7.l();
                        i3.t c12 = i3.a.c(b10, qVar7);
                        qVar7.b0();
                        if (qVar7.S) {
                            qVar7.k(aVar6);
                        } else {
                            qVar7.k0();
                        }
                        u2.r.J(eVar14, d13, qVar7);
                        u2.r.J(eVar15, l7, qVar7);
                        defpackage.f.u(hashCode2, qVar7, eVar, qVar7, dVar);
                        u2.r.J(eVar2, c12, qVar7);
                        Object L8 = qVar7.L();
                        if (L8 == obj3) {
                            L8 = new b1(26);
                            qVar7.h0(L8);
                        }
                        boolean booleanValue2 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L8, qVar7, 48).getValue()).booleanValue();
                        obj = obj3;
                        lVar6 = lVar12;
                        w0Var = w0Var3;
                        qVar = qVar8;
                        i13 = i18;
                        eVar3 = eVar15;
                        eVar6 = eVar2;
                        eVar5 = eVar;
                        dVar2 = dVar;
                        i14 = i19;
                        qVar2 = qVar7;
                        eVar4 = eVar14;
                        z1Var3 = z1Var;
                        TextSelectionMenuConfigKt.ProvideTextSelectionMenuConfig(PlayerTextSelectionConfigKt.rememberTextSelectionMenuConfig(lVar, kj.c.R(qVar7, R.string.pronunciations_add_screen_title), kj.c.R(qVar7, R.string.customize_actions_bookmark), booleanValue2, qVar7, 0), c3.k.d(-1791219330, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.h1
                            @Override // ho.p
                            public final Object invoke(Object obj4, Object obj5) {
                                sn.z PlayerScreenUI$lambda$44$0$4$1;
                                int intValue = ((Integer) obj5).intValue();
                                PlayerScreenUI$lambda$44$0$4$1 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1(ir.z1.this, playerConfig, f11, f10, lVar, zVar, z6, (u2.m) obj4, intValue);
                                return PlayerScreenUI$lambda$44$0$4$1;
                            }
                        }, qVar2), qVar2, TextSelectionMenuConfig.$stable | 48);
                        qVar2.p(true);
                        z12 = false;
                        qVar2.p(false);
                    } else {
                        i13 = i18;
                        obj = obj3;
                        qVar = qVar8;
                        qVar2 = qVar7;
                        eVar3 = eVar15;
                        eVar4 = eVar14;
                        w0Var = w0Var3;
                        i14 = i19;
                        dVar2 = dVar;
                        eVar5 = eVar;
                        z12 = false;
                        z1Var3 = z1Var;
                        lVar6 = lVar12;
                        eVar6 = eVar2;
                        qVar2.X(-560766891);
                        qVar2.p(false);
                    }
                    qVar2.p(z12);
                    WeakHashMap weakHashMap = c3.f29142x;
                    r1.d.g(r1.d.N(r1.u0.e(qVar2).f29145c), qVar2);
                    L = qVar2.L();
                    if (L == obj) {
                        L = new b1(27);
                        qVar2.h0(L);
                    }
                    booleanValue = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var3, (ho.l) L, qVar2, 48).getValue()).booleanValue();
                    L2 = qVar2.L();
                    if (L2 == obj) {
                        L2 = new b1(28);
                        qVar2.h0(L2);
                    }
                    if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var3, (ho.l) L2, qVar2, 48).getValue()).booleanValue() || i10 <= 0) {
                        h4.e eVar18 = eVar5;
                        h4.d dVar6 = dVar2;
                        h4.e eVar19 = eVar6;
                        h4.e eVar20 = eVar3;
                        h4.e eVar21 = eVar4;
                        if (!booleanValue) {
                            qVar2.X(-559896287);
                            i3.t d14 = p2.d(qVar, 1.0f);
                            w0Var2 = w0Var;
                            i15 = i14;
                            echoTheme = echoTheme2;
                            i16 = i13;
                            eVar9 = eVar21;
                            lVar7 = lVar5;
                            eVar7 = eVar20;
                            dVar3 = dVar6;
                            eVar8 = eVar18;
                            qVar3 = qVar;
                            eVar10 = eVar19;
                            i3.t I = r1.d.I(d14, t2.u.P, f11, t2.u.P, f10, 5);
                            f4.f1 d15 = r1.p.d(lVar7, false);
                            int hashCode3 = Long.hashCode(qVar2.T);
                            c3.o l10 = qVar2.l();
                            i3.t c13 = i3.a.c(I, qVar2);
                            qVar2.b0();
                            if (qVar2.S) {
                                qVar2.k(aVar6);
                            } else {
                                qVar2.k0();
                            }
                            u2.r.J(eVar9, d15, qVar2);
                            u2.r.J(eVar7, l10, qVar2);
                            defpackage.f.u(hashCode3, qVar2, eVar8, qVar2, dVar3);
                            u2.r.J(eVar10, c13, qVar2);
                            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(true, null, 0L, qVar2, 6, 6);
                            qVar2.p(true);
                            qVar2.p(false);
                        } else {
                            w0Var2 = w0Var;
                            i15 = i14;
                            echoTheme = echoTheme2;
                            i16 = i13;
                            lVar7 = lVar5;
                            dVar3 = dVar6;
                            eVar7 = eVar20;
                            eVar8 = eVar18;
                            eVar9 = eVar21;
                            qVar3 = qVar;
                            eVar10 = eVar19;
                            qVar2.X(-559538795);
                            qVar2.p(false);
                        }
                    } else {
                        qVar2.X(-560393992);
                        i3.t I2 = r1.d.I(l1.n.h(p2.d(qVar, 1.0f), ib.i.D(i13, i14, echoTheme2, qVar2, qVar2), w0Var), t2.u.P, f11, t2.u.P, f10, 5);
                        i3.l lVar14 = lVar5;
                        f4.f1 d16 = r1.p.d(lVar14, false);
                        int hashCode4 = Long.hashCode(qVar2.T);
                        c3.o l11 = qVar2.l();
                        i3.t c14 = i3.a.c(I2, qVar2);
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(aVar6);
                        } else {
                            qVar2.k0();
                        }
                        h4.e eVar22 = eVar4;
                        u2.r.J(eVar22, d16, qVar2);
                        h4.e eVar23 = eVar3;
                        u2.r.J(eVar23, l11, qVar2);
                        h4.e eVar24 = eVar5;
                        h4.d dVar7 = dVar2;
                        defpackage.f.u(hashCode4, qVar2, eVar24, qVar2, dVar7);
                        h4.e eVar25 = eVar6;
                        u2.r.J(eVar25, c14, qVar2);
                        FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(true, Integer.valueOf(i10), 0L, qVar2, 6, 4);
                        qVar2.p(true);
                        qVar2.p(false);
                        w0Var2 = w0Var;
                        i15 = i14;
                        echoTheme = echoTheme2;
                        i16 = i13;
                        lVar7 = lVar14;
                        dVar3 = dVar7;
                        eVar7 = eVar23;
                        eVar8 = eVar24;
                        eVar9 = eVar22;
                        qVar3 = qVar;
                        eVar10 = eVar25;
                    }
                    if (z10) {
                        qVar2.X(-559438417);
                        Object L9 = qVar2.L();
                        if (L9 == obj) {
                            L9 = new b1(29);
                            qVar2.h0(L9);
                        }
                        String str = (String) ComposeExtensionsKt.selectAsState(z1Var3, (ho.l) L9, qVar2, 48).getValue();
                        if (!wq.n.m0(str)) {
                            qVar2.X(-559375890);
                            i3.q qVar9 = qVar3;
                            qVar4 = qVar9;
                            i3.t I3 = r1.d.I(l1.n.h(p2.d(qVar9, 1.0f), ib.i.D(i16, i15, echoTheme, qVar2, qVar2), w0Var2), t2.u.P, f11, t2.u.P, f10, 5);
                            f4.f1 d17 = r1.p.d(lVar7, false);
                            int hashCode5 = Long.hashCode(qVar2.T);
                            c3.o l12 = qVar2.l();
                            i3.t c15 = i3.a.c(I3, qVar2);
                            qVar2.b0();
                            if (qVar2.S) {
                                qVar2.k(aVar6);
                            } else {
                                qVar2.k0();
                            }
                            u2.r.J(eVar9, d17, qVar2);
                            u2.r.J(eVar7, l12, qVar2);
                            defpackage.f.u(hashCode5, qVar2, eVar8, qVar2, dVar3);
                            u2.r.J(eVar10, c15, qVar2);
                            lVar11 = lVar;
                            ErrorScreenKt.m1836ErrorScreenV9fs2A(null, null, str, c3.k.d(1431183316, true, new n(lVar11, 5), qVar2), null, 0L, qVar2, 3072, 51);
                            qVar2.p(true);
                            qVar2.p(false);
                        } else {
                            lVar11 = lVar;
                            qVar4 = qVar3;
                            qVar2.X(-558600363);
                            qVar2.p(false);
                        }
                        Object L10 = qVar2.L();
                        if (L10 == obj) {
                            L10 = new b1(7);
                            qVar2.h0(L10);
                        }
                        ho.l lVar15 = lVar11;
                        lVar8 = lVar7;
                        eVar11 = eVar10;
                        eVar12 = eVar8;
                        dVar4 = dVar3;
                        z1Var4 = z1Var;
                        eVar13 = eVar9;
                        playerDisplayMode2 = playerDisplayMode;
                        lVar9 = lVar15;
                        AnimatedVisibilityContainersKt.AnimatedFadeVisibility(z11, c3.k.d(-1626749956, true, new c1((ReadMeta) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L10, qVar2, 48).getValue(), playerDisplayMode, x0Var, z6, aVar4, lVar15, s2Var, z0Var3), qVar2), qVar2, 48);
                        i17 = 0;
                        qVar2.p(false);
                    } else {
                        lVar8 = lVar7;
                        eVar11 = eVar10;
                        eVar12 = eVar8;
                        dVar4 = dVar3;
                        qVar4 = qVar3;
                        i17 = 0;
                        lVar9 = lVar;
                        z1Var4 = z1Var3;
                        eVar13 = eVar9;
                        playerDisplayMode2 = playerDisplayMode;
                        qVar2.X(-557249259);
                        qVar2.p(false);
                    }
                    PlayerErrorToast(z1Var4, lVar9, qVar2, i17);
                    if (!PlayerScreenUI$lambda$22(z0Var4)) {
                        qVar2.X(-557093546);
                        Object L11 = qVar2.L();
                        if (L11 == obj) {
                            L11 = new b1(8);
                            qVar2.h0(L11);
                        }
                        String str2 = (String) ComposeExtensionsKt.selectAsState(z1Var4, (ho.l) L11, qVar2, 48).getValue();
                        if (str2 != null) {
                            qVar2.X(-556979621);
                            Object L12 = qVar2.L();
                            if (L12 == obj) {
                                z0Var6 = z0Var4;
                                L12 = new l0(z0Var6, 3);
                                qVar2.h0(L12);
                            } else {
                                z0Var6 = z0Var4;
                            }
                            ho.a aVar7 = (ho.a) L12;
                            boolean f14 = qVar2.f(lVar9);
                            Object L13 = qVar2.L();
                            if (f14 || L13 == obj) {
                                z15 = false;
                                final Object[] objArr = null == true ? 1 : 0;
                                L13 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.d1
                                    @Override // ho.l
                                    public final Object invoke(Object obj4) {
                                        sn.z PlayerScreenUI$lambda$44$0$15$0;
                                        sn.z PlayerScreenUI$lambda$44$20$0;
                                        sn.z PlayerScreenUI$lambda$44$26$0;
                                        switch (objArr) {
                                            case 0:
                                                PlayerScreenUI$lambda$44$0$15$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$15$0(lVar9, z0Var6, ((Long) obj4).longValue());
                                                return PlayerScreenUI$lambda$44$0$15$0;
                                            case 1:
                                                PlayerScreenUI$lambda$44$20$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$20$0(lVar9, z0Var6, (Analytics.Event.PlayerActionSource) obj4);
                                                return PlayerScreenUI$lambda$44$20$0;
                                            default:
                                                PlayerScreenUI$lambda$44$26$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$26$0(lVar9, z0Var6, (Analytics.Event.PlayerActionSource) obj4);
                                                return PlayerScreenUI$lambda$44$26$0;
                                        }
                                    }
                                };
                                qVar2.h0(L13);
                            } else {
                                z15 = false;
                            }
                            ContentSearchSheetKt.ContentSearchSheet(aVar7, str2, (ho.l) L13, null, qVar2, 6, 8);
                            qVar2.p(z15);
                        } else {
                            z15 = false;
                            qVar2.X(-556554859);
                            qVar2.p(false);
                        }
                        qVar2.p(z15);
                    } else {
                        qVar2.X(-556540971);
                        qVar2.p(false);
                    }
                    if (!PlayerScreenUI$lambda$25(z0Var5)) {
                        qVar2.X(-556490193);
                        Object L14 = qVar2.L();
                        if (L14 == obj) {
                            L14 = new b1(9);
                            qVar2.h0(L14);
                        }
                        String str3 = (String) ComposeExtensionsKt.selectAsState(z1Var4, (ho.l) L14, qVar2, 48).getValue();
                        Object L15 = qVar2.L();
                        if (L15 == obj) {
                            c5 = 4;
                            L15 = new l0(z0Var5, 4);
                            qVar2.h0(L15);
                        } else {
                            c5 = 4;
                        }
                        ho.a aVar8 = (ho.a) L15;
                        u2.q qVar10 = qVar2;
                        ReportProblemBottomSheetKt.ReportProblemBottomSheet(str3, aVar8, lVar4, null, qVar10, 48, 8);
                        qVar5 = qVar10;
                        z13 = false;
                        qVar5.p(false);
                    } else {
                        qVar5 = qVar2;
                        z13 = false;
                        qVar5.X(-556207659);
                        qVar5.p(false);
                    }
                    i3.q qVar11 = qVar4;
                    i3.t d18 = p2.d(qVar11, 1.0f);
                    f4.f1 d19 = r1.p.d(lVar6, z13);
                    int hashCode6 = Long.hashCode(qVar5.T);
                    c3.o l13 = qVar5.l();
                    i3.t c16 = i3.a.c(d18, qVar5);
                    qVar5.b0();
                    if (!qVar5.S) {
                        qVar5.k(aVar6);
                    } else {
                        qVar5.k0();
                    }
                    u2.r.J(eVar13, d19, qVar5);
                    u2.r.J(eVar7, l13, qVar5);
                    h4.e eVar26 = eVar12;
                    h4.d dVar8 = dVar4;
                    defpackage.f.u(hashCode6, qVar5, eVar26, qVar5, dVar8);
                    h4.e eVar27 = eVar11;
                    u2.r.J(eVar27, c16, qVar5);
                    if (z10 && playerDisplayMode2 == PlayerDisplayMode.Text) {
                        qVar5.X(-2044514249);
                        i3.t I4 = r1.d.I(r1.t.f29349a.b(p2.e(qVar11, 1.0f), i3.d.f12998b), t2.u.P, f11, t2.u.P, t2.u.P, 13);
                        f4.f1 d20 = r1.p.d(lVar8, false);
                        int hashCode7 = Long.hashCode(qVar5.T);
                        c3.o l14 = qVar5.l();
                        i3.t c17 = i3.a.c(I4, qVar5);
                        qVar5.b0();
                        if (qVar5.S) {
                            qVar5.k(aVar6);
                        } else {
                            qVar5.k0();
                        }
                        u2.r.J(eVar13, d20, qVar5);
                        u2.r.J(eVar7, l14, qVar5);
                        defpackage.f.u(hashCode7, qVar5, eVar26, qVar5, dVar8);
                        u2.r.J(eVar27, c17, qVar5);
                        f13 = f12;
                        AnimatedVisibilityContainersKt.AnimatedFadeVisibility(PlayerScreenUI$lambda$40(s2Var) && z11, c3.k.d(-1702926009, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.e1
                            @Override // ho.p
                            public final Object invoke(Object obj4, Object obj5) {
                                sn.z PlayerScreenUI$lambda$44$0$18$0$0;
                                int intValue = ((Integer) obj5).intValue();
                                PlayerScreenUI$lambda$44$0$18$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$0$0(f13, (u2.m) obj4, intValue);
                                return PlayerScreenUI$lambda$44$0$18$0$0;
                            }
                        }, qVar5), qVar5, 48);
                        qVar5.p(true);
                        qVar5.p(false);
                    } else {
                        f13 = f12;
                        qVar5.X(-2043680101);
                        qVar5.p(false);
                    }
                    qVar6 = qVar5;
                    final PlayerDisplayMode playerDisplayMode3 = playerDisplayMode2;
                    obj2 = obj;
                    final float f15 = f13;
                    final ir.z1 z1Var5 = z1Var4;
                    AnimatedVisibilityContainersKt.AnimatedFadeVisibility(z11, c3.k.d(-1053201144, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.f1
                        @Override // ho.p
                        public final Object invoke(Object obj4, Object obj5) {
                            sn.z PlayerScreenUI$lambda$44$0$18$1;
                            int intValue = ((Integer) obj5).intValue();
                            PlayerScreenUI$lambda$44$0$18$1 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1(z10, z1Var5, lVar, z0Var2, z0Var, f15, playerDisplayMode3, x0Var2, aVar, aVar2, z0Var4, (u2.m) obj4, intValue);
                            return PlayerScreenUI$lambda$44$0$18$1;
                        }
                    }, qVar6), qVar6, 48);
                    qVar6.p(true);
                    qVar6.p(true);
                    PlayerScreenDialogsKt.PlayerScreenDialogs(z1Var5, lVar, qVar6, 0);
                    if (!PlayerScreenUI$lambda$28(z0Var)) {
                        qVar6.X(-94078631);
                        Object L16 = qVar6.L();
                        if (L16 == obj2) {
                            L16 = new b1(10);
                            qVar6.h0(L16);
                        }
                        String str4 = (String) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L16, qVar6, 48).getValue();
                        if (str4 == null) {
                            str4 = "";
                        }
                        Object L17 = qVar6.L();
                        if (L17 == obj2) {
                            L17 = new b1(12);
                            qVar6.h0(L17);
                        }
                        String str5 = (String) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L17, qVar6, 48).getValue();
                        String str6 = str5 != null ? str5 : "";
                        Object L18 = qVar6.L();
                        if (L18 == obj2) {
                            L18 = new b1(13);
                            qVar6.h0(L18);
                        }
                        Long l15 = (Long) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L18, qVar6, 48).getValue();
                        long longValue = l15 != null ? l15.longValue() : 0L;
                        String[] strArr = new String[2];
                        Object L19 = qVar6.L();
                        if (L19 == obj2) {
                            L19 = new b1(14);
                            qVar6.h0(L19);
                        }
                        strArr[0] = ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L19, qVar6, 48).getValue();
                        Object L20 = qVar6.L();
                        if (L20 == obj2) {
                            L20 = new b1(15);
                            qVar6.h0(L20);
                        }
                        strArr[1] = ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L20, qVar6, 48).getValue();
                        String E0 = tn.o.E0(tn.n.F0(strArr), " · ", null, null, null, 62);
                        boolean f16 = qVar6.f(z0Var) | qVar6.f(z0Var2) | qVar6.f(lVar);
                        Object L21 = qVar6.L();
                        if (f16 || L21 == obj2) {
                            z14 = false;
                            L21 = new g1(lVar, z0Var, z0Var2, 0);
                            qVar6.h0(L21);
                        } else {
                            z14 = false;
                        }
                        AskAssistantSheetKt.AskAssistantSheet(str4, str6, longValue, E0, (ho.a) L21, null, qVar6, 0, 32);
                        qVar6.p(z14);
                    } else {
                        z14 = false;
                        qVar6.X(-93134929);
                        qVar6.p(false);
                    }
                    L3 = qVar6.L();
                    if (L3 == obj2) {
                        L3 = new b1(16);
                        qVar6.h0(L3);
                    }
                    ReadMeta readMeta = (ReadMeta) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L3, qVar6, 48).getValue();
                    if (!PlayerScreenUI$lambda$19(z0Var3) && readMeta != null) {
                        qVar6.X(-92834911);
                        Object L22 = qVar6.L();
                        if (L22 == obj2) {
                            L22 = new b1(17);
                            qVar6.h0(L22);
                        }
                        boolean booleanValue3 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L22, qVar6, 48).getValue()).booleanValue();
                        Object L23 = qVar6.L();
                        if (L23 == obj2) {
                            L23 = new b1(18);
                            qVar6.h0(L23);
                        }
                        boolean booleanValue4 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L23, qVar6, 48).getValue()).booleanValue();
                        Object L24 = qVar6.L();
                        if (L24 == obj2) {
                            L24 = new b1(19);
                            qVar6.h0(L24);
                        }
                        boolean booleanValue5 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L24, qVar6, 48).getValue()).booleanValue();
                        Object L25 = qVar6.L();
                        if (L25 == obj2) {
                            L25 = new b1(21);
                            qVar6.h0(L25);
                        }
                        boolean booleanValue6 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L25, qVar6, 48).getValue()).booleanValue();
                        Object L26 = qVar6.L();
                        if (L26 == obj2) {
                            L26 = new b1(23);
                            qVar6.h0(L26);
                        }
                        String str7 = (String) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L26, qVar6, 48).getValue();
                        Object L27 = qVar6.L();
                        if (L27 == obj2) {
                            L27 = new b1(24);
                            qVar6.h0(L27);
                        }
                        String str8 = (String) ComposeExtensionsKt.selectAsState(z1Var5, (ho.l) L27, qVar6, 48).getValue();
                        Object L28 = qVar6.L();
                        if (L28 == obj2) {
                            L28 = new l0(z0Var3, 5);
                            qVar6.h0(L28);
                        }
                        ho.a aVar9 = (ho.a) L28;
                        boolean f17 = qVar6.f(lVar) | qVar6.h(readMeta) | qVar6.f(lVar2);
                        Object L29 = qVar6.L();
                        if (f17 || L29 == obj2) {
                            L29 = new a2.o0(lVar, readMeta, lVar2, 22);
                            qVar6.h0(L29);
                        }
                        ho.l lVar16 = (ho.l) L29;
                        boolean f18 = qVar6.f(lVar);
                        Object L30 = qVar6.L();
                        if (f18 || L30 == obj2) {
                            L30 = new t(lVar, 10);
                            qVar6.h0(L30);
                        }
                        ho.l lVar17 = (ho.l) L30;
                        boolean f19 = qVar6.f(lVar) | qVar6.h(z1Var5) | qVar6.f(lVar3);
                        Object L31 = qVar6.L();
                        if (f19 || L31 == obj2) {
                            aVar5 = aVar9;
                            L31 = new a2.o0(lVar, z1Var5, lVar3, 23);
                            qVar6.h0(L31);
                        } else {
                            aVar5 = aVar9;
                        }
                        ho.l lVar18 = (ho.l) L31;
                        boolean f20 = qVar6.f(lVar);
                        Object L32 = qVar6.L();
                        if (f20 || L32 == obj2) {
                            L32 = new t(lVar, 11);
                            qVar6.h0(L32);
                        }
                        ho.l lVar19 = (ho.l) L32;
                        boolean f21 = qVar6.f(lVar);
                        Object L33 = qVar6.L();
                        if (f21 || L33 == obj2) {
                            lVar10 = lVar18;
                            L33 = new v0(lVar, 8);
                            qVar6.h0(L33);
                        } else {
                            lVar10 = lVar18;
                        }
                        ho.a aVar10 = (ho.a) L33;
                        boolean f22 = qVar6.f(lVar);
                        Object L34 = qVar6.L();
                        if (f22 || L34 == obj2) {
                            final int i20 = 1;
                            L34 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.d1
                                @Override // ho.l
                                public final Object invoke(Object obj4) {
                                    sn.z PlayerScreenUI$lambda$44$0$15$0;
                                    sn.z PlayerScreenUI$lambda$44$20$0;
                                    sn.z PlayerScreenUI$lambda$44$26$0;
                                    switch (i20) {
                                        case 0:
                                            PlayerScreenUI$lambda$44$0$15$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$15$0(lVar, z0Var5, ((Long) obj4).longValue());
                                            return PlayerScreenUI$lambda$44$0$15$0;
                                        case 1:
                                            PlayerScreenUI$lambda$44$20$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$20$0(lVar, z0Var5, (Analytics.Event.PlayerActionSource) obj4);
                                            return PlayerScreenUI$lambda$44$20$0;
                                        default:
                                            PlayerScreenUI$lambda$44$26$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$26$0(lVar, z0Var5, (Analytics.Event.PlayerActionSource) obj4);
                                            return PlayerScreenUI$lambda$44$26$0;
                                    }
                                }
                            };
                            qVar6.h0(L34);
                        }
                        ho.l lVar20 = (ho.l) L34;
                        boolean f23 = qVar6.f(lVar) | qVar6.h(z1Var5) | qVar6.f(aVar);
                        Object L35 = qVar6.L();
                        if (f23 || L35 == obj2) {
                            L35 = new u0(lVar, aVar, z1Var5, 2);
                            qVar6.h0(L35);
                        }
                        ho.a aVar11 = (ho.a) L35;
                        boolean f24 = qVar6.f(lVar) | qVar6.h(z1Var5) | qVar6.f(aVar2);
                        Object L36 = qVar6.L();
                        if (f24 || L36 == obj2) {
                            L36 = new u0(lVar, aVar2, z1Var5, 3);
                            qVar6.h0(L36);
                        }
                        ho.a aVar12 = (ho.a) L36;
                        boolean f25 = qVar6.f(lVar) | qVar6.f(aVar3);
                        Object L37 = qVar6.L();
                        if (f25 || L37 == obj2) {
                            L37 = new s(lVar, aVar3, 5);
                            qVar6.h0(L37);
                        }
                        ho.a aVar13 = (ho.a) L37;
                        boolean f26 = qVar6.f(lVar);
                        Object L38 = qVar6.L();
                        if (f26 || L38 == obj2) {
                            L38 = new n(lVar, 3);
                            qVar6.h0(L38);
                        }
                        ho.p pVar = (ho.p) L38;
                        boolean f27 = qVar6.f(lVar);
                        Object L39 = qVar6.L();
                        if (f27 || L39 == obj2) {
                            L39 = new n(lVar, 4);
                            qVar6.h0(L39);
                        }
                        ho.p pVar2 = (ho.p) L39;
                        boolean f28 = qVar6.f(lVar);
                        Object L40 = qVar6.L();
                        if (f28 || L40 == obj2) {
                            final int i21 = 2;
                            L40 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.d1
                                @Override // ho.l
                                public final Object invoke(Object obj4) {
                                    sn.z PlayerScreenUI$lambda$44$0$15$0;
                                    sn.z PlayerScreenUI$lambda$44$20$0;
                                    sn.z PlayerScreenUI$lambda$44$26$0;
                                    switch (i21) {
                                        case 0:
                                            PlayerScreenUI$lambda$44$0$15$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$15$0(lVar, z0Var4, ((Long) obj4).longValue());
                                            return PlayerScreenUI$lambda$44$0$15$0;
                                        case 1:
                                            PlayerScreenUI$lambda$44$20$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$20$0(lVar, z0Var4, (Analytics.Event.PlayerActionSource) obj4);
                                            return PlayerScreenUI$lambda$44$20$0;
                                        default:
                                            PlayerScreenUI$lambda$44$26$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$26$0(lVar, z0Var4, (Analytics.Event.PlayerActionSource) obj4);
                                            return PlayerScreenUI$lambda$44$26$0;
                                    }
                                }
                            };
                            qVar6.h0(L40);
                        }
                        ho.l lVar21 = (ho.l) L40;
                        boolean f29 = qVar6.f(lVar);
                        Object L41 = qVar6.L();
                        if (f29 || L41 == obj2) {
                            L41 = new t(lVar, 12);
                            qVar6.h0(L41);
                        }
                        ho.l lVar22 = (ho.l) L41;
                        boolean f30 = qVar6.f(lVar) | qVar6.f(lVar4);
                        Object L42 = qVar6.L();
                        if (f30 || L42 == obj2) {
                            L42 = new t0(lVar, lVar4);
                            qVar6.h0(L42);
                        }
                        ho.p pVar3 = (ho.p) L42;
                        boolean f31 = qVar6.f(lVar) | qVar6.f(z0Var2) | qVar6.h(z1Var5) | qVar6.f(z0Var);
                        Object L43 = qVar6.L();
                        if (f31 || L43 == obj2) {
                            L43 = new x1(lVar, z1Var5, z0Var2, z0Var, 2);
                            qVar6.h0(L43);
                        }
                        ho.l lVar23 = (ho.l) L43;
                        boolean f32 = qVar6.f(lVar);
                        Object L44 = qVar6.L();
                        if (f32 || L44 == obj2) {
                            L44 = new t(lVar, 14);
                            qVar6.h0(L44);
                        }
                        PlayerActionsSheetKt.PlayerActionsSheet(lVar, readMeta, playerDisplayMode, booleanValue3, z6, booleanValue6, aVar5, lVar16, lVar17, lVar10, lVar19, aVar10, lVar20, aVar11, aVar12, aVar13, pVar, pVar2, lVar21, booleanValue4, booleanValue5, lVar22, pVar3, lVar23, (ho.l) L44, str7, str8, qVar6, 1572864, 0, 0, 0);
                        qVar6.p(false);
                    } else {
                        qVar6.X(-88598513);
                        qVar6.p(z14);
                    }
                }
            }
            i13 = i18;
            obj = obj3;
            qVar = qVar8;
            qVar2 = qVar7;
            eVar3 = eVar15;
            eVar4 = eVar14;
            w0Var = w0Var3;
            i14 = i19;
            dVar2 = dVar;
            eVar5 = eVar;
            z1Var3 = z1Var;
            lVar6 = lVar12;
            eVar6 = eVar2;
            WeakHashMap weakHashMap2 = c3.f29142x;
            r1.d.g(r1.d.N(r1.u0.e(qVar2).f29145c), qVar2);
            L = qVar2.L();
            if (L == obj) {
            }
            booleanValue = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var3, (ho.l) L, qVar2, 48).getValue()).booleanValue();
            L2 = qVar2.L();
            if (L2 == obj) {
            }
            if (((Boolean) ComposeExtensionsKt.selectAsState(z1Var3, (ho.l) L2, qVar2, 48).getValue()).booleanValue()) {
            }
            h4.e eVar182 = eVar5;
            h4.d dVar62 = dVar2;
            h4.e eVar192 = eVar6;
            h4.e eVar202 = eVar3;
            h4.e eVar212 = eVar4;
            if (!booleanValue) {
            }
            if (z10) {
            }
            PlayerErrorToast(z1Var4, lVar9, qVar2, i17);
            if (!PlayerScreenUI$lambda$22(z0Var4)) {
            }
            if (!PlayerScreenUI$lambda$25(z0Var5)) {
            }
            i3.q qVar112 = qVar4;
            i3.t d182 = p2.d(qVar112, 1.0f);
            f4.f1 d192 = r1.p.d(lVar6, z13);
            int hashCode62 = Long.hashCode(qVar5.T);
            c3.o l132 = qVar5.l();
            i3.t c162 = i3.a.c(d182, qVar5);
            qVar5.b0();
            if (!qVar5.S) {
            }
            u2.r.J(eVar13, d192, qVar5);
            u2.r.J(eVar7, l132, qVar5);
            h4.e eVar262 = eVar12;
            h4.d dVar82 = dVar4;
            defpackage.f.u(hashCode62, qVar5, eVar262, qVar5, dVar82);
            h4.e eVar272 = eVar11;
            u2.r.J(eVar272, c162, qVar5);
            if (z10) {
            }
            f13 = f12;
            qVar5.X(-2043680101);
            qVar5.p(false);
            qVar6 = qVar5;
            final PlayerDisplayMode playerDisplayMode32 = playerDisplayMode2;
            obj2 = obj;
            final float f152 = f13;
            final ir.z1 z1Var52 = z1Var4;
            AnimatedVisibilityContainersKt.AnimatedFadeVisibility(z11, c3.k.d(-1053201144, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.f1
                @Override // ho.p
                public final Object invoke(Object obj4, Object obj5) {
                    sn.z PlayerScreenUI$lambda$44$0$18$1;
                    int intValue = ((Integer) obj5).intValue();
                    PlayerScreenUI$lambda$44$0$18$1 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1(z10, z1Var52, lVar, z0Var2, z0Var, f152, playerDisplayMode32, x0Var2, aVar, aVar2, z0Var4, (u2.m) obj4, intValue);
                    return PlayerScreenUI$lambda$44$0$18$1;
                }
            }, qVar6), qVar6, 48);
            qVar6.p(true);
            qVar6.p(true);
            PlayerScreenDialogsKt.PlayerScreenDialogs(z1Var52, lVar, qVar6, 0);
            if (!PlayerScreenUI$lambda$28(z0Var)) {
            }
            L3 = qVar6.L();
            if (L3 == obj2) {
            }
            ReadMeta readMeta2 = (ReadMeta) ComposeExtensionsKt.selectAsState(z1Var52, (ho.l) L3, qVar6, 48).getValue();
            if (!PlayerScreenUI$lambda$19(z0Var3)) {
            }
            qVar6.X(-88598513);
            qVar6.p(z14);
        } else {
            qVar7.R();
        }
        return sn.z.f31622a;
    }

    public static final MediaItemState PlayerScreenUI$lambda$44$0$0$0(PlayerState playerState) {
        ReadMeta readMeta;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null) {
            String readId = readMeta.getReadId();
            String title = readMeta.getTitle();
            String author = readMeta.getAuthor();
            if (author == null) {
                author = "ElevenLabs";
            }
            return new MediaItemState(readId, title, author, ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Large), readMeta.getSource(), readMeta.getOriginalFileType());
        }
        return null;
    }

    public static final ReadMeta PlayerScreenUI$lambda$44$0$1$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getReadMeta();
        }
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$10$0(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new v0(lVar, 4);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$10$0$0$0(ho.l lVar) {
        lVar.invoke(new j0(20));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$10$0$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.load$default(playerViewModel, null, null, false, 7, null);
        return sn.z.f31622a;
    }

    public static final ReadMeta PlayerScreenUI$lambda$44$0$11$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getReadMeta();
        }
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$12(ReadMeta readMeta, PlayerDisplayMode playerDisplayMode, u2.x0 x0Var, boolean z6, ho.a aVar, ho.l lVar, s2 s2Var, u2.z0 z0Var, u2.m mVar, int i10) {
        boolean z10;
        String str;
        String str2;
        long j4;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            String str3 = null;
            if (readMeta != null) {
                str = readMeta.getTitle();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            if (readMeta != null) {
                str3 = readMeta.getAuthor();
            }
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
            boolean PlayerScreenUI$lambda$40 = PlayerScreenUI$lambda$40(s2Var);
            i3.t disableClickThrough = ComposeExtensionsKt.disableClickThrough(p2.e(i3.q.f13017a, 1.0f));
            if (playerDisplayMode == PlayerDisplayMode.Audio) {
                qVar.X(1903799437);
                qVar.p(false);
                j4 = p3.x.f26437l;
            } else {
                qVar.X(1903894235);
                long primary = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable);
                qVar.p(false);
                j4 = primary;
            }
            i3.t h10 = l1.n.h(disableClickThrough, j4, p3.h0.f26395b);
            boolean f10 = qVar.f(x0Var);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = new x0(x0Var, 1);
                qVar.h0(L);
            }
            i3.t p10 = f4.i0.p(h10, (ho.l) L);
            boolean f11 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new v0(lVar, 10);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new l0(z0Var, 0);
                qVar.h0(L3);
            }
            PlayerHeaderKt.PlayerHeader(str, str2, PlayerScreenUI$lambda$40, z6, aVar, aVar2, (ho.a) L3, p10, qVar, 1572864, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$12$0$0(u2.x0 x0Var, f4.f0 f0Var) {
        f0Var.getClass();
        PlayerScreenUI$lambda$10(x0Var, (int) (f0Var.k() & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$12$1$0(ho.l lVar) {
        lVar.invoke(new j0(19));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$12$1$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.onShareClick$default(playerViewModel, null, 1, null);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$12$2$0(u2.z0 z0Var) {
        PlayerScreenUI$lambda$20(z0Var, true);
        return sn.z.f31622a;
    }

    public static final String PlayerScreenUI$lambda$44$0$13$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getReadId();
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$14$0(u2.z0 z0Var) {
        PlayerScreenUI$lambda$23(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$15$0(ho.l lVar, u2.z0 z0Var, long j4) {
        lVar.invoke(new f2(j4, z0Var));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$15$0$0(long j4, u2.z0 z0Var, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.seekToOffset(j4);
        PlayerScreenUI$lambda$23(z0Var, false);
        return sn.z.f31622a;
    }

    public static final String PlayerScreenUI$lambda$44$0$16$0(PlayerState playerState) {
        ReadMeta readMeta;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null) {
            return readMeta.getReadId();
        }
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$17$0(u2.z0 z0Var) {
        PlayerScreenUI$lambda$26(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$0$0(float f10, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VerticalGradientKt.VerticalGradient(p2.f(p2.e(i3.q.f13017a, 1.0f), f10), ig.f.I(new p3.x(EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable)), new p3.x(p3.x.f26437l)), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1(boolean z6, final ir.z1 z1Var, final ho.l lVar, final u2.z0 z0Var, final u2.z0 z0Var2, float f10, PlayerDisplayMode playerDisplayMode, u2.x0 x0Var, ho.a aVar, ho.a aVar2, u2.z0 z0Var3, u2.m mVar, int i10) {
        boolean z10;
        r1.e eVar;
        boolean z11;
        boolean z12;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            r1.e eVar2 = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar2, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            u2.r.J(eVar3, a10, qVar);
            h4.e eVar4 = h4.g.f11906e;
            u2.r.J(eVar4, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar5 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar5);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar6 = h4.g.f11905d;
            u2.r.J(eVar6, c5, qVar);
            i3.t e11 = p2.e(qVar2, 1.0f);
            f4.f1 d10 = r1.p.d(i3.d.Z, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(e11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar3, d10, qVar);
            u2.r.J(eVar4, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar5, qVar, dVar);
            u2.r.J(eVar6, c10, qVar);
            p3.w0 w0Var = p3.h0.f26395b;
            if (!z6) {
                qVar.X(1041682703);
                i3.t e12 = p2.e(qVar2, 1.0f);
                r1.x a11 = r1.w.a(eVar2, jVar, qVar, 0);
                eVar = eVar2;
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c11 = i3.a.c(e12, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(eVar3, a11, qVar);
                u2.r.J(eVar4, l10, qVar);
                defpackage.f.u(hashCode3, qVar, eVar5, qVar, dVar);
                u2.r.J(eVar6, c11, qVar);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i11 = EchoTheme.$stable;
                EchoThemeColors.Background background = echoTheme.getColors(qVar, i11).getBackground();
                int i12 = EchoThemeColors.Background.$stable;
                long primary = background.getPrimary(qVar, i12);
                if (playerDisplayMode == PlayerDisplayMode.Audio) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ShadowKt.m1875BottomShadow8s8adOk(f10, primary, z12, qVar, 0, 0);
                r1.p.a(l1.n.h(p2.f(p2.e(qVar2, 1.0f), 44), ib.i.D(i11, i12, echoTheme, qVar, qVar), w0Var), qVar, 0);
                qVar.p(true);
                qVar.p(false);
            } else {
                eVar = eVar2;
                qVar.X(1042550486);
                qVar.p(false);
            }
            boolean g10 = qVar.g(z6);
            Object L = qVar.L();
            u2.e eVar7 = u2.l.f33918a;
            if (g10 || L == eVar7) {
                L = new w1(z6, 6);
                qVar.h0(L);
            }
            boolean booleanValue = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L, qVar, 0).getValue()).booleanValue();
            Object L2 = qVar.L();
            if (L2 == eVar7) {
                L2 = new s0(14);
                qVar.h0(L2);
            }
            boolean booleanValue2 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L2, qVar, 48).getValue()).booleanValue();
            Object L3 = qVar.L();
            if (L3 == eVar7) {
                z11 = booleanValue;
                L3 = new s0(21);
                qVar.h0(L3);
            } else {
                z11 = booleanValue;
            }
            boolean booleanValue3 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L3, qVar, 48).getValue()).booleanValue();
            boolean f11 = qVar.f(lVar) | qVar.f(z0Var) | qVar.h(z1Var) | qVar.f(z0Var2);
            Object L4 = qVar.L();
            if (f11 || L4 == eVar7) {
                L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.w0
                    @Override // ho.a
                    public final Object invoke() {
                        sn.z PlayerScreenUI$lambda$44$0$18$1$0$0$4$0;
                        PlayerScreenUI$lambda$44$0$18$1$0$0$4$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$0$4$0(ho.l.this, z1Var, z0Var, z0Var2);
                        return PlayerScreenUI$lambda$44$0$18$1$0$0$4$0;
                    }
                };
                qVar.h0(L4);
            }
            r1.e eVar8 = eVar;
            PlayerFloatingBottomControlsKt.PlayerFloatingBottomControls(booleanValue2, z11, booleanValue3, (ho.a) L4, lVar, qVar, 0);
            qVar.p(true);
            i3.t disableClickThrough = ComposeExtensionsKt.disableClickThrough(p2.e(qVar2, 1.0f));
            Object L5 = qVar.L();
            if (L5 == eVar7) {
                L5 = new x0(x0Var, 0);
                qVar.h0(L5);
            }
            i3.t p10 = f4.i0.p(disableClickThrough, (ho.l) L5);
            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            i3.t h10 = l1.n.h(p10, echoTheme2.getColors(qVar, i13).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), w0Var);
            r1.x a12 = r1.w.a(eVar8, jVar, qVar, 0);
            int hashCode4 = Long.hashCode(qVar.T);
            c3.o l11 = qVar.l();
            i3.t c12 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar3, a12, qVar);
            u2.r.J(eVar4, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar5, qVar, dVar);
            u2.r.J(eVar6, c12, qVar);
            Object L6 = qVar.L();
            if (L6 == eVar7) {
                L6 = new s0(23);
                qVar.h0(L6);
            }
            ContentState contentState = (ContentState) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L6, qVar, 48).getValue();
            Object L7 = qVar.L();
            if (L7 == eVar7) {
                L7 = new s0(24);
                qVar.h0(L7);
            }
            Long l12 = (Long) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L7, qVar, 48).getValue();
            Object L8 = qVar.L();
            if (L8 == eVar7) {
                L8 = new s0(25);
                qVar.h0(L8);
            }
            SkipDuration skipDuration = (SkipDuration) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L8, qVar, 48).getValue();
            Object L9 = qVar.L();
            if (L9 == eVar7) {
                L9 = new s0(26);
                qVar.h0(L9);
            }
            SkipDuration skipDuration2 = (SkipDuration) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L9, qVar, 48).getValue();
            boolean f12 = qVar.f(lVar);
            Object L10 = qVar.L();
            if (f12 || L10 == eVar7) {
                L10 = new v0(lVar, 3);
                qVar.h0(L10);
            }
            ho.a aVar3 = (ho.a) L10;
            boolean f13 = qVar.f(lVar);
            Object L11 = qVar.L();
            if (f13 || L11 == eVar7) {
                L11 = new t(lVar, 6);
                qVar.h0(L11);
            }
            ho.l lVar2 = (ho.l) L11;
            boolean f14 = qVar.f(lVar);
            Object L12 = qVar.L();
            if (f14 || L12 == eVar7) {
                L12 = new t(lVar, 7);
                qVar.h0(L12);
            }
            ho.l lVar3 = (ho.l) L12;
            boolean f15 = qVar.f(lVar);
            Object L13 = qVar.L();
            if (f15 || L13 == eVar7) {
                L13 = new l(lVar, 23);
                qVar.h0(L13);
            }
            ho.a aVar4 = (ho.a) L13;
            boolean f16 = qVar.f(lVar);
            Object L14 = qVar.L();
            if (f16 || L14 == eVar7) {
                L14 = new l(lVar, 24);
                qVar.h0(L14);
            }
            PlayerSliderKt.PlayerSlider(contentState, l12, skipDuration, skipDuration2, aVar3, lVar2, lVar3, aVar4, (ho.a) L14, qVar, 0);
            Object L15 = qVar.L();
            if (L15 == eVar7) {
                L15 = new s0(10);
                qVar.h0(L15);
            }
            PlayerButtonsPlayButtonState playerButtonsPlayButtonState = (PlayerButtonsPlayButtonState) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L15, qVar, 48).getValue();
            Object L16 = qVar.L();
            if (L16 == eVar7) {
                L16 = new s0(11);
                qVar.h0(L16);
            }
            PlayerButtonsSpeedState playerButtonsSpeedState = (PlayerButtonsSpeedState) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L16, qVar, 48).getValue();
            Object L17 = qVar.L();
            if (L17 == eVar7) {
                L17 = new s0(12);
                qVar.h0(L17);
            }
            SkipDuration skipDuration3 = (SkipDuration) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L17, qVar, 48).getValue();
            Object L18 = qVar.L();
            if (L18 == eVar7) {
                L18 = new s0(13);
                qVar.h0(L18);
            }
            SkipDuration skipDuration4 = (SkipDuration) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L18, qVar, 48).getValue();
            boolean f17 = qVar.f(lVar);
            Object L19 = qVar.L();
            if (f17 || L19 == eVar7) {
                L19 = new l(lVar, 25);
                qVar.h0(L19);
            }
            ho.a aVar5 = (ho.a) L19;
            boolean f18 = qVar.f(lVar);
            Object L20 = qVar.L();
            if (f18 || L20 == eVar7) {
                L20 = new l(lVar, 26);
                qVar.h0(L20);
            }
            ho.a aVar6 = (ho.a) L20;
            boolean f19 = qVar.f(lVar);
            Object L21 = qVar.L();
            if (f19 || L21 == eVar7) {
                L21 = new l(lVar, 27);
                qVar.h0(L21);
            }
            ho.a aVar7 = (ho.a) L21;
            boolean f20 = qVar.f(lVar);
            Object L22 = qVar.L();
            if (f20 || L22 == eVar7) {
                L22 = new l(lVar, 28);
                qVar.h0(L22);
            }
            ho.a aVar8 = (ho.a) L22;
            boolean f21 = qVar.f(lVar);
            Object L23 = qVar.L();
            if (f21 || L23 == eVar7) {
                L23 = new l(lVar, 29);
                qVar.h0(L23);
            }
            PlayerButtonsKt.PlayerButtons(playerButtonsPlayButtonState, playerButtonsSpeedState, skipDuration3, skipDuration4, aVar5, aVar6, aVar7, aVar8, (ho.a) L23, qVar, 0);
            Object L24 = qVar.L();
            if (L24 == eVar7) {
                L24 = new s0(16);
                qVar.h0(L24);
            }
            String str = (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L24, qVar, 48).getValue();
            Object L25 = qVar.L();
            if (L25 == eVar7) {
                L25 = new s0(17);
                qVar.h0(L25);
            }
            PlayerAdditionalActionsUsedVoiceState playerAdditionalActionsUsedVoiceState = new PlayerAdditionalActionsUsedVoiceState(str, (String) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L25, qVar, 48).getValue());
            Object L26 = qVar.L();
            if (L26 == eVar7) {
                L26 = new s0(18);
                qVar.h0(L26);
            }
            PlayerAdditionalActionsSoundscapesState playerAdditionalActionsSoundscapesState = (PlayerAdditionalActionsSoundscapesState) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L26, qVar, 48).getValue();
            Object L27 = qVar.L();
            if (L27 == eVar7) {
                L27 = new s0(19);
                qVar.h0(L27);
            }
            boolean booleanValue4 = ((Boolean) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L27, qVar, 48).getValue()).booleanValue();
            Object L28 = qVar.L();
            if (L28 == eVar7) {
                L28 = new s0(20);
                qVar.h0(L28);
            }
            PlayerButtonsSleepTimerState playerButtonsSleepTimerState = (PlayerButtonsSleepTimerState) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L28, qVar, 48).getValue();
            boolean f22 = qVar.f(lVar) | qVar.h(z1Var) | qVar.f(aVar);
            Object L29 = qVar.L();
            if (f22 || L29 == eVar7) {
                L29 = new u0(lVar, aVar, z1Var, 0);
                qVar.h0(L29);
            }
            ho.a aVar9 = (ho.a) L29;
            boolean f23 = qVar.f(lVar);
            Object L30 = qVar.L();
            if (f23 || L30 == eVar7) {
                L30 = new v0(lVar, 0);
                qVar.h0(L30);
            }
            ho.a aVar10 = (ho.a) L30;
            boolean f24 = qVar.f(lVar) | qVar.h(z1Var) | qVar.f(aVar2);
            Object L31 = qVar.L();
            if (f24 || L31 == eVar7) {
                L31 = new u0(lVar, aVar2, z1Var);
                qVar.h0(L31);
            }
            ho.a aVar11 = (ho.a) L31;
            boolean f25 = qVar.f(lVar);
            Object L32 = qVar.L();
            if (f25 || L32 == eVar7) {
                L32 = new s(lVar, z0Var3, 3);
                qVar.h0(L32);
            }
            ho.a aVar12 = (ho.a) L32;
            boolean f26 = qVar.f(lVar);
            Object L33 = qVar.L();
            if (f26 || L33 == eVar7) {
                L33 = new v0(lVar, 1);
                qVar.h0(L33);
            }
            ho.a aVar13 = (ho.a) L33;
            boolean f27 = qVar.f(lVar);
            Object L34 = qVar.L();
            if (f27 || L34 == eVar7) {
                L34 = new v0(lVar, 2);
                qVar.h0(L34);
            }
            PlayerAdditionalActionsPagerKt.PlayerAdditionalActionsPager(playerAdditionalActionsUsedVoiceState, playerAdditionalActionsSoundscapesState, playerButtonsSleepTimerState, z6, booleanValue4, aVar9, aVar10, aVar11, aVar12, aVar13, (ho.a) L34, qVar, 0, 0);
            r1.d.g(p2.f(qVar2, echoTheme2.getSpacings(qVar, i13).getX2()), qVar);
            WeakHashMap weakHashMap = c3.f29142x;
            r1.d.g(r1.d.N(r1.u0.e(qVar).f29149g), qVar);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenUI$lambda$44$0$18$1$0$0$1$0(boolean z6, PlayerState playerState) {
        playerState.getClass();
        if (!playerState.getHighlighterData().getFollowingContent() && playerState.getDisplayMode() == PlayerDisplayMode.Text && !z6) {
            return true;
        }
        return false;
    }

    public static final boolean PlayerScreenUI$lambda$44$0$18$1$0$0$2$0(PlayerState playerState) {
        playerState.getClass();
        if (playerState.getUndoSeek() != null) {
            return true;
        }
        return false;
    }

    public static final boolean PlayerScreenUI$lambda$44$0$18$1$0$0$3$0(PlayerState playerState) {
        ContentState contentState;
        ReadMeta readMeta;
        playerState.getClass();
        if (playerState.isVoiceAgentFloatingButtonEnabled() && (contentState = playerState.getContentState()) != null && (readMeta = contentState.getReadMeta()) != null && readMeta.getCanUseAssistant() && !ReadMetaKt.isMediaType(playerState.getContentState().getReadMeta())) {
            return true;
        }
        return false;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$0$4$0(ho.l lVar, ir.z1 z1Var, u2.z0 z0Var, u2.z0 z0Var2) {
        lVar.invoke(new y0(19));
        PlayerScreenUI$lambda$32(z0Var, ((PlayerState) z1Var.getValue()).getPlayer().isPlayingWhenReady());
        if (PlayerScreenUI$lambda$31(z0Var)) {
            lVar.invoke(new y0(20));
        }
        PlayerScreenUI$lambda$29(z0Var2, true);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$0$4$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedVoiceChat(Analytics.Event.PlayerActionSource.FloatingButton));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$0$4$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onTogglePlayPause();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$1$0(u2.x0 x0Var, f4.f0 f0Var) {
        f0Var.getClass();
        PlayerScreenUI$lambda$13(x0Var, (int) (f0Var.k() & 4294967295L));
        return sn.z.f31622a;
    }

    public static final ContentState PlayerScreenUI$lambda$44$0$18$1$0$2$0$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getContentState();
    }

    public static final Long PlayerScreenUI$lambda$44$0$18$1$0$2$1$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getSleepTimerRemainingSeconds();
    }

    public static final PlayerButtonsSpeedState PlayerScreenUI$lambda$44$0$18$1$0$2$10$0(PlayerState playerState) {
        float f10;
        boolean z6;
        playerState.getClass();
        Float playbackSpeed = playerState.getPlayer().getPlaybackSpeed();
        if (playbackSpeed != null) {
            f10 = playbackSpeed.floatValue();
        } else {
            f10 = 1.0f;
        }
        if (f10 == 1.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new PlayerButtonsSpeedState(f10, !z6);
    }

    public static final SkipDuration PlayerScreenUI$lambda$44$0$18$1$0$2$11$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getInAppForwardSeekDuration();
    }

    public static final SkipDuration PlayerScreenUI$lambda$44$0$18$1$0$2$12$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getInAppBackwardSeekDuration();
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$13$0(ho.l lVar) {
        lVar.invoke(new b1(1));
        lVar.invoke(new b1(2));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$13$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$13$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.bookmarkCurrentParagraph();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$14$0(ho.l lVar) {
        lVar.invoke(new y0(0));
        lVar.invoke(new y0(1));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$14$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$14$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.seekBack();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$15$0(ho.l lVar) {
        lVar.invoke(new y0(16));
        lVar.invoke(new y0(17));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$15$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$15$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.seekForward();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$16$0(ho.l lVar) {
        lVar.invoke(new b1(3));
        lVar.invoke(new b1(4));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$16$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$16$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onTogglePlayPause();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$17$0(ho.l lVar) {
        lVar.invoke(new y0(13));
        lVar.invoke(new y0(14));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$17$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$17$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSelectSpeedClick();
        return sn.z.f31622a;
    }

    public static final String PlayerScreenUI$lambda$44$0$18$1$0$2$18$0(PlayerState playerState) {
        playerState.getClass();
        Voice voiceUsed = playerState.getVoiceUsed();
        if (voiceUsed != null) {
            return voiceUsed.getVoiceId();
        }
        return null;
    }

    public static final String PlayerScreenUI$lambda$44$0$18$1$0$2$19$0(PlayerState playerState) {
        ReadMeta readMeta;
        OriginalVoice originalVoice;
        String imageUrl;
        playerState.getClass();
        Voice voiceUsed = playerState.getVoiceUsed();
        if (voiceUsed != null && (imageUrl = voiceUsed.getImageUrl()) != null) {
            return imageUrl;
        }
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null && (originalVoice = readMeta.getOriginalVoice()) != null) {
            return originalVoice.getImageUrl();
        }
        return null;
    }

    public static final SkipDuration PlayerScreenUI$lambda$44$0$18$1$0$2$2$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getInAppForwardSeekDuration();
    }

    public static final PlayerAdditionalActionsSoundscapesState PlayerScreenUI$lambda$44$0$18$1$0$2$20$0(PlayerState playerState) {
        playerState.getClass();
        if (playerState.isSoundscapeEnabled()) {
            return PlayerAdditionalActionsSoundscapesState.Enabled;
        }
        return PlayerAdditionalActionsSoundscapesState.Disabled;
    }

    public static final boolean PlayerScreenUI$lambda$44$0$18$1$0$2$21$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShouldShowPagerTeaser();
    }

    public static final PlayerButtonsSleepTimerState PlayerScreenUI$lambda$44$0$18$1$0$2$22$0(PlayerState playerState) {
        playerState.getClass();
        if (playerState.getSleepTimerDate() != null) {
            return PlayerButtonsSleepTimerState.Active;
        }
        return PlayerButtonsSleepTimerState.NotSet;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$23$0(ho.l lVar, ho.a aVar, ir.z1 z1Var) {
        lVar.invoke(new b1(5));
        lVar.invoke(new n0(z1Var, 2));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$23$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$23$0$1(ir.z1 z1Var, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        logVoicePickerOpened(playerViewModel, (PlayerState) z1Var.getValue(), Analytics.Event.PlayerActionSource.BottomBar);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$24$0(ho.l lVar) {
        lVar.invoke(new j0(15));
        lVar.invoke(new j0(16));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$24$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$24$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.onContentsClick$default(playerViewModel, null, 1, null);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$25$0(ho.l lVar, ir.z1 z1Var, ho.a aVar) {
        lVar.invoke(new s0(28));
        lVar.invoke(new d2(z1Var, aVar, 8));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$25$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$25$0$1(ir.z1 z1Var, ho.a aVar, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.SoundscapesClickedPlayerSheetButton(((PlayerState) z1Var.getValue()).getReadId(), Analytics.Event.PlayerActionSource.BottomBar));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$26$0(ho.l lVar, u2.z0 z0Var) {
        lVar.invoke(new j0(21));
        PlayerScreenUI$lambda$23(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$26$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$27$0(ho.l lVar) {
        lVar.invoke(new j0(17));
        lVar.invoke(new j0(18));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$27$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$27$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onToggleShowQueue();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$28$0(ho.l lVar) {
        lVar.invoke(new y0(9));
        lVar.invoke(new y0(10));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$28$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.resetControlsTimer();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$28$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSleepTimerClick(Analytics.Event.SleepTimerSource.BottomBar);
        return sn.z.f31622a;
    }

    public static final SkipDuration PlayerScreenUI$lambda$44$0$18$1$0$2$3$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getInAppBackwardSeekDuration();
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$4$0(ho.l lVar) {
        lVar.invoke(new y0(11));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$4$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.beginControlsInteraction();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$5$0(ho.l lVar, PlaybackPosition playbackPosition) {
        playbackPosition.getClass();
        lVar.invoke(new o0(playbackPosition, 0));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$5$0$0(PlaybackPosition playbackPosition, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSeek(playbackPosition);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$6$0(ho.l lVar, PlaybackPosition playbackPosition) {
        playbackPosition.getClass();
        lVar.invoke(new o0(playbackPosition, 1));
        lVar.invoke(new y0(2));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$6$0$0(PlaybackPosition playbackPosition, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSeekEnded(playbackPosition);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$6$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.endControlsInteraction();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$7$0(ho.l lVar) {
        lVar.invoke(new y0(15));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$7$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.seekBack();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$8$0(ho.l lVar) {
        lVar.invoke(new y0(6));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$8$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.seekForward();
        return sn.z.f31622a;
    }

    public static final PlayerButtonsPlayButtonState PlayerScreenUI$lambda$44$0$18$1$0$2$9$0(PlayerState playerState) {
        playerState.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[playerState.getPlayer().getConnectionState().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 == 5) {
                        return PlayerButtonsPlayButtonState.RequiresRestart;
                    }
                    c6.p();
                    return null;
                }
                if (playerState.getPlayer().isPlayingWhenReady()) {
                    return PlayerButtonsPlayButtonState.Playing;
                }
                return PlayerButtonsPlayButtonState.Paused;
            }
            return PlayerButtonsPlayButtonState.Loading;
        }
        return PlayerButtonsPlayButtonState.Paused;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$2$0(p4.b0 b0Var) {
        b0Var.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$3$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenUI$lambda$44$0$4$0$0(PlayerState playerState) {
        ReadMeta readMeta;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState == null || (readMeta = contentState.getReadMeta()) == null || !readMeta.getFromUserImport()) {
            return false;
        }
        return true;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1(ir.z1 z1Var, UserConfig.PlayerConfig playerConfig, float f10, float f11, ho.l lVar, t1.z zVar, boolean z6, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new b1(0);
                qVar.h0(L);
            }
            HighlighterData highlighterData = (HighlighterData) ComposeExtensionsKt.selectAsState(z1Var, (ho.l) L, qVar, 48).getValue();
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new b1(20);
                qVar.h0(L2);
            }
            ir.z1 mapState = FlowExtensionsKt.mapState(z1Var, (ho.l) L2);
            r1.y1 y1Var = new r1.y1(f10, f11);
            boolean f12 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f12 || L3 == eVar) {
                L3 = new v0(lVar, 9);
                qVar.h0(L3);
            }
            ho.a aVar = (ho.a) L3;
            boolean f13 = qVar.f(lVar);
            Object L4 = qVar.L();
            if (f13 || L4 == eVar) {
                L4 = new t(lVar, 13);
                qVar.h0(L4);
            }
            ho.l lVar2 = (ho.l) L4;
            boolean f14 = qVar.f(lVar);
            Object L5 = qVar.L();
            if (f14 || L5 == eVar) {
                L5 = new t(lVar, 15);
                qVar.h0(L5);
            }
            ho.l lVar3 = (ho.l) L5;
            boolean f15 = qVar.f(lVar);
            Object L6 = qVar.L();
            if (f15 || L6 == eVar) {
                L6 = new t(lVar, 5);
                qVar.h0(L6);
            }
            ho.l lVar4 = (ho.l) L6;
            c3.j d10 = c3.k.d(713476846, true, new fm.o(z1Var, playerConfig, lVar, 14), qVar);
            boolean f16 = qVar.f(lVar);
            Object L7 = qVar.L();
            if (f16 || L7 == eVar) {
                L7 = new l(lVar, 20);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            boolean f17 = qVar.f(lVar);
            Object L8 = qVar.L();
            if (f17 || L8 == eVar) {
                L8 = new l(lVar, 21);
                qVar.h0(L8);
            }
            ho.a aVar3 = (ho.a) L8;
            boolean f18 = qVar.f(lVar);
            Object L9 = qVar.L();
            if (f18 || L9 == eVar) {
                L9 = new t(lVar, 8);
                qVar.h0(L9);
            }
            ho.l lVar5 = (ho.l) L9;
            boolean f19 = qVar.f(lVar);
            Object L10 = qVar.L();
            if (f19 || L10 == eVar) {
                L10 = new v0(lVar, 7);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            boolean f20 = qVar.f(lVar);
            Object L11 = qVar.L();
            if (f20 || L11 == eVar) {
                L11 = new t(lVar, 9);
                qVar.h0(L11);
            }
            HighlighterKt.Highlighter(highlighterData, playerConfig, mapState, aVar, lVar2, lVar3, lVar4, d10, null, y1Var, zVar, z6, aVar2, aVar3, lVar5, aVar4, (ho.l) L11, qVar, HighlighterData.$stable | 12582912, 0, RpcError.MAX_MESSAGE_BYTES);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final HighlighterData PlayerScreenUI$lambda$44$0$4$1$0$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getHighlighterData();
    }

    public static final HighlighterPosition PlayerScreenUI$lambda$44$0$4$1$1$0(PlayerState playerState) {
        PlaybackPosition playbackPosition;
        String str;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            playbackPosition = contentState.getPosition();
        } else {
            playbackPosition = null;
        }
        if (playbackPosition == null) {
            return null;
        }
        if (playbackPosition instanceof PlaybackPosition.Tts) {
            return new HighlighterPosition.Character(((PlaybackPosition.Tts) playbackPosition).getOffset());
        }
        if (playbackPosition instanceof PlaybackPosition.AudioOnly) {
            Chapter currentChapter = playerState.getContentState().getCurrentChapter();
            if (currentChapter != null) {
                str = currentChapter.getAudioFileNumber();
            } else {
                str = null;
            }
            if (str == null) {
                return null;
            }
            return new HighlighterPosition.Time(str, ((PlaybackPosition.AudioOnly) playbackPosition).getSeconds());
        }
        c6.p();
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$10$0(ho.l lVar) {
        lVar.invoke(new s0(29));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$10$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onBackgroundTap();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$11$0(ho.l lVar, int i10) {
        lVar.invoke(new io.elevenlabs.highlighter.t(i10, 11));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$11$0$0(int i10, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onCurrentChapterChanged(i10);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$2$0(ho.l lVar) {
        lVar.invoke(new s0(8));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$2$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onUserScrolled();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$3$0(ho.l lVar, WordTapTarget wordTapTarget) {
        wordTapTarget.getClass();
        lVar.invoke(new u1(wordTapTarget, 12));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$3$0$0(WordTapTarget wordTapTarget, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onWordClickWithPreferenceCheck(wordTapTarget);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$4$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new y1(str, 11));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$4$0$0(String str, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.openImage(str);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$5$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new y1(str, 10));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$5$0$0(String str, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onBookmarkClick(str);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$6(ir.z1 z1Var, UserConfig.PlayerConfig playerConfig, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new y0(18);
                qVar.h0(L);
            }
            ir.z1 mapState = FlowExtensionsKt.mapState(z1Var, (ho.l) L);
            boolean f10 = qVar.f(lVar);
            Object L2 = qVar.L();
            if (f10 || L2 == eVar) {
                L2 = new v0(lVar, 6);
                qVar.h0(L2);
            }
            ContentHeaderKt.ContentHeader(mapState, playerConfig, (ho.a) L2, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final ReadMeta PlayerScreenUI$lambda$44$0$4$1$6$0$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getReadMeta();
        }
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$6$1$0(ho.l lVar) {
        lVar.invoke(new j0(22));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$6$1$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.onRenameClick$default(playerViewModel, null, 1, null);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$7$0(ho.l lVar) {
        lVar.invoke(new y0(29));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$7$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.onShareClick$default(playerViewModel, null, 1, null);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$8$0(ho.l lVar) {
        lVar.invoke(new y0(5));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$8$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onGetTheFullReadClick();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$9$0(ho.l lVar, boolean z6) {
        if (z6) {
            lVar.invoke(new j0(23));
        } else {
            lVar.invoke(new j0(24));
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$9$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.showControls();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$0$4$1$9$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.hideControls();
        return sn.z.f31622a;
    }

    public static final boolean PlayerScreenUI$lambda$44$0$5$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.isLoadingContent();
    }

    public static final boolean PlayerScreenUI$lambda$44$0$6$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.isLoadingHtmlContent();
    }

    public static final String PlayerScreenUI$lambda$44$0$9$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getError();
    }

    public static final String PlayerScreenUI$lambda$44$1$0(PlayerState playerState) {
        ReadMeta readMeta;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null) {
            return readMeta.getReadId();
        }
        return null;
    }

    public static final boolean PlayerScreenUI$lambda$44$10$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowContentsButton();
    }

    public static final boolean PlayerScreenUI$lambda$44$11$0(PlayerState playerState) {
        ContentState contentState;
        ReadMeta readMeta;
        playerState.getClass();
        if (playerState.isVoiceAgentFloatingButtonEnabled() && (contentState = playerState.getContentState()) != null && (readMeta = contentState.getReadMeta()) != null && readMeta.getCanUseAssistant() && !ReadMetaKt.isMediaType(playerState.getContentState().getReadMeta())) {
            return true;
        }
        return false;
    }

    public static final String PlayerScreenUI$lambda$44$12$0(PlayerState playerState) {
        playerState.getClass();
        Voice voiceUsed = playerState.getVoiceUsed();
        if (voiceUsed != null) {
            return voiceUsed.getVoiceId();
        }
        return null;
    }

    public static final String PlayerScreenUI$lambda$44$13$0(PlayerState playerState) {
        ReadMeta readMeta;
        OriginalVoice originalVoice;
        String imageUrl;
        playerState.getClass();
        Voice voiceUsed = playerState.getVoiceUsed();
        if (voiceUsed != null && (imageUrl = voiceUsed.getImageUrl()) != null) {
            return imageUrl;
        }
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null && (originalVoice = readMeta.getOriginalVoice()) != null) {
            return originalVoice.getImageUrl();
        }
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$14$0(u2.z0 z0Var) {
        PlayerScreenUI$lambda$20(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$15$0(ho.l lVar, ReadMeta readMeta, ho.l lVar2, Analytics.Event.PlayerActionSource playerActionSource) {
        String readId;
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 2));
        SampleConfig sampleConfig = readMeta.getSampleConfig();
        if (sampleConfig != null && sampleConfig.isSample()) {
            SampleConfig sampleConfig2 = readMeta.getSampleConfig();
            if (sampleConfig2 != null) {
                readId = sampleConfig2.getParentId();
            } else {
                readId = null;
            }
        } else {
            readId = readMeta.getReadId();
        }
        if (readId != null) {
            lVar2.invoke(readId);
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$15$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedViewDetails(playerActionSource));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$16$0(ho.l lVar, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 5));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$16$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onRateTitleClick(playerActionSource);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$17$0(ho.l lVar, ir.z1 z1Var, ho.l lVar2, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 8));
        String readId = ((PlayerState) z1Var.getValue()).getReadId();
        if (readId != null) {
            lVar2.invoke(readId);
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$17$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedAddToCollection(playerActionSource));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$18$0(ho.l lVar, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 0));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$18$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onBookmarksClick(playerActionSource);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$19$0(ho.l lVar) {
        lVar.invoke(new y0(28));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$19$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onSleepTimerClick(Analytics.Event.SleepTimerSource.OverflowMenu);
        return sn.z.f31622a;
    }

    public static final String PlayerScreenUI$lambda$44$2$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getUsedVoiceId();
        }
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$20$0(ho.l lVar, u2.z0 z0Var, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 7));
        PlayerScreenUI$lambda$26(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$20$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedReportIssue(playerActionSource));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$21$0(ho.l lVar, ho.a aVar, ir.z1 z1Var) {
        lVar.invoke(new n0(z1Var, 1));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$21$0$0(ir.z1 z1Var, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        logVoicePickerOpened(playerViewModel, (PlayerState) z1Var.getValue(), Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$22$0(ho.l lVar, ho.a aVar, ir.z1 z1Var) {
        lVar.invoke(new n0(z1Var, 0));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$22$0$0(ir.z1 z1Var, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.SoundscapesClickedPlayerSheetButton(((PlayerState) z1Var.getValue()).getReadId(), Analytics.Event.PlayerActionSource.ActionsSheetMenuItem));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$23$0(ho.l lVar, ho.a aVar) {
        lVar.invoke(new y0(12));
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$23$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(Analytics.Event.PlayerClickedPronunciationsOption.INSTANCE);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$24$0(ho.l lVar, DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        lVar.invoke(new d2(downloadAction, playerActionSource, 10));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$24$0$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.handleDownloadAction(downloadAction, playerActionSource);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$25$0(ho.l lVar, PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        lVar.invoke(new d2(playerDisplayMode, playerActionSource, 9));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$25$0$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onChangeDisplayMode(playerDisplayMode, playerActionSource);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$26$0(ho.l lVar, u2.z0 z0Var, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 1));
        PlayerScreenUI$lambda$23(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$26$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedSearchButton(playerActionSource));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$27$0(ho.l lVar, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 6));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$27$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onContentsClick(playerActionSource);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$28$0(ho.l lVar, ho.l lVar2, String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 9));
        lVar2.invoke(str);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$28$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedOpenInBrowser(playerActionSource));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$29$0(ho.l lVar, ir.z1 z1Var, u2.z0 z0Var, u2.z0 z0Var2, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 4));
        PlayerScreenUI$lambda$32(z0Var, ((PlayerState) z1Var.getValue()).getPlayer().isPlayingWhenReady());
        if (PlayerScreenUI$lambda$31(z0Var)) {
            lVar.invoke(new y0(23));
        }
        PlayerScreenUI$lambda$29(z0Var2, true);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$29$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedVoiceChat(playerActionSource));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$29$0$1(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onTogglePlayPause();
        return sn.z.f31622a;
    }

    public static final Long PlayerScreenUI$lambda$44$3$0(PlayerState playerState) {
        PlaybackPosition playbackPosition;
        PlaybackPosition.Tts tts;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            playbackPosition = contentState.getPosition();
        } else {
            playbackPosition = null;
        }
        if (playbackPosition instanceof PlaybackPosition.Tts) {
            tts = (PlaybackPosition.Tts) playbackPosition;
        } else {
            tts = null;
        }
        if (tts == null) {
            return null;
        }
        return Long.valueOf(tts.getOffset());
    }

    public static final sn.z PlayerScreenUI$lambda$44$30$0(ho.l lVar, Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        lVar.invoke(new m0(playerActionSource, 3));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$30$0$0(Analytics.Event.PlayerActionSource playerActionSource, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onShareClick(playerActionSource);
        return sn.z.f31622a;
    }

    public static final String PlayerScreenUI$lambda$44$4$0(PlayerState playerState) {
        ReadMeta readMeta;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null) {
            return readMeta.getTitle();
        }
        return null;
    }

    public static final String PlayerScreenUI$lambda$44$5$0(PlayerState playerState) {
        ReadMeta readMeta;
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null && (readMeta = contentState.getReadMeta()) != null) {
            return readMeta.getAuthor();
        }
        return null;
    }

    public static final sn.z PlayerScreenUI$lambda$44$6$0(ho.l lVar, u2.z0 z0Var, u2.z0 z0Var2) {
        PlayerScreenUI$lambda$29(z0Var, false);
        if (PlayerScreenUI$lambda$31(z0Var2)) {
            lVar.invoke(new y0(8));
            PlayerScreenUI$lambda$32(z0Var2, false);
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$44$6$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onTogglePlayPause();
        return sn.z.f31622a;
    }

    public static final ReadMeta PlayerScreenUI$lambda$44$7$0(PlayerState playerState) {
        playerState.getClass();
        ContentState contentState = playerState.getContentState();
        if (contentState != null) {
            return contentState.getReadMeta();
        }
        return null;
    }

    public static final boolean PlayerScreenUI$lambda$44$8$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getCanUpgrade();
    }

    public static final boolean PlayerScreenUI$lambda$44$9$0(PlayerState playerState) {
        playerState.getClass();
        return playerState.getShowSearchButton();
    }

    public static final sn.z PlayerScreenUI$lambda$45(ir.z1 z1Var, ho.r rVar, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.a aVar4, ir.i iVar, boolean z6, int i10, int i11, int i12, u2.m mVar, int i13) {
        PlayerScreenUI(z1Var, rVar, lVar, aVar, aVar2, aVar3, lVar2, lVar3, lVar4, aVar4, iVar, z6, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$5$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerScreenUI$lambda$6$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final u2.x0 PlayerScreenUI$lambda$8$0() {
        return new u2.f1(250);
    }

    private static final int PlayerScreenUI$lambda$9(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void logVoicePickerOpened(PlayerViewModel playerViewModel, PlayerState playerState, Analytics.Event.PlayerActionSource playerActionSource) {
        String str;
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerOpenedVoicePicker(playerActionSource));
        ContentState contentState = playerState.getContentState();
        if (contentState != null && playerState.isVoiceChangerEnabled() && ReadMetaKt.getSupportsVoiceChanger(contentState.getReadMeta())) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[PlayerStateKt.effectivePlaybackMode(contentState).ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    str = "tts";
                } else {
                    c6.p();
                    return;
                }
            } else {
                str = "media";
            }
            playerViewModel.getAnalytics().log(new Analytics.Event.VoiceChangerPickerShown(contentState.getReadMeta().getReadId(), playerActionSource, str, contentState.getUsedVoiceId()));
        }
    }
}
