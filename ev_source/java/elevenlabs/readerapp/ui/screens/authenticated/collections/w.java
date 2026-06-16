package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.model.ReadMeta;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15369c;

    public /* synthetic */ w(z0 z0Var, z0 z0Var2) {
        this.f15367a = 1;
        this.f15368b = z0Var;
        this.f15369c = z0Var2;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$0;
        sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$2;
        sn.z PreviewSheet$lambda$0;
        switch (this.f15367a) {
            case 0:
                ExploreCollectionScreenUI$lambda$8$0$1$1$10$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$10$0((ho.a) this.f15369c, (z0) this.f15368b, (u2.m) obj, ((Integer) obj2).intValue());
                return ExploreCollectionScreenUI$lambda$8$0$1$1$10$0;
            case 1:
                ExploreCollectionScreenUI$lambda$8$0$1$1$10$2 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$10$2((z0) this.f15368b, (z0) this.f15369c, (u2.m) obj, ((Integer) obj2).intValue());
                return ExploreCollectionScreenUI$lambda$8$0$1$1$10$2;
            default:
                PreviewSheet$lambda$0 = CreateCollectionSheetKt.PreviewSheet$lambda$0((CreateCollectionState) this.f15369c, (ReadMeta) this.f15368b, (u2.m) obj, ((Integer) obj2).intValue());
                return PreviewSheet$lambda$0;
        }
    }

    public /* synthetic */ w(Object obj, Object obj2, int i10) {
        this.f15367a = i10;
        this.f15369c = obj;
        this.f15368b = obj2;
    }
}
