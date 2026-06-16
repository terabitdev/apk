package io.elevenlabs.data.database.entities.reads;

import ho.l;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReadsDao_Impl f14058c;

    public /* synthetic */ d(String str, ReadsDao_Impl readsDao_Impl, int i10) {
        this.f14056a = i10;
        this.f14057b = str;
        this.f14058c = readsDao_Impl;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReadMetaEntityWithChapters byId$lambda$0;
        List sampleReadsByParentId$lambda$0;
        ReadMetaEntityWithChapters observeById$lambda$0;
        switch (this.f14056a) {
            case 0:
                byId$lambda$0 = ReadsDao_Impl.getById$lambda$0("SELECT * FROM reads WHERE read_id = ?", this.f14057b, this.f14058c, (mb.a) obj);
                return byId$lambda$0;
            case 1:
                sampleReadsByParentId$lambda$0 = ReadsDao_Impl.getSampleReadsByParentId$lambda$0("SELECT r.* FROM reads r INNER JOIN sample_config sc ON r.sample_config_id = sc.id WHERE sc.parent_id = ? AND sc.is_sample = 1", this.f14057b, this.f14058c, (mb.a) obj);
                return sampleReadsByParentId$lambda$0;
            default:
                observeById$lambda$0 = ReadsDao_Impl.observeById$lambda$0("SELECT * FROM reads WHERE read_id = ?", this.f14057b, this.f14058c, (mb.a) obj);
                return observeById$lambda$0;
        }
    }
}
