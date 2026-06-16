package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import a2.y1;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel$observePronunciations$1;
import java.util.List;
import sn.z;
import y4.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16601b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f16600a = i10;
        this.f16601b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PronunciationState invokeSuspend$lambda$0$0;
        PronunciationsListState invokeSuspend$lambda$0;
        z PronunciationScreenUI$lambda$9$0$0$0$0$0;
        z PronunciationScreenUI$lambda$9$0$1$0$0;
        z SpokenTextTextField$lambda$1$0;
        PronunciationState onSpokenTextChanged$lambda$0;
        z PronunciationsListScreen$lambda$2$0;
        switch (this.f16600a) {
            case 0:
                invokeSuspend$lambda$0$0 = PronunciationViewModel$onPlayPreview$1$1.invokeSuspend$lambda$0$0((PronunciationPreviewState) this.f16601b, (PronunciationState) obj);
                return invokeSuspend$lambda$0$0;
            case 1:
                invokeSuspend$lambda$0 = PronunciationsListViewModel$observePronunciations$1.AnonymousClass2.invokeSuspend$lambda$0((List) this.f16601b, (PronunciationsListState) obj);
                return invokeSuspend$lambda$0;
            case 2:
                PronunciationScreenUI$lambda$9$0$0$0$0$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$0$0$0$0((w) this.f16601b, (PronunciationViewModel) obj);
                return PronunciationScreenUI$lambda$9$0$0$0$0$0;
            case 3:
                PronunciationScreenUI$lambda$9$0$1$0$0 = PronunciationScreenKt.PronunciationScreenUI$lambda$9$0$1$0$0((PronunciationState) this.f16601b, (PronunciationViewModel) obj);
                return PronunciationScreenUI$lambda$9$0$1$0$0;
            case 4:
                SpokenTextTextField$lambda$1$0 = PronunciationScreenKt.SpokenTextTextField$lambda$1$0((ho.a) this.f16601b, (y1) obj);
                return SpokenTextTextField$lambda$1$0;
            case 5:
                onSpokenTextChanged$lambda$0 = PronunciationViewModel.onSpokenTextChanged$lambda$0((String) this.f16601b, (PronunciationState) obj);
                return onSpokenTextChanged$lambda$0;
            default:
                PronunciationsListScreen$lambda$2$0 = PronunciationsListScreenKt.PronunciationsListScreen$lambda$2$0((PronunciationsListViewModel) this.f16601b, (ho.l) obj);
                return PronunciationsListScreen$lambda$2$0;
        }
    }
}
