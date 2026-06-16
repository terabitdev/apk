package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ChapterUtilsKt;
import io.elevenlabs.domain.model.EffectivePlaybackMode;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.highlighter.HighlighterData;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlaybackPosition;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$seekToOffset$1", f = "PlayerViewModel.kt", l = {1439, 1460}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$seekToOffset$1 extends yn.i implements ho.p {
    final /* synthetic */ long $offset;
    double D$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EffectivePlaybackMode.values().length];
            try {
                iArr[EffectivePlaybackMode.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EffectivePlaybackMode.Tts.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$seekToOffset$1(PlayerViewModel playerViewModel, long j4, wn.c<? super PlayerViewModel$seekToOffset$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$offset = j4;
    }

    public static final PlayerState invokeSuspend$lambda$1(PlayerState playerState) {
        PlayerState copy;
        copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : false, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : HighlighterData.copy$default(playerState.getHighlighterData(), null, true, null, null, 13, null), (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : true, (r85 & 4096) != 0 ? playerState.contentState : null, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
        return copy;
    }

    public static final PlayerState invokeSuspend$lambda$2(ContentState contentState, long j4, PlayerState playerState) {
        ContentState contentState2;
        PlayerState copy;
        if (contentState != null) {
            contentState2 = ContentState.copy$default(contentState, null, new PlaybackPosition.Tts(j4), null, false, false, null, 61, null);
        } else {
            contentState2 = null;
        }
        copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : false, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : null, (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? playerState.contentState : contentState2, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
        return copy;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$seekToOffset$1(this.this$0, this.$offset, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$seekToOffset$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r9.seekToCharacterOffset(r5, r8) == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        if (r9 == r4) goto L58;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EffectivePlaybackMode effectivePlaybackMode;
        Object seekToAudioFileTime;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            ContentState contentState = ((PlayerState) this.this$0.getStateFlow().getValue()).getContentState();
            if (contentState == null || (effectivePlaybackMode = EffectivePlaybackModeKt.effectivePlaybackMode(contentState.getReadMeta(), contentState.getUsedVoiceId())) == null) {
                effectivePlaybackMode = EffectivePlaybackMode.Tts;
            }
            this.this$0.queueStateUpdate(new i1(19));
            int i11 = WhenMappings.$EnumSwitchMapping$0[effectivePlaybackMode.ordinal()];
            xn.a aVar = xn.a.f37986a;
            if (i11 != 1) {
                if (i11 == 2) {
                    this.this$0.queueStateUpdate(new f2(contentState, this.$offset, 0));
                    PlayerService playerService = (PlayerService) this.this$0.playerService.get();
                    long j4 = this.$offset;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                } else {
                    c6.p();
                    return null;
                }
            } else {
                contentState.getClass();
                sn.k charOffsetToAudioPosition = ChapterUtilsKt.charOffsetToAudioPosition(contentState.getReadMeta().getChapters(), this.$offset);
                if (charOffsetToAudioPosition != null) {
                    String str = (String) charOffsetToAudioPosition.f31600a;
                    double doubleValue = ((Number) charOffsetToAudioPosition.f31601b).doubleValue();
                    PlayerViewModel playerViewModel = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.D$0 = doubleValue;
                    this.label = 1;
                    seekToAudioFileTime = playerViewModel.seekToAudioFileTime(str, doubleValue, this);
                } else {
                    Logger.logWarning$default(this.this$0.logger, this.this$0.tag, android.gov.nist.javax.sip.header.a.k("seekToOffset: cannot convert char offset ", this.$offset, " to audio position (missing chapter metadata) — skipping audio seek"), null, 4, null);
                }
            }
        }
        this.this$0.queueStateUpdate(new i1(20));
        return sn.z.f31622a;
    }
}
