package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerScreenKt$PlayerScreenUI$9$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1;
import io.livekit.android.rpc.RpcError;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16196a;

    public /* synthetic */ i1(int i10) {
        this.f16196a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState copy$default;
        sn.p invokeSuspend$lambda$2;
        PlayerState invokeSuspend$lambda$0;
        PlayerState invokeSuspend$lambda$02;
        PlayerState copy;
        PlayerState invokeSuspend$lambda$1;
        PlayerState copy$default2;
        PlayerState copy$default3;
        ReadMeta AudioOnlyPlayerUi_rAjV9yQ$lambda$0$0;
        sn.z lambda__702544447$lambda$0$2$0;
        sn.z lambda__702544447$lambda$0$3$0;
        sn.z lambda__702544447$lambda$0$4$0;
        sn.z lambda__702544447$lambda$0$6$0;
        sn.z lambda__702544447$lambda$0$8$0;
        sn.z lambda__702544447$lambda$0$9$0;
        sn.z lambda__702544447$lambda$0$10$0;
        sn.z lambda_476196047$lambda$0$0$0;
        switch (this.f16196a) {
            case 0:
                return PlayerScreenKt$PlayerScreenUI$10$1.h((PlayerViewModel) obj);
            case 1:
                return PlayerScreenKt$PlayerScreenUI$10$1.d((PlayerViewModel) obj);
            case 2:
                return PlayerScreenKt$PlayerScreenUI$9$1.AnonymousClass1.b((PlayerViewModel) obj);
            case 3:
                return PlayerScreenKt$PlayerScreenUI$9$1.AnonymousClass1.a((PlayerViewModel) obj);
            case 4:
                copy$default = PlayerState.copy$default((PlayerState) obj, null, null, false, false, 0, null, null, null, false, false, false, false, null, null, false, null, false, null, false, false, false, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, null, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, true, false, 0, false, false, null, null, -1, 266338303, null);
                return copy$default;
            case 5:
                invokeSuspend$lambda$2 = PlayerViewModel.AnonymousClass23.invokeSuspend$lambda$2((ContentState) obj);
                return invokeSuspend$lambda$2;
            case 6:
                invokeSuspend$lambda$0 = PlayerViewModel.AnonymousClass23.AnonymousClass5.invokeSuspend$lambda$0((PlayerState) obj);
                return invokeSuspend$lambda$0;
            case 7:
                invokeSuspend$lambda$02 = PlayerViewModel$createBookmarkWithToast$1$1.invokeSuspend$lambda$0((PlayerState) obj);
                return invokeSuspend$lambda$02;
            case 8:
                return PlayerViewModel$delete$1$1.d((PlayerState) obj);
            case 9:
                return PlayerViewModel$handleDownloadAction$1.d((PlayerState) obj);
            case 10:
                copy = r3.copy((r85 & 1) != 0 ? r3.readId : null, (r85 & 2) != 0 ? r3.player : null, (r85 & 4) != 0 ? r3.isLoadingContent : false, (r85 & 8) != 0 ? r3.isLoadingHtmlContent : false, (r85 & 16) != 0 ? r3.htmlLoadingProgress : 0, (r85 & 32) != 0 ? r3.highlighterData : null, (r85 & 64) != 0 ? r3.wordOffsets : null, (r85 & 128) != 0 ? r3.error : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r3.canUpgrade : false, (r85 & 512) != 0 ? r3.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r3.isSeeking : false, (r85 & 2048) != 0 ? r3.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? r3.contentState : null, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r3.fullScreenImageSrc : null, (r85 & 16384) != 0 ? r3.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r3.toastMessage : null, (r85 & 65536) != 0 ? r3.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? r3.purchaseHoursContext : null, (r85 & 262144) != 0 ? r3.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? r3.navigateToPaywall : false, (r85 & 1048576) != 0 ? r3.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? r3.sleepTimerDate : null, (r85 & 4194304) != 0 ? r3.voiceUsed : null, (r85 & 8388608) != 0 ? r3.configuration : null, (r85 & 16777216) != 0 ? r3.playerConfig : null, (r85 & 33554432) != 0 ? r3.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? r3.showContentsDialog : false, (r85 & 134217728) != 0 ? r3.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? r3.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? r3.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? r3.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? r3.showExportDialog : false, (r86 & 1) != 0 ? r3.showRenameDialog : false, (r86 & 2) != 0 ? r3.showRatingDialog : false, (r86 & 4) != 0 ? r3.showSleepTimerDialog : false, (r86 & 8) != 0 ? r3.showShareOptionsSheet : false, (r86 & 16) != 0 ? r3.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? r3.currentDate : null, (r86 & 64) != 0 ? r3.showBookmarksDialog : false, (r86 & 128) != 0 ? r3.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r3.clickedBookmarkId : null, (r86 & 512) != 0 ? r3.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r3.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? r3.editBookmarkId : null, (r86 & 4096) != 0 ? r3.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r3.showQueue : false, (r86 & 16384) != 0 ? r3.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r3.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? r3.pronunciations : null, (r86 & 131072) != 0 ? r3.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? r3.pronunciationPreviewState : null, (r86 & 524288) != 0 ? r3.undoSeek : null, (r86 & 1048576) != 0 ? r3.currentSoundscapeId : null, (r86 & 2097152) != 0 ? r3.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? r3.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? r3.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? r3.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? r3.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? r3.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? ((PlayerState) obj).inAppBackwardSeekDuration : null);
                return copy;
            case 11:
                invokeSuspend$lambda$1 = PlayerViewModel$load$1$1.AnonymousClass1.invokeSuspend$lambda$1((PlayerState) obj);
                return invokeSuspend$lambda$1;
            case 12:
                copy$default2 = PlayerState.copy$default((PlayerState) obj, null, null, false, false, 0, null, null, null, false, false, false, false, null, null, false, null, false, null, false, true, false, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, null, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -524289, 268435455, null);
                return copy$default2;
            case 13:
                copy$default3 = PlayerState.copy$default((PlayerState) obj, null, null, false, false, 0, null, null, null, false, false, false, false, null, null, false, null, false, null, false, false, false, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, null, null, false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -9, 268435455, null);
                return copy$default3;
            case 14:
                return PlayerViewModel$maybeStartControlsTimer$1.d((PlayerState) obj);
            case 15:
                return PlayerViewModel$onAudioSeekEnded$1.d((PlayerState) obj);
            case 16:
                return PlayerViewModel$onTtsSeek$1$2.d((PlayerState) obj);
            case 17:
                return PlayerViewModel$rename$1$1.d((PlayerState) obj);
            case 18:
                return PlayerViewModel$seekToBookmark$1.h((PlayerState) obj);
            case 19:
                return PlayerViewModel$seekToOffset$1.h((PlayerState) obj);
            case 20:
                return PlayerViewModel$seekToOffset$1.d((PlayerState) obj);
            case 21:
                AudioOnlyPlayerUi_rAjV9yQ$lambda$0$0 = AudioOnlyPlayerUiKt.AudioOnlyPlayerUi_rAjV9yQ$lambda$0$0((ReadMeta) obj);
                return AudioOnlyPlayerUi_rAjV9yQ$lambda$0$0;
            case 22:
                lambda__702544447$lambda$0$2$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__702544447$lambda$0$2$0(((Long) obj).longValue());
                return lambda__702544447$lambda$0$2$0;
            case 23:
                lambda__702544447$lambda$0$3$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__702544447$lambda$0$3$0((PlayerTheme) obj);
                return lambda__702544447$lambda$0$3$0;
            case 24:
                lambda__702544447$lambda$0$4$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__702544447$lambda$0$4$0((BluetoothButton) obj);
                return lambda__702544447$lambda$0$4$0;
            case 25:
                lambda__702544447$lambda$0$6$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__702544447$lambda$0$6$0((InAppSkipDirection) obj);
                return lambda__702544447$lambda$0$6$0;
            case 26:
                lambda__702544447$lambda$0$8$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__702544447$lambda$0$8$0(((Boolean) obj).booleanValue());
                return lambda__702544447$lambda$0$8$0;
            case 27:
                lambda__702544447$lambda$0$9$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__702544447$lambda$0$9$0(((Boolean) obj).booleanValue());
                return lambda__702544447$lambda$0$9$0;
            case 28:
                lambda__702544447$lambda$0$10$0 = ComposableSingletons$PlayerPreferencesScreenKt.lambda__702544447$lambda$0$10$0((PlayerFontFamily) obj);
                return lambda__702544447$lambda$0$10$0;
            default:
                lambda_476196047$lambda$0$0$0 = ComposableSingletons$PlayerScreenPreviewsKt.lambda_476196047$lambda$0$0$0((ho.l) obj);
                return lambda_476196047$lambda$0$0$0;
        }
    }
}
