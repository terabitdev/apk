package io.elevenlabs.data.database.entities.offline;

import ho.l;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OfflineReadsDao_Impl f14041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Enum f14044e;

    public /* synthetic */ h(OfflineReadsDao_Impl offlineReadsDao_Impl, Enum r22, int i10, long j4, int i11) {
        this.f14040a = i11;
        this.f14041b = offlineReadsDao_Impl;
        this.f14044e = r22;
        this.f14042c = i10;
        this.f14043d = j4;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z resetAllChapterStatuses$lambda$0;
        z updateStatusAndProgress$lambda$0;
        switch (this.f14040a) {
            case 0:
                resetAllChapterStatuses$lambda$0 = OfflineReadsDao_Impl.resetAllChapterStatuses$lambda$0("UPDATE offline_chapter SET status = ?, progress = ?\n        WHERE offline_read_id = ?", this.f14041b, (OfflineChapterEntity.Status) this.f14044e, this.f14042c, this.f14043d, (mb.a) obj);
                return resetAllChapterStatuses$lambda$0;
            default:
                updateStatusAndProgress$lambda$0 = OfflineReadsDao_Impl.updateStatusAndProgress$lambda$0("UPDATE offline_read SET status = ?, progress = ? WHERE id = ?", this.f14041b, (OfflineReadEntity.Status) this.f14044e, this.f14042c, this.f14043d, (mb.a) obj);
                return updateStatusAndProgress$lambda$0;
        }
    }
}
