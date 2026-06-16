package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.StatsCarouselSection;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.HomeStatsCarouselKt;
import io.elevenlabs.ui.components.ShadowKt;
import q2.y2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ho.p {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f14544c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14547f;

    public /* synthetic */ d(i3.t tVar, long j4, ho.r rVar, ho.q qVar, int i10, int i11) {
        this.f14542a = 3;
        this.f14544c = tVar;
        this.f14543b = j4;
        this.Y = rVar;
        this.f14545d = qVar;
        this.f14546e = i10;
        this.f14547f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z BannerButton_sW7UJKQ$lambda$2;
        sn.z HomeStatsCarouselV3$lambda$2;
        sn.z HomeStatsCarouselSectionV4$lambda$2;
        sn.z DynamicBottomShadowOverlay_sW7UJKQ$lambda$5;
        switch (this.f14542a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                BannerButton_sW7UJKQ$lambda$2 = AnnouncementBannerCarouselKt.BannerButton_sW7UJKQ$lambda$2((String) this.Y, this.f14543b, (ho.a) this.f14545d, this.f14544c, this.f14546e, this.f14547f, (u2.m) obj, intValue);
                return BannerButton_sW7UJKQ$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                HomeStatsCarouselV3$lambda$2 = HomeStatsCarouselKt.HomeStatsCarouselV3$lambda$2((StatsCarouselSection) this.Y, this.f14543b, this.f14544c, (ho.a) this.f14545d, this.f14546e, this.f14547f, (u2.m) obj, intValue2);
                return HomeStatsCarouselV3$lambda$2;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                HomeStatsCarouselSectionV4$lambda$2 = io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.HomeStatsCarouselKt.HomeStatsCarouselSectionV4$lambda$2((HomePageV4.Section.StatsCarousel) this.Y, this.f14543b, (ho.a) this.f14545d, this.f14544c, this.f14546e, this.f14547f, (u2.m) obj, intValue3);
                return HomeStatsCarouselSectionV4$lambda$2;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                DynamicBottomShadowOverlay_sW7UJKQ$lambda$5 = ShadowKt.DynamicBottomShadowOverlay_sW7UJKQ$lambda$5(this.f14544c, this.f14543b, (ho.r) this.Y, (ho.q) this.f14545d, this.f14546e, this.f14547f, (u2.m) obj, intValue4);
                return DynamicBottomShadowOverlay_sW7UJKQ$lambda$5;
            case 4:
                ((Integer) obj2).getClass();
                y2.b((v3.f) this.f14545d, (String) this.Y, this.f14544c, this.f14543b, (u2.m) obj, u2.r.M(this.f14546e | 1), this.f14547f);
                return sn.z.f31622a;
            default:
                ((Integer) obj2).getClass();
                y2.a((u3.c) this.f14545d, (String) this.Y, this.f14544c, this.f14543b, (u2.m) obj, u2.r.M(this.f14546e | 1), this.f14547f);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ d(StatsCarouselSection statsCarouselSection, long j4, i3.t tVar, ho.a aVar, int i10, int i11) {
        this.f14542a = 1;
        this.Y = statsCarouselSection;
        this.f14543b = j4;
        this.f14544c = tVar;
        this.f14545d = aVar;
        this.f14546e = i10;
        this.f14547f = i11;
    }

    public /* synthetic */ d(Object obj, long j4, ho.a aVar, i3.t tVar, int i10, int i11, int i12) {
        this.f14542a = i12;
        this.Y = obj;
        this.f14543b = j4;
        this.f14545d = aVar;
        this.f14544c = tVar;
        this.f14546e = i10;
        this.f14547f = i11;
    }

    public /* synthetic */ d(Object obj, String str, i3.t tVar, long j4, int i10, int i11, int i12) {
        this.f14542a = i12;
        this.f14545d = obj;
        this.Y = str;
        this.f14544c = tVar;
        this.f14543b = j4;
        this.f14546e = i10;
        this.f14547f = i11;
    }
}
