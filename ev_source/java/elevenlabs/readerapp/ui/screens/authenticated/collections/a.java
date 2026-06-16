package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.ReadMeta;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15281c;

    public /* synthetic */ a(ho.a aVar, z0 z0Var) {
        this.f15279a = 3;
        this.f15281c = aVar;
        this.f15280b = z0Var;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z AddReadToCollectionSheet$lambda$1$0;
        sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$1$0$0;
        sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$2$0$0;
        sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$0$0$0;
        sn.z CreateCollectionSheet$lambda$0$0;
        sn.z CreateCollectionSheet$lambda$1$3$0;
        sn.z EditCollectionScreenUI$lambda$3$0$0$5$0$0;
        switch (this.f15279a) {
            case 0:
                AddReadToCollectionSheet$lambda$1$0 = AddReadToCollectionScreenKt.AddReadToCollectionSheet$lambda$1$0((AddReadToCollectionViewModel) this.f15280b, (ho.a) this.f15281c);
                return AddReadToCollectionSheet$lambda$1$0;
            case 1:
                ExploreCollectionScreenUI$lambda$8$0$1$1$10$1$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$10$1$0$0((ho.l) this.f15280b, (z0) this.f15281c);
                return ExploreCollectionScreenUI$lambda$8$0$1$1$10$1$0$0;
            case 2:
                ExploreCollectionScreenUI$lambda$8$0$1$1$10$2$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$10$2$0$0((z0) this.f15280b, (z0) this.f15281c);
                return ExploreCollectionScreenUI$lambda$8$0$1$1$10$2$0$0;
            case 3:
                ExploreCollectionScreenUI$lambda$8$0$1$1$10$0$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$10$0$0$0((ho.a) this.f15281c, (z0) this.f15280b);
                return ExploreCollectionScreenUI$lambda$8$0$1$1$10$0$0$0;
            case 4:
                CreateCollectionSheet$lambda$0$0 = CreateCollectionSheetKt.CreateCollectionSheet$lambda$0$0((CreateCollectionViewModel) this.f15280b, (ho.a) this.f15281c);
                return CreateCollectionSheet$lambda$0$0;
            case 5:
                CreateCollectionSheet$lambda$1$3$0 = CreateCollectionSheetKt.CreateCollectionSheet$lambda$1$3$0((CreateCollectionViewModel) this.f15280b, (ReadMeta) this.f15281c);
                return CreateCollectionSheet$lambda$1$3$0;
            default:
                EditCollectionScreenUI$lambda$3$0$0$5$0$0 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$3$0$0$5$0$0((ho.l) this.f15280b, (CollectionMeta.Icon) this.f15281c);
                return EditCollectionScreenUI$lambda$3$0$0$5$0$0;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f15279a = i10;
        this.f15280b = obj;
        this.f15281c = obj2;
    }
}
