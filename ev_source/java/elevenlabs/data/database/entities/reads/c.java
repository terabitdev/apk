package io.elevenlabs.data.database.entities.reads;

import g1.r;
import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadsDao_Impl f14054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mb.a f14055c;

    public /* synthetic */ c(ReadsDao_Impl readsDao_Impl, mb.a aVar, int i10) {
        this.f14053a = i10;
        this.f14054b = readsDao_Impl;
        this.f14055c = aVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0;
        z __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0;
        z __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0;
        z __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0;
        switch (this.f14053a) {
            case 0:
                __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0 = ReadsDao_Impl.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0(this.f14054b, this.f14055c, (g1.e) obj);
                return __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0;
            case 1:
                __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0 = ReadsDao_Impl.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0(this.f14054b, this.f14055c, (g1.e) obj);
                return __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0;
            case 2:
                __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0 = ReadsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0(this.f14054b, this.f14055c, (g1.e) obj);
                return __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0;
            default:
                __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0 = ReadsDao_Impl.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0(this.f14054b, this.f14055c, (r) obj);
                return __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0;
        }
    }
}
