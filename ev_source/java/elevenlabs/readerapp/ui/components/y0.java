package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import i4.q2;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.domain.model.SeriesSection;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14840c;

    public /* synthetic */ y0(Object obj, Object obj2, int i10) {
        this.f14838a = i10;
        this.f14839b = obj;
        this.f14840c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z invoke$lambda$1;
        sn.z AnnouncementBannerCarousel$lambda$1$1$0$0;
        sn.z CategorieCollectionsRow$lambda$0$0$0$0$0;
        sn.z MiniReadGrid$lambda$0$2$0$0$0$0$0;
        sn.z SeriesSection$lambda$0$0;
        ad.i VoiceCollectionCell_FNF3uiM$lambda$4$0$0$0;
        sn.z WhatsNewPopup$lambda$0$0$0;
        switch (this.f14838a) {
            case 0:
                invoke$lambda$1 = SmoothProgressSliderKt$SmoothProgressSlider$2$2$1.invoke$lambda$1((u2.z0) this.f14839b, (s2) this.f14840c);
                return invoke$lambda$1;
            case 1:
                AnnouncementBannerCarousel$lambda$1$1$0$0 = AnnouncementBannerCarouselKt.AnnouncementBannerCarousel$lambda$1$1$0$0((ho.l) this.f14839b, (AnnouncementBannerCarouselSection.Banner) this.f14840c);
                return AnnouncementBannerCarousel$lambda$1$1$0$0;
            case 2:
                CategorieCollectionsRow$lambda$0$0$0$0$0 = CategorieCollectionRowKt.CategorieCollectionsRow$lambda$0$0$0$0$0((ho.l) this.f14839b, (CollectionMeta) this.f14840c);
                return CategorieCollectionsRow$lambda$0$0$0$0$0;
            case 3:
                MiniReadGrid$lambda$0$2$0$0$0$0$0 = MiniReadGridKt.MiniReadGrid$lambda$0$2$0$0$0$0$0((ho.l) this.f14839b, (MiniReadGridSection.Item) this.f14840c);
                return MiniReadGrid$lambda$0$2$0$0$0$0$0;
            case 4:
                SeriesSection$lambda$0$0 = SeriesSectionKt.SeriesSection$lambda$0$0((q2) this.f14839b, (SeriesSection) this.f14840c);
                return SeriesSection$lambda$0$0;
            case 5:
                VoiceCollectionCell_FNF3uiM$lambda$4$0$0$0 = VoiceCollectionCellKt.VoiceCollectionCell_FNF3uiM$lambda$4$0$0$0((Context) this.f14839b, (String) this.f14840c);
                return VoiceCollectionCell_FNF3uiM$lambda$4$0$0$0;
            default:
                WhatsNewPopup$lambda$0$0$0 = WhatsNewPopupKt.WhatsNewPopup$lambda$0$0$0((BottomSheetControl) this.f14839b, (ho.a) this.f14840c);
                return WhatsNewPopup$lambda$0$0$0;
        }
    }
}
