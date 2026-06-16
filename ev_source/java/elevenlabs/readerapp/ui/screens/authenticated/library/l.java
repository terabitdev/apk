package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.model.CollectionMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15855a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectionMeta f15856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15857c;

    public /* synthetic */ l(ho.l lVar, CollectionMeta collectionMeta) {
        this.f15857c = lVar;
        this.f15856b = collectionMeta;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z userCollections$lambda$2$1;
        sn.z userCollections$lambda$2;
        switch (this.f15855a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                userCollections$lambda$2$1 = LibraryScreenKt.userCollections$lambda$2$1(this.f15856b, (String) this.f15857c, (r1.s) obj, (u2.m) obj2, intValue);
                return userCollections$lambda$2$1;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                userCollections$lambda$2 = LibraryScreenKt.userCollections$lambda$2((ho.l) this.f15857c, this.f15856b, (t1.b) obj, (u2.m) obj2, intValue2);
                return userCollections$lambda$2;
        }
    }

    public /* synthetic */ l(CollectionMeta collectionMeta, String str) {
        this.f15856b = collectionMeta;
        this.f15857c = str;
    }
}
