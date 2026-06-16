package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f15357b;

    public /* synthetic */ r(ho.l lVar, int i10) {
        this.f15356a = i10;
        this.f15357b = lVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ExploreCollectionScreenUI$lambda$8$4;
        sn.z ExploreCollectionScreenUI$lambda$8$1$4;
        int i10 = this.f15356a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                ExploreCollectionScreenUI$lambda$8$4 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$4(this.f15357b, mVar, intValue);
                return ExploreCollectionScreenUI$lambda$8$4;
            default:
                ExploreCollectionScreenUI$lambda$8$1$4 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$4(this.f15357b, mVar, intValue);
                return ExploreCollectionScreenUI$lambda$8$1$4;
        }
    }
}
