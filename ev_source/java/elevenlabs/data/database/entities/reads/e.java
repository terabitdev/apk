package io.elevenlabs.data.database.entities.reads;

import ho.l;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadsDao_Impl f14060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f14061c;

    public /* synthetic */ e(ReadsDao_Impl readsDao_Impl, List list, int i10) {
        this.f14059a = i10;
        this.f14060b = readsDao_Impl;
        this.f14061c = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f14059a) {
            case 0:
                return ReadsDao_Impl.j(this.f14060b, this.f14061c, (mb.a) obj);
            default:
                return ReadsDao_Impl.y(this.f14060b, this.f14061c, (mb.a) obj);
        }
    }
}
