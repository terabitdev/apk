package io.elevenlabs.data.database.entities.offline;

import ho.l;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OfflineReadsDao_Impl f14029c;

    public /* synthetic */ e(long j4, OfflineReadsDao_Impl offlineReadsDao_Impl, int i10) {
        this.f14027a = i10;
        this.f14028b = j4;
        this.f14029c = offlineReadsDao_Impl;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        List chaptersToDownload$lambda$0;
        OfflineReadEntity offlineReadById$lambda$0;
        List chaptersForRead$lambda$0;
        switch (this.f14027a) {
            case 0:
                chaptersToDownload$lambda$0 = OfflineReadsDao_Impl.getChaptersToDownload$lambda$0("SELECT * FROM offline_chapter WHERE offline_read_id = ? \n        AND status IN ('PENDING', 'DOWNLOADING', 'ERROR')", this.f14028b, this.f14029c, (mb.a) obj);
                return chaptersToDownload$lambda$0;
            case 1:
                offlineReadById$lambda$0 = OfflineReadsDao_Impl.getOfflineReadById$lambda$0("SELECT * FROM offline_read WHERE id = ?", this.f14028b, this.f14029c, (mb.a) obj);
                return offlineReadById$lambda$0;
            default:
                chaptersForRead$lambda$0 = OfflineReadsDao_Impl.getChaptersForRead$lambda$0("SELECT * FROM offline_chapter WHERE offline_read_id = ?", this.f14028b, this.f14029c, (mb.a) obj);
                return chaptersForRead$lambda$0;
        }
    }
}
