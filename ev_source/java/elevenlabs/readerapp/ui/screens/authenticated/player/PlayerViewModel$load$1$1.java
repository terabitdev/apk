package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.exceptions.ContentLicenseException;
import io.elevenlabs.domain.exceptions.SubscriptionRequiredException;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.DisplayMode;
import io.elevenlabs.domain.model.EffectivePlaybackMode;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1", f = "PlayerViewModel.kt", l = {1015}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$load$1$1 extends yn.i implements ho.p {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ Integer $startAtChapter;
    final /* synthetic */ PlayerState $this_queueStateUpdate;
    final /* synthetic */ String $voiceId;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1$1", f = "PlayerViewModel.kt", l = {1021, 1021, 1032, 1038, 1059, 1106}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.l {
        final /* synthetic */ boolean $forceRefresh;
        final /* synthetic */ Integer $startAtChapter;
        final /* synthetic */ PlayerState $this_queueStateUpdate;
        final /* synthetic */ String $voiceId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ PlayerViewModel this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1$1$4", f = "PlayerViewModel.kt", l = {1112, 1119}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1$1$4 */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass4 extends yn.i implements ho.l {
            final /* synthetic */ kotlin.jvm.internal.d0 $readMeta;
            final /* synthetic */ PlayerState $this_queueStateUpdate;
            int label;
            final /* synthetic */ PlayerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(kotlin.jvm.internal.d0 d0Var, PlayerViewModel playerViewModel, PlayerState playerState, wn.c<? super AnonymousClass4> cVar) {
                super(1, cVar);
                this.$readMeta = d0Var;
                this.this$0 = playerViewModel;
                this.$this_queueStateUpdate = playerState;
            }

            @Override // yn.a
            public final wn.c<sn.z> create(wn.c<?> cVar) {
                return new AnonymousClass4(this.$readMeta, this.this$0, this.$this_queueStateUpdate, cVar);
            }

            @Override // ho.l
            public final Object invoke(wn.c<Object> cVar) {
                return ((AnonymousClass4) create(cVar)).invokeSuspend(sn.z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
            
                if (r7 == r5) goto L55;
             */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object loadHtmlContent;
                Object loadHtmlContent2;
                int i10 = this.label;
                sn.z zVar = sn.z.f31622a;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                sn.a.g(obj);
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                        return zVar;
                    }
                    sn.a.g(obj);
                    DisplayMode displayMode = ((ReadMeta) this.$readMeta.f20559a).getDisplayMode();
                    DisplayMode displayMode2 = DisplayMode.AudioOnly;
                    PlayerViewModel playerViewModel = this.this$0;
                    xn.a aVar = xn.a.f37986a;
                    if (displayMode != displayMode2) {
                        PlayerState playerState = this.$this_queueStateUpdate;
                        List<Chapter> chapters = ((ReadMeta) this.$readMeta.f20559a).getChapters();
                        this.label = 1;
                        loadHtmlContent2 = playerViewModel.loadHtmlContent(playerState, chapters, this);
                        if (loadHtmlContent2 != aVar) {
                            return zVar;
                        }
                    } else {
                        boolean isSearchInAudioEnabled = ((PlayerState) playerViewModel.getStateFlow().getValue()).isSearchInAudioEnabled();
                        PlayerViewModel playerViewModel2 = this.this$0;
                        if (isSearchInAudioEnabled) {
                            PlayerState playerState2 = this.$this_queueStateUpdate;
                            List<Chapter> chapters2 = ((ReadMeta) this.$readMeta.f20559a).getChapters();
                            this.label = 2;
                            loadHtmlContent = playerViewModel2.loadHtmlContent(playerState2, chapters2, this);
                        } else {
                            playerViewModel2.logger.log(this.this$0.tag, "Skipping HTML content load for audio-only read");
                            return zVar;
                        }
                    }
                    return aVar;
                } catch (Exception e10) {
                    ib.i.r("Audio-only read has no HTML content (search-in-audio): ", e10.getMessage(), this.this$0.logger, this.this$0.tag);
                    return this.this$0.queueStateUpdate(new i1(13));
                }
                ib.i.r("Audio-only read has no HTML content (search-in-audio): ", e10.getMessage(), this.this$0.logger, this.this$0.tag);
                return this.this$0.queueStateUpdate(new i1(13));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerViewModel playerViewModel, PlayerState playerState, boolean z6, String str, Integer num, wn.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.this$0 = playerViewModel;
            this.$this_queueStateUpdate = playerState;
            this.$forceRefresh = z6;
            this.$voiceId = str;
            this.$startAtChapter = num;
        }

        public static final PlayerState invokeSuspend$lambda$0(PlayerViewModel playerViewModel, AsyncCallResult asyncCallResult, PlayerState playerState) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            PlayerState copy;
            resolveErrorMessageUseCase = playerViewModel.resolveErrorMessageUseCase;
            copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : false, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : null, (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? playerState.contentState : null, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
            return copy;
        }

        public static final PlayerState invokeSuspend$lambda$1(PlayerState playerState) {
            PlayerState copy;
            copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : false, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : null, (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? playerState.contentState : null, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : playerState.getReadId(), (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
            return copy;
        }

        public static final PlayerState invokeSuspend$lambda$2(kotlin.jvm.internal.d0 d0Var, PlaybackPosition playbackPosition, String str, PlayerViewModel playerViewModel, PlayerState playerState) {
            PlayerDisplayMode playerDisplayMode;
            PlayerState copy;
            ContentState contentState = new ContentState((ReadMeta) d0Var.f20559a, playbackPosition, str, false, false, null, 56, null);
            if (((ReadMeta) d0Var.f20559a).getDisplayMode() == DisplayMode.AudioOnly) {
                playerDisplayMode = PlayerDisplayMode.Audio;
            } else {
                UserConfig.PlayerConfig playerConfig = ((PlayerState) playerViewModel.getStateFlow().getValue()).getPlayerConfig();
                if (playerConfig == null || (playerDisplayMode = playerConfig.getDisplayMode()) == null) {
                    playerDisplayMode = PlayerDisplayMode.Text;
                }
            }
            copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : true, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : null, (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? playerState.contentState : contentState, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : playerDisplayMode, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
            return copy;
        }

        public static final PlayerState invokeSuspend$lambda$4(String str, PlayerState playerState) {
            PlayerState copy;
            copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : false, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : null, (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : str, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? playerState.contentState : null, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
            return copy;
        }

        public static final PlayerState invokeSuspend$lambda$5(String str, PlayerState playerState) {
            PlayerState copy;
            copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : false, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : null, (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : str, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? playerState.contentState : null, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
            return copy;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$this_queueStateUpdate, this.$forceRefresh, this.$voiceId, this.$startAtChapter, cVar);
        }

        @Override // ho.l
        public final Object invoke(wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0257, code lost:
        
            if (r13.logTransaction(r1, "loadContent", r3, r12) != r7) goto L186;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:16:0x01ce A[Catch: all -> 0x0031, Exception -> 0x0034, ContentLicenseException -> 0x0037, SubscriptionRequiredException -> 0x003a, TryCatch #3 {Exception -> 0x0034, blocks: (B:8:0x002c, B:13:0x0041, B:14:0x01c8, B:16:0x01ce, B:17:0x01d6, B:21:0x004a, B:22:0x0152, B:24:0x0158, B:26:0x0170, B:28:0x0174, B:29:0x017c, B:31:0x0186, B:33:0x0192, B:35:0x01a9, B:38:0x0265, B:39:0x026c, B:41:0x0057, B:42:0x00fe, B:44:0x0104, B:46:0x0108, B:48:0x0110, B:52:0x011f, B:57:0x0060, B:58:0x00bd, B:61:0x00d2, B:66:0x0068, B:67:0x00ae, B:71:0x006f, B:73:0x008c), top: B:2:0x000e, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0158 A[Catch: all -> 0x0031, Exception -> 0x0034, ContentLicenseException -> 0x0037, SubscriptionRequiredException -> 0x003a, TRY_LEAVE, TryCatch #3 {Exception -> 0x0034, blocks: (B:8:0x002c, B:13:0x0041, B:14:0x01c8, B:16:0x01ce, B:17:0x01d6, B:21:0x004a, B:22:0x0152, B:24:0x0158, B:26:0x0170, B:28:0x0174, B:29:0x017c, B:31:0x0186, B:33:0x0192, B:35:0x01a9, B:38:0x0265, B:39:0x026c, B:41:0x0057, B:42:0x00fe, B:44:0x0104, B:46:0x0108, B:48:0x0110, B:52:0x011f, B:57:0x0060, B:58:0x00bd, B:61:0x00d2, B:66:0x0068, B:67:0x00ae, B:71:0x006f, B:73:0x008c), top: B:2:0x000e, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0170 A[Catch: all -> 0x0031, Exception -> 0x0034, ContentLicenseException -> 0x0037, SubscriptionRequiredException -> 0x003a, TRY_ENTER, TryCatch #3 {Exception -> 0x0034, blocks: (B:8:0x002c, B:13:0x0041, B:14:0x01c8, B:16:0x01ce, B:17:0x01d6, B:21:0x004a, B:22:0x0152, B:24:0x0158, B:26:0x0170, B:28:0x0174, B:29:0x017c, B:31:0x0186, B:33:0x0192, B:35:0x01a9, B:38:0x0265, B:39:0x026c, B:41:0x0057, B:42:0x00fe, B:44:0x0104, B:46:0x0108, B:48:0x0110, B:52:0x011f, B:57:0x0060, B:58:0x00bd, B:61:0x00d2, B:66:0x0068, B:67:0x00ae, B:71:0x006f, B:73:0x008c), top: B:2:0x000e, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0186 A[Catch: all -> 0x0031, Exception -> 0x0034, ContentLicenseException -> 0x0037, SubscriptionRequiredException -> 0x003a, TryCatch #3 {Exception -> 0x0034, blocks: (B:8:0x002c, B:13:0x0041, B:14:0x01c8, B:16:0x01ce, B:17:0x01d6, B:21:0x004a, B:22:0x0152, B:24:0x0158, B:26:0x0170, B:28:0x0174, B:29:0x017c, B:31:0x0186, B:33:0x0192, B:35:0x01a9, B:38:0x0265, B:39:0x026c, B:41:0x0057, B:42:0x00fe, B:44:0x0104, B:46:0x0108, B:48:0x0110, B:52:0x011f, B:57:0x0060, B:58:0x00bd, B:61:0x00d2, B:66:0x0068, B:67:0x00ae, B:71:0x006f, B:73:0x008c), top: B:2:0x000e, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PlayerViewModel playerViewModel;
            i1 i1Var;
            boolean W;
            String D0;
            kotlin.jvm.internal.d0 d0Var;
            kotlin.jvm.internal.d0 d0Var2;
            PlayerViewModel playerViewModel2;
            i1 i1Var2;
            Object obj2;
            kotlin.jvm.internal.d0 d0Var3;
            AsyncCallResult asyncCallResult;
            String str;
            PlaybackPosition computeInitialPosition;
            int i10 = this.label;
            sn.z zVar = sn.z.f31622a;
            xn.a aVar = xn.a.f37986a;
            try {
                try {
                    try {
                        switch (i10) {
                            case 0:
                                sn.a.g(obj);
                                this.this$0.logger.log(this.this$0.tag, "Loading read");
                                W = wq.u.W(this.$this_queueStateUpdate.getReadId(), "sample-", false);
                                if (W) {
                                    D0 = wq.n.D0(this.$this_queueStateUpdate.getReadId(), "sample-", r13);
                                    ReadsService readsService = (ReadsService) this.this$0.readsService.get();
                                    this.L$0 = null;
                                    this.label = 1;
                                    obj = readsService.isReadInLibrary(D0, this);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                    this.L$0 = null;
                                    this.label = 2;
                                    obj = ir.r.u((ir.i) obj, this);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                    if (((Boolean) obj).booleanValue()) {
                                        playerViewModel2 = this.this$0;
                                        i1Var2 = new i1(10);
                                        playerViewModel2.queueStateUpdate(i1Var2);
                                        return zVar;
                                    }
                                }
                                d0Var = new kotlin.jvm.internal.d0();
                                Logger logger = this.this$0.logger;
                                String str2 = this.this$0.tag;
                                PlayerViewModel$load$1$1$1$readMeta$1 playerViewModel$load$1$1$1$readMeta$1 = new PlayerViewModel$load$1$1$1$readMeta$1(this.this$0, this.$this_queueStateUpdate, null);
                                this.L$0 = d0Var;
                                this.L$1 = d0Var;
                                this.label = 3;
                                obj = logger.logTransaction(str2, "getRead", playerViewModel$load$1$1$1$readMeta$1, this);
                                if (obj != aVar) {
                                    d0Var2 = d0Var;
                                    d0Var.f20559a = obj;
                                    obj2 = d0Var2.f20559a;
                                    if (obj2 != null && !this.$forceRefresh && (((ReadMeta) obj2).getCreationStatus() == null || ((ReadMeta) d0Var2.f20559a).getCreationStatus() == ReadCreationStatus.Finished)) {
                                        d0Var3 = d0Var2;
                                        if (((ReadMeta) d0Var3.f20559a).getCreationStatus() == null && ((ReadMeta) d0Var3.f20559a).getCreationStatus() != ReadCreationStatus.Finished) {
                                            this.this$0.queueStateUpdate(new i1(11));
                                            playerViewModel2 = this.this$0;
                                            i1Var2 = new i1(10);
                                            playerViewModel2.queueStateUpdate(i1Var2);
                                            return zVar;
                                        }
                                        ir.i defaultVoiceId = ((VoicesService) this.this$0.voicesService.get()).defaultVoiceId();
                                        this.L$0 = d0Var3;
                                        this.L$1 = null;
                                        this.label = 5;
                                        obj = ir.r.u(defaultVoiceId, this);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        String str3 = (String) obj;
                                        str = this.$voiceId;
                                        if (str == null) {
                                            str = EffectivePlaybackModeKt.resolveLastUsedVoiceId((ReadMeta) d0Var3.f20559a, str3);
                                        }
                                        EffectivePlaybackMode effectivePlaybackMode = EffectivePlaybackModeKt.effectivePlaybackMode((ReadMeta) d0Var3.f20559a, str);
                                        computeInitialPosition = this.this$0.computeInitialPosition((ReadMeta) d0Var3.f20559a, effectivePlaybackMode, this.$startAtChapter);
                                        this.this$0.logger.log(this.this$0.tag, "load: readId=" + ((ReadMeta) d0Var3.f20559a).getReadId() + " / resolvedVoiceId=" + str + " / effectiveMode=" + effectivePlaybackMode + " / position=" + computeInitialPosition);
                                        PlayerViewModel playerViewModel3 = this.this$0;
                                        playerViewModel3.queueStateUpdate(new x1(d0Var3, computeInitialPosition, str, playerViewModel3));
                                        Logger logger2 = this.this$0.logger;
                                        String str4 = this.this$0.tag;
                                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(d0Var3, this.this$0, this.$this_queueStateUpdate, null);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.label = 6;
                                        break;
                                    }
                                    this.this$0.logger.log(this.this$0.tag, "Refreshing a read");
                                    ReadsService readsService2 = (ReadsService) this.this$0.readsService.get();
                                    String readId = this.$this_queueStateUpdate.getReadId();
                                    this.L$0 = d0Var2;
                                    this.L$1 = null;
                                    this.label = 4;
                                    obj = readsService2.refreshRead(readId, true, this);
                                    if (obj == aVar) {
                                        d0Var3 = d0Var2;
                                        asyncCallResult = (AsyncCallResult) obj;
                                        if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                                            PlayerViewModel playerViewModel4 = this.this$0;
                                            playerViewModel4.queueStateUpdate(new d2(playerViewModel4, (AsyncCallResult.Error) asyncCallResult, 0));
                                            playerViewModel2 = this.this$0;
                                            i1Var2 = new i1(10);
                                            playerViewModel2.queueStateUpdate(i1Var2);
                                            return zVar;
                                        }
                                        if (asyncCallResult instanceof AsyncCallResult.Success) {
                                            d0Var3.f20559a = ((AsyncCallResult.Success) asyncCallResult).getData();
                                            if (((ReadMeta) d0Var3.f20559a).getCreationStatus() == null) {
                                            }
                                            ir.i defaultVoiceId2 = ((VoicesService) this.this$0.voicesService.get()).defaultVoiceId();
                                            this.L$0 = d0Var3;
                                            this.L$1 = null;
                                            this.label = 5;
                                            obj = ir.r.u(defaultVoiceId2, this);
                                            if (obj == aVar) {
                                            }
                                            String str32 = (String) obj;
                                            str = this.$voiceId;
                                            if (str == null) {
                                            }
                                            EffectivePlaybackMode effectivePlaybackMode2 = EffectivePlaybackModeKt.effectivePlaybackMode((ReadMeta) d0Var3.f20559a, str);
                                            computeInitialPosition = this.this$0.computeInitialPosition((ReadMeta) d0Var3.f20559a, effectivePlaybackMode2, this.$startAtChapter);
                                            this.this$0.logger.log(this.this$0.tag, "load: readId=" + ((ReadMeta) d0Var3.f20559a).getReadId() + " / resolvedVoiceId=" + str + " / effectiveMode=" + effectivePlaybackMode2 + " / position=" + computeInitialPosition);
                                            PlayerViewModel playerViewModel32 = this.this$0;
                                            playerViewModel32.queueStateUpdate(new x1(d0Var3, computeInitialPosition, str, playerViewModel32));
                                            Logger logger22 = this.this$0.logger;
                                            String str42 = this.this$0.tag;
                                            AnonymousClass4 anonymousClass42 = new AnonymousClass4(d0Var3, this.this$0, this.$this_queueStateUpdate, null);
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.label = 6;
                                        } else {
                                            throw new ah.m(13);
                                        }
                                    } else {
                                        return aVar;
                                    }
                                } else {
                                    return aVar;
                                }
                                break;
                            case 1:
                                sn.a.g(obj);
                                this.L$0 = null;
                                this.label = 2;
                                obj = ir.r.u((ir.i) obj, this);
                                if (obj == aVar) {
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                                d0Var = new kotlin.jvm.internal.d0();
                                Logger logger3 = this.this$0.logger;
                                String str22 = this.this$0.tag;
                                PlayerViewModel$load$1$1$1$readMeta$1 playerViewModel$load$1$1$1$readMeta$12 = new PlayerViewModel$load$1$1$1$readMeta$1(this.this$0, this.$this_queueStateUpdate, null);
                                this.L$0 = d0Var;
                                this.L$1 = d0Var;
                                this.label = 3;
                                obj = logger3.logTransaction(str22, "getRead", playerViewModel$load$1$1$1$readMeta$12, this);
                                if (obj != aVar) {
                                }
                                break;
                            case 2:
                                sn.a.g(obj);
                                if (((Boolean) obj).booleanValue()) {
                                }
                                d0Var = new kotlin.jvm.internal.d0();
                                Logger logger32 = this.this$0.logger;
                                String str222 = this.this$0.tag;
                                PlayerViewModel$load$1$1$1$readMeta$1 playerViewModel$load$1$1$1$readMeta$122 = new PlayerViewModel$load$1$1$1$readMeta$1(this.this$0, this.$this_queueStateUpdate, null);
                                this.L$0 = d0Var;
                                this.L$1 = d0Var;
                                this.label = 3;
                                obj = logger32.logTransaction(str222, "getRead", playerViewModel$load$1$1$1$readMeta$122, this);
                                if (obj != aVar) {
                                }
                                break;
                            case 3:
                                d0Var = (kotlin.jvm.internal.d0) this.L$1;
                                d0Var2 = (kotlin.jvm.internal.d0) this.L$0;
                                sn.a.g(obj);
                                d0Var.f20559a = obj;
                                obj2 = d0Var2.f20559a;
                                if (obj2 != null) {
                                    d0Var3 = d0Var2;
                                    if (((ReadMeta) d0Var3.f20559a).getCreationStatus() == null) {
                                    }
                                    ir.i defaultVoiceId22 = ((VoicesService) this.this$0.voicesService.get()).defaultVoiceId();
                                    this.L$0 = d0Var3;
                                    this.L$1 = null;
                                    this.label = 5;
                                    obj = ir.r.u(defaultVoiceId22, this);
                                    if (obj == aVar) {
                                    }
                                    String str322 = (String) obj;
                                    str = this.$voiceId;
                                    if (str == null) {
                                    }
                                    EffectivePlaybackMode effectivePlaybackMode22 = EffectivePlaybackModeKt.effectivePlaybackMode((ReadMeta) d0Var3.f20559a, str);
                                    computeInitialPosition = this.this$0.computeInitialPosition((ReadMeta) d0Var3.f20559a, effectivePlaybackMode22, this.$startAtChapter);
                                    this.this$0.logger.log(this.this$0.tag, "load: readId=" + ((ReadMeta) d0Var3.f20559a).getReadId() + " / resolvedVoiceId=" + str + " / effectiveMode=" + effectivePlaybackMode22 + " / position=" + computeInitialPosition);
                                    PlayerViewModel playerViewModel322 = this.this$0;
                                    playerViewModel322.queueStateUpdate(new x1(d0Var3, computeInitialPosition, str, playerViewModel322));
                                    Logger logger222 = this.this$0.logger;
                                    String str422 = this.this$0.tag;
                                    AnonymousClass4 anonymousClass422 = new AnonymousClass4(d0Var3, this.this$0, this.$this_queueStateUpdate, null);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.label = 6;
                                    break;
                                }
                                this.this$0.logger.log(this.this$0.tag, "Refreshing a read");
                                ReadsService readsService22 = (ReadsService) this.this$0.readsService.get();
                                String readId2 = this.$this_queueStateUpdate.getReadId();
                                this.L$0 = d0Var2;
                                this.L$1 = null;
                                this.label = 4;
                                obj = readsService22.refreshRead(readId2, true, this);
                                if (obj == aVar) {
                                }
                                break;
                            case 4:
                                d0Var3 = (kotlin.jvm.internal.d0) this.L$0;
                                sn.a.g(obj);
                                asyncCallResult = (AsyncCallResult) obj;
                                if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                                }
                                break;
                            case 5:
                                d0Var3 = (kotlin.jvm.internal.d0) this.L$0;
                                sn.a.g(obj);
                                String str3222 = (String) obj;
                                str = this.$voiceId;
                                if (str == null) {
                                }
                                EffectivePlaybackMode effectivePlaybackMode222 = EffectivePlaybackModeKt.effectivePlaybackMode((ReadMeta) d0Var3.f20559a, str);
                                computeInitialPosition = this.this$0.computeInitialPosition((ReadMeta) d0Var3.f20559a, effectivePlaybackMode222, this.$startAtChapter);
                                this.this$0.logger.log(this.this$0.tag, "load: readId=" + ((ReadMeta) d0Var3.f20559a).getReadId() + " / resolvedVoiceId=" + str + " / effectiveMode=" + effectivePlaybackMode222 + " / position=" + computeInitialPosition);
                                PlayerViewModel playerViewModel3222 = this.this$0;
                                playerViewModel3222.queueStateUpdate(new x1(d0Var3, computeInitialPosition, str, playerViewModel3222));
                                Logger logger2222 = this.this$0.logger;
                                String str4222 = this.this$0.tag;
                                AnonymousClass4 anonymousClass4222 = new AnonymousClass4(d0Var3, this.this$0, this.$this_queueStateUpdate, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 6;
                                break;
                            case 6:
                                sn.a.g(obj);
                                playerViewModel2 = this.this$0;
                                i1Var2 = new i1(10);
                                playerViewModel2.queueStateUpdate(i1Var2);
                                return zVar;
                            default:
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    } catch (Exception e10) {
                        this.this$0.logger.logError(this.this$0.tag, "Error starting a player", e10);
                        this.this$0.queueStateUpdate(new y1(((StringProvider) this.this$0.getStringProvider().get()).getString(R.string.player_error_loading_content_unknown), 6));
                        playerViewModel = this.this$0;
                        i1Var = new i1(10);
                        playerViewModel.queueStateUpdate(i1Var);
                        return zVar;
                    }
                } catch (ContentLicenseException e11) {
                    this.this$0.logger.logError(this.this$0.tag, "Error starting a player", e11);
                    this.this$0.queueStateUpdate(new y1(((StringProvider) this.this$0.getStringProvider().get()).getString(R.string.player_error_content_not_licensed), 7));
                    playerViewModel = this.this$0;
                    i1Var = new i1(10);
                    playerViewModel.queueStateUpdate(i1Var);
                    return zVar;
                } catch (SubscriptionRequiredException e12) {
                    this.this$0.logger.logError(this.this$0.tag, "Error starting a player", e12);
                    this.this$0.queueStateUpdate(new i1(12));
                    playerViewModel = this.this$0;
                    i1Var = new i1(10);
                    playerViewModel.queueStateUpdate(i1Var);
                    return zVar;
                }
            } catch (Throwable th) {
                this.this$0.queueStateUpdate(new i1(10));
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$load$1$1(PlayerViewModel playerViewModel, PlayerState playerState, boolean z6, String str, Integer num, wn.c<? super PlayerViewModel$load$1$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$this_queueStateUpdate = playerState;
        this.$forceRefresh = z6;
        this.$voiceId = str;
        this.$startAtChapter = num;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$load$1$1(this.this$0, this.$this_queueStateUpdate, this.$forceRefresh, this.$voiceId, this.$startAtChapter, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$load$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            Logger logger = this.this$0.logger;
            String str = this.this$0.tag;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_queueStateUpdate, this.$forceRefresh, this.$voiceId, this.$startAtChapter, null);
            this.label = 1;
            Object logTransaction = logger.logTransaction(str, "load", anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (logTransaction == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
