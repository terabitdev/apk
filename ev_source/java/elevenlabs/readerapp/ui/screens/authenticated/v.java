package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.ExploreRead;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17096c;

    public /* synthetic */ v(Object obj, Object obj2, int i10) {
        this.f17094a = i10;
        this.f17095b = obj;
        this.f17096c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z CategoriesTabs$lambda$0$0$1$0$0$0;
        sn.z ExploreCollectionScreen$lambda$8$0;
        sn.z playPreview$lambda$0;
        sn.z OnboardingScreenUI$lambda$0$0$2$0;
        sn.z QuestionAgePage$lambda$2$1$1$0;
        switch (this.f17094a) {
            case 0:
                CategoriesTabs$lambda$0$0$1$0$0$0 = DownloadsScreenKt.CategoriesTabs$lambda$0$0$1$0$0$0((ho.l) this.f17095b, (String) this.f17096c);
                return CategoriesTabs$lambda$0$0$1$0$0$0;
            case 1:
                ExploreCollectionScreen$lambda$8$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$8$0((ExploreCollectionState) this.f17095b, (u2.z0) this.f17096c);
                return ExploreCollectionScreen$lambda$8$0;
            case 2:
                playPreview$lambda$0 = ExploreCollectionViewModel.playPreview$lambda$0((ExploreCollectionViewModel) this.f17095b, (ExploreRead) this.f17096c);
                return playPreview$lambda$0;
            case 3:
                OnboardingScreenUI$lambda$0$0$2$0 = OnboardingScreenKt.OnboardingScreenUI$lambda$0$0$2$0((fr.d0) this.f17095b, (w1.e0) this.f17096c);
                return OnboardingScreenUI$lambda$0$0$2$0;
            default:
                QuestionAgePage$lambda$2$1$1$0 = OnboardingScreenKt.QuestionAgePage$lambda$2$1$1$0((ho.l) this.f17095b, (ho.a) this.f17096c);
                return QuestionAgePage$lambda$2$1$1$0;
        }
    }
}
