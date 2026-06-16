package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.CollectionMeta;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15289b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f15288a = i10;
        this.f15289b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PreviewSheet$lambda$0;
        sn.z CollectionScreen$lambda$0;
        sn.z EditCollectionScreenUI$lambda$3$0$0$5$1;
        switch (this.f15288a) {
            case 0:
                PreviewSheet$lambda$0 = AddReadToCollectionScreenKt.PreviewSheet$lambda$0((AddReadToCollectionState) this.f15289b, (u2.m) obj, ((Integer) obj2).intValue());
                return PreviewSheet$lambda$0;
            case 1:
                CollectionScreen$lambda$0 = CollectionScreenKt.CollectionScreen$lambda$0((ho.p) this.f15289b, (u2.m) obj, ((Integer) obj2).intValue());
                return CollectionScreen$lambda$0;
            default:
                EditCollectionScreenUI$lambda$3$0$0$5$1 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3$0$0$5$1((CollectionMeta.Icon) this.f15289b, (u2.m) obj, ((Integer) obj2).intValue());
                return EditCollectionScreenUI$lambda$3$0$0$5$1;
        }
    }
}
