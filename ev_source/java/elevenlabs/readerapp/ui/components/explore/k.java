package io.elevenlabs.readerapp.ui.components.explore;

import io.elevenlabs.domain.model.ReadsExplorePage;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadsExplorePage.Section.GetReadsExploreHeroCarousel f14608b;

    public /* synthetic */ k(ReadsExplorePage.Section.GetReadsExploreHeroCarousel getReadsExploreHeroCarousel, int i10) {
        this.f14607a = i10;
        this.f14608b = getReadsExploreHeroCarousel;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z Preview_ExploreHeroCarousel_NoSubtitles$lambda$0;
        z Preview_ExploreHeroCarousel_NoSubtitles$lambda$0$0;
        int i10 = this.f14607a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                Preview_ExploreHeroCarousel_NoSubtitles$lambda$0 = ExploreHeroCarouselKt.Preview_ExploreHeroCarousel_NoSubtitles$lambda$0(this.f14608b, mVar, intValue);
                return Preview_ExploreHeroCarousel_NoSubtitles$lambda$0;
            default:
                Preview_ExploreHeroCarousel_NoSubtitles$lambda$0$0 = ExploreHeroCarouselKt.Preview_ExploreHeroCarousel_NoSubtitles$lambda$0$0(this.f14608b, mVar, intValue);
                return Preview_ExploreHeroCarousel_NoSubtitles$lambda$0$0;
        }
    }
}
