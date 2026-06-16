package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel$loadLanguages$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExploreLanguageSettingScreenViewModel f15002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15003c;

    public /* synthetic */ h(ExploreLanguageSettingScreenViewModel exploreLanguageSettingScreenViewModel, Object obj, int i10) {
        this.f15001a = i10;
        this.f15002b = exploreLanguageSettingScreenViewModel;
        this.f15003c = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ExploreLanguageState selectLanguage$lambda$0;
        switch (this.f15001a) {
            case 0:
                return ExploreLanguageSettingScreenViewModel$loadLanguages$1$1.AnonymousClass1.b(this.f15002b, (AsyncCallResult.Error) this.f15003c, (ExploreLanguageState) obj);
            default:
                selectLanguage$lambda$0 = ExploreLanguageSettingScreenViewModel.selectLanguage$lambda$0(this.f15002b, (KeyLabel) this.f15003c, (ExploreLanguageState) obj);
                return selectLanguage$lambda$0;
        }
    }
}
