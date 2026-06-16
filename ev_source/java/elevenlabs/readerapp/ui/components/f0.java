package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsScreenKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f14647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14648c;

    public /* synthetic */ f0(ReadMeta readMeta, int i10, int i11) {
        this.f14646a = i11;
        this.f14647b = readMeta;
        this.f14648c = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ReadMetaImageBox$lambda$0;
        sn.z ReadShareDetailsContent$lambda$1;
        int i10 = this.f14646a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                ReadMetaImageBox$lambda$0 = ReadMetaRowKt.ReadMetaImageBox$lambda$0(this.f14647b, this.f14648c, mVar, intValue);
                return ReadMetaImageBox$lambda$0;
            default:
                ReadShareDetailsContent$lambda$1 = ReadShareDetailsScreenKt.ReadShareDetailsContent$lambda$1(this.f14647b, this.f14648c, mVar, intValue);
                return ReadShareDetailsContent$lambda$1;
        }
    }
}
