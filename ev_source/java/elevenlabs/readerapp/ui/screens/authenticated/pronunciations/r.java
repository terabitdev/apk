package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PronunciationsListViewModel f16617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pronunciation f16618c;

    public /* synthetic */ r(PronunciationsListViewModel pronunciationsListViewModel, Pronunciation pronunciation, int i10) {
        this.f16616a = i10;
        this.f16617b = pronunciationsListViewModel;
        this.f16618c = pronunciation;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PronunciationsListState onPlayPreview$lambda$0;
        switch (this.f16616a) {
            case 0:
                return PronunciationsListViewModel$onPlayPreview$1$1.d(this.f16617b, this.f16618c, (PronunciationPreviewState) obj);
            default:
                onPlayPreview$lambda$0 = PronunciationsListViewModel.onPlayPreview$lambda$0(this.f16617b, this.f16618c, (PronunciationsListState) obj);
                return onPlayPreview$lambda$0;
        }
    }
}
