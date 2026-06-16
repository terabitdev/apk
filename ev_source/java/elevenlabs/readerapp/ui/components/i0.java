package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreCardCarouselCollectionKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14687b;

    public /* synthetic */ i0(int i10, int i11) {
        this.f14686a = i11;
        this.f14687b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Preview_VoiceFeaturedCell$lambda$1;
        sn.z Preview_VoiceRow$lambda$1;
        sn.z Preview_ExploreCardCarouselCollection_PricingStates$lambda$0;
        sn.z Preview_ExploreCardCarouselCollection_LongTitles$lambda$0;
        sn.z Preview_ExploreCardCarouselCollection_Minimal$lambda$0;
        int i10 = this.f14686a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ReadPricingRowKt.d(this.f14687b, mVar, intValue);
            case 1:
                return ReadPricingRowKt.c(this.f14687b, mVar, intValue);
            case 2:
                return ReadPricingRowKt.a(this.f14687b, mVar, intValue);
            case 3:
                return ReadPricingRowKt.h(this.f14687b, mVar, intValue);
            case 4:
                return ReadPricingRowKt.b(this.f14687b, mVar, intValue);
            case 5:
                return ReadPricingRowKt.l(this.f14687b, mVar, intValue);
            case 6:
                return ReadSectionKt.c(this.f14687b, mVar, intValue);
            case 7:
                return ReadSmallRowKt.k(this.f14687b, mVar, intValue);
            case 8:
                return ReadSmallRowKt.f(this.f14687b, mVar, intValue);
            case 9:
                return ReadSmallRowKt.c(this.f14687b, mVar, intValue);
            case 10:
                return SeriesSectionKt.c(this.f14687b, mVar, intValue);
            case 11:
                return SeriesSectionKt.b(this.f14687b, mVar, intValue);
            case 12:
                return SizeableHeaderImageKt.b(this.f14687b, mVar, intValue);
            case 13:
                return SizeableHeaderImageKt.a(this.f14687b, mVar, intValue);
            case 14:
                return SmoothProgressSliderKt.a(this.f14687b, mVar, intValue);
            case 15:
                return SmoothProgressSliderKt.m(this.f14687b, mVar, intValue);
            case 16:
                return SmoothProgressSliderKt.n(this.f14687b, mVar, intValue);
            case 17:
                return VoiceCollectionCellKt.c(this.f14687b, mVar, intValue);
            case 18:
                return VoiceFavoriteButtonKt.e(this.f14687b, mVar, intValue);
            case 19:
                Preview_VoiceFeaturedCell$lambda$1 = VoiceFeaturedCellKt.Preview_VoiceFeaturedCell$lambda$1(this.f14687b, mVar, intValue);
                return Preview_VoiceFeaturedCell$lambda$1;
            case 20:
                Preview_VoiceRow$lambda$1 = VoiceRowKt.Preview_VoiceRow$lambda$1(this.f14687b, mVar, intValue);
                return Preview_VoiceRow$lambda$1;
            case 21:
                return VoiceRowShimmeringKt.b(this.f14687b, mVar, intValue);
            case 22:
                return WhatsNewPopupKt.d(this.f14687b, mVar, intValue);
            case 23:
                return ExploreBookCoverKt.e(this.f14687b, mVar, intValue);
            case 24:
                return ExploreBookCoverKt.a(this.f14687b, mVar, intValue);
            case 25:
                return ExploreBookCoverKt.n(this.f14687b, mVar, intValue);
            case 26:
                return ExploreBookCoverKt.d(this.f14687b, mVar, intValue);
            case 27:
                Preview_ExploreCardCarouselCollection_PricingStates$lambda$0 = ExploreCardCarouselCollectionKt.Preview_ExploreCardCarouselCollection_PricingStates$lambda$0(this.f14687b, mVar, intValue);
                return Preview_ExploreCardCarouselCollection_PricingStates$lambda$0;
            case 28:
                Preview_ExploreCardCarouselCollection_LongTitles$lambda$0 = ExploreCardCarouselCollectionKt.Preview_ExploreCardCarouselCollection_LongTitles$lambda$0(this.f14687b, mVar, intValue);
                return Preview_ExploreCardCarouselCollection_LongTitles$lambda$0;
            default:
                Preview_ExploreCardCarouselCollection_Minimal$lambda$0 = ExploreCardCarouselCollectionKt.Preview_ExploreCardCarouselCollection_Minimal$lambda$0(this.f14687b, mVar, intValue);
                return Preview_ExploreCardCarouselCollection_Minimal$lambda$0;
        }
    }
}
