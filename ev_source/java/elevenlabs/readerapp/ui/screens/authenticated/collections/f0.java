package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import a2.y1;
import i4.m2;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel$loadMore$1$1;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15310c;

    public /* synthetic */ f0(Object obj, Object obj2, int i10) {
        this.f15308a = i10;
        this.f15309b = obj;
        this.f15310c = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z AddReadToCollectionSheet$lambda$2$1$0;
        sn.z AddReadsToCollectionScreenUI$lambda$6$0$4$0;
        AddReadsToCollectionState query$lambda$0;
        CollectionState markAsUnread$lambda$0;
        sn.z CollectionNameField$lambda$2$0$0;
        sn.z CollectionIconRow$lambda$1$0;
        CreateCollectionState submit$lambda$0;
        switch (this.f15308a) {
            case 0:
                return CollectionViewModel$loadMore$1$1.AnonymousClass2.a((List) this.f15309b, (AsyncCallResult.Success) this.f15310c, (CollectionState) obj);
            case 1:
                return EditCollectionViewModel$setCollectionId$1.d((CollectionMeta) this.f15309b, (String) this.f15310c, (EditCollectionState) obj);
            case 2:
                AddReadToCollectionSheet$lambda$2$1$0 = AddReadToCollectionScreenKt.AddReadToCollectionSheet$lambda$2$1$0((AddReadToCollectionViewModel) this.f15309b, (BottomSheetControl) this.f15310c, (String) obj);
                return AddReadToCollectionSheet$lambda$2$1$0;
            case 3:
                AddReadsToCollectionScreenUI$lambda$6$0$4$0 = AddReadsToCollectionScreenKt.AddReadsToCollectionScreenUI$lambda$6$0$4$0((AddReadsToCollectionState) this.f15309b, (ho.l) this.f15310c, (t1.t) obj);
                return AddReadsToCollectionScreenUI$lambda$6$0$4$0;
            case 4:
                query$lambda$0 = AddReadsToCollectionViewModel.setQuery$lambda$0((String) this.f15309b, (AddReadsToCollectionViewModel) this.f15310c, (AddReadsToCollectionState) obj);
                return query$lambda$0;
            case 5:
                markAsUnread$lambda$0 = CollectionViewModel.markAsUnread$lambda$0((CollectionViewModel) this.f15309b, (ReadMeta) this.f15310c, (CollectionState) obj);
                return markAsUnread$lambda$0;
            case 6:
                CollectionNameField$lambda$2$0$0 = CreateCollectionSheetKt.CollectionNameField$lambda$2$0$0((m2) this.f15309b, (ho.a) this.f15310c, (y1) obj);
                return CollectionNameField$lambda$2$0$0;
            case 7:
                CollectionIconRow$lambda$1$0 = CreateCollectionSheetKt.CollectionIconRow$lambda$1$0((CollectionMeta.Icon) this.f15309b, (ho.l) this.f15310c, (t1.t) obj);
                return CollectionIconRow$lambda$1$0;
            default:
                submit$lambda$0 = CreateCollectionViewModel.submit$lambda$0((CreateCollectionViewModel) this.f15309b, (String) this.f15310c, (CreateCollectionState) obj);
                return submit$lambda$0;
        }
    }
}
