package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import io.elevenlabs.domain.model.PronunciationPreviewState;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PronunciationViewModel f16599b;

    public /* synthetic */ k(PronunciationViewModel pronunciationViewModel, int i10) {
        this.f16598a = i10;
        this.f16599b = pronunciationViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z PronunciationScreen$lambda$3$0;
        PronunciationState onSaveClick$lambda$0;
        PronunciationState onPlayPreview$lambda$0;
        switch (this.f16598a) {
            case 0:
                return PronunciationViewModel$onPlayPreview$1$1.h(this.f16599b, (PronunciationPreviewState) obj);
            case 1:
                PronunciationScreen$lambda$3$0 = PronunciationScreenKt.PronunciationScreen$lambda$3$0(this.f16599b, (ho.l) obj);
                return PronunciationScreen$lambda$3$0;
            case 2:
                onSaveClick$lambda$0 = PronunciationViewModel.onSaveClick$lambda$0(this.f16599b, (PronunciationState) obj);
                return onSaveClick$lambda$0;
            default:
                onPlayPreview$lambda$0 = PronunciationViewModel.onPlayPreview$lambda$0(this.f16599b, (PronunciationState) obj);
                return onPlayPreview$lambda$0;
        }
    }
}
