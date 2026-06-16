package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.OnboardingSurvey;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnboardingSurvey.Question f17225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OnboardingSurvey.Answer f17226c;

    public /* synthetic */ x0(OnboardingSurvey.Question question, OnboardingSurvey.Answer answer, int i10) {
        this.f17224a = i10;
        this.f17225b = question;
        this.f17226c = answer;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z QuestionContent$lambda$2$0$0$0$0$0$0$0$0;
        OnboardingState onboardingState;
        switch (this.f17224a) {
            case 0:
                QuestionContent$lambda$2$0$0$0$0$0$0$0$0 = OnboardingScreenKt.QuestionContent$lambda$2$0$0$0$0$0$0$0$0(this.f17225b, this.f17226c, (OnboardingViewModel) obj);
                return QuestionContent$lambda$2$0$0$0$0$0$0$0$0;
            default:
                onboardingState = OnboardingViewModel.toggleAnswer$lambda$0(this.f17225b, this.f17226c, (OnboardingState) obj);
                return onboardingState;
        }
    }
}
