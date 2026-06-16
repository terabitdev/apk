package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel;
import u2.x0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15287b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f15286a = i10;
        this.f15287b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        CollectionState emit$lambda$0;
        AddReadToCollectionState onSheetDismissed$lambda$0;
        sn.z ExploreCollectionScreenUI$lambda$8$2$0;
        sn.z CollectionScreen$lambda$0$0$0;
        CollectionState archive$lambda$0;
        sn.z CollectionNameField$lambda$2$1$0;
        CreateCollectionState onDismissed$lambda$0;
        switch (this.f15286a) {
            case 0:
                emit$lambda$0 = CollectionViewModel.AnonymousClass3.AnonymousClass1.emit$lambda$0((MediaQueueState) this.f15287b, (CollectionState) obj);
                return emit$lambda$0;
            case 1:
                onSheetDismissed$lambda$0 = AddReadToCollectionViewModel.onSheetDismissed$lambda$0((AddReadToCollectionViewModel) this.f15287b, (AddReadToCollectionState) obj);
                return onSheetDismissed$lambda$0;
            case 2:
                ExploreCollectionScreenUI$lambda$8$2$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$2$0((x0) this.f15287b, (h5.l) obj);
                return ExploreCollectionScreenUI$lambda$8$2$0;
            case 3:
                CollectionScreen$lambda$0$0$0 = CollectionScreenKt.CollectionScreen$lambda$0$0$0((ho.p) this.f15287b, (String) obj);
                return CollectionScreen$lambda$0$0$0;
            case 4:
                archive$lambda$0 = CollectionViewModel.archive$lambda$0((ReadMeta) this.f15287b, (CollectionState) obj);
                return archive$lambda$0;
            case 5:
                CollectionNameField$lambda$2$1$0 = CreateCollectionSheetKt.CollectionNameField$lambda$2$1$0((ho.l) this.f15287b, (String) obj);
                return CollectionNameField$lambda$2$1$0;
            default:
                onDismissed$lambda$0 = CreateCollectionViewModel.onDismissed$lambda$0((CreateCollectionViewModel) this.f15287b, (CreateCollectionState) obj);
                return onDismissed$lambda$0;
        }
    }
}
