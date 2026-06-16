package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.Voice;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnboardingViewModel f15593b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Voice f15594c;

    public /* synthetic */ g1(OnboardingViewModel onboardingViewModel, Voice voice, int i10) {
        this.f15592a = i10;
        this.f15593b = onboardingViewModel;
        this.f15594c = voice;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        OnboardingState onboardingState;
        OnboardingState selectVoice$lambda$0;
        switch (this.f15592a) {
            case 0:
                onboardingState = OnboardingViewModel.togglePreview$lambda$0(this.f15593b, this.f15594c, (OnboardingState) obj);
                return onboardingState;
            default:
                selectVoice$lambda$0 = OnboardingViewModel.selectVoice$lambda$0(this.f15593b, this.f15594c, (OnboardingState) obj);
                return selectVoice$lambda$0;
        }
    }
}
