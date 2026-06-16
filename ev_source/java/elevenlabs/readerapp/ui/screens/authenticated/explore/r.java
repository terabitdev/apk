package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15562b;

    public /* synthetic */ r(String str, int i10) {
        this.f15561a = i10;
        this.f15562b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ExploreState emit$lambda$0;
        z ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0$0;
        ExploreState clearFilter$lambda$0;
        switch (this.f15561a) {
            case 0:
                emit$lambda$0 = ExploreViewModel.AnonymousClass2.AnonymousClass1.emit$lambda$0(this.f15562b, (ExploreState) obj);
                return emit$lambda$0;
            case 1:
                ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0$0(this.f15562b, (ExploreViewModel) obj);
                return ExploreScreenUI$lambda$5$0$0$0$15$0$1$1$0$0;
            default:
                clearFilter$lambda$0 = ExploreViewModel.clearFilter$lambda$0(this.f15562b, (ExploreState) obj);
                return clearFilter$lambda$0;
        }
    }
}
