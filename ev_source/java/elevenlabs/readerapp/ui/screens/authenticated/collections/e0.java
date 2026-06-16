package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Success f15304b;

    public /* synthetic */ e0(AsyncCallResult.Success success, int i10) {
        this.f15303a = i10;
        this.f15304b = success;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AddReadToCollectionState fetchAddedCollections$lambda$0;
        switch (this.f15303a) {
            case 0:
                return CollectionViewModel$load$1$1.AnonymousClass2.AnonymousClass1.b(this.f15304b, (CollectionState) obj);
            default:
                fetchAddedCollections$lambda$0 = AddReadToCollectionViewModel.fetchAddedCollections$lambda$0(this.f15304b, (AddReadToCollectionState) obj);
                return fetchAddedCollections$lambda$0;
        }
    }
}
