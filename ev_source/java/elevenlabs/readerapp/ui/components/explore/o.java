package io.elevenlabs.readerapp.ui.components.explore;

import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreLargeGridCollectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreSmallGridCollectionKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f14629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExploreRead f14630c;

    public /* synthetic */ o(ho.l lVar, ExploreRead exploreRead, int i10) {
        this.f14628a = i10;
        this.f14629b = lVar;
        this.f14630c = exploreRead;
    }

    @Override // ho.a
    public final Object invoke() {
        z ExploreReadCard$lambda$0$0$0$0$0$0;
        z LargeBookGridItem__b7W0Lw$lambda$1$0$0$0$0;
        z BookGridRow$lambda$1$0$0;
        z ExploreSmallGridCollection$lambda$2$2$0$0$0$0$0$0;
        z ExploreSmallGridCollection$lambda$2$2$0$0$0$0$1$0;
        switch (this.f14628a) {
            case 0:
                ExploreReadCard$lambda$0$0$0$0$0$0 = ExploreReadCardKt.ExploreReadCard$lambda$0$0$0$0$0$0(this.f14629b, this.f14630c);
                return ExploreReadCard$lambda$0$0$0$0$0$0;
            case 1:
                LargeBookGridItem__b7W0Lw$lambda$1$0$0$0$0 = ExploreLargeGridCollectionKt.LargeBookGridItem__b7W0Lw$lambda$1$0$0$0$0(this.f14629b, this.f14630c);
                return LargeBookGridItem__b7W0Lw$lambda$1$0$0$0$0;
            case 2:
                BookGridRow$lambda$1$0$0 = ExploreLargeGridCollectionKt.BookGridRow$lambda$1$0$0(this.f14629b, this.f14630c);
                return BookGridRow$lambda$1$0$0;
            case 3:
                ExploreSmallGridCollection$lambda$2$2$0$0$0$0$0$0 = ExploreSmallGridCollectionKt.ExploreSmallGridCollection$lambda$2$2$0$0$0$0$0$0(this.f14629b, this.f14630c);
                return ExploreSmallGridCollection$lambda$2$2$0$0$0$0$0$0;
            default:
                ExploreSmallGridCollection$lambda$2$2$0$0$0$0$1$0 = ExploreSmallGridCollectionKt.ExploreSmallGridCollection$lambda$2$2$0$0$0$0$1$0(this.f14629b, this.f14630c);
                return ExploreSmallGridCollection$lambda$2$2$0$0$0$0$1$0;
        }
    }
}
