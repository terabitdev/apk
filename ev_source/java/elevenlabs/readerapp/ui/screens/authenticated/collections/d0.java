package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$load$1$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$loadMore$1$1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectionViewModel f15296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f15297c;

    public /* synthetic */ d0(CollectionViewModel collectionViewModel, AsyncCallResult.Error error, int i10) {
        this.f15295a = i10;
        this.f15296b = collectionViewModel;
        this.f15297c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        CollectionState emit$lambda$0;
        CollectionState emit$lambda$02;
        CollectionState invokeSuspend$lambda$0;
        switch (this.f15295a) {
            case 0:
                emit$lambda$0 = CollectionViewModel$load$1$1.AnonymousClass2.AnonymousClass1.emit$lambda$0(this.f15296b, this.f15297c, (CollectionState) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = CollectionViewModel$loadMore$1$1.AnonymousClass2.emit$lambda$0(this.f15296b, this.f15297c, (CollectionState) obj);
                return emit$lambda$02;
            default:
                invokeSuspend$lambda$0 = CollectionViewModel$onClickAddFullCollectionToQueue$1$1.invokeSuspend$lambda$0(this.f15296b, this.f15297c, (CollectionState) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
