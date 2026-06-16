package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16347a;

    public /* synthetic */ t1(int i10) {
        this.f16347a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState loadChapterContentForBookmark$lambda$3;
        PlayerState loadChapterContentForBookmark$lambda$4$0;
        PlayerState onBookmarkClose$lambda$0;
        PlayerState onNavigatedToBookmarkShareDetails$lambda$0;
        PlayerState onTooLargeForOfflineToastClose$lambda$0;
        PlayerState onPronunciationExistsDialogDismiss$lambda$0;
        PlayerState onToastDismiss$lambda$0;
        PlayerState playerState = (PlayerState) obj;
        switch (this.f16347a) {
            case 0:
                loadChapterContentForBookmark$lambda$3 = PlayerViewModel.loadChapterContentForBookmark$lambda$3(playerState);
                return loadChapterContentForBookmark$lambda$3;
            case 1:
                loadChapterContentForBookmark$lambda$4$0 = PlayerViewModel.loadChapterContentForBookmark$lambda$4$0(playerState);
                return loadChapterContentForBookmark$lambda$4$0;
            case 2:
                onBookmarkClose$lambda$0 = PlayerViewModel.onBookmarkClose$lambda$0(playerState);
                return onBookmarkClose$lambda$0;
            case 3:
                onNavigatedToBookmarkShareDetails$lambda$0 = PlayerViewModel.onNavigatedToBookmarkShareDetails$lambda$0(playerState);
                return onNavigatedToBookmarkShareDetails$lambda$0;
            case 4:
                onTooLargeForOfflineToastClose$lambda$0 = PlayerViewModel.onTooLargeForOfflineToastClose$lambda$0(playerState);
                return onTooLargeForOfflineToastClose$lambda$0;
            case 5:
                onPronunciationExistsDialogDismiss$lambda$0 = PlayerViewModel.onPronunciationExistsDialogDismiss$lambda$0(playerState);
                return onPronunciationExistsDialogDismiss$lambda$0;
            default:
                onToastDismiss$lambda$0 = PlayerViewModel.onToastDismiss$lambda$0(playerState);
                return onToastDismiss$lambda$0;
        }
    }
}
