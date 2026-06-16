package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReadMeta f14657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.t f14658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14660e;

    public /* synthetic */ g0(ReadMeta readMeta, i3.t tVar, int i10, int i11, int i12) {
        this.f14656a = i12;
        this.f14657b = readMeta;
        this.f14658c = tVar;
        this.f14659d = i10;
        this.f14660e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ReadMetaRow$lambda$4;
        sn.z CollectionHeaderImage$lambda$1;
        switch (this.f14656a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ReadMetaRow$lambda$4 = ReadMetaRowKt.ReadMetaRow$lambda$4(this.f14657b, this.f14658c, this.f14659d, this.f14660e, (u2.m) obj, intValue);
                return ReadMetaRow$lambda$4;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                CollectionHeaderImage$lambda$1 = CreateCollectionSheetKt.CollectionHeaderImage$lambda$1(this.f14657b, this.f14658c, this.f14659d, this.f14660e, (u2.m) obj, intValue2);
                return CollectionHeaderImage$lambda$1;
        }
    }
}
