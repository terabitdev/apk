package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$createBookmarkWithToast$1$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$load$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16555b;

    public /* synthetic */ y1(String str, int i10) {
        this.f16554a = i10;
        this.f16555b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState invokeSuspend$lambda$0;
        sn.z PlayerFloatingBottomButton$lambda$1$0;
        sn.z PlayerScreenDialogs$lambda$15$0$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$5$0$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$4$0$0;
        sn.z rememberTextSelectionMenuConfig$lambda$0$0$1$0;
        PlayerState openImage$lambda$0;
        PlayerState onBookmarkClick$lambda$0;
        switch (this.f16554a) {
            case 0:
                invokeSuspend$lambda$0 = PlayerViewModel.AnonymousClass20.AnonymousClass1.invokeSuspend$lambda$0(this.f16555b, (PlayerState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                return PlayerViewModel$bookmarkCurrentParagraph$1.d(this.f16555b, (PlayerState) obj);
            case 2:
                return PlayerViewModel$bookmarkCurrentParagraph$1.h(this.f16555b, (PlayerState) obj);
            case 3:
                return PlayerViewModel$createBookmarkWithToast$1$1.d(this.f16555b, (PlayerState) obj);
            case 4:
                return PlayerViewModel$createBookmarkWithToast$1$1.AnonymousClass3.d(this.f16555b, (PlayerState) obj);
            case 5:
                return PlayerViewModel$downloadChapter$1.d(this.f16555b, (PlayerState) obj);
            case 6:
                return PlayerViewModel$load$1$1.AnonymousClass1.i(this.f16555b, (PlayerState) obj);
            case 7:
                return PlayerViewModel$load$1$1.AnonymousClass1.m(this.f16555b, (PlayerState) obj);
            case 8:
                PlayerFloatingBottomButton$lambda$1$0 = PlayerFloatingBottomControlsKt.PlayerFloatingBottomButton$lambda$1$0(this.f16555b, (p4.b0) obj);
                return PlayerFloatingBottomButton$lambda$1$0;
            case 9:
                PlayerScreenDialogs$lambda$15$0$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$15$0$0(this.f16555b, (PlayerViewModel) obj);
                return PlayerScreenDialogs$lambda$15$0$0;
            case 10:
                PlayerScreenUI$lambda$44$0$4$1$5$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$5$0$0(this.f16555b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$4$1$5$0$0;
            case 11:
                PlayerScreenUI$lambda$44$0$4$1$4$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$4$0$0(this.f16555b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$4$1$4$0$0;
            case 12:
                rememberTextSelectionMenuConfig$lambda$0$0$1$0 = PlayerTextSelectionConfigKt.rememberTextSelectionMenuConfig$lambda$0$0$1$0(this.f16555b, (PlayerViewModel) obj);
                return rememberTextSelectionMenuConfig$lambda$0$0$1$0;
            case 13:
                openImage$lambda$0 = PlayerViewModel.openImage$lambda$0(this.f16555b, (PlayerState) obj);
                return openImage$lambda$0;
            default:
                onBookmarkClick$lambda$0 = PlayerViewModel.onBookmarkClick$lambda$0(this.f16555b, (PlayerState) obj);
                return onBookmarkClick$lambda$0;
        }
    }
}
