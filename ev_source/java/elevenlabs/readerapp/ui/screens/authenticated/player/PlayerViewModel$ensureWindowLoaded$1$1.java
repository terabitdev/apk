package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.highlighter.HighlighterData;
import io.elevenlabs.highlighter.HighlighterKt;
import io.elevenlabs.highlighter.ParsedElementCache;
import io.livekit.android.rpc.RpcError;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$ensureWindowLoaded$1$1", f = "PlayerViewModel.kt", l = {1344}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$ensureWindowLoaded$1$1 extends yn.i implements ho.p {
    final /* synthetic */ int $idx;
    final /* synthetic */ String $readId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$ensureWindowLoaded$1$1$2", f = "PlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$ensureWindowLoaded$1$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ ChapterContent $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChapterContent chapterContent, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$content = chapterContent;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.$content, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sn.a.g(obj);
                ParsedElementCache.INSTANCE.warm(this.$content.getElements());
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$ensureWindowLoaded$1$1(PlayerViewModel playerViewModel, String str, int i10, wn.c<? super PlayerViewModel$ensureWindowLoaded$1$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$readId = str;
        this.$idx = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerState invokeSuspend$lambda$0(int i10, ChapterContent chapterContent, PlayerViewModel playerViewModel, PlayerState playerState) {
        AtomicInteger atomicInteger;
        PlayerState copy;
        HighlighterData highlighterData = playerState.getHighlighterData();
        atomicInteger = playerViewModel.chapterCursor;
        copy = playerState.copy((r85 & 1) != 0 ? playerState.readId : null, (r85 & 2) != 0 ? playerState.player : null, (r85 & 4) != 0 ? playerState.isLoadingContent : false, (r85 & 8) != 0 ? playerState.isLoadingHtmlContent : false, (r85 & 16) != 0 ? playerState.htmlLoadingProgress : 0, (r85 & 32) != 0 ? playerState.highlighterData : HighlighterKt.applyContentAndCap(highlighterData, i10, chapterContent, atomicInteger.get()), (r85 & 64) != 0 ? playerState.wordOffsets : null, (r85 & 128) != 0 ? playerState.error : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.canUpgrade : false, (r85 & 512) != 0 ? playerState.isAppInForeground : false, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.isSeeking : false, (r85 & 2048) != 0 ? playerState.isSeekOperationInProgress : false, (r85 & 4096) != 0 ? playerState.contentState : null, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.fullScreenImageSrc : null, (r85 & 16384) != 0 ? playerState.navigateBack : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.toastMessage : null, (r85 & 65536) != 0 ? playerState.navigateToPurchaseHours : false, (r85 & 131072) != 0 ? playerState.purchaseHoursContext : null, (r85 & 262144) != 0 ? playerState.navigateToVoiceDesignPaywall : false, (r85 & 524288) != 0 ? playerState.navigateToPaywall : false, (r85 & 1048576) != 0 ? playerState.canNavigateToLowCreditsAgain : false, (r85 & 2097152) != 0 ? playerState.sleepTimerDate : null, (r85 & 4194304) != 0 ? playerState.voiceUsed : null, (r85 & 8388608) != 0 ? playerState.configuration : null, (r85 & 16777216) != 0 ? playerState.playerConfig : null, (r85 & 33554432) != 0 ? playerState.showSpeedPickerDialog : false, (r85 & 67108864) != 0 ? playerState.showContentsDialog : false, (r85 & 134217728) != 0 ? playerState.showTooLargeForOfflineToast : false, (r85 & 268435456) != 0 ? playerState.chapterDownloadErrorMessage : null, (r85 & 536870912) != 0 ? playerState.showCustomizeDialog : false, (r85 & 1073741824) != 0 ? playerState.navigateToPlayerPreferences : false, (r85 & Integer.MIN_VALUE) != 0 ? playerState.showExportDialog : false, (r86 & 1) != 0 ? playerState.showRenameDialog : false, (r86 & 2) != 0 ? playerState.showRatingDialog : false, (r86 & 4) != 0 ? playerState.showSleepTimerDialog : false, (r86 & 8) != 0 ? playerState.showShareOptionsSheet : false, (r86 & 16) != 0 ? playerState.navigateToGenFMLoaderWithReadId : null, (r86 & 32) != 0 ? playerState.currentDate : null, (r86 & 64) != 0 ? playerState.showBookmarksDialog : false, (r86 & 128) != 0 ? playerState.navigateToShareDetails : null, (r86 & RpcError.MAX_MESSAGE_BYTES) != 0 ? playerState.clickedBookmarkId : null, (r86 & 512) != 0 ? playerState.navigateToBookmarkShareDetails : null, (r86 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? playerState.recentlyAddedBookmarkId : null, (r86 & 2048) != 0 ? playerState.editBookmarkId : null, (r86 & 4096) != 0 ? playerState.displayMode : null, (r86 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? playerState.showQueue : false, (r86 & 16384) != 0 ? playerState.isScreenRecordingEnabled : false, (r86 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? playerState.isVoiceAgentFloatingButtonEnabled : false, (r86 & 65536) != 0 ? playerState.pronunciations : null, (r86 & 131072) != 0 ? playerState.showPronunciationExistsDialog : null, (r86 & 262144) != 0 ? playerState.pronunciationPreviewState : null, (r86 & 524288) != 0 ? playerState.undoSeek : null, (r86 & 1048576) != 0 ? playerState.currentSoundscapeId : null, (r86 & 2097152) != 0 ? playerState.shouldShowPagerTeaser : false, (r86 & 4194304) != 0 ? playerState.controlsVisibleByUser : false, (r86 & 8388608) != 0 ? playerState.activeControlsInteractionCount : 0, (r86 & 16777216) != 0 ? playerState.isVoiceChangerEnabled : false, (r86 & 33554432) != 0 ? playerState.isSearchInAudioEnabled : false, (r86 & 67108864) != 0 ? playerState.inAppForwardSeekDuration : null, (r86 & 134217728) != 0 ? playerState.inAppBackwardSeekDuration : null);
        return copy;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        PlayerViewModel$ensureWindowLoaded$1$1 playerViewModel$ensureWindowLoaded$1$1 = new PlayerViewModel$ensureWindowLoaded$1$1(this.this$0, this.$readId, this.$idx, cVar);
        playerViewModel$ensureWindowLoaded$1$1.L$0 = obj;
        return playerViewModel$ensureWindowLoaded$1$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$ensureWindowLoaded$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap.KeySetView keySetView;
        ConcurrentHashMap.KeySetView keySetView2;
        Integer num;
        fr.d0 d0Var = (fr.d0) this.L$0;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                ReadsService readsService = (ReadsService) this.this$0.readsService.get();
                String str = this.$readId;
                int i11 = this.$idx;
                this.L$0 = d0Var;
                this.label = 1;
                obj = readsService.loadChapterContent(str, i11, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            final ChapterContent chapterContent = (ChapterContent) obj;
            PlayerViewModel playerViewModel = this.this$0;
            sn.z zVar = sn.z.f31622a;
            if (chapterContent == null) {
                keySetView2 = playerViewModel.inFlightChapterLoads;
                num = new Integer(this.$idx);
            } else {
                boolean c5 = kotlin.jvm.internal.m.c(((PlayerState) playerViewModel.getStateFlow().getValue()).getReadId(), this.$readId);
                final PlayerViewModel playerViewModel2 = this.this$0;
                if (!c5) {
                    keySetView2 = playerViewModel2.inFlightChapterLoads;
                    num = new Integer(this.$idx);
                } else {
                    final int i12 = this.$idx;
                    playerViewModel2.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.c2
                        @Override // ho.l
                        public final Object invoke(Object obj2) {
                            PlayerState invokeSuspend$lambda$0;
                            invokeSuspend$lambda$0 = PlayerViewModel$ensureWindowLoaded$1$1.invokeSuspend$lambda$0(i12, chapterContent, playerViewModel2, (PlayerState) obj2);
                            return invokeSuspend$lambda$0;
                        }
                    });
                    fr.g0.D(d0Var, null, null, new AnonymousClass2(chapterContent, null), 3);
                    keySetView2 = this.this$0.inFlightChapterLoads;
                    num = new Integer(this.$idx);
                }
            }
            keySetView2.remove(num);
            return zVar;
        } catch (Throwable th) {
            keySetView = this.this$0.inFlightChapterLoads;
            keySetView.remove(new Integer(this.$idx));
            throw th;
        }
    }
}
