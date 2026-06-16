package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExploreCollectionDetails f15378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f15379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i3.t f15380d;

    public /* synthetic */ d0(ExploreCollectionDetails exploreCollectionDetails, ho.a aVar, i3.t tVar, int i10) {
        this.f15377a = i10;
        this.f15378b = exploreCollectionDetails;
        this.f15379c = aVar;
        this.f15380d = tVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z ExploreCollectionScreenUI$lambda$6$3;
        sn.z ExploreSeriesScreenUI$lambda$6$3;
        switch (this.f15377a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                ExploreCollectionScreenUI$lambda$6$3 = ExploreCollectionScreenKt.ExploreCollectionScreenUI$lambda$6$3(this.f15378b, this.f15379c, this.f15380d, (l2) obj, (u2.m) obj2, intValue);
                return ExploreCollectionScreenUI$lambda$6$3;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                ExploreSeriesScreenUI$lambda$6$3 = ExploreSeriesScreenKt.ExploreSeriesScreenUI$lambda$6$3(this.f15378b, this.f15379c, this.f15380d, (l2) obj, (u2.m) obj2, intValue2);
                return ExploreSeriesScreenUI$lambda$6$3;
        }
    }
}
