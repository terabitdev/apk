package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.CollectionMeta;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectionMeta f14655b;

    public /* synthetic */ g(CollectionMeta collectionMeta, int i10) {
        this.f14654a = i10;
        this.f14655b = collectionMeta;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z CategorieCollectionsRow$lambda$0$0$0$1;
        sn.z CollectionMetaRow$lambda$0$1$0$0;
        switch (this.f14654a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                CategorieCollectionsRow$lambda$0$0$0$1 = CategorieCollectionRowKt.CategorieCollectionsRow$lambda$0$0$0$1(this.f14655b, (r1.s) obj, (u2.m) obj2, intValue);
                return CategorieCollectionsRow$lambda$0$0$0$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                CollectionMetaRow$lambda$0$1$0$0 = CollectionMetaRowKt.CollectionMetaRow$lambda$0$1$0$0(this.f14655b, (l2) obj, (u2.m) obj2, intValue2);
                return CollectionMetaRow$lambda$0$1$0$0;
        }
    }
}
