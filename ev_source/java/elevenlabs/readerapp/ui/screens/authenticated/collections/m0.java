package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.CollectionMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CollectionMeta.Icon f15340b;

    public /* synthetic */ m0(CollectionMeta.Icon icon, int i10) {
        this.f15339a = i10;
        this.f15340b = icon;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        CreateCollectionState icon$lambda$0;
        sn.z EditCollectionScreenUI$lambda$3$0$0$5$0$0$0;
        EditCollectionState icon$lambda$02;
        switch (this.f15339a) {
            case 0:
                icon$lambda$0 = CreateCollectionViewModel.setIcon$lambda$0(this.f15340b, (CreateCollectionState) obj);
                return icon$lambda$0;
            case 1:
                EditCollectionScreenUI$lambda$3$0$0$5$0$0$0 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3$0$0$5$0$0$0(this.f15340b, (EditCollectionViewModel) obj);
                return EditCollectionScreenUI$lambda$3$0$0$5$0$0$0;
            default:
                icon$lambda$02 = EditCollectionViewModel.setIcon$lambda$0(this.f15340b, (EditCollectionState) obj);
                return icon$lambda$02;
        }
    }
}
