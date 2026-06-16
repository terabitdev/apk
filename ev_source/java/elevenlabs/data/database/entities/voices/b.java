package io.elevenlabs.data.database.entities.voices;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoicesDao_Impl f14081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VoiceEntity f14082c;

    public /* synthetic */ b(VoicesDao_Impl voicesDao_Impl, VoiceEntity voiceEntity, int i10) {
        this.f14080a = i10;
        this.f14081b = voicesDao_Impl;
        this.f14082c = voiceEntity;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z insert$lambda$0;
        z delete$lambda$0;
        switch (this.f14080a) {
            case 0:
                insert$lambda$0 = VoicesDao_Impl.insert$lambda$0(this.f14081b, this.f14082c, (mb.a) obj);
                return insert$lambda$0;
            default:
                delete$lambda$0 = VoicesDao_Impl.delete$lambda$0(this.f14081b, this.f14082c, (mb.a) obj);
                return delete$lambda$0;
        }
    }
}
