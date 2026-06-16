package io.elevenlabs.data.database.entities.reads;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadsDao_Impl f14075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SampleConfigEntity f14076c;

    public /* synthetic */ i(ReadsDao_Impl readsDao_Impl, SampleConfigEntity sampleConfigEntity, int i10) {
        this.f14074a = i10;
        this.f14075b = readsDao_Impl;
        this.f14076c = sampleConfigEntity;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z deleteSampleConfig$lambda$0;
        long insertSampleConfig$lambda$0;
        switch (this.f14074a) {
            case 0:
                deleteSampleConfig$lambda$0 = ReadsDao_Impl.deleteSampleConfig$lambda$0(this.f14075b, this.f14076c, (mb.a) obj);
                return deleteSampleConfig$lambda$0;
            default:
                insertSampleConfig$lambda$0 = ReadsDao_Impl.insertSampleConfig$lambda$0(this.f14075b, this.f14076c, (mb.a) obj);
                return Long.valueOf(insertSampleConfig$lambda$0);
        }
    }
}
