package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.model.InterestsAnswer;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15037a;

    public /* synthetic */ t(int i10) {
        this.f15037a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        u1.e Content$lambda$1$0$1;
        Object Content$lambda$1$0$2;
        ManageContentInterestsState onNavigateBack$lambda$0;
        switch (this.f15037a) {
            case 0:
                Content$lambda$1$0$1 = ManageContentInterestsScreenKt.Content$lambda$1$0$1((u1.o) obj);
                return Content$lambda$1$0$1;
            case 1:
                Content$lambda$1$0$2 = ManageContentInterestsScreenKt.Content$lambda$1$0$2((InterestsAnswer) obj);
                return Content$lambda$1$0$2;
            default:
                onNavigateBack$lambda$0 = ManageContentInterestsViewModel.onNavigateBack$lambda$0((ManageContentInterestsState) obj);
                return onNavigateBack$lambda$0;
        }
    }
}
