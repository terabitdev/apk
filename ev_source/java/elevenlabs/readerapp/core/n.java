package io.elevenlabs.readerapp.core;

import i1.m0;
import i1.q;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.Message;
import io.elevenlabs.readerapp.core.router.RouterState;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14380a;

    public /* synthetic */ n(int i10) {
        this.f14380a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ToastState copy$default;
        Message MessageBottomSheetOverlay$lambda$0$0;
        z MessageBottomSheetUI$lambda$0$0;
        Analytics.Event Preview_SurveySheet_Open$lambda$0$0;
        int SurveySheetUI$lambda$3$0$0$0$0$0;
        int SurveySheetUI$lambda$3$0$0$0$0$1;
        z SurveySheetUI$lambda$1$0;
        m0 SurveySheetUI$lambda$3$0$0$0$0;
        ToastState onToastClick$lambda$0;
        z ToastOverlayUI$lambda$1$1$0$0;
        z ToastOverlayUI$lambda$1$0$0$0;
        z ToastOverlayUI$lambda$2$0$0;
        z ToastOverlayUI$lambda$0$0;
        switch (this.f14380a) {
            case 0:
                copy$default = ToastState.copy$default((ToastState) obj, null, false, 1, null);
                return copy$default;
            case 1:
                MessageBottomSheetOverlay$lambda$0$0 = MessageBottomSheetOverlayKt.MessageBottomSheetOverlay$lambda$0$0((RouterState) obj);
                return MessageBottomSheetOverlay$lambda$0$0;
            case 2:
                MessageBottomSheetUI$lambda$0$0 = MessageBottomSheetOverlayKt.MessageBottomSheetUI$lambda$0$0((String) obj);
                return MessageBottomSheetUI$lambda$0$0;
            case 3:
                Preview_SurveySheet_Open$lambda$0$0 = SurveySheetKt.Preview_SurveySheet_Open$lambda$0$0((String) obj);
                return Preview_SurveySheet_Open$lambda$0$0;
            case 4:
                SurveySheetUI$lambda$3$0$0$0$0$0 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$0$0$0(((Integer) obj).intValue());
                return Integer.valueOf(SurveySheetUI$lambda$3$0$0$0$0$0);
            case 5:
                SurveySheetUI$lambda$3$0$0$0$0$1 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$0$0$1(((Integer) obj).intValue());
                return Integer.valueOf(SurveySheetUI$lambda$3$0$0$0$0$1);
            case 6:
                SurveySheetUI$lambda$1$0 = SurveySheetKt.SurveySheetUI$lambda$1$0((ho.l) obj);
                return SurveySheetUI$lambda$1$0;
            case 7:
                SurveySheetUI$lambda$3$0$0$0$0 = SurveySheetKt.SurveySheetUI$lambda$3$0$0$0$0((q) obj);
                return SurveySheetUI$lambda$3$0$0$0$0;
            case 8:
                onToastClick$lambda$0 = ToastViewModel.onToastClick$lambda$0((ToastState) obj);
                return onToastClick$lambda$0;
            case 9:
                ToastOverlayUI$lambda$1$1$0$0 = ToastViewModelKt.ToastOverlayUI$lambda$1$1$0$0((ToastViewModel) obj);
                return ToastOverlayUI$lambda$1$1$0$0;
            case 10:
                ToastOverlayUI$lambda$1$0$0$0 = ToastViewModelKt.ToastOverlayUI$lambda$1$0$0$0((ToastViewModel) obj);
                return ToastOverlayUI$lambda$1$0$0$0;
            case 11:
                ToastOverlayUI$lambda$2$0$0 = ToastViewModelKt.ToastOverlayUI$lambda$2$0$0((ToastViewModel) obj);
                return ToastOverlayUI$lambda$2$0$0;
            default:
                ToastOverlayUI$lambda$0$0 = ToastViewModelKt.ToastOverlayUI$lambda$0$0((String) obj);
                return ToastOverlayUI$lambda$0$0;
        }
    }
}
