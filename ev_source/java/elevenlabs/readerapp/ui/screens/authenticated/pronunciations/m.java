package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import io.elevenlabs.domain.model.Pronunciation;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16602a;

    public /* synthetic */ m(int i10) {
        this.f16602a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z lambda__985741156$lambda$0$0$0;
        z lambda_389001599$lambda$0$0$0;
        z lambda__680046232$lambda$0$0$0;
        z lambda_288654334$lambda$0$0$0;
        z lambda_1062690561$lambda$0$0$0;
        z lambda_1062690561$lambda$0$2$0;
        z lambda_288654334$lambda$0$2$0;
        z lambda_1885073232$lambda$0$0$0;
        z lambda_1885073232$lambda$0$2$0;
        z PronunciationScreenUI$lambda$9$0$0$1$0$0;
        z PronunciationScreenUI$lambda$9$0$0$2$0$0;
        PronunciationState clearNavigateBackAction$lambda$0;
        Object PronunciationsListScreenUI$lambda$1$0$1$0$0;
        PronunciationsListState clearNavigateToEdit$lambda$0;
        switch (this.f16602a) {
            case 0:
                return PronunciationViewModel$onSaveClick$1$1.h((PronunciationState) obj);
            case 1:
                return PronunciationViewModel$onSaveClick$1$1.d((PronunciationState) obj);
            case 2:
                return PronunciationsListViewModel$observePronunciations$1.d((PronunciationsListState) obj);
            case 3:
                lambda__985741156$lambda$0$0$0 = ComposableSingletons$PronunciationScreenKt.lambda__985741156$lambda$0$0$0((ho.l) obj);
                return lambda__985741156$lambda$0$0$0;
            case 4:
                lambda_389001599$lambda$0$0$0 = ComposableSingletons$PronunciationScreenKt.lambda_389001599$lambda$0$0$0((ho.l) obj);
                return lambda_389001599$lambda$0$0$0;
            case 5:
                lambda__680046232$lambda$0$0$0 = ComposableSingletons$PronunciationScreenKt.lambda__680046232$lambda$0$0$0((ho.l) obj);
                return lambda__680046232$lambda$0$0$0;
            case 6:
                lambda_288654334$lambda$0$0$0 = ComposableSingletons$PronunciationsListScreenKt.lambda_288654334$lambda$0$0$0((ho.l) obj);
                return lambda_288654334$lambda$0$0$0;
            case 7:
                lambda_1062690561$lambda$0$0$0 = ComposableSingletons$PronunciationsListScreenKt.lambda_1062690561$lambda$0$0$0((ho.l) obj);
                return lambda_1062690561$lambda$0$0$0;
            case 8:
                lambda_1062690561$lambda$0$2$0 = ComposableSingletons$PronunciationsListScreenKt.lambda_1062690561$lambda$0$2$0((String) obj);
                return lambda_1062690561$lambda$0$2$0;
            case 9:
                lambda_288654334$lambda$0$2$0 = ComposableSingletons$PronunciationsListScreenKt.lambda_288654334$lambda$0$2$0((String) obj);
                return lambda_288654334$lambda$0$2$0;
            case 10:
                lambda_1885073232$lambda$0$0$0 = ComposableSingletons$PronunciationsListScreenKt.lambda_1885073232$lambda$0$0$0((ho.l) obj);
                return lambda_1885073232$lambda$0$0$0;
            case 11:
                lambda_1885073232$lambda$0$2$0 = ComposableSingletons$PronunciationsListScreenKt.lambda_1885073232$lambda$0$2$0((String) obj);
                return lambda_1885073232$lambda$0$2$0;
            case 12:
                PronunciationScreenUI$lambda$9$0$0$1$0$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$0$1$0$0((PronunciationViewModel) obj);
                return PronunciationScreenUI$lambda$9$0$0$1$0$0;
            case 13:
                PronunciationScreenUI$lambda$9$0$0$2$0$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$0$2$0$0((PronunciationViewModel) obj);
                return PronunciationScreenUI$lambda$9$0$0$2$0$0;
            case 14:
                clearNavigateBackAction$lambda$0 = PronunciationViewModel.clearNavigateBackAction$lambda$0((PronunciationState) obj);
                return clearNavigateBackAction$lambda$0;
            case 15:
                PronunciationsListScreenUI$lambda$1$0$1$0$0 = PronunciationsListScreenKt.PronunciationsListScreenUI$lambda$1$0$1$0$0((Pronunciation) obj);
                return PronunciationsListScreenUI$lambda$1$0$1$0$0;
            default:
                clearNavigateToEdit$lambda$0 = PronunciationsListViewModel.clearNavigateToEdit$lambda$0((PronunciationsListState) obj);
                return clearNavigateToEdit$lambda$0;
        }
    }
}
