package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.model.LimitReachedData;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16935a;

    public /* synthetic */ j(int i10) {
        this.f16935a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        Object GenFMLoadingUI$lambda$6$0$0$1$5$0;
        GenFMLoadingState copy$default;
        sn.z invokeSuspend$lambda$1;
        sn.z AddSharedReadScreenUI$lambda$0$0;
        sn.z AddSharedReadScreenUI$lambda$3$0$0$0$0;
        int GenFMLoadingUI$lambda$6$0$0$1$4$0$0;
        int GenFMLoadingUI$lambda$6$0$0$1$4$0$1;
        sn.z GenFMLoadingUI$lambda$6$0$0$1$8$0$0;
        sn.z GenFMLoadingUI$lambda$0$0;
        i1.m0 GenFMLoadingUI$lambda$6$0$0$1$4$0;
        sn.z ImportContentBrowserSurveySheetUI$lambda$2$0;
        sn.z ImportContentBrowserSurveySheetUI$lambda$3$0;
        sn.z ImportFileScreen$lambda$0$0;
        sn.z Preview_ImportFileScreen_Loading$lambda$1$0;
        sn.z ImportFileScreenUI$lambda$2$0$0$5$0$0;
        sn.z Preview_ImportFileScreen_Failed$lambda$1$0;
        sn.z Preview_ImportFileScreen_Failed_LongFileName$lambda$1$0;
        ImportFileState onFilePickerUnavailable$lambda$0;
        ImportFileState signalNavigatedToAddPodcastLimitReached$lambda$0;
        sn.z Preview_ImportLinkScreen_Error$lambda$0$0;
        sn.z Preview_ImportLinkScreen_Loaded$lambda$0$0;
        sn.z Preview_ImportLinkScreen_Idle$lambda$0$0;
        sn.z Preview_ImportLinkScreen_Loading$lambda$0$0;
        sn.z WebViewContent$lambda$10$3$2$0$0;
        switch (this.f16935a) {
            case 0:
                return AddSharedReadViewModel$load$1$1.i((AddSharedReadState) obj);
            case 1:
                GenFMLoadingUI$lambda$6$0$0$1$5$0 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$5$0((LoadingMessage) obj);
                return GenFMLoadingUI$lambda$6$0$0$1$5$0;
            case 2:
                copy$default = GenFMLoadingState.copy$default((GenFMLoadingState) obj, null, false, false, "", false, 7, null);
                return copy$default;
            case 3:
                invokeSuspend$lambda$1 = ImportLinkScreenKt$WebViewContent$3$1.invokeSuspend$lambda$1((ImportLinkViewModel) obj);
                return invokeSuspend$lambda$1;
            case 4:
                return PasteLinkScreenKt$PasteLinkScreenUI$4$1.d((PasteLinkViewModel) obj);
            case 5:
                return RateTitleViewModel$submit$1$1.h((RateTitleState) obj);
            case 6:
                return RateTitleViewModel$submit$1$1.d((RateTitleState) obj);
            case 7:
                return WriteViewModel$listen$1$1.h((WriteState) obj);
            case 8:
                return WriteViewModel$listen$1$1.d((WriteState) obj);
            case 9:
                AddSharedReadScreenUI$lambda$0$0 = AddSharedReadScreenKt.AddSharedReadScreenUI$lambda$0$0((ho.l) obj);
                return AddSharedReadScreenUI$lambda$0$0;
            case 10:
                AddSharedReadScreenUI$lambda$3$0$0$0$0 = AddSharedReadScreenKt.AddSharedReadScreenUI$lambda$3$0$0$0$0((AddSharedReadViewModel) obj);
                return AddSharedReadScreenUI$lambda$3$0$0$0$0;
            case 11:
                GenFMLoadingUI$lambda$6$0$0$1$4$0$0 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$4$0$0(((Integer) obj).intValue());
                return Integer.valueOf(GenFMLoadingUI$lambda$6$0$0$1$4$0$0);
            case 12:
                GenFMLoadingUI$lambda$6$0$0$1$4$0$1 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$4$0$1(((Integer) obj).intValue());
                return Integer.valueOf(GenFMLoadingUI$lambda$6$0$0$1$4$0$1);
            case 13:
                GenFMLoadingUI$lambda$6$0$0$1$8$0$0 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$8$0$0((GenFMLoadingViewModel) obj);
                return GenFMLoadingUI$lambda$6$0$0$1$8$0$0;
            case 14:
                GenFMLoadingUI$lambda$0$0 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$0$0((ho.l) obj);
                return GenFMLoadingUI$lambda$0$0;
            case 15:
                GenFMLoadingUI$lambda$6$0$0$1$4$0 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$1$4$0((i1.q) obj);
                return GenFMLoadingUI$lambda$6$0$0$1$4$0;
            case 16:
                ImportContentBrowserSurveySheetUI$lambda$2$0 = ImportContentBrowserSurveySheetKt.ImportContentBrowserSurveySheetUI$lambda$2$0((String) obj);
                return ImportContentBrowserSurveySheetUI$lambda$2$0;
            case 17:
                ImportContentBrowserSurveySheetUI$lambda$3$0 = ImportContentBrowserSurveySheetKt.ImportContentBrowserSurveySheetUI$lambda$3$0((ho.l) obj);
                return ImportContentBrowserSurveySheetUI$lambda$3$0;
            case 18:
                ImportFileScreen$lambda$0$0 = ImportFileScreenKt.ImportFileScreen$lambda$0$0((LimitReachedData) obj);
                return ImportFileScreen$lambda$0$0;
            case 19:
                Preview_ImportFileScreen_Loading$lambda$1$0 = ImportFileScreenKt.Preview_ImportFileScreen_Loading$lambda$1$0((ho.l) obj);
                return Preview_ImportFileScreen_Loading$lambda$1$0;
            case 20:
                ImportFileScreenUI$lambda$2$0$0$5$0$0 = ImportFileScreenKt.ImportFileScreenUI$lambda$2$0$0$5$0$0((ImportFileViewModel) obj);
                return ImportFileScreenUI$lambda$2$0$0$5$0$0;
            case 21:
                Preview_ImportFileScreen_Failed$lambda$1$0 = ImportFileScreenKt.Preview_ImportFileScreen_Failed$lambda$1$0((ho.l) obj);
                return Preview_ImportFileScreen_Failed$lambda$1$0;
            case 22:
                Preview_ImportFileScreen_Failed_LongFileName$lambda$1$0 = ImportFileScreenKt.Preview_ImportFileScreen_Failed_LongFileName$lambda$1$0((ho.l) obj);
                return Preview_ImportFileScreen_Failed_LongFileName$lambda$1$0;
            case 23:
                onFilePickerUnavailable$lambda$0 = ImportFileViewModel.onFilePickerUnavailable$lambda$0((ImportFileState) obj);
                return onFilePickerUnavailable$lambda$0;
            case 24:
                signalNavigatedToAddPodcastLimitReached$lambda$0 = ImportFileViewModel.signalNavigatedToAddPodcastLimitReached$lambda$0((ImportFileState) obj);
                return signalNavigatedToAddPodcastLimitReached$lambda$0;
            case 25:
                Preview_ImportLinkScreen_Error$lambda$0$0 = ImportLinkScreenKt.Preview_ImportLinkScreen_Error$lambda$0$0((ho.l) obj);
                return Preview_ImportLinkScreen_Error$lambda$0$0;
            case 26:
                Preview_ImportLinkScreen_Loaded$lambda$0$0 = ImportLinkScreenKt.Preview_ImportLinkScreen_Loaded$lambda$0$0((ho.l) obj);
                return Preview_ImportLinkScreen_Loaded$lambda$0$0;
            case 27:
                Preview_ImportLinkScreen_Idle$lambda$0$0 = ImportLinkScreenKt.Preview_ImportLinkScreen_Idle$lambda$0$0((ho.l) obj);
                return Preview_ImportLinkScreen_Idle$lambda$0$0;
            case 28:
                Preview_ImportLinkScreen_Loading$lambda$0$0 = ImportLinkScreenKt.Preview_ImportLinkScreen_Loading$lambda$0$0((ho.l) obj);
                return Preview_ImportLinkScreen_Loading$lambda$0$0;
            default:
                WebViewContent$lambda$10$3$2$0$0 = ImportLinkScreenKt.WebViewContent$lambda$10$3$2$0$0((ImportLinkViewModel) obj);
                return WebViewContent$lambda$10$3$2$0$0;
        }
    }
}
