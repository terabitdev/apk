package io.elevenlabs.data.database.entities.offline;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14026c;

    public /* synthetic */ d(long j4, int i10, int i11) {
        this.f14024a = i11;
        this.f14025b = j4;
        this.f14026c = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z deleteChapter$lambda$0;
        z markChapterExpired$lambda$0;
        switch (this.f14024a) {
            case 0:
                deleteChapter$lambda$0 = OfflineReadsDao_Impl.deleteChapter$lambda$0("DELETE FROM offline_chapter \n        WHERE offline_read_id = ? AND chapter_index = ?", this.f14025b, this.f14026c, (mb.a) obj);
                return deleteChapter$lambda$0;
            default:
                markChapterExpired$lambda$0 = OfflineReadsDao_Impl.markChapterExpired$lambda$0("UPDATE offline_chapter \n        SET status = 'EXPIRED', cached_manifest_url = NULL, drm_key_set_id = NULL, progress = 0\n        WHERE offline_read_id = ? AND chapter_index = ?", this.f14025b, this.f14026c, (mb.a) obj);
                return markChapterExpired$lambda$0;
        }
    }
}
