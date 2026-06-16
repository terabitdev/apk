package io.elevenlabs.data.database.entities.offline;

import ho.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OfflineReadsDao_Impl f14015b;

    public /* synthetic */ a(OfflineReadsDao_Impl offlineReadsDao_Impl, int i10) {
        this.f14014a = i10;
        this.f14015b = offlineReadsDao_Impl;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f14014a) {
            case 0:
                return OfflineReadsDao_Impl.s(this.f14015b, (mb.a) obj);
            case 1:
                return OfflineReadsDao_Impl.a(this.f14015b, (mb.a) obj);
            case 2:
                return OfflineReadsDao_Impl.p(this.f14015b, (mb.a) obj);
            default:
                return OfflineReadsDao_Impl.u(this.f14015b, (mb.a) obj);
        }
    }
}
