package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.ReadMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f14783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f14784c;

    public /* synthetic */ t(ho.l lVar, ReadMeta readMeta, int i10) {
        this.f14782a = i10;
        this.f14783b = lVar;
        this.f14784c = readMeta;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z FeedReadCarouselSection$lambda$3$1$0$0$0$0;
        sn.z ReadSection$lambda$0$0;
        switch (this.f14782a) {
            case 0:
                FeedReadCarouselSection$lambda$3$1$0$0$0$0 = FeedReadCarouselSectionKt.FeedReadCarouselSection$lambda$3$1$0$0$0$0(this.f14783b, this.f14784c);
                return FeedReadCarouselSection$lambda$3$1$0$0$0$0;
            default:
                ReadSection$lambda$0$0 = ReadSectionKt.ReadSection$lambda$0$0(this.f14783b, this.f14784c);
                return ReadSection$lambda$0$0;
        }
    }
}
