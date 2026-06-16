package io.elevenlabs.readerapp.ui.components;

import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn.d f14645c;

    public /* synthetic */ f(List list, sn.d dVar, int i10) {
        this.f14643a = i10;
        this.f14644b = list;
        this.f14645c = dVar;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z AnnouncementBannerCarousel$lambda$1$1;
        sn.z MediaCarousel$lambda$2;
        switch (this.f14643a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                AnnouncementBannerCarousel$lambda$1$1 = AnnouncementBannerCarouselKt.AnnouncementBannerCarousel$lambda$1$1(this.f14644b, (ho.l) this.f14645c, (w1.w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue);
                return AnnouncementBannerCarousel$lambda$1$1;
            default:
                int intValue2 = ((Integer) obj4).intValue();
                MediaCarousel$lambda$2 = FlatCarouselSectionKt.MediaCarousel$lambda$2(this.f14644b, (ho.q) this.f14645c, (w1.w) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue2);
                return MediaCarousel$lambda$2;
        }
    }
}
