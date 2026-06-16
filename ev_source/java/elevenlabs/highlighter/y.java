package io.elevenlabs.highlighter;

import io.elevenlabs.ocr.OcrImportScreenKt;
import io.elevenlabs.readerapp.SplashScreenKt;
import io.elevenlabs.readerapp.core.MessageBottomSheetOverlayKt;
import io.elevenlabs.readerapp.core.SurveySheetKt;
import io.elevenlabs.readerapp.ui.components.ActionRowKt;
import io.elevenlabs.readerapp.ui.components.AnnouncementBannerCarouselKt;
import io.elevenlabs.readerapp.ui.components.AuthorPictureKt;
import io.elevenlabs.readerapp.ui.components.CategorieCollectionRowKt;
import io.elevenlabs.readerapp.ui.components.CollectionMetaRowKt;
import io.elevenlabs.readerapp.ui.components.CollectionMetaSmallRowKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14257b;

    public /* synthetic */ y(int i10, int i11) {
        this.f14256a = i11;
        this.f14257b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Preview_Highlighter_FollowingContent_ThemeClassic$lambda$1;
        sn.z Preview_Highlighter_Highlight_Images$lambda$1;
        sn.z Preview_Highlighter_Lists$lambda$1;
        sn.z Preview_Highlighter_Nested$lambda$1;
        sn.z Preview_Highlighter_USA$lambda$1;
        sn.z Preview_Highlighter_EmptyParagraphs$lambda$1;
        sn.z Preview_Highlighter_Styling$lambda$1;
        sn.z Preview_Thumbnails$lambda$7;
        sn.z Preview_OcrImportScreen_Idle$lambda$2;
        sn.z Preview_OcrImportScreen_PermissionsGranted$lambda$2;
        sn.z Preview_OcrImportScreen_WithImages_Selected$lambda$3;
        sn.z Preview_OcrImportScreen_WithImages$lambda$3;
        sn.z Preview_OcrImportScreen_Loading$lambda$3;
        sn.z Preview_OcrImportScreen_PermissionsNotGranted$lambda$2;
        sn.z Preview_MessageBottomSheetUI_full$lambda$0;
        sn.z Preview_SurveySheet_Open$lambda$1;
        sn.z Preview_SurveySheet_SingleSelect$lambda$0;
        int i10 = this.f14256a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Preview_Highlighter_FollowingContent_ThemeClassic$lambda$1 = HighlighterPreviewsKt.Preview_Highlighter_FollowingContent_ThemeClassic$lambda$1(this.f14257b, mVar, intValue);
                return Preview_Highlighter_FollowingContent_ThemeClassic$lambda$1;
            case 1:
                Preview_Highlighter_Highlight_Images$lambda$1 = HighlighterPreviewsKt.Preview_Highlighter_Highlight_Images$lambda$1(this.f14257b, mVar, intValue);
                return Preview_Highlighter_Highlight_Images$lambda$1;
            case 2:
                Preview_Highlighter_Lists$lambda$1 = HighlighterPreviewsKt.Preview_Highlighter_Lists$lambda$1(this.f14257b, mVar, intValue);
                return Preview_Highlighter_Lists$lambda$1;
            case 3:
                Preview_Highlighter_Nested$lambda$1 = HighlighterPreviewsKt.Preview_Highlighter_Nested$lambda$1(this.f14257b, mVar, intValue);
                return Preview_Highlighter_Nested$lambda$1;
            case 4:
                Preview_Highlighter_USA$lambda$1 = HighlighterPreviewsKt.Preview_Highlighter_USA$lambda$1(this.f14257b, mVar, intValue);
                return Preview_Highlighter_USA$lambda$1;
            case 5:
                Preview_Highlighter_EmptyParagraphs$lambda$1 = HighlighterPreviewsKt.Preview_Highlighter_EmptyParagraphs$lambda$1(this.f14257b, mVar, intValue);
                return Preview_Highlighter_EmptyParagraphs$lambda$1;
            case 6:
                Preview_Highlighter_Styling$lambda$1 = HighlighterPreviewsKt.Preview_Highlighter_Styling$lambda$1(this.f14257b, mVar, intValue);
                return Preview_Highlighter_Styling$lambda$1;
            case 7:
                Preview_Thumbnails$lambda$7 = OcrImportScreenKt.Preview_Thumbnails$lambda$7(this.f14257b, mVar, intValue);
                return Preview_Thumbnails$lambda$7;
            case 8:
                Preview_OcrImportScreen_Idle$lambda$2 = OcrImportScreenKt.Preview_OcrImportScreen_Idle$lambda$2(this.f14257b, mVar, intValue);
                return Preview_OcrImportScreen_Idle$lambda$2;
            case 9:
                Preview_OcrImportScreen_PermissionsGranted$lambda$2 = OcrImportScreenKt.Preview_OcrImportScreen_PermissionsGranted$lambda$2(this.f14257b, mVar, intValue);
                return Preview_OcrImportScreen_PermissionsGranted$lambda$2;
            case 10:
                Preview_OcrImportScreen_WithImages_Selected$lambda$3 = OcrImportScreenKt.Preview_OcrImportScreen_WithImages_Selected$lambda$3(this.f14257b, mVar, intValue);
                return Preview_OcrImportScreen_WithImages_Selected$lambda$3;
            case 11:
                Preview_OcrImportScreen_WithImages$lambda$3 = OcrImportScreenKt.Preview_OcrImportScreen_WithImages$lambda$3(this.f14257b, mVar, intValue);
                return Preview_OcrImportScreen_WithImages$lambda$3;
            case 12:
                Preview_OcrImportScreen_Loading$lambda$3 = OcrImportScreenKt.Preview_OcrImportScreen_Loading$lambda$3(this.f14257b, mVar, intValue);
                return Preview_OcrImportScreen_Loading$lambda$3;
            case 13:
                Preview_OcrImportScreen_PermissionsNotGranted$lambda$2 = OcrImportScreenKt.Preview_OcrImportScreen_PermissionsNotGranted$lambda$2(this.f14257b, mVar, intValue);
                return Preview_OcrImportScreen_PermissionsNotGranted$lambda$2;
            case 14:
                return SplashScreenKt.a(this.f14257b, mVar, intValue);
            case 15:
                return SplashScreenKt.b(this.f14257b, mVar, intValue);
            case 16:
                Preview_MessageBottomSheetUI_full$lambda$0 = MessageBottomSheetOverlayKt.Preview_MessageBottomSheetUI_full$lambda$0(this.f14257b, mVar, intValue);
                return Preview_MessageBottomSheetUI_full$lambda$0;
            case 17:
                Preview_SurveySheet_Open$lambda$1 = SurveySheetKt.Preview_SurveySheet_Open$lambda$1(this.f14257b, mVar, intValue);
                return Preview_SurveySheet_Open$lambda$1;
            case 18:
                Preview_SurveySheet_SingleSelect$lambda$0 = SurveySheetKt.Preview_SurveySheet_SingleSelect$lambda$0(this.f14257b, mVar, intValue);
                return Preview_SurveySheet_SingleSelect$lambda$0;
            case 19:
                return ActionRowKt.a(this.f14257b, mVar, intValue);
            case 20:
                return ActionRowKt.c(this.f14257b, mVar, intValue);
            case 21:
                return AnnouncementBannerCarouselKt.a(this.f14257b, mVar, intValue);
            case 22:
                return AnnouncementBannerCarouselKt.c(this.f14257b, mVar, intValue);
            case 23:
                return AnnouncementBannerCarouselKt.j(this.f14257b, mVar, intValue);
            case 24:
                return AnnouncementBannerCarouselKt.e(this.f14257b, mVar, intValue);
            case 25:
                return AuthorPictureKt.d(this.f14257b, mVar, intValue);
            case 26:
                return AuthorPictureKt.a(this.f14257b, mVar, intValue);
            case 27:
                return CategorieCollectionRowKt.d(this.f14257b, mVar, intValue);
            case 28:
                return CollectionMetaRowKt.d(this.f14257b, mVar, intValue);
            default:
                return CollectionMetaSmallRowKt.b(this.f14257b, mVar, intValue);
        }
    }
}
