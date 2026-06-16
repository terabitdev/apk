package io.elevenlabs.data.database.entities.reads;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadsDao_Impl f14063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReadMetaEntity f14064c;

    public /* synthetic */ f(ReadsDao_Impl readsDao_Impl, ReadMetaEntity readMetaEntity, int i10) {
        this.f14062a = i10;
        this.f14063b = readsDao_Impl;
        this.f14064c = readMetaEntity;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z deleteRead$lambda$0;
        z insertRead$lambda$0;
        switch (this.f14062a) {
            case 0:
                deleteRead$lambda$0 = ReadsDao_Impl.deleteRead$lambda$0(this.f14063b, this.f14064c, (mb.a) obj);
                return deleteRead$lambda$0;
            default:
                insertRead$lambda$0 = ReadsDao_Impl.insertRead$lambda$0(this.f14063b, this.f14064c, (mb.a) obj);
                return insertRead$lambda$0;
        }
    }
}
