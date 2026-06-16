package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import i1.j2;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeScreenV3Kt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeStateV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryTab;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.p {
    public final /* synthetic */ int A0;
    public final /* synthetic */ int B0;
    public final /* synthetic */ Object C0;
    public final /* synthetic */ Object D0;
    public final /* synthetic */ sn.d E0;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15535a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f15537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f15538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.p f15539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.p f15540f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ j2 f15541x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ i1.o f15542y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ int f15543z0;

    public /* synthetic */ m(ho.p pVar, ho.p pVar2, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.p pVar3, j2 j2Var, i1.o oVar, LibraryTab libraryTab, ReadsService.SortBy sortBy, LibraryViewModel libraryViewModel, int i10, int i11, int i12) {
        this.f15539e = pVar;
        this.f15540f = pVar2;
        this.f15537c = lVar;
        this.f15538d = aVar;
        this.C0 = aVar2;
        this.f15536b = aVar3;
        this.E0 = pVar3;
        this.f15541x0 = j2Var;
        this.f15542y0 = oVar;
        this.Y = libraryTab;
        this.Z = sortBy;
        this.D0 = libraryViewModel;
        this.f15543z0 = i10;
        this.A0 = i11;
        this.B0 = i12;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreScreenUI$lambda$6;
        z HomeScreenV3UI$lambda$6;
        z LibraryScreen$lambda$21;
        switch (this.f15535a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ExploreScreenUI$lambda$6 = ExploreScreenKt.ExploreScreenUI$lambda$6((ExploreState) this.C0, (ua.b) this.f15536b, this.f15537c, this.f15539e, this.f15540f, this.f15538d, (ho.l) this.Y, (ho.l) this.Z, (ho.l) this.D0, (ho.p) this.E0, this.f15541x0, this.f15542y0, this.f15543z0, this.A0, this.B0, (u2.m) obj, intValue);
                return ExploreScreenUI$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                HomeScreenV3UI$lambda$6 = HomeScreenV3Kt.HomeScreenV3UI$lambda$6((HomeStateV3) this.C0, (ua.b) this.f15536b, this.f15537c, this.f15538d, this.f15539e, this.f15540f, (ho.l) this.Y, (ho.l) this.Z, (ho.a) this.D0, (ho.a) this.E0, this.f15541x0, this.f15542y0, this.f15543z0, this.A0, this.B0, (u2.m) obj, intValue2);
                return HomeScreenV3UI$lambda$6;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                LibraryScreen$lambda$21 = LibraryScreenKt.LibraryScreen$lambda$21(this.f15539e, this.f15540f, this.f15537c, this.f15538d, (ho.a) this.C0, (ho.a) this.f15536b, (ho.p) this.E0, this.f15541x0, this.f15542y0, (LibraryTab) this.Y, (ReadsService.SortBy) this.Z, (LibraryViewModel) this.D0, this.f15543z0, this.A0, this.B0, (u2.m) obj, intValue3);
                return LibraryScreen$lambda$21;
        }
    }

    public /* synthetic */ m(ExploreState exploreState, ua.b bVar, ho.l lVar, ho.p pVar, ho.p pVar2, ho.a aVar, ho.l lVar2, ho.l lVar3, ho.l lVar4, ho.p pVar3, j2 j2Var, i1.o oVar, int i10, int i11, int i12) {
        this.C0 = exploreState;
        this.f15536b = bVar;
        this.f15537c = lVar;
        this.f15539e = pVar;
        this.f15540f = pVar2;
        this.f15538d = aVar;
        this.Y = lVar2;
        this.Z = lVar3;
        this.D0 = lVar4;
        this.E0 = pVar3;
        this.f15541x0 = j2Var;
        this.f15542y0 = oVar;
        this.f15543z0 = i10;
        this.A0 = i11;
        this.B0 = i12;
    }

    public /* synthetic */ m(HomeStateV3 homeStateV3, ua.b bVar, ho.l lVar, ho.a aVar, ho.p pVar, ho.p pVar2, ho.l lVar2, ho.l lVar3, ho.a aVar2, ho.a aVar3, j2 j2Var, i1.o oVar, int i10, int i11, int i12) {
        this.C0 = homeStateV3;
        this.f15536b = bVar;
        this.f15537c = lVar;
        this.f15538d = aVar;
        this.f15539e = pVar;
        this.f15540f = pVar2;
        this.Y = lVar2;
        this.Z = lVar3;
        this.D0 = aVar2;
        this.E0 = aVar3;
        this.f15541x0 = j2Var;
        this.f15542y0 = oVar;
        this.f15543z0 = i10;
        this.A0 = i11;
        this.B0 = i12;
    }
}
