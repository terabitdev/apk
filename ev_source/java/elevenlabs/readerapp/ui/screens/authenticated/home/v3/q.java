package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15689b;

    public /* synthetic */ q(String str, int i10) {
        this.f15688a = i10;
        this.f15689b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z HomeSectionContent$lambda$4$0$0$0;
        z HomeSectionContent$lambda$3$0$0$0;
        z homeItems$lambda$3$0$0$0;
        z HomeSectionContent$lambda$9$0$0;
        switch (this.f15688a) {
            case 0:
                HomeSectionContent$lambda$4$0$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$4$0$0$0(this.f15689b, (HomeViewModelV3) obj);
                return HomeSectionContent$lambda$4$0$0$0;
            case 1:
                HomeSectionContent$lambda$3$0$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$3$0$0$0(this.f15689b, (HomeViewModelV3) obj);
                return HomeSectionContent$lambda$3$0$0$0;
            case 2:
                homeItems$lambda$3$0$0$0 = HomeScreenV3Kt.homeItems$lambda$3$0$0$0(this.f15689b, (HomeViewModelV3) obj);
                return homeItems$lambda$3$0$0$0;
            default:
                HomeSectionContent$lambda$9$0$0 = HomeScreenV3Kt.HomeSectionContent$lambda$9$0$0(this.f15689b, (HomeViewModelV3) obj);
                return HomeSectionContent$lambda$9$0$0;
        }
    }
}
