package io.elevenlabs.data.database.entities.voices;

import ho.l;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecentVoicesDao_Impl f14078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f14079c;

    public /* synthetic */ a(RecentVoicesDao_Impl recentVoicesDao_Impl, List list, int i10) {
        this.f14077a = i10;
        this.f14078b = recentVoicesDao_Impl;
        this.f14079c = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f14077a) {
            case 0:
                return RecentVoicesDao_Impl.a(this.f14078b, this.f14079c, (mb.a) obj);
            default:
                return RecentVoicesDao_Impl.d(this.f14078b, this.f14079c, (mb.a) obj);
        }
    }
}
