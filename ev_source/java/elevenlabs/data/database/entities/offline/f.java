package io.elevenlabs.data.database.entities.offline;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14033d;

    public /* synthetic */ f(int i10, int i11, long j4, String str) {
        this.f14030a = i11;
        this.f14031b = str;
        this.f14032c = j4;
        this.f14033d = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z updateChapterDrmKeySetId$lambda$0;
        z updateChapterManifestUrl$lambda$0;
        switch (this.f14030a) {
            case 0:
                updateChapterDrmKeySetId$lambda$0 = OfflineReadsDao_Impl.updateChapterDrmKeySetId$lambda$0("UPDATE offline_chapter SET drm_key_set_id = ? \n        WHERE offline_read_id = ? AND chapter_index = ?", this.f14031b, this.f14032c, this.f14033d, (mb.a) obj);
                return updateChapterDrmKeySetId$lambda$0;
            default:
                updateChapterManifestUrl$lambda$0 = OfflineReadsDao_Impl.updateChapterManifestUrl$lambda$0("UPDATE offline_chapter SET cached_manifest_url = ? \n        WHERE offline_read_id = ? AND chapter_index = ?", this.f14031b, this.f14032c, this.f14033d, (mb.a) obj);
                return updateChapterManifestUrl$lambda$0;
        }
    }
}
