package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements ho.p {
    public final /* synthetic */ int A0;
    public final /* synthetic */ String Y;
    public final /* synthetic */ i3.t Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15597a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExploreCollectionDetails f15598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ua.b f15600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.l f15601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ho.l f15602f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ ho.p f15603x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ float f15604y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ int f15605z0;

    public /* synthetic */ h0(ExploreCollectionDetails exploreCollectionDetails, long j4, ua.b bVar, ho.l lVar, ho.l lVar2, String str, i3.t tVar, ho.p pVar, float f10, int i10, int i11) {
        this.f15598b = exploreCollectionDetails;
        this.f15599c = j4;
        this.f15600d = bVar;
        this.f15601e = lVar;
        this.f15602f = lVar2;
        this.Y = str;
        this.Z = tVar;
        this.f15603x0 = pVar;
        this.f15604y0 = f10;
        this.f15605z0 = i10;
        this.A0 = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z CollectionDetailsScaffold_lQd7feU$lambda$4;
        sn.z SeriesContent_lQd7feU$lambda$5;
        u2.m mVar = (u2.m) obj;
        switch (this.f15597a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CollectionDetailsScaffold_lQd7feU$lambda$4 = ExploreCollectionScreenKt.CollectionDetailsScaffold_lQd7feU$lambda$4(this.f15598b, this.f15599c, this.f15600d, this.Z, this.f15601e, this.f15602f, this.Y, this.f15603x0, this.f15604y0, this.f15605z0, this.A0, mVar, intValue);
                return CollectionDetailsScaffold_lQd7feU$lambda$4;
            default:
                SeriesContent_lQd7feU$lambda$5 = ExploreSeriesScreenKt.SeriesContent_lQd7feU$lambda$5(this.f15598b, this.f15599c, this.f15600d, this.f15601e, this.f15602f, this.Y, this.Z, this.f15603x0, this.f15604y0, this.f15605z0, this.A0, mVar, ((Integer) obj2).intValue());
                return SeriesContent_lQd7feU$lambda$5;
        }
    }

    public /* synthetic */ h0(ExploreCollectionDetails exploreCollectionDetails, long j4, ua.b bVar, i3.t tVar, ho.l lVar, ho.l lVar2, String str, ho.p pVar, float f10, int i10, int i11) {
        this.f15598b = exploreCollectionDetails;
        this.f15599c = j4;
        this.f15600d = bVar;
        this.Z = tVar;
        this.f15601e = lVar;
        this.f15602f = lVar2;
        this.Y = str;
        this.f15603x0 = pVar;
        this.f15604y0 = f10;
        this.f15605z0 = i10;
        this.A0 = i11;
    }
}
