package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BluetoothActionSelectorSheetKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f15301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15302e;

    public /* synthetic */ e(String str, boolean z6, ho.a aVar, int i10, int i11) {
        this.f15298a = i11;
        this.f15299b = str;
        this.f15300c = z6;
        this.f15301d = aVar;
        this.f15302e = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z CollectionItemRow$lambda$2;
        switch (this.f15298a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CollectionItemRow$lambda$2 = AddReadToCollectionScreenKt.CollectionItemRow$lambda$2(this.f15299b, this.f15300c, this.f15301d, this.f15302e, (u2.m) obj, intValue);
                return CollectionItemRow$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return BluetoothActionSelectorSheetKt.f(this.f15299b, this.f15300c, this.f15301d, this.f15302e, (u2.m) obj, intValue2);
        }
    }
}
