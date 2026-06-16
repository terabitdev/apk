package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectionMeta f15291b;

    public /* synthetic */ c0(CollectionMeta collectionMeta, int i10) {
        this.f15290a = i10;
        this.f15291b = collectionMeta;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        CollectionState invokeSuspend$lambda$0;
        switch (this.f15290a) {
            case 0:
                invokeSuspend$lambda$0 = CollectionViewModel$load$1$1.AnonymousClass1.C00381.invokeSuspend$lambda$0(this.f15291b, (CollectionState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                return CollectionViewModel$loadMore$1$1.d(this.f15291b, (CollectionState) obj);
            default:
                return CreateCollectionViewModel$submit$1$1.d(this.f15291b, (CreateCollectionState) obj);
        }
    }
}
