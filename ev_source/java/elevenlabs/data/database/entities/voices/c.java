package io.elevenlabs.data.database.entities.voices;

import ho.l;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoicesDao_Impl f14084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f14085c;

    public /* synthetic */ c(VoicesDao_Impl voicesDao_Impl, List list, int i10) {
        this.f14083a = i10;
        this.f14084b = voicesDao_Impl;
        this.f14085c = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f14083a) {
            case 0:
                return VoicesDao_Impl.a(this.f14084b, this.f14085c, (mb.a) obj);
            default:
                return VoicesDao_Impl.f(this.f14084b, this.f14085c, (mb.a) obj);
        }
    }
}
