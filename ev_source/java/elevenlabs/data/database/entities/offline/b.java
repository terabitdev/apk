package io.elevenlabs.data.database.entities.offline;

import g1.r;
import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OfflineReadsDao_Impl f14017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mb.a f14018c;

    public /* synthetic */ b(OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar, int i10) {
        this.f14016a = i10;
        this.f14017b = offlineReadsDao_Impl;
        this.f14018c = aVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0;
        z __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0;
        z __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0;
        z __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1$lambda$0;
        z __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0;
        switch (this.f14016a) {
            case 0:
                __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0 = OfflineReadsDao_Impl.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0(this.f14017b, this.f14018c, (r) obj);
                return __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0;
            case 1:
                __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0 = OfflineReadsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0(this.f14017b, this.f14018c, (r) obj);
                return __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0;
            case 2:
                __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0 = OfflineReadsDao_Impl.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0(this.f14017b, this.f14018c, (g1.e) obj);
                return __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0;
            case 3:
                __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1$lambda$0 = OfflineReadsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1$lambda$0(this.f14017b, this.f14018c, (g1.e) obj);
                return __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1$lambda$0;
            default:
                __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0 = OfflineReadsDao_Impl.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0(this.f14017b, this.f14018c, (g1.e) obj);
                return __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0;
        }
    }
}
