package io.elevenlabs.readerapp.ui.components;

import i4.q2;
import io.elevenlabs.domain.model.FlatCarouselItem;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f14792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlatCarouselItem f14793c;

    public /* synthetic */ u(q2 q2Var, FlatCarouselItem flatCarouselItem, int i10) {
        this.f14791a = i10;
        this.f14792b = q2Var;
        this.f14793c = flatCarouselItem;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z FlatCarouselSection$lambda$0$1$0$0;
        sn.z FlatCarouselSection$lambda$0$2$0$0;
        switch (this.f14791a) {
            case 0:
                FlatCarouselSection$lambda$0$1$0$0 = FlatCarouselSectionKt.FlatCarouselSection$lambda$0$1$0$0(this.f14792b, this.f14793c);
                return FlatCarouselSection$lambda$0$1$0$0;
            default:
                FlatCarouselSection$lambda$0$2$0$0 = FlatCarouselSectionKt.FlatCarouselSection$lambda$0$2$0$0(this.f14792b, this.f14793c);
                return FlatCarouselSection$lambda$0$2$0$0;
        }
    }
}
