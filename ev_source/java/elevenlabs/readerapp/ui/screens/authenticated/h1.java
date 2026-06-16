package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnboardingViewModel f15607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f15608c;

    public /* synthetic */ h1(OnboardingViewModel onboardingViewModel, AsyncCallResult.Error error, int i10) {
        this.f15606a = i10;
        this.f15607b = onboardingViewModel;
        this.f15608c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f15606a) {
            case 0:
                return OnboardingViewModel$completeOnboarding$1$1.i(this.f15607b, this.f15608c, (OnboardingState) obj);
            case 1:
                return OnboardingViewModel$loadVoiceSuggestions$1$1.i(this.f15607b, this.f15608c, (OnboardingState) obj);
            default:
                return OnboardingViewModel$loadVoiceSuggestions$1$1.m(this.f15607b, this.f15608c, (OnboardingState) obj);
        }
    }
}
