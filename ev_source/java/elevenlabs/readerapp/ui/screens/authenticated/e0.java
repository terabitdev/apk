package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements ho.p {
    public final /* synthetic */ ho.l Y;
    public final /* synthetic */ String Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExploreCollectionDetails f15386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ua.b f15387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f15388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.l f15389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.a f15390f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ ho.p f15391x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f15392y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ int f15393z0;

    public /* synthetic */ e0(ExploreCollectionDetails exploreCollectionDetails, ua.b bVar, ho.a aVar, ho.l lVar, ho.a aVar2, ho.l lVar2, String str, ho.p pVar, int i10, int i11, int i12) {
        this.f15385a = i12;
        this.f15386b = exploreCollectionDetails;
        this.f15387c = bVar;
        this.f15388d = aVar;
        this.f15389e = lVar;
        this.f15390f = aVar2;
        this.Y = lVar2;
        this.Z = str;
        this.f15391x0 = pVar;
        this.f15392y0 = i10;
        this.f15393z0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ExploreCollectionScreenUI$lambda$7;
        sn.z ExploreSeriesScreenUI$lambda$7;
        switch (this.f15385a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ExploreCollectionScreenUI$lambda$7 = ExploreCollectionScreenKt.ExploreCollectionScreenUI$lambda$7(this.f15386b, this.f15387c, this.f15388d, this.f15389e, this.f15390f, this.Y, this.Z, this.f15391x0, this.f15392y0, this.f15393z0, (u2.m) obj, intValue);
                return ExploreCollectionScreenUI$lambda$7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ExploreSeriesScreenUI$lambda$7 = ExploreSeriesScreenKt.ExploreSeriesScreenUI$lambda$7(this.f15386b, this.f15387c, this.f15388d, this.f15389e, this.f15390f, this.Y, this.Z, this.f15391x0, this.f15392y0, this.f15393z0, (u2.m) obj, intValue2);
                return ExploreSeriesScreenUI$lambda$7;
        }
    }
}
