package io.elevenlabs.readerapp.ui.screens.authenticated;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnboardingViewModel f17221b;

    public /* synthetic */ w0(OnboardingViewModel onboardingViewModel, int i10) {
        this.f17220a = i10;
        this.f17221b = onboardingViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z OnboardingScreen$lambda$1$0;
        OnboardingState loadVoiceSuggestions$lambda$0;
        OnboardingState completeOnboarding$lambda$0;
        OnboardingState completeAgeOnlyOnboarding$lambda$0;
        switch (this.f17220a) {
            case 0:
                OnboardingScreen$lambda$1$0 = OnboardingScreenKt.OnboardingScreen$lambda$1$0(this.f17221b, (ho.l) obj);
                return OnboardingScreen$lambda$1$0;
            case 1:
                loadVoiceSuggestions$lambda$0 = OnboardingViewModel.loadVoiceSuggestions$lambda$0(this.f17221b, (OnboardingState) obj);
                return loadVoiceSuggestions$lambda$0;
            case 2:
                completeOnboarding$lambda$0 = OnboardingViewModel.completeOnboarding$lambda$0(this.f17221b, (OnboardingState) obj);
                return completeOnboarding$lambda$0;
            default:
                completeAgeOnlyOnboarding$lambda$0 = OnboardingViewModel.completeAgeOnlyOnboarding$lambda$0(this.f17221b, (OnboardingState) obj);
                return completeAgeOnlyOnboarding$lambda$0;
        }
    }
}
