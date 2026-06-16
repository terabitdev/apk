package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15316b;

    public /* synthetic */ h(List list, int i10) {
        this.f15315a = i10;
        this.f15316b = list;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AddReadToCollectionState invokeSuspend$lambda$0;
        AddReadsToCollectionState invokeSuspend$lambda$02;
        CollectionState invokeSuspend$lambda$03;
        switch (this.f15315a) {
            case 0:
                invokeSuspend$lambda$0 = AddReadToCollectionViewModel.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f15316b, (AddReadToCollectionState) obj);
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = AddReadsToCollectionViewModel.AnonymousClass2.AnonymousClass3.invokeSuspend$lambda$0(this.f15316b, (AddReadsToCollectionState) obj);
                return invokeSuspend$lambda$02;
            case 2:
                invokeSuspend$lambda$03 = CollectionViewModel.AnonymousClass1.C00371.invokeSuspend$lambda$0(this.f15316b, (CollectionState) obj);
                return invokeSuspend$lambda$03;
            default:
                return CollectionViewModel$onClickAddFullCollectionToQueue$1$1.d(this.f15316b, (CollectionState) obj);
        }
    }
}
