package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.CollectionMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15372a;

    public /* synthetic */ y(int i10) {
        this.f15372a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z Preview_CollectionScreenUI_loading$lambda$0$0;
        sn.z Preview_CollectionScreenUI_no_subscription_no_description$lambda$0$0;
        sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$8$0$0;
        sn.z Preview_CollectionScreenUI_no_subscription_empty$lambda$0$0;
        sn.z Preview_CollectionScreenUI_with_unreads$lambda$0$0;
        sn.z ExploreCollectionScreenUI$lambda$8$1$4$0$0$0;
        sn.z ExploreCollectionScreenUI$lambda$1$0;
        CollectionState onNavigatedToRead$lambda$0;
        CollectionState onSuccessToastClick$lambda$0;
        sn.z CreateCollectionSheetUI$lambda$0$0;
        sn.z CreateCollectionSheetUI$lambda$1$0;
        Object CollectionIconRow$lambda$1$0$0;
        sn.z EditCollectionScreenUI$lambda$0$0;
        sn.z EditCollectionScreenUI$lambda$3$0$1$0$0;
        EditCollectionState onNavigatedBack$lambda$0;
        switch (this.f15372a) {
            case 0:
                Preview_CollectionScreenUI_loading$lambda$0$0 = CollectionScreenKt.Preview_CollectionScreenUI_loading$lambda$0$0((ho.l) obj);
                return Preview_CollectionScreenUI_loading$lambda$0$0;
            case 1:
                Preview_CollectionScreenUI_no_subscription_no_description$lambda$0$0 = CollectionScreenKt.Preview_CollectionScreenUI_no_subscription_no_description$lambda$0$0((ho.l) obj);
                return Preview_CollectionScreenUI_no_subscription_no_description$lambda$0$0;
            case 2:
                ExploreCollectionScreenUI$lambda$8$0$1$1$8$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$8$0$0((CollectionViewModel) obj);
                return ExploreCollectionScreenUI$lambda$8$0$1$1$8$0$0;
            case 3:
                Preview_CollectionScreenUI_no_subscription_empty$lambda$0$0 = CollectionScreenKt.Preview_CollectionScreenUI_no_subscription_empty$lambda$0$0((ho.l) obj);
                return Preview_CollectionScreenUI_no_subscription_empty$lambda$0$0;
            case 4:
                Preview_CollectionScreenUI_with_unreads$lambda$0$0 = CollectionScreenKt.Preview_CollectionScreenUI_with_unreads$lambda$0$0((ho.l) obj);
                return Preview_CollectionScreenUI_with_unreads$lambda$0$0;
            case 5:
                ExploreCollectionScreenUI$lambda$8$1$4$0$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$4$0$0$0((CollectionViewModel) obj);
                return ExploreCollectionScreenUI$lambda$8$1$4$0$0$0;
            case 6:
                ExploreCollectionScreenUI$lambda$1$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$1$0((String) obj);
                return ExploreCollectionScreenUI$lambda$1$0;
            case 7:
                onNavigatedToRead$lambda$0 = CollectionViewModel.onNavigatedToRead$lambda$0((CollectionState) obj);
                return onNavigatedToRead$lambda$0;
            case 8:
                onSuccessToastClick$lambda$0 = CollectionViewModel.onSuccessToastClick$lambda$0((CollectionState) obj);
                return onSuccessToastClick$lambda$0;
            case 9:
                CreateCollectionSheetUI$lambda$0$0 = CreateCollectionSheetKt.CreateCollectionSheetUI$lambda$0$0((String) obj);
                return CreateCollectionSheetUI$lambda$0$0;
            case 10:
                CreateCollectionSheetUI$lambda$1$0 = CreateCollectionSheetKt.CreateCollectionSheetUI$lambda$1$0((CollectionMeta.Icon) obj);
                return CreateCollectionSheetUI$lambda$1$0;
            case 11:
                CollectionIconRow$lambda$1$0$0 = CreateCollectionSheetKt.CollectionIconRow$lambda$1$0$0((CollectionMeta.Icon) obj);
                return CollectionIconRow$lambda$1$0$0;
            case 12:
                EditCollectionScreenUI$lambda$0$0 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$0$0((ho.l) obj);
                return EditCollectionScreenUI$lambda$0$0;
            case 13:
                EditCollectionScreenUI$lambda$3$0$1$0$0 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3$0$1$0$0((EditCollectionViewModel) obj);
                return EditCollectionScreenUI$lambda$3$0$1$0$0;
            default:
                onNavigatedBack$lambda$0 = EditCollectionViewModel.onNavigatedBack$lambda$0((EditCollectionState) obj);
                return onNavigatedBack$lambda$0;
        }
    }
}
