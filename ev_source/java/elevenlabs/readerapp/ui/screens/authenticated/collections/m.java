package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f15338b;

    public /* synthetic */ m(int i10, ho.a aVar) {
        this.f15337a = i10;
        this.f15338b = aVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z AddReadsToCollectionScreenUI$lambda$5$0;
        sn.z ExploreCollectionScreenUI$lambda$8$0$0;
        sn.z EditCollectionScreenUI$lambda$2$0;
        int i10 = this.f15337a;
        l2 l2Var = (l2) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                AddReadsToCollectionScreenUI$lambda$5$0 = AddReadsToCollectionScreenKt.AddReadsToCollectionScreenUI$lambda$5$0(this.f15338b, l2Var, mVar, intValue);
                return AddReadsToCollectionScreenUI$lambda$5$0;
            case 1:
                ExploreCollectionScreenUI$lambda$8$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$0(this.f15338b, l2Var, mVar, intValue);
                return ExploreCollectionScreenUI$lambda$8$0$0;
            default:
                EditCollectionScreenUI$lambda$2$0 = EditCollectionScreenKt.EditCollectionScreenUI$lambda$2$0(this.f15338b, l2Var, mVar, intValue);
                return EditCollectionScreenUI$lambda$2$0;
        }
    }
}
