package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeScreenV4Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15511b;

    public /* synthetic */ g(float f10, int i10) {
        this.f15510a = i10;
        this.f15511b = f10;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z ExploreScreenUI$lambda$5$0$0$0$15$0$0;
        z ExploreScreenUI$lambda$5$0$0$0$15$0$3;
        z HomeScreenV3UI$lambda$5$0$10$0$0;
        z HomeScreenV3UI$lambda$5$0$10$0$1;
        z HomeScreenV4UI$lambda$4$0$0$10$0$0;
        z HomeScreenV4UI$lambda$4$0$0$10$0$2;
        z LibraryScreenUI$lambda$7$0$10$4$0$0;
        z LibraryScreenUI$lambda$7$0$10$4$0$5;
        z LibraryScreenUI$lambda$7$0$10$7$0$0;
        z LibraryScreenUI$lambda$7$0$10$7$0$2;
        int i10 = this.f15510a;
        t1.b bVar = (t1.b) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                ExploreScreenUI$lambda$5$0$0$0$15$0$0 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$15$0$0(this.f15511b, bVar, mVar, intValue);
                return ExploreScreenUI$lambda$5$0$0$0$15$0$0;
            case 1:
                ExploreScreenUI$lambda$5$0$0$0$15$0$3 = ExploreScreenKt.ExploreScreenUI$lambda$5$0$0$0$15$0$3(this.f15511b, bVar, mVar, intValue);
                return ExploreScreenUI$lambda$5$0$0$0$15$0$3;
            case 2:
                HomeScreenV3UI$lambda$5$0$10$0$0 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$10$0$0(this.f15511b, bVar, mVar, intValue);
                return HomeScreenV3UI$lambda$5$0$10$0$0;
            case 3:
                HomeScreenV3UI$lambda$5$0$10$0$1 = HomeScreenV3Kt.HomeScreenV3UI$lambda$5$0$10$0$1(this.f15511b, bVar, mVar, intValue);
                return HomeScreenV3UI$lambda$5$0$10$0$1;
            case 4:
                HomeScreenV4UI$lambda$4$0$0$10$0$0 = HomeScreenV4Kt.HomeScreenV4UI$lambda$4$0$0$10$0$0(this.f15511b, bVar, mVar, intValue);
                return HomeScreenV4UI$lambda$4$0$0$10$0$0;
            case 5:
                HomeScreenV4UI$lambda$4$0$0$10$0$2 = HomeScreenV4Kt.HomeScreenV4UI$lambda$4$0$0$10$0$2(this.f15511b, bVar, mVar, intValue);
                return HomeScreenV4UI$lambda$4$0$0$10$0$2;
            case 6:
                LibraryScreenUI$lambda$7$0$10$4$0$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$4$0$0(this.f15511b, bVar, mVar, intValue);
                return LibraryScreenUI$lambda$7$0$10$4$0$0;
            case 7:
                LibraryScreenUI$lambda$7$0$10$4$0$5 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$4$0$5(this.f15511b, bVar, mVar, intValue);
                return LibraryScreenUI$lambda$7$0$10$4$0$5;
            case 8:
                LibraryScreenUI$lambda$7$0$10$7$0$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$7$0$0(this.f15511b, bVar, mVar, intValue);
                return LibraryScreenUI$lambda$7$0$10$7$0$0;
            default:
                LibraryScreenUI$lambda$7$0$10$7$0$2 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$7$0$2(this.f15511b, bVar, mVar, intValue);
                return LibraryScreenUI$lambda$7$0$10$7$0$2;
        }
    }
}
