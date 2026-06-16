package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.ui.components.AutoScrollingChipRowKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements ho.p {
    public final /* synthetic */ int Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15327a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f15329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.l f15330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i3.t f15331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15332f;

    public /* synthetic */ k0(String str, ho.a aVar, ho.l lVar, i3.t tVar, int i10, int i11) {
        this.f15328b = str;
        this.f15329c = aVar;
        this.f15330d = lVar;
        this.f15331e = tVar;
        this.f15332f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z CollectionNameField$lambda$3;
        sn.z PromptChip$lambda$3;
        switch (this.f15327a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                String str = this.f15328b;
                ho.a aVar = this.f15329c;
                CollectionNameField$lambda$3 = CreateCollectionSheetKt.CollectionNameField$lambda$3(str, this.f15330d, aVar, this.f15331e, this.f15332f, this.Y, (u2.m) obj, intValue);
                return CollectionNameField$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                PromptChip$lambda$3 = AutoScrollingChipRowKt.PromptChip$lambda$3(this.f15328b, this.f15329c, this.f15330d, this.f15331e, this.f15332f, this.Y, (u2.m) obj, intValue2);
                return PromptChip$lambda$3;
        }
    }

    public /* synthetic */ k0(String str, ho.l lVar, ho.a aVar, i3.t tVar, int i10, int i11) {
        this.f15328b = str;
        this.f15330d = lVar;
        this.f15329c = aVar;
        this.f15331e = tVar;
        this.f15332f = i10;
        this.Y = i11;
    }
}
