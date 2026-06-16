package io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements;

import ho.q;
import io.elevenlabs.domain.model.StatsCarouselSection;
import r1.s;
import r1.y;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StatsCarouselSection f15648e;

    public /* synthetic */ g(String str, String str2, long j4, StatsCarouselSection statsCarouselSection, int i10) {
        this.f15644a = i10;
        this.f15645b = str;
        this.f15646c = str2;
        this.f15647d = j4;
        this.f15648e = statsCarouselSection;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z HomeStatsCarouselV3$lambda$1$0$1$0;
        z HomeStatsCarouselV3$lambda$1$0$1;
        switch (this.f15644a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                HomeStatsCarouselV3$lambda$1$0$1$0 = HomeStatsCarouselKt.HomeStatsCarouselV3$lambda$1$0$1$0(this.f15645b, this.f15646c, this.f15647d, this.f15648e, (y) obj, (m) obj2, intValue);
                return HomeStatsCarouselV3$lambda$1$0$1$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                HomeStatsCarouselV3$lambda$1$0$1 = HomeStatsCarouselKt.HomeStatsCarouselV3$lambda$1$0$1(this.f15645b, this.f15646c, this.f15647d, this.f15648e, (s) obj, (m) obj2, intValue2);
                return HomeStatsCarouselV3$lambda$1$0$1;
        }
    }
}
