package io.elevenlabs.readerapp.core;

import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.readerapp.core.ConfigViewModel;
import io.elevenlabs.readerapp.core.ToastViewModel;
import sn.z;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14345b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f14344a = i10;
        this.f14345b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ConfigState invokeSuspend$lambda$0;
        ToastState invokeSuspend$lambda$02;
        ConfigState currentAppVersion$lambda$0;
        z SurveySheet$lambda$1$0$0;
        z OpenQuestionView$lambda$3$0$0$0;
        SurveyState survey$lambda$0;
        SurveyState handleNextPage$lambda$0;
        switch (this.f14344a) {
            case 0:
                invokeSuspend$lambda$0 = ConfigViewModel.AnonymousClass4.AnonymousClass1.invokeSuspend$lambda$0((AppConfig) this.f14345b, (ConfigState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = ToastViewModel.AnonymousClass1.C00221.invokeSuspend$lambda$0((ToastService.Toast) this.f14345b, (ToastState) obj);
                return invokeSuspend$lambda$02;
            case 2:
                currentAppVersion$lambda$0 = ConfigViewModel.setCurrentAppVersion$lambda$0((String) this.f14345b, (ConfigState) obj);
                return currentAppVersion$lambda$0;
            case 3:
                SurveySheet$lambda$1$0$0 = SurveySheetKt.SurveySheet$lambda$1$0$0((SurveyViewModel) this.f14345b, (ho.l) obj);
                return SurveySheet$lambda$1$0$0;
            case 4:
                OpenQuestionView$lambda$3$0$0$0 = SurveySheetKt.OpenQuestionView$lambda$3$0$0$0((z0) this.f14345b, (String) obj);
                return OpenQuestionView$lambda$3$0$0$0;
            case 5:
                survey$lambda$0 = SurveyViewModel.setSurvey$lambda$0((Survey) this.f14345b, (SurveyState) obj);
                return survey$lambda$0;
            default:
                handleNextPage$lambda$0 = SurveyViewModel.handleNextPage$lambda$0((ho.a) this.f14345b, (SurveyState) obj);
                return handleNextPage$lambda$0;
        }
    }
}
