package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SyncStatus f15312b;

    public /* synthetic */ g(SyncStatus syncStatus, int i10) {
        this.f15311a = i10;
        this.f15312b = syncStatus;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        AddReadToCollectionState invokeSuspend$lambda$0;
        AddReadsToCollectionState invokeSuspend$lambda$02;
        switch (this.f15311a) {
            case 0:
                invokeSuspend$lambda$0 = AddReadToCollectionViewModel.AnonymousClass1.C00341.invokeSuspend$lambda$0(this.f15312b, (AddReadToCollectionState) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = AddReadsToCollectionViewModel.AnonymousClass1.C00351.invokeSuspend$lambda$0(this.f15312b, (AddReadsToCollectionState) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
