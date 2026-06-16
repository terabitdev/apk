package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.KeyLabel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel$loadLanguages$1$1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14991b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f14990a = i10;
        this.f14991b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z ExploreLanguageSettingScreen$lambda$0$0;
        ExploreLanguageState loadLanguages$lambda$0;
        ExploreLanguageState emit$lambda$1;
        switch (this.f14990a) {
            case 0:
                ExploreLanguageSettingScreen$lambda$0$0 = ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreen$lambda$0$0((ExploreLanguageSettingScreenViewModel) this.f14991b, (KeyLabel) obj);
                return ExploreLanguageSettingScreen$lambda$0$0;
            case 1:
                loadLanguages$lambda$0 = ExploreLanguageSettingScreenViewModel.loadLanguages$lambda$0((ExploreLanguageSettingScreenViewModel) this.f14991b, (ExploreLanguageState) obj);
                return loadLanguages$lambda$0;
            default:
                emit$lambda$1 = ExploreLanguageSettingScreenViewModel$loadLanguages$1$1.AnonymousClass1.emit$lambda$1((AsyncCallResult.Success) this.f14991b, (ExploreLanguageState) obj);
                return emit$lambda$1;
        }
    }
}
