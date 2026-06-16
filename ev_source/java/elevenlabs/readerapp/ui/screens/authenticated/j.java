package io.elevenlabs.readerapp.ui.screens.authenticated;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15789b;

    public /* synthetic */ j(ho.l lVar, int i10) {
        this.f15788a = i10;
        this.f15789b = lVar;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z CategoriesTabs$lambda$0$0$0$0$0;
        sn.z SuggestedVoices$lambda$0$0$1$0$0;
        sn.z QuestionAgePage$lambda$0$0;
        sn.z QuestionAgePage$lambda$1$0;
        switch (this.f15788a) {
            case 0:
                CategoriesTabs$lambda$0$0$0$0$0 = DownloadsScreenKt.CategoriesTabs$lambda$0$0$0$0$0(this.f15789b);
                return CategoriesTabs$lambda$0$0$0$0$0;
            case 1:
                SuggestedVoices$lambda$0$0$1$0$0 = OnboardingScreenKt.SuggestedVoices$lambda$0$0$1$0$0(this.f15789b);
                return SuggestedVoices$lambda$0$0$1$0$0;
            case 2:
                QuestionAgePage$lambda$0$0 = OnboardingScreenKt.QuestionAgePage$lambda$0$0(this.f15789b);
                return QuestionAgePage$lambda$0$0;
            default:
                QuestionAgePage$lambda$1$0 = OnboardingScreenKt.QuestionAgePage$lambda$1$0(this.f15789b);
                return QuestionAgePage$lambda$1$0;
        }
    }
}
