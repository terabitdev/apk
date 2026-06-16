package io.elevenlabs.readerapp.ui.components.explore;

import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreVoiceCollectionKt;
import java.util.List;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements ho.p {
    public final /* synthetic */ t Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f14599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.l f14600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.a f14601f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f14602x0;

    public /* synthetic */ i(String str, String str2, List list, ho.l lVar, t tVar, ho.a aVar, int i10, int i11) {
        this.f14596a = 0;
        this.f14597b = str;
        this.f14598c = str2;
        this.f14599d = list;
        this.f14600e = lVar;
        this.Y = tVar;
        this.f14601f = aVar;
        this.Z = i10;
        this.f14602x0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ExploreCardCarouselCollection$lambda$2;
        z ExploreHeroCarousel$lambda$3;
        z ExploreVoiceCollection$lambda$2;
        switch (this.f14596a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                String str = this.f14597b;
                String str2 = this.f14598c;
                List list = this.f14599d;
                ho.l lVar = this.f14600e;
                ho.a aVar = this.f14601f;
                ExploreCardCarouselCollection$lambda$2 = ExploreCardCarouselCollectionKt.ExploreCardCarouselCollection$lambda$2(str, str2, list, lVar, this.Y, aVar, this.Z, this.f14602x0, (u2.m) obj, intValue);
                return ExploreCardCarouselCollection$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ExploreHeroCarousel$lambda$3 = ExploreHeroCarouselKt.ExploreHeroCarousel$lambda$3(this.f14597b, this.f14598c, this.f14599d, this.f14600e, this.f14601f, this.Y, this.Z, this.f14602x0, (u2.m) obj, intValue2);
                return ExploreHeroCarousel$lambda$3;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                ExploreVoiceCollection$lambda$2 = ExploreVoiceCollectionKt.ExploreVoiceCollection$lambda$2(this.f14597b, this.f14598c, this.f14599d, this.f14600e, this.f14601f, this.Y, this.Z, this.f14602x0, (u2.m) obj, intValue3);
                return ExploreVoiceCollection$lambda$2;
        }
    }

    public /* synthetic */ i(String str, String str2, List list, ho.l lVar, ho.a aVar, t tVar, int i10, int i11, int i12) {
        this.f14596a = i12;
        this.f14597b = str;
        this.f14598c = str2;
        this.f14599d = list;
        this.f14600e = lVar;
        this.f14601f = aVar;
        this.Y = tVar;
        this.Z = i10;
        this.f14602x0 = i11;
    }
}
