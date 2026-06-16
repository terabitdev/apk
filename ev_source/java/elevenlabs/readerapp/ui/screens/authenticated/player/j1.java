package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.ChapterDownloadStatusIconKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.ChapterListItemKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.PlayerContentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BookmarksSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ExportSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.FullScreenImageKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SoundscapesButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SpeedPickerSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.UnlockFullReadButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerAdditionalActionsPagerKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16200b;

    public /* synthetic */ j1(int i10, int i11) {
        this.f16199a = i11;
        this.f16200b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Preview_PlayerScreen_ControlsHidden$lambda$0;
        sn.z Preview_PlayerScreen_PlayerReady_AndPlaying$lambda$0;
        sn.z Preview_ChapterListItem$lambda$1;
        sn.z Preview_PlayerContentsScreenUI_Empty$lambda$0;
        sn.z Preview_PlayerContentsScreenUI$lambda$1;
        sn.z EmptyState$lambda$1;
        sn.z Preview_BookmarksSheet_Downloading$lambda$2;
        sn.z Preview_BookmarksSheet_Empty$lambda$2;
        sn.z Preview_BookmarksSheet_WithBookmarks$lambda$2;
        sn.z Preview_ContentHeader_NoUrl$lambda$0;
        sn.z Preview_ContentHeader_NoAuthor$lambda$0;
        sn.z Preview_ContentHeader_Font$lambda$0;
        sn.z Preview_ContentHeader_AllData$lambda$0;
        sn.z Preview_ExportSheet$lambda$0;
        sn.z Preview_SleepTimerSheet$lambda$0;
        sn.z Preview_SpeedPickerSheet_Changed$lambda$1;
        sn.z Preview_SpeedPickerSheet$lambda$1;
        sn.z Preview_UnlockFullReadButton$lambda$1;
        sn.z Preview_PlayerAdditionalActionsPager_PageOne$lambda$1;
        sn.z Preview_PlayerAdditionalActionsPager$lambda$1;
        sn.z Preview_PlayerAdditionalActionsPager_PageOne_Active$lambda$1;
        sn.z Preview_PlayerAdditionalActionsPager_PageZero$lambda$1;
        int i10 = this.f16199a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Preview_PlayerScreen_ControlsHidden$lambda$0 = PlayerScreenPreviewsKt.Preview_PlayerScreen_ControlsHidden$lambda$0(this.f16200b, mVar, intValue);
                return Preview_PlayerScreen_ControlsHidden$lambda$0;
            case 1:
                Preview_PlayerScreen_PlayerReady_AndPlaying$lambda$0 = PlayerScreenPreviewsKt.Preview_PlayerScreen_PlayerReady_AndPlaying$lambda$0(this.f16200b, mVar, intValue);
                return Preview_PlayerScreen_PlayerReady_AndPlaying$lambda$0;
            case 2:
                return ChapterDownloadStatusIconKt.b(this.f16200b, mVar, intValue);
            case 3:
                return ChapterDownloadStatusIconKt.a(this.f16200b, mVar, intValue);
            case 4:
                return ChapterDownloadStatusIconKt.c(this.f16200b, mVar, intValue);
            case 5:
                Preview_ChapterListItem$lambda$1 = ChapterListItemKt.Preview_ChapterListItem$lambda$1(this.f16200b, mVar, intValue);
                return Preview_ChapterListItem$lambda$1;
            case 6:
                Preview_PlayerContentsScreenUI_Empty$lambda$0 = PlayerContentsScreenKt.Preview_PlayerContentsScreenUI_Empty$lambda$0(this.f16200b, mVar, intValue);
                return Preview_PlayerContentsScreenUI_Empty$lambda$0;
            case 7:
                Preview_PlayerContentsScreenUI$lambda$1 = PlayerContentsScreenKt.Preview_PlayerContentsScreenUI$lambda$1(this.f16200b, mVar, intValue);
                return Preview_PlayerContentsScreenUI$lambda$1;
            case 8:
                EmptyState$lambda$1 = PlayerContentsScreenKt.EmptyState$lambda$1(this.f16200b, mVar, intValue);
                return EmptyState$lambda$1;
            case 9:
                Preview_BookmarksSheet_Downloading$lambda$2 = BookmarksSheetKt.Preview_BookmarksSheet_Downloading$lambda$2(this.f16200b, mVar, intValue);
                return Preview_BookmarksSheet_Downloading$lambda$2;
            case 10:
                Preview_BookmarksSheet_Empty$lambda$2 = BookmarksSheetKt.Preview_BookmarksSheet_Empty$lambda$2(this.f16200b, mVar, intValue);
                return Preview_BookmarksSheet_Empty$lambda$2;
            case 11:
                Preview_BookmarksSheet_WithBookmarks$lambda$2 = BookmarksSheetKt.Preview_BookmarksSheet_WithBookmarks$lambda$2(this.f16200b, mVar, intValue);
                return Preview_BookmarksSheet_WithBookmarks$lambda$2;
            case 12:
                Preview_ContentHeader_NoUrl$lambda$0 = ContentHeaderKt.Preview_ContentHeader_NoUrl$lambda$0(this.f16200b, mVar, intValue);
                return Preview_ContentHeader_NoUrl$lambda$0;
            case 13:
                Preview_ContentHeader_NoAuthor$lambda$0 = ContentHeaderKt.Preview_ContentHeader_NoAuthor$lambda$0(this.f16200b, mVar, intValue);
                return Preview_ContentHeader_NoAuthor$lambda$0;
            case 14:
                Preview_ContentHeader_Font$lambda$0 = ContentHeaderKt.Preview_ContentHeader_Font$lambda$0(this.f16200b, mVar, intValue);
                return Preview_ContentHeader_Font$lambda$0;
            case 15:
                Preview_ContentHeader_AllData$lambda$0 = ContentHeaderKt.Preview_ContentHeader_AllData$lambda$0(this.f16200b, mVar, intValue);
                return Preview_ContentHeader_AllData$lambda$0;
            case 16:
                return ContentSearchSheetKt.i(this.f16200b, mVar, intValue);
            case 17:
                return ContentSearchSheetKt.e(this.f16200b, mVar, intValue);
            case 18:
                return ContentSearchSheetKt.d(this.f16200b, mVar, intValue);
            case 19:
                Preview_ExportSheet$lambda$0 = ExportSheetKt.Preview_ExportSheet$lambda$0(this.f16200b, mVar, intValue);
                return Preview_ExportSheet$lambda$0;
            case 20:
                return FullScreenImageKt.d(this.f16200b, mVar, intValue);
            case 21:
                Preview_SleepTimerSheet$lambda$0 = SleepTimerSheetKt.Preview_SleepTimerSheet$lambda$0(this.f16200b, mVar, intValue);
                return Preview_SleepTimerSheet$lambda$0;
            case 22:
                return SoundscapesButtonKt.d(this.f16200b, mVar, intValue);
            case 23:
                Preview_SpeedPickerSheet_Changed$lambda$1 = SpeedPickerSheetKt.Preview_SpeedPickerSheet_Changed$lambda$1(this.f16200b, mVar, intValue);
                return Preview_SpeedPickerSheet_Changed$lambda$1;
            case 24:
                Preview_SpeedPickerSheet$lambda$1 = SpeedPickerSheetKt.Preview_SpeedPickerSheet$lambda$1(this.f16200b, mVar, intValue);
                return Preview_SpeedPickerSheet$lambda$1;
            case 25:
                Preview_UnlockFullReadButton$lambda$1 = UnlockFullReadButtonKt.Preview_UnlockFullReadButton$lambda$1(this.f16200b, mVar, intValue);
                return Preview_UnlockFullReadButton$lambda$1;
            case 26:
                Preview_PlayerAdditionalActionsPager_PageOne$lambda$1 = PlayerAdditionalActionsPagerKt.Preview_PlayerAdditionalActionsPager_PageOne$lambda$1(this.f16200b, mVar, intValue);
                return Preview_PlayerAdditionalActionsPager_PageOne$lambda$1;
            case 27:
                Preview_PlayerAdditionalActionsPager$lambda$1 = PlayerAdditionalActionsPagerKt.Preview_PlayerAdditionalActionsPager$lambda$1(this.f16200b, mVar, intValue);
                return Preview_PlayerAdditionalActionsPager$lambda$1;
            case 28:
                Preview_PlayerAdditionalActionsPager_PageOne_Active$lambda$1 = PlayerAdditionalActionsPagerKt.Preview_PlayerAdditionalActionsPager_PageOne_Active$lambda$1(this.f16200b, mVar, intValue);
                return Preview_PlayerAdditionalActionsPager_PageOne_Active$lambda$1;
            default:
                Preview_PlayerAdditionalActionsPager_PageZero$lambda$1 = PlayerAdditionalActionsPagerKt.Preview_PlayerAdditionalActionsPager_PageZero$lambda$1(this.f16200b, mVar, intValue);
                return Preview_PlayerAdditionalActionsPager_PageZero$lambda$1;
        }
    }
}
