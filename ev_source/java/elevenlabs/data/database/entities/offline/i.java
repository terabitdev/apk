package io.elevenlabs.data.database.entities.offline;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OfflineReadsDao_Impl f14046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OfflineReadEntity f14047c;

    public /* synthetic */ i(OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineReadEntity offlineReadEntity, int i10) {
        this.f14045a = i10;
        this.f14046b = offlineReadsDao_Impl;
        this.f14047c = offlineReadEntity;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z delete$lambda$0;
        z update$lambda$0;
        long insert$lambda$0;
        switch (this.f14045a) {
            case 0:
                delete$lambda$0 = OfflineReadsDao_Impl.delete$lambda$0(this.f14046b, this.f14047c, (mb.a) obj);
                return delete$lambda$0;
            case 1:
                update$lambda$0 = OfflineReadsDao_Impl.update$lambda$0(this.f14046b, this.f14047c, (mb.a) obj);
                return update$lambda$0;
            default:
                insert$lambda$0 = OfflineReadsDao_Impl.insert$lambda$0(this.f14046b, this.f14047c, (mb.a) obj);
                return Long.valueOf(insert$lambda$0);
        }
    }
}
