package io.elevenlabs.readerapp.ui.components.explore;

import io.elevenlabs.ui.components.SelectableBoxKt;
import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14611c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14612d;

    public /* synthetic */ l(int i10, String str, String str2, boolean z6) {
        this.f14609a = i10;
        this.f14610b = z6;
        this.f14611c = str;
        this.f14612d = str2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z HeroCard$lambda$0$0;
        z SelectableBox_3f6hBDE$lambda$2$0;
        switch (this.f14609a) {
            case 0:
                HeroCard$lambda$0$0 = ExploreHeroCarouselKt.HeroCard$lambda$0$0(this.f14610b, this.f14611c, this.f14612d, (b0) obj);
                return HeroCard$lambda$0$0;
            default:
                SelectableBox_3f6hBDE$lambda$2$0 = SelectableBoxKt.SelectableBox_3f6hBDE$lambda$2$0(this.f14610b, this.f14611c, this.f14612d, (b0) obj);
                return SelectableBox_3f6hBDE$lambda$2$0;
        }
    }
}
